/**
 * Copyright 2015 Shopify
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a
 * copy of this software and associated documentation files (the "Software"),
 * to deal in the Software without restriction, including without limitation
 * the rights to use, copy, modify, merge, publish, distribute, sublicense,
 * and/or sell copies of the Software, and to permit persons to whom the Software
 * is furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
 * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
 * CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.shopify.graphql.support;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.function.BiFunction;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

/**
 * Created by dylansmith on 2015-11-23.
 */
public abstract class AbstractResponse<T extends AbstractResponse> implements Serializable {
    public final HashMap<String, Object> responseData = new HashMap<>();
    public final HashMap<String, Object> optimisticData = new HashMap<>();
    private String aliasSuffix = null;

    @SuppressWarnings("unchecked")
    public T withAlias(String aliasSuffix) {
        if (this.aliasSuffix != null) {
            throw new IllegalStateException("Can only define a single alias for a field");
        }
        if (aliasSuffix == null || aliasSuffix.isEmpty()) {
            throw new IllegalArgumentException("Can't specify an empty alias");
        }
        if (aliasSuffix.contains(AbstractQuery.ALIAS_SUFFIX_SEPARATOR)) {
            throw new IllegalArgumentException("Alias must not contain __");
        }

        this.aliasSuffix = aliasSuffix;
        return (T) this;
    }

    /**
     * Gets a field as a raw object.
     * 
     * @param field The name of the field.
     * @return The raw object.
     */
    public Object get(String field) {
        String key = getKey(field);
        if (optimisticData.containsKey(key)) {
            return optimisticData.get(key);
        }
        return responseData.get(key);
    }

    @FunctionalInterface
    private interface BiFunctionWithException<T, U, R> {
        R apply(T t, U u) throws SchemaViolationError;
    }

    private <R> BiFunction<JsonElement, String, R> converterWrapper(BiFunctionWithException<JsonElement, String, R> converter) {
        return (t, u) -> {
            try {
                return converter.apply(t, u);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        };
    }

    private <R> R getAs(String field, BiFunction<JsonElement, String, R> converter) {
        String key = getKey(field);
        if (optimisticData.containsKey(key)) {
            return converter.apply((JsonElement) optimisticData.get(key), key);
        }
        return converter.apply((JsonElement) responseData.get(key), key);
    }
    
    /**
     * Tries to deserialise and return the given JSON field as a String. The field itself is expected
     * to be stored in the object data as a {@link JsonElement}, which is the case for custom simple fields.
     * 
     * @param field The name of the field.
     * @return The value of the field.
     */
    public String getAsString(String field) {
        BiFunction<JsonElement, String, String> converter = converterWrapper(this::jsonAsString);
        return getAs(field, converter);
    }
    
    /**
     * Tries to deserialise and return the given JSON field as an Integer. The field itself is expected
     * to be stored in the object data as a {@link JsonElement}, which is the case for custom simple fields.
     * 
     * @param field The name of the field.
     * @return The value of the field.
     */
    public Integer getAsInteger(String field) throws SchemaViolationError {
        BiFunction<JsonElement, String, Integer> converter = converterWrapper(this::jsonAsInteger);
        return getAs(field, converter);
    }

    /**
     * Tries to deserialise and return the given JSON field as a Double. The field itself is expected
     * to be stored in the object data as a {@link JsonElement}, which is the case for custom simple fields.
     * 
     * @param field The name of the field.
     * @return The value of the field.
     */
    public Double getAsDouble(String field) throws SchemaViolationError {
        BiFunction<JsonElement, String, Double> converter = converterWrapper(this::jsonAsDouble);
        return getAs(field, converter);
    }

    /**
     * Tries to deserialise and return the given JSON field as a Boolean. The field itself is expected
     * to be stored in the object data as a {@link JsonElement}, which is the case for custom simple fields.
     * 
     * @param field The name of the field.
     * @return The value of the field.
     */
    public Boolean getAsBoolean(String field) throws SchemaViolationError {
        BiFunction<JsonElement, String, Boolean> converter = converterWrapper(this::jsonAsBoolean);
        return getAs(field, converter);
    }

    /**
     * Tries to deserialise and return the given JSON field as an Array. The field itself is expected
     * to be stored in the object data as a {@link JsonElement}, which is the case for custom simple fields.
     * 
     * @param field The name of the field.
     * @return The value of the field.
     */
    public JsonArray getAsArray(String field) throws SchemaViolationError {
        BiFunction<JsonElement, String, JsonArray> converter = converterWrapper(this::jsonAsArray);
        return getAs(field, converter);
    }

    /**
     * Tries to read a custom field from the GraphQL JSON response. The method throws a schema violation
     * exception if the field name does not contain the <code>_custom_</code> alias suffix added by the library,
     * which would indicate that the field does not belong to the GraphQL Schema and was not explicitly requested
     * as a custom field.
     * 
     * @param fieldName The field name.
     * @param element The JSON element parsed by the JSON deserialiser.
     * @throws SchemaViolationError If the field name does not contain the <code>_custom_</code> suffix.
     */
    protected void readCustomField(String fieldName, JsonElement element) throws SchemaViolationError {
        int end = fieldName.indexOf(AbstractQuery.CUSTOM_FIELD_LABEL);
        if (end > 0) {
            responseData.put(fieldName.substring(0, end), element);
        } else {
            throw new SchemaViolationError(this, fieldName, element);
        }
    }

    protected String getFieldName(String key) {
        int i = key.lastIndexOf(AbstractQuery.ALIAS_SUFFIX_SEPARATOR);
        if (i > 1) {
            key = key.substring(0, i);
        }
        return key;
    }

    protected String getKey(String field) {
        if (aliasSuffix != null) {
            field += AbstractQuery.ALIAS_SUFFIX_SEPARATOR + aliasSuffix;
            aliasSuffix = null;
        }
        return field;
    }

    protected String jsonAsString(JsonElement element, String field) throws SchemaViolationError {
        if (!element.isJsonPrimitive() || !element.getAsJsonPrimitive().isString()) {
            throw new SchemaViolationError(this, field, element);
        }
        return element.getAsJsonPrimitive().getAsString();
    }

    protected Integer jsonAsInteger(JsonElement element, String field) throws SchemaViolationError {
        if (!element.isJsonPrimitive() || (!element.getAsJsonPrimitive().isNumber() && !element.getAsJsonPrimitive().isString())) {
            throw new SchemaViolationError(this, field, element);
        }
        try {
            return element.getAsJsonPrimitive().getAsInt();
        } catch (NumberFormatException exc) {
            throw new SchemaViolationError(this, field, element);
        }
    }

    protected Double jsonAsDouble(JsonElement element, String field) throws SchemaViolationError {
        if (!element.isJsonPrimitive() || (!element.getAsJsonPrimitive().isNumber() && !element.getAsJsonPrimitive().isString())) {
            throw new SchemaViolationError(this, field, element);
        }
        try {
            return element.getAsJsonPrimitive().getAsDouble();
        } catch (NumberFormatException exc) {
            throw new SchemaViolationError(this, field, element);
        }
    }

    protected Boolean jsonAsBoolean(JsonElement element, String field) throws SchemaViolationError {
        if (!element.isJsonPrimitive() || (!element.getAsJsonPrimitive().isBoolean() && !element.getAsJsonPrimitive().isString())) {
            throw new SchemaViolationError(this, field, element);
        }
        return element.getAsJsonPrimitive().getAsBoolean();
    }

    protected JsonObject jsonAsObject(JsonElement element, String field) throws SchemaViolationError {
        if (!element.isJsonObject()) {
            throw new SchemaViolationError(this, field, element);
        }
        return element.getAsJsonObject();
    }

    protected JsonArray jsonAsArray(JsonElement element, String field) throws SchemaViolationError {
        if (!element.isJsonArray()) {
            throw new SchemaViolationError(this, field, element);
        }
        return element.getAsJsonArray();
    }

    public List<Node> collectNodes() {
        final ArrayList<Node> children = new ArrayList<>();

        collectNodes(this, children);

        return children;
    }

    private static void collectNodes(Object o, List<Node> collection) {
        if (o instanceof AbstractResponse) {
            final AbstractResponse response = (AbstractResponse) o;

            if (response instanceof Node) {
                collection.add((Node) response);
            }

            for (Object key : response.responseData.keySet()) {
                collectNodes(response.get((String) key), collection);
            }
        } else if (o instanceof List) {
            for (Object element : (List) o) {
                collectNodes(element, collection);
            }
        }
    }

    public abstract boolean unwrapsToObject(String key);
}

/**
 * Copyright 2019 Adobe
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

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;

/**
 * In order to allow custom fields from being "gettable" via java interface classes, this class
 * defines all the getter methods for custom fields. Note that all these methods are already implemented in
 * {@link AbstractResponse} so they are immediately available to all interfaces.
 */
public interface CustomFieldInterface {

    /**
     * Gets a field as a raw object.
     * 
     * @param field The name of the field.
     * @return The raw object.
     */
    public default Object get(String field) {
        return null;
    }

    /**
     * Tries to deserialise and return the given JSON field as a String. The field itself is expected
     * to be stored in the object data as a {@link JsonElement}, which is the case for custom simple fields.
     * 
     * @param field The name of the field.
     * @return The value of the field.
     */
    public default String getAsString(String field) throws SchemaViolationError {
        return null;
    }

    /**
     * Tries to deserialise and return the given JSON field as an Integer. The field itself is expected
     * to be stored in the object data as a {@link JsonElement}, which is the case for custom simple fields.
     * 
     * @param field The name of the field.
     * @return The value of the field.
     */
    public default Integer getAsInteger(String field) throws SchemaViolationError {
        return null;
    }

    /**
     * Tries to deserialise and return the given JSON field as a Double. The field itself is expected
     * to be stored in the object data as a {@link JsonElement}, which is the case for custom simple fields.
     * 
     * @param field The name of the field.
     * @return The value of the field.
     */
    public default Double getAsDouble(String field) throws SchemaViolationError {
        return null;
    }

    /**
     * Tries to deserialise and return the given JSON field as a Boolean. The field itself is expected
     * to be stored in the object data as a {@link JsonElement}, which is the case for custom simple fields.
     * 
     * @param field The name of the field.
     * @return The value of the field.
     */
    public default Boolean getAsBoolean(String field) throws SchemaViolationError {
        return null;
    }

    /**
     * Tries to deserialise and return the given JSON field as an Array. The field itself is expected
     * to be stored in the object data as a {@link JsonElement}, which is the case for custom simple fields.
     * 
     * @param field The name of the field.
     * @return The value of the field.
     */
    public default JsonArray getAsArray(String field) throws SchemaViolationError {
        return null;
    }
}

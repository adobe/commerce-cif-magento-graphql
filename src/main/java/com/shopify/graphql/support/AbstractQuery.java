/**
 * Copyright 2015 Shopify
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

/**
 * Created by eapache on 2015-11-17.
 */
public abstract class AbstractQuery<T extends AbstractQuery> {
    public static final String ALIAS_SUFFIX_SEPARATOR = "__";
    private static final String BAD_ALIAS_SEPARATOR = "-";
    private static final String ALIAS_DELIMITER = ":";

    public static final String CUSTOM_FIELD_LABEL = "_custom_";

    protected final StringBuilder _queryBuilder;
    private boolean firstSelection = true;
    private String aliasSuffix = null;

    protected AbstractQuery(StringBuilder queryBuilder) {
        this._queryBuilder = queryBuilder;
    }

    public static void appendQuotedString(StringBuilder query, String string) {
        query.append('"');
        for (char c : string.toCharArray()) {
            switch (c) {
                case '"':
                case '\\':
                    query.append('\\');
                    query.append(c);
                    break;
                case '\r':
                    query.append("\\r");
                    break;
                case '\n':
                    query.append("\\n");
                    break;
                default:
                    if (c < 0x20) {
                        query.append(String.format("\\u%04x", (int) c));
                    } else {
                        query.append(c);
                    }
                    break;
            }
        }
        query.append('"');
    }

    private void startSelection() {
        if (firstSelection) {
            firstSelection = false;
        } else {
            _queryBuilder.append(',');
        }
    }

    protected void startInlineFragment(String typeName) {
        if (aliasSuffix != null) {
            throw new IllegalStateException("An alias cannot be specified on inline fragments");
        }

        startSelection();
        _queryBuilder.append("... on ");
        _queryBuilder.append(typeName);
        _queryBuilder.append('{');
    }

    protected void startField(String fieldName) {
        startSelection();
        _queryBuilder.append(fieldName);
        if (aliasSuffix != null) {
            _queryBuilder.append(ALIAS_SUFFIX_SEPARATOR);
            _queryBuilder.append(aliasSuffix);
            _queryBuilder.append(ALIAS_DELIMITER);
            _queryBuilder.append(fieldName);
            aliasSuffix = null;
        }
    }

    @SuppressWarnings("unchecked")
    public T withAlias(String aliasSuffix) {
        if (this.aliasSuffix != null) {
            throw new IllegalStateException("Can only define a single alias for a field");
        }
        if (aliasSuffix == null || aliasSuffix.isEmpty()) {
            throw new IllegalArgumentException("Can't specify an empty alias");
        }
        if (aliasSuffix.contains(ALIAS_SUFFIX_SEPARATOR)) {
            throw new IllegalArgumentException("Alias must not contain __");
        }
        if (aliasSuffix.contains(BAD_ALIAS_SEPARATOR)) {
            throw new IllegalArgumentException("Alias must not contain -");
        }
        this.aliasSuffix = aliasSuffix;
        return (T) this;
    }

    /**
     * Adds a custom simple field to the GraphQL query. The adjective "simple" here refers to
     * a scalar/primitive field like String, Integer, Double, Boolean, or an array of fields.
     * 
     * @param fieldName The name of the field that will be added to the GraphQL request.
     * @return The current query builder.
     */
    @SuppressWarnings("unchecked")
    public T addCustomSimpleField(String fieldName) {
        startField(fieldName + CUSTOM_FIELD_LABEL + ALIAS_DELIMITER + fieldName);
        return (T) this;
    }

    /**
     * Adds a custom object field to the GraphQL query. The term "object" here refers to
     * a GraphQL object, which means some fields of the custom object must also be defined
     * in the query.
     * 
     * @param fieldName The name of the field that will be added to the GraphQL request.
     * @param queryDef The definition of the requested sub-fields of the object.
     * @return The current query builder.
     */
    @SuppressWarnings("unchecked")
    public T addCustomObjectField(String fieldName, CustomFieldQueryDefinition queryDef) {
        startField(fieldName + CUSTOM_FIELD_LABEL + ALIAS_DELIMITER + fieldName);

        _queryBuilder.append('{');
        queryDef.define(new CustomFieldQuery(_queryBuilder));
        _queryBuilder.append('}');

        return (T) this;
    }

    /**
     * Use this method when adding custom fields to the GraphQL query without the protection mechanism.
     * This bypasses the aliasing that
     * prevents potential clashes with existing standard fields in the schema, so users may
     * more easily encounter field name conflicts.
     * 
     * The adjective "simple" here refers to a scalar/primitive field like String,
     * Integer, Double, Boolean, or an array of fields.
     * 
     * @param fieldName The name of the field that will be added to the GraphQL request.
     * @return The current query builder.
     */
    @SuppressWarnings("unchecked")
    public T addCustomSimpleFieldUnsafe(String fieldName) {
        startField(fieldName);
        return (T) this;
    }

    /**
     * Use this method when adding custom object fields to the GraphQL query without the protection mechanism.
     * This bypasses the aliasing that prevents potential clashes with existing standard fields
     * in the schema, so users may more easily encounter field name conflicts.
     * 
     * The term "object" here refers to a GraphQL object, which means some fields of the
     * object must also be defined in the query.
     * 
     * @param fieldName The name of the field that will be added to the GraphQL request.
     * @param queryDef The definition of the requested sub-fields of the object.
     * @return The current query builder.
     */
    @SuppressWarnings("unchecked")
    public T addCustomObjectFieldUnsafe(String fieldName, CustomFieldQueryDefinition queryDef) {
        startField(fieldName);

        _queryBuilder.append('{');
        queryDef.define(new CustomFieldQuery(_queryBuilder));
        _queryBuilder.append('}');

        return (T) this;
    }
}

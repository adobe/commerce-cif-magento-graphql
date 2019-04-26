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

/**
 * Created by eapache on 2015-11-17.
 */
public abstract class AbstractQuery<T extends AbstractQuery> {
    public static final String ALIAS_SUFFIX_SEPARATOR = "__";
    private static final String BAD_ALIAS_SEPARATOR = "-";
    private static final String ALIAS_DELIMITER = ":";
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
}

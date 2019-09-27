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

public class CustomFieldQuery extends AbstractQuery<CustomFieldQuery> {

    public CustomFieldQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
     * Adds a standard "non-custom" field to the query. This method is typically used to specify
     * the fields of a custom object field that has an existing GraphQL type that can already be
     * parsed by the library.
     * 
     * @param fieldName
     * @return The current query builder.
     */
    public CustomFieldQuery addField(String fieldName) {
        startField(fieldName);
        return this;
    }
}

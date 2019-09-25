/*******************************************************************************
 *
 *    Copyright 2019 Adobe. All rights reserved.
 *    This file is licensed to you under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License. You may obtain a copy
 *    of the License at http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software distributed under
 *    the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR REPRESENTATIONS
 *    OF ANY KIND, either express or implied. See the License for the specific language
 *    governing permissions and limitations under the License.
 *
 ******************************************************************************/

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

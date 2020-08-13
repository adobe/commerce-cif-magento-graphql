/*******************************************************************************
 *
 *    Copyright 2020 Adobe. All rights reserved.
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

package com.adobe.cq.commerce.magento.graphql;

import com.shopify.graphql.support.AbstractQuery;
import com.shopify.graphql.support.Fragment;

/**
 * Object and Interface types are described by a list of Fields, each of which has a name, potentially
 * a list of arguments, and a return type.
 */
public class __FieldQuery extends AbstractQuery<__FieldQuery> {
    __FieldQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public __FieldQuery args(__InputValueQueryDefinition queryDef) {
        startField("args");

        _queryBuilder.append('{');
        queryDef.define(new __InputValueQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public __FieldQuery deprecationReason() {
        startField("deprecationReason");

        return this;
    }

    public __FieldQuery description() {
        startField("description");

        return this;
    }

    public __FieldQuery isDeprecated() {
        startField("isDeprecated");

        return this;
    }

    public __FieldQuery name() {
        startField("name");

        return this;
    }

    public __FieldQuery type(__TypeQueryDefinition queryDef) {
        startField("type");

        _queryBuilder.append('{');
        queryDef.define(new __TypeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Creates a GraphQL "named" fragment with the specified query type definition.
     * The generics nature of fragments ensures that a fragment can only be used at the right place in the GraphQL request.
     * 
     * @param name The name of the fragment, must be unique for a given GraphQL request.
     * @param queryDef The fragment definition.
     * @return The fragment of a given generics type.
     */
    public static Fragment<__FieldQuery> createFragment(String name, __FieldQueryDefinition queryDef) {
        StringBuilder sb = new StringBuilder();
        queryDef.define(new __FieldQuery(sb));
        return new Fragment<>(name, "__Field", sb.toString());
    }

    /**
     * Adds a <code>__FieldQuery</code> fragment reference at the current position of the query.
     * For example for a fragment named <code>test</code>, calling this method will add the
     * reference <code>...test</code> in the query. For GraphQL types implementing an interface, there
     * will be some similar methods using the Query type of each implemented interface.
     * 
     * @param fragment The fragment to reference.
     */
    public __FieldQuery addFragmentReference(Fragment<__FieldQuery> fragment) {
        startField("..." + fragment.getName());
        return this;
    }
}

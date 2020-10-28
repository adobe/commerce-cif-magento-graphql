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
import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Fragment;
import com.shopify.graphql.support.Input;

/**
 * Arguments provided to Fields or Directives and the input fields of an InputObject are represented as
 * Input Values which describe their type and optionally a default value.
 */
public class __InputValueQuery extends AbstractQuery<__InputValueQuery> {
    __InputValueQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
     * A GraphQL-formatted string representing the default value for this input value.
     */
    public __InputValueQuery defaultValue() {
        startField("defaultValue");

        return this;
    }

    public __InputValueQuery description() {
        startField("description");

        return this;
    }

    public __InputValueQuery name() {
        startField("name");

        return this;
    }

    public __InputValueQuery type(__TypeQueryDefinition queryDef) {
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
    public static Fragment<__InputValueQuery> createFragment(String name, __InputValueQueryDefinition queryDef) {
        StringBuilder sb = new StringBuilder();
        queryDef.define(new __InputValueQuery(sb));
        return new Fragment<>(name, "__InputValue", sb.toString());
    }

    /**
     * Adds a <code>__InputValueQuery</code> fragment reference at the current position of the query.
     * For example for a fragment named <code>test</code>, calling this method will add the
     * reference <code>...test</code> in the query. For GraphQL types implementing an interface, there
     * will be some similar methods using the Query type of each implemented interface.
     * 
     * @param fragment The fragment to reference.
     */
    public __InputValueQuery addFragmentReference(Fragment<__InputValueQuery> fragment) {
        startField("..." + fragment.getName());
        return this;
    }
}

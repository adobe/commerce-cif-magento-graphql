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
 * A Directive provides a way to describe alternate runtime execution and type validation behavior in a
 * GraphQL document.
 * In some cases, you need to provide options to alter GraphQL&#39;s execution behavior in ways field
 * arguments will not suffice, such as conditionally including or skipping a field. Directives provide
 * this by describing additional information to the executor.
 */
public class __DirectiveQuery extends AbstractQuery<__DirectiveQuery> {
    __DirectiveQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public __DirectiveQuery args(__InputValueQueryDefinition queryDef) {
        startField("args");

        _queryBuilder.append('{');
        queryDef.define(new __InputValueQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public __DirectiveQuery description() {
        startField("description");

        return this;
    }

    public __DirectiveQuery isRepeatable() {
        startField("isRepeatable");

        return this;
    }

    public __DirectiveQuery locations() {
        startField("locations");

        return this;
    }

    public __DirectiveQuery name() {
        startField("name");

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
    public static Fragment<__DirectiveQuery> createFragment(String name, __DirectiveQueryDefinition queryDef) {
        StringBuilder sb = new StringBuilder();
        queryDef.define(new __DirectiveQuery(sb));
        return new Fragment<>(name, "__Directive", sb.toString());
    }

    /**
     * Adds a <code>__DirectiveQuery</code> fragment reference at the current position of the query.
     * For example for a fragment named <code>test</code>, calling this method will add the
     * reference <code>...test</code> in the query. For GraphQL types implementing an interface, there
     * will be some similar methods using the Query type of each implemented interface.
     * 
     * @param fragment The fragment to reference.
     */
    public __DirectiveQuery addFragmentReference(Fragment<__DirectiveQuery> fragment) {
        startField("..." + fragment.getName());
        return this;
    }
}

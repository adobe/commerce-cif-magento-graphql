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
 * Contains iterable information such as the array of items, the count, and attributes that represent
 * the compare list.
 */
public class CompareListQuery extends AbstractQuery<CompareListQuery> {
    CompareListQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
     * An array of attributes that can be used for comparing products.
     */
    public CompareListQuery attributes(ComparableAttributeQueryDefinition queryDef) {
        startField("attributes");

        _queryBuilder.append('{');
        queryDef.define(new ComparableAttributeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The number of items in the compare list.
     */
    public CompareListQuery itemCount() {
        startField("item_count");

        return this;
    }

    /**
     * An array of products to compare.
     */
    public CompareListQuery items(ComparableItemQueryDefinition queryDef) {
        startField("items");

        _queryBuilder.append('{');
        queryDef.define(new ComparableItemQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The unique ID assigned to the compare list.
     */
    public CompareListQuery uid() {
        startField("uid");

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
    public static Fragment<CompareListQuery> createFragment(String name, CompareListQueryDefinition queryDef) {
        StringBuilder sb = new StringBuilder();
        queryDef.define(new CompareListQuery(sb));
        return new Fragment<>(name, "CompareList", sb.toString());
    }

    /**
     * Adds a <code>CompareListQuery</code> fragment reference at the current position of the query.
     * For example for a fragment named <code>test</code>, calling this method will add the
     * reference <code>...test</code> in the query. For GraphQL types implementing an interface, there
     * will be some similar methods using the Query type of each implemented interface.
     * 
     * @param fragment The fragment to reference.
     */
    public CompareListQuery addFragmentReference(Fragment<CompareListQuery> fragment) {
        startField("..." + fragment.getName());
        return this;
    }
}

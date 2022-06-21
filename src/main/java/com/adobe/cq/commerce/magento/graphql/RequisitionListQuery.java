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

/**
 * Defines the contents of a requisition list.
 */
public class RequisitionListQuery extends AbstractQuery<RequisitionListQuery> {
    RequisitionListQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
     * Optional text that describes the requisition list.
     */
    public RequisitionListQuery description() {
        startField("description");

        return this;
    }

    public class ItemsArguments extends Arguments {
        ItemsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
         * The page of results to return. The default value is 1.
         */
        public ItemsArguments currentPage(Integer value) {
            if (value != null) {
                startArgument("currentPage");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
         * The maximum number of results to return. The default value is 1.
         */
        public ItemsArguments pageSize(Integer value) {
            if (value != null) {
                startArgument("pageSize");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface ItemsArgumentsDefinition {
        void define(ItemsArguments args);
    }

    /**
     * An array of products added to the requisition list.
     */
    public RequisitionListQuery items(RequistionListItemsQueryDefinition queryDef) {
        return items(args -> {}, queryDef);
    }

    /**
     * An array of products added to the requisition list.
     */
    public RequisitionListQuery items(ItemsArgumentsDefinition argsDef, RequistionListItemsQueryDefinition queryDef) {
        startField("items");

        ItemsArguments args = new ItemsArguments(_queryBuilder);
        argsDef.define(args);
        ItemsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new RequistionListItemsQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The number of items in the list.
     */
    public RequisitionListQuery itemsCount() {
        startField("items_count");

        return this;
    }

    /**
     * The requisition list name.
     */
    public RequisitionListQuery name() {
        startField("name");

        return this;
    }

    /**
     * The unique requisition list ID.
     */
    public RequisitionListQuery uid() {
        startField("uid");

        return this;
    }

    /**
     * The time of the last modification of the requisition list.
     */
    public RequisitionListQuery updatedAt() {
        startField("updated_at");

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
    public static Fragment<RequisitionListQuery> createFragment(String name, RequisitionListQueryDefinition queryDef) {
        StringBuilder sb = new StringBuilder();
        queryDef.define(new RequisitionListQuery(sb));
        return new Fragment<>(name, "RequisitionList", sb.toString());
    }

    /**
     * Adds a <code>RequisitionListQuery</code> fragment reference at the current position of the query.
     * For example for a fragment named <code>test</code>, calling this method will add the
     * reference <code>...test</code> in the query. For GraphQL types implementing an interface, there
     * will be some similar methods using the Query type of each implemented interface.
     * 
     * @param fragment The fragment to reference.
     */
    public RequisitionListQuery addFragmentReference(Fragment<RequisitionListQuery> fragment) {
        startField("..." + fragment.getName());
        return this;
    }
}

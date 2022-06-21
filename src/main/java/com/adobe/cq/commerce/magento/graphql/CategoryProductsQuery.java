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
 * Contains details about the products assigned to a category.
 */
public class CategoryProductsQuery extends AbstractQuery<CategoryProductsQuery> {
    CategoryProductsQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
     * An array of products that are assigned to the category.
     */
    public CategoryProductsQuery items(ProductInterfaceQueryDefinition queryDef) {
        startField("items");

        _queryBuilder.append('{');
        queryDef.define(new ProductInterfaceQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Pagination metadata.
     */
    public CategoryProductsQuery pageInfo(SearchResultPageInfoQueryDefinition queryDef) {
        startField("page_info");

        _queryBuilder.append('{');
        queryDef.define(new SearchResultPageInfoQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The number of products in the category that are marked as visible. By default, in complex products,
     * parent products are visible, but their child products are not.
     */
    public CategoryProductsQuery totalCount() {
        startField("total_count");

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
    public static Fragment<CategoryProductsQuery> createFragment(String name, CategoryProductsQueryDefinition queryDef) {
        StringBuilder sb = new StringBuilder();
        queryDef.define(new CategoryProductsQuery(sb));
        return new Fragment<>(name, "CategoryProducts", sb.toString());
    }

    /**
     * Adds a <code>CategoryProductsQuery</code> fragment reference at the current position of the query.
     * For example for a fragment named <code>test</code>, calling this method will add the
     * reference <code>...test</code> in the query. For GraphQL types implementing an interface, there
     * will be some similar methods using the Query type of each implemented interface.
     * 
     * @param fragment The fragment to reference.
     */
    public CategoryProductsQuery addFragmentReference(Fragment<CategoryProductsQuery> fragment) {
        startField("..." + fragment.getName());
        return this;
    }
}

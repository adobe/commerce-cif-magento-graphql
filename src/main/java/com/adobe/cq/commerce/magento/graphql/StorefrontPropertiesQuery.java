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

public class StorefrontPropertiesQuery extends AbstractQuery<StorefrontPropertiesQuery> {
    StorefrontPropertiesQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
     * The relative position of the attribute in the layered navigation block
     */
    public StorefrontPropertiesQuery position() {
        startField("position");

        return this;
    }

    /**
     * Indicates whether the attribute is filterable with results, without results, or not at all
     */
    public StorefrontPropertiesQuery useInLayeredNavigation() {
        startField("use_in_layered_navigation");

        return this;
    }

    /**
     * Indicates whether the attribute is displayed in product listings
     */
    public StorefrontPropertiesQuery useInProductListing() {
        startField("use_in_product_listing");

        return this;
    }

    /**
     * Indicates whether the attribute can be used in layered navigation on search results pages
     */
    public StorefrontPropertiesQuery useInSearchResultsLayeredNavigation() {
        startField("use_in_search_results_layered_navigation");

        return this;
    }

    /**
     * Indicates whether the attribute is displayed on product pages
     */
    public StorefrontPropertiesQuery visibleOnCatalogPages() {
        startField("visible_on_catalog_pages");

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
    public static Fragment<StorefrontPropertiesQuery> createFragment(String name, StorefrontPropertiesQueryDefinition queryDef) {
        StringBuilder sb = new StringBuilder();
        queryDef.define(new StorefrontPropertiesQuery(sb));
        return new Fragment<>(name, "StorefrontProperties", sb.toString());
    }

    /**
     * Adds a <code>StorefrontPropertiesQuery</code> fragment reference at the current position of the query.
     * For example for a fragment named <code>test</code>, calling this method will add the
     * reference <code>...test</code> in the query. For GraphQL types implementing an interface, there
     * will be some similar methods using the Query type of each implemented interface.
     * 
     * @param fragment The fragment to reference.
     */
    public StorefrontPropertiesQuery addFragmentReference(Fragment<StorefrontPropertiesQuery> fragment) {
        startField("..." + fragment.getName());
        return this;
    }
}

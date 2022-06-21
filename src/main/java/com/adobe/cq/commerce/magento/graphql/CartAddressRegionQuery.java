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
 * Contains details about the region in a billing or shipping address.
 */
public class CartAddressRegionQuery extends AbstractQuery<CartAddressRegionQuery> {
    CartAddressRegionQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
     * The state or province code.
     */
    public CartAddressRegionQuery code() {
        startField("code");

        return this;
    }

    /**
     * The display label for the region.
     */
    public CartAddressRegionQuery label() {
        startField("label");

        return this;
    }

    /**
     * The unique ID for a pre-defined region.
     */
    public CartAddressRegionQuery regionId() {
        startField("region_id");

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
    public static Fragment<CartAddressRegionQuery> createFragment(String name, CartAddressRegionQueryDefinition queryDef) {
        StringBuilder sb = new StringBuilder();
        queryDef.define(new CartAddressRegionQuery(sb));
        return new Fragment<>(name, "CartAddressRegion", sb.toString());
    }

    /**
     * Adds a <code>CartAddressRegionQuery</code> fragment reference at the current position of the query.
     * For example for a fragment named <code>test</code>, calling this method will add the
     * reference <code>...test</code> in the query. For GraphQL types implementing an interface, there
     * will be some similar methods using the Query type of each implemented interface.
     * 
     * @param fragment The fragment to reference.
     */
    public CartAddressRegionQuery addFragmentReference(Fragment<CartAddressRegionQuery> fragment) {
        startField("..." + fragment.getName());
        return this;
    }
}

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
 * Contains details about a wish list item.
 */
public class WishlistItemQuery extends AbstractQuery<WishlistItemQuery> {
    WishlistItemQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
     * The time when the customer added the item to the wish list.
     */
    public WishlistItemQuery addedAt() {
        startField("added_at");

        return this;
    }

    /**
     * The customer&#39;s comment about this item.
     */
    public WishlistItemQuery description() {
        startField("description");

        return this;
    }

    /**
     * The unique ID for a `WishlistItem` object.
     */
    public WishlistItemQuery id() {
        startField("id");

        return this;
    }

    /**
     * Details about the wish list item.
     */
    public WishlistItemQuery product(ProductInterfaceQueryDefinition queryDef) {
        startField("product");

        _queryBuilder.append('{');
        queryDef.define(new ProductInterfaceQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The quantity of this wish list item
     */
    public WishlistItemQuery qty() {
        startField("qty");

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
    public static Fragment<WishlistItemQuery> createFragment(String name, WishlistItemQueryDefinition queryDef) {
        StringBuilder sb = new StringBuilder();
        queryDef.define(new WishlistItemQuery(sb));
        return new Fragment<>(name, "WishlistItem", sb.toString());
    }

    /**
     * Adds a <code>WishlistItemQuery</code> fragment reference at the current position of the query.
     * For example for a fragment named <code>test</code>, calling this method will add the
     * reference <code>...test</code> in the query. For GraphQL types implementing an interface, there
     * will be some similar methods using the Query type of each implemented interface.
     * 
     * @param fragment The fragment to reference.
     */
    public WishlistItemQuery addFragmentReference(Fragment<WishlistItemQuery> fragment) {
        startField("..." + fragment.getName());
        return this;
    }
}

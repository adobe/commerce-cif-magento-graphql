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
 * A simple product wish list Item
 */
public class SimpleWishlistItemQuery extends AbstractQuery<SimpleWishlistItemQuery> {
    SimpleWishlistItemQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
     * The date and time the item was added to the wish list
     */
    public SimpleWishlistItemQuery addedAt() {
        startField("added_at");

        return this;
    }

    /**
     * Custom options selected for the wish list item
     */
    public SimpleWishlistItemQuery customizableOptions(SelectedCustomizableOptionQueryDefinition queryDef) {
        startField("customizable_options");

        _queryBuilder.append('{');
        queryDef.define(new SelectedCustomizableOptionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The description of the item
     */
    public SimpleWishlistItemQuery description() {
        startField("description");

        return this;
    }

    /**
     * The unique ID for a `WishlistItemInterface` object
     */
    public SimpleWishlistItemQuery id() {
        startField("id");

        return this;
    }

    /**
     * Product details of the wish list item
     */
    public SimpleWishlistItemQuery product(ProductInterfaceQueryDefinition queryDef) {
        startField("product");

        _queryBuilder.append('{');
        queryDef.define(new ProductInterfaceQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The quantity of this wish list item
     */
    public SimpleWishlistItemQuery quantity() {
        startField("quantity");

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
    public static Fragment<SimpleWishlistItemQuery> createFragment(String name, SimpleWishlistItemQueryDefinition queryDef) {
        StringBuilder sb = new StringBuilder();
        queryDef.define(new SimpleWishlistItemQuery(sb));
        return new Fragment<>(name, "SimpleWishlistItem", sb.toString());
    }

    /**
     * Adds a <code>SimpleWishlistItemQuery</code> fragment reference at the current position of the query.
     * For example for a fragment named <code>test</code>, calling this method will add the
     * reference <code>...test</code> in the query. For GraphQL types implementing an interface, there
     * will be some similar methods using the Query type of each implemented interface.
     * 
     * @param fragment The fragment to reference.
     */
    public SimpleWishlistItemQuery addFragmentReference(Fragment<SimpleWishlistItemQuery> fragment) {
        startField("..." + fragment.getName());
        return this;
    }

    /**
     * Adds a <code>WishlistItemInterfaceQuery</code> fragment reference at the current position of the query.
     * For example for a fragment named <code>test</code>, calling this method will add the
     * reference <code>...test</code> in the query.
     * 
     * @param fragment The fragment to reference.
     */
    public SimpleWishlistItemQuery addWishlistItemInterfaceFragmentReference(Fragment<WishlistItemInterfaceQuery> fragment) {
        startField("..." + fragment.getName());
        return this;
    }
}

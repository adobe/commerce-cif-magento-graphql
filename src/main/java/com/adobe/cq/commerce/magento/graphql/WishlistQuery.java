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

public class WishlistQuery extends AbstractQuery<WishlistQuery> {
    WishlistQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
     * The unique ID for a `Wishlist` object
     */
    public WishlistQuery id() {
        startField("id");

        return this;
    }

    /**
     * @deprecated Use field `items_v2` from type `Wishlist` instead
     */
    @Deprecated
    public WishlistQuery items(WishlistItemQueryDefinition queryDef) {
        startField("items");

        _queryBuilder.append('{');
        queryDef.define(new WishlistItemQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The number of items in the wish list
     */
    public WishlistQuery itemsCount() {
        startField("items_count");

        return this;
    }

    public class ItemsV2Arguments extends Arguments {
        ItemsV2Arguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        public ItemsV2Arguments currentPage(Integer value) {
            if (value != null) {
                startArgument("currentPage");
                _queryBuilder.append(value);
            }
            return this;
        }

        public ItemsV2Arguments pageSize(Integer value) {
            if (value != null) {
                startArgument("pageSize");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface ItemsV2ArgumentsDefinition {
        void define(ItemsV2Arguments args);
    }

    /**
     * An array of items in the customer&#39;s wish list
     */
    public WishlistQuery itemsV2(WishlistItemsQueryDefinition queryDef) {
        return itemsV2(args -> {}, queryDef);
    }

    /**
     * An array of items in the customer&#39;s wish list
     */
    public WishlistQuery itemsV2(ItemsV2ArgumentsDefinition argsDef, WishlistItemsQueryDefinition queryDef) {
        startField("items_v2");

        ItemsV2Arguments args = new ItemsV2Arguments(_queryBuilder);
        argsDef.define(args);
        ItemsV2Arguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new WishlistItemsQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The wish list name
     */
    public WishlistQuery name() {
        startField("name");

        return this;
    }

    /**
     * An encrypted code that Magento uses to link to the wish list
     */
    public WishlistQuery sharingCode() {
        startField("sharing_code");

        return this;
    }

    /**
     * The time of the last modification to the wish list
     */
    public WishlistQuery updatedAt() {
        startField("updated_at");

        return this;
    }

    /**
     * Indicates whether the wish list is public or private
     */
    public WishlistQuery visibility() {
        startField("visibility");

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
    public static Fragment<WishlistQuery> createFragment(String name, WishlistQueryDefinition queryDef) {
        StringBuilder sb = new StringBuilder();
        queryDef.define(new WishlistQuery(sb));
        return new Fragment<>(name, "Wishlist", sb.toString());
    }

    /**
     * Adds a <code>WishlistQuery</code> fragment reference at the current position of the query.
     * For example for a fragment named <code>test</code>, calling this method will add the
     * reference <code>...test</code> in the query. For GraphQL types implementing an interface, there
     * will be some similar methods using the Query type of each implemented interface.
     * 
     * @param fragment The fragment to reference.
     */
    public WishlistQuery addFragmentReference(Fragment<WishlistQuery> fragment) {
        startField("..." + fragment.getName());
        return this;
    }
}

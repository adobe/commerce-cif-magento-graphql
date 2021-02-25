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

public class CartItemInterfaceQuery extends AbstractQuery<CartItemInterfaceQuery> {
    CartItemInterfaceQuery(StringBuilder _queryBuilder) {
        this(_queryBuilder, true);
    }

    CartItemInterfaceQuery(StringBuilder _queryBuilder, boolean addTypename) {
        super(_queryBuilder);
        if (addTypename) {
            startField("__typename");
        }
    }

    /**
     * @deprecated Use `uid` instead
     */
    @Deprecated
    public CartItemInterfaceQuery id() {
        startField("id");

        return this;
    }

    public CartItemInterfaceQuery prices(CartItemPricesQueryDefinition queryDef) {
        startField("prices");

        _queryBuilder.append('{');
        queryDef.define(new CartItemPricesQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public CartItemInterfaceQuery product(ProductInterfaceQueryDefinition queryDef) {
        startField("product");

        _queryBuilder.append('{');
        queryDef.define(new ProductInterfaceQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public CartItemInterfaceQuery quantity() {
        startField("quantity");

        return this;
    }

    /**
     * The unique ID for a `CartItemInterface` object
     */
    public CartItemInterfaceQuery uid() {
        startField("uid");

        return this;
    }

    public CartItemInterfaceQuery onBundleCartItem(BundleCartItemQueryDefinition queryDef) {
        startInlineFragment("BundleCartItem");
        queryDef.define(new BundleCartItemQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public CartItemInterfaceQuery onConfigurableCartItem(ConfigurableCartItemQueryDefinition queryDef) {
        startInlineFragment("ConfigurableCartItem");
        queryDef.define(new ConfigurableCartItemQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public CartItemInterfaceQuery onDownloadableCartItem(DownloadableCartItemQueryDefinition queryDef) {
        startInlineFragment("DownloadableCartItem");
        queryDef.define(new DownloadableCartItemQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public CartItemInterfaceQuery onGiftCardCartItem(GiftCardCartItemQueryDefinition queryDef) {
        startInlineFragment("GiftCardCartItem");
        queryDef.define(new GiftCardCartItemQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public CartItemInterfaceQuery onSimpleCartItem(SimpleCartItemQueryDefinition queryDef) {
        startInlineFragment("SimpleCartItem");
        queryDef.define(new SimpleCartItemQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public CartItemInterfaceQuery onVirtualCartItem(VirtualCartItemQueryDefinition queryDef) {
        startInlineFragment("VirtualCartItem");
        queryDef.define(new VirtualCartItemQuery(_queryBuilder));
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
    public static Fragment<CartItemInterfaceQuery> createFragment(String name, CartItemInterfaceQueryDefinition queryDef) {
        StringBuilder sb = new StringBuilder();
        queryDef.define(new CartItemInterfaceQuery(sb, false));
        return new Fragment<>(name, "CartItemInterface", sb.toString());
    }

    /**
     * Adds a <code>CartItemInterfaceQuery</code> fragment reference at the current position of the query.
     * For example for a fragment named <code>test</code>, calling this method will add the
     * reference <code>...test</code> in the query. For GraphQL types implementing an interface, there
     * will be some similar methods using the Query type of each implemented interface.
     * 
     * @param fragment The fragment to reference.
     */
    public CartItemInterfaceQuery addFragmentReference(Fragment<CartItemInterfaceQuery> fragment) {
        startField("..." + fragment.getName());
        return this;
    }
}

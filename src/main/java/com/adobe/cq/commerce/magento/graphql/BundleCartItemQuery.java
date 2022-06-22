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
 * An implementation for bundle product cart items.
 */
public class BundleCartItemQuery extends AbstractQuery<BundleCartItemQuery> {
    BundleCartItemQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
     * The list of available gift wrapping options for the cart item.
     */
    public BundleCartItemQuery availableGiftWrapping(GiftWrappingQueryDefinition queryDef) {
        startField("available_gift_wrapping");

        _queryBuilder.append('{');
        queryDef.define(new GiftWrappingQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * An array containing the bundle options the shopper selected.
     */
    public BundleCartItemQuery bundleOptions(SelectedBundleOptionQueryDefinition queryDef) {
        startField("bundle_options");

        _queryBuilder.append('{');
        queryDef.define(new SelectedBundleOptionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * An array containing the customizable options the shopper selected.
     */
    public BundleCartItemQuery customizableOptions(SelectedCustomizableOptionQueryDefinition queryDef) {
        startField("customizable_options");

        _queryBuilder.append('{');
        queryDef.define(new SelectedCustomizableOptionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The entered gift message for the cart item
     */
    public BundleCartItemQuery giftMessage(GiftMessageQueryDefinition queryDef) {
        startField("gift_message");

        _queryBuilder.append('{');
        queryDef.define(new GiftMessageQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The selected gift wrapping for the cart item.
     */
    public BundleCartItemQuery giftWrapping(GiftWrappingQueryDefinition queryDef) {
        startField("gift_wrapping");

        _queryBuilder.append('{');
        queryDef.define(new GiftWrappingQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * @deprecated Use `uid` instead.
     */
    @Deprecated
    public BundleCartItemQuery id() {
        startField("id");

        return this;
    }

    /**
     * Contains details about the price of the item, including taxes and discounts.
     */
    public BundleCartItemQuery prices(CartItemPricesQueryDefinition queryDef) {
        startField("prices");

        _queryBuilder.append('{');
        queryDef.define(new CartItemPricesQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Details about an item in the cart.
     */
    public BundleCartItemQuery product(ProductInterfaceQueryDefinition queryDef) {
        startField("product");

        _queryBuilder.append('{');
        queryDef.define(new ProductInterfaceQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The quantity of this item in the cart.
     */
    public BundleCartItemQuery quantity() {
        startField("quantity");

        return this;
    }

    /**
     * The unique ID for a `CartItemInterface` object.
     */
    public BundleCartItemQuery uid() {
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
    public static Fragment<BundleCartItemQuery> createFragment(String name, BundleCartItemQueryDefinition queryDef) {
        StringBuilder sb = new StringBuilder();
        queryDef.define(new BundleCartItemQuery(sb));
        return new Fragment<>(name, "BundleCartItem", sb.toString());
    }

    /**
     * Adds a <code>BundleCartItemQuery</code> fragment reference at the current position of the query.
     * For example for a fragment named <code>test</code>, calling this method will add the
     * reference <code>...test</code> in the query. For GraphQL types implementing an interface, there
     * will be some similar methods using the Query type of each implemented interface.
     * 
     * @param fragment The fragment to reference.
     */
    public BundleCartItemQuery addFragmentReference(Fragment<BundleCartItemQuery> fragment) {
        startField("..." + fragment.getName());
        return this;
    }

    /**
     * Adds a <code>CartItemInterfaceQuery</code> fragment reference at the current position of the query.
     * For example for a fragment named <code>test</code>, calling this method will add the
     * reference <code>...test</code> in the query.
     * 
     * @param fragment The fragment to reference.
     */
    public BundleCartItemQuery addCartItemInterfaceFragmentReference(Fragment<CartItemInterfaceQuery> fragment) {
        startField("..." + fragment.getName());
        return this;
    }
}

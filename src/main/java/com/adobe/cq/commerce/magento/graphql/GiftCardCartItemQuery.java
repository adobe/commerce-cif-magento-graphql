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
 * Contains details about a gift card that has been added to a cart.
 */
public class GiftCardCartItemQuery extends AbstractQuery<GiftCardCartItemQuery> {
    GiftCardCartItemQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
     * The amount and currency of the gift card.
     */
    public GiftCardCartItemQuery amount(MoneyQueryDefinition queryDef) {
        startField("amount");

        _queryBuilder.append('{');
        queryDef.define(new MoneyQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * An array of customizations applied to the gift card.
     */
    public GiftCardCartItemQuery customizableOptions(SelectedCustomizableOptionQueryDefinition queryDef) {
        startField("customizable_options");

        _queryBuilder.append('{');
        queryDef.define(new SelectedCustomizableOptionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * @deprecated Use `uid` instead.
     */
    @Deprecated
    public GiftCardCartItemQuery id() {
        startField("id");

        return this;
    }

    /**
     * The message from the sender to the recipient.
     */
    public GiftCardCartItemQuery message() {
        startField("message");

        return this;
    }

    /**
     * Contains details about the price of the item, including taxes and discounts.
     */
    public GiftCardCartItemQuery prices(CartItemPricesQueryDefinition queryDef) {
        startField("prices");

        _queryBuilder.append('{');
        queryDef.define(new CartItemPricesQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Details about an item in the cart.
     */
    public GiftCardCartItemQuery product(ProductInterfaceQueryDefinition queryDef) {
        startField("product");

        _queryBuilder.append('{');
        queryDef.define(new ProductInterfaceQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The quantity of this item in the cart.
     */
    public GiftCardCartItemQuery quantity() {
        startField("quantity");

        return this;
    }

    /**
     * The email address of the person receiving the gift card.
     */
    public GiftCardCartItemQuery recipientEmail() {
        startField("recipient_email");

        return this;
    }

    /**
     * The name of the person receiving the gift card.
     */
    public GiftCardCartItemQuery recipientName() {
        startField("recipient_name");

        return this;
    }

    /**
     * The email address of the sender.
     */
    public GiftCardCartItemQuery senderEmail() {
        startField("sender_email");

        return this;
    }

    /**
     * The name of the sender.
     */
    public GiftCardCartItemQuery senderName() {
        startField("sender_name");

        return this;
    }

    /**
     * The unique ID for a `CartItemInterface` object.
     */
    public GiftCardCartItemQuery uid() {
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
    public static Fragment<GiftCardCartItemQuery> createFragment(String name, GiftCardCartItemQueryDefinition queryDef) {
        StringBuilder sb = new StringBuilder();
        queryDef.define(new GiftCardCartItemQuery(sb));
        return new Fragment<>(name, "GiftCardCartItem", sb.toString());
    }

    /**
     * Adds a <code>GiftCardCartItemQuery</code> fragment reference at the current position of the query.
     * For example for a fragment named <code>test</code>, calling this method will add the
     * reference <code>...test</code> in the query. For GraphQL types implementing an interface, there
     * will be some similar methods using the Query type of each implemented interface.
     * 
     * @param fragment The fragment to reference.
     */
    public GiftCardCartItemQuery addFragmentReference(Fragment<GiftCardCartItemQuery> fragment) {
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
    public GiftCardCartItemQuery addCartItemInterfaceFragmentReference(Fragment<CartItemInterfaceQuery> fragment) {
        startField("..." + fragment.getName());
        return this;
    }
}

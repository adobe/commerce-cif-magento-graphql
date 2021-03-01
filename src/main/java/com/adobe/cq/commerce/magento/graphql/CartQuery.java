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

public class CartQuery extends AbstractQuery<CartQuery> {
    CartQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
     * An array of coupons that have been applied to the cart
     *
     * @deprecated Use applied_coupons instead
     */
    @Deprecated
    public CartQuery appliedCoupon(AppliedCouponQueryDefinition queryDef) {
        startField("applied_coupon");

        _queryBuilder.append('{');
        queryDef.define(new AppliedCouponQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * An array of `AppliedCoupon` objects. Each object contains the `code` text attribute, which specifies
     * the coupon code
     */
    public CartQuery appliedCoupons(AppliedCouponQueryDefinition queryDef) {
        startField("applied_coupons");

        _queryBuilder.append('{');
        queryDef.define(new AppliedCouponQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Contains the code attribute, which specifies the applied gift card codes
     */
    public CartQuery appliedGiftCards(AppliedGiftCardQueryDefinition queryDef) {
        startField("applied_gift_cards");

        _queryBuilder.append('{');
        queryDef.define(new AppliedGiftCardQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The amount of reward points applied to the cart
     */
    public CartQuery appliedRewardPoints(RewardPointsAmountQueryDefinition queryDef) {
        startField("applied_reward_points");

        _queryBuilder.append('{');
        queryDef.define(new RewardPointsAmountQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Contains store credit information applied on the cart
     */
    public CartQuery appliedStoreCredit(AppliedStoreCreditQueryDefinition queryDef) {
        startField("applied_store_credit");

        _queryBuilder.append('{');
        queryDef.define(new AppliedStoreCreditQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The list of available gift wrapping options for the cart
     */
    public CartQuery availableGiftWrappings(GiftWrappingQueryDefinition queryDef) {
        startField("available_gift_wrappings");

        _queryBuilder.append('{');
        queryDef.define(new GiftWrappingQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Available payment methods
     */
    public CartQuery availablePaymentMethods(AvailablePaymentMethodQueryDefinition queryDef) {
        startField("available_payment_methods");

        _queryBuilder.append('{');
        queryDef.define(new AvailablePaymentMethodQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public CartQuery billingAddress(BillingCartAddressQueryDefinition queryDef) {
        startField("billing_address");

        _queryBuilder.append('{');
        queryDef.define(new BillingCartAddressQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public CartQuery email() {
        startField("email");

        return this;
    }

    /**
     * The entered gift message for the cart
     */
    public CartQuery giftMessage(GiftMessageQueryDefinition queryDef) {
        startField("gift_message");

        _queryBuilder.append('{');
        queryDef.define(new GiftMessageQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Wether customer requested gift receipt for the cart
     */
    public CartQuery giftReceiptIncluded() {
        startField("gift_receipt_included");

        return this;
    }

    /**
     * The selected gift wrapping for the cart
     */
    public CartQuery giftWrapping(GiftWrappingQueryDefinition queryDef) {
        startField("gift_wrapping");

        _queryBuilder.append('{');
        queryDef.define(new GiftWrappingQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The unique ID for a `Cart` object
     */
    public CartQuery id() {
        startField("id");

        return this;
    }

    public CartQuery isVirtual() {
        startField("is_virtual");

        return this;
    }

    public CartQuery items(CartItemInterfaceQueryDefinition queryDef) {
        startField("items");

        _queryBuilder.append('{');
        queryDef.define(new CartItemInterfaceQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public CartQuery prices(CartPricesQueryDefinition queryDef) {
        startField("prices");

        _queryBuilder.append('{');
        queryDef.define(new CartPricesQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Wether customer requested printed card for the cart
     */
    public CartQuery printedCardIncluded() {
        startField("printed_card_included");

        return this;
    }

    public CartQuery selectedPaymentMethod(SelectedPaymentMethodQueryDefinition queryDef) {
        startField("selected_payment_method");

        _queryBuilder.append('{');
        queryDef.define(new SelectedPaymentMethodQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public CartQuery shippingAddresses(ShippingCartAddressQueryDefinition queryDef) {
        startField("shipping_addresses");

        _queryBuilder.append('{');
        queryDef.define(new ShippingCartAddressQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public CartQuery totalQuantity() {
        startField("total_quantity");

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
    public static Fragment<CartQuery> createFragment(String name, CartQueryDefinition queryDef) {
        StringBuilder sb = new StringBuilder();
        queryDef.define(new CartQuery(sb));
        return new Fragment<>(name, "Cart", sb.toString());
    }

    /**
     * Adds a <code>CartQuery</code> fragment reference at the current position of the query.
     * For example for a fragment named <code>test</code>, calling this method will add the
     * reference <code>...test</code> in the query. For GraphQL types implementing an interface, there
     * will be some similar methods using the Query type of each implemented interface.
     * 
     * @param fragment The fragment to reference.
     */
    public CartQuery addFragmentReference(Fragment<CartQuery> fragment) {
        startField("..." + fragment.getName());
        return this;
    }
}

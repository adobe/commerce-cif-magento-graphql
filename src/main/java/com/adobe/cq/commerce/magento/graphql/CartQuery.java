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
     * The ID of the cart.
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
}

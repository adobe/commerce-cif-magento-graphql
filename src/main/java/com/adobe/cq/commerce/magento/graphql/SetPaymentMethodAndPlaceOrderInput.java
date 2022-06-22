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

import java.io.Serializable;

import com.shopify.graphql.support.AbstractQuery;

/**
 * Applies a payment method to the quote.
 */
public class SetPaymentMethodAndPlaceOrderInput implements Serializable {
    private String cartId;

    private PaymentMethodInput paymentMethod;

    public SetPaymentMethodAndPlaceOrderInput(String cartId, PaymentMethodInput paymentMethod) {
        this.cartId = cartId;

        this.paymentMethod = paymentMethod;
    }

    /**
     * The unique ID of a `Cart` object.
     */
    public String getCartId() {
        return cartId;
    }

    /**
     * The unique ID of a `Cart` object.
     */
    public SetPaymentMethodAndPlaceOrderInput setCartId(String cartId) {
        this.cartId = cartId;
        return this;
    }

    /**
     * The payment method data to apply to the cart.
     */
    public PaymentMethodInput getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * The payment method data to apply to the cart.
     */
    public SetPaymentMethodAndPlaceOrderInput setPaymentMethod(PaymentMethodInput paymentMethod) {
        this.paymentMethod = paymentMethod;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("cart_id:");
        AbstractQuery.appendQuotedString(_queryBuilder, cartId.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("payment_method:");
        paymentMethod.appendTo(_queryBuilder);

        _queryBuilder.append('}');
    }
}

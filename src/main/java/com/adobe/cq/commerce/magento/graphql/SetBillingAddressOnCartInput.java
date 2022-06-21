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
 * Sets the billing address.
 */
public class SetBillingAddressOnCartInput implements Serializable {
    private BillingAddressInput billingAddress;

    private String cartId;

    public SetBillingAddressOnCartInput(BillingAddressInput billingAddress, String cartId) {
        this.billingAddress = billingAddress;

        this.cartId = cartId;
    }

    /**
     * The billing address.
     */
    public BillingAddressInput getBillingAddress() {
        return billingAddress;
    }

    /**
     * The billing address.
     */
    public SetBillingAddressOnCartInput setBillingAddress(BillingAddressInput billingAddress) {
        this.billingAddress = billingAddress;
        return this;
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
    public SetBillingAddressOnCartInput setCartId(String cartId) {
        this.cartId = cartId;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("billing_address:");
        billingAddress.appendTo(_queryBuilder);

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("cart_id:");
        AbstractQuery.appendQuotedString(_queryBuilder, cartId.toString());

        _queryBuilder.append('}');
    }
}

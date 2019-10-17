/*******************************************************************************
 *
 *    Copyright 2019 Adobe. All rights reserved.
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

public class PayflowProResponseInput implements Serializable {
    private String cartId;

    private String paypalPayload;

    public PayflowProResponseInput(String cartId, String paypalPayload) {
        this.cartId = cartId;

        this.paypalPayload = paypalPayload;
    }

    public String getCartId() {
        return cartId;
    }

    public PayflowProResponseInput setCartId(String cartId) {
        this.cartId = cartId;
        return this;
    }

    public String getPaypalPayload() {
        return paypalPayload;
    }

    public PayflowProResponseInput setPaypalPayload(String paypalPayload) {
        this.paypalPayload = paypalPayload;
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
        _queryBuilder.append("paypal_payload:");
        AbstractQuery.appendQuotedString(_queryBuilder, paypalPayload.toString());

        _queryBuilder.append('}');
    }
}

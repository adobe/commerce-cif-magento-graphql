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
 * Contains input required to fetch payment token information for the Payflow Pro and Payments Pro
 * payment methods.
 */
public class PayflowProTokenInput implements Serializable {
    private String cartId;

    private PayflowProUrlInput urls;

    public PayflowProTokenInput(String cartId, PayflowProUrlInput urls) {
        this.cartId = cartId;

        this.urls = urls;
    }

    /**
     * The unique ID that identifies the shopper&#39;s cart.
     */
    public String getCartId() {
        return cartId;
    }

    /**
     * The unique ID that identifies the shopper&#39;s cart.
     */
    public PayflowProTokenInput setCartId(String cartId) {
        this.cartId = cartId;
        return this;
    }

    /**
     * A set of relative URLs that PayPal uses for callback.
     */
    public PayflowProUrlInput getUrls() {
        return urls;
    }

    /**
     * A set of relative URLs that PayPal uses for callback.
     */
    public PayflowProTokenInput setUrls(PayflowProUrlInput urls) {
        this.urls = urls;
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
        _queryBuilder.append("urls:");
        urls.appendTo(_queryBuilder);

        _queryBuilder.append('}');
    }
}

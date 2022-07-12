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
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import com.shopify.graphql.support.AbstractQuery;
import com.shopify.graphql.support.Input;

/**
 * Input required to complete payment. Applies to Payflow Pro and Payments Pro payment methods.
 */
public class PayflowProResponseInput implements Serializable {
    private String cartId;

    private String paypalPayload;

    private Map<String, Input<Serializable>> customFilters = new HashMap<>();

    public PayflowProResponseInput(String cartId, String paypalPayload) {
        this.cartId = cartId;

        this.paypalPayload = paypalPayload;
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
    public PayflowProResponseInput setCartId(String cartId) {
        this.cartId = cartId;
        return this;
    }

    /**
     * The payload returned from PayPal.
     */
    public String getPaypalPayload() {
        return paypalPayload;
    }

    /**
     * The payload returned from PayPal.
     */
    public PayflowProResponseInput setPaypalPayload(String paypalPayload) {
        this.paypalPayload = paypalPayload;
        return this;
    }

    /**
     * Set custom filter.
     */
    public PayflowProResponseInput setCustomFilter(String name, Serializable filterInput) {
        this.customFilters.put(name, Input.optional(filterInput));
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (!this.customFilters.isEmpty()) {
            for (Map.Entry<String, Input<Serializable>> entry : customFilters.entrySet()) {
                _queryBuilder.append(separator);
                separator = ",";
                _queryBuilder.append(entry.getKey() + ":");

                Serializable filter = entry.getValue().getValue();

                if (filter != null) {
                    try {
                        Method appendTo = filter.getClass().getMethod("appendTo", StringBuilder.class);
                        appendTo.invoke(filter, _queryBuilder);
                    } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
                        _queryBuilder.append("null");
                    }
                } else {
                    _queryBuilder.append("null");
                }
            }
        }

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

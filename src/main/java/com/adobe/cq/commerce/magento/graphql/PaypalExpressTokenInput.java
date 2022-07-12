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
 * Defines the attributes required to receive a payment token for Express Checkout and Payments
 * Standard payment methods.
 */
public class PaypalExpressTokenInput implements Serializable {
    private String cartId;

    private String code;

    private PaypalExpressUrlsInput urls;

    private Input<Boolean> expressButton = Input.undefined();

    private Input<Boolean> usePaypalCredit = Input.undefined();

    private Map<String, Input<Serializable>> customFilters = new HashMap<>();

    public PaypalExpressTokenInput(String cartId, String code, PaypalExpressUrlsInput urls) {
        this.cartId = cartId;

        this.code = code;

        this.urls = urls;
    }

    /**
     * The unique ID that identifies the customer&#39;s cart
     */
    public String getCartId() {
        return cartId;
    }

    /**
     * The unique ID that identifies the customer&#39;s cart
     */
    public PaypalExpressTokenInput setCartId(String cartId) {
        this.cartId = cartId;
        return this;
    }

    /**
     * Payment method code
     */
    public String getCode() {
        return code;
    }

    /**
     * Payment method code
     */
    public PaypalExpressTokenInput setCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * A set of relative URLs that PayPal uses in response to various actions during the authorization
     * process
     */
    public PaypalExpressUrlsInput getUrls() {
        return urls;
    }

    /**
     * A set of relative URLs that PayPal uses in response to various actions during the authorization
     * process
     */
    public PaypalExpressTokenInput setUrls(PaypalExpressUrlsInput urls) {
        this.urls = urls;
        return this;
    }

    /**
     * Indicates whether the buyer selected the quick checkout button. The default value is false
     */
    public Boolean getExpressButton() {
        return expressButton.getValue();
    }

    /**
     * Indicates whether the buyer selected the quick checkout button. The default value is false
     */
    public Input<Boolean> getExpressButtonInput() {
        return expressButton;
    }

    /**
     * Indicates whether the buyer selected the quick checkout button. The default value is false
     */
    public PaypalExpressTokenInput setExpressButton(Boolean expressButton) {
        this.expressButton = Input.optional(expressButton);
        return this;
    }

    /**
     * Indicates whether the buyer selected the quick checkout button. The default value is false
     */
    public PaypalExpressTokenInput setExpressButtonInput(Input<Boolean> expressButton) {
        if (expressButton == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.expressButton = expressButton;
        return this;
    }

    /**
     * Indicates whether the buyer clicked the PayPal credit button. The default value is false
     */
    public Boolean getUsePaypalCredit() {
        return usePaypalCredit.getValue();
    }

    /**
     * Indicates whether the buyer clicked the PayPal credit button. The default value is false
     */
    public Input<Boolean> getUsePaypalCreditInput() {
        return usePaypalCredit;
    }

    /**
     * Indicates whether the buyer clicked the PayPal credit button. The default value is false
     */
    public PaypalExpressTokenInput setUsePaypalCredit(Boolean usePaypalCredit) {
        this.usePaypalCredit = Input.optional(usePaypalCredit);
        return this;
    }

    /**
     * Indicates whether the buyer clicked the PayPal credit button. The default value is false
     */
    public PaypalExpressTokenInput setUsePaypalCreditInput(Input<Boolean> usePaypalCredit) {
        if (usePaypalCredit == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.usePaypalCredit = usePaypalCredit;
        return this;
    }

    /**
     * Set custom filter.
     */
    public PaypalExpressTokenInput setCustomFilter(String name, Serializable filterInput) {
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
        _queryBuilder.append("code:");
        AbstractQuery.appendQuotedString(_queryBuilder, code.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("urls:");
        urls.appendTo(_queryBuilder);

        if (this.expressButton.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("express_button:");
            if (expressButton.getValue() != null) {
                _queryBuilder.append(expressButton.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.usePaypalCredit.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("use_paypal_credit:");
            if (usePaypalCredit.getValue() != null) {
                _queryBuilder.append(usePaypalCredit.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}

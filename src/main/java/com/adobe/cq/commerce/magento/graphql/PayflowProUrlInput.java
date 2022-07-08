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
 * Contains a set of relative URLs that PayPal uses in response to various actions during the
 * authorization process. Magento prepends the base URL to this value to create a full URL. For
 * example, if the full URL is https://www.example.com/path/to/page.html, the relative URL is
 * path/to/page.html. Use this input for the Payflow Pro and Payment Pro payment methods.
 */
public class PayflowProUrlInput implements Serializable {
    private String cancelUrl;

    private String errorUrl;

    private String returnUrl;

    private Map<String, Input<Serializable>> customFilters = new HashMap<>();

    public PayflowProUrlInput(String cancelUrl, String errorUrl, String returnUrl) {
        this.cancelUrl = cancelUrl;

        this.errorUrl = errorUrl;

        this.returnUrl = returnUrl;
    }

    /**
     * The relative URL of the page that PayPal redirects to when the buyer cancels the transaction in
     * order to choose a different payment method. If the full URL to this page is
     * https://www.example.com/paypal/action/cancel.html, the relative URL is paypal/action/cancel.html.
     */
    public String getCancelUrl() {
        return cancelUrl;
    }

    /**
     * The relative URL of the page that PayPal redirects to when the buyer cancels the transaction in
     * order to choose a different payment method. If the full URL to this page is
     * https://www.example.com/paypal/action/cancel.html, the relative URL is paypal/action/cancel.html.
     */
    public PayflowProUrlInput setCancelUrl(String cancelUrl) {
        this.cancelUrl = cancelUrl;
        return this;
    }

    /**
     * The relative URL of the transaction error page that PayPal redirects to upon payment error. If the
     * full URL to this page is https://www.example.com/paypal/action/error.html, the relative URL is
     * paypal/action/error.html.
     */
    public String getErrorUrl() {
        return errorUrl;
    }

    /**
     * The relative URL of the transaction error page that PayPal redirects to upon payment error. If the
     * full URL to this page is https://www.example.com/paypal/action/error.html, the relative URL is
     * paypal/action/error.html.
     */
    public PayflowProUrlInput setErrorUrl(String errorUrl) {
        this.errorUrl = errorUrl;
        return this;
    }

    /**
     * The relative URL of the final confirmation page that PayPal redirects to upon payment success. If
     * the full URL to this page is https://www.example.com/paypal/action/return.html, the relative URL is
     * paypal/action/return.html.
     */
    public String getReturnUrl() {
        return returnUrl;
    }

    /**
     * The relative URL of the final confirmation page that PayPal redirects to upon payment success. If
     * the full URL to this page is https://www.example.com/paypal/action/return.html, the relative URL is
     * paypal/action/return.html.
     */
    public PayflowProUrlInput setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
        return this;
    }

    /**
     * Set custom filter.
     */
    public PayflowProUrlInput setCustomFilter(String name, Serializable filterInput) {
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
        _queryBuilder.append("cancel_url:");
        AbstractQuery.appendQuotedString(_queryBuilder, cancelUrl.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("error_url:");
        AbstractQuery.appendQuotedString(_queryBuilder, errorUrl.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("return_url:");
        AbstractQuery.appendQuotedString(_queryBuilder, returnUrl.toString());

        _queryBuilder.append('}');
    }
}

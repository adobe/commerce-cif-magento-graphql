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
import com.shopify.graphql.support.Input;

/**
 * A set of relative URLs that PayPal will use in response to various actions during the authorization
 * process. Magento prepends the base URL to this value to create a full URL. For example, if the full
 * URL is https://www.example.com/path/to/page.html, the relative URL is path/to/page.html. Use this
 * input for Express Checkout and Payments Standard payment methods.
 */
public class PaypalExpressUrlsInput implements Serializable {
    private String cancelUrl;

    private String returnUrl;

    private Input<String> pendingUrl = Input.undefined();

    private Input<String> successUrl = Input.undefined();

    public PaypalExpressUrlsInput(String cancelUrl, String returnUrl) {
        this.cancelUrl = cancelUrl;

        this.returnUrl = returnUrl;
    }

    /**
     * The relative URL of the page that PayPal will redirect to when the buyer cancels the transaction in
     * order to choose a different payment method. If the full URL to this page is
     * https://www.example.com/paypal/action/cancel.html, the relative URL is paypal/action/cancel.html.
     */
    public String getCancelUrl() {
        return cancelUrl;
    }

    /**
     * The relative URL of the page that PayPal will redirect to when the buyer cancels the transaction in
     * order to choose a different payment method. If the full URL to this page is
     * https://www.example.com/paypal/action/cancel.html, the relative URL is paypal/action/cancel.html.
     */
    public PaypalExpressUrlsInput setCancelUrl(String cancelUrl) {
        this.cancelUrl = cancelUrl;
        return this;
    }

    /**
     * The relative URL of the final confirmation page that PayPal will redirect to upon payment success.
     * If the full URL to this page is https://www.example.com/paypal/action/return.html, the relative URL
     * is paypal/action/return.html.
     */
    public String getReturnUrl() {
        return returnUrl;
    }

    /**
     * The relative URL of the final confirmation page that PayPal will redirect to upon payment success.
     * If the full URL to this page is https://www.example.com/paypal/action/return.html, the relative URL
     * is paypal/action/return.html.
     */
    public PaypalExpressUrlsInput setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
        return this;
    }

    /**
     * The relative URL of the page that PayPal will redirect to when the payment has been put on hold for
     * additional review. This condition mostly applies to ACH transactions, and is not applicable to most
     * PayPal solutions. If the full URL to this page is
     * https://www.example.com/paypal/action/success_pending.html, the relative URL is
     * paypal/action/success_pending.html.
     */
    public String getPendingUrl() {
        return pendingUrl.getValue();
    }

    /**
     * The relative URL of the page that PayPal will redirect to when the payment has been put on hold for
     * additional review. This condition mostly applies to ACH transactions, and is not applicable to most
     * PayPal solutions. If the full URL to this page is
     * https://www.example.com/paypal/action/success_pending.html, the relative URL is
     * paypal/action/success_pending.html.
     */
    public Input<String> getPendingUrlInput() {
        return pendingUrl;
    }

    /**
     * The relative URL of the page that PayPal will redirect to when the payment has been put on hold for
     * additional review. This condition mostly applies to ACH transactions, and is not applicable to most
     * PayPal solutions. If the full URL to this page is
     * https://www.example.com/paypal/action/success_pending.html, the relative URL is
     * paypal/action/success_pending.html.
     */
    public PaypalExpressUrlsInput setPendingUrl(String pendingUrl) {
        this.pendingUrl = Input.optional(pendingUrl);
        return this;
    }

    /**
     * The relative URL of the page that PayPal will redirect to when the payment has been put on hold for
     * additional review. This condition mostly applies to ACH transactions, and is not applicable to most
     * PayPal solutions. If the full URL to this page is
     * https://www.example.com/paypal/action/success_pending.html, the relative URL is
     * paypal/action/success_pending.html.
     */
    public PaypalExpressUrlsInput setPendingUrlInput(Input<String> pendingUrl) {
        if (pendingUrl == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.pendingUrl = pendingUrl;
        return this;
    }

    /**
     * The relative URL of the order confirmation page that PayPal will redirect to when the payment is
     * successful and additional confirmation is not needed. Not applicable to most PayPal solutions. If
     * the full URL to this page is https://www.example.com/paypal/action/success.html, the relative URL is
     * paypal/action/success.html.
     */
    public String getSuccessUrl() {
        return successUrl.getValue();
    }

    /**
     * The relative URL of the order confirmation page that PayPal will redirect to when the payment is
     * successful and additional confirmation is not needed. Not applicable to most PayPal solutions. If
     * the full URL to this page is https://www.example.com/paypal/action/success.html, the relative URL is
     * paypal/action/success.html.
     */
    public Input<String> getSuccessUrlInput() {
        return successUrl;
    }

    /**
     * The relative URL of the order confirmation page that PayPal will redirect to when the payment is
     * successful and additional confirmation is not needed. Not applicable to most PayPal solutions. If
     * the full URL to this page is https://www.example.com/paypal/action/success.html, the relative URL is
     * paypal/action/success.html.
     */
    public PaypalExpressUrlsInput setSuccessUrl(String successUrl) {
        this.successUrl = Input.optional(successUrl);
        return this;
    }

    /**
     * The relative URL of the order confirmation page that PayPal will redirect to when the payment is
     * successful and additional confirmation is not needed. Not applicable to most PayPal solutions. If
     * the full URL to this page is https://www.example.com/paypal/action/success.html, the relative URL is
     * paypal/action/success.html.
     */
    public PaypalExpressUrlsInput setSuccessUrlInput(Input<String> successUrl) {
        if (successUrl == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.successUrl = successUrl;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("cancel_url:");
        AbstractQuery.appendQuotedString(_queryBuilder, cancelUrl.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("return_url:");
        AbstractQuery.appendQuotedString(_queryBuilder, returnUrl.toString());

        if (this.pendingUrl.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("pending_url:");
            if (pendingUrl.getValue() != null) {
                AbstractQuery.appendQuotedString(_queryBuilder, pendingUrl.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.successUrl.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("success_url:");
            if (successUrl.getValue() != null) {
                AbstractQuery.appendQuotedString(_queryBuilder, successUrl.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}

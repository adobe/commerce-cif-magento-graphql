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
 * A set of relative URLs that PayPal will use in response to various actions during the authorization
 * process. Magento prepends the base URL to this value to create a full URL. For example, if the full
 * URL is https://www.example.com/path/to/page.html, the relative URL is path/to/page.html. Use this
 * input for Payments Pro Hosted Solution payment method.
 */
public class HostedProInput implements Serializable {
    private String cancelUrl;

    private String returnUrl;

    public HostedProInput(String cancelUrl, String returnUrl) {
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
    public HostedProInput setCancelUrl(String cancelUrl) {
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
    public HostedProInput setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
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

        _queryBuilder.append('}');
    }
}

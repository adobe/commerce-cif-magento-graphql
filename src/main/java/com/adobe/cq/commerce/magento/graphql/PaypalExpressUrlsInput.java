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
import com.shopify.graphql.support.Input;

public class PaypalExpressUrlsInput implements Serializable {
    private String cancelUrl;

    private String returnUrl;

    private Input<String> pendingUrl = Input.undefined();

    private Input<String> successUrl = Input.undefined();

    public PaypalExpressUrlsInput(String cancelUrl, String returnUrl) {
        this.cancelUrl = cancelUrl;

        this.returnUrl = returnUrl;
    }

    public String getCancelUrl() {
        return cancelUrl;
    }

    public PaypalExpressUrlsInput setCancelUrl(String cancelUrl) {
        this.cancelUrl = cancelUrl;
        return this;
    }

    public String getReturnUrl() {
        return returnUrl;
    }

    public PaypalExpressUrlsInput setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
        return this;
    }

    public String getPendingUrl() {
        return pendingUrl.getValue();
    }

    public Input<String> getPendingUrlInput() {
        return pendingUrl;
    }

    public PaypalExpressUrlsInput setPendingUrl(String pendingUrl) {
        this.pendingUrl = Input.optional(pendingUrl);
        return this;
    }

    public PaypalExpressUrlsInput setPendingUrlInput(Input<String> pendingUrl) {
        if (pendingUrl == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.pendingUrl = pendingUrl;
        return this;
    }

    public String getSuccessUrl() {
        return successUrl.getValue();
    }

    public Input<String> getSuccessUrlInput() {
        return successUrl;
    }

    public PaypalExpressUrlsInput setSuccessUrl(String successUrl) {
        this.successUrl = Input.optional(successUrl);
        return this;
    }

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

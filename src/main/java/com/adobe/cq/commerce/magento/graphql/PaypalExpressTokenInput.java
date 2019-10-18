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

public class PaypalExpressTokenInput implements Serializable {
    private String cartId;

    private String code;

    private PaypalExpressUrlsInput urls;

    private Input<Boolean> expressButton = Input.undefined();

    private Input<Boolean> usePaypalCredit = Input.undefined();

    public PaypalExpressTokenInput(String cartId, String code, PaypalExpressUrlsInput urls) {
        this.cartId = cartId;

        this.code = code;

        this.urls = urls;
    }

    public String getCartId() {
        return cartId;
    }

    public PaypalExpressTokenInput setCartId(String cartId) {
        this.cartId = cartId;
        return this;
    }

    public String getCode() {
        return code;
    }

    public PaypalExpressTokenInput setCode(String code) {
        this.code = code;
        return this;
    }

    public PaypalExpressUrlsInput getUrls() {
        return urls;
    }

    public PaypalExpressTokenInput setUrls(PaypalExpressUrlsInput urls) {
        this.urls = urls;
        return this;
    }

    public Boolean getExpressButton() {
        return expressButton.getValue();
    }

    public Input<Boolean> getExpressButtonInput() {
        return expressButton;
    }

    public PaypalExpressTokenInput setExpressButton(Boolean expressButton) {
        this.expressButton = Input.optional(expressButton);
        return this;
    }

    public PaypalExpressTokenInput setExpressButtonInput(Input<Boolean> expressButton) {
        if (expressButton == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.expressButton = expressButton;
        return this;
    }

    public Boolean getUsePaypalCredit() {
        return usePaypalCredit.getValue();
    }

    public Input<Boolean> getUsePaypalCreditInput() {
        return usePaypalCredit;
    }

    public PaypalExpressTokenInput setUsePaypalCredit(Boolean usePaypalCredit) {
        this.usePaypalCredit = Input.optional(usePaypalCredit);
        return this;
    }

    public PaypalExpressTokenInput setUsePaypalCreditInput(Input<Boolean> usePaypalCredit) {
        if (usePaypalCredit == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.usePaypalCredit = usePaypalCredit;
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

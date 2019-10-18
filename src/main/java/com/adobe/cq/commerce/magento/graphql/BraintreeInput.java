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

public class BraintreeInput implements Serializable {
    private boolean isActivePaymentTokenEnabler;

    private String paymentMethodNonce;

    private Input<String> deviceData = Input.undefined();

    public BraintreeInput(boolean isActivePaymentTokenEnabler, String paymentMethodNonce) {
        this.isActivePaymentTokenEnabler = isActivePaymentTokenEnabler;

        this.paymentMethodNonce = paymentMethodNonce;
    }

    public boolean getIsActivePaymentTokenEnabler() {
        return isActivePaymentTokenEnabler;
    }

    public BraintreeInput setIsActivePaymentTokenEnabler(boolean isActivePaymentTokenEnabler) {
        this.isActivePaymentTokenEnabler = isActivePaymentTokenEnabler;
        return this;
    }

    public String getPaymentMethodNonce() {
        return paymentMethodNonce;
    }

    public BraintreeInput setPaymentMethodNonce(String paymentMethodNonce) {
        this.paymentMethodNonce = paymentMethodNonce;
        return this;
    }

    public String getDeviceData() {
        return deviceData.getValue();
    }

    public Input<String> getDeviceDataInput() {
        return deviceData;
    }

    public BraintreeInput setDeviceData(String deviceData) {
        this.deviceData = Input.optional(deviceData);
        return this;
    }

    public BraintreeInput setDeviceDataInput(Input<String> deviceData) {
        if (deviceData == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.deviceData = deviceData;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("is_active_payment_token_enabler:");
        _queryBuilder.append(isActivePaymentTokenEnabler);

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("payment_method_nonce:");
        AbstractQuery.appendQuotedString(_queryBuilder, paymentMethodNonce.toString());

        if (this.deviceData.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("device_data:");
            if (deviceData.getValue() != null) {
                AbstractQuery.appendQuotedString(_queryBuilder, deviceData.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}

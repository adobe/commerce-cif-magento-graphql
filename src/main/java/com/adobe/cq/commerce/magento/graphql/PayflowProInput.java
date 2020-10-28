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

import com.shopify.graphql.support.Input;

/**
 * Required input for Payflow Pro and Payments Pro payment methods.
 */
public class PayflowProInput implements Serializable {
    private CreditCardDetailsInput ccDetails;

    private Input<Boolean> isActivePaymentTokenEnabler = Input.undefined();

    public PayflowProInput(CreditCardDetailsInput ccDetails) {
        this.ccDetails = ccDetails;
    }

    /**
     * Required input for credit card related information
     */
    public CreditCardDetailsInput getCcDetails() {
        return ccDetails;
    }

    /**
     * Required input for credit card related information
     */
    public PayflowProInput setCcDetails(CreditCardDetailsInput ccDetails) {
        this.ccDetails = ccDetails;
        return this;
    }

    /**
     * States whether details about the customer&#39;s credit/debit card should be tokenized for later usage.
     * Required only if Vault is enabled for PayPal Payflow Pro payment integration.
     */
    public Boolean getIsActivePaymentTokenEnabler() {
        return isActivePaymentTokenEnabler.getValue();
    }

    /**
     * States whether details about the customer&#39;s credit/debit card should be tokenized for later usage.
     * Required only if Vault is enabled for PayPal Payflow Pro payment integration.
     */
    public Input<Boolean> getIsActivePaymentTokenEnablerInput() {
        return isActivePaymentTokenEnabler;
    }

    /**
     * States whether details about the customer&#39;s credit/debit card should be tokenized for later usage.
     * Required only if Vault is enabled for PayPal Payflow Pro payment integration.
     */
    public PayflowProInput setIsActivePaymentTokenEnabler(Boolean isActivePaymentTokenEnabler) {
        this.isActivePaymentTokenEnabler = Input.optional(isActivePaymentTokenEnabler);
        return this;
    }

    /**
     * States whether details about the customer&#39;s credit/debit card should be tokenized for later usage.
     * Required only if Vault is enabled for PayPal Payflow Pro payment integration.
     */
    public PayflowProInput setIsActivePaymentTokenEnablerInput(Input<Boolean> isActivePaymentTokenEnabler) {
        if (isActivePaymentTokenEnabler == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.isActivePaymentTokenEnabler = isActivePaymentTokenEnabler;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("cc_details:");
        ccDetails.appendTo(_queryBuilder);

        if (this.isActivePaymentTokenEnabler.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("is_active_payment_token_enabler:");
            if (isActivePaymentTokenEnabler.getValue() != null) {
                _queryBuilder.append(isActivePaymentTokenEnabler.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}

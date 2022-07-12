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

import com.shopify.graphql.support.Input;

/**
 * Contains input for the Payflow Pro and Payments Pro payment methods.
 */
public class PayflowProInput implements Serializable {
    private CreditCardDetailsInput ccDetails;

    private Input<Boolean> isActivePaymentTokenEnabler = Input.undefined();

    private Map<String, Input<Serializable>> customFilters = new HashMap<>();

    public PayflowProInput(CreditCardDetailsInput ccDetails) {
        this.ccDetails = ccDetails;
    }

    /**
     * Required input for credit card related information.
     */
    public CreditCardDetailsInput getCcDetails() {
        return ccDetails;
    }

    /**
     * Required input for credit card related information.
     */
    public PayflowProInput setCcDetails(CreditCardDetailsInput ccDetails) {
        this.ccDetails = ccDetails;
        return this;
    }

    /**
     * Indicates whether details about the shopper&#39;s credit/debit card should be tokenized for later usage.
     * Required only if Vault is enabled for the PayPal Payflow Pro payment integration.
     */
    public Boolean getIsActivePaymentTokenEnabler() {
        return isActivePaymentTokenEnabler.getValue();
    }

    /**
     * Indicates whether details about the shopper&#39;s credit/debit card should be tokenized for later usage.
     * Required only if Vault is enabled for the PayPal Payflow Pro payment integration.
     */
    public Input<Boolean> getIsActivePaymentTokenEnablerInput() {
        return isActivePaymentTokenEnabler;
    }

    /**
     * Indicates whether details about the shopper&#39;s credit/debit card should be tokenized for later usage.
     * Required only if Vault is enabled for the PayPal Payflow Pro payment integration.
     */
    public PayflowProInput setIsActivePaymentTokenEnabler(Boolean isActivePaymentTokenEnabler) {
        this.isActivePaymentTokenEnabler = Input.optional(isActivePaymentTokenEnabler);
        return this;
    }

    /**
     * Indicates whether details about the shopper&#39;s credit/debit card should be tokenized for later usage.
     * Required only if Vault is enabled for the PayPal Payflow Pro payment integration.
     */
    public PayflowProInput setIsActivePaymentTokenEnablerInput(Input<Boolean> isActivePaymentTokenEnabler) {
        if (isActivePaymentTokenEnabler == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.isActivePaymentTokenEnabler = isActivePaymentTokenEnabler;
        return this;
    }

    /**
     * Set custom filter.
     */
    public PayflowProInput setCustomFilter(String name, Serializable filterInput) {
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

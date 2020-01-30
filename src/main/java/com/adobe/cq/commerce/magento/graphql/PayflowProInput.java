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

/**
 * Required input for Payflow Pro and Payments Pro payment methods.
 */
public class PayflowProInput implements Serializable {
    private CreditCardDetailsInput ccDetails;

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

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("cc_details:");
        ccDetails.appendTo(_queryBuilder);

        _queryBuilder.append('}');
    }
}
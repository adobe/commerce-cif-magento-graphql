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

import java.util.Map;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;

/**
 * Contains company credit balances and limits.
 */
public class CompanyCredit extends AbstractResponse<CompanyCredit> {
    public CompanyCredit() {}

    public CompanyCredit(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "available_credit": {
                    responseData.put(key, new Money(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "credit_limit": {
                    responseData.put(key, new Money(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "outstanding_balance": {
                    responseData.put(key, new Money(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "__typename": {
                    responseData.put(key, jsonAsString(field.getValue(), key));
                    break;
                }

                default: {
                    readCustomField(fieldName, field.getValue());
                }
            }
        }
    }

    public String getGraphQlTypeName() {
        return "CompanyCredit";
    }

    /**
     * The sum of the credit limit and the outstanding balance. If the company has exceeded the credit
     * limit, the amount is as a negative value.
     */
    public Money getAvailableCredit() {
        return (Money) get("available_credit");
    }

    public CompanyCredit setAvailableCredit(Money arg) {
        optimisticData.put(getKey("available_credit"), arg);
        return this;
    }

    /**
     * The amount of credit extended to the company.
     */
    public Money getCreditLimit() {
        return (Money) get("credit_limit");
    }

    public CompanyCredit setCreditLimit(Money arg) {
        optimisticData.put(getKey("credit_limit"), arg);
        return this;
    }

    /**
     * The amount reimbursed, less the total due from all orders placed using the Payment on Account
     * payment method. The amount can be a positive or negative value.
     */
    public Money getOutstandingBalance() {
        return (Money) get("outstanding_balance");
    }

    public CompanyCredit setOutstandingBalance(Money arg) {
        optimisticData.put(getKey("outstanding_balance"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "available_credit":
                return true;

            case "credit_limit":
                return true;

            case "outstanding_balance":
                return true;

            default:
                return false;
        }
    }
}

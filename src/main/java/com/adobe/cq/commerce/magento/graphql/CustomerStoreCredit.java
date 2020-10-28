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
 * Contains store credit information with balance and history
 */
public class CustomerStoreCredit extends AbstractResponse<CustomerStoreCredit> {
    public CustomerStoreCredit() {
    }

    public CustomerStoreCredit(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "balance_history": {
                    CustomerStoreCreditHistory optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CustomerStoreCreditHistory(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "current_balance": {
                    Money optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Money(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "enabled": {
                    Boolean optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsBoolean(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

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
        return "CustomerStoreCredit";
    }

    /**
     * Customer Store credit balance history. If the history or store credit feature is disabled, then a
     * null value will be returned.
     */
    public CustomerStoreCreditHistory getBalanceHistory() {
        return (CustomerStoreCreditHistory) get("balance_history");
    }

    public CustomerStoreCredit setBalanceHistory(CustomerStoreCreditHistory arg) {
        optimisticData.put(getKey("balance_history"), arg);
        return this;
    }

    /**
     * Current balance on store credit
     */
    public Money getCurrentBalance() {
        return (Money) get("current_balance");
    }

    public CustomerStoreCredit setCurrentBalance(Money arg) {
        optimisticData.put(getKey("current_balance"), arg);
        return this;
    }

    /**
     * Indicates whether store credits are enabled. If the feature is disabled, then the balance will not
     * be returned
     */
    public Boolean getEnabled() {
        return (Boolean) get("enabled");
    }

    public CustomerStoreCredit setEnabled(Boolean arg) {
        optimisticData.put(getKey("enabled"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "balance_history": return true;

            case "current_balance": return true;

            case "enabled": return false;

            default: return false;
        }
    }
}

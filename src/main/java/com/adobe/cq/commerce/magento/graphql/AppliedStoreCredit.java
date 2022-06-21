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
 * Contains the applied and current balances.
 */
public class AppliedStoreCredit extends AbstractResponse<AppliedStoreCredit> {
    public AppliedStoreCredit() {}

    public AppliedStoreCredit(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "applied_balance": {
                    Money optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Money(jsonAsObject(field.getValue(), key));
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
        return "AppliedStoreCredit";
    }

    /**
     * The applied store credit balance to the current cart.
     */
    public Money getAppliedBalance() {
        return (Money) get("applied_balance");
    }

    public AppliedStoreCredit setAppliedBalance(Money arg) {
        optimisticData.put(getKey("applied_balance"), arg);
        return this;
    }

    /**
     * The current balance remaining on store credit.
     */
    public Money getCurrentBalance() {
        return (Money) get("current_balance");
    }

    public AppliedStoreCredit setCurrentBalance(Money arg) {
        optimisticData.put(getKey("current_balance"), arg);
        return this;
    }

    /**
     * Indicates whether store credits are enabled. If the feature is disabled, then the current balance
     * will not be returned.
     */
    public Boolean getEnabled() {
        return (Boolean) get("enabled");
    }

    public AppliedStoreCredit setEnabled(Boolean arg) {
        optimisticData.put(getKey("enabled"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "applied_balance":
                return true;

            case "current_balance":
                return true;

            case "enabled":
                return false;

            default:
                return false;
        }
    }
}

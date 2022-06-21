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
 * Contains store credit history information.
 */
public class CustomerStoreCreditHistoryItem extends AbstractResponse<CustomerStoreCreditHistoryItem> {
    public CustomerStoreCreditHistoryItem() {}

    public CustomerStoreCreditHistoryItem(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "action": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "actual_balance": {
                    Money optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Money(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "balance_change": {
                    Money optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Money(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "date_time_changed": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
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
        return "CustomerStoreCreditHistoryItem";
    }

    /**
     * The action that was made on the store credit.
     */
    public String getAction() {
        return (String) get("action");
    }

    public CustomerStoreCreditHistoryItem setAction(String arg) {
        optimisticData.put(getKey("action"), arg);
        return this;
    }

    /**
     * The store credit available to the customer as a result of this action.
     */
    public Money getActualBalance() {
        return (Money) get("actual_balance");
    }

    public CustomerStoreCreditHistoryItem setActualBalance(Money arg) {
        optimisticData.put(getKey("actual_balance"), arg);
        return this;
    }

    /**
     * The amount added to or subtracted from the store credit as a result of this action.
     */
    public Money getBalanceChange() {
        return (Money) get("balance_change");
    }

    public CustomerStoreCreditHistoryItem setBalanceChange(Money arg) {
        optimisticData.put(getKey("balance_change"), arg);
        return this;
    }

    /**
     * The date and time when the store credit change was made.
     */
    public String getDateTimeChanged() {
        return (String) get("date_time_changed");
    }

    public CustomerStoreCreditHistoryItem setDateTimeChanged(String arg) {
        optimisticData.put(getKey("date_time_changed"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "action":
                return false;

            case "actual_balance":
                return true;

            case "balance_change":
                return true;

            case "date_time_changed":
                return false;

            default:
                return false;
        }
    }
}

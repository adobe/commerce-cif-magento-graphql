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

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;

/**
 * Contains details about a customer&#39;s reward points.
 */
public class RewardPoints extends AbstractResponse<RewardPoints> {
    public RewardPoints() {}

    public RewardPoints(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "balance": {
                    RewardPointsAmount optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new RewardPointsAmount(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "balance_history": {
                    List<RewardPointsBalanceHistoryItem> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<RewardPointsBalanceHistoryItem> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            RewardPointsBalanceHistoryItem optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new RewardPointsBalanceHistoryItem(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "exchange_rates": {
                    RewardPointsExchangeRates optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new RewardPointsExchangeRates(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "subscription_status": {
                    RewardPointsSubscriptionStatus optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new RewardPointsSubscriptionStatus(jsonAsObject(field.getValue(), key));
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
        return "RewardPoints";
    }

    /**
     * The current balance of reward points.
     */
    public RewardPointsAmount getBalance() {
        return (RewardPointsAmount) get("balance");
    }

    public RewardPoints setBalance(RewardPointsAmount arg) {
        optimisticData.put(getKey("balance"), arg);
        return this;
    }

    /**
     * The balance history of reward points. If the ability for customers to view the balance history has
     * been disabled in the Admin, this field will be set to null.
     */
    public List<RewardPointsBalanceHistoryItem> getBalanceHistory() {
        return (List<RewardPointsBalanceHistoryItem>) get("balance_history");
    }

    public RewardPoints setBalanceHistory(List<RewardPointsBalanceHistoryItem> arg) {
        optimisticData.put(getKey("balance_history"), arg);
        return this;
    }

    /**
     * The current exchange rates for reward points.
     */
    public RewardPointsExchangeRates getExchangeRates() {
        return (RewardPointsExchangeRates) get("exchange_rates");
    }

    public RewardPoints setExchangeRates(RewardPointsExchangeRates arg) {
        optimisticData.put(getKey("exchange_rates"), arg);
        return this;
    }

    /**
     * The subscription status of emails related to reward points.
     */
    public RewardPointsSubscriptionStatus getSubscriptionStatus() {
        return (RewardPointsSubscriptionStatus) get("subscription_status");
    }

    public RewardPoints setSubscriptionStatus(RewardPointsSubscriptionStatus arg) {
        optimisticData.put(getKey("subscription_status"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "balance":
                return true;

            case "balance_history":
                return true;

            case "exchange_rates":
                return true;

            case "subscription_status":
                return true;

            default:
                return false;
        }
    }
}

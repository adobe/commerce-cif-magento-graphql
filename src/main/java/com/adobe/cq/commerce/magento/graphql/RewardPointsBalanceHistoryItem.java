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

public class RewardPointsBalanceHistoryItem extends AbstractResponse<RewardPointsBalanceHistoryItem> {
    public RewardPointsBalanceHistoryItem() {}

    public RewardPointsBalanceHistoryItem(JsonObject fields) throws SchemaViolationError {
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

                case "change_reason": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "date": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "points_change": {
                    responseData.put(key, jsonAsDouble(field.getValue(), key));

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
        return "RewardPointsBalanceHistoryItem";
    }

    /**
     * Reward points balance after the completion of the transaction
     */
    public RewardPointsAmount getBalance() {
        return (RewardPointsAmount) get("balance");
    }

    public RewardPointsBalanceHistoryItem setBalance(RewardPointsAmount arg) {
        optimisticData.put(getKey("balance"), arg);
        return this;
    }

    /**
     * The reason the balance changed
     */
    public String getChangeReason() {
        return (String) get("change_reason");
    }

    public RewardPointsBalanceHistoryItem setChangeReason(String arg) {
        optimisticData.put(getKey("change_reason"), arg);
        return this;
    }

    /**
     * Transaction date
     */
    public String getDate() {
        return (String) get("date");
    }

    public RewardPointsBalanceHistoryItem setDate(String arg) {
        optimisticData.put(getKey("date"), arg);
        return this;
    }

    /**
     * The number of points added or deducted in the transaction
     */
    public Double getPointsChange() {
        return (Double) get("points_change");
    }

    public RewardPointsBalanceHistoryItem setPointsChange(Double arg) {
        optimisticData.put(getKey("points_change"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "balance":
                return true;

            case "change_reason":
                return false;

            case "date":
                return false;

            case "points_change":
                return false;

            default:
                return false;
        }
    }
}

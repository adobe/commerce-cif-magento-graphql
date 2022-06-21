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
 * Contains details about customer&#39;s reward points rate.
 */
public class RewardPointsRate extends AbstractResponse<RewardPointsRate> {
    public RewardPointsRate() {}

    public RewardPointsRate(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "currency_amount": {
                    responseData.put(key, jsonAsDouble(field.getValue(), key));

                    break;
                }

                case "points": {
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
        return "RewardPointsRate";
    }

    /**
     * The money value for the exchange rate. For earnings, this is the amount spent to earn the specified
     * points. For redemption, this is the amount of money the number of points represents.
     */
    public Double getCurrencyAmount() {
        return (Double) get("currency_amount");
    }

    public RewardPointsRate setCurrencyAmount(Double arg) {
        optimisticData.put(getKey("currency_amount"), arg);
        return this;
    }

    /**
     * The number of points for an exchange rate. For earnings, this is the number of points earned. For
     * redemption, this is the number of points needed for redemption.
     */
    public Double getPoints() {
        return (Double) get("points");
    }

    public RewardPointsRate setPoints(Double arg) {
        optimisticData.put(getKey("points"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "currency_amount":
                return false;

            case "points":
                return false;

            default:
                return false;
        }
    }
}

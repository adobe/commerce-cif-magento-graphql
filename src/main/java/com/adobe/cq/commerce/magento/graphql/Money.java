/*******************************************************************************
 *
 *    Copyright 2019 Adobe. All rights reserved.
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
 * A Money object defines a monetary value, including a numeric value and a currency code.
 */
public class Money extends AbstractResponse<Money> {
    public Money() {
    }

    public Money(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "currency": {
                    CurrencyEnum optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = CurrencyEnum.fromGraphQl(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "value": {
                    Double optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsDouble(field.getValue(), key);
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
        return "Money";
    }

    /**
     * A three-letter currency code, such as USD or EUR
     */

    public CurrencyEnum getCurrency() {
        return (CurrencyEnum) get("currency");
    }

    public Money setCurrency(CurrencyEnum arg) {
        optimisticData.put(getKey("currency"), arg);
        return this;
    }

    /**
     * A number expressing a monetary value
     */

    public Double getValue() {
        return (Double) get("value");
    }

    public Money setValue(Double arg) {
        optimisticData.put(getKey("value"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "currency": return false;

            case "value": return false;

            default: return false;
        }
    }
}


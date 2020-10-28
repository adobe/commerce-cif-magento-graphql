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
 * Contains details about the gift card account
 */
public class GiftCardAccount extends AbstractResponse<GiftCardAccount> {
    public GiftCardAccount() {}

    public GiftCardAccount(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "balance": {
                    Money optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Money(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "code": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "expiration_date": {
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
        return "GiftCardAccount";
    }

    /**
     * Balance remaining on gift card
     */
    public Money getBalance() {
        return (Money) get("balance");
    }

    public GiftCardAccount setBalance(Money arg) {
        optimisticData.put(getKey("balance"), arg);
        return this;
    }

    /**
     * Gift card account code
     */
    public String getCode() {
        return (String) get("code");
    }

    public GiftCardAccount setCode(String arg) {
        optimisticData.put(getKey("code"), arg);
        return this;
    }

    /**
     * Gift card expiration date
     */
    public String getExpirationDate() {
        return (String) get("expiration_date");
    }

    public GiftCardAccount setExpirationDate(String arg) {
        optimisticData.put(getKey("expiration_date"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "balance":
                return true;

            case "code":
                return false;

            case "expiration_date":
                return false;

            default:
                return false;
        }
    }
}

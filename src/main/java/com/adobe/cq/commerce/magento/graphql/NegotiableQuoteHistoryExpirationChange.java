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
 * Contains a new expiration date and the previous date.
 */
public class NegotiableQuoteHistoryExpirationChange extends AbstractResponse<NegotiableQuoteHistoryExpirationChange> {
    public NegotiableQuoteHistoryExpirationChange() {}

    public NegotiableQuoteHistoryExpirationChange(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "new_expiration": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "old_expiration": {
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
        return "NegotiableQuoteHistoryExpirationChange";
    }

    /**
     * The expiration date after the change. The value will be &#39;null&#39; if not set.
     */
    public String getNewExpiration() {
        return (String) get("new_expiration");
    }

    public NegotiableQuoteHistoryExpirationChange setNewExpiration(String arg) {
        optimisticData.put(getKey("new_expiration"), arg);
        return this;
    }

    /**
     * The previous expiration date. The value will be &#39;null&#39; if not previously set.
     */
    public String getOldExpiration() {
        return (String) get("old_expiration");
    }

    public NegotiableQuoteHistoryExpirationChange setOldExpiration(String arg) {
        optimisticData.put(getKey("old_expiration"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "new_expiration":
                return false;

            case "old_expiration":
                return false;

            default:
                return false;
        }
    }
}

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
 * Contains the text of a gift message, its sender, and recipient
 */
public class GiftMessage extends AbstractResponse<GiftMessage> {
    public GiftMessage() {}

    public GiftMessage(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "from": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "message": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "to": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

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
        return "GiftMessage";
    }

    /**
     * Sender name
     */
    public String getFrom() {
        return (String) get("from");
    }

    public GiftMessage setFrom(String arg) {
        optimisticData.put(getKey("from"), arg);
        return this;
    }

    /**
     * Gift message text
     */
    public String getMessage() {
        return (String) get("message");
    }

    public GiftMessage setMessage(String arg) {
        optimisticData.put(getKey("message"), arg);
        return this;
    }

    /**
     * Recipient name
     */
    public String getTo() {
        return (String) get("to");
    }

    public GiftMessage setTo(String arg) {
        optimisticData.put(getKey("to"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "from":
                return false;

            case "message":
                return false;

            case "to":
                return false;

            default:
                return false;
        }
    }
}

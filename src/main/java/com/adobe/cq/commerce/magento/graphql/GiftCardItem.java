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

public class GiftCardItem extends AbstractResponse<GiftCardItem> {
    public GiftCardItem() {}

    public GiftCardItem(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "message": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "recipient_email": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "recipient_name": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "sender_email": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "sender_name": {
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
        return "GiftCardItem";
    }

    /**
     * Entered gift card message intended for the recipient
     */
    public String getMessage() {
        return (String) get("message");
    }

    public GiftCardItem setMessage(String arg) {
        optimisticData.put(getKey("message"), arg);
        return this;
    }

    /**
     * Entered gift card recipient email for virtual cards
     */
    public String getRecipientEmail() {
        return (String) get("recipient_email");
    }

    public GiftCardItem setRecipientEmail(String arg) {
        optimisticData.put(getKey("recipient_email"), arg);
        return this;
    }

    /**
     * Entered gift card sender namefor physical and virtual cards
     */
    public String getRecipientName() {
        return (String) get("recipient_name");
    }

    public GiftCardItem setRecipientName(String arg) {
        optimisticData.put(getKey("recipient_name"), arg);
        return this;
    }

    /**
     * Entered gift card sender email for virtual cards
     */
    public String getSenderEmail() {
        return (String) get("sender_email");
    }

    public GiftCardItem setSenderEmail(String arg) {
        optimisticData.put(getKey("sender_email"), arg);
        return this;
    }

    /**
     * Entered gift card sender name for physical and virtual cards
     */
    public String getSenderName() {
        return (String) get("sender_name");
    }

    public GiftCardItem setSenderName(String arg) {
        optimisticData.put(getKey("sender_name"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "message":
                return false;

            case "recipient_email":
                return false;

            case "recipient_name":
                return false;

            case "sender_email":
                return false;

            case "sender_name":
                return false;

            default:
                return false;
        }
    }
}

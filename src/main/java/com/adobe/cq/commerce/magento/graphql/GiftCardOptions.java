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
 * Contains details about the sender, recipient, and amount of a gift card.
 */
public class GiftCardOptions extends AbstractResponse<GiftCardOptions> {
    public GiftCardOptions() {}

    public GiftCardOptions(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "amount": {
                    Money optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Money(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "custom_giftcard_amount": {
                    Money optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Money(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

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
        return "GiftCardOptions";
    }

    /**
     * The amount and currency of the gift card.
     */
    public Money getAmount() {
        return (Money) get("amount");
    }

    public GiftCardOptions setAmount(Money arg) {
        optimisticData.put(getKey("amount"), arg);
        return this;
    }

    /**
     * The custom amount and currency of the gift card.
     */
    public Money getCustomGiftcardAmount() {
        return (Money) get("custom_giftcard_amount");
    }

    public GiftCardOptions setCustomGiftcardAmount(Money arg) {
        optimisticData.put(getKey("custom_giftcard_amount"), arg);
        return this;
    }

    /**
     * A message to the recipient.
     */
    public String getMessage() {
        return (String) get("message");
    }

    public GiftCardOptions setMessage(String arg) {
        optimisticData.put(getKey("message"), arg);
        return this;
    }

    /**
     * The email address of the person receiving the gift card.
     */
    public String getRecipientEmail() {
        return (String) get("recipient_email");
    }

    public GiftCardOptions setRecipientEmail(String arg) {
        optimisticData.put(getKey("recipient_email"), arg);
        return this;
    }

    /**
     * The name of the person receiving the gift card.
     */
    public String getRecipientName() {
        return (String) get("recipient_name");
    }

    public GiftCardOptions setRecipientName(String arg) {
        optimisticData.put(getKey("recipient_name"), arg);
        return this;
    }

    /**
     * The email address of the person sending the gift card.
     */
    public String getSenderEmail() {
        return (String) get("sender_email");
    }

    public GiftCardOptions setSenderEmail(String arg) {
        optimisticData.put(getKey("sender_email"), arg);
        return this;
    }

    /**
     * The name of the person sending the gift card.
     */
    public String getSenderName() {
        return (String) get("sender_name");
    }

    public GiftCardOptions setSenderName(String arg) {
        optimisticData.put(getKey("sender_name"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "amount":
                return true;

            case "custom_giftcard_amount":
                return true;

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

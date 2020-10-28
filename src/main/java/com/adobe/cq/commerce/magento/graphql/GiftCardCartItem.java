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
 * Contains details about a gift card
 */
public class GiftCardCartItem extends AbstractResponse<GiftCardCartItem> implements CartItemInterface {
    public GiftCardCartItem() {
    }

    public GiftCardCartItem(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "amount": {
                    responseData.put(key, new Money(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "customizable_options": {
                    List<SelectedCustomizableOption> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<SelectedCustomizableOption> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            SelectedCustomizableOption optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new SelectedCustomizableOption(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "id": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

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

                case "prices": {
                    CartItemPrices optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CartItemPrices(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "product": {
                    responseData.put(key, UnknownProductInterface.create(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "quantity": {
                    responseData.put(key, jsonAsDouble(field.getValue(), key));

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
                    responseData.put(key, jsonAsString(field.getValue(), key));

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
        return "GiftCardCartItem";
    }

    /**
     * The amount and currency of the gift card
     */
    public Money getAmount() {
        return (Money) get("amount");
    }

    public GiftCardCartItem setAmount(Money arg) {
        optimisticData.put(getKey("amount"), arg);
        return this;
    }

    /**
     * An array of customizations made to the gift card
     */
    public List<SelectedCustomizableOption> getCustomizableOptions() {
        return (List<SelectedCustomizableOption>) get("customizable_options");
    }

    public GiftCardCartItem setCustomizableOptions(List<SelectedCustomizableOption> arg) {
        optimisticData.put(getKey("customizable_options"), arg);
        return this;
    }

    public String getId() {
        return (String) get("id");
    }

    public GiftCardCartItem setId(String arg) {
        optimisticData.put(getKey("id"), arg);
        return this;
    }

    /**
     * A message to the recipient
     */
    public String getMessage() {
        return (String) get("message");
    }

    public GiftCardCartItem setMessage(String arg) {
        optimisticData.put(getKey("message"), arg);
        return this;
    }

    public CartItemPrices getPrices() {
        return (CartItemPrices) get("prices");
    }

    public GiftCardCartItem setPrices(CartItemPrices arg) {
        optimisticData.put(getKey("prices"), arg);
        return this;
    }

    public ProductInterface getProduct() {
        return (ProductInterface) get("product");
    }

    public GiftCardCartItem setProduct(ProductInterface arg) {
        optimisticData.put(getKey("product"), arg);
        return this;
    }

    public Double getQuantity() {
        return (Double) get("quantity");
    }

    public GiftCardCartItem setQuantity(Double arg) {
        optimisticData.put(getKey("quantity"), arg);
        return this;
    }

    /**
     * The email of the person receiving the gift card
     */
    public String getRecipientEmail() {
        return (String) get("recipient_email");
    }

    public GiftCardCartItem setRecipientEmail(String arg) {
        optimisticData.put(getKey("recipient_email"), arg);
        return this;
    }

    /**
     * The name of the person receiving the gift card
     */
    public String getRecipientName() {
        return (String) get("recipient_name");
    }

    public GiftCardCartItem setRecipientName(String arg) {
        optimisticData.put(getKey("recipient_name"), arg);
        return this;
    }

    /**
     * The email of the sender
     */
    public String getSenderEmail() {
        return (String) get("sender_email");
    }

    public GiftCardCartItem setSenderEmail(String arg) {
        optimisticData.put(getKey("sender_email"), arg);
        return this;
    }

    /**
     * The name of the sender
     */
    public String getSenderName() {
        return (String) get("sender_name");
    }

    public GiftCardCartItem setSenderName(String arg) {
        optimisticData.put(getKey("sender_name"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "amount": return true;

            case "customizable_options": return true;

            case "id": return false;

            case "message": return false;

            case "prices": return true;

            case "product": return false;

            case "quantity": return false;

            case "recipient_email": return false;

            case "recipient_name": return false;

            case "sender_email": return false;

            case "sender_name": return false;

            default: return false;
        }
    }
}

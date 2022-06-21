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
 * Contains prices for gift wrapping options.
 */
public class GiftOptionsPrices extends AbstractResponse<GiftOptionsPrices> {
    public GiftOptionsPrices() {}

    public GiftOptionsPrices(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "gift_wrapping_for_items": {
                    Money optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Money(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "gift_wrapping_for_order": {
                    Money optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Money(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "printed_card": {
                    Money optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Money(jsonAsObject(field.getValue(), key));
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
        return "GiftOptionsPrices";
    }

    /**
     * Price of the gift wrapping for all individual order items.
     */
    public Money getGiftWrappingForItems() {
        return (Money) get("gift_wrapping_for_items");
    }

    public GiftOptionsPrices setGiftWrappingForItems(Money arg) {
        optimisticData.put(getKey("gift_wrapping_for_items"), arg);
        return this;
    }

    /**
     * Price of the gift wrapping for the whole order.
     */
    public Money getGiftWrappingForOrder() {
        return (Money) get("gift_wrapping_for_order");
    }

    public GiftOptionsPrices setGiftWrappingForOrder(Money arg) {
        optimisticData.put(getKey("gift_wrapping_for_order"), arg);
        return this;
    }

    /**
     * Price for the printed card.
     */
    public Money getPrintedCard() {
        return (Money) get("printed_card");
    }

    public GiftOptionsPrices setPrintedCard(Money arg) {
        optimisticData.put(getKey("printed_card"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "gift_wrapping_for_items":
                return true;

            case "gift_wrapping_for_order":
                return true;

            case "printed_card":
                return true;

            default:
                return false;
        }
    }
}

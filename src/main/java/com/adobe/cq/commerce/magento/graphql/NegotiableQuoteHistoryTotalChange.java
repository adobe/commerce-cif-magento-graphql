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
 * Contains a new price and the previous price.
 */
public class NegotiableQuoteHistoryTotalChange extends AbstractResponse<NegotiableQuoteHistoryTotalChange> {
    public NegotiableQuoteHistoryTotalChange() {}

    public NegotiableQuoteHistoryTotalChange(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "new_price": {
                    Money optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Money(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "old_price": {
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
        return "NegotiableQuoteHistoryTotalChange";
    }

    /**
     * The total price as a result of the change.
     */
    public Money getNewPrice() {
        return (Money) get("new_price");
    }

    public NegotiableQuoteHistoryTotalChange setNewPrice(Money arg) {
        optimisticData.put(getKey("new_price"), arg);
        return this;
    }

    /**
     * The previous total price on the negotiable quote.
     */
    public Money getOldPrice() {
        return (Money) get("old_price");
    }

    public NegotiableQuoteHistoryTotalChange setOldPrice(Money arg) {
        optimisticData.put(getKey("old_price"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "new_price":
                return true;

            case "old_price":
                return true;

            default:
                return false;
        }
    }
}

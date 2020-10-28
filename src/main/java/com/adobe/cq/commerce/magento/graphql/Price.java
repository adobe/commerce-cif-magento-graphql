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
 * Price is deprecated, replaced by ProductPrice. The Price object defines the price of a product as
 * well as any tax-related adjustments.
 */
public class Price extends AbstractResponse<Price> {
    public Price() {}

    public Price(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "adjustments": {
                    List<PriceAdjustment> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<PriceAdjustment> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            PriceAdjustment optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new PriceAdjustment(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "amount": {
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
        return "Price";
    }

    /**
     * An array that provides information about tax, weee, or weee_tax adjustments.
     *
     * @deprecated Price is deprecated, use ProductPrice.
     */
    @Deprecated
    public List<PriceAdjustment> getAdjustments() {
        return (List<PriceAdjustment>) get("adjustments");
    }

    public Price setAdjustments(List<PriceAdjustment> arg) {
        optimisticData.put(getKey("adjustments"), arg);
        return this;
    }

    /**
     * The price of a product plus a three-letter currency code.
     *
     * @deprecated Price is deprecated, use ProductPrice.
     */
    @Deprecated
    public Money getAmount() {
        return (Money) get("amount");
    }

    public Price setAmount(Money arg) {
        optimisticData.put(getKey("amount"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "adjustments":
                return true;

            case "amount":
                return true;

            default:
                return false;
        }
    }
}

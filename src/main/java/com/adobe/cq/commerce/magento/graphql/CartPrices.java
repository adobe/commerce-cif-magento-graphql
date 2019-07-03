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

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;

/**
 * 
 */
public class CartPrices extends AbstractResponse<CartPrices> {
    public CartPrices() {
    }

    public CartPrices(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "applied_taxes": {
                    List<CartTaxItem> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<CartTaxItem> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            CartTaxItem optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new CartTaxItem(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "grand_total": {
                    Money optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Money(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "subtotal_excluding_tax": {
                    Money optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Money(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "subtotal_including_tax": {
                    Money optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Money(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "subtotal_with_discount_excluding_tax": {
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
                    throw new SchemaViolationError(this, key, field.getValue());
                }
            }
        }
    }

    public String getGraphQlTypeName() {
        return "CartPrices";
    }

    public List<CartTaxItem> getAppliedTaxes() {
        return (List<CartTaxItem>) get("applied_taxes");
    }

    public CartPrices setAppliedTaxes(List<CartTaxItem> arg) {
        optimisticData.put(getKey("applied_taxes"), arg);
        return this;
    }

    public Money getGrandTotal() {
        return (Money) get("grand_total");
    }

    public CartPrices setGrandTotal(Money arg) {
        optimisticData.put(getKey("grand_total"), arg);
        return this;
    }

    public Money getSubtotalExcludingTax() {
        return (Money) get("subtotal_excluding_tax");
    }

    public CartPrices setSubtotalExcludingTax(Money arg) {
        optimisticData.put(getKey("subtotal_excluding_tax"), arg);
        return this;
    }

    public Money getSubtotalIncludingTax() {
        return (Money) get("subtotal_including_tax");
    }

    public CartPrices setSubtotalIncludingTax(Money arg) {
        optimisticData.put(getKey("subtotal_including_tax"), arg);
        return this;
    }

    public Money getSubtotalWithDiscountExcludingTax() {
        return (Money) get("subtotal_with_discount_excluding_tax");
    }

    public CartPrices setSubtotalWithDiscountExcludingTax(Money arg) {
        optimisticData.put(getKey("subtotal_with_discount_excluding_tax"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "applied_taxes": return true;

            case "grand_total": return true;

            case "subtotal_excluding_tax": return true;

            case "subtotal_including_tax": return true;

            case "subtotal_with_discount_excluding_tax": return true;

            default: return false;
        }
    }
}


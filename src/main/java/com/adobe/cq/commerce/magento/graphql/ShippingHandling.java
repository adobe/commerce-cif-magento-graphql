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
 * The Shipping handling details
 */
public class ShippingHandling extends AbstractResponse<ShippingHandling> {
    public ShippingHandling() {
    }

    public ShippingHandling(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "amount_excluding_tax": {
                    Money optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Money(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "amount_including_tax": {
                    Money optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Money(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "discounts": {
                    List<ShippingDiscount> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<ShippingDiscount> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            ShippingDiscount optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new ShippingDiscount(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "taxes": {
                    List<TaxItem> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<TaxItem> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            TaxItem optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new TaxItem(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "total_amount": {
                    responseData.put(key, new Money(jsonAsObject(field.getValue(), key)));

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
        return "ShippingHandling";
    }

    /**
     * The shipping amount, excluding tax
     */
    public Money getAmountExcludingTax() {
        return (Money) get("amount_excluding_tax");
    }

    public ShippingHandling setAmountExcludingTax(Money arg) {
        optimisticData.put(getKey("amount_excluding_tax"), arg);
        return this;
    }

    /**
     * The shipping amount, including tax
     */
    public Money getAmountIncludingTax() {
        return (Money) get("amount_including_tax");
    }

    public ShippingHandling setAmountIncludingTax(Money arg) {
        optimisticData.put(getKey("amount_including_tax"), arg);
        return this;
    }

    /**
     * The applied discounts to the shipping
     */
    public List<ShippingDiscount> getDiscounts() {
        return (List<ShippingDiscount>) get("discounts");
    }

    public ShippingHandling setDiscounts(List<ShippingDiscount> arg) {
        optimisticData.put(getKey("discounts"), arg);
        return this;
    }

    /**
     * Contains details about taxes applied for shipping
     */
    public List<TaxItem> getTaxes() {
        return (List<TaxItem>) get("taxes");
    }

    public ShippingHandling setTaxes(List<TaxItem> arg) {
        optimisticData.put(getKey("taxes"), arg);
        return this;
    }

    /**
     * The total amount for shipping
     */
    public Money getTotalAmount() {
        return (Money) get("total_amount");
    }

    public ShippingHandling setTotalAmount(Money arg) {
        optimisticData.put(getKey("total_amount"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "amount_excluding_tax": return true;

            case "amount_including_tax": return true;

            case "discounts": return true;

            case "taxes": return true;

            case "total_amount": return true;

            default: return false;
        }
    }
}

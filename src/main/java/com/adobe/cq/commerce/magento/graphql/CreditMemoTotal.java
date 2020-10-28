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
 * Credit memo price details
 */
public class CreditMemoTotal extends AbstractResponse<CreditMemoTotal> {
    public CreditMemoTotal() {
    }

    public CreditMemoTotal(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "adjustment": {
                    responseData.put(key, new Money(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "base_grand_total": {
                    responseData.put(key, new Money(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "discounts": {
                    List<Discount> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<Discount> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            Discount optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new Discount(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "grand_total": {
                    responseData.put(key, new Money(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "shipping_handling": {
                    ShippingHandling optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ShippingHandling(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "subtotal": {
                    responseData.put(key, new Money(jsonAsObject(field.getValue(), key)));

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

                case "total_shipping": {
                    responseData.put(key, new Money(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "total_tax": {
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
        return "CreditMemoTotal";
    }

    /**
     * An adjustment manually applied to the order
     */
    public Money getAdjustment() {
        return (Money) get("adjustment");
    }

    public CreditMemoTotal setAdjustment(Money arg) {
        optimisticData.put(getKey("adjustment"), arg);
        return this;
    }

    /**
     * The final base grand total amount in the base currency
     */
    public Money getBaseGrandTotal() {
        return (Money) get("base_grand_total");
    }

    public CreditMemoTotal setBaseGrandTotal(Money arg) {
        optimisticData.put(getKey("base_grand_total"), arg);
        return this;
    }

    /**
     * The applied discounts to the credit memo
     */
    public List<Discount> getDiscounts() {
        return (List<Discount>) get("discounts");
    }

    public CreditMemoTotal setDiscounts(List<Discount> arg) {
        optimisticData.put(getKey("discounts"), arg);
        return this;
    }

    /**
     * The final total amount, including shipping, discounts, and taxes
     */
    public Money getGrandTotal() {
        return (Money) get("grand_total");
    }

    public CreditMemoTotal setGrandTotal(Money arg) {
        optimisticData.put(getKey("grand_total"), arg);
        return this;
    }

    /**
     * Contains details about the shipping and handling costs for the credit memo
     */
    public ShippingHandling getShippingHandling() {
        return (ShippingHandling) get("shipping_handling");
    }

    public CreditMemoTotal setShippingHandling(ShippingHandling arg) {
        optimisticData.put(getKey("shipping_handling"), arg);
        return this;
    }

    /**
     * The subtotal of the invoice, excluding shipping, discounts, and taxes
     */
    public Money getSubtotal() {
        return (Money) get("subtotal");
    }

    public CreditMemoTotal setSubtotal(Money arg) {
        optimisticData.put(getKey("subtotal"), arg);
        return this;
    }

    /**
     * The credit memo tax details
     */
    public List<TaxItem> getTaxes() {
        return (List<TaxItem>) get("taxes");
    }

    public CreditMemoTotal setTaxes(List<TaxItem> arg) {
        optimisticData.put(getKey("taxes"), arg);
        return this;
    }

    /**
     * The shipping amount for the credit memo
     */
    public Money getTotalShipping() {
        return (Money) get("total_shipping");
    }

    public CreditMemoTotal setTotalShipping(Money arg) {
        optimisticData.put(getKey("total_shipping"), arg);
        return this;
    }

    /**
     * The amount of tax applied to the credit memo
     */
    public Money getTotalTax() {
        return (Money) get("total_tax");
    }

    public CreditMemoTotal setTotalTax(Money arg) {
        optimisticData.put(getKey("total_tax"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "adjustment": return true;

            case "base_grand_total": return true;

            case "discounts": return true;

            case "grand_total": return true;

            case "shipping_handling": return true;

            case "subtotal": return true;

            case "taxes": return true;

            case "total_shipping": return true;

            case "total_tax": return true;

            default: return false;
        }
    }
}

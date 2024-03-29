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
 * Contains details about the final price of items in the cart, including discount and tax information.
 */
public class CartPrices extends AbstractResponse<CartPrices> {
    public CartPrices() {}

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

                case "discount": {
                    CartDiscount optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CartDiscount(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

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

                case "gift_options": {
                    GiftOptionsPrices optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new GiftOptionsPrices(jsonAsObject(field.getValue(), key));
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
                    readCustomField(fieldName, field.getValue());
                }
            }
        }
    }

    public String getGraphQlTypeName() {
        return "CartPrices";
    }

    /**
     * An array containing the names and amounts of taxes applied to each item in the cart.
     */
    public List<CartTaxItem> getAppliedTaxes() {
        return (List<CartTaxItem>) get("applied_taxes");
    }

    public CartPrices setAppliedTaxes(List<CartTaxItem> arg) {
        optimisticData.put(getKey("applied_taxes"), arg);
        return this;
    }

    /**
     * @deprecated Use discounts instead.
     */
    @Deprecated
    public CartDiscount getDiscount() {
        return (CartDiscount) get("discount");
    }

    public CartPrices setDiscount(CartDiscount arg) {
        optimisticData.put(getKey("discount"), arg);
        return this;
    }

    /**
     * An array containing all discounts applied to the cart.
     */
    public List<Discount> getDiscounts() {
        return (List<Discount>) get("discounts");
    }

    public CartPrices setDiscounts(List<Discount> arg) {
        optimisticData.put(getKey("discounts"), arg);
        return this;
    }

    /**
     * The list of prices for the selected gift options.
     */
    public GiftOptionsPrices getGiftOptions() {
        return (GiftOptionsPrices) get("gift_options");
    }

    public CartPrices setGiftOptions(GiftOptionsPrices arg) {
        optimisticData.put(getKey("gift_options"), arg);
        return this;
    }

    /**
     * The total, including discounts, taxes, shipping, and other fees.
     */
    public Money getGrandTotal() {
        return (Money) get("grand_total");
    }

    public CartPrices setGrandTotal(Money arg) {
        optimisticData.put(getKey("grand_total"), arg);
        return this;
    }

    /**
     * The subtotal without any applied taxes.
     */
    public Money getSubtotalExcludingTax() {
        return (Money) get("subtotal_excluding_tax");
    }

    public CartPrices setSubtotalExcludingTax(Money arg) {
        optimisticData.put(getKey("subtotal_excluding_tax"), arg);
        return this;
    }

    /**
     * The subtotal including any applied taxes.
     */
    public Money getSubtotalIncludingTax() {
        return (Money) get("subtotal_including_tax");
    }

    public CartPrices setSubtotalIncludingTax(Money arg) {
        optimisticData.put(getKey("subtotal_including_tax"), arg);
        return this;
    }

    /**
     * The subtotal with any discounts applied, but not taxes.
     */
    public Money getSubtotalWithDiscountExcludingTax() {
        return (Money) get("subtotal_with_discount_excluding_tax");
    }

    public CartPrices setSubtotalWithDiscountExcludingTax(Money arg) {
        optimisticData.put(getKey("subtotal_with_discount_excluding_tax"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "applied_taxes":
                return true;

            case "discount":
                return true;

            case "discounts":
                return true;

            case "gift_options":
                return true;

            case "grand_total":
                return true;

            case "subtotal_excluding_tax":
                return true;

            case "subtotal_including_tax":
                return true;

            case "subtotal_with_discount_excluding_tax":
                return true;

            default:
                return false;
        }
    }
}

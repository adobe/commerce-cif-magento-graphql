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

public class CartItemPrices extends AbstractResponse<CartItemPrices> {
    public CartItemPrices() {}

    public CartItemPrices(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
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

                case "price": {
                    responseData.put(key, new Money(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "row_total": {
                    responseData.put(key, new Money(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "row_total_including_tax": {
                    responseData.put(key, new Money(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "total_item_discount": {
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
        return "CartItemPrices";
    }

    /**
     * An array of discounts to be applied to the cart item
     */
    public List<Discount> getDiscounts() {
        return (List<Discount>) get("discounts");
    }

    public CartItemPrices setDiscounts(List<Discount> arg) {
        optimisticData.put(getKey("discounts"), arg);
        return this;
    }

    public Money getPrice() {
        return (Money) get("price");
    }

    public CartItemPrices setPrice(Money arg) {
        optimisticData.put(getKey("price"), arg);
        return this;
    }

    public Money getRowTotal() {
        return (Money) get("row_total");
    }

    public CartItemPrices setRowTotal(Money arg) {
        optimisticData.put(getKey("row_total"), arg);
        return this;
    }

    public Money getRowTotalIncludingTax() {
        return (Money) get("row_total_including_tax");
    }

    public CartItemPrices setRowTotalIncludingTax(Money arg) {
        optimisticData.put(getKey("row_total_including_tax"), arg);
        return this;
    }

    /**
     * The total of all discounts applied to the item
     */
    public Money getTotalItemDiscount() {
        return (Money) get("total_item_discount");
    }

    public CartItemPrices setTotalItemDiscount(Money arg) {
        optimisticData.put(getKey("total_item_discount"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "discounts":
                return true;

            case "price":
                return true;

            case "row_total":
                return true;

            case "row_total_including_tax":
                return true;

            case "total_item_discount":
                return true;

            default:
                return false;
        }
    }
}

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
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;

/**
 * Defines bundle product options for `CreditMemoItemInterface`.
 */
public class BundleCreditMemoItem extends AbstractResponse<BundleCreditMemoItem> implements CreditMemoItemInterface {
    public BundleCreditMemoItem() {}

    public BundleCreditMemoItem(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "bundle_options": {
                    List<ItemSelectedBundleOption> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<ItemSelectedBundleOption> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            ItemSelectedBundleOption optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new ItemSelectedBundleOption(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
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

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "order_item": {
                    OrderItemInterface optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = UnknownOrderItemInterface.create(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "product_name": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "product_sale_price": {
                    responseData.put(key, new Money(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "product_sku": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "quantity_refunded": {
                    Double optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsDouble(field.getValue(), key);
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
        return "BundleCreditMemoItem";
    }

    /**
     * A list of bundle options that are assigned to a bundle product that is part of a credit memo.
     */
    public List<ItemSelectedBundleOption> getBundleOptions() {
        return (List<ItemSelectedBundleOption>) get("bundle_options");
    }

    public BundleCreditMemoItem setBundleOptions(List<ItemSelectedBundleOption> arg) {
        optimisticData.put(getKey("bundle_options"), arg);
        return this;
    }

    /**
     * Details about the final discount amount for the base product, including discounts on options.
     */
    public List<Discount> getDiscounts() {
        return (List<Discount>) get("discounts");
    }

    public BundleCreditMemoItem setDiscounts(List<Discount> arg) {
        optimisticData.put(getKey("discounts"), arg);
        return this;
    }

    /**
     * The unique ID for a `CreditMemoItemInterface` object.
     */
    public ID getId() {
        return (ID) get("id");
    }

    public BundleCreditMemoItem setId(ID arg) {
        optimisticData.put(getKey("id"), arg);
        return this;
    }

    /**
     * The order item the credit memo is applied to.
     */
    public OrderItemInterface getOrderItem() {
        return (OrderItemInterface) get("order_item");
    }

    public BundleCreditMemoItem setOrderItem(OrderItemInterface arg) {
        optimisticData.put(getKey("order_item"), arg);
        return this;
    }

    /**
     * The name of the base product.
     */
    public String getProductName() {
        return (String) get("product_name");
    }

    public BundleCreditMemoItem setProductName(String arg) {
        optimisticData.put(getKey("product_name"), arg);
        return this;
    }

    /**
     * The sale price for the base product, including selected options.
     */
    public Money getProductSalePrice() {
        return (Money) get("product_sale_price");
    }

    public BundleCreditMemoItem setProductSalePrice(Money arg) {
        optimisticData.put(getKey("product_sale_price"), arg);
        return this;
    }

    /**
     * The SKU of the base product.
     */
    public String getProductSku() {
        return (String) get("product_sku");
    }

    public BundleCreditMemoItem setProductSku(String arg) {
        optimisticData.put(getKey("product_sku"), arg);
        return this;
    }

    /**
     * The number of refunded items.
     */
    public Double getQuantityRefunded() {
        return (Double) get("quantity_refunded");
    }

    public BundleCreditMemoItem setQuantityRefunded(Double arg) {
        optimisticData.put(getKey("quantity_refunded"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "bundle_options":
                return true;

            case "discounts":
                return true;

            case "id":
                return false;

            case "order_item":
                return false;

            case "product_name":
                return false;

            case "product_sale_price":
                return true;

            case "product_sku":
                return false;

            case "quantity_refunded":
                return false;

            default:
                return false;
        }
    }
}

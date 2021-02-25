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

public class BundleOrderItem extends AbstractResponse<BundleOrderItem> implements OrderItemInterface {
    public BundleOrderItem() {}

    public BundleOrderItem(JsonObject fields) throws SchemaViolationError {
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

                case "eligible_for_return": {
                    Boolean optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsBoolean(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "entered_options": {
                    List<OrderItemOption> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<OrderItemOption> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            OrderItemOption optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new OrderItemOption(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "gift_wrapping": {
                    GiftWrapping optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new GiftWrapping(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

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

                case "product_type": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "product_url_key": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "quantity_canceled": {
                    Double optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsDouble(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "quantity_invoiced": {
                    Double optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsDouble(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "quantity_ordered": {
                    Double optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsDouble(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

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

                case "quantity_returned": {
                    Double optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsDouble(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "quantity_shipped": {
                    Double optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsDouble(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "selected_options": {
                    List<OrderItemOption> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<OrderItemOption> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            OrderItemOption optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new OrderItemOption(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "status": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
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
        return "BundleOrderItem";
    }

    /**
     * A list of bundle options that are assigned to the bundle product
     */
    public List<ItemSelectedBundleOption> getBundleOptions() {
        return (List<ItemSelectedBundleOption>) get("bundle_options");
    }

    public BundleOrderItem setBundleOptions(List<ItemSelectedBundleOption> arg) {
        optimisticData.put(getKey("bundle_options"), arg);
        return this;
    }

    /**
     * The final discount information for the product
     */
    public List<Discount> getDiscounts() {
        return (List<Discount>) get("discounts");
    }

    public BundleOrderItem setDiscounts(List<Discount> arg) {
        optimisticData.put(getKey("discounts"), arg);
        return this;
    }

    /**
     * Indicates whether the order item is eligible is eligible to be in a return request
     */
    public Boolean getEligibleForReturn() {
        return (Boolean) get("eligible_for_return");
    }

    public BundleOrderItem setEligibleForReturn(Boolean arg) {
        optimisticData.put(getKey("eligible_for_return"), arg);
        return this;
    }

    /**
     * The entered option for the base product, such as a logo or image
     */
    public List<OrderItemOption> getEnteredOptions() {
        return (List<OrderItemOption>) get("entered_options");
    }

    public BundleOrderItem setEnteredOptions(List<OrderItemOption> arg) {
        optimisticData.put(getKey("entered_options"), arg);
        return this;
    }

    /**
     * The selected gift wrapping for the order item
     */
    public GiftWrapping getGiftWrapping() {
        return (GiftWrapping) get("gift_wrapping");
    }

    public BundleOrderItem setGiftWrapping(GiftWrapping arg) {
        optimisticData.put(getKey("gift_wrapping"), arg);
        return this;
    }

    /**
     * The unique ID for a `OrderItemInterface` object
     */
    public ID getId() {
        return (ID) get("id");
    }

    public BundleOrderItem setId(ID arg) {
        optimisticData.put(getKey("id"), arg);
        return this;
    }

    /**
     * The name of the base product
     */
    public String getProductName() {
        return (String) get("product_name");
    }

    public BundleOrderItem setProductName(String arg) {
        optimisticData.put(getKey("product_name"), arg);
        return this;
    }

    /**
     * The sale price of the base product, including selected options
     */
    public Money getProductSalePrice() {
        return (Money) get("product_sale_price");
    }

    public BundleOrderItem setProductSalePrice(Money arg) {
        optimisticData.put(getKey("product_sale_price"), arg);
        return this;
    }

    /**
     * The SKU of the base product
     */
    public String getProductSku() {
        return (String) get("product_sku");
    }

    public BundleOrderItem setProductSku(String arg) {
        optimisticData.put(getKey("product_sku"), arg);
        return this;
    }

    /**
     * The type of product, such as simple, configurable, etc.
     */
    public String getProductType() {
        return (String) get("product_type");
    }

    public BundleOrderItem setProductType(String arg) {
        optimisticData.put(getKey("product_type"), arg);
        return this;
    }

    /**
     * URL key of the base product
     */
    public String getProductUrlKey() {
        return (String) get("product_url_key");
    }

    public BundleOrderItem setProductUrlKey(String arg) {
        optimisticData.put(getKey("product_url_key"), arg);
        return this;
    }

    /**
     * The number of canceled items
     */
    public Double getQuantityCanceled() {
        return (Double) get("quantity_canceled");
    }

    public BundleOrderItem setQuantityCanceled(Double arg) {
        optimisticData.put(getKey("quantity_canceled"), arg);
        return this;
    }

    /**
     * The number of invoiced items
     */
    public Double getQuantityInvoiced() {
        return (Double) get("quantity_invoiced");
    }

    public BundleOrderItem setQuantityInvoiced(Double arg) {
        optimisticData.put(getKey("quantity_invoiced"), arg);
        return this;
    }

    /**
     * The number of units ordered for this item
     */
    public Double getQuantityOrdered() {
        return (Double) get("quantity_ordered");
    }

    public BundleOrderItem setQuantityOrdered(Double arg) {
        optimisticData.put(getKey("quantity_ordered"), arg);
        return this;
    }

    /**
     * The number of refunded items
     */
    public Double getQuantityRefunded() {
        return (Double) get("quantity_refunded");
    }

    public BundleOrderItem setQuantityRefunded(Double arg) {
        optimisticData.put(getKey("quantity_refunded"), arg);
        return this;
    }

    /**
     * The number of returned items
     */
    public Double getQuantityReturned() {
        return (Double) get("quantity_returned");
    }

    public BundleOrderItem setQuantityReturned(Double arg) {
        optimisticData.put(getKey("quantity_returned"), arg);
        return this;
    }

    /**
     * The number of shipped items
     */
    public Double getQuantityShipped() {
        return (Double) get("quantity_shipped");
    }

    public BundleOrderItem setQuantityShipped(Double arg) {
        optimisticData.put(getKey("quantity_shipped"), arg);
        return this;
    }

    /**
     * The selected options for the base product, such as color or size
     */
    public List<OrderItemOption> getSelectedOptions() {
        return (List<OrderItemOption>) get("selected_options");
    }

    public BundleOrderItem setSelectedOptions(List<OrderItemOption> arg) {
        optimisticData.put(getKey("selected_options"), arg);
        return this;
    }

    /**
     * The status of the order item
     */
    public String getStatus() {
        return (String) get("status");
    }

    public BundleOrderItem setStatus(String arg) {
        optimisticData.put(getKey("status"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "bundle_options":
                return true;

            case "discounts":
                return true;

            case "eligible_for_return":
                return false;

            case "entered_options":
                return true;

            case "gift_wrapping":
                return true;

            case "id":
                return false;

            case "product_name":
                return false;

            case "product_sale_price":
                return true;

            case "product_sku":
                return false;

            case "product_type":
                return false;

            case "product_url_key":
                return false;

            case "quantity_canceled":
                return false;

            case "quantity_invoiced":
                return false;

            case "quantity_ordered":
                return false;

            case "quantity_refunded":
                return false;

            case "quantity_returned":
                return false;

            case "quantity_shipped":
                return false;

            case "selected_options":
                return true;

            case "status":
                return false;

            default:
                return false;
        }
    }
}

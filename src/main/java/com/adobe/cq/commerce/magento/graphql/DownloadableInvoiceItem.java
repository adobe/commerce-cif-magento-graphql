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

public class DownloadableInvoiceItem extends AbstractResponse<DownloadableInvoiceItem> implements InvoiceItemInterface {
    public DownloadableInvoiceItem() {
    }

    public DownloadableInvoiceItem(JsonObject fields) throws SchemaViolationError {
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

                case "downloadable_links": {
                    List<DownloadableItemsLinks> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<DownloadableItemsLinks> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            DownloadableItemsLinks optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new DownloadableItemsLinks(jsonAsObject(element1, key));
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

                case "quantity_invoiced": {
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
        return "DownloadableInvoiceItem";
    }

    /**
     * Contains information about the final discount amount for the base product, including discounts on
     * options
     */
    public List<Discount> getDiscounts() {
        return (List<Discount>) get("discounts");
    }

    public DownloadableInvoiceItem setDiscounts(List<Discount> arg) {
        optimisticData.put(getKey("discounts"), arg);
        return this;
    }

    /**
     * A list of downloadable links that are invoiced from the downloadable product
     */
    public List<DownloadableItemsLinks> getDownloadableLinks() {
        return (List<DownloadableItemsLinks>) get("downloadable_links");
    }

    public DownloadableInvoiceItem setDownloadableLinks(List<DownloadableItemsLinks> arg) {
        optimisticData.put(getKey("downloadable_links"), arg);
        return this;
    }

    /**
     * The unique ID of the invoice item
     */
    public ID getId() {
        return (ID) get("id");
    }

    public DownloadableInvoiceItem setId(ID arg) {
        optimisticData.put(getKey("id"), arg);
        return this;
    }

    /**
     * Contains details about an individual order item
     */
    public OrderItemInterface getOrderItem() {
        return (OrderItemInterface) get("order_item");
    }

    public DownloadableInvoiceItem setOrderItem(OrderItemInterface arg) {
        optimisticData.put(getKey("order_item"), arg);
        return this;
    }

    /**
     * The name of the base product
     */
    public String getProductName() {
        return (String) get("product_name");
    }

    public DownloadableInvoiceItem setProductName(String arg) {
        optimisticData.put(getKey("product_name"), arg);
        return this;
    }

    /**
     * The sale price for the base product including selected options
     */
    public Money getProductSalePrice() {
        return (Money) get("product_sale_price");
    }

    public DownloadableInvoiceItem setProductSalePrice(Money arg) {
        optimisticData.put(getKey("product_sale_price"), arg);
        return this;
    }

    /**
     * The SKU of the base product
     */
    public String getProductSku() {
        return (String) get("product_sku");
    }

    public DownloadableInvoiceItem setProductSku(String arg) {
        optimisticData.put(getKey("product_sku"), arg);
        return this;
    }

    /**
     * The number of invoiced items
     */
    public Double getQuantityInvoiced() {
        return (Double) get("quantity_invoiced");
    }

    public DownloadableInvoiceItem setQuantityInvoiced(Double arg) {
        optimisticData.put(getKey("quantity_invoiced"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "discounts": return true;

            case "downloadable_links": return true;

            case "id": return false;

            case "order_item": return false;

            case "product_name": return false;

            case "product_sale_price": return true;

            case "product_sku": return false;

            case "quantity_invoiced": return false;

            default: return false;
        }
    }
}

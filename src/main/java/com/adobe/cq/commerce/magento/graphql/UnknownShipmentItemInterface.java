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
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;

/**
 * Order shipment item details.
 */
public class UnknownShipmentItemInterface extends AbstractResponse<UnknownShipmentItemInterface> implements ShipmentItemInterface {
    public UnknownShipmentItemInterface() {}

    public UnknownShipmentItemInterface(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
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

                case "quantity_shipped": {
                    responseData.put(key, jsonAsDouble(field.getValue(), key));

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

    public static ShipmentItemInterface create(JsonObject fields) throws SchemaViolationError {
        String typeName = fields.getAsJsonPrimitive("__typename").getAsString();
        switch (typeName) {
            case "BundleShipmentItem": {
                return new BundleShipmentItem(fields);
            }

            case "GiftCardShipmentItem": {
                return new GiftCardShipmentItem(fields);
            }

            case "ShipmentItem": {
                return new ShipmentItem(fields);
            }

            default: {
                return new UnknownShipmentItemInterface(fields);
            }
        }
    }

    public String getGraphQlTypeName() {
        return (String) get("__typename");
    }

    /**
     * The unique ID for a `ShipmentItemInterface` object.
     */
    public ID getId() {
        return (ID) get("id");
    }

    public UnknownShipmentItemInterface setId(ID arg) {
        optimisticData.put(getKey("id"), arg);
        return this;
    }

    /**
     * The order item associated with the shipment item.
     */
    public OrderItemInterface getOrderItem() {
        return (OrderItemInterface) get("order_item");
    }

    public UnknownShipmentItemInterface setOrderItem(OrderItemInterface arg) {
        optimisticData.put(getKey("order_item"), arg);
        return this;
    }

    /**
     * The name of the base product.
     */
    public String getProductName() {
        return (String) get("product_name");
    }

    public UnknownShipmentItemInterface setProductName(String arg) {
        optimisticData.put(getKey("product_name"), arg);
        return this;
    }

    /**
     * The sale price for the base product.
     */
    public Money getProductSalePrice() {
        return (Money) get("product_sale_price");
    }

    public UnknownShipmentItemInterface setProductSalePrice(Money arg) {
        optimisticData.put(getKey("product_sale_price"), arg);
        return this;
    }

    /**
     * The SKU of the base product.
     */
    public String getProductSku() {
        return (String) get("product_sku");
    }

    public UnknownShipmentItemInterface setProductSku(String arg) {
        optimisticData.put(getKey("product_sku"), arg);
        return this;
    }

    /**
     * The number of shipped items.
     */
    public Double getQuantityShipped() {
        return (Double) get("quantity_shipped");
    }

    public UnknownShipmentItemInterface setQuantityShipped(Double arg) {
        optimisticData.put(getKey("quantity_shipped"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
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

            case "quantity_shipped":
                return false;

            default:
                return false;
        }
    }
}

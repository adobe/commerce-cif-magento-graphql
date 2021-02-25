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

public class ReturnItem extends AbstractResponse<ReturnItem> {
    public ReturnItem() {}

    public ReturnItem(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "custom_attributes": {
                    List<ReturnCustomAttribute> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<ReturnCustomAttribute> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            ReturnCustomAttribute optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new ReturnCustomAttribute(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "order_item": {
                    responseData.put(key, UnknownOrderItemInterface.create(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "quantity": {
                    responseData.put(key, jsonAsDouble(field.getValue(), key));

                    break;
                }

                case "request_quantity": {
                    responseData.put(key, jsonAsDouble(field.getValue(), key));

                    break;
                }

                case "status": {
                    responseData.put(key, ReturnItemStatus.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "uid": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

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
        return "ReturnItem";
    }

    /**
     * Return item custom attributes that are visible on the storefront
     */
    public List<ReturnCustomAttribute> getCustomAttributes() {
        return (List<ReturnCustomAttribute>) get("custom_attributes");
    }

    public ReturnItem setCustomAttributes(List<ReturnCustomAttribute> arg) {
        optimisticData.put(getKey("custom_attributes"), arg);
        return this;
    }

    /**
     * Provides access to the product being returned, including information about selected and entered
     * options
     */
    public OrderItemInterface getOrderItem() {
        return (OrderItemInterface) get("order_item");
    }

    public ReturnItem setOrderItem(OrderItemInterface arg) {
        optimisticData.put(getKey("order_item"), arg);
        return this;
    }

    /**
     * The quantity of the item the merchant authorized to be returned
     */
    public Double getQuantity() {
        return (Double) get("quantity");
    }

    public ReturnItem setQuantity(Double arg) {
        optimisticData.put(getKey("quantity"), arg);
        return this;
    }

    /**
     * The quantity of the item requested to be returned
     */
    public Double getRequestQuantity() {
        return (Double) get("request_quantity");
    }

    public ReturnItem setRequestQuantity(Double arg) {
        optimisticData.put(getKey("request_quantity"), arg);
        return this;
    }

    /**
     * The return status of the item
     */
    public ReturnItemStatus getStatus() {
        return (ReturnItemStatus) get("status");
    }

    public ReturnItem setStatus(ReturnItemStatus arg) {
        optimisticData.put(getKey("status"), arg);
        return this;
    }

    /**
     * The unique ID for a `ReturnItem` object
     */
    public ID getUid() {
        return (ID) get("uid");
    }

    public ReturnItem setUid(ID arg) {
        optimisticData.put(getKey("uid"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "custom_attributes":
                return true;

            case "order_item":
                return false;

            case "quantity":
                return false;

            case "request_quantity":
                return false;

            case "status":
                return false;

            case "uid":
                return false;

            default:
                return false;
        }
    }
}

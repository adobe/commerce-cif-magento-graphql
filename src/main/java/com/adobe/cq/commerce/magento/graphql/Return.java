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
 * Customer return
 */
public class Return extends AbstractResponse<Return> {
    public Return() {}

    public Return(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "available_shipping_carriers": {
                    List<ReturnShippingCarrier> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<ReturnShippingCarrier> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            ReturnShippingCarrier optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new ReturnShippingCarrier(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "comments": {
                    List<ReturnComment> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<ReturnComment> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            ReturnComment optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new ReturnComment(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "created_at": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "customer": {
                    responseData.put(key, new ReturnCustomer(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "items": {
                    List<ReturnItem> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<ReturnItem> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            ReturnItem optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new ReturnItem(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "number": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "order": {
                    CustomerOrder optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CustomerOrder(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "shipping": {
                    ReturnShipping optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ReturnShipping(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "status": {
                    ReturnStatus optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = ReturnStatus.fromGraphQl(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

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
        return "Return";
    }

    /**
     * A list of shipping carriers available for returns
     */
    public List<ReturnShippingCarrier> getAvailableShippingCarriers() {
        return (List<ReturnShippingCarrier>) get("available_shipping_carriers");
    }

    public Return setAvailableShippingCarriers(List<ReturnShippingCarrier> arg) {
        optimisticData.put(getKey("available_shipping_carriers"), arg);
        return this;
    }

    /**
     * A list of comments posted for the return request
     */
    public List<ReturnComment> getComments() {
        return (List<ReturnComment>) get("comments");
    }

    public Return setComments(List<ReturnComment> arg) {
        optimisticData.put(getKey("comments"), arg);
        return this;
    }

    /**
     * The date the return was requested
     */
    public String getCreatedAt() {
        return (String) get("created_at");
    }

    public Return setCreatedAt(String arg) {
        optimisticData.put(getKey("created_at"), arg);
        return this;
    }

    /**
     * The data from customer who created the return request
     */
    public ReturnCustomer getCustomer() {
        return (ReturnCustomer) get("customer");
    }

    public Return setCustomer(ReturnCustomer arg) {
        optimisticData.put(getKey("customer"), arg);
        return this;
    }

    /**
     * A list of items being returned
     */
    public List<ReturnItem> getItems() {
        return (List<ReturnItem>) get("items");
    }

    public Return setItems(List<ReturnItem> arg) {
        optimisticData.put(getKey("items"), arg);
        return this;
    }

    /**
     * Human-readable return number
     */
    public String getNumber() {
        return (String) get("number");
    }

    public Return setNumber(String arg) {
        optimisticData.put(getKey("number"), arg);
        return this;
    }

    /**
     * The order associated with the return
     */
    public CustomerOrder getOrder() {
        return (CustomerOrder) get("order");
    }

    public Return setOrder(CustomerOrder arg) {
        optimisticData.put(getKey("order"), arg);
        return this;
    }

    /**
     * Shipping information for the return
     */
    public ReturnShipping getShipping() {
        return (ReturnShipping) get("shipping");
    }

    public Return setShipping(ReturnShipping arg) {
        optimisticData.put(getKey("shipping"), arg);
        return this;
    }

    /**
     * The status of the return request
     */
    public ReturnStatus getStatus() {
        return (ReturnStatus) get("status");
    }

    public Return setStatus(ReturnStatus arg) {
        optimisticData.put(getKey("status"), arg);
        return this;
    }

    /**
     * The unique ID for a `Return` object
     */
    public ID getUid() {
        return (ID) get("uid");
    }

    public Return setUid(ID arg) {
        optimisticData.put(getKey("uid"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "available_shipping_carriers":
                return true;

            case "comments":
                return true;

            case "created_at":
                return false;

            case "customer":
                return true;

            case "items":
                return true;

            case "number":
                return false;

            case "order":
                return true;

            case "shipping":
                return true;

            case "status":
                return false;

            case "uid":
                return false;

            default:
                return false;
        }
    }
}

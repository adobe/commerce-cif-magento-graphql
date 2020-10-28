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
 * Order shipment details
 */
public class OrderShipment extends AbstractResponse<OrderShipment> {
    public OrderShipment() {
    }

    public OrderShipment(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "comments": {
                    List<SalesCommentItem> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<SalesCommentItem> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            SalesCommentItem optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new SalesCommentItem(jsonAsObject(element1, key));
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

                case "items": {
                    List<ShipmentItemInterface> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<ShipmentItemInterface> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            ShipmentItemInterface optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = UnknownShipmentItemInterface.create(jsonAsObject(element1, key));
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

                case "tracking": {
                    List<ShipmentTracking> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<ShipmentTracking> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            ShipmentTracking optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new ShipmentTracking(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
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
        return "OrderShipment";
    }

    /**
     * Comments added to the shipment
     */
    public List<SalesCommentItem> getComments() {
        return (List<SalesCommentItem>) get("comments");
    }

    public OrderShipment setComments(List<SalesCommentItem> arg) {
        optimisticData.put(getKey("comments"), arg);
        return this;
    }

    /**
     * The unique ID of the shipment
     */
    public ID getId() {
        return (ID) get("id");
    }

    public OrderShipment setId(ID arg) {
        optimisticData.put(getKey("id"), arg);
        return this;
    }

    /**
     * Contains items included in the shipment
     */
    public List<ShipmentItemInterface> getItems() {
        return (List<ShipmentItemInterface>) get("items");
    }

    public OrderShipment setItems(List<ShipmentItemInterface> arg) {
        optimisticData.put(getKey("items"), arg);
        return this;
    }

    /**
     * The sequential credit shipment number
     */
    public String getNumber() {
        return (String) get("number");
    }

    public OrderShipment setNumber(String arg) {
        optimisticData.put(getKey("number"), arg);
        return this;
    }

    /**
     * Contains shipment tracking details
     */
    public List<ShipmentTracking> getTracking() {
        return (List<ShipmentTracking>) get("tracking");
    }

    public OrderShipment setTracking(List<ShipmentTracking> arg) {
        optimisticData.put(getKey("tracking"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "comments": return true;

            case "id": return false;

            case "items": return false;

            case "number": return false;

            case "tracking": return true;

            default: return false;
        }
    }
}

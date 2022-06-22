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
import com.shopify.graphql.support.SchemaViolationError;

/**
 * Contains order shipment tracking details.
 */
public class ShipmentTracking extends AbstractResponse<ShipmentTracking> {
    public ShipmentTracking() {}

    public ShipmentTracking(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "carrier": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "number": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "title": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

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
        return "ShipmentTracking";
    }

    /**
     * The shipping carrier for the order delivery.
     */
    public String getCarrier() {
        return (String) get("carrier");
    }

    public ShipmentTracking setCarrier(String arg) {
        optimisticData.put(getKey("carrier"), arg);
        return this;
    }

    /**
     * The tracking number of the order shipment.
     */
    public String getNumber() {
        return (String) get("number");
    }

    public ShipmentTracking setNumber(String arg) {
        optimisticData.put(getKey("number"), arg);
        return this;
    }

    /**
     * The shipment tracking title.
     */
    public String getTitle() {
        return (String) get("title");
    }

    public ShipmentTracking setTitle(String arg) {
        optimisticData.put(getKey("title"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "carrier":
                return false;

            case "number":
                return false;

            case "title":
                return false;

            default:
                return false;
        }
    }
}

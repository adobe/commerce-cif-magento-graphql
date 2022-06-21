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
 * Contains shipping and tracking details.
 */
public class ReturnShippingTracking extends AbstractResponse<ReturnShippingTracking> {
    public ReturnShippingTracking() {}

    public ReturnShippingTracking(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "carrier": {
                    responseData.put(key, new ReturnShippingCarrier(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "status": {
                    ReturnShippingTrackingStatus optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ReturnShippingTrackingStatus(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "tracking_number": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

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
        return "ReturnShippingTracking";
    }

    /**
     * Contains details of a shipping carrier.
     */
    public ReturnShippingCarrier getCarrier() {
        return (ReturnShippingCarrier) get("carrier");
    }

    public ReturnShippingTracking setCarrier(ReturnShippingCarrier arg) {
        optimisticData.put(getKey("carrier"), arg);
        return this;
    }

    /**
     * Details about the status of a shipment.
     */
    public ReturnShippingTrackingStatus getStatus() {
        return (ReturnShippingTrackingStatus) get("status");
    }

    public ReturnShippingTracking setStatus(ReturnShippingTrackingStatus arg) {
        optimisticData.put(getKey("status"), arg);
        return this;
    }

    /**
     * A tracking number assigned by the carrier.
     */
    public String getTrackingNumber() {
        return (String) get("tracking_number");
    }

    public ReturnShippingTracking setTrackingNumber(String arg) {
        optimisticData.put(getKey("tracking_number"), arg);
        return this;
    }

    /**
     * The unique ID for a `ReturnShippingTracking` object assigned to the tracking item.
     */
    public ID getUid() {
        return (ID) get("uid");
    }

    public ReturnShippingTracking setUid(ID arg) {
        optimisticData.put(getKey("uid"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "carrier":
                return true;

            case "status":
                return true;

            case "tracking_number":
                return false;

            case "uid":
                return false;

            default:
                return false;
        }
    }
}

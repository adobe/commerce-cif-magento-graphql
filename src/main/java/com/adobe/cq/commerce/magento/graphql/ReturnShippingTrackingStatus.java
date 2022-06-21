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
 * Contains the status of a shipment.
 */
public class ReturnShippingTrackingStatus extends AbstractResponse<ReturnShippingTrackingStatus> {
    public ReturnShippingTrackingStatus() {}

    public ReturnShippingTrackingStatus(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "text": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "type": {
                    responseData.put(key, ReturnShippingTrackingStatusType.fromGraphQl(jsonAsString(field.getValue(), key)));

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
        return "ReturnShippingTrackingStatus";
    }

    /**
     * Text that describes the status.
     */
    public String getText() {
        return (String) get("text");
    }

    public ReturnShippingTrackingStatus setText(String arg) {
        optimisticData.put(getKey("text"), arg);
        return this;
    }

    /**
     * Indicates whether the status type is informational or an error.
     */
    public ReturnShippingTrackingStatusType getType() {
        return (ReturnShippingTrackingStatusType) get("type");
    }

    public ReturnShippingTrackingStatus setType(ReturnShippingTrackingStatusType arg) {
        optimisticData.put(getKey("type"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "text":
                return false;

            case "type":
                return false;

            default:
                return false;
        }
    }
}

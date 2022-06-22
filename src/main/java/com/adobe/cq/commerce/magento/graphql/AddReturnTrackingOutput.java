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
 * Contains the response after adding tracking information.
 */
public class AddReturnTrackingOutput extends AbstractResponse<AddReturnTrackingOutput> {
    public AddReturnTrackingOutput() {}

    public AddReturnTrackingOutput(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "return": {
                    Return optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Return(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "return_shipping_tracking": {
                    ReturnShippingTracking optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ReturnShippingTracking(jsonAsObject(field.getValue(), key));
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
        return "AddReturnTrackingOutput";
    }

    /**
     * Details about the modified return.
     */
    public Return getReturn() {
        return (Return) get("return");
    }

    public AddReturnTrackingOutput setReturn(Return arg) {
        optimisticData.put(getKey("return"), arg);
        return this;
    }

    /**
     * Details about shipping for a return.
     */
    public ReturnShippingTracking getReturnShippingTracking() {
        return (ReturnShippingTracking) get("return_shipping_tracking");
    }

    public AddReturnTrackingOutput setReturnShippingTracking(ReturnShippingTracking arg) {
        optimisticData.put(getKey("return_shipping_tracking"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "return":
                return true;

            case "return_shipping_tracking":
                return true;

            default:
                return false;
        }
    }
}

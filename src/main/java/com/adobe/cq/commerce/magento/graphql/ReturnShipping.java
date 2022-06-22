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
import com.shopify.graphql.support.SchemaViolationError;

/**
 * Contains details about the return shipping address.
 */
public class ReturnShipping extends AbstractResponse<ReturnShipping> {
    public ReturnShipping() {}

    public ReturnShipping(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "address": {
                    ReturnShippingAddress optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ReturnShippingAddress(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "tracking": {
                    List<ReturnShippingTracking> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<ReturnShippingTracking> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            ReturnShippingTracking optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new ReturnShippingTracking(jsonAsObject(element1, key));
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
        return "ReturnShipping";
    }

    /**
     * The merchant-defined return shipping address.
     */
    public ReturnShippingAddress getAddress() {
        return (ReturnShippingAddress) get("address");
    }

    public ReturnShipping setAddress(ReturnShippingAddress arg) {
        optimisticData.put(getKey("address"), arg);
        return this;
    }

    /**
     * The unique ID for a `ReturnShippingTracking` object. If a single UID is specified, the array
     * contains a single tracking record. Otherwise, array contains all tracking information.
     */
    public List<ReturnShippingTracking> getTracking() {
        return (List<ReturnShippingTracking>) get("tracking");
    }

    public ReturnShipping setTracking(List<ReturnShippingTracking> arg) {
        optimisticData.put(getKey("tracking"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "address":
                return true;

            case "tracking":
                return true;

            default:
                return false;
        }
    }
}

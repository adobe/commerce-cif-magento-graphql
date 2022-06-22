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
 * Contains details about the payment method used to pay for the order.
 */
public class OrderPaymentMethod extends AbstractResponse<OrderPaymentMethod> {
    public OrderPaymentMethod() {}

    public OrderPaymentMethod(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "additional_data": {
                    List<KeyValue> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<KeyValue> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            KeyValue optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new KeyValue(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "name": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "type": {
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
        return "OrderPaymentMethod";
    }

    /**
     * Additional data per payment method type.
     */
    public List<KeyValue> getAdditionalData() {
        return (List<KeyValue>) get("additional_data");
    }

    public OrderPaymentMethod setAdditionalData(List<KeyValue> arg) {
        optimisticData.put(getKey("additional_data"), arg);
        return this;
    }

    /**
     * The label that describes the payment method.
     */
    public String getName() {
        return (String) get("name");
    }

    public OrderPaymentMethod setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    /**
     * The payment method code that indicates how the order was paid for.
     */
    public String getType() {
        return (String) get("type");
    }

    public OrderPaymentMethod setType(String arg) {
        optimisticData.put(getKey("type"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "additional_data":
                return true;

            case "name":
                return false;

            case "type":
                return false;

            default:
                return false;
        }
    }
}

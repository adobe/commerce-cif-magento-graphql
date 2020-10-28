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

public class createKlarnaPaymentsSessionOutput extends AbstractResponse<createKlarnaPaymentsSessionOutput> {
    public createKlarnaPaymentsSessionOutput() {}

    public createKlarnaPaymentsSessionOutput(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "client_token": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "payment_method_categories": {
                    List<Categories> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<Categories> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            Categories optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new Categories(jsonAsObject(element1, key));
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
        return "createKlarnaPaymentsSessionOutput";
    }

    /**
     * The payment method client token
     */
    public String getClientToken() {
        return (String) get("client_token");
    }

    public createKlarnaPaymentsSessionOutput setClientToken(String arg) {
        optimisticData.put(getKey("client_token"), arg);
        return this;
    }

    /**
     * The payment method categories
     */
    public List<Categories> getPaymentMethodCategories() {
        return (List<Categories>) get("payment_method_categories");
    }

    public createKlarnaPaymentsSessionOutput setPaymentMethodCategories(List<Categories> arg) {
        optimisticData.put(getKey("payment_method_categories"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "client_token":
                return false;

            case "payment_method_categories":
                return true;

            default:
                return false;
        }
    }
}

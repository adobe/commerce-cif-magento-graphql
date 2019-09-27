/*******************************************************************************
 *
 *    Copyright 2019 Adobe. All rights reserved.
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
 * 
 */
public class SelectedShippingMethod extends AbstractResponse<SelectedShippingMethod> {
    public SelectedShippingMethod() {
    }

    public SelectedShippingMethod(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "amount": {
                    Money optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Money(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "base_amount": {
                    Money optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Money(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "carrier_code": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "carrier_title": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "method_code": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "method_title": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
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
        return "SelectedShippingMethod";
    }

    public Money getAmount() {
        return (Money) get("amount");
    }

    public SelectedShippingMethod setAmount(Money arg) {
        optimisticData.put(getKey("amount"), arg);
        return this;
    }

    public Money getBaseAmount() {
        return (Money) get("base_amount");
    }

    public SelectedShippingMethod setBaseAmount(Money arg) {
        optimisticData.put(getKey("base_amount"), arg);
        return this;
    }

    public String getCarrierCode() {
        return (String) get("carrier_code");
    }

    public SelectedShippingMethod setCarrierCode(String arg) {
        optimisticData.put(getKey("carrier_code"), arg);
        return this;
    }

    public String getCarrierTitle() {
        return (String) get("carrier_title");
    }

    public SelectedShippingMethod setCarrierTitle(String arg) {
        optimisticData.put(getKey("carrier_title"), arg);
        return this;
    }

    public String getMethodCode() {
        return (String) get("method_code");
    }

    public SelectedShippingMethod setMethodCode(String arg) {
        optimisticData.put(getKey("method_code"), arg);
        return this;
    }

    public String getMethodTitle() {
        return (String) get("method_title");
    }

    public SelectedShippingMethod setMethodTitle(String arg) {
        optimisticData.put(getKey("method_title"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "amount": return true;

            case "base_amount": return true;

            case "carrier_code": return false;

            case "carrier_title": return false;

            case "method_code": return false;

            case "method_title": return false;

            default: return false;
        }
    }
}


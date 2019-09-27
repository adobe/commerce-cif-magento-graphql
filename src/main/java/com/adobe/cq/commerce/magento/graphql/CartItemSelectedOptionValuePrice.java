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
public class CartItemSelectedOptionValuePrice extends AbstractResponse<CartItemSelectedOptionValuePrice> {
    public CartItemSelectedOptionValuePrice() {
    }

    public CartItemSelectedOptionValuePrice(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "type": {
                    responseData.put(key, PriceTypeEnum.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "units": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "value": {
                    responseData.put(key, jsonAsDouble(field.getValue(), key));

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
        return "CartItemSelectedOptionValuePrice";
    }

    public PriceTypeEnum getType() {
        return (PriceTypeEnum) get("type");
    }

    public CartItemSelectedOptionValuePrice setType(PriceTypeEnum arg) {
        optimisticData.put(getKey("type"), arg);
        return this;
    }

    public String getUnits() {
        return (String) get("units");
    }

    public CartItemSelectedOptionValuePrice setUnits(String arg) {
        optimisticData.put(getKey("units"), arg);
        return this;
    }

    public Double getValue() {
        return (Double) get("value");
    }

    public CartItemSelectedOptionValuePrice setValue(Double arg) {
        optimisticData.put(getKey("value"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "type": return false;

            case "units": return false;

            case "value": return false;

            default: return false;
        }
    }
}


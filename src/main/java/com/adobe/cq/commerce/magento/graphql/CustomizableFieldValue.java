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
* CustomizableFieldValue defines the price and sku of a product whose page contains a customized text
* field
*/
public class CustomizableFieldValue extends AbstractResponse<CustomizableFieldValue> {
    public CustomizableFieldValue() {
    }

    public CustomizableFieldValue(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "max_characters": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "price": {
                    Double optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsDouble(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "price_type": {
                    PriceTypeEnum optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = PriceTypeEnum.fromGraphQl(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "sku": {
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
                    throw new SchemaViolationError(this, key, field.getValue());
                }
            }
        }
    }

    public String getGraphQlTypeName() {
        return "CustomizableFieldValue";
    }

    /**
    * The maximum number of characters that can be entered for this customizable option
    */

    public Integer getMaxCharacters() {
        return (Integer) get("max_characters");
    }

    public CustomizableFieldValue setMaxCharacters(Integer arg) {
        optimisticData.put(getKey("max_characters"), arg);
        return this;
    }

    /**
    * The price of the custom value
    */

    public Double getPrice() {
        return (Double) get("price");
    }

    public CustomizableFieldValue setPrice(Double arg) {
        optimisticData.put(getKey("price"), arg);
        return this;
    }

    /**
    * FIXED, PERCENT, or DYNAMIC
    */

    public PriceTypeEnum getPriceType() {
        return (PriceTypeEnum) get("price_type");
    }

    public CustomizableFieldValue setPriceType(PriceTypeEnum arg) {
        optimisticData.put(getKey("price_type"), arg);
        return this;
    }

    /**
    * The Stock Keeping Unit for this option
    */

    public String getSku() {
        return (String) get("sku");
    }

    public CustomizableFieldValue setSku(String arg) {
        optimisticData.put(getKey("sku"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "max_characters": return false;

            case "price": return false;

            case "price_type": return false;

            case "sku": return false;

            default: return false;
        }
    }
}


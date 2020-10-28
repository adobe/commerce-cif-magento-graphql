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
 * CustomizableRadioValue defines the price and sku of a product whose page contains a customized set
 * of radio buttons.
 */
public class CustomizableRadioValue extends AbstractResponse<CustomizableRadioValue> {
    public CustomizableRadioValue() {
    }

    public CustomizableRadioValue(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "option_type_id": {
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

                case "sort_order": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "title": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

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
        return "CustomizableRadioValue";
    }

    /**
     * The ID assigned to the value.
     */
    public Integer getOptionTypeId() {
        return (Integer) get("option_type_id");
    }

    public CustomizableRadioValue setOptionTypeId(Integer arg) {
        optimisticData.put(getKey("option_type_id"), arg);
        return this;
    }

    /**
     * The price assigned to this option.
     */
    public Double getPrice() {
        return (Double) get("price");
    }

    public CustomizableRadioValue setPrice(Double arg) {
        optimisticData.put(getKey("price"), arg);
        return this;
    }

    /**
     * FIXED, PERCENT, or DYNAMIC.
     */
    public PriceTypeEnum getPriceType() {
        return (PriceTypeEnum) get("price_type");
    }

    public CustomizableRadioValue setPriceType(PriceTypeEnum arg) {
        optimisticData.put(getKey("price_type"), arg);
        return this;
    }

    /**
     * The Stock Keeping Unit for this option.
     */
    public String getSku() {
        return (String) get("sku");
    }

    public CustomizableRadioValue setSku(String arg) {
        optimisticData.put(getKey("sku"), arg);
        return this;
    }

    /**
     * The order in which the radio button is displayed.
     */
    public Integer getSortOrder() {
        return (Integer) get("sort_order");
    }

    public CustomizableRadioValue setSortOrder(Integer arg) {
        optimisticData.put(getKey("sort_order"), arg);
        return this;
    }

    /**
     * The display name for this option.
     */
    public String getTitle() {
        return (String) get("title");
    }

    public CustomizableRadioValue setTitle(String arg) {
        optimisticData.put(getKey("title"), arg);
        return this;
    }

    /**
     * A string that encodes option details.
     */
    public ID getUid() {
        return (ID) get("uid");
    }

    public CustomizableRadioValue setUid(ID arg) {
        optimisticData.put(getKey("uid"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "option_type_id": return false;

            case "price": return false;

            case "price_type": return false;

            case "sku": return false;

            case "sort_order": return false;

            case "title": return false;

            case "uid": return false;

            default: return false;
        }
    }
}

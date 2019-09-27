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
 * CustomizableDateOption contains information about a date picker that is defined as part of a
 * customizable option
 */
public class CustomizableDateOption extends AbstractResponse<CustomizableDateOption> implements CustomizableOptionInterface {
    public CustomizableDateOption() {
    }

    public CustomizableDateOption(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "option_id": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "product_sku": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "required": {
                    Boolean optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsBoolean(field.getValue(), key);
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

                case "value": {
                    CustomizableDateValue optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CustomizableDateValue(jsonAsObject(field.getValue(), key));
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
        return "CustomizableDateOption";
    }

    /**
     * Option ID
     */

    public Integer getOptionId() {
        return (Integer) get("option_id");
    }

    public CustomizableDateOption setOptionId(Integer arg) {
        optimisticData.put(getKey("option_id"), arg);
        return this;
    }

    /**
     * The Stock Keeping Unit of the base product
     */

    public String getProductSku() {
        return (String) get("product_sku");
    }

    public CustomizableDateOption setProductSku(String arg) {
        optimisticData.put(getKey("product_sku"), arg);
        return this;
    }

    /**
     * Indicates whether the option is required
     */

    public Boolean getRequired() {
        return (Boolean) get("required");
    }

    public CustomizableDateOption setRequired(Boolean arg) {
        optimisticData.put(getKey("required"), arg);
        return this;
    }

    /**
     * The order in which the option is displayed
     */

    public Integer getSortOrder() {
        return (Integer) get("sort_order");
    }

    public CustomizableDateOption setSortOrder(Integer arg) {
        optimisticData.put(getKey("sort_order"), arg);
        return this;
    }

    /**
     * The display name for this option
     */

    public String getTitle() {
        return (String) get("title");
    }

    public CustomizableDateOption setTitle(String arg) {
        optimisticData.put(getKey("title"), arg);
        return this;
    }

    /**
     * An object that defines a date field in a customizable option.
     */

    public CustomizableDateValue getValue() {
        return (CustomizableDateValue) get("value");
    }

    public CustomizableDateOption setValue(CustomizableDateValue arg) {
        optimisticData.put(getKey("value"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "option_id": return false;

            case "product_sku": return false;

            case "required": return false;

            case "sort_order": return false;

            case "title": return false;

            case "value": return true;

            default: return false;
        }
    }
}


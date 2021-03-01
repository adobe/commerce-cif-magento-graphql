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
 * CustomizableAreaOption contains information about a text area that is defined as part of a
 * customizable option.
 */
public class CustomizableAreaOption extends AbstractResponse<CustomizableAreaOption> implements CustomizableOptionInterface {
    public CustomizableAreaOption() {}

    public CustomizableAreaOption(JsonObject fields) throws SchemaViolationError {
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

                case "uid": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "value": {
                    CustomizableAreaValue optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CustomizableAreaValue(jsonAsObject(field.getValue(), key));
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
        return "CustomizableAreaOption";
    }

    /**
     * Option ID.
     *
     * @deprecated Use `uid` instead
     */
    @Deprecated
    public Integer getOptionId() {
        return (Integer) get("option_id");
    }

    public CustomizableAreaOption setOptionId(Integer arg) {
        optimisticData.put(getKey("option_id"), arg);
        return this;
    }

    /**
     * The Stock Keeping Unit of the base product.
     */
    public String getProductSku() {
        return (String) get("product_sku");
    }

    public CustomizableAreaOption setProductSku(String arg) {
        optimisticData.put(getKey("product_sku"), arg);
        return this;
    }

    /**
     * Indicates whether the option is required.
     */
    public Boolean getRequired() {
        return (Boolean) get("required");
    }

    public CustomizableAreaOption setRequired(Boolean arg) {
        optimisticData.put(getKey("required"), arg);
        return this;
    }

    /**
     * The order in which the option is displayed.
     */
    public Integer getSortOrder() {
        return (Integer) get("sort_order");
    }

    public CustomizableAreaOption setSortOrder(Integer arg) {
        optimisticData.put(getKey("sort_order"), arg);
        return this;
    }

    /**
     * The display name for this option.
     */
    public String getTitle() {
        return (String) get("title");
    }

    public CustomizableAreaOption setTitle(String arg) {
        optimisticData.put(getKey("title"), arg);
        return this;
    }

    /**
     * The unique ID for a `CustomizableOptionInterface` object.
     */
    public ID getUid() {
        return (ID) get("uid");
    }

    public CustomizableAreaOption setUid(ID arg) {
        optimisticData.put(getKey("uid"), arg);
        return this;
    }

    /**
     * An object that defines a text area.
     */
    public CustomizableAreaValue getValue() {
        return (CustomizableAreaValue) get("value");
    }

    public CustomizableAreaOption setValue(CustomizableAreaValue arg) {
        optimisticData.put(getKey("value"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "option_id":
                return false;

            case "product_sku":
                return false;

            case "required":
                return false;

            case "sort_order":
                return false;

            case "title":
                return false;

            case "uid":
                return false;

            case "value":
                return true;

            default:
                return false;
        }
    }
}

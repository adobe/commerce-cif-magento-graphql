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
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;

/**
 * ConfigurableProductOptions defines configurable attributes for the specified product
 */
public class ConfigurableProductOptions extends AbstractResponse<ConfigurableProductOptions> {
    public ConfigurableProductOptions() {}

    public ConfigurableProductOptions(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "attribute_code": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "attribute_id": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "attribute_id_v2": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "id": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "label": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "position": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "product_id": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "use_default": {
                    Boolean optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsBoolean(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "values": {
                    List<ConfigurableProductOptionsValues> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<ConfigurableProductOptionsValues> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            ConfigurableProductOptionsValues optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new ConfigurableProductOptionsValues(jsonAsObject(element1, key));
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
        return "ConfigurableProductOptions";
    }

    /**
     * A string that identifies the attribute
     */
    public String getAttributeCode() {
        return (String) get("attribute_code");
    }

    public ConfigurableProductOptions setAttributeCode(String arg) {
        optimisticData.put(getKey("attribute_code"), arg);
        return this;
    }

    /**
     * The ID assigned to the attribute
     *
     * @deprecated Use attribute_id_v2 instead
     */
    @Deprecated
    public String getAttributeId() {
        return (String) get("attribute_id");
    }

    public ConfigurableProductOptions setAttributeId(String arg) {
        optimisticData.put(getKey("attribute_id"), arg);
        return this;
    }

    /**
     * The ID assigned to the attribute
     */
    public Integer getAttributeIdV2() {
        return (Integer) get("attribute_id_v2");
    }

    public ConfigurableProductOptions setAttributeIdV2(Integer arg) {
        optimisticData.put(getKey("attribute_id_v2"), arg);
        return this;
    }

    /**
     * The configurable option ID number assigned by the system
     */
    public Integer getId() {
        return (Integer) get("id");
    }

    public ConfigurableProductOptions setId(Integer arg) {
        optimisticData.put(getKey("id"), arg);
        return this;
    }

    /**
     * A string that describes the configurable product option, which is displayed on the UI
     */
    public String getLabel() {
        return (String) get("label");
    }

    public ConfigurableProductOptions setLabel(String arg) {
        optimisticData.put(getKey("label"), arg);
        return this;
    }

    /**
     * A number that indicates the order in which the attribute is displayed
     */
    public Integer getPosition() {
        return (Integer) get("position");
    }

    public ConfigurableProductOptions setPosition(Integer arg) {
        optimisticData.put(getKey("position"), arg);
        return this;
    }

    /**
     * This is the same as a product&#39;s id field
     */
    public Integer getProductId() {
        return (Integer) get("product_id");
    }

    public ConfigurableProductOptions setProductId(Integer arg) {
        optimisticData.put(getKey("product_id"), arg);
        return this;
    }

    /**
     * Indicates whether the option is the default
     */
    public Boolean getUseDefault() {
        return (Boolean) get("use_default");
    }

    public ConfigurableProductOptions setUseDefault(Boolean arg) {
        optimisticData.put(getKey("use_default"), arg);
        return this;
    }

    /**
     * An array that defines the value_index codes assigned to the configurable product
     */
    public List<ConfigurableProductOptionsValues> getValues() {
        return (List<ConfigurableProductOptionsValues>) get("values");
    }

    public ConfigurableProductOptions setValues(List<ConfigurableProductOptionsValues> arg) {
        optimisticData.put(getKey("values"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "attribute_code":
                return false;

            case "attribute_id":
                return false;

            case "attribute_id_v2":
                return false;

            case "id":
                return false;

            case "label":
                return false;

            case "position":
                return false;

            case "product_id":
                return false;

            case "use_default":
                return false;

            case "values":
                return true;

            default:
                return false;
        }
    }
}

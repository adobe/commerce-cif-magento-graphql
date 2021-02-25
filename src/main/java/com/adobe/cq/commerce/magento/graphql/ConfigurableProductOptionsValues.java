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
 * ConfigurableProductOptionsValues contains the index number assigned to a configurable product option
 */
public class ConfigurableProductOptionsValues extends AbstractResponse<ConfigurableProductOptionsValues> {
    public ConfigurableProductOptionsValues() {}

    public ConfigurableProductOptionsValues(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "default_label": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
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

                case "store_label": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "swatch_data": {
                    SwatchDataInterface optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = UnknownSwatchDataInterface.create(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "uid": {
                    ID optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ID(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "use_default_value": {
                    Boolean optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsBoolean(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "value_index": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
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
        return "ConfigurableProductOptionsValues";
    }

    /**
     * The label of the product on the default store
     */
    public String getDefaultLabel() {
        return (String) get("default_label");
    }

    public ConfigurableProductOptionsValues setDefaultLabel(String arg) {
        optimisticData.put(getKey("default_label"), arg);
        return this;
    }

    /**
     * The label of the product
     */
    public String getLabel() {
        return (String) get("label");
    }

    public ConfigurableProductOptionsValues setLabel(String arg) {
        optimisticData.put(getKey("label"), arg);
        return this;
    }

    /**
     * The label of the product on the current store
     */
    public String getStoreLabel() {
        return (String) get("store_label");
    }

    public ConfigurableProductOptionsValues setStoreLabel(String arg) {
        optimisticData.put(getKey("store_label"), arg);
        return this;
    }

    /**
     * Swatch data for configurable product option
     */
    public SwatchDataInterface getSwatchData() {
        return (SwatchDataInterface) get("swatch_data");
    }

    public ConfigurableProductOptionsValues setSwatchData(SwatchDataInterface arg) {
        optimisticData.put(getKey("swatch_data"), arg);
        return this;
    }

    /**
     * The unique ID for a `ConfigurableProductOptionsValues` object
     */
    public ID getUid() {
        return (ID) get("uid");
    }

    public ConfigurableProductOptionsValues setUid(ID arg) {
        optimisticData.put(getKey("uid"), arg);
        return this;
    }

    /**
     * Indicates whether to use the default_label
     */
    public Boolean getUseDefaultValue() {
        return (Boolean) get("use_default_value");
    }

    public ConfigurableProductOptionsValues setUseDefaultValue(Boolean arg) {
        optimisticData.put(getKey("use_default_value"), arg);
        return this;
    }

    /**
     * A unique index number assigned to the configurable product option
     *
     * @deprecated Use `uid` instead
     */
    @Deprecated
    public Integer getValueIndex() {
        return (Integer) get("value_index");
    }

    public ConfigurableProductOptionsValues setValueIndex(Integer arg) {
        optimisticData.put(getKey("value_index"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "default_label":
                return false;

            case "label":
                return false;

            case "store_label":
                return false;

            case "swatch_data":
                return false;

            case "uid":
                return false;

            case "use_default_value":
                return false;

            case "value_index":
                return false;

            default:
                return false;
        }
    }
}

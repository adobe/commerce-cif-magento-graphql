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
 * Defines a value for a configurable product option.
 */
public class ConfigurableProductOptionValue extends AbstractResponse<ConfigurableProductOptionValue> {
    public ConfigurableProductOptionValue() {}

    public ConfigurableProductOptionValue(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "is_available": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "is_use_default": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "label": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "swatch": {
                    SwatchDataInterface optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = UnknownSwatchDataInterface.create(jsonAsObject(field.getValue(), key));
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
        return "ConfigurableProductOptionValue";
    }

    /**
     * Indicates whether the product is available with this selected option.
     */
    public Boolean getIsAvailable() {
        return (Boolean) get("is_available");
    }

    public ConfigurableProductOptionValue setIsAvailable(Boolean arg) {
        optimisticData.put(getKey("is_available"), arg);
        return this;
    }

    /**
     * Indicates whether the value is the default.
     */
    public Boolean getIsUseDefault() {
        return (Boolean) get("is_use_default");
    }

    public ConfigurableProductOptionValue setIsUseDefault(Boolean arg) {
        optimisticData.put(getKey("is_use_default"), arg);
        return this;
    }

    /**
     * The display name of the value.
     */
    public String getLabel() {
        return (String) get("label");
    }

    public ConfigurableProductOptionValue setLabel(String arg) {
        optimisticData.put(getKey("label"), arg);
        return this;
    }

    /**
     * The URL assigned to the thumbnail of the swatch image.
     */
    public SwatchDataInterface getSwatch() {
        return (SwatchDataInterface) get("swatch");
    }

    public ConfigurableProductOptionValue setSwatch(SwatchDataInterface arg) {
        optimisticData.put(getKey("swatch"), arg);
        return this;
    }

    /**
     * The unique ID of the value.
     */
    public ID getUid() {
        return (ID) get("uid");
    }

    public ConfigurableProductOptionValue setUid(ID arg) {
        optimisticData.put(getKey("uid"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "is_available":
                return false;

            case "is_use_default":
                return false;

            case "label":
                return false;

            case "swatch":
                return false;

            case "uid":
                return false;

            default:
                return false;
        }
    }
}

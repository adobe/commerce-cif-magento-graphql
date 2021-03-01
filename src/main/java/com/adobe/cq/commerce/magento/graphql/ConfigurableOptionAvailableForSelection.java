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
 * Configurable option available for further selection based on current selection.
 */
public class ConfigurableOptionAvailableForSelection extends AbstractResponse<ConfigurableOptionAvailableForSelection> {
    public ConfigurableOptionAvailableForSelection() {}

    public ConfigurableOptionAvailableForSelection(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "attribute_code": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "option_value_uids": {
                    List<ID> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        ID optional2 = null;
                        if (!element1.isJsonNull()) {
                            optional2 = new ID(jsonAsString(element1, key));
                        }

                        list1.add(optional2);
                    }

                    responseData.put(key, list1);

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
        return "ConfigurableOptionAvailableForSelection";
    }

    /**
     * Attribute code that uniquely identifies configurable option.
     */
    public String getAttributeCode() {
        return (String) get("attribute_code");
    }

    public ConfigurableOptionAvailableForSelection setAttributeCode(String arg) {
        optimisticData.put(getKey("attribute_code"), arg);
        return this;
    }

    /**
     * Configurable option values available for further selection.
     */
    public List<ID> getOptionValueUids() {
        return (List<ID>) get("option_value_uids");
    }

    public ConfigurableOptionAvailableForSelection setOptionValueUids(List<ID> arg) {
        optimisticData.put(getKey("option_value_uids"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "attribute_code":
                return false;

            case "option_value_uids":
                return false;

            default:
                return false;
        }
    }
}

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

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;

/**
 * CustomizableRadioOption contains information about a set of radio buttons that are defined as part
 * of a customizable option
 */
public class CustomizableRadioOption extends AbstractResponse<CustomizableRadioOption> implements CustomizableOptionInterface {
    public CustomizableRadioOption() {
    }

    public CustomizableRadioOption(JsonObject fields) throws SchemaViolationError {
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
                    List<CustomizableRadioValue> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<CustomizableRadioValue> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            CustomizableRadioValue optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new CustomizableRadioValue(jsonAsObject(element1, key));
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
        return "CustomizableRadioOption";
    }

    /**
     * Option ID
     */

    public Integer getOptionId() {
        return (Integer) get("option_id");
    }

    public CustomizableRadioOption setOptionId(Integer arg) {
        optimisticData.put(getKey("option_id"), arg);
        return this;
    }

    /**
     * Indicates whether the option is required
     */

    public Boolean getRequired() {
        return (Boolean) get("required");
    }

    public CustomizableRadioOption setRequired(Boolean arg) {
        optimisticData.put(getKey("required"), arg);
        return this;
    }

    /**
     * The order in which the option is displayed
     */

    public Integer getSortOrder() {
        return (Integer) get("sort_order");
    }

    public CustomizableRadioOption setSortOrder(Integer arg) {
        optimisticData.put(getKey("sort_order"), arg);
        return this;
    }

    /**
     * The display name for this option
     */

    public String getTitle() {
        return (String) get("title");
    }

    public CustomizableRadioOption setTitle(String arg) {
        optimisticData.put(getKey("title"), arg);
        return this;
    }

    /**
     * An array that defines a set of radio buttons
     */

    public List<CustomizableRadioValue> getValue() {
        return (List<CustomizableRadioValue>) get("value");
    }

    public CustomizableRadioOption setValue(List<CustomizableRadioValue> arg) {
        optimisticData.put(getKey("value"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "option_id": return false;

            case "required": return false;

            case "sort_order": return false;

            case "title": return false;

            case "value": return true;

            default: return false;
        }
    }
}


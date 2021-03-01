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
 * The CustomizableOptionInterface contains basic information about a customizable option. It can be
 * implemented by several types of configurable options.
 */
public class UnknownCustomizableOptionInterface extends AbstractResponse<UnknownCustomizableOptionInterface> implements
    CustomizableOptionInterface {
    public UnknownCustomizableOptionInterface() {}

    public UnknownCustomizableOptionInterface(JsonObject fields) throws SchemaViolationError {
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

    public static CustomizableOptionInterface create(JsonObject fields) throws SchemaViolationError {
        String typeName = fields.getAsJsonPrimitive("__typename").getAsString();
        switch (typeName) {
            case "CustomizableAreaOption": {
                return new CustomizableAreaOption(fields);
            }

            case "CustomizableCheckboxOption": {
                return new CustomizableCheckboxOption(fields);
            }

            case "CustomizableDateOption": {
                return new CustomizableDateOption(fields);
            }

            case "CustomizableDropDownOption": {
                return new CustomizableDropDownOption(fields);
            }

            case "CustomizableFieldOption": {
                return new CustomizableFieldOption(fields);
            }

            case "CustomizableFileOption": {
                return new CustomizableFileOption(fields);
            }

            case "CustomizableMultipleOption": {
                return new CustomizableMultipleOption(fields);
            }

            case "CustomizableRadioOption": {
                return new CustomizableRadioOption(fields);
            }

            default: {
                return new UnknownCustomizableOptionInterface(fields);
            }
        }
    }

    public String getGraphQlTypeName() {
        return (String) get("__typename");
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

    public UnknownCustomizableOptionInterface setOptionId(Integer arg) {
        optimisticData.put(getKey("option_id"), arg);
        return this;
    }

    /**
     * Indicates whether the option is required.
     */
    public Boolean getRequired() {
        return (Boolean) get("required");
    }

    public UnknownCustomizableOptionInterface setRequired(Boolean arg) {
        optimisticData.put(getKey("required"), arg);
        return this;
    }

    /**
     * The order in which the option is displayed.
     */
    public Integer getSortOrder() {
        return (Integer) get("sort_order");
    }

    public UnknownCustomizableOptionInterface setSortOrder(Integer arg) {
        optimisticData.put(getKey("sort_order"), arg);
        return this;
    }

    /**
     * The display name for this option.
     */
    public String getTitle() {
        return (String) get("title");
    }

    public UnknownCustomizableOptionInterface setTitle(String arg) {
        optimisticData.put(getKey("title"), arg);
        return this;
    }

    /**
     * The unique ID for a `CustomizableOptionInterface` object.
     */
    public ID getUid() {
        return (ID) get("uid");
    }

    public UnknownCustomizableOptionInterface setUid(ID arg) {
        optimisticData.put(getKey("uid"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "option_id":
                return false;

            case "required":
                return false;

            case "sort_order":
                return false;

            case "title":
                return false;

            case "uid":
                return false;

            default:
                return false;
        }
    }
}

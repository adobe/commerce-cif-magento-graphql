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
import com.shopify.graphql.support.SchemaViolationError;

/**
 * One possible value for a given Enum. Enum values are unique values, not a placeholder for a string
 * or numeric value. However an Enum value is returned in a JSON response as a string.
 */
public class __EnumValue extends AbstractResponse<__EnumValue> {
    public __EnumValue() {
    }

    public __EnumValue(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "name": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "description": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "isDeprecated": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "deprecationReason": {
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
                    readCustomField(fieldName, field.getValue());
                }
            }
        }
    }

    public String getGraphQlTypeName() {
        return "__EnumValue";
    }

    public String getName() {
        return (String) get("name");
    }

    public __EnumValue setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    public String getDescription() {
        return (String) get("description");
    }

    public __EnumValue setDescription(String arg) {
        optimisticData.put(getKey("description"), arg);
        return this;
    }

    public Boolean getIsDeprecated() {
        return (Boolean) get("isDeprecated");
    }

    public __EnumValue setIsDeprecated(Boolean arg) {
        optimisticData.put(getKey("isDeprecated"), arg);
        return this;
    }

    public String getDeprecationReason() {
        return (String) get("deprecationReason");
    }

    public __EnumValue setDeprecationReason(String arg) {
        optimisticData.put(getKey("deprecationReason"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "name": return false;

            case "description": return false;

            case "isDeprecated": return false;

            case "deprecationReason": return false;

            default: return false;
        }
    }
}


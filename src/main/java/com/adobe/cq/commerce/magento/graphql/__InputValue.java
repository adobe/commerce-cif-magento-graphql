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
import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.SchemaViolationError;

/**
 * Arguments provided to Fields or Directives and the input fields of an InputObject are represented as
 * Input Values which describe their type and optionally a default value.
 */
public class __InputValue extends AbstractResponse<__InputValue> {
    public __InputValue() {}

    public __InputValue(JsonObject fields) throws SchemaViolationError {
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

                case "type": {
                    responseData.put(key, new __Type(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "defaultValue": {
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
        return "__InputValue";
    }

    public String getName() {
        return (String) get("name");
    }

    public __InputValue setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    public String getDescription() {
        return (String) get("description");
    }

    public __InputValue setDescription(String arg) {
        optimisticData.put(getKey("description"), arg);
        return this;
    }

    public __Type getType() {
        return (__Type) get("type");
    }

    public __InputValue setType(__Type arg) {
        optimisticData.put(getKey("type"), arg);
        return this;
    }

    /**
     * A GraphQL-formatted string representing the default value for this input value.
     */
    public String getDefaultValue() {
        return (String) get("defaultValue");
    }

    public __InputValue setDefaultValue(String arg) {
        optimisticData.put(getKey("defaultValue"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "name":
                return false;

            case "description":
                return false;

            case "type":
                return true;

            case "defaultValue":
                return false;

            default:
                return false;
        }
    }
}

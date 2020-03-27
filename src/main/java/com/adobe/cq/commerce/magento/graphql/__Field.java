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
import com.shopify.graphql.support.SchemaViolationError;

/**
 * Object and Interface types are described by a list of Fields, each of which has a name, potentially
 * a list of arguments, and a return type.
 */
public class __Field extends AbstractResponse<__Field> {
    public __Field() {
    }

    public __Field(JsonObject fields) throws SchemaViolationError {
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

                case "args": {
                    List<__InputValue> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new __InputValue(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "type": {
                    responseData.put(key, new __Type(jsonAsObject(field.getValue(), key)));

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
        return "__Field";
    }

    public String getName() {
        return (String) get("name");
    }

    public __Field setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    public String getDescription() {
        return (String) get("description");
    }

    public __Field setDescription(String arg) {
        optimisticData.put(getKey("description"), arg);
        return this;
    }

    public List<__InputValue> getArgs() {
        return (List<__InputValue>) get("args");
    }

    public __Field setArgs(List<__InputValue> arg) {
        optimisticData.put(getKey("args"), arg);
        return this;
    }

    public __Type getType() {
        return (__Type) get("type");
    }

    public __Field setType(__Type arg) {
        optimisticData.put(getKey("type"), arg);
        return this;
    }

    public Boolean getIsDeprecated() {
        return (Boolean) get("isDeprecated");
    }

    public __Field setIsDeprecated(Boolean arg) {
        optimisticData.put(getKey("isDeprecated"), arg);
        return this;
    }

    public String getDeprecationReason() {
        return (String) get("deprecationReason");
    }

    public __Field setDeprecationReason(String arg) {
        optimisticData.put(getKey("deprecationReason"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "name": return false;

            case "description": return false;

            case "args": return true;

            case "type": return true;

            case "isDeprecated": return false;

            case "deprecationReason": return false;

            default: return false;
        }
    }
}


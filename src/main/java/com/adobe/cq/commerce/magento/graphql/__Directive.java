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
 * A Directive provides a way to describe alternate runtime execution and type validation behavior in a
 * GraphQL document.
 * In some cases, you need to provide options to alter GraphQL&#39;s execution behavior in ways field
 * arguments will not suffice, such as conditionally including or skipping a field. Directives provide
 * this by describing additional information to the executor.
 */
public class __Directive extends AbstractResponse<__Directive> {
    public __Directive() {
    }

    public __Directive(JsonObject fields) throws SchemaViolationError {
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

                case "locations": {
                    List<__DirectiveLocation> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(__DirectiveLocation.fromGraphQl(jsonAsString(element1, key)));
                    }

                    responseData.put(key, list1);

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

                case "onOperation": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "onFragment": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "onField": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

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
        return "__Directive";
    }

    public String getName() {
        return (String) get("name");
    }

    public __Directive setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    public String getDescription() {
        return (String) get("description");
    }

    public __Directive setDescription(String arg) {
        optimisticData.put(getKey("description"), arg);
        return this;
    }

    public List<__DirectiveLocation> getLocations() {
        return (List<__DirectiveLocation>) get("locations");
    }

    public __Directive setLocations(List<__DirectiveLocation> arg) {
        optimisticData.put(getKey("locations"), arg);
        return this;
    }

    public List<__InputValue> getArgs() {
        return (List<__InputValue>) get("args");
    }

    public __Directive setArgs(List<__InputValue> arg) {
        optimisticData.put(getKey("args"), arg);
        return this;
    }

    /**
     * @deprecated Use `locations`.
     */
    @Deprecated
    public Boolean getOnOperation() {
        return (Boolean) get("onOperation");
    }

    public __Directive setOnOperation(Boolean arg) {
        optimisticData.put(getKey("onOperation"), arg);
        return this;
    }

    /**
     * @deprecated Use `locations`.
     */
    @Deprecated
    public Boolean getOnFragment() {
        return (Boolean) get("onFragment");
    }

    public __Directive setOnFragment(Boolean arg) {
        optimisticData.put(getKey("onFragment"), arg);
        return this;
    }

    /**
     * @deprecated Use `locations`.
     */
    @Deprecated
    public Boolean getOnField() {
        return (Boolean) get("onField");
    }

    public __Directive setOnField(Boolean arg) {
        optimisticData.put(getKey("onField"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "name": return false;

            case "description": return false;

            case "locations": return false;

            case "args": return true;

            case "onOperation": return false;

            case "onFragment": return false;

            case "onField": return false;

            default: return false;
        }
    }
}

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
 * A GraphQL Schema defines the capabilities of a GraphQL server. It exposes all available types and
 * directives on the server, as well as the entry points for query, mutation, and subscription
 * operations.
 */
public class __Schema extends AbstractResponse<__Schema> {
    public __Schema() {
    }

    public __Schema(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "types": {
                    List<__Type> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new __Type(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "queryType": {
                    responseData.put(key, new __Type(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "mutationType": {
                    __Type optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new __Type(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "subscriptionType": {
                    __Type optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new __Type(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "directives": {
                    List<__Directive> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new __Directive(jsonAsObject(element1, key)));
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
        return "__Schema";
    }

    /**
     * A list of all types supported by this server.
     */
    public List<__Type> getTypes() {
        return (List<__Type>) get("types");
    }

    public __Schema setTypes(List<__Type> arg) {
        optimisticData.put(getKey("types"), arg);
        return this;
    }

    /**
     * The type that query operations will be rooted at.
     */
    public __Type getQueryType() {
        return (__Type) get("queryType");
    }

    public __Schema setQueryType(__Type arg) {
        optimisticData.put(getKey("queryType"), arg);
        return this;
    }

    /**
     * If this server supports mutation, the type that mutation operations will be rooted at.
     */
    public __Type getMutationType() {
        return (__Type) get("mutationType");
    }

    public __Schema setMutationType(__Type arg) {
        optimisticData.put(getKey("mutationType"), arg);
        return this;
    }

    /**
     * If this server support subscription, the type that subscription operations will be rooted at.
     */
    public __Type getSubscriptionType() {
        return (__Type) get("subscriptionType");
    }

    public __Schema setSubscriptionType(__Type arg) {
        optimisticData.put(getKey("subscriptionType"), arg);
        return this;
    }

    /**
     * A list of all directives supported by this server.
     */
    public List<__Directive> getDirectives() {
        return (List<__Directive>) get("directives");
    }

    public __Schema setDirectives(List<__Directive> arg) {
        optimisticData.put(getKey("directives"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "types": return true;

            case "queryType": return true;

            case "mutationType": return true;

            case "subscriptionType": return true;

            case "directives": return true;

            default: return false;
        }
    }
}

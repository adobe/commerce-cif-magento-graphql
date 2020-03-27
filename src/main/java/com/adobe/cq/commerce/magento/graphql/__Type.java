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
 * The fundamental unit of any GraphQL Schema is the type. There are many kinds of types in GraphQL as
 * represented by the `__TypeKind` enum.
 * Depending on the kind of a type, certain fields describe information about that type. Scalar types
 * provide no information beyond a name and description, while Enum types provide their values. Object
 * and Interface types provide the fields they describe. Abstract types, Union and Interface, provide
 * the Object types possible at runtime. List and NonNull types compose other types.
 */
public class __Type extends AbstractResponse<__Type> {
    public __Type() {
    }

    public __Type(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "kind": {
                    responseData.put(key, __TypeKind.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "name": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

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

                case "fields": {
                    List<__Field> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<__Field> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            list1.add(new __Field(jsonAsObject(element1, key)));
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "interfaces": {
                    List<__Type> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<__Type> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            list1.add(new __Type(jsonAsObject(element1, key)));
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "possibleTypes": {
                    List<__Type> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<__Type> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            list1.add(new __Type(jsonAsObject(element1, key)));
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "enumValues": {
                    List<__EnumValue> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<__EnumValue> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            list1.add(new __EnumValue(jsonAsObject(element1, key)));
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "inputFields": {
                    List<__InputValue> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<__InputValue> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            list1.add(new __InputValue(jsonAsObject(element1, key)));
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "ofType": {
                    __Type optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new __Type(jsonAsObject(field.getValue(), key));
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
        return "__Type";
    }

    public __TypeKind getKind() {
        return (__TypeKind) get("kind");
    }

    public __Type setKind(__TypeKind arg) {
        optimisticData.put(getKey("kind"), arg);
        return this;
    }

    public String getName() {
        return (String) get("name");
    }

    public __Type setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    public String getDescription() {
        return (String) get("description");
    }

    public __Type setDescription(String arg) {
        optimisticData.put(getKey("description"), arg);
        return this;
    }

    public List<__Field> getFields() {
        return (List<__Field>) get("fields");
    }

    public __Type setFields(List<__Field> arg) {
        optimisticData.put(getKey("fields"), arg);
        return this;
    }

    public List<__Type> getInterfaces() {
        return (List<__Type>) get("interfaces");
    }

    public __Type setInterfaces(List<__Type> arg) {
        optimisticData.put(getKey("interfaces"), arg);
        return this;
    }

    public List<__Type> getPossibleTypes() {
        return (List<__Type>) get("possibleTypes");
    }

    public __Type setPossibleTypes(List<__Type> arg) {
        optimisticData.put(getKey("possibleTypes"), arg);
        return this;
    }

    public List<__EnumValue> getEnumValues() {
        return (List<__EnumValue>) get("enumValues");
    }

    public __Type setEnumValues(List<__EnumValue> arg) {
        optimisticData.put(getKey("enumValues"), arg);
        return this;
    }

    public List<__InputValue> getInputFields() {
        return (List<__InputValue>) get("inputFields");
    }

    public __Type setInputFields(List<__InputValue> arg) {
        optimisticData.put(getKey("inputFields"), arg);
        return this;
    }

    public __Type getOfType() {
        return (__Type) get("ofType");
    }

    public __Type setOfType(__Type arg) {
        optimisticData.put(getKey("ofType"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "kind": return false;

            case "name": return false;

            case "description": return false;

            case "fields": return true;

            case "interfaces": return true;

            case "possibleTypes": return true;

            case "enumValues": return true;

            case "inputFields": return true;

            case "ofType": return true;

            default: return false;
        }
    }
}


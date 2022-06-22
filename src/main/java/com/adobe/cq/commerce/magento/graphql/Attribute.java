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
 * Contains details about the attribute, including the code and type.
 */
public class Attribute extends AbstractResponse<Attribute> {
    public Attribute() {}

    public Attribute(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "attribute_code": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "attribute_options": {
                    List<AttributeOption> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<AttributeOption> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            AttributeOption optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new AttributeOption(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "attribute_type": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "entity_type": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "input_type": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "storefront_properties": {
                    StorefrontProperties optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new StorefrontProperties(jsonAsObject(field.getValue(), key));
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
        return "Attribute";
    }

    /**
     * The unique identifier for an attribute code. This value should be in lowercase letters without
     * spaces.
     */
    public String getAttributeCode() {
        return (String) get("attribute_code");
    }

    public Attribute setAttributeCode(String arg) {
        optimisticData.put(getKey("attribute_code"), arg);
        return this;
    }

    /**
     * Attribute options list.
     */
    public List<AttributeOption> getAttributeOptions() {
        return (List<AttributeOption>) get("attribute_options");
    }

    public Attribute setAttributeOptions(List<AttributeOption> arg) {
        optimisticData.put(getKey("attribute_options"), arg);
        return this;
    }

    /**
     * The data type of the attribute.
     */
    public String getAttributeType() {
        return (String) get("attribute_type");
    }

    public Attribute setAttributeType(String arg) {
        optimisticData.put(getKey("attribute_type"), arg);
        return this;
    }

    /**
     * The type of entity that defines the attribute.
     */
    public String getEntityType() {
        return (String) get("entity_type");
    }

    public Attribute setEntityType(String arg) {
        optimisticData.put(getKey("entity_type"), arg);
        return this;
    }

    /**
     * The frontend input type of the attribute.
     */
    public String getInputType() {
        return (String) get("input_type");
    }

    public Attribute setInputType(String arg) {
        optimisticData.put(getKey("input_type"), arg);
        return this;
    }

    /**
     * Details about the storefront properties configured for the attribute.
     */
    public StorefrontProperties getStorefrontProperties() {
        return (StorefrontProperties) get("storefront_properties");
    }

    public Attribute setStorefrontProperties(StorefrontProperties arg) {
        optimisticData.put(getKey("storefront_properties"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "attribute_code":
                return false;

            case "attribute_options":
                return true;

            case "attribute_type":
                return false;

            case "entity_type":
                return false;

            case "input_type":
                return false;

            case "storefront_properties":
                return true;

            default:
                return false;
        }
    }
}

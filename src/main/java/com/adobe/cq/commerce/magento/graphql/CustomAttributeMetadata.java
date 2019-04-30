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
 * CustomAttributeMetadata defines an array of attribute_codes and entity_types
 */
public class CustomAttributeMetadata extends AbstractResponse<CustomAttributeMetadata> {
    public CustomAttributeMetadata() {
    }

    public CustomAttributeMetadata(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "items": {
                    List<Attribute> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<Attribute> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            Attribute optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new Attribute(jsonAsObject(element1, key));
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
                    throw new SchemaViolationError(this, key, field.getValue());
                }
            }
        }
    }

    public String getGraphQlTypeName() {
        return "CustomAttributeMetadata";
    }

    /**
     * An array of attributes
     */

    public List<Attribute> getItems() {
        return (List<Attribute>) get("items");
    }

    public CustomAttributeMetadata setItems(List<Attribute> arg) {
        optimisticData.put(getKey("items"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "items": return true;

            default: return false;
        }
    }
}


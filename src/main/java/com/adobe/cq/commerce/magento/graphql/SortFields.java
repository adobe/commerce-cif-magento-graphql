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
 * SortFields contains a default value for sort fields and all available sort fields.
 */
public class SortFields extends AbstractResponse<SortFields> {
    public SortFields() {
    }

    public SortFields(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "default": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "options": {
                    List<SortField> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<SortField> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            SortField optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new SortField(jsonAsObject(element1, key));
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
        return "SortFields";
    }

    /**
     * Default value of sort fields.
     */

    public String getDefault() {
        return (String) get("default");
    }

    public SortFields setDefault(String arg) {
        optimisticData.put(getKey("default"), arg);
        return this;
    }

    /**
     * Available sort fields.
     */

    public List<SortField> getOptions() {
        return (List<SortField>) get("options");
    }

    public SortFields setOptions(List<SortField> arg) {
        optimisticData.put(getKey("options"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "default": return false;

            case "options": return true;

            default: return false;
        }
    }
}


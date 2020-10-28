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

public class SelectedCustomizableOption extends AbstractResponse<SelectedCustomizableOption> {
    public SelectedCustomizableOption() {
    }

    public SelectedCustomizableOption(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "id": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

                    break;
                }

                case "is_required": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "label": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "sort_order": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

                    break;
                }

                case "values": {
                    List<SelectedCustomizableOptionValue> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        SelectedCustomizableOptionValue optional2 = null;
                        if (!element1.isJsonNull()) {
                            optional2 = new SelectedCustomizableOptionValue(jsonAsObject(element1, key));
                        }

                        list1.add(optional2);
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
        return "SelectedCustomizableOption";
    }

    public Integer getId() {
        return (Integer) get("id");
    }

    public SelectedCustomizableOption setId(Integer arg) {
        optimisticData.put(getKey("id"), arg);
        return this;
    }

    public Boolean getIsRequired() {
        return (Boolean) get("is_required");
    }

    public SelectedCustomizableOption setIsRequired(Boolean arg) {
        optimisticData.put(getKey("is_required"), arg);
        return this;
    }

    public String getLabel() {
        return (String) get("label");
    }

    public SelectedCustomizableOption setLabel(String arg) {
        optimisticData.put(getKey("label"), arg);
        return this;
    }

    public Integer getSortOrder() {
        return (Integer) get("sort_order");
    }

    public SelectedCustomizableOption setSortOrder(Integer arg) {
        optimisticData.put(getKey("sort_order"), arg);
        return this;
    }

    public List<SelectedCustomizableOptionValue> getValues() {
        return (List<SelectedCustomizableOptionValue>) get("values");
    }

    public SelectedCustomizableOption setValues(List<SelectedCustomizableOptionValue> arg) {
        optimisticData.put(getKey("values"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "id": return false;

            case "is_required": return false;

            case "label": return false;

            case "sort_order": return false;

            case "values": return true;

            default: return false;
        }
    }
}

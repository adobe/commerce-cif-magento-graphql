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
 * Contains information for each filterable option (such as price, category `UID`, and custom
 * attributes).
 */
public class Aggregation extends AbstractResponse<Aggregation> {
    public Aggregation() {}

    public Aggregation(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "attribute_code": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "count": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "label": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "options": {
                    List<AggregationOption> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<AggregationOption> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            AggregationOption optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new AggregationOption(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "position": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
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
        return "Aggregation";
    }

    /**
     * Attribute code of the aggregation group.
     */
    public String getAttributeCode() {
        return (String) get("attribute_code");
    }

    public Aggregation setAttributeCode(String arg) {
        optimisticData.put(getKey("attribute_code"), arg);
        return this;
    }

    /**
     * The number of options in the aggregation group.
     */
    public Integer getCount() {
        return (Integer) get("count");
    }

    public Aggregation setCount(Integer arg) {
        optimisticData.put(getKey("count"), arg);
        return this;
    }

    /**
     * The aggregation display name.
     */
    public String getLabel() {
        return (String) get("label");
    }

    public Aggregation setLabel(String arg) {
        optimisticData.put(getKey("label"), arg);
        return this;
    }

    /**
     * Array of options for the aggregation.
     */
    public List<AggregationOption> getOptions() {
        return (List<AggregationOption>) get("options");
    }

    public Aggregation setOptions(List<AggregationOption> arg) {
        optimisticData.put(getKey("options"), arg);
        return this;
    }

    /**
     * The relative position of the attribute in a layered navigation block.
     */
    public Integer getPosition() {
        return (Integer) get("position");
    }

    public Aggregation setPosition(Integer arg) {
        optimisticData.put(getKey("position"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "attribute_code":
                return false;

            case "count":
                return false;

            case "label":
                return false;

            case "options":
                return true;

            case "position":
                return false;

            default:
                return false;
        }
    }
}

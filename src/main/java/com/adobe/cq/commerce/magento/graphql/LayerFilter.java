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
 * Contains information for rendering layered navigation.
 */
public class LayerFilter extends AbstractResponse<LayerFilter> {
    public LayerFilter() {}

    public LayerFilter(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "filter_items": {
                    List<LayerFilterItemInterface> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<LayerFilterItemInterface> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            LayerFilterItemInterface optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = UnknownLayerFilterItemInterface.create(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "filter_items_count": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

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

                case "request_var": {
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
        return "LayerFilter";
    }

    /**
     * An array of filter items.
     *
     * @deprecated Use `Aggregation.options` instead.
     */
    @Deprecated
    public List<LayerFilterItemInterface> getFilterItems() {
        return (List<LayerFilterItemInterface>) get("filter_items");
    }

    public LayerFilter setFilterItems(List<LayerFilterItemInterface> arg) {
        optimisticData.put(getKey("filter_items"), arg);
        return this;
    }

    /**
     * The count of filter items in filter group.
     *
     * @deprecated Use `Aggregation.count` instead.
     */
    @Deprecated
    public Integer getFilterItemsCount() {
        return (Integer) get("filter_items_count");
    }

    public LayerFilter setFilterItemsCount(Integer arg) {
        optimisticData.put(getKey("filter_items_count"), arg);
        return this;
    }

    /**
     * The name of a layered navigation filter.
     *
     * @deprecated Use `Aggregation.label` instead.
     */
    @Deprecated
    public String getName() {
        return (String) get("name");
    }

    public LayerFilter setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    /**
     * The request variable name for a filter query.
     *
     * @deprecated Use `Aggregation.attribute_code` instead.
     */
    @Deprecated
    public String getRequestVar() {
        return (String) get("request_var");
    }

    public LayerFilter setRequestVar(String arg) {
        optimisticData.put(getKey("request_var"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "filter_items":
                return false;

            case "filter_items_count":
                return false;

            case "name":
                return false;

            case "request_var":
                return false;

            default:
                return false;
        }
    }
}

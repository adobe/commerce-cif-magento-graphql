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
 * The Products object is the top-level object returned in a product search
 */
public class Products extends AbstractResponse<Products> {
    public Products() {
    }

    public Products(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "filters": {
                    List<LayerFilter> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<LayerFilter> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            LayerFilter optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new LayerFilter(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "items": {
                    List<ProductInterface> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<ProductInterface> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            ProductInterface optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = UnknownProductInterface.create(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "page_info": {
                    SearchResultPageInfo optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new SearchResultPageInfo(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "sort_fields": {
                    SortFields optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new SortFields(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "total_count": {
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
        return "Products";
    }

    /**
     * Layered navigation filters array
     */

    public List<LayerFilter> getFilters() {
        return (List<LayerFilter>) get("filters");
    }

    public Products setFilters(List<LayerFilter> arg) {
        optimisticData.put(getKey("filters"), arg);
        return this;
    }

    /**
     * An array of products that match the specified search criteria
     */

    public List<ProductInterface> getItems() {
        return (List<ProductInterface>) get("items");
    }

    public Products setItems(List<ProductInterface> arg) {
        optimisticData.put(getKey("items"), arg);
        return this;
    }

    /**
     * An object that includes the page_info and currentPage values specified in the query
     */

    public SearchResultPageInfo getPageInfo() {
        return (SearchResultPageInfo) get("page_info");
    }

    public Products setPageInfo(SearchResultPageInfo arg) {
        optimisticData.put(getKey("page_info"), arg);
        return this;
    }

    /**
     * An object that includes the default sort field and all available sort fields
     */

    public SortFields getSortFields() {
        return (SortFields) get("sort_fields");
    }

    public Products setSortFields(SortFields arg) {
        optimisticData.put(getKey("sort_fields"), arg);
        return this;
    }

    /**
     * The number of products returned
     */

    public Integer getTotalCount() {
        return (Integer) get("total_count");
    }

    public Products setTotalCount(Integer arg) {
        optimisticData.put(getKey("total_count"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "filters": return true;

            case "items": return false;

            case "page_info": return true;

            case "sort_fields": return true;

            case "total_count": return false;

            default: return false;
        }
    }
}


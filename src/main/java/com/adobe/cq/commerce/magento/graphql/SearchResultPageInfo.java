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

import java.util.Map;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;

/**
 * Provides navigation for the query response.
 */
public class SearchResultPageInfo extends AbstractResponse<SearchResultPageInfo> {
    public SearchResultPageInfo() {}

    public SearchResultPageInfo(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "current_page": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "page_size": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "total_pages": {
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
        return "SearchResultPageInfo";
    }

    /**
     * The specific page to return.
     */
    public Integer getCurrentPage() {
        return (Integer) get("current_page");
    }

    public SearchResultPageInfo setCurrentPage(Integer arg) {
        optimisticData.put(getKey("current_page"), arg);
        return this;
    }

    /**
     * The maximum number of items to return per page of results.
     */
    public Integer getPageSize() {
        return (Integer) get("page_size");
    }

    public SearchResultPageInfo setPageSize(Integer arg) {
        optimisticData.put(getKey("page_size"), arg);
        return this;
    }

    /**
     * The total number of pages in the response.
     */
    public Integer getTotalPages() {
        return (Integer) get("total_pages");
    }

    public SearchResultPageInfo setTotalPages(Integer arg) {
        optimisticData.put(getKey("total_pages"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "current_page":
                return false;

            case "page_size":
                return false;

            case "total_pages":
                return false;

            default:
                return false;
        }
    }
}

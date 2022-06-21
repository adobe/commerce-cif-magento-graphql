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
 * Contains a list of negotiable that match the specified filter.
 */
public class NegotiableQuotesOutput extends AbstractResponse<NegotiableQuotesOutput> {
    public NegotiableQuotesOutput() {}

    public NegotiableQuotesOutput(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "items": {
                    List<NegotiableQuote> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        NegotiableQuote optional2 = null;
                        if (!element1.isJsonNull()) {
                            optional2 = new NegotiableQuote(jsonAsObject(element1, key));
                        }

                        list1.add(optional2);
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "page_info": {
                    responseData.put(key, new SearchResultPageInfo(jsonAsObject(field.getValue(), key)));

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
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

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
        return "NegotiableQuotesOutput";
    }

    /**
     * A list of negotiable quotes
     */
    public List<NegotiableQuote> getItems() {
        return (List<NegotiableQuote>) get("items");
    }

    public NegotiableQuotesOutput setItems(List<NegotiableQuote> arg) {
        optimisticData.put(getKey("items"), arg);
        return this;
    }

    /**
     * Contains pagination metadata
     */
    public SearchResultPageInfo getPageInfo() {
        return (SearchResultPageInfo) get("page_info");
    }

    public NegotiableQuotesOutput setPageInfo(SearchResultPageInfo arg) {
        optimisticData.put(getKey("page_info"), arg);
        return this;
    }

    /**
     * Contains the default sort field and all available sort fields.
     */
    public SortFields getSortFields() {
        return (SortFields) get("sort_fields");
    }

    public NegotiableQuotesOutput setSortFields(SortFields arg) {
        optimisticData.put(getKey("sort_fields"), arg);
        return this;
    }

    /**
     * The number of negotiable quotes returned
     */
    public Integer getTotalCount() {
        return (Integer) get("total_count");
    }

    public NegotiableQuotesOutput setTotalCount(Integer arg) {
        optimisticData.put(getKey("total_count"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "items":
                return true;

            case "page_info":
                return true;

            case "sort_fields":
                return true;

            case "total_count":
                return false;

            default:
                return false;
        }
    }
}

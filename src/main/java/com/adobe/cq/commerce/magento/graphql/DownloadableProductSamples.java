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
 * DownloadableProductSamples defines characteristics of a downloadable product
 */
public class DownloadableProductSamples extends AbstractResponse<DownloadableProductSamples> {
    public DownloadableProductSamples() {
    }

    public DownloadableProductSamples(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "id": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "sample_file": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "sample_type": {
                    DownloadableFileTypeEnum optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = DownloadableFileTypeEnum.fromGraphQl(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "sample_url": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "sort_order": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "title": {
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
        return "DownloadableProductSamples";
    }

    /**
     * @deprecated This information should not be exposed on frontend
     */
    @Deprecated
    public Integer getId() {
        return (Integer) get("id");
    }

    public DownloadableProductSamples setId(Integer arg) {
        optimisticData.put(getKey("id"), arg);
        return this;
    }

    /**
     * @deprecated `sample_url` serves to get the downloadable sample
     */
    @Deprecated
    public String getSampleFile() {
        return (String) get("sample_file");
    }

    public DownloadableProductSamples setSampleFile(String arg) {
        optimisticData.put(getKey("sample_file"), arg);
        return this;
    }

    /**
     * @deprecated `sample_url` serves to get the downloadable sample
     */
    @Deprecated
    public DownloadableFileTypeEnum getSampleType() {
        return (DownloadableFileTypeEnum) get("sample_type");
    }

    public DownloadableProductSamples setSampleType(DownloadableFileTypeEnum arg) {
        optimisticData.put(getKey("sample_type"), arg);
        return this;
    }

    /**
     * URL to the downloadable sample
     */
    public String getSampleUrl() {
        return (String) get("sample_url");
    }

    public DownloadableProductSamples setSampleUrl(String arg) {
        optimisticData.put(getKey("sample_url"), arg);
        return this;
    }

    /**
     * A number indicating the sort order
     */
    public Integer getSortOrder() {
        return (Integer) get("sort_order");
    }

    public DownloadableProductSamples setSortOrder(Integer arg) {
        optimisticData.put(getKey("sort_order"), arg);
        return this;
    }

    /**
     * The display name of the sample
     */
    public String getTitle() {
        return (String) get("title");
    }

    public DownloadableProductSamples setTitle(String arg) {
        optimisticData.put(getKey("title"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "id": return false;

            case "sample_file": return false;

            case "sample_type": return false;

            case "sample_url": return false;

            case "sort_order": return false;

            case "title": return false;

            default: return false;
        }
    }
}

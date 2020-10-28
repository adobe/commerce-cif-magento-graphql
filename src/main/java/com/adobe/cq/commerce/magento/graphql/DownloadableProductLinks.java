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
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;

/**
 * DownloadableProductLinks defines characteristics of a downloadable product
 */
public class DownloadableProductLinks extends AbstractResponse<DownloadableProductLinks> {
    public DownloadableProductLinks() {
    }

    public DownloadableProductLinks(JsonObject fields) throws SchemaViolationError {
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

                case "is_shareable": {
                    Boolean optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsBoolean(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "link_type": {
                    DownloadableFileTypeEnum optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = DownloadableFileTypeEnum.fromGraphQl(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "number_of_downloads": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "price": {
                    Double optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsDouble(field.getValue(), key);
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

                case "uid": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

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
        return "DownloadableProductLinks";
    }

    /**
     * @deprecated This information should not be exposed on frontend
     */
    @Deprecated
    public Integer getId() {
        return (Integer) get("id");
    }

    public DownloadableProductLinks setId(Integer arg) {
        optimisticData.put(getKey("id"), arg);
        return this;
    }

    /**
     * @deprecated This information should not be exposed on frontend
     */
    @Deprecated
    public Boolean getIsShareable() {
        return (Boolean) get("is_shareable");
    }

    public DownloadableProductLinks setIsShareable(Boolean arg) {
        optimisticData.put(getKey("is_shareable"), arg);
        return this;
    }

    /**
     * @deprecated `sample_url` serves to get the downloadable sample
     */
    @Deprecated
    public DownloadableFileTypeEnum getLinkType() {
        return (DownloadableFileTypeEnum) get("link_type");
    }

    public DownloadableProductLinks setLinkType(DownloadableFileTypeEnum arg) {
        optimisticData.put(getKey("link_type"), arg);
        return this;
    }

    /**
     * @deprecated This information should not be exposed on frontend
     */
    @Deprecated
    public Integer getNumberOfDownloads() {
        return (Integer) get("number_of_downloads");
    }

    public DownloadableProductLinks setNumberOfDownloads(Integer arg) {
        optimisticData.put(getKey("number_of_downloads"), arg);
        return this;
    }

    /**
     * The price of the downloadable product
     */
    public Double getPrice() {
        return (Double) get("price");
    }

    public DownloadableProductLinks setPrice(Double arg) {
        optimisticData.put(getKey("price"), arg);
        return this;
    }

    /**
     * @deprecated `sample_url` serves to get the downloadable sample
     */
    @Deprecated
    public String getSampleFile() {
        return (String) get("sample_file");
    }

    public DownloadableProductLinks setSampleFile(String arg) {
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

    public DownloadableProductLinks setSampleType(DownloadableFileTypeEnum arg) {
        optimisticData.put(getKey("sample_type"), arg);
        return this;
    }

    /**
     * URL to the downloadable sample
     */
    public String getSampleUrl() {
        return (String) get("sample_url");
    }

    public DownloadableProductLinks setSampleUrl(String arg) {
        optimisticData.put(getKey("sample_url"), arg);
        return this;
    }

    /**
     * A number indicating the sort order
     */
    public Integer getSortOrder() {
        return (Integer) get("sort_order");
    }

    public DownloadableProductLinks setSortOrder(Integer arg) {
        optimisticData.put(getKey("sort_order"), arg);
        return this;
    }

    /**
     * The display name of the link
     */
    public String getTitle() {
        return (String) get("title");
    }

    public DownloadableProductLinks setTitle(String arg) {
        optimisticData.put(getKey("title"), arg);
        return this;
    }

    /**
     * A string that encodes option details.
     */
    public ID getUid() {
        return (ID) get("uid");
    }

    public DownloadableProductLinks setUid(ID arg) {
        optimisticData.put(getKey("uid"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "id": return false;

            case "is_shareable": return false;

            case "link_type": return false;

            case "number_of_downloads": return false;

            case "price": return false;

            case "sample_file": return false;

            case "sample_type": return false;

            case "sample_url": return false;

            case "sort_order": return false;

            case "title": return false;

            case "uid": return false;

            default: return false;
        }
    }
}

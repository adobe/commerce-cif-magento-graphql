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

public class CustomerDownloadableProduct extends AbstractResponse<CustomerDownloadableProduct> {
    public CustomerDownloadableProduct() {
    }

    public CustomerDownloadableProduct(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "date": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "download_url": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "order_increment_id": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "remaining_downloads": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "status": {
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
        return "CustomerDownloadableProduct";
    }

    public String getDate() {
        return (String) get("date");
    }

    public CustomerDownloadableProduct setDate(String arg) {
        optimisticData.put(getKey("date"), arg);
        return this;
    }

    public String getDownloadUrl() {
        return (String) get("download_url");
    }

    public CustomerDownloadableProduct setDownloadUrl(String arg) {
        optimisticData.put(getKey("download_url"), arg);
        return this;
    }

    public String getOrderIncrementId() {
        return (String) get("order_increment_id");
    }

    public CustomerDownloadableProduct setOrderIncrementId(String arg) {
        optimisticData.put(getKey("order_increment_id"), arg);
        return this;
    }

    public String getRemainingDownloads() {
        return (String) get("remaining_downloads");
    }

    public CustomerDownloadableProduct setRemainingDownloads(String arg) {
        optimisticData.put(getKey("remaining_downloads"), arg);
        return this;
    }

    public String getStatus() {
        return (String) get("status");
    }

    public CustomerDownloadableProduct setStatus(String arg) {
        optimisticData.put(getKey("status"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "date": return false;

            case "download_url": return false;

            case "order_increment_id": return false;

            case "remaining_downloads": return false;

            case "status": return false;

            default: return false;
        }
    }
}

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
 * Contains information about a product video.
 */
public class ProductVideo extends AbstractResponse<ProductVideo> implements MediaGalleryInterface {
    public ProductVideo() {
    }

    public ProductVideo(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "disabled": {
                    Boolean optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsBoolean(field.getValue(), key);
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

                case "position": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "url": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "video_content": {
                    ProductMediaGalleryEntriesVideoContent optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ProductMediaGalleryEntriesVideoContent(jsonAsObject(field.getValue(), key));
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
        return "ProductVideo";
    }

    /**
     * Whether the image is hidden from view.
     */
    public Boolean getDisabled() {
        return (Boolean) get("disabled");
    }

    public ProductVideo setDisabled(Boolean arg) {
        optimisticData.put(getKey("disabled"), arg);
        return this;
    }

    /**
     * The label of the product image or video.
     */
    public String getLabel() {
        return (String) get("label");
    }

    public ProductVideo setLabel(String arg) {
        optimisticData.put(getKey("label"), arg);
        return this;
    }

    /**
     * The media item&#39;s position after it has been sorted.
     */
    public Integer getPosition() {
        return (Integer) get("position");
    }

    public ProductVideo setPosition(Integer arg) {
        optimisticData.put(getKey("position"), arg);
        return this;
    }

    /**
     * The URL of the product image or video.
     */
    public String getUrl() {
        return (String) get("url");
    }

    public ProductVideo setUrl(String arg) {
        optimisticData.put(getKey("url"), arg);
        return this;
    }

    /**
     * Contains a ProductMediaGalleryEntriesVideoContent object.
     */
    public ProductMediaGalleryEntriesVideoContent getVideoContent() {
        return (ProductMediaGalleryEntriesVideoContent) get("video_content");
    }

    public ProductVideo setVideoContent(ProductMediaGalleryEntriesVideoContent arg) {
        optimisticData.put(getKey("video_content"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "disabled": return false;

            case "label": return false;

            case "position": return false;

            case "url": return false;

            case "video_content": return true;

            default: return false;
        }
    }
}

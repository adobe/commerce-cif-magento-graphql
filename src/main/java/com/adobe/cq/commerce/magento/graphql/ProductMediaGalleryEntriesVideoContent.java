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
 * ProductMediaGalleryEntriesVideoContent contains a link to a video file and basic information about
 * the video.
 */
public class ProductMediaGalleryEntriesVideoContent extends AbstractResponse<ProductMediaGalleryEntriesVideoContent> {
    public ProductMediaGalleryEntriesVideoContent() {}

    public ProductMediaGalleryEntriesVideoContent(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "media_type": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "video_description": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "video_metadata": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "video_provider": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "video_title": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "video_url": {
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
        return "ProductMediaGalleryEntriesVideoContent";
    }

    /**
     * Must be external-video.
     */
    public String getMediaType() {
        return (String) get("media_type");
    }

    public ProductMediaGalleryEntriesVideoContent setMediaType(String arg) {
        optimisticData.put(getKey("media_type"), arg);
        return this;
    }

    /**
     * A description of the video.
     */
    public String getVideoDescription() {
        return (String) get("video_description");
    }

    public ProductMediaGalleryEntriesVideoContent setVideoDescription(String arg) {
        optimisticData.put(getKey("video_description"), arg);
        return this;
    }

    /**
     * Optional data about the video.
     */
    public String getVideoMetadata() {
        return (String) get("video_metadata");
    }

    public ProductMediaGalleryEntriesVideoContent setVideoMetadata(String arg) {
        optimisticData.put(getKey("video_metadata"), arg);
        return this;
    }

    /**
     * Describes the video source.
     */
    public String getVideoProvider() {
        return (String) get("video_provider");
    }

    public ProductMediaGalleryEntriesVideoContent setVideoProvider(String arg) {
        optimisticData.put(getKey("video_provider"), arg);
        return this;
    }

    /**
     * The title of the video.
     */
    public String getVideoTitle() {
        return (String) get("video_title");
    }

    public ProductMediaGalleryEntriesVideoContent setVideoTitle(String arg) {
        optimisticData.put(getKey("video_title"), arg);
        return this;
    }

    /**
     * The URL to the video.
     */
    public String getVideoUrl() {
        return (String) get("video_url");
    }

    public ProductMediaGalleryEntriesVideoContent setVideoUrl(String arg) {
        optimisticData.put(getKey("video_url"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "media_type":
                return false;

            case "video_description":
                return false;

            case "video_metadata":
                return false;

            case "video_provider":
                return false;

            case "video_title":
                return false;

            case "video_url":
                return false;

            default:
                return false;
        }
    }
}

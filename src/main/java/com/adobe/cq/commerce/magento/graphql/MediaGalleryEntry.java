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
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;

/**
 * Defines characteristics about images and videos associated with a specific product.
 */
public class MediaGalleryEntry extends AbstractResponse<MediaGalleryEntry> {
    public MediaGalleryEntry() {}

    public MediaGalleryEntry(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "content": {
                    ProductMediaGalleryEntriesContent optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ProductMediaGalleryEntriesContent(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "disabled": {
                    Boolean optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsBoolean(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "file": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "id": {
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

                case "media_type": {
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

                case "types": {
                    List<String> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<String> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            String optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = jsonAsString(element1, key);
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "uid": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

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
        return "MediaGalleryEntry";
    }

    /**
     * Details about the content of the media gallery item.
     */
    public ProductMediaGalleryEntriesContent getContent() {
        return (ProductMediaGalleryEntriesContent) get("content");
    }

    public MediaGalleryEntry setContent(ProductMediaGalleryEntriesContent arg) {
        optimisticData.put(getKey("content"), arg);
        return this;
    }

    /**
     * Indicates whether the image is hidden from view.
     */
    public Boolean getDisabled() {
        return (Boolean) get("disabled");
    }

    public MediaGalleryEntry setDisabled(Boolean arg) {
        optimisticData.put(getKey("disabled"), arg);
        return this;
    }

    /**
     * The path of the image on the server.
     */
    public String getFile() {
        return (String) get("file");
    }

    public MediaGalleryEntry setFile(String arg) {
        optimisticData.put(getKey("file"), arg);
        return this;
    }

    /**
     * The identifier assigned to the object.
     *
     * @deprecated Use `uid` instead.
     */
    @Deprecated
    public Integer getId() {
        return (Integer) get("id");
    }

    public MediaGalleryEntry setId(Integer arg) {
        optimisticData.put(getKey("id"), arg);
        return this;
    }

    /**
     * The alt text displayed on the storefront when the user points to the image.
     */
    public String getLabel() {
        return (String) get("label");
    }

    public MediaGalleryEntry setLabel(String arg) {
        optimisticData.put(getKey("label"), arg);
        return this;
    }

    /**
     * Either `image` or `video`.
     */
    public String getMediaType() {
        return (String) get("media_type");
    }

    public MediaGalleryEntry setMediaType(String arg) {
        optimisticData.put(getKey("media_type"), arg);
        return this;
    }

    /**
     * The media item&#39;s position after it has been sorted.
     */
    public Integer getPosition() {
        return (Integer) get("position");
    }

    public MediaGalleryEntry setPosition(Integer arg) {
        optimisticData.put(getKey("position"), arg);
        return this;
    }

    /**
     * Array of image types. It can have the following values: image, small_image, thumbnail.
     */
    public List<String> getTypes() {
        return (List<String>) get("types");
    }

    public MediaGalleryEntry setTypes(List<String> arg) {
        optimisticData.put(getKey("types"), arg);
        return this;
    }

    /**
     * The unique ID for a `MediaGalleryEntry` object.
     */
    public ID getUid() {
        return (ID) get("uid");
    }

    public MediaGalleryEntry setUid(ID arg) {
        optimisticData.put(getKey("uid"), arg);
        return this;
    }

    /**
     * Details about the content of a video item.
     */
    public ProductMediaGalleryEntriesVideoContent getVideoContent() {
        return (ProductMediaGalleryEntriesVideoContent) get("video_content");
    }

    public MediaGalleryEntry setVideoContent(ProductMediaGalleryEntriesVideoContent arg) {
        optimisticData.put(getKey("video_content"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "content":
                return true;

            case "disabled":
                return false;

            case "file":
                return false;

            case "id":
                return false;

            case "label":
                return false;

            case "media_type":
                return false;

            case "position":
                return false;

            case "types":
                return false;

            case "uid":
                return false;

            case "video_content":
                return true;

            default:
                return false;
        }
    }
}

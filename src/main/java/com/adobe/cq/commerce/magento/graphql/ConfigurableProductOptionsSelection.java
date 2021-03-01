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
 * Metadata corresponding to the configurable options selection.
 */
public class ConfigurableProductOptionsSelection extends AbstractResponse<ConfigurableProductOptionsSelection> {
    public ConfigurableProductOptionsSelection() {}

    public ConfigurableProductOptionsSelection(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "media_gallery": {
                    List<MediaGalleryInterface> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<MediaGalleryInterface> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            MediaGalleryInterface optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = UnknownMediaGalleryInterface.create(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "options_available_for_selection": {
                    List<ConfigurableOptionAvailableForSelection> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<ConfigurableOptionAvailableForSelection> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            ConfigurableOptionAvailableForSelection optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new ConfigurableOptionAvailableForSelection(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "variant": {
                    SimpleProduct optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new SimpleProduct(jsonAsObject(field.getValue(), key));
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
        return "ConfigurableProductOptionsSelection";
    }

    /**
     * Product images and videos corresponding to the specified configurable options selection.
     */
    public List<MediaGalleryInterface> getMediaGallery() {
        return (List<MediaGalleryInterface>) get("media_gallery");
    }

    public ConfigurableProductOptionsSelection setMediaGallery(List<MediaGalleryInterface> arg) {
        optimisticData.put(getKey("media_gallery"), arg);
        return this;
    }

    /**
     * Configurable options available for further selection based on current selection.
     */
    public List<ConfigurableOptionAvailableForSelection> getOptionsAvailableForSelection() {
        return (List<ConfigurableOptionAvailableForSelection>) get("options_available_for_selection");
    }

    public ConfigurableProductOptionsSelection setOptionsAvailableForSelection(List<ConfigurableOptionAvailableForSelection> arg) {
        optimisticData.put(getKey("options_available_for_selection"), arg);
        return this;
    }

    /**
     * Variant represented by the specified configurable options selection. It is expected to be null,
     * until selections are made for each configurable option.
     */
    public SimpleProduct getVariant() {
        return (SimpleProduct) get("variant");
    }

    public ConfigurableProductOptionsSelection setVariant(SimpleProduct arg) {
        optimisticData.put(getKey("variant"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "media_gallery":
                return false;

            case "options_available_for_selection":
                return true;

            case "variant":
                return true;

            default:
                return false;
        }
    }
}

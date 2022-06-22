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
 * A downloadable product wish list item.
 */
public class DownloadableWishlistItem extends AbstractResponse<DownloadableWishlistItem> implements WishlistItemInterface {
    public DownloadableWishlistItem() {}

    public DownloadableWishlistItem(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "added_at": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "customizable_options": {
                    List<SelectedCustomizableOption> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        SelectedCustomizableOption optional2 = null;
                        if (!element1.isJsonNull()) {
                            optional2 = new SelectedCustomizableOption(jsonAsObject(element1, key));
                        }

                        list1.add(optional2);
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "description": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "links_v2": {
                    List<DownloadableProductLinks> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<DownloadableProductLinks> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            DownloadableProductLinks optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new DownloadableProductLinks(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "product": {
                    ProductInterface optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = UnknownProductInterface.create(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "quantity": {
                    responseData.put(key, jsonAsDouble(field.getValue(), key));

                    break;
                }

                case "samples": {
                    List<DownloadableProductSamples> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<DownloadableProductSamples> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            DownloadableProductSamples optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new DownloadableProductSamples(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
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
        return "DownloadableWishlistItem";
    }

    /**
     * The date and time the item was added to the wish list.
     */
    public String getAddedAt() {
        return (String) get("added_at");
    }

    public DownloadableWishlistItem setAddedAt(String arg) {
        optimisticData.put(getKey("added_at"), arg);
        return this;
    }

    /**
     * Custom options selected for the wish list item.
     */
    public List<SelectedCustomizableOption> getCustomizableOptions() {
        return (List<SelectedCustomizableOption>) get("customizable_options");
    }

    public DownloadableWishlistItem setCustomizableOptions(List<SelectedCustomizableOption> arg) {
        optimisticData.put(getKey("customizable_options"), arg);
        return this;
    }

    /**
     * The description of the item.
     */
    public String getDescription() {
        return (String) get("description");
    }

    public DownloadableWishlistItem setDescription(String arg) {
        optimisticData.put(getKey("description"), arg);
        return this;
    }

    /**
     * The unique ID for a `WishlistItemInterface` object.
     */
    public ID getId() {
        return (ID) get("id");
    }

    public DownloadableWishlistItem setId(ID arg) {
        optimisticData.put(getKey("id"), arg);
        return this;
    }

    /**
     * An array containing information about the selected links.
     */
    public List<DownloadableProductLinks> getLinksV2() {
        return (List<DownloadableProductLinks>) get("links_v2");
    }

    public DownloadableWishlistItem setLinksV2(List<DownloadableProductLinks> arg) {
        optimisticData.put(getKey("links_v2"), arg);
        return this;
    }

    /**
     * Product details of the wish list item.
     */
    public ProductInterface getProduct() {
        return (ProductInterface) get("product");
    }

    public DownloadableWishlistItem setProduct(ProductInterface arg) {
        optimisticData.put(getKey("product"), arg);
        return this;
    }

    /**
     * The quantity of this wish list item.
     */
    public Double getQuantity() {
        return (Double) get("quantity");
    }

    public DownloadableWishlistItem setQuantity(Double arg) {
        optimisticData.put(getKey("quantity"), arg);
        return this;
    }

    /**
     * An array containing information about the selected samples.
     */
    public List<DownloadableProductSamples> getSamples() {
        return (List<DownloadableProductSamples>) get("samples");
    }

    public DownloadableWishlistItem setSamples(List<DownloadableProductSamples> arg) {
        optimisticData.put(getKey("samples"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "added_at":
                return false;

            case "customizable_options":
                return true;

            case "description":
                return false;

            case "id":
                return false;

            case "links_v2":
                return true;

            case "product":
                return false;

            case "quantity":
                return false;

            case "samples":
                return true;

            default:
                return false;
        }
    }
}

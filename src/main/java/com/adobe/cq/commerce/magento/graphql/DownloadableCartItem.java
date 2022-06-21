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
 * An implementation for downloadable product cart items.
 */
public class DownloadableCartItem extends AbstractResponse<DownloadableCartItem> implements CartItemInterface {
    public DownloadableCartItem() {}

    public DownloadableCartItem(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
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

                case "id": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "links": {
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

                case "prices": {
                    CartItemPrices optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CartItemPrices(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "product": {
                    responseData.put(key, UnknownProductInterface.create(jsonAsObject(field.getValue(), key)));

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
        return "DownloadableCartItem";
    }

    /**
     * An array containing the customizable options the shopper selected.
     */
    public List<SelectedCustomizableOption> getCustomizableOptions() {
        return (List<SelectedCustomizableOption>) get("customizable_options");
    }

    public DownloadableCartItem setCustomizableOptions(List<SelectedCustomizableOption> arg) {
        optimisticData.put(getKey("customizable_options"), arg);
        return this;
    }

    /**
     * @deprecated Use `uid` instead.
     */
    @Deprecated
    public String getId() {
        return (String) get("id");
    }

    public DownloadableCartItem setId(String arg) {
        optimisticData.put(getKey("id"), arg);
        return this;
    }

    /**
     * An array containing information about the links for the downloadable product added to the cart.
     */
    public List<DownloadableProductLinks> getLinks() {
        return (List<DownloadableProductLinks>) get("links");
    }

    public DownloadableCartItem setLinks(List<DownloadableProductLinks> arg) {
        optimisticData.put(getKey("links"), arg);
        return this;
    }

    /**
     * Contains details about the price of the item, including taxes and discounts.
     */
    public CartItemPrices getPrices() {
        return (CartItemPrices) get("prices");
    }

    public DownloadableCartItem setPrices(CartItemPrices arg) {
        optimisticData.put(getKey("prices"), arg);
        return this;
    }

    /**
     * Details about an item in the cart.
     */
    public ProductInterface getProduct() {
        return (ProductInterface) get("product");
    }

    public DownloadableCartItem setProduct(ProductInterface arg) {
        optimisticData.put(getKey("product"), arg);
        return this;
    }

    /**
     * The quantity of this item in the cart.
     */
    public Double getQuantity() {
        return (Double) get("quantity");
    }

    public DownloadableCartItem setQuantity(Double arg) {
        optimisticData.put(getKey("quantity"), arg);
        return this;
    }

    /**
     * An array containing information about samples of the selected downloadable product.
     */
    public List<DownloadableProductSamples> getSamples() {
        return (List<DownloadableProductSamples>) get("samples");
    }

    public DownloadableCartItem setSamples(List<DownloadableProductSamples> arg) {
        optimisticData.put(getKey("samples"), arg);
        return this;
    }

    /**
     * The unique ID for a `CartItemInterface` object.
     */
    public ID getUid() {
        return (ID) get("uid");
    }

    public DownloadableCartItem setUid(ID arg) {
        optimisticData.put(getKey("uid"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "customizable_options":
                return true;

            case "id":
                return false;

            case "links":
                return true;

            case "prices":
                return true;

            case "product":
                return false;

            case "quantity":
                return false;

            case "samples":
                return true;

            case "uid":
                return false;

            default:
                return false;
        }
    }
}

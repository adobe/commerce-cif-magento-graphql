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
 * An implementation for configurable product cart items.
 */
public class ConfigurableCartItem extends AbstractResponse<ConfigurableCartItem> implements CartItemInterface {
    public ConfigurableCartItem() {}

    public ConfigurableCartItem(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "available_gift_wrapping": {
                    List<GiftWrapping> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        GiftWrapping optional2 = null;
                        if (!element1.isJsonNull()) {
                            optional2 = new GiftWrapping(jsonAsObject(element1, key));
                        }

                        list1.add(optional2);
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "configurable_options": {
                    List<SelectedConfigurableOption> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        SelectedConfigurableOption optional2 = null;
                        if (!element1.isJsonNull()) {
                            optional2 = new SelectedConfigurableOption(jsonAsObject(element1, key));
                        }

                        list1.add(optional2);
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "configured_variant": {
                    responseData.put(key, UnknownProductInterface.create(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "customizable_options": {
                    List<SelectedCustomizableOption> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<SelectedCustomizableOption> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            SelectedCustomizableOption optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new SelectedCustomizableOption(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "gift_message": {
                    GiftMessage optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new GiftMessage(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "gift_wrapping": {
                    GiftWrapping optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new GiftWrapping(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "id": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

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
        return "ConfigurableCartItem";
    }

    /**
     * The list of available gift wrapping options for the cart item.
     */
    public List<GiftWrapping> getAvailableGiftWrapping() {
        return (List<GiftWrapping>) get("available_gift_wrapping");
    }

    public ConfigurableCartItem setAvailableGiftWrapping(List<GiftWrapping> arg) {
        optimisticData.put(getKey("available_gift_wrapping"), arg);
        return this;
    }

    /**
     * An array containing the configuranle options the shopper selected.
     */
    public List<SelectedConfigurableOption> getConfigurableOptions() {
        return (List<SelectedConfigurableOption>) get("configurable_options");
    }

    public ConfigurableCartItem setConfigurableOptions(List<SelectedConfigurableOption> arg) {
        optimisticData.put(getKey("configurable_options"), arg);
        return this;
    }

    /**
     * Product details of the cart item.
     */
    public ProductInterface getConfiguredVariant() {
        return (ProductInterface) get("configured_variant");
    }

    public ConfigurableCartItem setConfiguredVariant(ProductInterface arg) {
        optimisticData.put(getKey("configured_variant"), arg);
        return this;
    }

    /**
     * An array containing the customizable options the shopper selected.
     */
    public List<SelectedCustomizableOption> getCustomizableOptions() {
        return (List<SelectedCustomizableOption>) get("customizable_options");
    }

    public ConfigurableCartItem setCustomizableOptions(List<SelectedCustomizableOption> arg) {
        optimisticData.put(getKey("customizable_options"), arg);
        return this;
    }

    /**
     * The entered gift message for the cart item
     */
    public GiftMessage getGiftMessage() {
        return (GiftMessage) get("gift_message");
    }

    public ConfigurableCartItem setGiftMessage(GiftMessage arg) {
        optimisticData.put(getKey("gift_message"), arg);
        return this;
    }

    /**
     * The selected gift wrapping for the cart item.
     */
    public GiftWrapping getGiftWrapping() {
        return (GiftWrapping) get("gift_wrapping");
    }

    public ConfigurableCartItem setGiftWrapping(GiftWrapping arg) {
        optimisticData.put(getKey("gift_wrapping"), arg);
        return this;
    }

    /**
     * @deprecated Use `uid` instead.
     */
    @Deprecated
    public String getId() {
        return (String) get("id");
    }

    public ConfigurableCartItem setId(String arg) {
        optimisticData.put(getKey("id"), arg);
        return this;
    }

    /**
     * Contains details about the price of the item, including taxes and discounts.
     */
    public CartItemPrices getPrices() {
        return (CartItemPrices) get("prices");
    }

    public ConfigurableCartItem setPrices(CartItemPrices arg) {
        optimisticData.put(getKey("prices"), arg);
        return this;
    }

    /**
     * Details about an item in the cart.
     */
    public ProductInterface getProduct() {
        return (ProductInterface) get("product");
    }

    public ConfigurableCartItem setProduct(ProductInterface arg) {
        optimisticData.put(getKey("product"), arg);
        return this;
    }

    /**
     * The quantity of this item in the cart.
     */
    public Double getQuantity() {
        return (Double) get("quantity");
    }

    public ConfigurableCartItem setQuantity(Double arg) {
        optimisticData.put(getKey("quantity"), arg);
        return this;
    }

    /**
     * The unique ID for a `CartItemInterface` object.
     */
    public ID getUid() {
        return (ID) get("uid");
    }

    public ConfigurableCartItem setUid(ID arg) {
        optimisticData.put(getKey("uid"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "available_gift_wrapping":
                return true;

            case "configurable_options":
                return true;

            case "configured_variant":
                return false;

            case "customizable_options":
                return true;

            case "gift_message":
                return true;

            case "gift_wrapping":
                return true;

            case "id":
                return false;

            case "prices":
                return true;

            case "product":
                return false;

            case "quantity":
                return false;

            case "uid":
                return false;

            default:
                return false;
        }
    }
}

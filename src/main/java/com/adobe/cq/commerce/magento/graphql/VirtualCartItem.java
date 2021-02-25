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
 * Virtual Cart Item
 */
public class VirtualCartItem extends AbstractResponse<VirtualCartItem> implements CartItemInterface {
    public VirtualCartItem() {}

    public VirtualCartItem(JsonObject fields) throws SchemaViolationError {
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
        return "VirtualCartItem";
    }

    public List<SelectedCustomizableOption> getCustomizableOptions() {
        return (List<SelectedCustomizableOption>) get("customizable_options");
    }

    public VirtualCartItem setCustomizableOptions(List<SelectedCustomizableOption> arg) {
        optimisticData.put(getKey("customizable_options"), arg);
        return this;
    }

    /**
     * @deprecated Use `uid` instead
     */
    @Deprecated
    public String getId() {
        return (String) get("id");
    }

    public VirtualCartItem setId(String arg) {
        optimisticData.put(getKey("id"), arg);
        return this;
    }

    public CartItemPrices getPrices() {
        return (CartItemPrices) get("prices");
    }

    public VirtualCartItem setPrices(CartItemPrices arg) {
        optimisticData.put(getKey("prices"), arg);
        return this;
    }

    public ProductInterface getProduct() {
        return (ProductInterface) get("product");
    }

    public VirtualCartItem setProduct(ProductInterface arg) {
        optimisticData.put(getKey("product"), arg);
        return this;
    }

    public Double getQuantity() {
        return (Double) get("quantity");
    }

    public VirtualCartItem setQuantity(Double arg) {
        optimisticData.put(getKey("quantity"), arg);
        return this;
    }

    /**
     * The unique ID for a `CartItemInterface` object
     */
    public ID getUid() {
        return (ID) get("uid");
    }

    public VirtualCartItem setUid(ID arg) {
        optimisticData.put(getKey("uid"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "customizable_options":
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

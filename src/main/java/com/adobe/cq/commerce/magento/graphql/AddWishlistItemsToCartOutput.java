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

public class AddWishlistItemsToCartOutput extends AbstractResponse<AddWishlistItemsToCartOutput> {
    public AddWishlistItemsToCartOutput() {}

    public AddWishlistItemsToCartOutput(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "add_wishlist_items_to_cart_user_errors": {
                    List<WishlistCartUserInputError> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        WishlistCartUserInputError optional2 = null;
                        if (!element1.isJsonNull()) {
                            optional2 = new WishlistCartUserInputError(jsonAsObject(element1, key));
                        }

                        list1.add(optional2);
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "status": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "wishlist": {
                    responseData.put(key, new Wishlist(jsonAsObject(field.getValue(), key)));

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
        return "AddWishlistItemsToCartOutput";
    }

    /**
     * An array of errors encountered while adding products to the customer&#39;s cart
     */
    public List<WishlistCartUserInputError> getAddWishlistItemsToCartUserErrors() {
        return (List<WishlistCartUserInputError>) get("add_wishlist_items_to_cart_user_errors");
    }

    public AddWishlistItemsToCartOutput setAddWishlistItemsToCartUserErrors(List<WishlistCartUserInputError> arg) {
        optimisticData.put(getKey("add_wishlist_items_to_cart_user_errors"), arg);
        return this;
    }

    /**
     * Indicates whether the attempt to add items to the customer&#39;s cart was successful
     */
    public Boolean getStatus() {
        return (Boolean) get("status");
    }

    public AddWishlistItemsToCartOutput setStatus(Boolean arg) {
        optimisticData.put(getKey("status"), arg);
        return this;
    }

    /**
     * Contains the wish list with all items that were successfully added
     */
    public Wishlist getWishlist() {
        return (Wishlist) get("wishlist");
    }

    public AddWishlistItemsToCartOutput setWishlist(Wishlist arg) {
        optimisticData.put(getKey("wishlist"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "add_wishlist_items_to_cart_user_errors":
                return true;

            case "status":
                return false;

            case "wishlist":
                return true;

            default:
                return false;
        }
    }
}

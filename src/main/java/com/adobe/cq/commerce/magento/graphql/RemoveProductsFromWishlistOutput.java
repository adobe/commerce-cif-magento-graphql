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
 * Contains the customer&#39;s wish list and any errors encountered
 */
public class RemoveProductsFromWishlistOutput extends AbstractResponse<RemoveProductsFromWishlistOutput> {
    public RemoveProductsFromWishlistOutput() {
    }

    public RemoveProductsFromWishlistOutput(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "user_errors": {
                    List<WishListUserInputError> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        WishListUserInputError optional2 = null;
                        if (!element1.isJsonNull()) {
                            optional2 = new WishListUserInputError(jsonAsObject(element1, key));
                        }

                        list1.add(optional2);
                    }

                    responseData.put(key, list1);

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
        return "RemoveProductsFromWishlistOutput";
    }

    /**
     * An array of errors encountered while deleting products from a wish list
     */
    public List<WishListUserInputError> getUserErrors() {
        return (List<WishListUserInputError>) get("user_errors");
    }

    public RemoveProductsFromWishlistOutput setUserErrors(List<WishListUserInputError> arg) {
        optimisticData.put(getKey("user_errors"), arg);
        return this;
    }

    /**
     * Contains the wish list with after items were successfully deleted
     */
    public Wishlist getWishlist() {
        return (Wishlist) get("wishlist");
    }

    public RemoveProductsFromWishlistOutput setWishlist(Wishlist arg) {
        optimisticData.put(getKey("wishlist"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "user_errors": return true;

            case "wishlist": return true;

            default: return false;
        }
    }
}

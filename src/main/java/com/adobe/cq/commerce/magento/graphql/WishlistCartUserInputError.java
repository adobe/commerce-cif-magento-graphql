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
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;

/**
 * Contains details about errors encountered when a customer added wish list items to the cart.
 */
public class WishlistCartUserInputError extends AbstractResponse<WishlistCartUserInputError> {
    public WishlistCartUserInputError() {}

    public WishlistCartUserInputError(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "code": {
                    responseData.put(key, WishlistCartUserInputErrorType.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "message": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "wishlistId": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "wishlistItemId": {
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
        return "WishlistCartUserInputError";
    }

    /**
     * An error code that describes the error encountered.
     */
    public WishlistCartUserInputErrorType getCode() {
        return (WishlistCartUserInputErrorType) get("code");
    }

    public WishlistCartUserInputError setCode(WishlistCartUserInputErrorType arg) {
        optimisticData.put(getKey("code"), arg);
        return this;
    }

    /**
     * A localized error message.
     */
    public String getMessage() {
        return (String) get("message");
    }

    public WishlistCartUserInputError setMessage(String arg) {
        optimisticData.put(getKey("message"), arg);
        return this;
    }

    /**
     * The unique ID of the `Wishlist` object containing an error.
     */
    public ID getWishlistId() {
        return (ID) get("wishlistId");
    }

    public WishlistCartUserInputError setWishlistId(ID arg) {
        optimisticData.put(getKey("wishlistId"), arg);
        return this;
    }

    /**
     * The unique ID of the wish list item containing an error.
     */
    public ID getWishlistItemId() {
        return (ID) get("wishlistItemId");
    }

    public WishlistCartUserInputError setWishlistItemId(ID arg) {
        optimisticData.put(getKey("wishlistItemId"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "code":
                return false;

            case "message":
                return false;

            case "wishlistId":
                return false;

            case "wishlistItemId":
                return false;

            default:
                return false;
        }
    }
}

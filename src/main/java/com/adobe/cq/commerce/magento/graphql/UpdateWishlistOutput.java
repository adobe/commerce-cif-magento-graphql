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
 * Contains the name and visibility of an updated wish list.
 */
public class UpdateWishlistOutput extends AbstractResponse<UpdateWishlistOutput> {
    public UpdateWishlistOutput() {}

    public UpdateWishlistOutput(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "name": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "uid": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "visibility": {
                    responseData.put(key, WishlistVisibilityEnum.fromGraphQl(jsonAsString(field.getValue(), key)));

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
        return "UpdateWishlistOutput";
    }

    /**
     * The wish list name.
     */
    public String getName() {
        return (String) get("name");
    }

    public UpdateWishlistOutput setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    /**
     * The unique ID of a `Wishlist` object.
     */
    public ID getUid() {
        return (ID) get("uid");
    }

    public UpdateWishlistOutput setUid(ID arg) {
        optimisticData.put(getKey("uid"), arg);
        return this;
    }

    /**
     * Indicates whether the wish list is public or private.
     */
    public WishlistVisibilityEnum getVisibility() {
        return (WishlistVisibilityEnum) get("visibility");
    }

    public UpdateWishlistOutput setVisibility(WishlistVisibilityEnum arg) {
        optimisticData.put(getKey("visibility"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "name":
                return false;

            case "uid":
                return false;

            case "visibility":
                return false;

            default:
                return false;
        }
    }
}

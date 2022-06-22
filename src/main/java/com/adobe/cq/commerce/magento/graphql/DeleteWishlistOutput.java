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
 * Contains the status of the request to delete a wish list and an array of the customer&#39;s remaining
 * wish lists.
 */
public class DeleteWishlistOutput extends AbstractResponse<DeleteWishlistOutput> {
    public DeleteWishlistOutput() {}

    public DeleteWishlistOutput(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "status": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "wishlists": {
                    List<Wishlist> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        Wishlist optional2 = null;
                        if (!element1.isJsonNull()) {
                            optional2 = new Wishlist(jsonAsObject(element1, key));
                        }

                        list1.add(optional2);
                    }

                    responseData.put(key, list1);

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
        return "DeleteWishlistOutput";
    }

    /**
     * Indicates whether the wish list was deleted.
     */
    public Boolean getStatus() {
        return (Boolean) get("status");
    }

    public DeleteWishlistOutput setStatus(Boolean arg) {
        optimisticData.put(getKey("status"), arg);
        return this;
    }

    /**
     * A list of undeleted wish lists.
     */
    public List<Wishlist> getWishlists() {
        return (List<Wishlist>) get("wishlists");
    }

    public DeleteWishlistOutput setWishlists(List<Wishlist> arg) {
        optimisticData.put(getKey("wishlists"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "status":
                return false;

            case "wishlists":
                return true;

            default:
                return false;
        }
    }
}

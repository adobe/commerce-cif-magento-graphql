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
 * Deprecated: `Wishlist` type should be used instead
 */
public class WishlistOutput extends AbstractResponse<WishlistOutput> {
    public WishlistOutput() {
    }

    public WishlistOutput(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "items": {
                    List<WishlistItem> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<WishlistItem> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            WishlistItem optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new WishlistItem(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "items_count": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "name": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "sharing_code": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "updated_at": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
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
        return "WishlistOutput";
    }

    /**
     * An array of items in the customer&#39;s wish list
     *
     * @deprecated Use field `items` from type `Wishlist` instead
     */
    @Deprecated
    public List<WishlistItem> getItems() {
        return (List<WishlistItem>) get("items");
    }

    public WishlistOutput setItems(List<WishlistItem> arg) {
        optimisticData.put(getKey("items"), arg);
        return this;
    }

    /**
     * The number of items in the wish list
     *
     * @deprecated Use field `items_count` from type `Wishlist` instead
     */
    @Deprecated
    public Integer getItemsCount() {
        return (Integer) get("items_count");
    }

    public WishlistOutput setItemsCount(Integer arg) {
        optimisticData.put(getKey("items_count"), arg);
        return this;
    }

    /**
     * When multiple wish lists are enabled, the name the customer assigns to the wishlist
     *
     * @deprecated This field is related to Commerce functionality and is always `null` in Open Source edition
     */
    @Deprecated
    public String getName() {
        return (String) get("name");
    }

    public WishlistOutput setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    /**
     * An encrypted code that Magento uses to link to the wish list
     *
     * @deprecated Use field `sharing_code` from type `Wishlist` instead
     */
    @Deprecated
    public String getSharingCode() {
        return (String) get("sharing_code");
    }

    public WishlistOutput setSharingCode(String arg) {
        optimisticData.put(getKey("sharing_code"), arg);
        return this;
    }

    /**
     * The time of the last modification to the wish list
     *
     * @deprecated Use field `updated_at` from type `Wishlist` instead
     */
    @Deprecated
    public String getUpdatedAt() {
        return (String) get("updated_at");
    }

    public WishlistOutput setUpdatedAt(String arg) {
        optimisticData.put(getKey("updated_at"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "items": return true;

            case "items_count": return false;

            case "name": return false;

            case "sharing_code": return false;

            case "updated_at": return false;

            default: return false;
        }
    }
}

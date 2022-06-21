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
 * Contains the customer&#39;s gift registry and any errors encountered.
 */
public class MoveCartItemsToGiftRegistryOutput extends AbstractResponse<MoveCartItemsToGiftRegistryOutput> implements
    GiftRegistryItemUserErrorInterface, GiftRegistryOutputInterface {
    public MoveCartItemsToGiftRegistryOutput() {}

    public MoveCartItemsToGiftRegistryOutput(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "gift_registry": {
                    GiftRegistry optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new GiftRegistry(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "status": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "user_errors": {
                    List<GiftRegistryItemsUserError> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        GiftRegistryItemsUserError optional2 = null;
                        if (!element1.isJsonNull()) {
                            optional2 = new GiftRegistryItemsUserError(jsonAsObject(element1, key));
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
        return "MoveCartItemsToGiftRegistryOutput";
    }

    /**
     * The gift registry.
     */
    public GiftRegistry getGiftRegistry() {
        return (GiftRegistry) get("gift_registry");
    }

    public MoveCartItemsToGiftRegistryOutput setGiftRegistry(GiftRegistry arg) {
        optimisticData.put(getKey("gift_registry"), arg);
        return this;
    }

    /**
     * Indicates whether the attempt to move the cart items to the gift registry was successful.
     */
    public Boolean getStatus() {
        return (Boolean) get("status");
    }

    public MoveCartItemsToGiftRegistryOutput setStatus(Boolean arg) {
        optimisticData.put(getKey("status"), arg);
        return this;
    }

    /**
     * An array of errors encountered while moving items from the cart to the gift registry.
     */
    public List<GiftRegistryItemsUserError> getUserErrors() {
        return (List<GiftRegistryItemsUserError>) get("user_errors");
    }

    public MoveCartItemsToGiftRegistryOutput setUserErrors(List<GiftRegistryItemsUserError> arg) {
        optimisticData.put(getKey("user_errors"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "gift_registry":
                return true;

            case "status":
                return false;

            case "user_errors":
                return true;

            default:
                return false;
        }
    }
}

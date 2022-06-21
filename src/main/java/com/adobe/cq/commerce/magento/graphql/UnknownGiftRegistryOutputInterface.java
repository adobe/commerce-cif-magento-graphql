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
import com.shopify.graphql.support.SchemaViolationError;

/**
 * Contains the customer&#39;s gift registry.
 */
public class UnknownGiftRegistryOutputInterface extends AbstractResponse<UnknownGiftRegistryOutputInterface> implements
    GiftRegistryOutputInterface {
    public UnknownGiftRegistryOutputInterface() {}

    public UnknownGiftRegistryOutputInterface(JsonObject fields) throws SchemaViolationError {
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

    public static GiftRegistryOutputInterface create(JsonObject fields) throws SchemaViolationError {
        String typeName = fields.getAsJsonPrimitive("__typename").getAsString();
        switch (typeName) {
            case "GiftRegistryOutput": {
                return new GiftRegistryOutput(fields);
            }

            case "MoveCartItemsToGiftRegistryOutput": {
                return new MoveCartItemsToGiftRegistryOutput(fields);
            }

            default: {
                return new UnknownGiftRegistryOutputInterface(fields);
            }
        }
    }

    public String getGraphQlTypeName() {
        return (String) get("__typename");
    }

    /**
     * The gift registry.
     */
    public GiftRegistry getGiftRegistry() {
        return (GiftRegistry) get("gift_registry");
    }

    public UnknownGiftRegistryOutputInterface setGiftRegistry(GiftRegistry arg) {
        optimisticData.put(getKey("gift_registry"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "gift_registry":
                return true;

            default:
                return false;
        }
    }
}

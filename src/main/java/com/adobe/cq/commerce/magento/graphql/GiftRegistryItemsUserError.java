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

public class GiftRegistryItemsUserError extends AbstractResponse<GiftRegistryItemsUserError> {
    public GiftRegistryItemsUserError() {}

    public GiftRegistryItemsUserError(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "code": {
                    responseData.put(key, GiftRegistryItemsUserErrorType.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "gift_registry_item_uid": {
                    ID optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ID(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "gift_registry_uid": {
                    ID optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ID(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "message": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "product_uid": {
                    ID optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ID(jsonAsString(field.getValue(), key));
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
        return "GiftRegistryItemsUserError";
    }

    /**
     * An error code that describes the error encountered
     */
    public GiftRegistryItemsUserErrorType getCode() {
        return (GiftRegistryItemsUserErrorType) get("code");
    }

    public GiftRegistryItemsUserError setCode(GiftRegistryItemsUserErrorType arg) {
        optimisticData.put(getKey("code"), arg);
        return this;
    }

    /**
     * The unique ID of the gift registry item containing an error
     */
    public ID getGiftRegistryItemUid() {
        return (ID) get("gift_registry_item_uid");
    }

    public GiftRegistryItemsUserError setGiftRegistryItemUid(ID arg) {
        optimisticData.put(getKey("gift_registry_item_uid"), arg);
        return this;
    }

    /**
     * The unique ID of the `Gift registry` object containing an error
     */
    public ID getGiftRegistryUid() {
        return (ID) get("gift_registry_uid");
    }

    public GiftRegistryItemsUserError setGiftRegistryUid(ID arg) {
        optimisticData.put(getKey("gift_registry_uid"), arg);
        return this;
    }

    /**
     * A localized error message
     */
    public String getMessage() {
        return (String) get("message");
    }

    public GiftRegistryItemsUserError setMessage(String arg) {
        optimisticData.put(getKey("message"), arg);
        return this;
    }

    /**
     * The unique ID of the product containing an error
     */
    public ID getProductUid() {
        return (ID) get("product_uid");
    }

    public GiftRegistryItemsUserError setProductUid(ID arg) {
        optimisticData.put(getKey("product_uid"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "code":
                return false;

            case "gift_registry_item_uid":
                return false;

            case "gift_registry_uid":
                return false;

            case "message":
                return false;

            case "product_uid":
                return false;

            default:
                return false;
        }
    }
}

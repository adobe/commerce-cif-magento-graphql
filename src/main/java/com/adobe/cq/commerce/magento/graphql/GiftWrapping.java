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
 * Contains details about the selected or available gift wrapping options.
 */
public class GiftWrapping extends AbstractResponse<GiftWrapping> {
    public GiftWrapping() {}

    public GiftWrapping(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "design": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "image": {
                    GiftWrappingImage optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new GiftWrappingImage(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "price": {
                    responseData.put(key, new Money(jsonAsObject(field.getValue(), key)));

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
        return "GiftWrapping";
    }

    /**
     * The name of the gift wrapping design.
     */
    public String getDesign() {
        return (String) get("design");
    }

    public GiftWrapping setDesign(String arg) {
        optimisticData.put(getKey("design"), arg);
        return this;
    }

    /**
     * The unique ID for a `GiftWrapping` object.
     *
     * @deprecated Use `uid` instead
     */
    @Deprecated
    public ID getId() {
        return (ID) get("id");
    }

    public GiftWrapping setId(ID arg) {
        optimisticData.put(getKey("id"), arg);
        return this;
    }

    /**
     * The preview image for a gift wrapping option.
     */
    public GiftWrappingImage getImage() {
        return (GiftWrappingImage) get("image");
    }

    public GiftWrapping setImage(GiftWrappingImage arg) {
        optimisticData.put(getKey("image"), arg);
        return this;
    }

    /**
     * The gift wrapping price.
     */
    public Money getPrice() {
        return (Money) get("price");
    }

    public GiftWrapping setPrice(Money arg) {
        optimisticData.put(getKey("price"), arg);
        return this;
    }

    /**
     * The unique ID for a `GiftWrapping` object.
     */
    public ID getUid() {
        return (ID) get("uid");
    }

    public GiftWrapping setUid(ID arg) {
        optimisticData.put(getKey("uid"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "design":
                return false;

            case "id":
                return false;

            case "image":
                return true;

            case "price":
                return true;

            case "uid":
                return false;

            default:
                return false;
        }
    }
}

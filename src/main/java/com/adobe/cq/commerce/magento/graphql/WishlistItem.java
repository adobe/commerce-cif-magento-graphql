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
 * Contains details about a wish list item.
 */
public class WishlistItem extends AbstractResponse<WishlistItem> {
    public WishlistItem() {}

    public WishlistItem(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "added_at": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "description": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "id": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "product": {
                    ProductInterface optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = UnknownProductInterface.create(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "qty": {
                    Double optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsDouble(field.getValue(), key);
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
        return "WishlistItem";
    }

    /**
     * The time when the customer added the item to the wish list.
     */
    public String getAddedAt() {
        return (String) get("added_at");
    }

    public WishlistItem setAddedAt(String arg) {
        optimisticData.put(getKey("added_at"), arg);
        return this;
    }

    /**
     * The customer&#39;s comment about this item.
     */
    public String getDescription() {
        return (String) get("description");
    }

    public WishlistItem setDescription(String arg) {
        optimisticData.put(getKey("description"), arg);
        return this;
    }

    /**
     * The unique ID for a `WishlistItem` object.
     */
    public Integer getId() {
        return (Integer) get("id");
    }

    public WishlistItem setId(Integer arg) {
        optimisticData.put(getKey("id"), arg);
        return this;
    }

    /**
     * Details about the wish list item.
     */
    public ProductInterface getProduct() {
        return (ProductInterface) get("product");
    }

    public WishlistItem setProduct(ProductInterface arg) {
        optimisticData.put(getKey("product"), arg);
        return this;
    }

    /**
     * The quantity of this wish list item
     */
    public Double getQty() {
        return (Double) get("qty");
    }

    public WishlistItem setQty(Double arg) {
        optimisticData.put(getKey("qty"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "added_at":
                return false;

            case "description":
                return false;

            case "id":
                return false;

            case "product":
                return false;

            case "qty":
                return false;

            default:
                return false;
        }
    }
}

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

public class UnknownGiftRegistryItemInterface extends AbstractResponse<UnknownGiftRegistryItemInterface> implements
    GiftRegistryItemInterface {
    public UnknownGiftRegistryItemInterface() {}

    public UnknownGiftRegistryItemInterface(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "created_at": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "note": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
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

                case "quantity": {
                    responseData.put(key, jsonAsDouble(field.getValue(), key));

                    break;
                }

                case "quantity_fulfilled": {
                    responseData.put(key, jsonAsDouble(field.getValue(), key));

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

    public static GiftRegistryItemInterface create(JsonObject fields) throws SchemaViolationError {
        String typeName = fields.getAsJsonPrimitive("__typename").getAsString();
        switch (typeName) {
            case "GiftRegistryItem": {
                return new GiftRegistryItem(fields);
            }

            default: {
                return new UnknownGiftRegistryItemInterface(fields);
            }
        }
    }

    public String getGraphQlTypeName() {
        return (String) get("__typename");
    }

    /**
     * The date the product was added to the gift registry
     */
    public String getCreatedAt() {
        return (String) get("created_at");
    }

    public UnknownGiftRegistryItemInterface setCreatedAt(String arg) {
        optimisticData.put(getKey("created_at"), arg);
        return this;
    }

    /**
     * A brief message about the gift registry item
     */
    public String getNote() {
        return (String) get("note");
    }

    public UnknownGiftRegistryItemInterface setNote(String arg) {
        optimisticData.put(getKey("note"), arg);
        return this;
    }

    public ProductInterface getProduct() {
        return (ProductInterface) get("product");
    }

    public UnknownGiftRegistryItemInterface setProduct(ProductInterface arg) {
        optimisticData.put(getKey("product"), arg);
        return this;
    }

    /**
     * The requested quantity of the product
     */
    public Double getQuantity() {
        return (Double) get("quantity");
    }

    public UnknownGiftRegistryItemInterface setQuantity(Double arg) {
        optimisticData.put(getKey("quantity"), arg);
        return this;
    }

    /**
     * The fulfilled quantity of the product
     */
    public Double getQuantityFulfilled() {
        return (Double) get("quantity_fulfilled");
    }

    public UnknownGiftRegistryItemInterface setQuantityFulfilled(Double arg) {
        optimisticData.put(getKey("quantity_fulfilled"), arg);
        return this;
    }

    /**
     * The unique ID of a gift registry item
     */
    public ID getUid() {
        return (ID) get("uid");
    }

    public UnknownGiftRegistryItemInterface setUid(ID arg) {
        optimisticData.put(getKey("uid"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "created_at":
                return false;

            case "note":
                return false;

            case "product":
                return false;

            case "quantity":
                return false;

            case "quantity_fulfilled":
                return false;

            case "uid":
                return false;

            default:
                return false;
        }
    }
}

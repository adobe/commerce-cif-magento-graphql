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
 * Deprecated: The `ShippingCartAddress.cart_items` field now returns `CartItemInterface`.
 */
public class CartItemQuantity extends AbstractResponse<CartItemQuantity> {
    public CartItemQuantity() {}

    public CartItemQuantity(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "cart_item_id": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

                    break;
                }

                case "quantity": {
                    responseData.put(key, jsonAsDouble(field.getValue(), key));

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
        return "CartItemQuantity";
    }

    /**
     * @deprecated The `ShippingCartAddress.cart_items` field now returns `CartItemInterface`.
     */
    @Deprecated
    public Integer getCartItemId() {
        return (Integer) get("cart_item_id");
    }

    public CartItemQuantity setCartItemId(Integer arg) {
        optimisticData.put(getKey("cart_item_id"), arg);
        return this;
    }

    /**
     * @deprecated The `ShippingCartAddress.cart_items` field now returns `CartItemInterface`.
     */
    @Deprecated
    public Double getQuantity() {
        return (Double) get("quantity");
    }

    public CartItemQuantity setQuantity(Double arg) {
        optimisticData.put(getKey("quantity"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "cart_item_id":
                return false;

            case "quantity":
                return false;

            default:
                return false;
        }
    }
}

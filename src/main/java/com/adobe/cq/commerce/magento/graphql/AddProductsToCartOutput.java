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

public class AddProductsToCartOutput extends AbstractResponse<AddProductsToCartOutput> {
    public AddProductsToCartOutput() {}

    public AddProductsToCartOutput(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "cart": {
                    responseData.put(key, new Cart(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "user_errors": {
                    List<CartUserInputError> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        CartUserInputError optional2 = null;
                        if (!element1.isJsonNull()) {
                            optional2 = new CartUserInputError(jsonAsObject(element1, key));
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
        return "AddProductsToCartOutput";
    }

    /**
     * The cart after products have been added
     */
    public Cart getCart() {
        return (Cart) get("cart");
    }

    public AddProductsToCartOutput setCart(Cart arg) {
        optimisticData.put(getKey("cart"), arg);
        return this;
    }

    /**
     * An error encountered while adding an item to the cart.
     */
    public List<CartUserInputError> getUserErrors() {
        return (List<CartUserInputError>) get("user_errors");
    }

    public AddProductsToCartOutput setUserErrors(List<CartUserInputError> arg) {
        optimisticData.put(getKey("user_errors"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "cart":
                return true;

            case "user_errors":
                return true;

            default:
                return false;
        }
    }
}

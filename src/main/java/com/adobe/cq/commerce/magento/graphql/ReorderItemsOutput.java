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

public class ReorderItemsOutput extends AbstractResponse<ReorderItemsOutput> {
    public ReorderItemsOutput() {
    }

    public ReorderItemsOutput(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "cart": {
                    responseData.put(key, new Cart(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "userInputErrors": {
                    List<CheckoutUserInputError> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        CheckoutUserInputError optional2 = null;
                        if (!element1.isJsonNull()) {
                            optional2 = new CheckoutUserInputError(jsonAsObject(element1, key));
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
        return "ReorderItemsOutput";
    }

    /**
     * Contains detailed information about the customer&#39;s cart.
     */
    public Cart getCart() {
        return (Cart) get("cart");
    }

    public ReorderItemsOutput setCart(Cart arg) {
        optimisticData.put(getKey("cart"), arg);
        return this;
    }

    /**
     * An array of reordering errors.
     */
    public List<CheckoutUserInputError> getUserInputErrors() {
        return (List<CheckoutUserInputError>) get("userInputErrors");
    }

    public ReorderItemsOutput setUserInputErrors(List<CheckoutUserInputError> arg) {
        optimisticData.put(getKey("userInputErrors"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "cart": return true;

            case "userInputErrors": return true;

            default: return false;
        }
    }
}


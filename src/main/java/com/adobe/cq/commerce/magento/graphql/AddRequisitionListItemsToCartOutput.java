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
 * Output of the request to add items in a requisition list to the cart.
 */
public class AddRequisitionListItemsToCartOutput extends AbstractResponse<AddRequisitionListItemsToCartOutput> {
    public AddRequisitionListItemsToCartOutput() {}

    public AddRequisitionListItemsToCartOutput(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "add_requisition_list_items_to_cart_user_errors": {
                    List<AddRequisitionListItemToCartUserError> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        AddRequisitionListItemToCartUserError optional2 = null;
                        if (!element1.isJsonNull()) {
                            optional2 = new AddRequisitionListItemToCartUserError(jsonAsObject(element1, key));
                        }

                        list1.add(optional2);
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "cart": {
                    Cart optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Cart(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "status": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

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
        return "AddRequisitionListItemsToCartOutput";
    }

    /**
     * Details about why the attempt to add items to the requistion list was not successful.
     */
    public List<AddRequisitionListItemToCartUserError> getAddRequisitionListItemsToCartUserErrors() {
        return (List<AddRequisitionListItemToCartUserError>) get("add_requisition_list_items_to_cart_user_errors");
    }

    public AddRequisitionListItemsToCartOutput setAddRequisitionListItemsToCartUserErrors(List<AddRequisitionListItemToCartUserError> arg) {
        optimisticData.put(getKey("add_requisition_list_items_to_cart_user_errors"), arg);
        return this;
    }

    /**
     * The cart after adding requisition list items.
     */
    public Cart getCart() {
        return (Cart) get("cart");
    }

    public AddRequisitionListItemsToCartOutput setCart(Cart arg) {
        optimisticData.put(getKey("cart"), arg);
        return this;
    }

    /**
     * Indicates whether the attempt to add items to the requisition list was successful.
     */
    public Boolean getStatus() {
        return (Boolean) get("status");
    }

    public AddRequisitionListItemsToCartOutput setStatus(Boolean arg) {
        optimisticData.put(getKey("status"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "add_requisition_list_items_to_cart_user_errors":
                return true;

            case "cart":
                return true;

            case "status":
                return false;

            default:
                return false;
        }
    }
}

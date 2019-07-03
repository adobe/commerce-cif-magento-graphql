/*******************************************************************************
 *
 *    Copyright 2019 Adobe. All rights reserved.
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
 * 
 */
public class Cart extends AbstractResponse<Cart> {
    public Cart() {
    }

    public Cart(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "applied_coupon": {
                    AppliedCoupon optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new AppliedCoupon(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "available_payment_methods": {
                    List<AvailablePaymentMethod> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<AvailablePaymentMethod> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            AvailablePaymentMethod optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new AvailablePaymentMethod(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "billing_address": {
                    responseData.put(key, new BillingCartAddress(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "email": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "items": {
                    List<CartItemInterface> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<CartItemInterface> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            CartItemInterface optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = UnknownCartItemInterface.create(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "prices": {
                    CartPrices optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CartPrices(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "selected_payment_method": {
                    SelectedPaymentMethod optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new SelectedPaymentMethod(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "shipping_addresses": {
                    List<ShippingCartAddress> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        ShippingCartAddress optional2 = null;
                        if (!element1.isJsonNull()) {
                            optional2 = new ShippingCartAddress(jsonAsObject(element1, key));
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
                    throw new SchemaViolationError(this, key, field.getValue());
                }
            }
        }
    }

    public String getGraphQlTypeName() {
        return "Cart";
    }

    public AppliedCoupon getAppliedCoupon() {
        return (AppliedCoupon) get("applied_coupon");
    }

    public Cart setAppliedCoupon(AppliedCoupon arg) {
        optimisticData.put(getKey("applied_coupon"), arg);
        return this;
    }

    /**
     * Available payment methods
     */

    public List<AvailablePaymentMethod> getAvailablePaymentMethods() {
        return (List<AvailablePaymentMethod>) get("available_payment_methods");
    }

    public Cart setAvailablePaymentMethods(List<AvailablePaymentMethod> arg) {
        optimisticData.put(getKey("available_payment_methods"), arg);
        return this;
    }

    public BillingCartAddress getBillingAddress() {
        return (BillingCartAddress) get("billing_address");
    }

    public Cart setBillingAddress(BillingCartAddress arg) {
        optimisticData.put(getKey("billing_address"), arg);
        return this;
    }

    public String getEmail() {
        return (String) get("email");
    }

    public Cart setEmail(String arg) {
        optimisticData.put(getKey("email"), arg);
        return this;
    }

    public List<CartItemInterface> getItems() {
        return (List<CartItemInterface>) get("items");
    }

    public Cart setItems(List<CartItemInterface> arg) {
        optimisticData.put(getKey("items"), arg);
        return this;
    }

    public CartPrices getPrices() {
        return (CartPrices) get("prices");
    }

    public Cart setPrices(CartPrices arg) {
        optimisticData.put(getKey("prices"), arg);
        return this;
    }

    public SelectedPaymentMethod getSelectedPaymentMethod() {
        return (SelectedPaymentMethod) get("selected_payment_method");
    }

    public Cart setSelectedPaymentMethod(SelectedPaymentMethod arg) {
        optimisticData.put(getKey("selected_payment_method"), arg);
        return this;
    }

    public List<ShippingCartAddress> getShippingAddresses() {
        return (List<ShippingCartAddress>) get("shipping_addresses");
    }

    public Cart setShippingAddresses(List<ShippingCartAddress> arg) {
        optimisticData.put(getKey("shipping_addresses"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "applied_coupon": return true;

            case "available_payment_methods": return true;

            case "billing_address": return true;

            case "email": return false;

            case "items": return false;

            case "prices": return true;

            case "selected_payment_method": return true;

            case "shipping_addresses": return true;

            default: return false;
        }
    }
}


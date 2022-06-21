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
 * Contains shipping addresses and methods.
 */
public class ShippingCartAddress extends AbstractResponse<ShippingCartAddress> implements CartAddressInterface {
    public ShippingCartAddress() {}

    public ShippingCartAddress(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "available_shipping_methods": {
                    List<AvailableShippingMethod> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<AvailableShippingMethod> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            AvailableShippingMethod optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new AvailableShippingMethod(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "cart_items": {
                    List<CartItemQuantity> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<CartItemQuantity> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            CartItemQuantity optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new CartItemQuantity(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "cart_items_v2": {
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

                case "city": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "company": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "country": {
                    responseData.put(key, new CartAddressCountry(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "customer_notes": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "firstname": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "items_weight": {
                    Double optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsDouble(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "lastname": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "pickup_location_code": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "postcode": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "region": {
                    CartAddressRegion optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CartAddressRegion(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "selected_shipping_method": {
                    SelectedShippingMethod optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new SelectedShippingMethod(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "street": {
                    List<String> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        String optional2 = null;
                        if (!element1.isJsonNull()) {
                            optional2 = jsonAsString(element1, key);
                        }

                        list1.add(optional2);
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "telephone": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
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
        return "ShippingCartAddress";
    }

    /**
     * An array that lists the shipping methods that can be applied to the cart.
     */
    public List<AvailableShippingMethod> getAvailableShippingMethods() {
        return (List<AvailableShippingMethod>) get("available_shipping_methods");
    }

    public ShippingCartAddress setAvailableShippingMethods(List<AvailableShippingMethod> arg) {
        optimisticData.put(getKey("available_shipping_methods"), arg);
        return this;
    }

    /**
     * @deprecated Use `cart_items_v2` instead.
     */
    @Deprecated
    public List<CartItemQuantity> getCartItems() {
        return (List<CartItemQuantity>) get("cart_items");
    }

    public ShippingCartAddress setCartItems(List<CartItemQuantity> arg) {
        optimisticData.put(getKey("cart_items"), arg);
        return this;
    }

    /**
     * An array that lists the items in the cart.
     */
    public List<CartItemInterface> getCartItemsV2() {
        return (List<CartItemInterface>) get("cart_items_v2");
    }

    public ShippingCartAddress setCartItemsV2(List<CartItemInterface> arg) {
        optimisticData.put(getKey("cart_items_v2"), arg);
        return this;
    }

    /**
     * The city specified for the billing or shipping address.
     */
    public String getCity() {
        return (String) get("city");
    }

    public ShippingCartAddress setCity(String arg) {
        optimisticData.put(getKey("city"), arg);
        return this;
    }

    /**
     * The company specified for the billing or shipping address.
     */
    public String getCompany() {
        return (String) get("company");
    }

    public ShippingCartAddress setCompany(String arg) {
        optimisticData.put(getKey("company"), arg);
        return this;
    }

    /**
     * An object containing the country label and code.
     */
    public CartAddressCountry getCountry() {
        return (CartAddressCountry) get("country");
    }

    public ShippingCartAddress setCountry(CartAddressCountry arg) {
        optimisticData.put(getKey("country"), arg);
        return this;
    }

    /**
     * Text provided by the shopper.
     */
    public String getCustomerNotes() {
        return (String) get("customer_notes");
    }

    public ShippingCartAddress setCustomerNotes(String arg) {
        optimisticData.put(getKey("customer_notes"), arg);
        return this;
    }

    /**
     * The first name of the customer or guest.
     */
    public String getFirstname() {
        return (String) get("firstname");
    }

    public ShippingCartAddress setFirstname(String arg) {
        optimisticData.put(getKey("firstname"), arg);
        return this;
    }

    /**
     * @deprecated This information should not be exposed on the frontend.
     */
    @Deprecated
    public Double getItemsWeight() {
        return (Double) get("items_weight");
    }

    public ShippingCartAddress setItemsWeight(Double arg) {
        optimisticData.put(getKey("items_weight"), arg);
        return this;
    }

    /**
     * The last name of the customer or guest.
     */
    public String getLastname() {
        return (String) get("lastname");
    }

    public ShippingCartAddress setLastname(String arg) {
        optimisticData.put(getKey("lastname"), arg);
        return this;
    }

    public String getPickupLocationCode() {
        return (String) get("pickup_location_code");
    }

    public ShippingCartAddress setPickupLocationCode(String arg) {
        optimisticData.put(getKey("pickup_location_code"), arg);
        return this;
    }

    /**
     * The ZIP or postal code of the billing or shipping address.
     */
    public String getPostcode() {
        return (String) get("postcode");
    }

    public ShippingCartAddress setPostcode(String arg) {
        optimisticData.put(getKey("postcode"), arg);
        return this;
    }

    /**
     * An object containing the region label and code.
     */
    public CartAddressRegion getRegion() {
        return (CartAddressRegion) get("region");
    }

    public ShippingCartAddress setRegion(CartAddressRegion arg) {
        optimisticData.put(getKey("region"), arg);
        return this;
    }

    /**
     * An object that describes the selected shipping method.
     */
    public SelectedShippingMethod getSelectedShippingMethod() {
        return (SelectedShippingMethod) get("selected_shipping_method");
    }

    public ShippingCartAddress setSelectedShippingMethod(SelectedShippingMethod arg) {
        optimisticData.put(getKey("selected_shipping_method"), arg);
        return this;
    }

    /**
     * An array containing the street for the billing or shipping address.
     */
    public List<String> getStreet() {
        return (List<String>) get("street");
    }

    public ShippingCartAddress setStreet(List<String> arg) {
        optimisticData.put(getKey("street"), arg);
        return this;
    }

    /**
     * The telephone number for the billing or shipping address.
     */
    public String getTelephone() {
        return (String) get("telephone");
    }

    public ShippingCartAddress setTelephone(String arg) {
        optimisticData.put(getKey("telephone"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "available_shipping_methods":
                return true;

            case "cart_items":
                return true;

            case "cart_items_v2":
                return false;

            case "city":
                return false;

            case "company":
                return false;

            case "country":
                return true;

            case "customer_notes":
                return false;

            case "firstname":
                return false;

            case "items_weight":
                return false;

            case "lastname":
                return false;

            case "pickup_location_code":
                return false;

            case "postcode":
                return false;

            case "region":
                return true;

            case "selected_shipping_method":
                return true;

            case "street":
                return false;

            case "telephone":
                return false;

            default:
                return false;
        }
    }
}

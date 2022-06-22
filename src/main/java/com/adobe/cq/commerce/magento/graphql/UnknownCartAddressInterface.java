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

public class UnknownCartAddressInterface extends AbstractResponse<UnknownCartAddressInterface> implements CartAddressInterface {
    public UnknownCartAddressInterface() {}

    public UnknownCartAddressInterface(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
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

                case "firstname": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "lastname": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

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

    public static CartAddressInterface create(JsonObject fields) throws SchemaViolationError {
        String typeName = fields.getAsJsonPrimitive("__typename").getAsString();
        switch (typeName) {
            case "BillingCartAddress": {
                return new BillingCartAddress(fields);
            }

            case "ShippingCartAddress": {
                return new ShippingCartAddress(fields);
            }

            default: {
                return new UnknownCartAddressInterface(fields);
            }
        }
    }

    public String getGraphQlTypeName() {
        return (String) get("__typename");
    }

    /**
     * The city specified for the billing or shipping address.
     */
    public String getCity() {
        return (String) get("city");
    }

    public UnknownCartAddressInterface setCity(String arg) {
        optimisticData.put(getKey("city"), arg);
        return this;
    }

    /**
     * The company specified for the billing or shipping address.
     */
    public String getCompany() {
        return (String) get("company");
    }

    public UnknownCartAddressInterface setCompany(String arg) {
        optimisticData.put(getKey("company"), arg);
        return this;
    }

    /**
     * An object containing the country label and code.
     */
    public CartAddressCountry getCountry() {
        return (CartAddressCountry) get("country");
    }

    public UnknownCartAddressInterface setCountry(CartAddressCountry arg) {
        optimisticData.put(getKey("country"), arg);
        return this;
    }

    /**
     * The first name of the customer or guest.
     */
    public String getFirstname() {
        return (String) get("firstname");
    }

    public UnknownCartAddressInterface setFirstname(String arg) {
        optimisticData.put(getKey("firstname"), arg);
        return this;
    }

    /**
     * The last name of the customer or guest.
     */
    public String getLastname() {
        return (String) get("lastname");
    }

    public UnknownCartAddressInterface setLastname(String arg) {
        optimisticData.put(getKey("lastname"), arg);
        return this;
    }

    /**
     * The ZIP or postal code of the billing or shipping address.
     */
    public String getPostcode() {
        return (String) get("postcode");
    }

    public UnknownCartAddressInterface setPostcode(String arg) {
        optimisticData.put(getKey("postcode"), arg);
        return this;
    }

    /**
     * An object containing the region label and code.
     */
    public CartAddressRegion getRegion() {
        return (CartAddressRegion) get("region");
    }

    public UnknownCartAddressInterface setRegion(CartAddressRegion arg) {
        optimisticData.put(getKey("region"), arg);
        return this;
    }

    /**
     * An array containing the street for the billing or shipping address.
     */
    public List<String> getStreet() {
        return (List<String>) get("street");
    }

    public UnknownCartAddressInterface setStreet(List<String> arg) {
        optimisticData.put(getKey("street"), arg);
        return this;
    }

    /**
     * The telephone number for the billing or shipping address.
     */
    public String getTelephone() {
        return (String) get("telephone");
    }

    public UnknownCartAddressInterface setTelephone(String arg) {
        optimisticData.put(getKey("telephone"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "city":
                return false;

            case "company":
                return false;

            case "country":
                return true;

            case "firstname":
                return false;

            case "lastname":
                return false;

            case "postcode":
                return false;

            case "region":
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

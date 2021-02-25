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

public class ReturnShippingAddress extends AbstractResponse<ReturnShippingAddress> {
    public ReturnShippingAddress() {}

    public ReturnShippingAddress(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "city": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "contact_name": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "country": {
                    responseData.put(key, new Country(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "postcode": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "region": {
                    responseData.put(key, new Region(jsonAsObject(field.getValue(), key)));

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
        return "ReturnShippingAddress";
    }

    /**
     * The city for product returns
     */
    public String getCity() {
        return (String) get("city");
    }

    public ReturnShippingAddress setCity(String arg) {
        optimisticData.put(getKey("city"), arg);
        return this;
    }

    /**
     * The merchant&#39;s contact person
     */
    public String getContactName() {
        return (String) get("contact_name");
    }

    public ReturnShippingAddress setContactName(String arg) {
        optimisticData.put(getKey("contact_name"), arg);
        return this;
    }

    /**
     * An object that defines the country for product returns
     */
    public Country getCountry() {
        return (Country) get("country");
    }

    public ReturnShippingAddress setCountry(Country arg) {
        optimisticData.put(getKey("country"), arg);
        return this;
    }

    /**
     * The postal code for product returns
     */
    public String getPostcode() {
        return (String) get("postcode");
    }

    public ReturnShippingAddress setPostcode(String arg) {
        optimisticData.put(getKey("postcode"), arg);
        return this;
    }

    /**
     * An object that defines the state or province for product returns
     */
    public Region getRegion() {
        return (Region) get("region");
    }

    public ReturnShippingAddress setRegion(Region arg) {
        optimisticData.put(getKey("region"), arg);
        return this;
    }

    /**
     * The street address for product returns
     */
    public List<String> getStreet() {
        return (List<String>) get("street");
    }

    public ReturnShippingAddress setStreet(List<String> arg) {
        optimisticData.put(getKey("street"), arg);
        return this;
    }

    /**
     * The telephone number for product returns
     */
    public String getTelephone() {
        return (String) get("telephone");
    }

    public ReturnShippingAddress setTelephone(String arg) {
        optimisticData.put(getKey("telephone"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "city":
                return false;

            case "contact_name":
                return false;

            case "country":
                return true;

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

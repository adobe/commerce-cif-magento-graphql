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

public class UnknownNegotiableQuoteAddressInterface extends AbstractResponse<UnknownNegotiableQuoteAddressInterface> implements
    NegotiableQuoteAddressInterface {
    public UnknownNegotiableQuoteAddressInterface() {}

    public UnknownNegotiableQuoteAddressInterface(JsonObject fields) throws SchemaViolationError {
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
                    responseData.put(key, new NegotiableQuoteAddressCountry(jsonAsObject(field.getValue(), key)));

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
                    NegotiableQuoteAddressRegion optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new NegotiableQuoteAddressRegion(jsonAsObject(field.getValue(), key));
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

    public static NegotiableQuoteAddressInterface create(JsonObject fields) throws SchemaViolationError {
        String typeName = fields.getAsJsonPrimitive("__typename").getAsString();
        switch (typeName) {
            case "NegotiableQuoteBillingAddress": {
                return new NegotiableQuoteBillingAddress(fields);
            }

            case "NegotiableQuoteShippingAddress": {
                return new NegotiableQuoteShippingAddress(fields);
            }

            default: {
                return new UnknownNegotiableQuoteAddressInterface(fields);
            }
        }
    }

    public String getGraphQlTypeName() {
        return (String) get("__typename");
    }

    /**
     * The company&#39;s city or town.
     */
    public String getCity() {
        return (String) get("city");
    }

    public UnknownNegotiableQuoteAddressInterface setCity(String arg) {
        optimisticData.put(getKey("city"), arg);
        return this;
    }

    /**
     * The company name associated with the shipping/billing address.
     */
    public String getCompany() {
        return (String) get("company");
    }

    public UnknownNegotiableQuoteAddressInterface setCompany(String arg) {
        optimisticData.put(getKey("company"), arg);
        return this;
    }

    /**
     * The company&#39;s country.
     */
    public NegotiableQuoteAddressCountry getCountry() {
        return (NegotiableQuoteAddressCountry) get("country");
    }

    public UnknownNegotiableQuoteAddressInterface setCountry(NegotiableQuoteAddressCountry arg) {
        optimisticData.put(getKey("country"), arg);
        return this;
    }

    /**
     * The first name of the company user.
     */
    public String getFirstname() {
        return (String) get("firstname");
    }

    public UnknownNegotiableQuoteAddressInterface setFirstname(String arg) {
        optimisticData.put(getKey("firstname"), arg);
        return this;
    }

    /**
     * The last name of the company user.
     */
    public String getLastname() {
        return (String) get("lastname");
    }

    public UnknownNegotiableQuoteAddressInterface setLastname(String arg) {
        optimisticData.put(getKey("lastname"), arg);
        return this;
    }

    /**
     * The company&#39;s ZIP or postal code.
     */
    public String getPostcode() {
        return (String) get("postcode");
    }

    public UnknownNegotiableQuoteAddressInterface setPostcode(String arg) {
        optimisticData.put(getKey("postcode"), arg);
        return this;
    }

    /**
     * An object containing the region name, region code, and region ID.
     */
    public NegotiableQuoteAddressRegion getRegion() {
        return (NegotiableQuoteAddressRegion) get("region");
    }

    public UnknownNegotiableQuoteAddressInterface setRegion(NegotiableQuoteAddressRegion arg) {
        optimisticData.put(getKey("region"), arg);
        return this;
    }

    /**
     * An array of strings that define the street number and name.
     */
    public List<String> getStreet() {
        return (List<String>) get("street");
    }

    public UnknownNegotiableQuoteAddressInterface setStreet(List<String> arg) {
        optimisticData.put(getKey("street"), arg);
        return this;
    }

    /**
     * The customer&#39;s telephone number.
     */
    public String getTelephone() {
        return (String) get("telephone");
    }

    public UnknownNegotiableQuoteAddressInterface setTelephone(String arg) {
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

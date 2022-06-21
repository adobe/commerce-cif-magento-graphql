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
 * Contains details about the address where the company is registered to conduct business.
 */
public class CompanyLegalAddress extends AbstractResponse<CompanyLegalAddress> {
    public CompanyLegalAddress() {}

    public CompanyLegalAddress(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "city": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "country_code": {
                    CountryCodeEnum optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = CountryCodeEnum.fromGraphQl(jsonAsString(field.getValue(), key));
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
                    CustomerAddressRegion optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CustomerAddressRegion(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "street": {
                    List<String> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<String> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            String optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = jsonAsString(element1, key);
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

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
        return "CompanyLegalAddress";
    }

    /**
     * The city where the company is registered to conduct business.
     */
    public String getCity() {
        return (String) get("city");
    }

    public CompanyLegalAddress setCity(String arg) {
        optimisticData.put(getKey("city"), arg);
        return this;
    }

    /**
     * The country code of the company&#39;s legal address.
     */
    public CountryCodeEnum getCountryCode() {
        return (CountryCodeEnum) get("country_code");
    }

    public CompanyLegalAddress setCountryCode(CountryCodeEnum arg) {
        optimisticData.put(getKey("country_code"), arg);
        return this;
    }

    /**
     * The company&#39;s postal code.
     */
    public String getPostcode() {
        return (String) get("postcode");
    }

    public CompanyLegalAddress setPostcode(String arg) {
        optimisticData.put(getKey("postcode"), arg);
        return this;
    }

    /**
     * An object containing region data for the company.
     */
    public CustomerAddressRegion getRegion() {
        return (CustomerAddressRegion) get("region");
    }

    public CompanyLegalAddress setRegion(CustomerAddressRegion arg) {
        optimisticData.put(getKey("region"), arg);
        return this;
    }

    /**
     * An array of strings that define the company&#39;s street address.
     */
    public List<String> getStreet() {
        return (List<String>) get("street");
    }

    public CompanyLegalAddress setStreet(List<String> arg) {
        optimisticData.put(getKey("street"), arg);
        return this;
    }

    /**
     * The company&#39;s phone number.
     */
    public String getTelephone() {
        return (String) get("telephone");
    }

    public CompanyLegalAddress setTelephone(String arg) {
        optimisticData.put(getKey("telephone"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "city":
                return false;

            case "country_code":
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

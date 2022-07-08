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

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.shopify.graphql.support.AbstractQuery;
import com.shopify.graphql.support.Input;

/**
 * Defines the input schema for updating a company&#39;s legal address.
 */
public class CompanyLegalAddressUpdateInput implements Serializable {
    private Input<String> city = Input.undefined();

    private Input<CountryCodeEnum> countryId = Input.undefined();

    private Input<String> postcode = Input.undefined();

    private Input<CustomerAddressRegionInput> region = Input.undefined();

    private Input<List<String>> street = Input.undefined();

    private Input<String> telephone = Input.undefined();

    private Map<String, Input<Serializable>> customFilters = new HashMap<>();

    /**
     * The city where the company is registered to conduct business.
     */
    public String getCity() {
        return city.getValue();
    }

    /**
     * The city where the company is registered to conduct business.
     */
    public Input<String> getCityInput() {
        return city;
    }

    /**
     * The city where the company is registered to conduct business.
     */
    public CompanyLegalAddressUpdateInput setCity(String city) {
        this.city = Input.optional(city);
        return this;
    }

    /**
     * The city where the company is registered to conduct business.
     */
    public CompanyLegalAddressUpdateInput setCityInput(Input<String> city) {
        if (city == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.city = city;
        return this;
    }

    /**
     * The unique ID for a `Country` object.
     */
    public CountryCodeEnum getCountryId() {
        return countryId.getValue();
    }

    /**
     * The unique ID for a `Country` object.
     */
    public Input<CountryCodeEnum> getCountryIdInput() {
        return countryId;
    }

    /**
     * The unique ID for a `Country` object.
     */
    public CompanyLegalAddressUpdateInput setCountryId(CountryCodeEnum countryId) {
        this.countryId = Input.optional(countryId);
        return this;
    }

    /**
     * The unique ID for a `Country` object.
     */
    public CompanyLegalAddressUpdateInput setCountryIdInput(Input<CountryCodeEnum> countryId) {
        if (countryId == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.countryId = countryId;
        return this;
    }

    /**
     * The postal code of the company.
     */
    public String getPostcode() {
        return postcode.getValue();
    }

    /**
     * The postal code of the company.
     */
    public Input<String> getPostcodeInput() {
        return postcode;
    }

    /**
     * The postal code of the company.
     */
    public CompanyLegalAddressUpdateInput setPostcode(String postcode) {
        this.postcode = Input.optional(postcode);
        return this;
    }

    /**
     * The postal code of the company.
     */
    public CompanyLegalAddressUpdateInput setPostcodeInput(Input<String> postcode) {
        if (postcode == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.postcode = postcode;
        return this;
    }

    /**
     * An object containing the region name and/or region ID where the company is registered to conduct
     * business.
     */
    public CustomerAddressRegionInput getRegion() {
        return region.getValue();
    }

    /**
     * An object containing the region name and/or region ID where the company is registered to conduct
     * business.
     */
    public Input<CustomerAddressRegionInput> getRegionInput() {
        return region;
    }

    /**
     * An object containing the region name and/or region ID where the company is registered to conduct
     * business.
     */
    public CompanyLegalAddressUpdateInput setRegion(CustomerAddressRegionInput region) {
        this.region = Input.optional(region);
        return this;
    }

    /**
     * An object containing the region name and/or region ID where the company is registered to conduct
     * business.
     */
    public CompanyLegalAddressUpdateInput setRegionInput(Input<CustomerAddressRegionInput> region) {
        if (region == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.region = region;
        return this;
    }

    /**
     * An array of strings that define the street address where the company is registered to conduct
     * business.
     */
    public List<String> getStreet() {
        return street.getValue();
    }

    /**
     * An array of strings that define the street address where the company is registered to conduct
     * business.
     */
    public Input<List<String>> getStreetInput() {
        return street;
    }

    /**
     * An array of strings that define the street address where the company is registered to conduct
     * business.
     */
    public CompanyLegalAddressUpdateInput setStreet(List<String> street) {
        this.street = Input.optional(street);
        return this;
    }

    /**
     * An array of strings that define the street address where the company is registered to conduct
     * business.
     */
    public CompanyLegalAddressUpdateInput setStreetInput(Input<List<String>> street) {
        if (street == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.street = street;
        return this;
    }

    /**
     * The primary phone number of the company.
     */
    public String getTelephone() {
        return telephone.getValue();
    }

    /**
     * The primary phone number of the company.
     */
    public Input<String> getTelephoneInput() {
        return telephone;
    }

    /**
     * The primary phone number of the company.
     */
    public CompanyLegalAddressUpdateInput setTelephone(String telephone) {
        this.telephone = Input.optional(telephone);
        return this;
    }

    /**
     * The primary phone number of the company.
     */
    public CompanyLegalAddressUpdateInput setTelephoneInput(Input<String> telephone) {
        if (telephone == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.telephone = telephone;
        return this;
    }

    /**
     * Set custom filter.
     */
    public CompanyLegalAddressUpdateInput setCustomFilter(String name, Serializable filterInput) {
        this.customFilters.put(name, Input.optional(filterInput));
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (!this.customFilters.isEmpty()) {
            for (Map.Entry<String, Input<Serializable>> entry : customFilters.entrySet()) {
                _queryBuilder.append(separator);
                separator = ",";
                _queryBuilder.append(entry.getKey() + ":");

                Serializable filter = entry.getValue().getValue();

                if (filter != null) {
                    try {
                        Method appendTo = filter.getClass().getMethod("appendTo", StringBuilder.class);
                        appendTo.invoke(filter, _queryBuilder);
                    } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
                        _queryBuilder.append("null");
                    }
                } else {
                    _queryBuilder.append("null");
                }
            }
        }

        if (this.city.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("city:");
            if (city.getValue() != null) {
                AbstractQuery.appendQuotedString(_queryBuilder, city.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.countryId.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("country_id:");
            if (countryId.getValue() != null) {
                _queryBuilder.append(countryId.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.postcode.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("postcode:");
            if (postcode.getValue() != null) {
                AbstractQuery.appendQuotedString(_queryBuilder, postcode.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.region.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("region:");
            if (region.getValue() != null) {
                region.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.street.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("street:");
            if (street.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (String item1 : street.getValue()) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        AbstractQuery.appendQuotedString(_queryBuilder, item1.toString());
                    }
                }
                _queryBuilder.append(']');
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.telephone.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("telephone:");
            if (telephone.getValue() != null) {
                AbstractQuery.appendQuotedString(_queryBuilder, telephone.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}

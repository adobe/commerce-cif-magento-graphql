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
import java.util.List;

import com.shopify.graphql.support.AbstractQuery;

/**
 * Defines the input schema for defining a company&#39;s legal address.
 */
public class CompanyLegalAddressCreateInput implements Serializable {
    private String city;

    private CountryCodeEnum countryId;

    private String postcode;

    private CustomerAddressRegionInput region;

    private List<String> street;

    private String telephone;

    public CompanyLegalAddressCreateInput(String city, CountryCodeEnum countryId, String postcode, CustomerAddressRegionInput region,
                                          List<String> street, String telephone) {
        this.city = city;

        this.countryId = countryId;

        this.postcode = postcode;

        this.region = region;

        this.street = street;

        this.telephone = telephone;
    }

    /**
     * The city where the company is registered to conduct business.
     */
    public String getCity() {
        return city;
    }

    /**
     * The city where the company is registered to conduct business.
     */
    public CompanyLegalAddressCreateInput setCity(String city) {
        this.city = city;
        return this;
    }

    /**
     * The company&#39;s country ID. Use the `countries` query to get this value.
     */
    public CountryCodeEnum getCountryId() {
        return countryId;
    }

    /**
     * The company&#39;s country ID. Use the `countries` query to get this value.
     */
    public CompanyLegalAddressCreateInput setCountryId(CountryCodeEnum countryId) {
        this.countryId = countryId;
        return this;
    }

    /**
     * The postal code of the company.
     */
    public String getPostcode() {
        return postcode;
    }

    /**
     * The postal code of the company.
     */
    public CompanyLegalAddressCreateInput setPostcode(String postcode) {
        this.postcode = postcode;
        return this;
    }

    /**
     * An object containing the region name and/or region ID where the company is registered to conduct
     * business.
     */
    public CustomerAddressRegionInput getRegion() {
        return region;
    }

    /**
     * An object containing the region name and/or region ID where the company is registered to conduct
     * business.
     */
    public CompanyLegalAddressCreateInput setRegion(CustomerAddressRegionInput region) {
        this.region = region;
        return this;
    }

    /**
     * An array of strings that define the street address where the company is registered to conduct
     * business.
     */
    public List<String> getStreet() {
        return street;
    }

    /**
     * An array of strings that define the street address where the company is registered to conduct
     * business.
     */
    public CompanyLegalAddressCreateInput setStreet(List<String> street) {
        this.street = street;
        return this;
    }

    /**
     * The primary phone number of the company.
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * The primary phone number of the company.
     */
    public CompanyLegalAddressCreateInput setTelephone(String telephone) {
        this.telephone = telephone;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("city:");
        AbstractQuery.appendQuotedString(_queryBuilder, city.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("country_id:");
        _queryBuilder.append(countryId.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("postcode:");
        AbstractQuery.appendQuotedString(_queryBuilder, postcode.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("region:");
        region.appendTo(_queryBuilder);

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("street:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (String item1 : street) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                AbstractQuery.appendQuotedString(_queryBuilder, item1.toString());
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("telephone:");
        AbstractQuery.appendQuotedString(_queryBuilder, telephone.toString());

        _queryBuilder.append('}');
    }
}

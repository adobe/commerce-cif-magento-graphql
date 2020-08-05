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
import com.shopify.graphql.support.Input;

public class CartAddressInput implements Serializable {
    private String city;

    private String countryCode;

    private String firstname;

    private String lastname;

    private List<String> street;

    private String telephone;

    private Input<String> company = Input.undefined();

    private Input<String> postcode = Input.undefined();

    private Input<String> region = Input.undefined();

    private Input<Integer> regionId = Input.undefined();

    private Input<Boolean> saveInAddressBook = Input.undefined();

    public CartAddressInput(String city, String countryCode, String firstname, String lastname, List<String> street, String telephone) {
        this.city = city;

        this.countryCode = countryCode;

        this.firstname = firstname;

        this.lastname = lastname;

        this.street = street;

        this.telephone = telephone;
    }

    public String getCity() {
        return city;
    }

    public CartAddressInput setCity(String city) {
        this.city = city;
        return this;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public CartAddressInput setCountryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    public String getFirstname() {
        return firstname;
    }

    public CartAddressInput setFirstname(String firstname) {
        this.firstname = firstname;
        return this;
    }

    public String getLastname() {
        return lastname;
    }

    public CartAddressInput setLastname(String lastname) {
        this.lastname = lastname;
        return this;
    }

    public List<String> getStreet() {
        return street;
    }

    public CartAddressInput setStreet(List<String> street) {
        this.street = street;
        return this;
    }

    public String getTelephone() {
        return telephone;
    }

    public CartAddressInput setTelephone(String telephone) {
        this.telephone = telephone;
        return this;
    }

    public String getCompany() {
        return company.getValue();
    }

    public Input<String> getCompanyInput() {
        return company;
    }

    public CartAddressInput setCompany(String company) {
        this.company = Input.optional(company);
        return this;
    }

    public CartAddressInput setCompanyInput(Input<String> company) {
        if (company == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.company = company;
        return this;
    }

    public String getPostcode() {
        return postcode.getValue();
    }

    public Input<String> getPostcodeInput() {
        return postcode;
    }

    public CartAddressInput setPostcode(String postcode) {
        this.postcode = Input.optional(postcode);
        return this;
    }

    public CartAddressInput setPostcodeInput(Input<String> postcode) {
        if (postcode == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.postcode = postcode;
        return this;
    }

    public String getRegion() {
        return region.getValue();
    }

    public Input<String> getRegionInput() {
        return region;
    }

    public CartAddressInput setRegion(String region) {
        this.region = Input.optional(region);
        return this;
    }

    public CartAddressInput setRegionInput(Input<String> region) {
        if (region == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.region = region;
        return this;
    }

    public Integer getRegionId() {
        return regionId.getValue();
    }

    public Input<Integer> getRegionIdInput() {
        return regionId;
    }

    public CartAddressInput setRegionId(Integer regionId) {
        this.regionId = Input.optional(regionId);
        return this;
    }

    public CartAddressInput setRegionIdInput(Input<Integer> regionId) {
        if (regionId == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.regionId = regionId;
        return this;
    }

    /**
     * Determines whether to save the address in the customer&#39;s address book. The default value is true
     */
    public Boolean getSaveInAddressBook() {
        return saveInAddressBook.getValue();
    }

    /**
     * Determines whether to save the address in the customer&#39;s address book. The default value is true
     */
    public Input<Boolean> getSaveInAddressBookInput() {
        return saveInAddressBook;
    }

    /**
     * Determines whether to save the address in the customer&#39;s address book. The default value is true
     */
    public CartAddressInput setSaveInAddressBook(Boolean saveInAddressBook) {
        this.saveInAddressBook = Input.optional(saveInAddressBook);
        return this;
    }

    /**
     * Determines whether to save the address in the customer&#39;s address book. The default value is true
     */
    public CartAddressInput setSaveInAddressBookInput(Input<Boolean> saveInAddressBook) {
        if (saveInAddressBook == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.saveInAddressBook = saveInAddressBook;
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
        _queryBuilder.append("country_code:");
        AbstractQuery.appendQuotedString(_queryBuilder, countryCode.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("firstname:");
        AbstractQuery.appendQuotedString(_queryBuilder, firstname.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("lastname:");
        AbstractQuery.appendQuotedString(_queryBuilder, lastname.toString());

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

        if (this.company.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("company:");
            if (company.getValue() != null) {
                AbstractQuery.appendQuotedString(_queryBuilder, company.getValue().toString());
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
                AbstractQuery.appendQuotedString(_queryBuilder, region.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.regionId.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("region_id:");
            if (regionId.getValue() != null) {
                _queryBuilder.append(regionId.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.saveInAddressBook.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("save_in_address_book:");
            if (saveInAddressBook.getValue() != null) {
                _queryBuilder.append(saveInAddressBook.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}

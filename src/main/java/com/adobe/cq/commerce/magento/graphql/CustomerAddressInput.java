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

import java.io.Serializable;
import java.util.List;

import com.shopify.graphql.support.AbstractQuery;
import com.shopify.graphql.support.Input;

public class CustomerAddressInput implements Serializable {
    private Input<String> city = Input.undefined();

    private Input<String> company = Input.undefined();

    private Input<CountryCodeEnum> countryId = Input.undefined();

    private Input<List<CustomerAddressAttributeInput>> customAttributes = Input.undefined();

    private Input<Boolean> defaultBilling = Input.undefined();

    private Input<Boolean> defaultShipping = Input.undefined();

    private Input<String> fax = Input.undefined();

    private Input<String> firstname = Input.undefined();

    private Input<String> lastname = Input.undefined();

    private Input<String> middlename = Input.undefined();

    private Input<String> postcode = Input.undefined();

    private Input<String> prefix = Input.undefined();

    private Input<CustomerAddressRegionInput> region = Input.undefined();

    private Input<List<String>> street = Input.undefined();

    private Input<String> suffix = Input.undefined();

    private Input<String> telephone = Input.undefined();

    private Input<String> vatId = Input.undefined();

    public String getCity() {
        return city.getValue();
    }

    public Input<String> getCityInput() {
        return city;
    }

    public CustomerAddressInput setCity(String city) {
        this.city = Input.optional(city);
        return this;
    }

    public CustomerAddressInput setCityInput(Input<String> city) {
        if (city == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.city = city;
        return this;
    }

    public String getCompany() {
        return company.getValue();
    }

    public Input<String> getCompanyInput() {
        return company;
    }

    public CustomerAddressInput setCompany(String company) {
        this.company = Input.optional(company);
        return this;
    }

    public CustomerAddressInput setCompanyInput(Input<String> company) {
        if (company == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.company = company;
        return this;
    }

    public CountryCodeEnum getCountryId() {
        return countryId.getValue();
    }

    public Input<CountryCodeEnum> getCountryIdInput() {
        return countryId;
    }

    public CustomerAddressInput setCountryId(CountryCodeEnum countryId) {
        this.countryId = Input.optional(countryId);
        return this;
    }

    public CustomerAddressInput setCountryIdInput(Input<CountryCodeEnum> countryId) {
        if (countryId == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.countryId = countryId;
        return this;
    }

    public List<CustomerAddressAttributeInput> getCustomAttributes() {
        return customAttributes.getValue();
    }

    public Input<List<CustomerAddressAttributeInput>> getCustomAttributesInput() {
        return customAttributes;
    }

    public CustomerAddressInput setCustomAttributes(List<CustomerAddressAttributeInput> customAttributes) {
        this.customAttributes = Input.optional(customAttributes);
        return this;
    }

    public CustomerAddressInput setCustomAttributesInput(Input<List<CustomerAddressAttributeInput>> customAttributes) {
        if (customAttributes == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.customAttributes = customAttributes;
        return this;
    }

    public Boolean getDefaultBilling() {
        return defaultBilling.getValue();
    }

    public Input<Boolean> getDefaultBillingInput() {
        return defaultBilling;
    }

    public CustomerAddressInput setDefaultBilling(Boolean defaultBilling) {
        this.defaultBilling = Input.optional(defaultBilling);
        return this;
    }

    public CustomerAddressInput setDefaultBillingInput(Input<Boolean> defaultBilling) {
        if (defaultBilling == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.defaultBilling = defaultBilling;
        return this;
    }

    public Boolean getDefaultShipping() {
        return defaultShipping.getValue();
    }

    public Input<Boolean> getDefaultShippingInput() {
        return defaultShipping;
    }

    public CustomerAddressInput setDefaultShipping(Boolean defaultShipping) {
        this.defaultShipping = Input.optional(defaultShipping);
        return this;
    }

    public CustomerAddressInput setDefaultShippingInput(Input<Boolean> defaultShipping) {
        if (defaultShipping == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.defaultShipping = defaultShipping;
        return this;
    }

    public String getFax() {
        return fax.getValue();
    }

    public Input<String> getFaxInput() {
        return fax;
    }

    public CustomerAddressInput setFax(String fax) {
        this.fax = Input.optional(fax);
        return this;
    }

    public CustomerAddressInput setFaxInput(Input<String> fax) {
        if (fax == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.fax = fax;
        return this;
    }

    public String getFirstname() {
        return firstname.getValue();
    }

    public Input<String> getFirstnameInput() {
        return firstname;
    }

    public CustomerAddressInput setFirstname(String firstname) {
        this.firstname = Input.optional(firstname);
        return this;
    }

    public CustomerAddressInput setFirstnameInput(Input<String> firstname) {
        if (firstname == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.firstname = firstname;
        return this;
    }

    public String getLastname() {
        return lastname.getValue();
    }

    public Input<String> getLastnameInput() {
        return lastname;
    }

    public CustomerAddressInput setLastname(String lastname) {
        this.lastname = Input.optional(lastname);
        return this;
    }

    public CustomerAddressInput setLastnameInput(Input<String> lastname) {
        if (lastname == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.lastname = lastname;
        return this;
    }

    public String getMiddlename() {
        return middlename.getValue();
    }

    public Input<String> getMiddlenameInput() {
        return middlename;
    }

    public CustomerAddressInput setMiddlename(String middlename) {
        this.middlename = Input.optional(middlename);
        return this;
    }

    public CustomerAddressInput setMiddlenameInput(Input<String> middlename) {
        if (middlename == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.middlename = middlename;
        return this;
    }

    public String getPostcode() {
        return postcode.getValue();
    }

    public Input<String> getPostcodeInput() {
        return postcode;
    }

    public CustomerAddressInput setPostcode(String postcode) {
        this.postcode = Input.optional(postcode);
        return this;
    }

    public CustomerAddressInput setPostcodeInput(Input<String> postcode) {
        if (postcode == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.postcode = postcode;
        return this;
    }

    public String getPrefix() {
        return prefix.getValue();
    }

    public Input<String> getPrefixInput() {
        return prefix;
    }

    public CustomerAddressInput setPrefix(String prefix) {
        this.prefix = Input.optional(prefix);
        return this;
    }

    public CustomerAddressInput setPrefixInput(Input<String> prefix) {
        if (prefix == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.prefix = prefix;
        return this;
    }

    public CustomerAddressRegionInput getRegion() {
        return region.getValue();
    }

    public Input<CustomerAddressRegionInput> getRegionInput() {
        return region;
    }

    public CustomerAddressInput setRegion(CustomerAddressRegionInput region) {
        this.region = Input.optional(region);
        return this;
    }

    public CustomerAddressInput setRegionInput(Input<CustomerAddressRegionInput> region) {
        if (region == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.region = region;
        return this;
    }

    public List<String> getStreet() {
        return street.getValue();
    }

    public Input<List<String>> getStreetInput() {
        return street;
    }

    public CustomerAddressInput setStreet(List<String> street) {
        this.street = Input.optional(street);
        return this;
    }

    public CustomerAddressInput setStreetInput(Input<List<String>> street) {
        if (street == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.street = street;
        return this;
    }

    public String getSuffix() {
        return suffix.getValue();
    }

    public Input<String> getSuffixInput() {
        return suffix;
    }

    public CustomerAddressInput setSuffix(String suffix) {
        this.suffix = Input.optional(suffix);
        return this;
    }

    public CustomerAddressInput setSuffixInput(Input<String> suffix) {
        if (suffix == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.suffix = suffix;
        return this;
    }

    public String getTelephone() {
        return telephone.getValue();
    }

    public Input<String> getTelephoneInput() {
        return telephone;
    }

    public CustomerAddressInput setTelephone(String telephone) {
        this.telephone = Input.optional(telephone);
        return this;
    }

    public CustomerAddressInput setTelephoneInput(Input<String> telephone) {
        if (telephone == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.telephone = telephone;
        return this;
    }

    public String getVatId() {
        return vatId.getValue();
    }

    public Input<String> getVatIdInput() {
        return vatId;
    }

    public CustomerAddressInput setVatId(String vatId) {
        this.vatId = Input.optional(vatId);
        return this;
    }

    public CustomerAddressInput setVatIdInput(Input<String> vatId) {
        if (vatId == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.vatId = vatId;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

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

        if (this.customAttributes.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("custom_attributes:");
            if (customAttributes.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (CustomerAddressAttributeInput item1 : customAttributes.getValue()) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        item1.appendTo(_queryBuilder);
                    }
                }
                _queryBuilder.append(']');
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.defaultBilling.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("default_billing:");
            if (defaultBilling.getValue() != null) {
                _queryBuilder.append(defaultBilling.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.defaultShipping.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("default_shipping:");
            if (defaultShipping.getValue() != null) {
                _queryBuilder.append(defaultShipping.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.fax.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("fax:");
            if (fax.getValue() != null) {
                AbstractQuery.appendQuotedString(_queryBuilder, fax.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.firstname.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("firstname:");
            if (firstname.getValue() != null) {
                AbstractQuery.appendQuotedString(_queryBuilder, firstname.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.lastname.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("lastname:");
            if (lastname.getValue() != null) {
                AbstractQuery.appendQuotedString(_queryBuilder, lastname.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.middlename.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("middlename:");
            if (middlename.getValue() != null) {
                AbstractQuery.appendQuotedString(_queryBuilder, middlename.getValue().toString());
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

        if (this.prefix.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("prefix:");
            if (prefix.getValue() != null) {
                AbstractQuery.appendQuotedString(_queryBuilder, prefix.getValue().toString());
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

        if (this.suffix.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("suffix:");
            if (suffix.getValue() != null) {
                AbstractQuery.appendQuotedString(_queryBuilder, suffix.getValue().toString());
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

        if (this.vatId.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("vat_id:");
            if (vatId.getValue() != null) {
                AbstractQuery.appendQuotedString(_queryBuilder, vatId.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}

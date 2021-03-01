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

public class CustomerAddressInput implements Serializable {
    private Input<String> city = Input.undefined();

    private Input<String> company = Input.undefined();

    private Input<CountryCodeEnum> countryCode = Input.undefined();

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

    /**
     * The city or town
     */
    public String getCity() {
        return city.getValue();
    }

    /**
     * The city or town
     */
    public Input<String> getCityInput() {
        return city;
    }

    /**
     * The city or town
     */
    public CustomerAddressInput setCity(String city) {
        this.city = Input.optional(city);
        return this;
    }

    /**
     * The city or town
     */
    public CustomerAddressInput setCityInput(Input<String> city) {
        if (city == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.city = city;
        return this;
    }

    /**
     * The customer&#39;s company
     */
    public String getCompany() {
        return company.getValue();
    }

    /**
     * The customer&#39;s company
     */
    public Input<String> getCompanyInput() {
        return company;
    }

    /**
     * The customer&#39;s company
     */
    public CustomerAddressInput setCompany(String company) {
        this.company = Input.optional(company);
        return this;
    }

    /**
     * The customer&#39;s company
     */
    public CustomerAddressInput setCompanyInput(Input<String> company) {
        if (company == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.company = company;
        return this;
    }

    /**
     * The customer&#39;s country
     */
    public CountryCodeEnum getCountryCode() {
        return countryCode.getValue();
    }

    /**
     * The customer&#39;s country
     */
    public Input<CountryCodeEnum> getCountryCodeInput() {
        return countryCode;
    }

    /**
     * The customer&#39;s country
     */
    public CustomerAddressInput setCountryCode(CountryCodeEnum countryCode) {
        this.countryCode = Input.optional(countryCode);
        return this;
    }

    /**
     * The customer&#39;s country
     */
    public CustomerAddressInput setCountryCodeInput(Input<CountryCodeEnum> countryCode) {
        if (countryCode == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.countryCode = countryCode;
        return this;
    }

    /**
     * Deprecated: use `country_code` instead.
     */
    public CountryCodeEnum getCountryId() {
        return countryId.getValue();
    }

    /**
     * Deprecated: use `country_code` instead.
     */
    public Input<CountryCodeEnum> getCountryIdInput() {
        return countryId;
    }

    /**
     * Deprecated: use `country_code` instead.
     */
    public CustomerAddressInput setCountryId(CountryCodeEnum countryId) {
        this.countryId = Input.optional(countryId);
        return this;
    }

    /**
     * Deprecated: use `country_code` instead.
     */
    public CustomerAddressInput setCountryIdInput(Input<CountryCodeEnum> countryId) {
        if (countryId == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.countryId = countryId;
        return this;
    }

    /**
     * Deprecated: Custom attributes should not be put into container.
     */
    public List<CustomerAddressAttributeInput> getCustomAttributes() {
        return customAttributes.getValue();
    }

    /**
     * Deprecated: Custom attributes should not be put into container.
     */
    public Input<List<CustomerAddressAttributeInput>> getCustomAttributesInput() {
        return customAttributes;
    }

    /**
     * Deprecated: Custom attributes should not be put into container.
     */
    public CustomerAddressInput setCustomAttributes(List<CustomerAddressAttributeInput> customAttributes) {
        this.customAttributes = Input.optional(customAttributes);
        return this;
    }

    /**
     * Deprecated: Custom attributes should not be put into container.
     */
    public CustomerAddressInput setCustomAttributesInput(Input<List<CustomerAddressAttributeInput>> customAttributes) {
        if (customAttributes == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.customAttributes = customAttributes;
        return this;
    }

    /**
     * Indicates whether the address is the default billing address
     */
    public Boolean getDefaultBilling() {
        return defaultBilling.getValue();
    }

    /**
     * Indicates whether the address is the default billing address
     */
    public Input<Boolean> getDefaultBillingInput() {
        return defaultBilling;
    }

    /**
     * Indicates whether the address is the default billing address
     */
    public CustomerAddressInput setDefaultBilling(Boolean defaultBilling) {
        this.defaultBilling = Input.optional(defaultBilling);
        return this;
    }

    /**
     * Indicates whether the address is the default billing address
     */
    public CustomerAddressInput setDefaultBillingInput(Input<Boolean> defaultBilling) {
        if (defaultBilling == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.defaultBilling = defaultBilling;
        return this;
    }

    /**
     * Indicates whether the address is the default shipping address
     */
    public Boolean getDefaultShipping() {
        return defaultShipping.getValue();
    }

    /**
     * Indicates whether the address is the default shipping address
     */
    public Input<Boolean> getDefaultShippingInput() {
        return defaultShipping;
    }

    /**
     * Indicates whether the address is the default shipping address
     */
    public CustomerAddressInput setDefaultShipping(Boolean defaultShipping) {
        this.defaultShipping = Input.optional(defaultShipping);
        return this;
    }

    /**
     * Indicates whether the address is the default shipping address
     */
    public CustomerAddressInput setDefaultShippingInput(Input<Boolean> defaultShipping) {
        if (defaultShipping == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.defaultShipping = defaultShipping;
        return this;
    }

    /**
     * The fax number
     */
    public String getFax() {
        return fax.getValue();
    }

    /**
     * The fax number
     */
    public Input<String> getFaxInput() {
        return fax;
    }

    /**
     * The fax number
     */
    public CustomerAddressInput setFax(String fax) {
        this.fax = Input.optional(fax);
        return this;
    }

    /**
     * The fax number
     */
    public CustomerAddressInput setFaxInput(Input<String> fax) {
        if (fax == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.fax = fax;
        return this;
    }

    /**
     * The first name of the person associated with the shipping/billing address
     */
    public String getFirstname() {
        return firstname.getValue();
    }

    /**
     * The first name of the person associated with the shipping/billing address
     */
    public Input<String> getFirstnameInput() {
        return firstname;
    }

    /**
     * The first name of the person associated with the shipping/billing address
     */
    public CustomerAddressInput setFirstname(String firstname) {
        this.firstname = Input.optional(firstname);
        return this;
    }

    /**
     * The first name of the person associated with the shipping/billing address
     */
    public CustomerAddressInput setFirstnameInput(Input<String> firstname) {
        if (firstname == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.firstname = firstname;
        return this;
    }

    /**
     * The family name of the person associated with the shipping/billing address
     */
    public String getLastname() {
        return lastname.getValue();
    }

    /**
     * The family name of the person associated with the shipping/billing address
     */
    public Input<String> getLastnameInput() {
        return lastname;
    }

    /**
     * The family name of the person associated with the shipping/billing address
     */
    public CustomerAddressInput setLastname(String lastname) {
        this.lastname = Input.optional(lastname);
        return this;
    }

    /**
     * The family name of the person associated with the shipping/billing address
     */
    public CustomerAddressInput setLastnameInput(Input<String> lastname) {
        if (lastname == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.lastname = lastname;
        return this;
    }

    /**
     * The middle name of the person associated with the shipping/billing address
     */
    public String getMiddlename() {
        return middlename.getValue();
    }

    /**
     * The middle name of the person associated with the shipping/billing address
     */
    public Input<String> getMiddlenameInput() {
        return middlename;
    }

    /**
     * The middle name of the person associated with the shipping/billing address
     */
    public CustomerAddressInput setMiddlename(String middlename) {
        this.middlename = Input.optional(middlename);
        return this;
    }

    /**
     * The middle name of the person associated with the shipping/billing address
     */
    public CustomerAddressInput setMiddlenameInput(Input<String> middlename) {
        if (middlename == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.middlename = middlename;
        return this;
    }

    /**
     * The customer&#39;s ZIP or postal code
     */
    public String getPostcode() {
        return postcode.getValue();
    }

    /**
     * The customer&#39;s ZIP or postal code
     */
    public Input<String> getPostcodeInput() {
        return postcode;
    }

    /**
     * The customer&#39;s ZIP or postal code
     */
    public CustomerAddressInput setPostcode(String postcode) {
        this.postcode = Input.optional(postcode);
        return this;
    }

    /**
     * The customer&#39;s ZIP or postal code
     */
    public CustomerAddressInput setPostcodeInput(Input<String> postcode) {
        if (postcode == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.postcode = postcode;
        return this;
    }

    /**
     * An honorific, such as Dr., Mr., or Mrs.
     */
    public String getPrefix() {
        return prefix.getValue();
    }

    /**
     * An honorific, such as Dr., Mr., or Mrs.
     */
    public Input<String> getPrefixInput() {
        return prefix;
    }

    /**
     * An honorific, such as Dr., Mr., or Mrs.
     */
    public CustomerAddressInput setPrefix(String prefix) {
        this.prefix = Input.optional(prefix);
        return this;
    }

    /**
     * An honorific, such as Dr., Mr., or Mrs.
     */
    public CustomerAddressInput setPrefixInput(Input<String> prefix) {
        if (prefix == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.prefix = prefix;
        return this;
    }

    /**
     * An object containing the region name, region code, and region ID
     */
    public CustomerAddressRegionInput getRegion() {
        return region.getValue();
    }

    /**
     * An object containing the region name, region code, and region ID
     */
    public Input<CustomerAddressRegionInput> getRegionInput() {
        return region;
    }

    /**
     * An object containing the region name, region code, and region ID
     */
    public CustomerAddressInput setRegion(CustomerAddressRegionInput region) {
        this.region = Input.optional(region);
        return this;
    }

    /**
     * An object containing the region name, region code, and region ID
     */
    public CustomerAddressInput setRegionInput(Input<CustomerAddressRegionInput> region) {
        if (region == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.region = region;
        return this;
    }

    /**
     * An array of strings that define the street number and name
     */
    public List<String> getStreet() {
        return street.getValue();
    }

    /**
     * An array of strings that define the street number and name
     */
    public Input<List<String>> getStreetInput() {
        return street;
    }

    /**
     * An array of strings that define the street number and name
     */
    public CustomerAddressInput setStreet(List<String> street) {
        this.street = Input.optional(street);
        return this;
    }

    /**
     * An array of strings that define the street number and name
     */
    public CustomerAddressInput setStreetInput(Input<List<String>> street) {
        if (street == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.street = street;
        return this;
    }

    /**
     * A value such as Sr., Jr., or III
     */
    public String getSuffix() {
        return suffix.getValue();
    }

    /**
     * A value such as Sr., Jr., or III
     */
    public Input<String> getSuffixInput() {
        return suffix;
    }

    /**
     * A value such as Sr., Jr., or III
     */
    public CustomerAddressInput setSuffix(String suffix) {
        this.suffix = Input.optional(suffix);
        return this;
    }

    /**
     * A value such as Sr., Jr., or III
     */
    public CustomerAddressInput setSuffixInput(Input<String> suffix) {
        if (suffix == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.suffix = suffix;
        return this;
    }

    /**
     * The telephone number
     */
    public String getTelephone() {
        return telephone.getValue();
    }

    /**
     * The telephone number
     */
    public Input<String> getTelephoneInput() {
        return telephone;
    }

    /**
     * The telephone number
     */
    public CustomerAddressInput setTelephone(String telephone) {
        this.telephone = Input.optional(telephone);
        return this;
    }

    /**
     * The telephone number
     */
    public CustomerAddressInput setTelephoneInput(Input<String> telephone) {
        if (telephone == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.telephone = telephone;
        return this;
    }

    /**
     * The customer&#39;s Tax/VAT number (for corporate customers)
     */
    public String getVatId() {
        return vatId.getValue();
    }

    /**
     * The customer&#39;s Tax/VAT number (for corporate customers)
     */
    public Input<String> getVatIdInput() {
        return vatId;
    }

    /**
     * The customer&#39;s Tax/VAT number (for corporate customers)
     */
    public CustomerAddressInput setVatId(String vatId) {
        this.vatId = Input.optional(vatId);
        return this;
    }

    /**
     * The customer&#39;s Tax/VAT number (for corporate customers)
     */
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

        if (this.countryCode.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("country_code:");
            if (countryCode.getValue() != null) {
                _queryBuilder.append(countryCode.getValue().toString());
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

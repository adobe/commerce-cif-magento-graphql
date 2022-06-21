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

import com.shopify.graphql.support.AbstractQuery;
import com.shopify.graphql.support.Input;

/**
 * An input object for creating a customer.
 */
public class CustomerCreateInput implements Serializable {
    private String email;

    private String firstname;

    private String lastname;

    private Input<Boolean> allowRemoteShoppingAssistance = Input.undefined();

    private Input<String> dateOfBirth = Input.undefined();

    private Input<String> dob = Input.undefined();

    private Input<Integer> gender = Input.undefined();

    private Input<Boolean> isSubscribed = Input.undefined();

    private Input<String> middlename = Input.undefined();

    private Input<String> password = Input.undefined();

    private Input<String> prefix = Input.undefined();

    private Input<String> suffix = Input.undefined();

    private Input<String> taxvat = Input.undefined();

    public CustomerCreateInput(String email, String firstname, String lastname) {
        this.email = email;

        this.firstname = firstname;

        this.lastname = lastname;
    }

    /**
     * The customer&#39;s email address.
     */
    public String getEmail() {
        return email;
    }

    /**
     * The customer&#39;s email address.
     */
    public CustomerCreateInput setEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * The customer&#39;s first name.
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * The customer&#39;s first name.
     */
    public CustomerCreateInput setFirstname(String firstname) {
        this.firstname = firstname;
        return this;
    }

    /**
     * The customer&#39;s family name.
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * The customer&#39;s family name.
     */
    public CustomerCreateInput setLastname(String lastname) {
        this.lastname = lastname;
        return this;
    }

    /**
     * Indicates whether the customer has enabled remote shopping assistance.
     */
    public Boolean getAllowRemoteShoppingAssistance() {
        return allowRemoteShoppingAssistance.getValue();
    }

    /**
     * Indicates whether the customer has enabled remote shopping assistance.
     */
    public Input<Boolean> getAllowRemoteShoppingAssistanceInput() {
        return allowRemoteShoppingAssistance;
    }

    /**
     * Indicates whether the customer has enabled remote shopping assistance.
     */
    public CustomerCreateInput setAllowRemoteShoppingAssistance(Boolean allowRemoteShoppingAssistance) {
        this.allowRemoteShoppingAssistance = Input.optional(allowRemoteShoppingAssistance);
        return this;
    }

    /**
     * Indicates whether the customer has enabled remote shopping assistance.
     */
    public CustomerCreateInput setAllowRemoteShoppingAssistanceInput(Input<Boolean> allowRemoteShoppingAssistance) {
        if (allowRemoteShoppingAssistance == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.allowRemoteShoppingAssistance = allowRemoteShoppingAssistance;
        return this;
    }

    /**
     * The customer&#39;s date of birth.
     */
    public String getDateOfBirth() {
        return dateOfBirth.getValue();
    }

    /**
     * The customer&#39;s date of birth.
     */
    public Input<String> getDateOfBirthInput() {
        return dateOfBirth;
    }

    /**
     * The customer&#39;s date of birth.
     */
    public CustomerCreateInput setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = Input.optional(dateOfBirth);
        return this;
    }

    /**
     * The customer&#39;s date of birth.
     */
    public CustomerCreateInput setDateOfBirthInput(Input<String> dateOfBirth) {
        if (dateOfBirth == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.dateOfBirth = dateOfBirth;
        return this;
    }

    /**
     * Deprecated: Use `date_of_birth` instead.
     */
    public String getDob() {
        return dob.getValue();
    }

    /**
     * Deprecated: Use `date_of_birth` instead.
     */
    public Input<String> getDobInput() {
        return dob;
    }

    /**
     * Deprecated: Use `date_of_birth` instead.
     */
    public CustomerCreateInput setDob(String dob) {
        this.dob = Input.optional(dob);
        return this;
    }

    /**
     * Deprecated: Use `date_of_birth` instead.
     */
    public CustomerCreateInput setDobInput(Input<String> dob) {
        if (dob == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.dob = dob;
        return this;
    }

    /**
     * The customer&#39;s gender (Male - 1, Female - 2).
     */
    public Integer getGender() {
        return gender.getValue();
    }

    /**
     * The customer&#39;s gender (Male - 1, Female - 2).
     */
    public Input<Integer> getGenderInput() {
        return gender;
    }

    /**
     * The customer&#39;s gender (Male - 1, Female - 2).
     */
    public CustomerCreateInput setGender(Integer gender) {
        this.gender = Input.optional(gender);
        return this;
    }

    /**
     * The customer&#39;s gender (Male - 1, Female - 2).
     */
    public CustomerCreateInput setGenderInput(Input<Integer> gender) {
        if (gender == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.gender = gender;
        return this;
    }

    /**
     * Indicates whether the customer is subscribed to the company&#39;s newsletter.
     */
    public Boolean getIsSubscribed() {
        return isSubscribed.getValue();
    }

    /**
     * Indicates whether the customer is subscribed to the company&#39;s newsletter.
     */
    public Input<Boolean> getIsSubscribedInput() {
        return isSubscribed;
    }

    /**
     * Indicates whether the customer is subscribed to the company&#39;s newsletter.
     */
    public CustomerCreateInput setIsSubscribed(Boolean isSubscribed) {
        this.isSubscribed = Input.optional(isSubscribed);
        return this;
    }

    /**
     * Indicates whether the customer is subscribed to the company&#39;s newsletter.
     */
    public CustomerCreateInput setIsSubscribedInput(Input<Boolean> isSubscribed) {
        if (isSubscribed == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.isSubscribed = isSubscribed;
        return this;
    }

    /**
     * The customer&#39;s middle name.
     */
    public String getMiddlename() {
        return middlename.getValue();
    }

    /**
     * The customer&#39;s middle name.
     */
    public Input<String> getMiddlenameInput() {
        return middlename;
    }

    /**
     * The customer&#39;s middle name.
     */
    public CustomerCreateInput setMiddlename(String middlename) {
        this.middlename = Input.optional(middlename);
        return this;
    }

    /**
     * The customer&#39;s middle name.
     */
    public CustomerCreateInput setMiddlenameInput(Input<String> middlename) {
        if (middlename == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.middlename = middlename;
        return this;
    }

    /**
     * The customer&#39;s password.
     */
    public String getPassword() {
        return password.getValue();
    }

    /**
     * The customer&#39;s password.
     */
    public Input<String> getPasswordInput() {
        return password;
    }

    /**
     * The customer&#39;s password.
     */
    public CustomerCreateInput setPassword(String password) {
        this.password = Input.optional(password);
        return this;
    }

    /**
     * The customer&#39;s password.
     */
    public CustomerCreateInput setPasswordInput(Input<String> password) {
        if (password == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.password = password;
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
    public CustomerCreateInput setPrefix(String prefix) {
        this.prefix = Input.optional(prefix);
        return this;
    }

    /**
     * An honorific, such as Dr., Mr., or Mrs.
     */
    public CustomerCreateInput setPrefixInput(Input<String> prefix) {
        if (prefix == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.prefix = prefix;
        return this;
    }

    /**
     * A value such as Sr., Jr., or III.
     */
    public String getSuffix() {
        return suffix.getValue();
    }

    /**
     * A value such as Sr., Jr., or III.
     */
    public Input<String> getSuffixInput() {
        return suffix;
    }

    /**
     * A value such as Sr., Jr., or III.
     */
    public CustomerCreateInput setSuffix(String suffix) {
        this.suffix = Input.optional(suffix);
        return this;
    }

    /**
     * A value such as Sr., Jr., or III.
     */
    public CustomerCreateInput setSuffixInput(Input<String> suffix) {
        if (suffix == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.suffix = suffix;
        return this;
    }

    /**
     * The customer&#39;s Tax/VAT number (for corporate customers).
     */
    public String getTaxvat() {
        return taxvat.getValue();
    }

    /**
     * The customer&#39;s Tax/VAT number (for corporate customers).
     */
    public Input<String> getTaxvatInput() {
        return taxvat;
    }

    /**
     * The customer&#39;s Tax/VAT number (for corporate customers).
     */
    public CustomerCreateInput setTaxvat(String taxvat) {
        this.taxvat = Input.optional(taxvat);
        return this;
    }

    /**
     * The customer&#39;s Tax/VAT number (for corporate customers).
     */
    public CustomerCreateInput setTaxvatInput(Input<String> taxvat) {
        if (taxvat == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.taxvat = taxvat;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("email:");
        AbstractQuery.appendQuotedString(_queryBuilder, email.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("firstname:");
        AbstractQuery.appendQuotedString(_queryBuilder, firstname.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("lastname:");
        AbstractQuery.appendQuotedString(_queryBuilder, lastname.toString());

        if (this.allowRemoteShoppingAssistance.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("allow_remote_shopping_assistance:");
            if (allowRemoteShoppingAssistance.getValue() != null) {
                _queryBuilder.append(allowRemoteShoppingAssistance.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.dateOfBirth.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("date_of_birth:");
            if (dateOfBirth.getValue() != null) {
                AbstractQuery.appendQuotedString(_queryBuilder, dateOfBirth.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.dob.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("dob:");
            if (dob.getValue() != null) {
                AbstractQuery.appendQuotedString(_queryBuilder, dob.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.gender.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("gender:");
            if (gender.getValue() != null) {
                _queryBuilder.append(gender.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.isSubscribed.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("is_subscribed:");
            if (isSubscribed.getValue() != null) {
                _queryBuilder.append(isSubscribed.getValue());
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

        if (this.password.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("password:");
            if (password.getValue() != null) {
                AbstractQuery.appendQuotedString(_queryBuilder, password.getValue().toString());
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

        if (this.taxvat.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("taxvat:");
            if (taxvat.getValue() != null) {
                AbstractQuery.appendQuotedString(_queryBuilder, taxvat.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}

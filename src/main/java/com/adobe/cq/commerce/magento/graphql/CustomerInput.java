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
import java.util.Map;

import com.shopify.graphql.support.AbstractQuery;
import com.shopify.graphql.support.Input;

/**
 * An input object that assigns or updates customer attributes.
 */
public class CustomerInput implements Serializable {
    private Input<String> dateOfBirth = Input.undefined();

    private Input<String> dob = Input.undefined();

    private Input<String> email = Input.undefined();

    private Input<String> firstname = Input.undefined();

    private Input<Integer> gender = Input.undefined();

    private Input<Boolean> isSubscribed = Input.undefined();

    private Input<String> lastname = Input.undefined();

    private Input<String> middlename = Input.undefined();

    private Input<String> password = Input.undefined();

    private Input<String> prefix = Input.undefined();

    private Input<String> suffix = Input.undefined();

    private Input<String> taxvat = Input.undefined();

    private Map<String, Input<Serializable>> customFilters = new HashMap<>();

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
    public CustomerInput setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = Input.optional(dateOfBirth);
        return this;
    }

    /**
     * The customer&#39;s date of birth.
     */
    public CustomerInput setDateOfBirthInput(Input<String> dateOfBirth) {
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
    public CustomerInput setDob(String dob) {
        this.dob = Input.optional(dob);
        return this;
    }

    /**
     * Deprecated: Use `date_of_birth` instead.
     */
    public CustomerInput setDobInput(Input<String> dob) {
        if (dob == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.dob = dob;
        return this;
    }

    /**
     * The customer&#39;s email address. Required when creating a customer.
     */
    public String getEmail() {
        return email.getValue();
    }

    /**
     * The customer&#39;s email address. Required when creating a customer.
     */
    public Input<String> getEmailInput() {
        return email;
    }

    /**
     * The customer&#39;s email address. Required when creating a customer.
     */
    public CustomerInput setEmail(String email) {
        this.email = Input.optional(email);
        return this;
    }

    /**
     * The customer&#39;s email address. Required when creating a customer.
     */
    public CustomerInput setEmailInput(Input<String> email) {
        if (email == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.email = email;
        return this;
    }

    /**
     * The customer&#39;s first name.
     */
    public String getFirstname() {
        return firstname.getValue();
    }

    /**
     * The customer&#39;s first name.
     */
    public Input<String> getFirstnameInput() {
        return firstname;
    }

    /**
     * The customer&#39;s first name.
     */
    public CustomerInput setFirstname(String firstname) {
        this.firstname = Input.optional(firstname);
        return this;
    }

    /**
     * The customer&#39;s first name.
     */
    public CustomerInput setFirstnameInput(Input<String> firstname) {
        if (firstname == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.firstname = firstname;
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
    public CustomerInput setGender(Integer gender) {
        this.gender = Input.optional(gender);
        return this;
    }

    /**
     * The customer&#39;s gender (Male - 1, Female - 2).
     */
    public CustomerInput setGenderInput(Input<Integer> gender) {
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
    public CustomerInput setIsSubscribed(Boolean isSubscribed) {
        this.isSubscribed = Input.optional(isSubscribed);
        return this;
    }

    /**
     * Indicates whether the customer is subscribed to the company&#39;s newsletter.
     */
    public CustomerInput setIsSubscribedInput(Input<Boolean> isSubscribed) {
        if (isSubscribed == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.isSubscribed = isSubscribed;
        return this;
    }

    /**
     * The customer&#39;s family name.
     */
    public String getLastname() {
        return lastname.getValue();
    }

    /**
     * The customer&#39;s family name.
     */
    public Input<String> getLastnameInput() {
        return lastname;
    }

    /**
     * The customer&#39;s family name.
     */
    public CustomerInput setLastname(String lastname) {
        this.lastname = Input.optional(lastname);
        return this;
    }

    /**
     * The customer&#39;s family name.
     */
    public CustomerInput setLastnameInput(Input<String> lastname) {
        if (lastname == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.lastname = lastname;
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
    public CustomerInput setMiddlename(String middlename) {
        this.middlename = Input.optional(middlename);
        return this;
    }

    /**
     * The customer&#39;s middle name.
     */
    public CustomerInput setMiddlenameInput(Input<String> middlename) {
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
    public CustomerInput setPassword(String password) {
        this.password = Input.optional(password);
        return this;
    }

    /**
     * The customer&#39;s password.
     */
    public CustomerInput setPasswordInput(Input<String> password) {
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
    public CustomerInput setPrefix(String prefix) {
        this.prefix = Input.optional(prefix);
        return this;
    }

    /**
     * An honorific, such as Dr., Mr., or Mrs.
     */
    public CustomerInput setPrefixInput(Input<String> prefix) {
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
    public CustomerInput setSuffix(String suffix) {
        this.suffix = Input.optional(suffix);
        return this;
    }

    /**
     * A value such as Sr., Jr., or III.
     */
    public CustomerInput setSuffixInput(Input<String> suffix) {
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
    public CustomerInput setTaxvat(String taxvat) {
        this.taxvat = Input.optional(taxvat);
        return this;
    }

    /**
     * The customer&#39;s Tax/VAT number (for corporate customers).
     */
    public CustomerInput setTaxvatInput(Input<String> taxvat) {
        if (taxvat == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.taxvat = taxvat;
        return this;
    }

    /**
     * Set custom filter.
     */
    public CustomerInput setCustomFilter(String name, Serializable filterInput) {
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

        if (this.email.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("email:");
            if (email.getValue() != null) {
                AbstractQuery.appendQuotedString(_queryBuilder, email.getValue().toString());
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

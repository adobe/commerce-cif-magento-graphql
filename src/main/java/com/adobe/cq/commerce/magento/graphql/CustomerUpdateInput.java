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
 * An input object for updating a customer.
 */
public class CustomerUpdateInput implements Serializable {
    private Input<Boolean> allowRemoteShoppingAssistance = Input.undefined();

    private Input<String> dateOfBirth = Input.undefined();

    private Input<String> dob = Input.undefined();

    private Input<String> firstname = Input.undefined();

    private Input<Integer> gender = Input.undefined();

    private Input<Boolean> isSubscribed = Input.undefined();

    private Input<String> lastname = Input.undefined();

    private Input<String> middlename = Input.undefined();

    private Input<String> prefix = Input.undefined();

    private Input<String> suffix = Input.undefined();

    private Input<String> taxvat = Input.undefined();

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
    public CustomerUpdateInput setAllowRemoteShoppingAssistance(Boolean allowRemoteShoppingAssistance) {
        this.allowRemoteShoppingAssistance = Input.optional(allowRemoteShoppingAssistance);
        return this;
    }

    /**
     * Indicates whether the customer has enabled remote shopping assistance.
     */
    public CustomerUpdateInput setAllowRemoteShoppingAssistanceInput(Input<Boolean> allowRemoteShoppingAssistance) {
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
    public CustomerUpdateInput setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = Input.optional(dateOfBirth);
        return this;
    }

    /**
     * The customer&#39;s date of birth.
     */
    public CustomerUpdateInput setDateOfBirthInput(Input<String> dateOfBirth) {
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
    public CustomerUpdateInput setDob(String dob) {
        this.dob = Input.optional(dob);
        return this;
    }

    /**
     * Deprecated: Use `date_of_birth` instead.
     */
    public CustomerUpdateInput setDobInput(Input<String> dob) {
        if (dob == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.dob = dob;
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
    public CustomerUpdateInput setFirstname(String firstname) {
        this.firstname = Input.optional(firstname);
        return this;
    }

    /**
     * The customer&#39;s first name.
     */
    public CustomerUpdateInput setFirstnameInput(Input<String> firstname) {
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
    public CustomerUpdateInput setGender(Integer gender) {
        this.gender = Input.optional(gender);
        return this;
    }

    /**
     * The customer&#39;s gender (Male - 1, Female - 2).
     */
    public CustomerUpdateInput setGenderInput(Input<Integer> gender) {
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
    public CustomerUpdateInput setIsSubscribed(Boolean isSubscribed) {
        this.isSubscribed = Input.optional(isSubscribed);
        return this;
    }

    /**
     * Indicates whether the customer is subscribed to the company&#39;s newsletter.
     */
    public CustomerUpdateInput setIsSubscribedInput(Input<Boolean> isSubscribed) {
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
    public CustomerUpdateInput setLastname(String lastname) {
        this.lastname = Input.optional(lastname);
        return this;
    }

    /**
     * The customer&#39;s family name.
     */
    public CustomerUpdateInput setLastnameInput(Input<String> lastname) {
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
    public CustomerUpdateInput setMiddlename(String middlename) {
        this.middlename = Input.optional(middlename);
        return this;
    }

    /**
     * The customer&#39;s middle name.
     */
    public CustomerUpdateInput setMiddlenameInput(Input<String> middlename) {
        if (middlename == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.middlename = middlename;
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
    public CustomerUpdateInput setPrefix(String prefix) {
        this.prefix = Input.optional(prefix);
        return this;
    }

    /**
     * An honorific, such as Dr., Mr., or Mrs.
     */
    public CustomerUpdateInput setPrefixInput(Input<String> prefix) {
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
    public CustomerUpdateInput setSuffix(String suffix) {
        this.suffix = Input.optional(suffix);
        return this;
    }

    /**
     * A value such as Sr., Jr., or III.
     */
    public CustomerUpdateInput setSuffixInput(Input<String> suffix) {
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
    public CustomerUpdateInput setTaxvat(String taxvat) {
        this.taxvat = Input.optional(taxvat);
        return this;
    }

    /**
     * The customer&#39;s Tax/VAT number (for corporate customers).
     */
    public CustomerUpdateInput setTaxvatInput(Input<String> taxvat) {
        if (taxvat == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.taxvat = taxvat;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

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

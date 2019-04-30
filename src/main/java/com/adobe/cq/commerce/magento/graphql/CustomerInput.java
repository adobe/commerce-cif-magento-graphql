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

import com.shopify.graphql.support.AbstractQuery;
import com.shopify.graphql.support.Input;

public class CustomerInput implements Serializable {
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

    public String getDob() {
        return dob.getValue();
    }

    public Input<String> getDobInput() {
        return dob;
    }

    public CustomerInput setDob(String dob) {
        this.dob = Input.optional(dob);
        return this;
    }

    public CustomerInput setDobInput(Input<String> dob) {
        if (dob == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.dob = dob;
        return this;
    }

    public String getEmail() {
        return email.getValue();
    }

    public Input<String> getEmailInput() {
        return email;
    }

    public CustomerInput setEmail(String email) {
        this.email = Input.optional(email);
        return this;
    }

    public CustomerInput setEmailInput(Input<String> email) {
        if (email == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.email = email;
        return this;
    }

    public String getFirstname() {
        return firstname.getValue();
    }

    public Input<String> getFirstnameInput() {
        return firstname;
    }

    public CustomerInput setFirstname(String firstname) {
        this.firstname = Input.optional(firstname);
        return this;
    }

    public CustomerInput setFirstnameInput(Input<String> firstname) {
        if (firstname == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.firstname = firstname;
        return this;
    }

    public Integer getGender() {
        return gender.getValue();
    }

    public Input<Integer> getGenderInput() {
        return gender;
    }

    public CustomerInput setGender(Integer gender) {
        this.gender = Input.optional(gender);
        return this;
    }

    public CustomerInput setGenderInput(Input<Integer> gender) {
        if (gender == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.gender = gender;
        return this;
    }

    public Boolean getIsSubscribed() {
        return isSubscribed.getValue();
    }

    public Input<Boolean> getIsSubscribedInput() {
        return isSubscribed;
    }

    public CustomerInput setIsSubscribed(Boolean isSubscribed) {
        this.isSubscribed = Input.optional(isSubscribed);
        return this;
    }

    public CustomerInput setIsSubscribedInput(Input<Boolean> isSubscribed) {
        if (isSubscribed == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.isSubscribed = isSubscribed;
        return this;
    }

    public String getLastname() {
        return lastname.getValue();
    }

    public Input<String> getLastnameInput() {
        return lastname;
    }

    public CustomerInput setLastname(String lastname) {
        this.lastname = Input.optional(lastname);
        return this;
    }

    public CustomerInput setLastnameInput(Input<String> lastname) {
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

    public CustomerInput setMiddlename(String middlename) {
        this.middlename = Input.optional(middlename);
        return this;
    }

    public CustomerInput setMiddlenameInput(Input<String> middlename) {
        if (middlename == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.middlename = middlename;
        return this;
    }

    public String getPassword() {
        return password.getValue();
    }

    public Input<String> getPasswordInput() {
        return password;
    }

    public CustomerInput setPassword(String password) {
        this.password = Input.optional(password);
        return this;
    }

    public CustomerInput setPasswordInput(Input<String> password) {
        if (password == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.password = password;
        return this;
    }

    public String getPrefix() {
        return prefix.getValue();
    }

    public Input<String> getPrefixInput() {
        return prefix;
    }

    public CustomerInput setPrefix(String prefix) {
        this.prefix = Input.optional(prefix);
        return this;
    }

    public CustomerInput setPrefixInput(Input<String> prefix) {
        if (prefix == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.prefix = prefix;
        return this;
    }

    public String getSuffix() {
        return suffix.getValue();
    }

    public Input<String> getSuffixInput() {
        return suffix;
    }

    public CustomerInput setSuffix(String suffix) {
        this.suffix = Input.optional(suffix);
        return this;
    }

    public CustomerInput setSuffixInput(Input<String> suffix) {
        if (suffix == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.suffix = suffix;
        return this;
    }

    public String getTaxvat() {
        return taxvat.getValue();
    }

    public Input<String> getTaxvatInput() {
        return taxvat;
    }

    public CustomerInput setTaxvat(String taxvat) {
        this.taxvat = Input.optional(taxvat);
        return this;
    }

    public CustomerInput setTaxvatInput(Input<String> taxvat) {
        if (taxvat == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.taxvat = taxvat;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

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

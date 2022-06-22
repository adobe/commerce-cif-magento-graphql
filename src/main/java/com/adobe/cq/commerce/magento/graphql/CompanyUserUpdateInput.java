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
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Input;

/**
 * Defines the input schema for updating a company user.
 */
public class CompanyUserUpdateInput implements Serializable {
    private ID id;

    private Input<String> email = Input.undefined();

    private Input<String> firstname = Input.undefined();

    private Input<String> jobTitle = Input.undefined();

    private Input<String> lastname = Input.undefined();

    private Input<ID> roleId = Input.undefined();

    private Input<CompanyUserStatusEnum> status = Input.undefined();

    private Input<String> telephone = Input.undefined();

    public CompanyUserUpdateInput(ID id) {
        this.id = id;
    }

    /**
     * The unique ID of a `Customer` object.
     */
    public ID getId() {
        return id;
    }

    /**
     * The unique ID of a `Customer` object.
     */
    public CompanyUserUpdateInput setId(ID id) {
        this.id = id;
        return this;
    }

    /**
     * The company user&#39;s email address.
     */
    public String getEmail() {
        return email.getValue();
    }

    /**
     * The company user&#39;s email address.
     */
    public Input<String> getEmailInput() {
        return email;
    }

    /**
     * The company user&#39;s email address.
     */
    public CompanyUserUpdateInput setEmail(String email) {
        this.email = Input.optional(email);
        return this;
    }

    /**
     * The company user&#39;s email address.
     */
    public CompanyUserUpdateInput setEmailInput(Input<String> email) {
        if (email == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.email = email;
        return this;
    }

    /**
     * The company user&#39;s first name.
     */
    public String getFirstname() {
        return firstname.getValue();
    }

    /**
     * The company user&#39;s first name.
     */
    public Input<String> getFirstnameInput() {
        return firstname;
    }

    /**
     * The company user&#39;s first name.
     */
    public CompanyUserUpdateInput setFirstname(String firstname) {
        this.firstname = Input.optional(firstname);
        return this;
    }

    /**
     * The company user&#39;s first name.
     */
    public CompanyUserUpdateInput setFirstnameInput(Input<String> firstname) {
        if (firstname == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.firstname = firstname;
        return this;
    }

    /**
     * The company user&#39;s job title or function.
     */
    public String getJobTitle() {
        return jobTitle.getValue();
    }

    /**
     * The company user&#39;s job title or function.
     */
    public Input<String> getJobTitleInput() {
        return jobTitle;
    }

    /**
     * The company user&#39;s job title or function.
     */
    public CompanyUserUpdateInput setJobTitle(String jobTitle) {
        this.jobTitle = Input.optional(jobTitle);
        return this;
    }

    /**
     * The company user&#39;s job title or function.
     */
    public CompanyUserUpdateInput setJobTitleInput(Input<String> jobTitle) {
        if (jobTitle == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.jobTitle = jobTitle;
        return this;
    }

    /**
     * The company user&#39;s last name.
     */
    public String getLastname() {
        return lastname.getValue();
    }

    /**
     * The company user&#39;s last name.
     */
    public Input<String> getLastnameInput() {
        return lastname;
    }

    /**
     * The company user&#39;s last name.
     */
    public CompanyUserUpdateInput setLastname(String lastname) {
        this.lastname = Input.optional(lastname);
        return this;
    }

    /**
     * The company user&#39;s last name.
     */
    public CompanyUserUpdateInput setLastnameInput(Input<String> lastname) {
        if (lastname == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.lastname = lastname;
        return this;
    }

    /**
     * The unique ID for a `CompanyRole` object.
     */
    public ID getRoleId() {
        return roleId.getValue();
    }

    /**
     * The unique ID for a `CompanyRole` object.
     */
    public Input<ID> getRoleIdInput() {
        return roleId;
    }

    /**
     * The unique ID for a `CompanyRole` object.
     */
    public CompanyUserUpdateInput setRoleId(ID roleId) {
        this.roleId = Input.optional(roleId);
        return this;
    }

    /**
     * The unique ID for a `CompanyRole` object.
     */
    public CompanyUserUpdateInput setRoleIdInput(Input<ID> roleId) {
        if (roleId == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.roleId = roleId;
        return this;
    }

    /**
     * Indicates whether the company user is ACTIVE or INACTIVE.
     */
    public CompanyUserStatusEnum getStatus() {
        return status.getValue();
    }

    /**
     * Indicates whether the company user is ACTIVE or INACTIVE.
     */
    public Input<CompanyUserStatusEnum> getStatusInput() {
        return status;
    }

    /**
     * Indicates whether the company user is ACTIVE or INACTIVE.
     */
    public CompanyUserUpdateInput setStatus(CompanyUserStatusEnum status) {
        this.status = Input.optional(status);
        return this;
    }

    /**
     * Indicates whether the company user is ACTIVE or INACTIVE.
     */
    public CompanyUserUpdateInput setStatusInput(Input<CompanyUserStatusEnum> status) {
        if (status == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.status = status;
        return this;
    }

    /**
     * The company user&#39;s phone number.
     */
    public String getTelephone() {
        return telephone.getValue();
    }

    /**
     * The company user&#39;s phone number.
     */
    public Input<String> getTelephoneInput() {
        return telephone;
    }

    /**
     * The company user&#39;s phone number.
     */
    public CompanyUserUpdateInput setTelephone(String telephone) {
        this.telephone = Input.optional(telephone);
        return this;
    }

    /**
     * The company user&#39;s phone number.
     */
    public CompanyUserUpdateInput setTelephoneInput(Input<String> telephone) {
        if (telephone == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.telephone = telephone;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("id:");
        AbstractQuery.appendQuotedString(_queryBuilder, id.toString());

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

        if (this.jobTitle.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("job_title:");
            if (jobTitle.getValue() != null) {
                AbstractQuery.appendQuotedString(_queryBuilder, jobTitle.getValue().toString());
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

        if (this.roleId.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("role_id:");
            if (roleId.getValue() != null) {
                AbstractQuery.appendQuotedString(_queryBuilder, roleId.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.status.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("status:");
            if (status.getValue() != null) {
                _queryBuilder.append(status.getValue().toString());
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

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
 * Defines the input schema for creating a company user.
 */
public class CompanyUserCreateInput implements Serializable {
    private String email;

    private String firstname;

    private String jobTitle;

    private String lastname;

    private ID roleId;

    private CompanyUserStatusEnum status;

    private String telephone;

    private Input<ID> targetId = Input.undefined();

    public CompanyUserCreateInput(String email, String firstname, String jobTitle, String lastname, ID roleId, CompanyUserStatusEnum status,
                                  String telephone) {
        this.email = email;

        this.firstname = firstname;

        this.jobTitle = jobTitle;

        this.lastname = lastname;

        this.roleId = roleId;

        this.status = status;

        this.telephone = telephone;
    }

    /**
     * The company user&#39;s email address
     */
    public String getEmail() {
        return email;
    }

    /**
     * The company user&#39;s email address
     */
    public CompanyUserCreateInput setEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * The company user&#39;s first name.
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * The company user&#39;s first name.
     */
    public CompanyUserCreateInput setFirstname(String firstname) {
        this.firstname = firstname;
        return this;
    }

    /**
     * The company user&#39;s job title or function.
     */
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * The company user&#39;s job title or function.
     */
    public CompanyUserCreateInput setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
        return this;
    }

    /**
     * The company user&#39;s last name.
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * The company user&#39;s last name.
     */
    public CompanyUserCreateInput setLastname(String lastname) {
        this.lastname = lastname;
        return this;
    }

    /**
     * The unique ID for a `CompanyRole` object.
     */
    public ID getRoleId() {
        return roleId;
    }

    /**
     * The unique ID for a `CompanyRole` object.
     */
    public CompanyUserCreateInput setRoleId(ID roleId) {
        this.roleId = roleId;
        return this;
    }

    /**
     * Indicates whether the company user is ACTIVE or INACTIVE.
     */
    public CompanyUserStatusEnum getStatus() {
        return status;
    }

    /**
     * Indicates whether the company user is ACTIVE or INACTIVE.
     */
    public CompanyUserCreateInput setStatus(CompanyUserStatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * The company user&#39;s phone number.
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * The company user&#39;s phone number.
     */
    public CompanyUserCreateInput setTelephone(String telephone) {
        this.telephone = telephone;
        return this;
    }

    /**
     * The ID of a node within a company&#39;s structure. This ID will be the parent of the created company
     * user.
     */
    public ID getTargetId() {
        return targetId.getValue();
    }

    /**
     * The ID of a node within a company&#39;s structure. This ID will be the parent of the created company
     * user.
     */
    public Input<ID> getTargetIdInput() {
        return targetId;
    }

    /**
     * The ID of a node within a company&#39;s structure. This ID will be the parent of the created company
     * user.
     */
    public CompanyUserCreateInput setTargetId(ID targetId) {
        this.targetId = Input.optional(targetId);
        return this;
    }

    /**
     * The ID of a node within a company&#39;s structure. This ID will be the parent of the created company
     * user.
     */
    public CompanyUserCreateInput setTargetIdInput(Input<ID> targetId) {
        if (targetId == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.targetId = targetId;
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
        _queryBuilder.append("job_title:");
        AbstractQuery.appendQuotedString(_queryBuilder, jobTitle.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("lastname:");
        AbstractQuery.appendQuotedString(_queryBuilder, lastname.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("role_id:");
        AbstractQuery.appendQuotedString(_queryBuilder, roleId.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("status:");
        _queryBuilder.append(status.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("telephone:");
        AbstractQuery.appendQuotedString(_queryBuilder, telephone.toString());

        if (this.targetId.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("target_id:");
            if (targetId.getValue() != null) {
                AbstractQuery.appendQuotedString(_queryBuilder, targetId.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}

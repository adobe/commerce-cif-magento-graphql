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
 * Defines the input schema for creating a company administrator.
 */
public class CompanyAdminInput implements Serializable {
    private String email;

    private String firstname;

    private String lastname;

    private Input<Integer> gender = Input.undefined();

    private Input<String> jobTitle = Input.undefined();

    public CompanyAdminInput(String email, String firstname, String lastname) {
        this.email = email;

        this.firstname = firstname;

        this.lastname = lastname;
    }

    /**
     * The email address of the company administrator.
     */
    public String getEmail() {
        return email;
    }

    /**
     * The email address of the company administrator.
     */
    public CompanyAdminInput setEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * The company administrator&#39;s first name.
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * The company administrator&#39;s first name.
     */
    public CompanyAdminInput setFirstname(String firstname) {
        this.firstname = firstname;
        return this;
    }

    /**
     * The company administrator&#39;s last name.
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * The company administrator&#39;s last name.
     */
    public CompanyAdminInput setLastname(String lastname) {
        this.lastname = lastname;
        return this;
    }

    /**
     * The company administrator&#39;s gender (Male - 1, Female - 2, Not Specified - 3).
     */
    public Integer getGender() {
        return gender.getValue();
    }

    /**
     * The company administrator&#39;s gender (Male - 1, Female - 2, Not Specified - 3).
     */
    public Input<Integer> getGenderInput() {
        return gender;
    }

    /**
     * The company administrator&#39;s gender (Male - 1, Female - 2, Not Specified - 3).
     */
    public CompanyAdminInput setGender(Integer gender) {
        this.gender = Input.optional(gender);
        return this;
    }

    /**
     * The company administrator&#39;s gender (Male - 1, Female - 2, Not Specified - 3).
     */
    public CompanyAdminInput setGenderInput(Input<Integer> gender) {
        if (gender == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.gender = gender;
        return this;
    }

    /**
     * The job title of the company administrator.
     */
    public String getJobTitle() {
        return jobTitle.getValue();
    }

    /**
     * The job title of the company administrator.
     */
    public Input<String> getJobTitleInput() {
        return jobTitle;
    }

    /**
     * The job title of the company administrator.
     */
    public CompanyAdminInput setJobTitle(String jobTitle) {
        this.jobTitle = Input.optional(jobTitle);
        return this;
    }

    /**
     * The job title of the company administrator.
     */
    public CompanyAdminInput setJobTitleInput(Input<String> jobTitle) {
        if (jobTitle == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.jobTitle = jobTitle;
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

        _queryBuilder.append('}');
    }
}

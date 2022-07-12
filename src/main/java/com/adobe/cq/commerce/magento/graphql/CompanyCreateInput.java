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
 * Defines the input schema for creating a new company.
 */
public class CompanyCreateInput implements Serializable {
    private CompanyAdminInput companyAdmin;

    private String companyEmail;

    private String companyName;

    private CompanyLegalAddressCreateInput legalAddress;

    private Input<String> legalName = Input.undefined();

    private Input<String> resellerId = Input.undefined();

    private Input<String> vatTaxId = Input.undefined();

    private Map<String, Input<Serializable>> customFilters = new HashMap<>();

    public CompanyCreateInput(CompanyAdminInput companyAdmin, String companyEmail, String companyName,
                              CompanyLegalAddressCreateInput legalAddress) {
        this.companyAdmin = companyAdmin;

        this.companyEmail = companyEmail;

        this.companyName = companyName;

        this.legalAddress = legalAddress;
    }

    /**
     * Defines the company administrator.
     */
    public CompanyAdminInput getCompanyAdmin() {
        return companyAdmin;
    }

    /**
     * Defines the company administrator.
     */
    public CompanyCreateInput setCompanyAdmin(CompanyAdminInput companyAdmin) {
        this.companyAdmin = companyAdmin;
        return this;
    }

    /**
     * The email address of the company contact.
     */
    public String getCompanyEmail() {
        return companyEmail;
    }

    /**
     * The email address of the company contact.
     */
    public CompanyCreateInput setCompanyEmail(String companyEmail) {
        this.companyEmail = companyEmail;
        return this;
    }

    /**
     * The name of the company to create.
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * The name of the company to create.
     */
    public CompanyCreateInput setCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }

    /**
     * Defines legal address data of the company.
     */
    public CompanyLegalAddressCreateInput getLegalAddress() {
        return legalAddress;
    }

    /**
     * Defines legal address data of the company.
     */
    public CompanyCreateInput setLegalAddress(CompanyLegalAddressCreateInput legalAddress) {
        this.legalAddress = legalAddress;
        return this;
    }

    /**
     * The full legal name of the company.
     */
    public String getLegalName() {
        return legalName.getValue();
    }

    /**
     * The full legal name of the company.
     */
    public Input<String> getLegalNameInput() {
        return legalName;
    }

    /**
     * The full legal name of the company.
     */
    public CompanyCreateInput setLegalName(String legalName) {
        this.legalName = Input.optional(legalName);
        return this;
    }

    /**
     * The full legal name of the company.
     */
    public CompanyCreateInput setLegalNameInput(Input<String> legalName) {
        if (legalName == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.legalName = legalName;
        return this;
    }

    /**
     * The resale number that is assigned to the company for tax reporting purposes.
     */
    public String getResellerId() {
        return resellerId.getValue();
    }

    /**
     * The resale number that is assigned to the company for tax reporting purposes.
     */
    public Input<String> getResellerIdInput() {
        return resellerId;
    }

    /**
     * The resale number that is assigned to the company for tax reporting purposes.
     */
    public CompanyCreateInput setResellerId(String resellerId) {
        this.resellerId = Input.optional(resellerId);
        return this;
    }

    /**
     * The resale number that is assigned to the company for tax reporting purposes.
     */
    public CompanyCreateInput setResellerIdInput(Input<String> resellerId) {
        if (resellerId == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.resellerId = resellerId;
        return this;
    }

    /**
     * The value-added tax number that is assigned to the company by some jurisdictions for tax reporting
     * purposes.
     */
    public String getVatTaxId() {
        return vatTaxId.getValue();
    }

    /**
     * The value-added tax number that is assigned to the company by some jurisdictions for tax reporting
     * purposes.
     */
    public Input<String> getVatTaxIdInput() {
        return vatTaxId;
    }

    /**
     * The value-added tax number that is assigned to the company by some jurisdictions for tax reporting
     * purposes.
     */
    public CompanyCreateInput setVatTaxId(String vatTaxId) {
        this.vatTaxId = Input.optional(vatTaxId);
        return this;
    }

    /**
     * The value-added tax number that is assigned to the company by some jurisdictions for tax reporting
     * purposes.
     */
    public CompanyCreateInput setVatTaxIdInput(Input<String> vatTaxId) {
        if (vatTaxId == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.vatTaxId = vatTaxId;
        return this;
    }

    /**
     * Set custom filter.
     */
    public CompanyCreateInput setCustomFilter(String name, Serializable filterInput) {
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

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("company_admin:");
        companyAdmin.appendTo(_queryBuilder);

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("company_email:");
        AbstractQuery.appendQuotedString(_queryBuilder, companyEmail.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("company_name:");
        AbstractQuery.appendQuotedString(_queryBuilder, companyName.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("legal_address:");
        legalAddress.appendTo(_queryBuilder);

        if (this.legalName.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("legal_name:");
            if (legalName.getValue() != null) {
                AbstractQuery.appendQuotedString(_queryBuilder, legalName.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.resellerId.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("reseller_id:");
            if (resellerId.getValue() != null) {
                AbstractQuery.appendQuotedString(_queryBuilder, resellerId.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.vatTaxId.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("vat_tax_id:");
            if (vatTaxId.getValue() != null) {
                AbstractQuery.appendQuotedString(_queryBuilder, vatTaxId.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}

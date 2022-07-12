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
 * Defines the input schema for updating a company.
 */
public class CompanyUpdateInput implements Serializable {
    private Input<String> companyEmail = Input.undefined();

    private Input<String> companyName = Input.undefined();

    private Input<CompanyLegalAddressUpdateInput> legalAddress = Input.undefined();

    private Input<String> legalName = Input.undefined();

    private Input<String> resellerId = Input.undefined();

    private Input<String> vatTaxId = Input.undefined();

    private Map<String, Input<Serializable>> customFilters = new HashMap<>();

    /**
     * The email address of the company contact.
     */
    public String getCompanyEmail() {
        return companyEmail.getValue();
    }

    /**
     * The email address of the company contact.
     */
    public Input<String> getCompanyEmailInput() {
        return companyEmail;
    }

    /**
     * The email address of the company contact.
     */
    public CompanyUpdateInput setCompanyEmail(String companyEmail) {
        this.companyEmail = Input.optional(companyEmail);
        return this;
    }

    /**
     * The email address of the company contact.
     */
    public CompanyUpdateInput setCompanyEmailInput(Input<String> companyEmail) {
        if (companyEmail == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.companyEmail = companyEmail;
        return this;
    }

    /**
     * The name of the company to update.
     */
    public String getCompanyName() {
        return companyName.getValue();
    }

    /**
     * The name of the company to update.
     */
    public Input<String> getCompanyNameInput() {
        return companyName;
    }

    /**
     * The name of the company to update.
     */
    public CompanyUpdateInput setCompanyName(String companyName) {
        this.companyName = Input.optional(companyName);
        return this;
    }

    /**
     * The name of the company to update.
     */
    public CompanyUpdateInput setCompanyNameInput(Input<String> companyName) {
        if (companyName == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.companyName = companyName;
        return this;
    }

    /**
     * The legal address data of the company.
     */
    public CompanyLegalAddressUpdateInput getLegalAddress() {
        return legalAddress.getValue();
    }

    /**
     * The legal address data of the company.
     */
    public Input<CompanyLegalAddressUpdateInput> getLegalAddressInput() {
        return legalAddress;
    }

    /**
     * The legal address data of the company.
     */
    public CompanyUpdateInput setLegalAddress(CompanyLegalAddressUpdateInput legalAddress) {
        this.legalAddress = Input.optional(legalAddress);
        return this;
    }

    /**
     * The legal address data of the company.
     */
    public CompanyUpdateInput setLegalAddressInput(Input<CompanyLegalAddressUpdateInput> legalAddress) {
        if (legalAddress == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
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
    public CompanyUpdateInput setLegalName(String legalName) {
        this.legalName = Input.optional(legalName);
        return this;
    }

    /**
     * The full legal name of the company.
     */
    public CompanyUpdateInput setLegalNameInput(Input<String> legalName) {
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
    public CompanyUpdateInput setResellerId(String resellerId) {
        this.resellerId = Input.optional(resellerId);
        return this;
    }

    /**
     * The resale number that is assigned to the company for tax reporting purposes.
     */
    public CompanyUpdateInput setResellerIdInput(Input<String> resellerId) {
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
    public CompanyUpdateInput setVatTaxId(String vatTaxId) {
        this.vatTaxId = Input.optional(vatTaxId);
        return this;
    }

    /**
     * The value-added tax number that is assigned to the company by some jurisdictions for tax reporting
     * purposes.
     */
    public CompanyUpdateInput setVatTaxIdInput(Input<String> vatTaxId) {
        if (vatTaxId == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.vatTaxId = vatTaxId;
        return this;
    }

    /**
     * Set custom filter.
     */
    public CompanyUpdateInput setCustomFilter(String name, Serializable filterInput) {
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

        if (this.companyEmail.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("company_email:");
            if (companyEmail.getValue() != null) {
                AbstractQuery.appendQuotedString(_queryBuilder, companyEmail.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.companyName.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("company_name:");
            if (companyName.getValue() != null) {
                AbstractQuery.appendQuotedString(_queryBuilder, companyName.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.legalAddress.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("legal_address:");
            if (legalAddress.getValue() != null) {
                legalAddress.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

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

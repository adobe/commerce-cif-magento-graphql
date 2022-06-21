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

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;

/**
 * Contains the output schema for a company.
 */
public class Company extends AbstractResponse<Company> {
    public Company() {}

    public Company(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "acl_resources": {
                    List<CompanyAclResource> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<CompanyAclResource> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            CompanyAclResource optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new CompanyAclResource(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "company_admin": {
                    Customer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Customer(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "credit": {
                    responseData.put(key, new CompanyCredit(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "credit_history": {
                    responseData.put(key, new CompanyCreditHistory(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "email": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "legal_address": {
                    CompanyLegalAddress optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CompanyLegalAddress(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "legal_name": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "name": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "payment_methods": {
                    List<String> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<String> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            String optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = jsonAsString(element1, key);
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "reseller_id": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "role": {
                    CompanyRole optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CompanyRole(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "roles": {
                    responseData.put(key, new CompanyRoles(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "sales_representative": {
                    CompanySalesRepresentative optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CompanySalesRepresentative(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "structure": {
                    CompanyStructure optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CompanyStructure(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "team": {
                    CompanyTeam optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CompanyTeam(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "user": {
                    Customer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Customer(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "users": {
                    CompanyUsers optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CompanyUsers(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "vat_tax_id": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "__typename": {
                    responseData.put(key, jsonAsString(field.getValue(), key));
                    break;
                }

                default: {
                    readCustomField(fieldName, field.getValue());
                }
            }
        }
    }

    public String getGraphQlTypeName() {
        return "Company";
    }

    /**
     * The list of all resources defined within the company.
     */
    public List<CompanyAclResource> getAclResources() {
        return (List<CompanyAclResource>) get("acl_resources");
    }

    public Company setAclResources(List<CompanyAclResource> arg) {
        optimisticData.put(getKey("acl_resources"), arg);
        return this;
    }

    /**
     * An object containing information about the company administrator.
     */
    public Customer getCompanyAdmin() {
        return (Customer) get("company_admin");
    }

    public Company setCompanyAdmin(Customer arg) {
        optimisticData.put(getKey("company_admin"), arg);
        return this;
    }

    /**
     * Company credit balances and limits.
     */
    public CompanyCredit getCredit() {
        return (CompanyCredit) get("credit");
    }

    public Company setCredit(CompanyCredit arg) {
        optimisticData.put(getKey("credit"), arg);
        return this;
    }

    /**
     * Details about the history of company credit operations.
     */
    public CompanyCreditHistory getCreditHistory() {
        return (CompanyCreditHistory) get("credit_history");
    }

    public Company setCreditHistory(CompanyCreditHistory arg) {
        optimisticData.put(getKey("credit_history"), arg);
        return this;
    }

    /**
     * The email address of the company contact.
     */
    public String getEmail() {
        return (String) get("email");
    }

    public Company setEmail(String arg) {
        optimisticData.put(getKey("email"), arg);
        return this;
    }

    /**
     * The unique ID of a `Company` object.
     */
    public ID getId() {
        return (ID) get("id");
    }

    public Company setId(ID arg) {
        optimisticData.put(getKey("id"), arg);
        return this;
    }

    /**
     * The address where the company is registered to conduct business.
     */
    public CompanyLegalAddress getLegalAddress() {
        return (CompanyLegalAddress) get("legal_address");
    }

    public Company setLegalAddress(CompanyLegalAddress arg) {
        optimisticData.put(getKey("legal_address"), arg);
        return this;
    }

    /**
     * The full legal name of the company.
     */
    public String getLegalName() {
        return (String) get("legal_name");
    }

    public Company setLegalName(String arg) {
        optimisticData.put(getKey("legal_name"), arg);
        return this;
    }

    /**
     * The name of the company.
     */
    public String getName() {
        return (String) get("name");
    }

    public Company setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    /**
     * The list of payment methods available to a company.
     */
    public List<String> getPaymentMethods() {
        return (List<String>) get("payment_methods");
    }

    public Company setPaymentMethods(List<String> arg) {
        optimisticData.put(getKey("payment_methods"), arg);
        return this;
    }

    /**
     * The resale number that is assigned to the company for tax reporting purposes.
     */
    public String getResellerId() {
        return (String) get("reseller_id");
    }

    public Company setResellerId(String arg) {
        optimisticData.put(getKey("reseller_id"), arg);
        return this;
    }

    /**
     * A company role filtered by the unique ID of a `CompanyRole` object.
     */
    public CompanyRole getRole() {
        return (CompanyRole) get("role");
    }

    public Company setRole(CompanyRole arg) {
        optimisticData.put(getKey("role"), arg);
        return this;
    }

    /**
     * An object that contains a list of company roles.
     */
    public CompanyRoles getRoles() {
        return (CompanyRoles) get("roles");
    }

    public Company setRoles(CompanyRoles arg) {
        optimisticData.put(getKey("roles"), arg);
        return this;
    }

    /**
     * An object containing information about the company sales representative.
     */
    public CompanySalesRepresentative getSalesRepresentative() {
        return (CompanySalesRepresentative) get("sales_representative");
    }

    public Company setSalesRepresentative(CompanySalesRepresentative arg) {
        optimisticData.put(getKey("sales_representative"), arg);
        return this;
    }

    /**
     * The company structure of teams and customers in depth-first order.
     */
    public CompanyStructure getStructure() {
        return (CompanyStructure) get("structure");
    }

    public Company setStructure(CompanyStructure arg) {
        optimisticData.put(getKey("structure"), arg);
        return this;
    }

    /**
     * The company team data filtered by the unique ID for a `CompanyTeam` object.
     */
    public CompanyTeam getTeam() {
        return (CompanyTeam) get("team");
    }

    public Company setTeam(CompanyTeam arg) {
        optimisticData.put(getKey("team"), arg);
        return this;
    }

    /**
     * A company user filtered by the unique ID of a `Customer` object.
     */
    public Customer getUser() {
        return (Customer) get("user");
    }

    public Company setUser(Customer arg) {
        optimisticData.put(getKey("user"), arg);
        return this;
    }

    /**
     * An object that contains a list of company users based on activity status.
     */
    public CompanyUsers getUsers() {
        return (CompanyUsers) get("users");
    }

    public Company setUsers(CompanyUsers arg) {
        optimisticData.put(getKey("users"), arg);
        return this;
    }

    /**
     * The value-added tax number that is assigned to the company by some jurisdictions for tax reporting
     * purposes.
     */
    public String getVatTaxId() {
        return (String) get("vat_tax_id");
    }

    public Company setVatTaxId(String arg) {
        optimisticData.put(getKey("vat_tax_id"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "acl_resources":
                return true;

            case "company_admin":
                return true;

            case "credit":
                return true;

            case "credit_history":
                return true;

            case "email":
                return false;

            case "id":
                return false;

            case "legal_address":
                return true;

            case "legal_name":
                return false;

            case "name":
                return false;

            case "payment_methods":
                return false;

            case "reseller_id":
                return false;

            case "role":
                return true;

            case "roles":
                return true;

            case "sales_representative":
                return true;

            case "structure":
                return true;

            case "team":
                return true;

            case "user":
                return true;

            case "users":
                return true;

            case "vat_tax_id":
                return false;

            default:
                return false;
        }
    }
}

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

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;

/**
 * Customer defines the customer name and address and other details
 */
public class Customer extends AbstractResponse<Customer> {
    public Customer() {
    }

    public Customer(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "addresses": {
                    List<CustomerAddress> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<CustomerAddress> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            CustomerAddress optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new CustomerAddress(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "created_at": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "default_billing": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "default_shipping": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "dob": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

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

                case "firstname": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "gender": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "group_id": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "id": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "is_subscribed": {
                    Boolean optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsBoolean(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "lastname": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "middlename": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "prefix": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "suffix": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "taxvat": {
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
                    throw new SchemaViolationError(this, key, field.getValue());
                }
            }
        }
    }

    public String getGraphQlTypeName() {
        return "Customer";
    }

    /**
     * An array containing the customer&#39;s shipping and billing addresses
     */

    public List<CustomerAddress> getAddresses() {
        return (List<CustomerAddress>) get("addresses");
    }

    public Customer setAddresses(List<CustomerAddress> arg) {
        optimisticData.put(getKey("addresses"), arg);
        return this;
    }

    /**
     * Timestamp indicating when the account was created
     */

    public String getCreatedAt() {
        return (String) get("created_at");
    }

    public Customer setCreatedAt(String arg) {
        optimisticData.put(getKey("created_at"), arg);
        return this;
    }

    /**
     * The ID assigned to the billing address
     */

    public String getDefaultBilling() {
        return (String) get("default_billing");
    }

    public Customer setDefaultBilling(String arg) {
        optimisticData.put(getKey("default_billing"), arg);
        return this;
    }

    /**
     * The ID assigned to the shipping address
     */

    public String getDefaultShipping() {
        return (String) get("default_shipping");
    }

    public Customer setDefaultShipping(String arg) {
        optimisticData.put(getKey("default_shipping"), arg);
        return this;
    }

    /**
     * The customer&#39;s date of birth
     */

    public String getDob() {
        return (String) get("dob");
    }

    public Customer setDob(String arg) {
        optimisticData.put(getKey("dob"), arg);
        return this;
    }

    /**
     * The customer&#39;s email address. Required
     */

    public String getEmail() {
        return (String) get("email");
    }

    public Customer setEmail(String arg) {
        optimisticData.put(getKey("email"), arg);
        return this;
    }

    /**
     * The customer&#39;s first name
     */

    public String getFirstname() {
        return (String) get("firstname");
    }

    public Customer setFirstname(String arg) {
        optimisticData.put(getKey("firstname"), arg);
        return this;
    }

    /**
     * The customer&#39;s gender(Male - 1, Female - 2)
     */

    public Integer getGender() {
        return (Integer) get("gender");
    }

    public Customer setGender(Integer arg) {
        optimisticData.put(getKey("gender"), arg);
        return this;
    }

    /**
     * The group assigned to the user. Default values are 0 (Not logged in), 1 (General), 2 (Wholesale),
     * and 3 (Retailer)
     */

    public Integer getGroupId() {
        return (Integer) get("group_id");
    }

    public Customer setGroupId(Integer arg) {
        optimisticData.put(getKey("group_id"), arg);
        return this;
    }

    /**
     * The ID assigned to the customer
     */

    public Integer getId() {
        return (Integer) get("id");
    }

    public Customer setId(Integer arg) {
        optimisticData.put(getKey("id"), arg);
        return this;
    }

    /**
     * Indicates whether the customer is subscribed to the company&#39;s newsletter
     */

    public Boolean getIsSubscribed() {
        return (Boolean) get("is_subscribed");
    }

    public Customer setIsSubscribed(Boolean arg) {
        optimisticData.put(getKey("is_subscribed"), arg);
        return this;
    }

    /**
     * The customer&#39;s family name
     */

    public String getLastname() {
        return (String) get("lastname");
    }

    public Customer setLastname(String arg) {
        optimisticData.put(getKey("lastname"), arg);
        return this;
    }

    /**
     * The customer&#39;s middle name
     */

    public String getMiddlename() {
        return (String) get("middlename");
    }

    public Customer setMiddlename(String arg) {
        optimisticData.put(getKey("middlename"), arg);
        return this;
    }

    /**
     * An honorific, such as Dr., Mr., or Mrs.
     */

    public String getPrefix() {
        return (String) get("prefix");
    }

    public Customer setPrefix(String arg) {
        optimisticData.put(getKey("prefix"), arg);
        return this;
    }

    /**
     * A value such as Sr., Jr., or III
     */

    public String getSuffix() {
        return (String) get("suffix");
    }

    public Customer setSuffix(String arg) {
        optimisticData.put(getKey("suffix"), arg);
        return this;
    }

    /**
     * The customer&#39;s Tax/VAT number (for corporate customers)
     */

    public String getTaxvat() {
        return (String) get("taxvat");
    }

    public Customer setTaxvat(String arg) {
        optimisticData.put(getKey("taxvat"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "addresses": return true;

            case "created_at": return false;

            case "default_billing": return false;

            case "default_shipping": return false;

            case "dob": return false;

            case "email": return false;

            case "firstname": return false;

            case "gender": return false;

            case "group_id": return false;

            case "id": return false;

            case "is_subscribed": return false;

            case "lastname": return false;

            case "middlename": return false;

            case "prefix": return false;

            case "suffix": return false;

            case "taxvat": return false;

            default: return false;
        }
    }
}


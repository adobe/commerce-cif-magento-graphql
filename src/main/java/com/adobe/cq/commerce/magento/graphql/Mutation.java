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

import java.util.Map;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;

/**
 * 
 */
public class Mutation extends AbstractResponse<Mutation> {
    public Mutation() {
    }

    public Mutation(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "changeCustomerPassword": {
                    Customer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Customer(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "createCustomer": {
                    CustomerOutput optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CustomerOutput(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "createCustomerAddress": {
                    CustomerAddress optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CustomerAddress(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "createEmptyCart": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "deleteCustomerAddress": {
                    Boolean optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsBoolean(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "generateCustomerToken": {
                    CustomerToken optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CustomerToken(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "revokeCustomerToken": {
                    RevokeCustomerTokenOutput optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new RevokeCustomerTokenOutput(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "sendEmailToFriend": {
                    SendEmailToFriendOutput optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new SendEmailToFriendOutput(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "updateCustomer": {
                    CustomerOutput optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CustomerOutput(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "updateCustomerAddress": {
                    CustomerAddress optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CustomerAddress(jsonAsObject(field.getValue(), key));
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
        return "Mutation";
    }

    /**
     * Changes the password for the logged-in customer
     */

    public Customer getChangeCustomerPassword() {
        return (Customer) get("changeCustomerPassword");
    }

    public Mutation setChangeCustomerPassword(Customer arg) {
        optimisticData.put(getKey("changeCustomerPassword"), arg);
        return this;
    }

    /**
     * Create customer account
     */

    public CustomerOutput getCreateCustomer() {
        return (CustomerOutput) get("createCustomer");
    }

    public Mutation setCreateCustomer(CustomerOutput arg) {
        optimisticData.put(getKey("createCustomer"), arg);
        return this;
    }

    /**
     * Create customer address
     */

    public CustomerAddress getCreateCustomerAddress() {
        return (CustomerAddress) get("createCustomerAddress");
    }

    public Mutation setCreateCustomerAddress(CustomerAddress arg) {
        optimisticData.put(getKey("createCustomerAddress"), arg);
        return this;
    }

    /**
     * Creates empty shopping cart for guest or logged in user
     */

    public String getCreateEmptyCart() {
        return (String) get("createEmptyCart");
    }

    public Mutation setCreateEmptyCart(String arg) {
        optimisticData.put(getKey("createEmptyCart"), arg);
        return this;
    }

    /**
     * Delete customer address
     */

    public Boolean getDeleteCustomerAddress() {
        return (Boolean) get("deleteCustomerAddress");
    }

    public Mutation setDeleteCustomerAddress(Boolean arg) {
        optimisticData.put(getKey("deleteCustomerAddress"), arg);
        return this;
    }

    /**
     * Retrieve the customer token
     */

    public CustomerToken getGenerateCustomerToken() {
        return (CustomerToken) get("generateCustomerToken");
    }

    public Mutation setGenerateCustomerToken(CustomerToken arg) {
        optimisticData.put(getKey("generateCustomerToken"), arg);
        return this;
    }

    /**
     * Revoke the customer token
     */

    public RevokeCustomerTokenOutput getRevokeCustomerToken() {
        return (RevokeCustomerTokenOutput) get("revokeCustomerToken");
    }

    public Mutation setRevokeCustomerToken(RevokeCustomerTokenOutput arg) {
        optimisticData.put(getKey("revokeCustomerToken"), arg);
        return this;
    }

    /**
     * Recommends Product by Sending Single/Multiple Email
     */

    public SendEmailToFriendOutput getSendEmailToFriend() {
        return (SendEmailToFriendOutput) get("sendEmailToFriend");
    }

    public Mutation setSendEmailToFriend(SendEmailToFriendOutput arg) {
        optimisticData.put(getKey("sendEmailToFriend"), arg);
        return this;
    }

    /**
     * Update the customer&#39;s personal information
     */

    public CustomerOutput getUpdateCustomer() {
        return (CustomerOutput) get("updateCustomer");
    }

    public Mutation setUpdateCustomer(CustomerOutput arg) {
        optimisticData.put(getKey("updateCustomer"), arg);
        return this;
    }

    /**
     * Update customer address
     */

    public CustomerAddress getUpdateCustomerAddress() {
        return (CustomerAddress) get("updateCustomerAddress");
    }

    public Mutation setUpdateCustomerAddress(CustomerAddress arg) {
        optimisticData.put(getKey("updateCustomerAddress"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "changeCustomerPassword": return true;

            case "createCustomer": return true;

            case "createCustomerAddress": return true;

            case "createEmptyCart": return false;

            case "deleteCustomerAddress": return false;

            case "generateCustomerToken": return true;

            case "revokeCustomerToken": return true;

            case "sendEmailToFriend": return true;

            case "updateCustomer": return true;

            case "updateCustomerAddress": return true;

            default: return false;
        }
    }
}


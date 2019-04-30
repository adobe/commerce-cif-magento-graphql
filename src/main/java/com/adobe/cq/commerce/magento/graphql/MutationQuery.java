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

import com.shopify.graphql.support.AbstractQuery;
import com.shopify.graphql.support.Arguments;

/**
 * 
 */
public class MutationQuery extends AbstractQuery<MutationQuery> {
    MutationQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
     * Changes the password for the logged-in customer
     */
    public MutationQuery changeCustomerPassword(String currentPassword, String newPassword, CustomerQueryDefinition queryDef) {
        startField("changeCustomerPassword");

        _queryBuilder.append("(currentPassword:");
        AbstractQuery.appendQuotedString(_queryBuilder, currentPassword.toString());

        _queryBuilder.append(",newPassword:");
        AbstractQuery.appendQuotedString(_queryBuilder, newPassword.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CustomerQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Create customer account
     */
    public MutationQuery createCustomer(CustomerInput input, CustomerOutputQueryDefinition queryDef) {
        startField("createCustomer");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CustomerOutputQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Create customer address
     */
    public MutationQuery createCustomerAddress(CustomerAddressInput input, CustomerAddressQueryDefinition queryDef) {
        startField("createCustomerAddress");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CustomerAddressQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Creates empty shopping cart for guest or logged in user
     */
    public MutationQuery createEmptyCart() {
        startField("createEmptyCart");

        return this;
    }

    /**
     * Delete customer address
     */
    public MutationQuery deleteCustomerAddress(int id) {
        startField("deleteCustomerAddress");

        _queryBuilder.append("(id:");
        _queryBuilder.append(id);

        _queryBuilder.append(')');

        return this;
    }

    /**
     * Retrieve the customer token
     */
    public MutationQuery generateCustomerToken(String email, String password, CustomerTokenQueryDefinition queryDef) {
        startField("generateCustomerToken");

        _queryBuilder.append("(email:");
        AbstractQuery.appendQuotedString(_queryBuilder, email.toString());

        _queryBuilder.append(",password:");
        AbstractQuery.appendQuotedString(_queryBuilder, password.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CustomerTokenQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Revoke the customer token
     */
    public MutationQuery revokeCustomerToken(RevokeCustomerTokenOutputQueryDefinition queryDef) {
        startField("revokeCustomerToken");

        _queryBuilder.append('{');
        queryDef.define(new RevokeCustomerTokenOutputQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class SendEmailToFriendArguments extends Arguments {
        SendEmailToFriendArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
         * 
         */
        public SendEmailToFriendArguments input(SendEmailToFriendInput value) {
            if (value != null) {
                startArgument("input");
                value.appendTo(_queryBuilder);
            }
            return this;
        }
    }

    public interface SendEmailToFriendArgumentsDefinition {
        void define(SendEmailToFriendArguments args);
    }

    /**
     * Recommends Product by Sending Single/Multiple Email
     */
    public MutationQuery sendEmailToFriend(SendEmailToFriendOutputQueryDefinition queryDef) {
        return sendEmailToFriend(args -> {}, queryDef);
    }

    /**
     * Recommends Product by Sending Single/Multiple Email
     */
    public MutationQuery sendEmailToFriend(SendEmailToFriendArgumentsDefinition argsDef, SendEmailToFriendOutputQueryDefinition queryDef) {
        startField("sendEmailToFriend");

        SendEmailToFriendArguments args = new SendEmailToFriendArguments(_queryBuilder);
        argsDef.define(args);
        SendEmailToFriendArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new SendEmailToFriendOutputQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Update the customer&#39;s personal information
     */
    public MutationQuery updateCustomer(CustomerInput input, CustomerOutputQueryDefinition queryDef) {
        startField("updateCustomer");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CustomerOutputQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class UpdateCustomerAddressArguments extends Arguments {
        UpdateCustomerAddressArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, false);
        }

        /**
         * 
         */
        public UpdateCustomerAddressArguments input(CustomerAddressInput value) {
            if (value != null) {
                startArgument("input");
                value.appendTo(_queryBuilder);
            }
            return this;
        }
    }

    public interface UpdateCustomerAddressArgumentsDefinition {
        void define(UpdateCustomerAddressArguments args);
    }

    /**
     * Update customer address
     */
    public MutationQuery updateCustomerAddress(int id, CustomerAddressQueryDefinition queryDef) {
        return updateCustomerAddress(id, args -> {}, queryDef);
    }

    /**
     * Update customer address
     */
    public MutationQuery updateCustomerAddress(int id, UpdateCustomerAddressArgumentsDefinition argsDef, CustomerAddressQueryDefinition queryDef) {
        startField("updateCustomerAddress");

        _queryBuilder.append("(id:");
        _queryBuilder.append(id);

        argsDef.define(new UpdateCustomerAddressArguments(_queryBuilder));

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CustomerAddressQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public String toString() {
        return _queryBuilder.toString();
    }
}

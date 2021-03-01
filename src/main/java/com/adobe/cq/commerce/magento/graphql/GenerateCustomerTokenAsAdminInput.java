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

public class GenerateCustomerTokenAsAdminInput implements Serializable {
    private String customerEmail;

    public GenerateCustomerTokenAsAdminInput(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    /**
     * The email address of the customer requesting remote shopping assistance
     */
    public String getCustomerEmail() {
        return customerEmail;
    }

    /**
     * The email address of the customer requesting remote shopping assistance
     */
    public GenerateCustomerTokenAsAdminInput setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("customer_email:");
        AbstractQuery.appendQuotedString(_queryBuilder, customerEmail.toString());

        _queryBuilder.append('}');
    }
}

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

/**
* Customer defines the customer name and address and other details
*/
public class CustomerQuery extends AbstractQuery<CustomerQuery> {
    CustomerQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * An array containing the customer&#39;s shipping and billing addresses
    */
    public CustomerQuery addresses(CustomerAddressQueryDefinition queryDef) {
        startField("addresses");

        _queryBuilder.append('{');
        queryDef.define(new CustomerAddressQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Timestamp indicating when the account was created
    */
    public CustomerQuery createdAt() {
        startField("created_at");

        return this;
    }

    /**
    * The ID assigned to the billing address
    */
    public CustomerQuery defaultBilling() {
        startField("default_billing");

        return this;
    }

    /**
    * The ID assigned to the shipping address
    */
    public CustomerQuery defaultShipping() {
        startField("default_shipping");

        return this;
    }

    /**
    * The customer&#39;s date of birth
    */
    public CustomerQuery dob() {
        startField("dob");

        return this;
    }

    /**
    * The customer&#39;s email address. Required
    */
    public CustomerQuery email() {
        startField("email");

        return this;
    }

    /**
    * The customer&#39;s first name
    */
    public CustomerQuery firstname() {
        startField("firstname");

        return this;
    }

    /**
    * The group assigned to the user. Default values are 0 (Not logged in), 1 (General), 2 (Wholesale),
    * and 3 (Retailer)
    */
    public CustomerQuery groupId() {
        startField("group_id");

        return this;
    }

    /**
    * The ID assigned to the customer
    */
    public CustomerQuery id() {
        startField("id");

        return this;
    }

    /**
    * Indicates whether the customer is subscribed to the company&#39;s newsletter
    */
    public CustomerQuery isSubscribed() {
        startField("is_subscribed");

        return this;
    }

    /**
    * The customer&#39;s family name
    */
    public CustomerQuery lastname() {
        startField("lastname");

        return this;
    }

    /**
    * The customer&#39;s middle name
    */
    public CustomerQuery middlename() {
        startField("middlename");

        return this;
    }

    /**
    * An honorific, such as Dr., Mr., or Mrs.
    */
    public CustomerQuery prefix() {
        startField("prefix");

        return this;
    }

    /**
    * A value such as Sr., Jr., or III
    */
    public CustomerQuery suffix() {
        startField("suffix");

        return this;
    }

    /**
    * The customer&#39;s Tax/VAT number (for corporate customers)
    */
    public CustomerQuery taxvat() {
        startField("taxvat");

        return this;
    }
}

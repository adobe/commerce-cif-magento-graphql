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

import com.shopify.graphql.support.AbstractQuery;

/**
 * CustomerAddress contains detailed information about a customer&#39;s billing and shipping addresses
 */
public class CustomerAddressQuery extends AbstractQuery<CustomerAddressQuery> {
    CustomerAddressQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
     * The city or town
     */
    public CustomerAddressQuery city() {
        startField("city");

        return this;
    }

    /**
     * The customer&#39;s company
     */
    public CustomerAddressQuery company() {
        startField("company");

        return this;
    }

    /**
     * The customer&#39;s country
     */
    public CustomerAddressQuery countryCode() {
        startField("country_code");

        return this;
    }

    /**
     * The customer&#39;s country
     *
     * @deprecated Use `country_code` instead.
     */
    @Deprecated
    public CustomerAddressQuery countryId() {
        startField("country_id");

        return this;
    }

    /**
     * @deprecated Custom attributes should not be put into container
     */
    @Deprecated
    public CustomerAddressQuery customAttributes(CustomerAddressAttributeQueryDefinition queryDef) {
        startField("custom_attributes");

        _queryBuilder.append('{');
        queryDef.define(new CustomerAddressAttributeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The customer ID
     *
     * @deprecated customer_id is not needed as part of CustomerAddress, address ID (id) is unique identifier for the addresses.
     */
    @Deprecated
    public CustomerAddressQuery customerId() {
        startField("customer_id");

        return this;
    }

    /**
     * Indicates whether the address is the default billing address
     */
    public CustomerAddressQuery defaultBilling() {
        startField("default_billing");

        return this;
    }

    /**
     * Indicates whether the address is the default shipping address
     */
    public CustomerAddressQuery defaultShipping() {
        startField("default_shipping");

        return this;
    }

    /**
     * Address extension attributes
     */
    public CustomerAddressQuery extensionAttributes(CustomerAddressAttributeQueryDefinition queryDef) {
        startField("extension_attributes");

        _queryBuilder.append('{');
        queryDef.define(new CustomerAddressAttributeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The fax number
     */
    public CustomerAddressQuery fax() {
        startField("fax");

        return this;
    }

    /**
     * The first name of the person associated with the shipping/billing address
     */
    public CustomerAddressQuery firstname() {
        startField("firstname");

        return this;
    }

    /**
     * The ID assigned to the address object
     */
    public CustomerAddressQuery id() {
        startField("id");

        return this;
    }

    /**
     * The family name of the person associated with the shipping/billing address
     */
    public CustomerAddressQuery lastname() {
        startField("lastname");

        return this;
    }

    /**
     * The middle name of the person associated with the shipping/billing address
     */
    public CustomerAddressQuery middlename() {
        startField("middlename");

        return this;
    }

    /**
     * The customer&#39;s ZIP or postal code
     */
    public CustomerAddressQuery postcode() {
        startField("postcode");

        return this;
    }

    /**
     * An honorific, such as Dr., Mr., or Mrs.
     */
    public CustomerAddressQuery prefix() {
        startField("prefix");

        return this;
    }

    /**
     * An object containing the region name, region code, and region ID
     */
    public CustomerAddressQuery region(CustomerAddressRegionQueryDefinition queryDef) {
        startField("region");

        _queryBuilder.append('{');
        queryDef.define(new CustomerAddressRegionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The unique ID for a pre-defined region
     */
    public CustomerAddressQuery regionId() {
        startField("region_id");

        return this;
    }

    /**
     * An array of strings that define the street number and name
     */
    public CustomerAddressQuery street() {
        startField("street");

        return this;
    }

    /**
     * A value such as Sr., Jr., or III
     */
    public CustomerAddressQuery suffix() {
        startField("suffix");

        return this;
    }

    /**
     * The telephone number
     */
    public CustomerAddressQuery telephone() {
        startField("telephone");

        return this;
    }

    /**
     * The customer&#39;s Value-added tax (VAT) number (for corporate customers)
     */
    public CustomerAddressQuery vatId() {
        startField("vat_id");

        return this;
    }
}

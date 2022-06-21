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
import com.shopify.graphql.support.Fragment;

/**
 * Contains detailed information about an order&#39;s billing and shipping addresses.
 */
public class OrderAddressQuery extends AbstractQuery<OrderAddressQuery> {
    OrderAddressQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
     * The city or town.
     */
    public OrderAddressQuery city() {
        startField("city");

        return this;
    }

    /**
     * The customer&#39;s company.
     */
    public OrderAddressQuery company() {
        startField("company");

        return this;
    }

    /**
     * The customer&#39;s country.
     */
    public OrderAddressQuery countryCode() {
        startField("country_code");

        return this;
    }

    /**
     * The fax number.
     */
    public OrderAddressQuery fax() {
        startField("fax");

        return this;
    }

    /**
     * The first name of the person associated with the shipping/billing address.
     */
    public OrderAddressQuery firstname() {
        startField("firstname");

        return this;
    }

    /**
     * The family name of the person associated with the shipping/billing address.
     */
    public OrderAddressQuery lastname() {
        startField("lastname");

        return this;
    }

    /**
     * The middle name of the person associated with the shipping/billing address.
     */
    public OrderAddressQuery middlename() {
        startField("middlename");

        return this;
    }

    /**
     * The customer&#39;s ZIP or postal code.
     */
    public OrderAddressQuery postcode() {
        startField("postcode");

        return this;
    }

    /**
     * An honorific, such as Dr., Mr., or Mrs.
     */
    public OrderAddressQuery prefix() {
        startField("prefix");

        return this;
    }

    /**
     * The state or province name.
     */
    public OrderAddressQuery region() {
        startField("region");

        return this;
    }

    /**
     * The unique ID for a `Region` object of a pre-defined region.
     */
    public OrderAddressQuery regionId() {
        startField("region_id");

        return this;
    }

    /**
     * An array of strings that define the street number and name.
     */
    public OrderAddressQuery street() {
        startField("street");

        return this;
    }

    /**
     * A value such as Sr., Jr., or III.
     */
    public OrderAddressQuery suffix() {
        startField("suffix");

        return this;
    }

    /**
     * The telephone number.
     */
    public OrderAddressQuery telephone() {
        startField("telephone");

        return this;
    }

    /**
     * The customer&#39;s Value-added tax (VAT) number (for corporate customers).
     */
    public OrderAddressQuery vatId() {
        startField("vat_id");

        return this;
    }

    /**
     * Creates a GraphQL "named" fragment with the specified query type definition.
     * The generics nature of fragments ensures that a fragment can only be used at the right place in the GraphQL request.
     * 
     * @param name The name of the fragment, must be unique for a given GraphQL request.
     * @param queryDef The fragment definition.
     * @return The fragment of a given generics type.
     */
    public static Fragment<OrderAddressQuery> createFragment(String name, OrderAddressQueryDefinition queryDef) {
        StringBuilder sb = new StringBuilder();
        queryDef.define(new OrderAddressQuery(sb));
        return new Fragment<>(name, "OrderAddress", sb.toString());
    }

    /**
     * Adds a <code>OrderAddressQuery</code> fragment reference at the current position of the query.
     * For example for a fragment named <code>test</code>, calling this method will add the
     * reference <code>...test</code> in the query. For GraphQL types implementing an interface, there
     * will be some similar methods using the Query type of each implemented interface.
     * 
     * @param fragment The fragment to reference.
     */
    public OrderAddressQuery addFragmentReference(Fragment<OrderAddressQuery> fragment) {
        startField("..." + fragment.getName());
        return this;
    }
}

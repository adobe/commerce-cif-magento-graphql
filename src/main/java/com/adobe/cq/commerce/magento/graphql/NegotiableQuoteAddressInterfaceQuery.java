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
import com.shopify.graphql.support.ID;

public class NegotiableQuoteAddressInterfaceQuery extends AbstractQuery<NegotiableQuoteAddressInterfaceQuery> {
    NegotiableQuoteAddressInterfaceQuery(StringBuilder _queryBuilder) {
        this(_queryBuilder, true);
    }

    NegotiableQuoteAddressInterfaceQuery(StringBuilder _queryBuilder, boolean addTypename) {
        super(_queryBuilder);
        if (addTypename) {
            startField("__typename");
        }
    }

    /**
     * The company&#39;s city or town.
     */
    public NegotiableQuoteAddressInterfaceQuery city() {
        startField("city");

        return this;
    }

    /**
     * The company name associated with the shipping/billing address.
     */
    public NegotiableQuoteAddressInterfaceQuery company() {
        startField("company");

        return this;
    }

    /**
     * The company&#39;s country.
     */
    public NegotiableQuoteAddressInterfaceQuery country(NegotiableQuoteAddressCountryQueryDefinition queryDef) {
        startField("country");

        _queryBuilder.append('{');
        queryDef.define(new NegotiableQuoteAddressCountryQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The first name of the company user.
     */
    public NegotiableQuoteAddressInterfaceQuery firstname() {
        startField("firstname");

        return this;
    }

    /**
     * The last name of the company user.
     */
    public NegotiableQuoteAddressInterfaceQuery lastname() {
        startField("lastname");

        return this;
    }

    /**
     * The company&#39;s ZIP or postal code.
     */
    public NegotiableQuoteAddressInterfaceQuery postcode() {
        startField("postcode");

        return this;
    }

    /**
     * An object containing the region name, region code, and region ID.
     */
    public NegotiableQuoteAddressInterfaceQuery region(NegotiableQuoteAddressRegionQueryDefinition queryDef) {
        startField("region");

        _queryBuilder.append('{');
        queryDef.define(new NegotiableQuoteAddressRegionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * An array of strings that define the street number and name.
     */
    public NegotiableQuoteAddressInterfaceQuery street() {
        startField("street");

        return this;
    }

    /**
     * The customer&#39;s telephone number.
     */
    public NegotiableQuoteAddressInterfaceQuery telephone() {
        startField("telephone");

        return this;
    }

    public NegotiableQuoteAddressInterfaceQuery onNegotiableQuoteBillingAddress(NegotiableQuoteBillingAddressQueryDefinition queryDef) {
        startInlineFragment("NegotiableQuoteBillingAddress");
        queryDef.define(new NegotiableQuoteBillingAddressQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NegotiableQuoteAddressInterfaceQuery onNegotiableQuoteShippingAddress(NegotiableQuoteShippingAddressQueryDefinition queryDef) {
        startInlineFragment("NegotiableQuoteShippingAddress");
        queryDef.define(new NegotiableQuoteShippingAddressQuery(_queryBuilder));
        _queryBuilder.append('}');
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
    public static Fragment<NegotiableQuoteAddressInterfaceQuery> createFragment(String name,
        NegotiableQuoteAddressInterfaceQueryDefinition queryDef) {
        StringBuilder sb = new StringBuilder();
        queryDef.define(new NegotiableQuoteAddressInterfaceQuery(sb, false));
        return new Fragment<>(name, "NegotiableQuoteAddressInterface", sb.toString());
    }

    /**
     * Adds a <code>NegotiableQuoteAddressInterfaceQuery</code> fragment reference at the current position of the query.
     * For example for a fragment named <code>test</code>, calling this method will add the
     * reference <code>...test</code> in the query. For GraphQL types implementing an interface, there
     * will be some similar methods using the Query type of each implemented interface.
     * 
     * @param fragment The fragment to reference.
     */
    public NegotiableQuoteAddressInterfaceQuery addFragmentReference(Fragment<NegotiableQuoteAddressInterfaceQuery> fragment) {
        startField("..." + fragment.getName());
        return this;
    }
}

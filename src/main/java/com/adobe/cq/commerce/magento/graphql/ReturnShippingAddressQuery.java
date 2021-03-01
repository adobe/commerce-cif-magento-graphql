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

public class ReturnShippingAddressQuery extends AbstractQuery<ReturnShippingAddressQuery> {
    ReturnShippingAddressQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
     * The city for product returns
     */
    public ReturnShippingAddressQuery city() {
        startField("city");

        return this;
    }

    /**
     * The merchant&#39;s contact person
     */
    public ReturnShippingAddressQuery contactName() {
        startField("contact_name");

        return this;
    }

    /**
     * An object that defines the country for product returns
     */
    public ReturnShippingAddressQuery country(CountryQueryDefinition queryDef) {
        startField("country");

        _queryBuilder.append('{');
        queryDef.define(new CountryQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The postal code for product returns
     */
    public ReturnShippingAddressQuery postcode() {
        startField("postcode");

        return this;
    }

    /**
     * An object that defines the state or province for product returns
     */
    public ReturnShippingAddressQuery region(RegionQueryDefinition queryDef) {
        startField("region");

        _queryBuilder.append('{');
        queryDef.define(new RegionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The street address for product returns
     */
    public ReturnShippingAddressQuery street() {
        startField("street");

        return this;
    }

    /**
     * The telephone number for product returns
     */
    public ReturnShippingAddressQuery telephone() {
        startField("telephone");

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
    public static Fragment<ReturnShippingAddressQuery> createFragment(String name, ReturnShippingAddressQueryDefinition queryDef) {
        StringBuilder sb = new StringBuilder();
        queryDef.define(new ReturnShippingAddressQuery(sb));
        return new Fragment<>(name, "ReturnShippingAddress", sb.toString());
    }

    /**
     * Adds a <code>ReturnShippingAddressQuery</code> fragment reference at the current position of the query.
     * For example for a fragment named <code>test</code>, calling this method will add the
     * reference <code>...test</code> in the query. For GraphQL types implementing an interface, there
     * will be some similar methods using the Query type of each implemented interface.
     * 
     * @param fragment The fragment to reference.
     */
    public ReturnShippingAddressQuery addFragmentReference(Fragment<ReturnShippingAddressQuery> fragment) {
        startField("..." + fragment.getName());
        return this;
    }
}

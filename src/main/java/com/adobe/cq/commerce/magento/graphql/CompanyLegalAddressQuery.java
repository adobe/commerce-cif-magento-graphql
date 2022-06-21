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
 * Contains details about the address where the company is registered to conduct business.
 */
public class CompanyLegalAddressQuery extends AbstractQuery<CompanyLegalAddressQuery> {
    CompanyLegalAddressQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
     * The city where the company is registered to conduct business.
     */
    public CompanyLegalAddressQuery city() {
        startField("city");

        return this;
    }

    /**
     * The country code of the company&#39;s legal address.
     */
    public CompanyLegalAddressQuery countryCode() {
        startField("country_code");

        return this;
    }

    /**
     * The company&#39;s postal code.
     */
    public CompanyLegalAddressQuery postcode() {
        startField("postcode");

        return this;
    }

    /**
     * An object containing region data for the company.
     */
    public CompanyLegalAddressQuery region(CustomerAddressRegionQueryDefinition queryDef) {
        startField("region");

        _queryBuilder.append('{');
        queryDef.define(new CustomerAddressRegionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * An array of strings that define the company&#39;s street address.
     */
    public CompanyLegalAddressQuery street() {
        startField("street");

        return this;
    }

    /**
     * The company&#39;s phone number.
     */
    public CompanyLegalAddressQuery telephone() {
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
    public static Fragment<CompanyLegalAddressQuery> createFragment(String name, CompanyLegalAddressQueryDefinition queryDef) {
        StringBuilder sb = new StringBuilder();
        queryDef.define(new CompanyLegalAddressQuery(sb));
        return new Fragment<>(name, "CompanyLegalAddress", sb.toString());
    }

    /**
     * Adds a <code>CompanyLegalAddressQuery</code> fragment reference at the current position of the query.
     * For example for a fragment named <code>test</code>, calling this method will add the
     * reference <code>...test</code> in the query. For GraphQL types implementing an interface, there
     * will be some similar methods using the Query type of each implemented interface.
     * 
     * @param fragment The fragment to reference.
     */
    public CompanyLegalAddressQuery addFragmentReference(Fragment<CompanyLegalAddressQuery> fragment) {
        startField("..." + fragment.getName());
        return this;
    }
}

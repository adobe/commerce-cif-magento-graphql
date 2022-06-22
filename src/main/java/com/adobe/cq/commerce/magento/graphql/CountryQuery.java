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

public class CountryQuery extends AbstractQuery<CountryQuery> {
    CountryQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
     * An array of regions within a particular country.
     */
    public CountryQuery availableRegions(RegionQueryDefinition queryDef) {
        startField("available_regions");

        _queryBuilder.append('{');
        queryDef.define(new RegionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The name of the country in English.
     */
    public CountryQuery fullNameEnglish() {
        startField("full_name_english");

        return this;
    }

    /**
     * The name of the country in the current locale.
     */
    public CountryQuery fullNameLocale() {
        startField("full_name_locale");

        return this;
    }

    /**
     * The unique ID for a `Country` object.
     */
    public CountryQuery id() {
        startField("id");

        return this;
    }

    /**
     * The three-letter abbreviation of the country, such as USA.
     */
    public CountryQuery threeLetterAbbreviation() {
        startField("three_letter_abbreviation");

        return this;
    }

    /**
     * The two-letter abbreviation of the country, such as US.
     */
    public CountryQuery twoLetterAbbreviation() {
        startField("two_letter_abbreviation");

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
    public static Fragment<CountryQuery> createFragment(String name, CountryQueryDefinition queryDef) {
        StringBuilder sb = new StringBuilder();
        queryDef.define(new CountryQuery(sb));
        return new Fragment<>(name, "Country", sb.toString());
    }

    /**
     * Adds a <code>CountryQuery</code> fragment reference at the current position of the query.
     * For example for a fragment named <code>test</code>, calling this method will add the
     * reference <code>...test</code> in the query. For GraphQL types implementing an interface, there
     * will be some similar methods using the Query type of each implemented interface.
     * 
     * @param fragment The fragment to reference.
     */
    public CountryQuery addFragmentReference(Fragment<CountryQuery> fragment) {
        startField("..." + fragment.getName());
        return this;
    }
}

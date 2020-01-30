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

public class CountryQuery extends AbstractQuery<CountryQuery> {
    CountryQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public CountryQuery availableRegions(RegionQueryDefinition queryDef) {
        startField("available_regions");

        _queryBuilder.append('{');
        queryDef.define(new RegionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public CountryQuery fullNameEnglish() {
        startField("full_name_english");

        return this;
    }

    public CountryQuery fullNameLocale() {
        startField("full_name_locale");

        return this;
    }

    public CountryQuery id() {
        startField("id");

        return this;
    }

    public CountryQuery threeLetterAbbreviation() {
        startField("three_letter_abbreviation");

        return this;
    }

    public CountryQuery twoLetterAbbreviation() {
        startField("two_letter_abbreviation");

        return this;
    }
}

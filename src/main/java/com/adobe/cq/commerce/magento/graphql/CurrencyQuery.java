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

public class CurrencyQuery extends AbstractQuery<CurrencyQuery> {
    CurrencyQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
     * An array of three-letter currency codes accepted by the store, such as USD and EUR.
     */
    public CurrencyQuery availableCurrencyCodes() {
        startField("available_currency_codes");

        return this;
    }

    /**
     * The base currency set for the store, such as USD.
     */
    public CurrencyQuery baseCurrencyCode() {
        startField("base_currency_code");

        return this;
    }

    /**
     * The symbol for the specified base currency, such as $.
     */
    public CurrencyQuery baseCurrencySymbol() {
        startField("base_currency_symbol");

        return this;
    }

    /**
     * @deprecated Symbol was missed. Use `default_display_currency_code`.
     */
    @Deprecated
    public CurrencyQuery defaultDisplayCurrecyCode() {
        startField("default_display_currecy_code");

        return this;
    }

    /**
     * @deprecated Symbol was missed. Use `default_display_currency_code`.
     */
    @Deprecated
    public CurrencyQuery defaultDisplayCurrecySymbol() {
        startField("default_display_currecy_symbol");

        return this;
    }

    /**
     * The currency that is displayed by default, such as USD.
     */
    public CurrencyQuery defaultDisplayCurrencyCode() {
        startField("default_display_currency_code");

        return this;
    }

    /**
     * The currency symbol that is displayed by default, such as $.
     */
    public CurrencyQuery defaultDisplayCurrencySymbol() {
        startField("default_display_currency_symbol");

        return this;
    }

    /**
     * An array of exchange rates for currencies defined in the store.
     */
    public CurrencyQuery exchangeRates(ExchangeRateQueryDefinition queryDef) {
        startField("exchange_rates");

        _queryBuilder.append('{');
        queryDef.define(new ExchangeRateQuery(_queryBuilder));
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
    public static Fragment<CurrencyQuery> createFragment(String name, CurrencyQueryDefinition queryDef) {
        StringBuilder sb = new StringBuilder();
        queryDef.define(new CurrencyQuery(sb));
        return new Fragment<>(name, "Currency", sb.toString());
    }

    /**
     * Adds a <code>CurrencyQuery</code> fragment reference at the current position of the query.
     * For example for a fragment named <code>test</code>, calling this method will add the
     * reference <code>...test</code> in the query. For GraphQL types implementing an interface, there
     * will be some similar methods using the Query type of each implemented interface.
     * 
     * @param fragment The fragment to reference.
     */
    public CurrencyQuery addFragmentReference(Fragment<CurrencyQuery> fragment) {
        startField("..." + fragment.getName());
        return this;
    }
}

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
 * 
 */
public class CurrencyQuery extends AbstractQuery<CurrencyQuery> {
    CurrencyQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public CurrencyQuery availableCurrencyCodes() {
        startField("available_currency_codes");

        return this;
    }

    public CurrencyQuery baseCurrencyCode() {
        startField("base_currency_code");

        return this;
    }

    public CurrencyQuery baseCurrencySymbol() {
        startField("base_currency_symbol");

        return this;
    }

    public CurrencyQuery defaultDisplayCurrecyCode() {
        startField("default_display_currecy_code");

        return this;
    }

    public CurrencyQuery defaultDisplayCurrecySymbol() {
        startField("default_display_currecy_symbol");

        return this;
    }

    public CurrencyQuery exchangeRates(ExchangeRateQueryDefinition queryDef) {
        startField("exchange_rates");

        _queryBuilder.append('{');
        queryDef.define(new ExchangeRateQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}

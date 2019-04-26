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
* The Price object defines the price of a product as well as any tax-related adjustments.
*/
public class PriceQuery extends AbstractQuery<PriceQuery> {
    PriceQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * An array that provides information about tax, weee, or weee_tax adjustments
    */
    public PriceQuery adjustments(PriceAdjustmentQueryDefinition queryDef) {
        startField("adjustments");

        _queryBuilder.append('{');
        queryDef.define(new PriceAdjustmentQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The price of a product plus a three-letter currency code
    */
    public PriceQuery amount(MoneyQueryDefinition queryDef) {
        startField("amount");

        _queryBuilder.append('{');
        queryDef.define(new MoneyQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}

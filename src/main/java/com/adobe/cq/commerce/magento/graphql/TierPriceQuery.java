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
 * A price based on the quantity purchased.
 */
public class TierPriceQuery extends AbstractQuery<TierPriceQuery> {
    TierPriceQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
     * The price discount that this tier represents.
     */
    public TierPriceQuery discount(ProductDiscountQueryDefinition queryDef) {
        startField("discount");

        _queryBuilder.append('{');
        queryDef.define(new ProductDiscountQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public TierPriceQuery finalPrice(MoneyQueryDefinition queryDef) {
        startField("final_price");

        _queryBuilder.append('{');
        queryDef.define(new MoneyQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The minimum number of items that must be purchased to qualify for this price tier.
     */
    public TierPriceQuery quantity() {
        startField("quantity");

        return this;
    }
}

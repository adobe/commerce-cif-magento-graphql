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
 * The PricedAdjustment object defines the amount of money to apply as an adjustment, the type of
 * adjustment to apply, and whether the item is included or excluded from the adjustment.
 */
public class PriceAdjustmentQuery extends AbstractQuery<PriceAdjustmentQuery> {
    PriceAdjustmentQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
     * The amount of the price adjustment and its currency code.
     */
    public PriceAdjustmentQuery amount(MoneyQueryDefinition queryDef) {
        startField("amount");

        _queryBuilder.append('{');
        queryDef.define(new MoneyQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Indicates whether the adjustment involves tax, weee, or weee_tax.
     */
    public PriceAdjustmentQuery code() {
        startField("code");

        return this;
    }

    /**
     * Indicates whether the entity described by the code attribute is included or excluded from the
     * adjustment.
     */
    public PriceAdjustmentQuery description() {
        startField("description");

        return this;
    }
}

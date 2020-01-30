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

public class CartPricesQuery extends AbstractQuery<CartPricesQuery> {
    CartPricesQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public CartPricesQuery appliedTaxes(CartTaxItemQueryDefinition queryDef) {
        startField("applied_taxes");

        _queryBuilder.append('{');
        queryDef.define(new CartTaxItemQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * @deprecated Use discounts instead 
     */
    @Deprecated
    public CartPricesQuery discount(CartDiscountQueryDefinition queryDef) {
        startField("discount");

        _queryBuilder.append('{');
        queryDef.define(new CartDiscountQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * An array of applied discounts
     */
    public CartPricesQuery discounts(DiscountQueryDefinition queryDef) {
        startField("discounts");

        _queryBuilder.append('{');
        queryDef.define(new DiscountQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public CartPricesQuery grandTotal(MoneyQueryDefinition queryDef) {
        startField("grand_total");

        _queryBuilder.append('{');
        queryDef.define(new MoneyQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public CartPricesQuery subtotalExcludingTax(MoneyQueryDefinition queryDef) {
        startField("subtotal_excluding_tax");

        _queryBuilder.append('{');
        queryDef.define(new MoneyQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public CartPricesQuery subtotalIncludingTax(MoneyQueryDefinition queryDef) {
        startField("subtotal_including_tax");

        _queryBuilder.append('{');
        queryDef.define(new MoneyQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public CartPricesQuery subtotalWithDiscountExcludingTax(MoneyQueryDefinition queryDef) {
        startField("subtotal_with_discount_excluding_tax");

        _queryBuilder.append('{');
        queryDef.define(new MoneyQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}

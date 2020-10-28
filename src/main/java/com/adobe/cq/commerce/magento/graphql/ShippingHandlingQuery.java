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
 * The Shipping handling details
 */
public class ShippingHandlingQuery extends AbstractQuery<ShippingHandlingQuery> {
    ShippingHandlingQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
     * The shipping amount, excluding tax
     */
    public ShippingHandlingQuery amountExcludingTax(MoneyQueryDefinition queryDef) {
        startField("amount_excluding_tax");

        _queryBuilder.append('{');
        queryDef.define(new MoneyQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The shipping amount, including tax
     */
    public ShippingHandlingQuery amountIncludingTax(MoneyQueryDefinition queryDef) {
        startField("amount_including_tax");

        _queryBuilder.append('{');
        queryDef.define(new MoneyQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The applied discounts to the shipping
     */
    public ShippingHandlingQuery discounts(ShippingDiscountQueryDefinition queryDef) {
        startField("discounts");

        _queryBuilder.append('{');
        queryDef.define(new ShippingDiscountQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Contains details about taxes applied for shipping
     */
    public ShippingHandlingQuery taxes(TaxItemQueryDefinition queryDef) {
        startField("taxes");

        _queryBuilder.append('{');
        queryDef.define(new TaxItemQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The total amount for shipping
     */
    public ShippingHandlingQuery totalAmount(MoneyQueryDefinition queryDef) {
        startField("total_amount");

        _queryBuilder.append('{');
        queryDef.define(new MoneyQuery(_queryBuilder));
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
    public static Fragment<ShippingHandlingQuery> createFragment(String name, ShippingHandlingQueryDefinition queryDef) {
        StringBuilder sb = new StringBuilder();
        queryDef.define(new ShippingHandlingQuery(sb));
        return new Fragment<>(name, "ShippingHandling", sb.toString());
    }

    /**
     * Adds a <code>ShippingHandlingQuery</code> fragment reference at the current position of the query.
     * For example for a fragment named <code>test</code>, calling this method will add the
     * reference <code>...test</code> in the query. For GraphQL types implementing an interface, there
     * will be some similar methods using the Query type of each implemented interface.
     * 
     * @param fragment The fragment to reference.
     */
    public ShippingHandlingQuery addFragmentReference(Fragment<ShippingHandlingQuery> fragment) {
        startField("..." + fragment.getName());
        return this;
    }
}

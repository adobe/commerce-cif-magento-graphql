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
 * Contains details about the sales total amounts used to calculate the final price
 */
public class OrderTotalQuery extends AbstractQuery<OrderTotalQuery> {
    OrderTotalQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
     * The final base grand total amount in the base currency
     */
    public OrderTotalQuery baseGrandTotal(MoneyQueryDefinition queryDef) {
        startField("base_grand_total");

        _queryBuilder.append('{');
        queryDef.define(new MoneyQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The applied discounts to the order
     */
    public OrderTotalQuery discounts(DiscountQueryDefinition queryDef) {
        startField("discounts");

        _queryBuilder.append('{');
        queryDef.define(new DiscountQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The final total amount, including shipping, discounts, and taxes
     */
    public OrderTotalQuery grandTotal(MoneyQueryDefinition queryDef) {
        startField("grand_total");

        _queryBuilder.append('{');
        queryDef.define(new MoneyQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Contains details about the shipping and handling costs for the order
     */
    public OrderTotalQuery shippingHandling(ShippingHandlingQueryDefinition queryDef) {
        startField("shipping_handling");

        _queryBuilder.append('{');
        queryDef.define(new ShippingHandlingQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The subtotal of the order, excluding shipping, discounts, and taxes
     */
    public OrderTotalQuery subtotal(MoneyQueryDefinition queryDef) {
        startField("subtotal");

        _queryBuilder.append('{');
        queryDef.define(new MoneyQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The order tax details
     */
    public OrderTotalQuery taxes(TaxItemQueryDefinition queryDef) {
        startField("taxes");

        _queryBuilder.append('{');
        queryDef.define(new TaxItemQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The gift card balance applied to the order
     */
    public OrderTotalQuery totalGiftcard(MoneyQueryDefinition queryDef) {
        startField("total_giftcard");

        _queryBuilder.append('{');
        queryDef.define(new MoneyQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The shipping amount for the order
     */
    public OrderTotalQuery totalShipping(MoneyQueryDefinition queryDef) {
        startField("total_shipping");

        _queryBuilder.append('{');
        queryDef.define(new MoneyQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The amount of tax applied to the order
     */
    public OrderTotalQuery totalTax(MoneyQueryDefinition queryDef) {
        startField("total_tax");

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
    public static Fragment<OrderTotalQuery> createFragment(String name, OrderTotalQueryDefinition queryDef) {
        StringBuilder sb = new StringBuilder();
        queryDef.define(new OrderTotalQuery(sb));
        return new Fragment<>(name, "OrderTotal", sb.toString());
    }

    /**
     * Adds a <code>OrderTotalQuery</code> fragment reference at the current position of the query.
     * For example for a fragment named <code>test</code>, calling this method will add the
     * reference <code>...test</code> in the query. For GraphQL types implementing an interface, there
     * will be some similar methods using the Query type of each implemented interface.
     * 
     * @param fragment The fragment to reference.
     */
    public OrderTotalQuery addFragmentReference(Fragment<OrderTotalQuery> fragment) {
        startField("..." + fragment.getName());
        return this;
    }
}

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
 * Contains details about the price of the item, including taxes and discounts.
 */
public class CartItemPricesQuery extends AbstractQuery<CartItemPricesQuery> {
    CartItemPricesQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
     * An array of discounts to be applied to the cart item.
     */
    public CartItemPricesQuery discounts(DiscountQueryDefinition queryDef) {
        startField("discounts");

        _queryBuilder.append('{');
        queryDef.define(new DiscountQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * An array of FPTs applied to the cart item.
     */
    public CartItemPricesQuery fixedProductTaxes(FixedProductTaxQueryDefinition queryDef) {
        startField("fixed_product_taxes");

        _queryBuilder.append('{');
        queryDef.define(new FixedProductTaxQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The price of the item before any discounts were applied. The price that might include tax, depending
     * on the configured display settings for cart.
     */
    public CartItemPricesQuery price(MoneyQueryDefinition queryDef) {
        startField("price");

        _queryBuilder.append('{');
        queryDef.define(new MoneyQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The value of the price multiplied by the quantity of the item.
     */
    public CartItemPricesQuery rowTotal(MoneyQueryDefinition queryDef) {
        startField("row_total");

        _queryBuilder.append('{');
        queryDef.define(new MoneyQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The value of `row_total` plus the tax applied to the item.
     */
    public CartItemPricesQuery rowTotalIncludingTax(MoneyQueryDefinition queryDef) {
        startField("row_total_including_tax");

        _queryBuilder.append('{');
        queryDef.define(new MoneyQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The total of all discounts applied to the item.
     */
    public CartItemPricesQuery totalItemDiscount(MoneyQueryDefinition queryDef) {
        startField("total_item_discount");

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
    public static Fragment<CartItemPricesQuery> createFragment(String name, CartItemPricesQueryDefinition queryDef) {
        StringBuilder sb = new StringBuilder();
        queryDef.define(new CartItemPricesQuery(sb));
        return new Fragment<>(name, "CartItemPrices", sb.toString());
    }

    /**
     * Adds a <code>CartItemPricesQuery</code> fragment reference at the current position of the query.
     * For example for a fragment named <code>test</code>, calling this method will add the
     * reference <code>...test</code> in the query. For GraphQL types implementing an interface, there
     * will be some similar methods using the Query type of each implemented interface.
     * 
     * @param fragment The fragment to reference.
     */
    public CartItemPricesQuery addFragmentReference(Fragment<CartItemPricesQuery> fragment) {
        startField("..." + fragment.getName());
        return this;
    }
}

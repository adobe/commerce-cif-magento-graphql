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
 * Contains prices for gift wrapping options.
 */
public class GiftOptionsPricesQuery extends AbstractQuery<GiftOptionsPricesQuery> {
    GiftOptionsPricesQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
     * Price of the gift wrapping for all individual order items.
     */
    public GiftOptionsPricesQuery giftWrappingForItems(MoneyQueryDefinition queryDef) {
        startField("gift_wrapping_for_items");

        _queryBuilder.append('{');
        queryDef.define(new MoneyQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Price of the gift wrapping for the whole order.
     */
    public GiftOptionsPricesQuery giftWrappingForOrder(MoneyQueryDefinition queryDef) {
        startField("gift_wrapping_for_order");

        _queryBuilder.append('{');
        queryDef.define(new MoneyQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Price for the printed card.
     */
    public GiftOptionsPricesQuery printedCard(MoneyQueryDefinition queryDef) {
        startField("printed_card");

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
    public static Fragment<GiftOptionsPricesQuery> createFragment(String name, GiftOptionsPricesQueryDefinition queryDef) {
        StringBuilder sb = new StringBuilder();
        queryDef.define(new GiftOptionsPricesQuery(sb));
        return new Fragment<>(name, "GiftOptionsPrices", sb.toString());
    }

    /**
     * Adds a <code>GiftOptionsPricesQuery</code> fragment reference at the current position of the query.
     * For example for a fragment named <code>test</code>, calling this method will add the
     * reference <code>...test</code> in the query. For GraphQL types implementing an interface, there
     * will be some similar methods using the Query type of each implemented interface.
     * 
     * @param fragment The fragment to reference.
     */
    public GiftOptionsPricesQuery addFragmentReference(Fragment<GiftOptionsPricesQuery> fragment) {
        startField("..." + fragment.getName());
        return this;
    }
}

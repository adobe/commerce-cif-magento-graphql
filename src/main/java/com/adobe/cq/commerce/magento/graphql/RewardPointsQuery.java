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
 * Contains details about a customer&#39;s reward points.
 */
public class RewardPointsQuery extends AbstractQuery<RewardPointsQuery> {
    RewardPointsQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
     * The current balance of reward points.
     */
    public RewardPointsQuery balance(RewardPointsAmountQueryDefinition queryDef) {
        startField("balance");

        _queryBuilder.append('{');
        queryDef.define(new RewardPointsAmountQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The balance history of reward points. If the ability for customers to view the balance history has
     * been disabled in the Admin, this field will be set to null.
     */
    public RewardPointsQuery balanceHistory(RewardPointsBalanceHistoryItemQueryDefinition queryDef) {
        startField("balance_history");

        _queryBuilder.append('{');
        queryDef.define(new RewardPointsBalanceHistoryItemQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The current exchange rates for reward points.
     */
    public RewardPointsQuery exchangeRates(RewardPointsExchangeRatesQueryDefinition queryDef) {
        startField("exchange_rates");

        _queryBuilder.append('{');
        queryDef.define(new RewardPointsExchangeRatesQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The subscription status of emails related to reward points.
     */
    public RewardPointsQuery subscriptionStatus(RewardPointsSubscriptionStatusQueryDefinition queryDef) {
        startField("subscription_status");

        _queryBuilder.append('{');
        queryDef.define(new RewardPointsSubscriptionStatusQuery(_queryBuilder));
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
    public static Fragment<RewardPointsQuery> createFragment(String name, RewardPointsQueryDefinition queryDef) {
        StringBuilder sb = new StringBuilder();
        queryDef.define(new RewardPointsQuery(sb));
        return new Fragment<>(name, "RewardPoints", sb.toString());
    }

    /**
     * Adds a <code>RewardPointsQuery</code> fragment reference at the current position of the query.
     * For example for a fragment named <code>test</code>, calling this method will add the
     * reference <code>...test</code> in the query. For GraphQL types implementing an interface, there
     * will be some similar methods using the Query type of each implemented interface.
     * 
     * @param fragment The fragment to reference.
     */
    public RewardPointsQuery addFragmentReference(Fragment<RewardPointsQuery> fragment) {
        startField("..." + fragment.getName());
        return this;
    }
}

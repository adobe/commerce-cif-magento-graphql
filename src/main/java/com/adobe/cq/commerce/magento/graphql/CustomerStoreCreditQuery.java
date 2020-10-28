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
import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Fragment;

/**
 * Contains store credit information with balance and history
 */
public class CustomerStoreCreditQuery extends AbstractQuery<CustomerStoreCreditQuery> {
    CustomerStoreCreditQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public class BalanceHistoryArguments extends Arguments {
        BalanceHistoryArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
         * Specifies the maximum number of results to return at once. This value is optional. The default value
         * is 20
         */
        public BalanceHistoryArguments pageSize(Integer value) {
            if (value != null) {
                startArgument("pageSize");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
         * Specifies which page of results to return. This value is optional. The default value is 1.
         */
        public BalanceHistoryArguments currentPage(Integer value) {
            if (value != null) {
                startArgument("currentPage");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface BalanceHistoryArgumentsDefinition {
        void define(BalanceHistoryArguments args);
    }

    /**
     * Customer Store credit balance history. If the history or store credit feature is disabled, then a
     * null value will be returned.
     */
    public CustomerStoreCreditQuery balanceHistory(CustomerStoreCreditHistoryQueryDefinition queryDef) {
        return balanceHistory(args -> {}, queryDef);
    }

    /**
     * Customer Store credit balance history. If the history or store credit feature is disabled, then a
     * null value will be returned.
     */
    public CustomerStoreCreditQuery balanceHistory(BalanceHistoryArgumentsDefinition argsDef, CustomerStoreCreditHistoryQueryDefinition queryDef) {
        startField("balance_history");

        BalanceHistoryArguments args = new BalanceHistoryArguments(_queryBuilder);
        argsDef.define(args);
        BalanceHistoryArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new CustomerStoreCreditHistoryQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Current balance on store credit
     */
    public CustomerStoreCreditQuery currentBalance(MoneyQueryDefinition queryDef) {
        startField("current_balance");

        _queryBuilder.append('{');
        queryDef.define(new MoneyQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Indicates whether store credits are enabled. If the feature is disabled, then the balance will not
     * be returned
     */
    public CustomerStoreCreditQuery enabled() {
        startField("enabled");

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
    public static Fragment<CustomerStoreCreditQuery> createFragment(String name, CustomerStoreCreditQueryDefinition queryDef) {
        StringBuilder sb = new StringBuilder();
        queryDef.define(new CustomerStoreCreditQuery(sb));
        return new Fragment<>(name, "CustomerStoreCredit", sb.toString());
    }

    /**
     * Adds a <code>CustomerStoreCreditQuery</code> fragment reference at the current position of the query.
     * For example for a fragment named <code>test</code>, calling this method will add the
     * reference <code>...test</code> in the query. For GraphQL types implementing an interface, there
     * will be some similar methods using the Query type of each implemented interface.
     * 
     * @param fragment The fragment to reference.
     */
    public CustomerStoreCreditQuery addFragmentReference(Fragment<CustomerStoreCreditQuery> fragment) {
        startField("..." + fragment.getName());
        return this;
    }
}

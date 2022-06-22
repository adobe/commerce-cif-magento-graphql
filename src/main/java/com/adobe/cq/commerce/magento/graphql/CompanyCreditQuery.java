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
 * Contains company credit balances and limits.
 */
public class CompanyCreditQuery extends AbstractQuery<CompanyCreditQuery> {
    CompanyCreditQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
     * The sum of the credit limit and the outstanding balance. If the company has exceeded the credit
     * limit, the amount is as a negative value.
     */
    public CompanyCreditQuery availableCredit(MoneyQueryDefinition queryDef) {
        startField("available_credit");

        _queryBuilder.append('{');
        queryDef.define(new MoneyQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The amount of credit extended to the company.
     */
    public CompanyCreditQuery creditLimit(MoneyQueryDefinition queryDef) {
        startField("credit_limit");

        _queryBuilder.append('{');
        queryDef.define(new MoneyQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The amount reimbursed, less the total due from all orders placed using the Payment on Account
     * payment method. The amount can be a positive or negative value.
     */
    public CompanyCreditQuery outstandingBalance(MoneyQueryDefinition queryDef) {
        startField("outstanding_balance");

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
    public static Fragment<CompanyCreditQuery> createFragment(String name, CompanyCreditQueryDefinition queryDef) {
        StringBuilder sb = new StringBuilder();
        queryDef.define(new CompanyCreditQuery(sb));
        return new Fragment<>(name, "CompanyCredit", sb.toString());
    }

    /**
     * Adds a <code>CompanyCreditQuery</code> fragment reference at the current position of the query.
     * For example for a fragment named <code>test</code>, calling this method will add the
     * reference <code>...test</code> in the query. For GraphQL types implementing an interface, there
     * will be some similar methods using the Query type of each implemented interface.
     * 
     * @param fragment The fragment to reference.
     */
    public CompanyCreditQuery addFragmentReference(Fragment<CompanyCreditQuery> fragment) {
        startField("..." + fragment.getName());
        return this;
    }
}

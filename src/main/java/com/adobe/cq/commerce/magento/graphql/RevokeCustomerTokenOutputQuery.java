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
 * Contains the result of a request to revoke a customer token.
 */
public class RevokeCustomerTokenOutputQuery extends AbstractQuery<RevokeCustomerTokenOutputQuery> {
    RevokeCustomerTokenOutputQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
     * The result of a request to revoke a customer token.
     */
    public RevokeCustomerTokenOutputQuery result() {
        startField("result");

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
    public static Fragment<RevokeCustomerTokenOutputQuery> createFragment(String name, RevokeCustomerTokenOutputQueryDefinition queryDef) {
        StringBuilder sb = new StringBuilder();
        queryDef.define(new RevokeCustomerTokenOutputQuery(sb));
        return new Fragment<>(name, "RevokeCustomerTokenOutput", sb.toString());
    }

    /**
     * Adds a <code>RevokeCustomerTokenOutputQuery</code> fragment reference at the current position of the query.
     * For example for a fragment named <code>test</code>, calling this method will add the
     * reference <code>...test</code> in the query. For GraphQL types implementing an interface, there
     * will be some similar methods using the Query type of each implemented interface.
     * 
     * @param fragment The fragment to reference.
     */
    public RevokeCustomerTokenOutputQuery addFragmentReference(Fragment<RevokeCustomerTokenOutputQuery> fragment) {
        startField("..." + fragment.getName());
        return this;
    }
}

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
 * Customer return
 */
public class ReturnQuery extends AbstractQuery<ReturnQuery> {
    ReturnQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
     * A list of shipping carriers available for returns
     */
    public ReturnQuery availableShippingCarriers(ReturnShippingCarrierQueryDefinition queryDef) {
        startField("available_shipping_carriers");

        _queryBuilder.append('{');
        queryDef.define(new ReturnShippingCarrierQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * A list of comments posted for the return request
     */
    public ReturnQuery comments(ReturnCommentQueryDefinition queryDef) {
        startField("comments");

        _queryBuilder.append('{');
        queryDef.define(new ReturnCommentQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The date the return was requested
     */
    public ReturnQuery createdAt() {
        startField("created_at");

        return this;
    }

    /**
     * The data from customer who created the return request
     */
    public ReturnQuery customer(ReturnCustomerQueryDefinition queryDef) {
        startField("customer");

        _queryBuilder.append('{');
        queryDef.define(new ReturnCustomerQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * A list of items being returned
     */
    public ReturnQuery items(ReturnItemQueryDefinition queryDef) {
        startField("items");

        _queryBuilder.append('{');
        queryDef.define(new ReturnItemQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Human-readable return number
     */
    public ReturnQuery number() {
        startField("number");

        return this;
    }

    /**
     * The order associated with the return
     */
    public ReturnQuery order(CustomerOrderQueryDefinition queryDef) {
        startField("order");

        _queryBuilder.append('{');
        queryDef.define(new CustomerOrderQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Shipping information for the return
     */
    public ReturnQuery shipping(ReturnShippingQueryDefinition queryDef) {
        startField("shipping");

        _queryBuilder.append('{');
        queryDef.define(new ReturnShippingQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The status of the return request
     */
    public ReturnQuery status() {
        startField("status");

        return this;
    }

    /**
     * The unique ID for a `Return` object
     */
    public ReturnQuery uid() {
        startField("uid");

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
    public static Fragment<ReturnQuery> createFragment(String name, ReturnQueryDefinition queryDef) {
        StringBuilder sb = new StringBuilder();
        queryDef.define(new ReturnQuery(sb));
        return new Fragment<>(name, "Return", sb.toString());
    }

    /**
     * Adds a <code>ReturnQuery</code> fragment reference at the current position of the query.
     * For example for a fragment named <code>test</code>, calling this method will add the
     * reference <code>...test</code> in the query. For GraphQL types implementing an interface, there
     * will be some similar methods using the Query type of each implemented interface.
     * 
     * @param fragment The fragment to reference.
     */
    public ReturnQuery addFragmentReference(Fragment<ReturnQuery> fragment) {
        startField("..." + fragment.getName());
        return this;
    }
}

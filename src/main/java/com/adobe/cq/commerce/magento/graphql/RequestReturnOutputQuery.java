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

public class RequestReturnOutputQuery extends AbstractQuery<RequestReturnOutputQuery> {
    RequestReturnOutputQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
     * Contains details about a single return request
     */
    public RequestReturnOutputQuery returnValue(ReturnQueryDefinition queryDef) {
        startField("return");

        _queryBuilder.append('{');
        queryDef.define(new ReturnQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class ReturnsArguments extends Arguments {
        ReturnsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
         * Specifies the maximum number of results to return at once. The default is 20
         */
        public ReturnsArguments pageSize(Integer value) {
            if (value != null) {
                startArgument("pageSize");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
         * Specifies which page of results to return. The default value is 1
         */
        public ReturnsArguments currentPage(Integer value) {
            if (value != null) {
                startArgument("currentPage");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface ReturnsArgumentsDefinition {
        void define(ReturnsArguments args);
    }

    /**
     * Contains an array of return requests
     */
    public RequestReturnOutputQuery returns(ReturnsQueryDefinition queryDef) {
        return returns(args -> {}, queryDef);
    }

    /**
     * Contains an array of return requests
     */
    public RequestReturnOutputQuery returns(ReturnsArgumentsDefinition argsDef, ReturnsQueryDefinition queryDef) {
        startField("returns");

        ReturnsArguments args = new ReturnsArguments(_queryBuilder);
        argsDef.define(args);
        ReturnsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ReturnsQuery(_queryBuilder));
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
    public static Fragment<RequestReturnOutputQuery> createFragment(String name, RequestReturnOutputQueryDefinition queryDef) {
        StringBuilder sb = new StringBuilder();
        queryDef.define(new RequestReturnOutputQuery(sb));
        return new Fragment<>(name, "RequestReturnOutput", sb.toString());
    }

    /**
     * Adds a <code>RequestReturnOutputQuery</code> fragment reference at the current position of the query.
     * For example for a fragment named <code>test</code>, calling this method will add the
     * reference <code>...test</code> in the query. For GraphQL types implementing an interface, there
     * will be some similar methods using the Query type of each implemented interface.
     * 
     * @param fragment The fragment to reference.
     */
    public RequestReturnOutputQuery addFragmentReference(Fragment<RequestReturnOutputQuery> fragment) {
        startField("..." + fragment.getName());
        return this;
    }
}

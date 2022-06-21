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
 * Contains a list of undeleted negotiable quotes the company user can view.
 */
public class DeleteNegotiableQuotesOutputQuery extends AbstractQuery<DeleteNegotiableQuotesOutputQuery> {
    DeleteNegotiableQuotesOutputQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public class NegotiableQuotesArguments extends Arguments {
        NegotiableQuotesArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
         * The filter to use to determine which negotiable quotes to delete.
         */
        public NegotiableQuotesArguments filter(NegotiableQuoteFilterInput value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
         * The maximum number of results to return at once. The default value is 20.
         */
        public NegotiableQuotesArguments pageSize(Integer value) {
            if (value != null) {
                startArgument("pageSize");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
         * The page of results to return. The default value is 1.
         */
        public NegotiableQuotesArguments currentPage(Integer value) {
            if (value != null) {
                startArgument("currentPage");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
         * The field to use for sorting results.
         */
        public NegotiableQuotesArguments sort(NegotiableQuoteSortInput value) {
            if (value != null) {
                startArgument("sort");
                value.appendTo(_queryBuilder);
            }
            return this;
        }
    }

    public interface NegotiableQuotesArgumentsDefinition {
        void define(NegotiableQuotesArguments args);
    }

    /**
     * A list of negotiable quotes that the customer can view
     */
    public DeleteNegotiableQuotesOutputQuery negotiableQuotes(NegotiableQuotesOutputQueryDefinition queryDef) {
        return negotiableQuotes(args -> {}, queryDef);
    }

    /**
     * A list of negotiable quotes that the customer can view
     */
    public DeleteNegotiableQuotesOutputQuery negotiableQuotes(NegotiableQuotesArgumentsDefinition argsDef,
        NegotiableQuotesOutputQueryDefinition queryDef) {
        startField("negotiable_quotes");

        NegotiableQuotesArguments args = new NegotiableQuotesArguments(_queryBuilder);
        argsDef.define(args);
        NegotiableQuotesArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new NegotiableQuotesOutputQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * An array of deleted negotiable quote UIDs and details about any errors.
     */
    public DeleteNegotiableQuotesOutputQuery operationResults(DeleteNegotiableQuoteOperationResultQueryDefinition queryDef) {
        startField("operation_results");

        _queryBuilder.append('{');
        queryDef.define(new DeleteNegotiableQuoteOperationResultQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The status of the request to delete one or more negotiable quotes.
     */
    public DeleteNegotiableQuotesOutputQuery resultStatus() {
        startField("result_status");

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
    public static Fragment<DeleteNegotiableQuotesOutputQuery> createFragment(String name,
        DeleteNegotiableQuotesOutputQueryDefinition queryDef) {
        StringBuilder sb = new StringBuilder();
        queryDef.define(new DeleteNegotiableQuotesOutputQuery(sb));
        return new Fragment<>(name, "DeleteNegotiableQuotesOutput", sb.toString());
    }

    /**
     * Adds a <code>DeleteNegotiableQuotesOutputQuery</code> fragment reference at the current position of the query.
     * For example for a fragment named <code>test</code>, calling this method will add the
     * reference <code>...test</code> in the query. For GraphQL types implementing an interface, there
     * will be some similar methods using the Query type of each implemented interface.
     * 
     * @param fragment The fragment to reference.
     */
    public DeleteNegotiableQuotesOutputQuery addFragmentReference(Fragment<DeleteNegotiableQuotesOutputQuery> fragment) {
        startField("..." + fragment.getName());
        return this;
    }
}

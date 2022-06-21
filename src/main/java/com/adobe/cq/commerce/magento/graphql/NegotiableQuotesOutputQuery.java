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
 * Contains a list of negotiable that match the specified filter.
 */
public class NegotiableQuotesOutputQuery extends AbstractQuery<NegotiableQuotesOutputQuery> {
    NegotiableQuotesOutputQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
     * A list of negotiable quotes
     */
    public NegotiableQuotesOutputQuery items(NegotiableQuoteQueryDefinition queryDef) {
        startField("items");

        _queryBuilder.append('{');
        queryDef.define(new NegotiableQuoteQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Contains pagination metadata
     */
    public NegotiableQuotesOutputQuery pageInfo(SearchResultPageInfoQueryDefinition queryDef) {
        startField("page_info");

        _queryBuilder.append('{');
        queryDef.define(new SearchResultPageInfoQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Contains the default sort field and all available sort fields.
     */
    public NegotiableQuotesOutputQuery sortFields(SortFieldsQueryDefinition queryDef) {
        startField("sort_fields");

        _queryBuilder.append('{');
        queryDef.define(new SortFieldsQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The number of negotiable quotes returned
     */
    public NegotiableQuotesOutputQuery totalCount() {
        startField("total_count");

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
    public static Fragment<NegotiableQuotesOutputQuery> createFragment(String name, NegotiableQuotesOutputQueryDefinition queryDef) {
        StringBuilder sb = new StringBuilder();
        queryDef.define(new NegotiableQuotesOutputQuery(sb));
        return new Fragment<>(name, "NegotiableQuotesOutput", sb.toString());
    }

    /**
     * Adds a <code>NegotiableQuotesOutputQuery</code> fragment reference at the current position of the query.
     * For example for a fragment named <code>test</code>, calling this method will add the
     * reference <code>...test</code> in the query. For GraphQL types implementing an interface, there
     * will be some similar methods using the Query type of each implemented interface.
     * 
     * @param fragment The fragment to reference.
     */
    public NegotiableQuotesOutputQuery addFragmentReference(Fragment<NegotiableQuotesOutputQuery> fragment) {
        startField("..." + fragment.getName());
        return this;
    }
}

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
 * Contains details about a change for a negotiable quote.
 */
public class NegotiableQuoteHistoryEntryQuery extends AbstractQuery<NegotiableQuoteHistoryEntryQuery> {
    NegotiableQuoteHistoryEntryQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
     * The person who made a change in the status of the negotiable quote.
     */
    public NegotiableQuoteHistoryEntryQuery author(NegotiableQuoteUserQueryDefinition queryDef) {
        startField("author");

        _queryBuilder.append('{');
        queryDef.define(new NegotiableQuoteUserQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * An enum that describes the why the entry in the negotiable quote history changed status.
     */
    public NegotiableQuoteHistoryEntryQuery changeType() {
        startField("change_type");

        return this;
    }

    /**
     * The set of changes in the negotiable quote.
     */
    public NegotiableQuoteHistoryEntryQuery changes(NegotiableQuoteHistoryChangesQueryDefinition queryDef) {
        startField("changes");

        _queryBuilder.append('{');
        queryDef.define(new NegotiableQuoteHistoryChangesQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Timestamp indicating when the negotiable quote entry was created.
     */
    public NegotiableQuoteHistoryEntryQuery createdAt() {
        startField("created_at");

        return this;
    }

    /**
     * The unique ID of a `NegotiableQuoteHistoryEntry` object.
     */
    public NegotiableQuoteHistoryEntryQuery uid() {
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
    public static Fragment<NegotiableQuoteHistoryEntryQuery> createFragment(String name,
        NegotiableQuoteHistoryEntryQueryDefinition queryDef) {
        StringBuilder sb = new StringBuilder();
        queryDef.define(new NegotiableQuoteHistoryEntryQuery(sb));
        return new Fragment<>(name, "NegotiableQuoteHistoryEntry", sb.toString());
    }

    /**
     * Adds a <code>NegotiableQuoteHistoryEntryQuery</code> fragment reference at the current position of the query.
     * For example for a fragment named <code>test</code>, calling this method will add the
     * reference <code>...test</code> in the query. For GraphQL types implementing an interface, there
     * will be some similar methods using the Query type of each implemented interface.
     * 
     * @param fragment The fragment to reference.
     */
    public NegotiableQuoteHistoryEntryQuery addFragmentReference(Fragment<NegotiableQuoteHistoryEntryQuery> fragment) {
        startField("..." + fragment.getName());
        return this;
    }
}

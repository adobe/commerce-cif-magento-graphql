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
 * Contains a list of changes to a negotiable quote.
 */
public class NegotiableQuoteHistoryChangesQuery extends AbstractQuery<NegotiableQuoteHistoryChangesQuery> {
    NegotiableQuoteHistoryChangesQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
     * The comment provided with a change in the negotiable quote history.
     */
    public NegotiableQuoteHistoryChangesQuery commentAdded(NegotiableQuoteHistoryCommentChangeQueryDefinition queryDef) {
        startField("comment_added");

        _queryBuilder.append('{');
        queryDef.define(new NegotiableQuoteHistoryCommentChangeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Lists log entries added by third-party extensions.
     */
    public NegotiableQuoteHistoryChangesQuery customChanges(NegotiableQuoteCustomLogChangeQueryDefinition queryDef) {
        startField("custom_changes");

        _queryBuilder.append('{');
        queryDef.define(new NegotiableQuoteCustomLogChangeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The expiration date of the negotiable quote before and after a change in the quote history.
     */
    public NegotiableQuoteHistoryChangesQuery expiration(NegotiableQuoteHistoryExpirationChangeQueryDefinition queryDef) {
        startField("expiration");

        _queryBuilder.append('{');
        queryDef.define(new NegotiableQuoteHistoryExpirationChangeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Lists products that were removed as a result of a change in the quote history.
     */
    public NegotiableQuoteHistoryChangesQuery productsRemoved(NegotiableQuoteHistoryProductsRemovedChangeQueryDefinition queryDef) {
        startField("products_removed");

        _queryBuilder.append('{');
        queryDef.define(new NegotiableQuoteHistoryProductsRemovedChangeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The status before and after a change in the negotiable quote history.
     */
    public NegotiableQuoteHistoryChangesQuery statuses(NegotiableQuoteHistoryStatusesChangeQueryDefinition queryDef) {
        startField("statuses");

        _queryBuilder.append('{');
        queryDef.define(new NegotiableQuoteHistoryStatusesChangeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The total amount of the negotiable quote before and after a change in the quote history.
     */
    public NegotiableQuoteHistoryChangesQuery total(NegotiableQuoteHistoryTotalChangeQueryDefinition queryDef) {
        startField("total");

        _queryBuilder.append('{');
        queryDef.define(new NegotiableQuoteHistoryTotalChangeQuery(_queryBuilder));
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
    public static Fragment<NegotiableQuoteHistoryChangesQuery> createFragment(String name,
        NegotiableQuoteHistoryChangesQueryDefinition queryDef) {
        StringBuilder sb = new StringBuilder();
        queryDef.define(new NegotiableQuoteHistoryChangesQuery(sb));
        return new Fragment<>(name, "NegotiableQuoteHistoryChanges", sb.toString());
    }

    /**
     * Adds a <code>NegotiableQuoteHistoryChangesQuery</code> fragment reference at the current position of the query.
     * For example for a fragment named <code>test</code>, calling this method will add the
     * reference <code>...test</code> in the query. For GraphQL types implementing an interface, there
     * will be some similar methods using the Query type of each implemented interface.
     * 
     * @param fragment The fragment to reference.
     */
    public NegotiableQuoteHistoryChangesQuery addFragmentReference(Fragment<NegotiableQuoteHistoryChangesQuery> fragment) {
        startField("..." + fragment.getName());
        return this;
    }
}

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

import java.io.Serializable;
import java.util.List;

import com.shopify.graphql.support.AbstractQuery;
import com.shopify.graphql.support.ID;

/**
 * Defines the items to remove from the specified negotiable quote.
 */
public class RemoveNegotiableQuoteItemsInput implements Serializable {
    private List<ID> quoteItemUids;

    private ID quoteUid;

    public RemoveNegotiableQuoteItemsInput(List<ID> quoteItemUids, ID quoteUid) {
        this.quoteItemUids = quoteItemUids;

        this.quoteUid = quoteUid;
    }

    /**
     * An array of IDs indicating which items to remove from the negotiable quote.
     */
    public List<ID> getQuoteItemUids() {
        return quoteItemUids;
    }

    /**
     * An array of IDs indicating which items to remove from the negotiable quote.
     */
    public RemoveNegotiableQuoteItemsInput setQuoteItemUids(List<ID> quoteItemUids) {
        this.quoteItemUids = quoteItemUids;
        return this;
    }

    /**
     * The unique ID of a `NegotiableQuote` object.
     */
    public ID getQuoteUid() {
        return quoteUid;
    }

    /**
     * The unique ID of a `NegotiableQuote` object.
     */
    public RemoveNegotiableQuoteItemsInput setQuoteUid(ID quoteUid) {
        this.quoteUid = quoteUid;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("quote_item_uids:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (ID item1 : quoteItemUids) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                AbstractQuery.appendQuotedString(_queryBuilder, item1.toString());
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("quote_uid:");
        AbstractQuery.appendQuotedString(_queryBuilder, quoteUid.toString());

        _queryBuilder.append('}');
    }
}

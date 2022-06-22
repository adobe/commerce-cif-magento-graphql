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
 * Specifies the items to update.
 */
public class UpdateNegotiableQuoteQuantitiesInput implements Serializable {
    private List<NegotiableQuoteItemQuantityInput> items;

    private ID quoteUid;

    public UpdateNegotiableQuoteQuantitiesInput(List<NegotiableQuoteItemQuantityInput> items, ID quoteUid) {
        this.items = items;

        this.quoteUid = quoteUid;
    }

    /**
     * An array of items to update.
     */
    public List<NegotiableQuoteItemQuantityInput> getItems() {
        return items;
    }

    /**
     * An array of items to update.
     */
    public UpdateNegotiableQuoteQuantitiesInput setItems(List<NegotiableQuoteItemQuantityInput> items) {
        this.items = items;
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
    public UpdateNegotiableQuoteQuantitiesInput setQuoteUid(ID quoteUid) {
        this.quoteUid = quoteUid;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("items:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (NegotiableQuoteItemQuantityInput item1 : items) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                item1.appendTo(_queryBuilder);
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

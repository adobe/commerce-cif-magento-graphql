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

import com.shopify.graphql.support.AbstractQuery;
import com.shopify.graphql.support.ID;

/**
 * Specifies the updated quantity of an item.
 */
public class NegotiableQuoteItemQuantityInput implements Serializable {
    private double quantity;

    private ID quoteItemUid;

    public NegotiableQuoteItemQuantityInput(double quantity, ID quoteItemUid) {
        this.quantity = quantity;

        this.quoteItemUid = quoteItemUid;
    }

    /**
     * The new quantity of the negotiable quote item.
     */
    public double getQuantity() {
        return quantity;
    }

    /**
     * The new quantity of the negotiable quote item.
     */
    public NegotiableQuoteItemQuantityInput setQuantity(double quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     * The unique ID of a `CartItemInterface` object.
     */
    public ID getQuoteItemUid() {
        return quoteItemUid;
    }

    /**
     * The unique ID of a `CartItemInterface` object.
     */
    public NegotiableQuoteItemQuantityInput setQuoteItemUid(ID quoteItemUid) {
        this.quoteItemUid = quoteItemUid;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("quantity:");
        _queryBuilder.append(quantity);

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("quote_item_uid:");
        AbstractQuery.appendQuotedString(_queryBuilder, quoteItemUid.toString());

        _queryBuilder.append('}');
    }
}
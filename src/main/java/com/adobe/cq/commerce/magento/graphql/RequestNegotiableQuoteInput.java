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
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import com.shopify.graphql.support.AbstractQuery;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Input;

/**
 * Defines properties of a negotiable quote request.
 */
public class RequestNegotiableQuoteInput implements Serializable {
    private ID cartId;

    private NegotiableQuoteCommentInput comment;

    private String quoteName;

    private Map<String, Input<Serializable>> customFilters = new HashMap<>();

    public RequestNegotiableQuoteInput(ID cartId, NegotiableQuoteCommentInput comment, String quoteName) {
        this.cartId = cartId;

        this.comment = comment;

        this.quoteName = quoteName;
    }

    /**
     * The cart ID of the buyer requesting a new negotiable quote.
     */
    public ID getCartId() {
        return cartId;
    }

    /**
     * The cart ID of the buyer requesting a new negotiable quote.
     */
    public RequestNegotiableQuoteInput setCartId(ID cartId) {
        this.cartId = cartId;
        return this;
    }

    /**
     * Comments the buyer entered to describe the request.
     */
    public NegotiableQuoteCommentInput getComment() {
        return comment;
    }

    /**
     * Comments the buyer entered to describe the request.
     */
    public RequestNegotiableQuoteInput setComment(NegotiableQuoteCommentInput comment) {
        this.comment = comment;
        return this;
    }

    /**
     * The name the buyer assigned to the negotiable quote request.
     */
    public String getQuoteName() {
        return quoteName;
    }

    /**
     * The name the buyer assigned to the negotiable quote request.
     */
    public RequestNegotiableQuoteInput setQuoteName(String quoteName) {
        this.quoteName = quoteName;
        return this;
    }

    /**
     * Set custom filter.
     */
    public RequestNegotiableQuoteInput setCustomFilter(String name, Serializable filterInput) {
        this.customFilters.put(name, Input.optional(filterInput));
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (!this.customFilters.isEmpty()) {
            for (Map.Entry<String, Input<Serializable>> entry : customFilters.entrySet()) {
                _queryBuilder.append(separator);
                separator = ",";
                _queryBuilder.append(entry.getKey() + ":");

                Serializable filter = entry.getValue().getValue();

                if (filter != null) {
                    try {
                        Method appendTo = filter.getClass().getMethod("appendTo", StringBuilder.class);
                        appendTo.invoke(filter, _queryBuilder);
                    } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
                        _queryBuilder.append("null");
                    }
                } else {
                    _queryBuilder.append("null");
                }
            }
        }

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("cart_id:");
        AbstractQuery.appendQuotedString(_queryBuilder, cartId.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("comment:");
        comment.appendTo(_queryBuilder);

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("quote_name:");
        AbstractQuery.appendQuotedString(_queryBuilder, quoteName.toString());

        _queryBuilder.append('}');
    }
}

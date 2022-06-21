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
import com.shopify.graphql.support.Input;

/**
 * Specifies which negotiable quote to send for review.
 */
public class SendNegotiableQuoteForReviewInput implements Serializable {
    private ID quoteUid;

    private Input<NegotiableQuoteCommentInput> comment = Input.undefined();

    public SendNegotiableQuoteForReviewInput(ID quoteUid) {
        this.quoteUid = quoteUid;
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
    public SendNegotiableQuoteForReviewInput setQuoteUid(ID quoteUid) {
        this.quoteUid = quoteUid;
        return this;
    }

    /**
     * A comment for the seller to review.
     */
    public NegotiableQuoteCommentInput getComment() {
        return comment.getValue();
    }

    /**
     * A comment for the seller to review.
     */
    public Input<NegotiableQuoteCommentInput> getCommentInput() {
        return comment;
    }

    /**
     * A comment for the seller to review.
     */
    public SendNegotiableQuoteForReviewInput setComment(NegotiableQuoteCommentInput comment) {
        this.comment = Input.optional(comment);
        return this;
    }

    /**
     * A comment for the seller to review.
     */
    public SendNegotiableQuoteForReviewInput setCommentInput(Input<NegotiableQuoteCommentInput> comment) {
        if (comment == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.comment = comment;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("quote_uid:");
        AbstractQuery.appendQuotedString(_queryBuilder, quoteUid.toString());

        if (this.comment.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("comment:");
            if (comment.getValue() != null) {
                comment.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}

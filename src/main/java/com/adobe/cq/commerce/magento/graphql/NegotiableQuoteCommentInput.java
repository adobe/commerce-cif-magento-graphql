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

/**
 * Contains the commend provided by the buyer.
 */
public class NegotiableQuoteCommentInput implements Serializable {
    private String comment;

    public NegotiableQuoteCommentInput(String comment) {
        this.comment = comment;
    }

    /**
     * The comment provided by the buyer.
     */
    public String getComment() {
        return comment;
    }

    /**
     * The comment provided by the buyer.
     */
    public NegotiableQuoteCommentInput setComment(String comment) {
        this.comment = comment;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("comment:");
        AbstractQuery.appendQuotedString(_queryBuilder, comment.toString());

        _queryBuilder.append('}');
    }
}

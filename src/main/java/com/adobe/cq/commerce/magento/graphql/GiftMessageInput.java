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
 * Contains the text of a gift message, its sender, and recipient
 */
public class GiftMessageInput implements Serializable {
    private String from;

    private String message;

    private String to;

    public GiftMessageInput(String from, String message, String to) {
        this.from = from;

        this.message = message;

        this.to = to;
    }

    /**
     * Sender name
     */
    public String getFrom() {
        return from;
    }

    /**
     * Sender name
     */
    public GiftMessageInput setFrom(String from) {
        this.from = from;
        return this;
    }

    /**
     * Gift message text
     */
    public String getMessage() {
        return message;
    }

    /**
     * Gift message text
     */
    public GiftMessageInput setMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Recepient name
     */
    public String getTo() {
        return to;
    }

    /**
     * Recepient name
     */
    public GiftMessageInput setTo(String to) {
        this.to = to;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("from:");
        AbstractQuery.appendQuotedString(_queryBuilder, from.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("message:");
        AbstractQuery.appendQuotedString(_queryBuilder, message.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("to:");
        AbstractQuery.appendQuotedString(_queryBuilder, to.toString());

        _queryBuilder.append('}');
    }
}

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
import java.util.List;
import java.util.Map;

import com.shopify.graphql.support.AbstractQuery;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Input;

public class RequestReturnInput implements Serializable {
    private List<RequestReturnItemInput> items;

    private ID orderUid;

    private Input<String> commentText = Input.undefined();

    private Input<String> contactEmail = Input.undefined();

    private Map<String, Input<Serializable>> customFilters = new HashMap<>();

    public RequestReturnInput(List<RequestReturnItemInput> items, ID orderUid) {
        this.items = items;

        this.orderUid = orderUid;
    }

    /**
     * An array of items to be returned
     */
    public List<RequestReturnItemInput> getItems() {
        return items;
    }

    /**
     * An array of items to be returned
     */
    public RequestReturnInput setItems(List<RequestReturnItemInput> items) {
        this.items = items;
        return this;
    }

    /**
     * The unique ID for a `Order` object
     */
    public ID getOrderUid() {
        return orderUid;
    }

    /**
     * The unique ID for a `Order` object
     */
    public RequestReturnInput setOrderUid(ID orderUid) {
        this.orderUid = orderUid;
        return this;
    }

    /**
     * Text the buyer entered that describes the reason for the refund request
     */
    public String getCommentText() {
        return commentText.getValue();
    }

    /**
     * Text the buyer entered that describes the reason for the refund request
     */
    public Input<String> getCommentTextInput() {
        return commentText;
    }

    /**
     * Text the buyer entered that describes the reason for the refund request
     */
    public RequestReturnInput setCommentText(String commentText) {
        this.commentText = Input.optional(commentText);
        return this;
    }

    /**
     * Text the buyer entered that describes the reason for the refund request
     */
    public RequestReturnInput setCommentTextInput(Input<String> commentText) {
        if (commentText == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.commentText = commentText;
        return this;
    }

    /**
     * An email address the buyer enters to receive notifications about the status of the return
     */
    public String getContactEmail() {
        return contactEmail.getValue();
    }

    /**
     * An email address the buyer enters to receive notifications about the status of the return
     */
    public Input<String> getContactEmailInput() {
        return contactEmail;
    }

    /**
     * An email address the buyer enters to receive notifications about the status of the return
     */
    public RequestReturnInput setContactEmail(String contactEmail) {
        this.contactEmail = Input.optional(contactEmail);
        return this;
    }

    /**
     * An email address the buyer enters to receive notifications about the status of the return
     */
    public RequestReturnInput setContactEmailInput(Input<String> contactEmail) {
        if (contactEmail == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.contactEmail = contactEmail;
        return this;
    }

    /**
     * Set custom filter.
     */
    public RequestReturnInput setCustomFilter(String name, Serializable filterInput) {
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
        _queryBuilder.append("items:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (RequestReturnItemInput item1 : items) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                item1.appendTo(_queryBuilder);
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("order_uid:");
        AbstractQuery.appendQuotedString(_queryBuilder, orderUid.toString());

        if (this.commentText.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("comment_text:");
            if (commentText.getValue() != null) {
                AbstractQuery.appendQuotedString(_queryBuilder, commentText.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.contactEmail.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("contact_email:");
            if (contactEmail.getValue() != null) {
                AbstractQuery.appendQuotedString(_queryBuilder, contactEmail.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}

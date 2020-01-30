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
import com.shopify.graphql.support.Input;

/**
 * Defines a filter that matches a range of values, such as prices or dates.
 */
public class FilterRangeTypeInput implements Serializable {
    private Input<String> from = Input.undefined();

    private Input<String> to = Input.undefined();

    /**
     * The beginning of the range
     */
    public String getFrom() {
        return from.getValue();
    }

    /**
     * The beginning of the range
     */
    public Input<String> getFromInput() {
        return from;
    }

    /**
     * The beginning of the range
     */
    public FilterRangeTypeInput setFrom(String from) {
        this.from = Input.optional(from);
        return this;
    }

    /**
     * The beginning of the range
     */
    public FilterRangeTypeInput setFromInput(Input<String> from) {
        if (from == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.from = from;
        return this;
    }

    /**
     * The end of the range
     */
    public String getTo() {
        return to.getValue();
    }

    /**
     * The end of the range
     */
    public Input<String> getToInput() {
        return to;
    }

    /**
     * The end of the range
     */
    public FilterRangeTypeInput setTo(String to) {
        this.to = Input.optional(to);
        return this;
    }

    /**
     * The end of the range
     */
    public FilterRangeTypeInput setToInput(Input<String> to) {
        if (to == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.to = to;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.from.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("from:");
            if (from.getValue() != null) {
                AbstractQuery.appendQuotedString(_queryBuilder, from.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.to.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("to:");
            if (to.getValue() != null) {
                AbstractQuery.appendQuotedString(_queryBuilder, to.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}

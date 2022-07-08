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
import com.shopify.graphql.support.Input;

/**
 * Defines a filter that matches a range of values, such as prices or dates.
 */
public class FilterRangeTypeInput implements Serializable {
    private Input<String> from = Input.undefined();

    private Input<String> to = Input.undefined();

    private Map<String, Input<Serializable>> customFilters = new HashMap<>();

    /**
     * Use this attribute to specify the lowest possible value in the range.
     */
    public String getFrom() {
        return from.getValue();
    }

    /**
     * Use this attribute to specify the lowest possible value in the range.
     */
    public Input<String> getFromInput() {
        return from;
    }

    /**
     * Use this attribute to specify the lowest possible value in the range.
     */
    public FilterRangeTypeInput setFrom(String from) {
        this.from = Input.optional(from);
        return this;
    }

    /**
     * Use this attribute to specify the lowest possible value in the range.
     */
    public FilterRangeTypeInput setFromInput(Input<String> from) {
        if (from == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.from = from;
        return this;
    }

    /**
     * Use this attribute to specify the highest possible value in the range.
     */
    public String getTo() {
        return to.getValue();
    }

    /**
     * Use this attribute to specify the highest possible value in the range.
     */
    public Input<String> getToInput() {
        return to;
    }

    /**
     * Use this attribute to specify the highest possible value in the range.
     */
    public FilterRangeTypeInput setTo(String to) {
        this.to = Input.optional(to);
        return this;
    }

    /**
     * Use this attribute to specify the highest possible value in the range.
     */
    public FilterRangeTypeInput setToInput(Input<String> to) {
        if (to == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.to = to;
        return this;
    }

    /**
     * Set custom filter.
     */
    public FilterRangeTypeInput setCustomFilter(String name, Serializable filterInput) {
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

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
import com.shopify.graphql.support.Input;

/**
 * Defines a filter that matches the input exactly.
 */
public class FilterEqualTypeInput implements Serializable {
    private Input<String> eq = Input.undefined();

    private Input<List<String>> in = Input.undefined();

    private Map<String, Input<Serializable>> customFilters = new HashMap<>();

    /**
     * A string to filter on
     */
    public String getEq() {
        return eq.getValue();
    }

    /**
     * A string to filter on
     */
    public Input<String> getEqInput() {
        return eq;
    }

    /**
     * A string to filter on
     */
    public FilterEqualTypeInput setEq(String eq) {
        this.eq = Input.optional(eq);
        return this;
    }

    /**
     * A string to filter on
     */
    public FilterEqualTypeInput setEqInput(Input<String> eq) {
        if (eq == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.eq = eq;
        return this;
    }

    /**
     * An array of values to filter on
     */
    public List<String> getIn() {
        return in.getValue();
    }

    /**
     * An array of values to filter on
     */
    public Input<List<String>> getInInput() {
        return in;
    }

    /**
     * An array of values to filter on
     */
    public FilterEqualTypeInput setIn(List<String> in) {
        this.in = Input.optional(in);
        return this;
    }

    /**
     * An array of values to filter on
     */
    public FilterEqualTypeInput setInInput(Input<List<String>> in) {
        if (in == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.in = in;
        return this;
    }

    /**
     * Set custom filter.
     */
    public FilterEqualTypeInput setCustomFilter(String name, Serializable filterInput) {
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

        if (this.eq.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("eq:");
            if (eq.getValue() != null) {
                AbstractQuery.appendQuotedString(_queryBuilder, eq.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.in.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("in:");
            if (in.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (String item1 : in.getValue()) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        AbstractQuery.appendQuotedString(_queryBuilder, item1.toString());
                    }
                }
                _queryBuilder.append(']');
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}

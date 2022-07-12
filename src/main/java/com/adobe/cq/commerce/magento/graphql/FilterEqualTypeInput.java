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
     * Use this attribute to exactly match the specified string. For example, to filter on a specific
     * category ID, specify a value such as `5`.
     */
    public String getEq() {
        return eq.getValue();
    }

    /**
     * Use this attribute to exactly match the specified string. For example, to filter on a specific
     * category ID, specify a value such as `5`.
     */
    public Input<String> getEqInput() {
        return eq;
    }

    /**
     * Use this attribute to exactly match the specified string. For example, to filter on a specific
     * category ID, specify a value such as `5`.
     */
    public FilterEqualTypeInput setEq(String eq) {
        this.eq = Input.optional(eq);
        return this;
    }

    /**
     * Use this attribute to exactly match the specified string. For example, to filter on a specific
     * category ID, specify a value such as `5`.
     */
    public FilterEqualTypeInput setEqInput(Input<String> eq) {
        if (eq == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.eq = eq;
        return this;
    }

    /**
     * Use this attribute to filter on an array of values. For example, to filter on category IDs 4, 5, and
     * 6, specify a value of `[&quot;4&quot;, &quot;5&quot;, &quot;6&quot;]`.
     */
    public List<String> getIn() {
        return in.getValue();
    }

    /**
     * Use this attribute to filter on an array of values. For example, to filter on category IDs 4, 5, and
     * 6, specify a value of `[&quot;4&quot;, &quot;5&quot;, &quot;6&quot;]`.
     */
    public Input<List<String>> getInInput() {
        return in;
    }

    /**
     * Use this attribute to filter on an array of values. For example, to filter on category IDs 4, 5, and
     * 6, specify a value of `[&quot;4&quot;, &quot;5&quot;, &quot;6&quot;]`.
     */
    public FilterEqualTypeInput setIn(List<String> in) {
        this.in = Input.optional(in);
        return this;
    }

    /**
     * Use this attribute to filter on an array of values. For example, to filter on category IDs 4, 5, and
     * 6, specify a value of `[&quot;4&quot;, &quot;5&quot;, &quot;6&quot;]`.
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

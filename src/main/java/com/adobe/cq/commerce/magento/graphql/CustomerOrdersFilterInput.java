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

import com.shopify.graphql.support.Input;

/**
 * Identifies the filter to use for filtering orders.
 */
public class CustomerOrdersFilterInput implements Serializable {
    private Input<FilterStringTypeInput> number = Input.undefined();

    private Map<String, Input<Serializable>> customFilters = new HashMap<>();

    /**
     * Filters by order number.
     */
    public FilterStringTypeInput getNumber() {
        return number.getValue();
    }

    /**
     * Filters by order number.
     */
    public Input<FilterStringTypeInput> getNumberInput() {
        return number;
    }

    /**
     * Filters by order number.
     */
    public CustomerOrdersFilterInput setNumber(FilterStringTypeInput number) {
        this.number = Input.optional(number);
        return this;
    }

    /**
     * Filters by order number.
     */
    public CustomerOrdersFilterInput setNumberInput(Input<FilterStringTypeInput> number) {
        if (number == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.number = number;
        return this;
    }

    /**
     * Set custom filter.
     */
    public CustomerOrdersFilterInput setCustomFilter(String name, Serializable filterInput) {
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

        if (this.number.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("number:");
            if (number.getValue() != null) {
                number.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}

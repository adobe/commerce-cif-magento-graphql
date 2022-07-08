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

public class CustomizableOptionInput implements Serializable {
    private String valueString;

    private Input<Integer> id = Input.undefined();

    private Map<String, Input<Serializable>> customFilters = new HashMap<>();

    public CustomizableOptionInput(String valueString) {
        this.valueString = valueString;
    }

    /**
     * The string value of the option
     */
    public String getValueString() {
        return valueString;
    }

    /**
     * The string value of the option
     */
    public CustomizableOptionInput setValueString(String valueString) {
        this.valueString = valueString;
        return this;
    }

    /**
     * The customizable option id of the product
     */
    public Integer getId() {
        return id.getValue();
    }

    /**
     * The customizable option id of the product
     */
    public Input<Integer> getIdInput() {
        return id;
    }

    /**
     * The customizable option id of the product
     */
    public CustomizableOptionInput setId(Integer id) {
        this.id = Input.optional(id);
        return this;
    }

    /**
     * The customizable option id of the product
     */
    public CustomizableOptionInput setIdInput(Input<Integer> id) {
        if (id == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.id = id;
        return this;
    }

    /**
     * Set custom filter.
     */
    public CustomizableOptionInput setCustomFilter(String name, Serializable filterInput) {
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
        _queryBuilder.append("value_string:");
        AbstractQuery.appendQuotedString(_queryBuilder, valueString.toString());

        if (this.id.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("id:");
            if (id.getValue() != null) {
                _queryBuilder.append(id.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}

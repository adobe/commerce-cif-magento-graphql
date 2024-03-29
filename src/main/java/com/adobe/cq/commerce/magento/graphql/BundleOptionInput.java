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
 * Defines the input for a bundle option.
 */
public class BundleOptionInput implements Serializable {
    private int id;

    private double quantity;

    private List<String> value;

    private Map<String, Input<Serializable>> customFilters = new HashMap<>();

    public BundleOptionInput(int id, double quantity, List<String> value) {
        this.id = id;

        this.quantity = quantity;

        this.value = value;
    }

    /**
     * The ID of the option.
     */
    public int getId() {
        return id;
    }

    /**
     * The ID of the option.
     */
    public BundleOptionInput setId(int id) {
        this.id = id;
        return this;
    }

    /**
     * The number of the selected item to add to the cart.
     */
    public double getQuantity() {
        return quantity;
    }

    /**
     * The number of the selected item to add to the cart.
     */
    public BundleOptionInput setQuantity(double quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     * An array with the chosen value of the option.
     */
    public List<String> getValue() {
        return value;
    }

    /**
     * An array with the chosen value of the option.
     */
    public BundleOptionInput setValue(List<String> value) {
        this.value = value;
        return this;
    }

    /**
     * Set custom filter.
     */
    public BundleOptionInput setCustomFilter(String name, Serializable filterInput) {
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
        _queryBuilder.append("id:");
        _queryBuilder.append(id);

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("quantity:");
        _queryBuilder.append(quantity);

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("value:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (String item1 : value) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                AbstractQuery.appendQuotedString(_queryBuilder, item1.toString());
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append('}');
    }
}

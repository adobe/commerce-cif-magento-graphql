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

/**
 * Defines which products to remove from a compare list.
 */
public class RemoveProductsFromCompareListInput implements Serializable {
    private List<ID> products;

    private ID uid;

    private Map<String, Input<Serializable>> customFilters = new HashMap<>();

    public RemoveProductsFromCompareListInput(List<ID> products, ID uid) {
        this.products = products;

        this.uid = uid;
    }

    /**
     * An array of product IDs to remove from the compare list.
     */
    public List<ID> getProducts() {
        return products;
    }

    /**
     * An array of product IDs to remove from the compare list.
     */
    public RemoveProductsFromCompareListInput setProducts(List<ID> products) {
        this.products = products;
        return this;
    }

    /**
     * The unique identifier of the compare list to modify.
     */
    public ID getUid() {
        return uid;
    }

    /**
     * The unique identifier of the compare list to modify.
     */
    public RemoveProductsFromCompareListInput setUid(ID uid) {
        this.uid = uid;
        return this;
    }

    /**
     * Set custom filter.
     */
    public RemoveProductsFromCompareListInput setCustomFilter(String name, Serializable filterInput) {
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
        _queryBuilder.append("products:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (ID item1 : products) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                AbstractQuery.appendQuotedString(_queryBuilder, item1.toString());
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("uid:");
        AbstractQuery.appendQuotedString(_queryBuilder, uid.toString());

        _queryBuilder.append('}');
    }
}

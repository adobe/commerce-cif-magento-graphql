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

public class CreateWishlistInput implements Serializable {
    private String name;

    private WishlistVisibilityEnum visibility;

    private Map<String, Input<Serializable>> customFilters = new HashMap<>();

    public CreateWishlistInput(String name, WishlistVisibilityEnum visibility) {
        this.name = name;

        this.visibility = visibility;
    }

    /**
     * The name of the new wish list
     */
    public String getName() {
        return name;
    }

    /**
     * The name of the new wish list
     */
    public CreateWishlistInput setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Indicates whether the wish list is public or private
     */
    public WishlistVisibilityEnum getVisibility() {
        return visibility;
    }

    /**
     * Indicates whether the wish list is public or private
     */
    public CreateWishlistInput setVisibility(WishlistVisibilityEnum visibility) {
        this.visibility = visibility;
        return this;
    }

    /**
     * Set custom filter.
     */
    public CreateWishlistInput setCustomFilter(String name, Serializable filterInput) {
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
        _queryBuilder.append("name:");
        AbstractQuery.appendQuotedString(_queryBuilder, name.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("visibility:");
        _queryBuilder.append(visibility.toString());

        _queryBuilder.append('}');
    }
}

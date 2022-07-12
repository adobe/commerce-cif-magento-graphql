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
 * Defines the configurable products to add to the cart.
 */
public class AddConfigurableProductsToCartInput implements Serializable {
    private String cartId;

    private List<ConfigurableProductCartItemInput> cartItems;

    private Map<String, Input<Serializable>> customFilters = new HashMap<>();

    public AddConfigurableProductsToCartInput(String cartId, List<ConfigurableProductCartItemInput> cartItems) {
        this.cartId = cartId;

        this.cartItems = cartItems;
    }

    /**
     * The ID of the cart.
     */
    public String getCartId() {
        return cartId;
    }

    /**
     * The ID of the cart.
     */
    public AddConfigurableProductsToCartInput setCartId(String cartId) {
        this.cartId = cartId;
        return this;
    }

    /**
     * An array of configurable products to add.
     */
    public List<ConfigurableProductCartItemInput> getCartItems() {
        return cartItems;
    }

    /**
     * An array of configurable products to add.
     */
    public AddConfigurableProductsToCartInput setCartItems(List<ConfigurableProductCartItemInput> cartItems) {
        this.cartItems = cartItems;
        return this;
    }

    /**
     * Set custom filter.
     */
    public AddConfigurableProductsToCartInput setCustomFilter(String name, Serializable filterInput) {
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
        _queryBuilder.append("cart_id:");
        AbstractQuery.appendQuotedString(_queryBuilder, cartId.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("cart_items:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (ConfigurableProductCartItemInput item1 : cartItems) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                item1.appendTo(_queryBuilder);
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append('}');
    }
}

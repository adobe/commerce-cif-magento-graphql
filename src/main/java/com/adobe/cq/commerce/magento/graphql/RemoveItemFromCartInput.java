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
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Input;

/**
 * Specifies which items to remove from the cart.
 */
public class RemoveItemFromCartInput implements Serializable {
    private String cartId;

    private Input<Integer> cartItemId = Input.undefined();

    private Input<ID> cartItemUid = Input.undefined();

    private Map<String, Input<Serializable>> customFilters = new HashMap<>();

    public RemoveItemFromCartInput(String cartId) {
        this.cartId = cartId;
    }

    /**
     * The unique ID of a `Cart` object.
     */
    public String getCartId() {
        return cartId;
    }

    /**
     * The unique ID of a `Cart` object.
     */
    public RemoveItemFromCartInput setCartId(String cartId) {
        this.cartId = cartId;
        return this;
    }

    /**
     * Deprecated. Use `cart_item_uid` instead.
     */
    public Integer getCartItemId() {
        return cartItemId.getValue();
    }

    /**
     * Deprecated. Use `cart_item_uid` instead.
     */
    public Input<Integer> getCartItemIdInput() {
        return cartItemId;
    }

    /**
     * Deprecated. Use `cart_item_uid` instead.
     */
    public RemoveItemFromCartInput setCartItemId(Integer cartItemId) {
        this.cartItemId = Input.optional(cartItemId);
        return this;
    }

    /**
     * Deprecated. Use `cart_item_uid` instead.
     */
    public RemoveItemFromCartInput setCartItemIdInput(Input<Integer> cartItemId) {
        if (cartItemId == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.cartItemId = cartItemId;
        return this;
    }

    /**
     * Required field. The unique ID for a `CartItemInterface` object.
     */
    public ID getCartItemUid() {
        return cartItemUid.getValue();
    }

    /**
     * Required field. The unique ID for a `CartItemInterface` object.
     */
    public Input<ID> getCartItemUidInput() {
        return cartItemUid;
    }

    /**
     * Required field. The unique ID for a `CartItemInterface` object.
     */
    public RemoveItemFromCartInput setCartItemUid(ID cartItemUid) {
        this.cartItemUid = Input.optional(cartItemUid);
        return this;
    }

    /**
     * Required field. The unique ID for a `CartItemInterface` object.
     */
    public RemoveItemFromCartInput setCartItemUidInput(Input<ID> cartItemUid) {
        if (cartItemUid == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.cartItemUid = cartItemUid;
        return this;
    }

    /**
     * Set custom filter.
     */
    public RemoveItemFromCartInput setCustomFilter(String name, Serializable filterInput) {
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

        if (this.cartItemId.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("cart_item_id:");
            if (cartItemId.getValue() != null) {
                _queryBuilder.append(cartItemId.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.cartItemUid.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("cart_item_uid:");
            if (cartItemUid.getValue() != null) {
                AbstractQuery.appendQuotedString(_queryBuilder, cartItemUid.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}

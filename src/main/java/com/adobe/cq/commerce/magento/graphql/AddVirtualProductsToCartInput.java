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
import java.util.List;

import com.shopify.graphql.support.AbstractQuery;

/**
 * Defines the virtual products to add to the cart.
 */
public class AddVirtualProductsToCartInput implements Serializable {
    private String cartId;

    private List<VirtualProductCartItemInput> cartItems;

    public AddVirtualProductsToCartInput(String cartId, List<VirtualProductCartItemInput> cartItems) {
        this.cartId = cartId;

        this.cartItems = cartItems;
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
    public AddVirtualProductsToCartInput setCartId(String cartId) {
        this.cartId = cartId;
        return this;
    }

    /**
     * An array of virtual products to add.
     */
    public List<VirtualProductCartItemInput> getCartItems() {
        return cartItems;
    }

    /**
     * An array of virtual products to add.
     */
    public AddVirtualProductsToCartInput setCartItems(List<VirtualProductCartItemInput> cartItems) {
        this.cartItems = cartItems;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

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
            for (VirtualProductCartItemInput item1 : cartItems) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                item1.appendTo(_queryBuilder);
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append('}');
    }
}

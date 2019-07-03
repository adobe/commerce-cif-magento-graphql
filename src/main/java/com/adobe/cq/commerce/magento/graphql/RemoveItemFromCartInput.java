/*******************************************************************************
 *
 *    Copyright 2019 Adobe. All rights reserved.
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

import com.shopify.graphql.support.AbstractQuery;

public class RemoveItemFromCartInput implements Serializable {
    private String cartId;

    private int cartItemId;

    public RemoveItemFromCartInput(String cartId, int cartItemId) {
        this.cartId = cartId;

        this.cartItemId = cartItemId;
    }

    public String getCartId() {
        return cartId;
    }

    public RemoveItemFromCartInput setCartId(String cartId) {
        this.cartId = cartId;
        return this;
    }

    public int getCartItemId() {
        return cartItemId;
    }

    public RemoveItemFromCartInput setCartItemId(int cartItemId) {
        this.cartItemId = cartItemId;
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
        _queryBuilder.append("cart_item_id:");
        _queryBuilder.append(cartItemId);

        _queryBuilder.append('}');
    }
}

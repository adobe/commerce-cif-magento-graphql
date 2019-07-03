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

public class CartItemUpdateInput implements Serializable {
    private int cartItemId;

    private double quantity;

    public CartItemUpdateInput(int cartItemId, double quantity) {
        this.cartItemId = cartItemId;

        this.quantity = quantity;
    }

    public int getCartItemId() {
        return cartItemId;
    }

    public CartItemUpdateInput setCartItemId(int cartItemId) {
        this.cartItemId = cartItemId;
        return this;
    }

    public double getQuantity() {
        return quantity;
    }

    public CartItemUpdateInput setQuantity(double quantity) {
        this.quantity = quantity;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("cart_item_id:");
        _queryBuilder.append(cartItemId);

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("quantity:");
        _queryBuilder.append(quantity);

        _queryBuilder.append('}');
    }
}

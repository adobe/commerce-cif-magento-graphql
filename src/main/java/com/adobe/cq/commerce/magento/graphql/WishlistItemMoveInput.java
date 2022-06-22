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

import com.shopify.graphql.support.AbstractQuery;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Input;

/**
 * Specifies the IDs of the items to move and their quantities.
 */
public class WishlistItemMoveInput implements Serializable {
    private ID wishlistItemId;

    private Input<Double> quantity = Input.undefined();

    public WishlistItemMoveInput(ID wishlistItemId) {
        this.wishlistItemId = wishlistItemId;
    }

    /**
     * The unique ID of the `WishlistItemInterface` object to be moved.
     */
    public ID getWishlistItemId() {
        return wishlistItemId;
    }

    /**
     * The unique ID of the `WishlistItemInterface` object to be moved.
     */
    public WishlistItemMoveInput setWishlistItemId(ID wishlistItemId) {
        this.wishlistItemId = wishlistItemId;
        return this;
    }

    /**
     * The quantity of this item to move to the destination wish list. This value can&#39;t be greater than the
     * quantity in the source wish list.
     */
    public Double getQuantity() {
        return quantity.getValue();
    }

    /**
     * The quantity of this item to move to the destination wish list. This value can&#39;t be greater than the
     * quantity in the source wish list.
     */
    public Input<Double> getQuantityInput() {
        return quantity;
    }

    /**
     * The quantity of this item to move to the destination wish list. This value can&#39;t be greater than the
     * quantity in the source wish list.
     */
    public WishlistItemMoveInput setQuantity(Double quantity) {
        this.quantity = Input.optional(quantity);
        return this;
    }

    /**
     * The quantity of this item to move to the destination wish list. This value can&#39;t be greater than the
     * quantity in the source wish list.
     */
    public WishlistItemMoveInput setQuantityInput(Input<Double> quantity) {
        if (quantity == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.quantity = quantity;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("wishlist_item_id:");
        AbstractQuery.appendQuotedString(_queryBuilder, wishlistItemId.toString());

        if (this.quantity.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("quantity:");
            if (quantity.getValue() != null) {
                _queryBuilder.append(quantity.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}

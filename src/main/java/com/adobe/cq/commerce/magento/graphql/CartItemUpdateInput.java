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
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Input;

/**
 * A single item to be updated.
 */
public class CartItemUpdateInput implements Serializable {
    private Input<Integer> cartItemId = Input.undefined();

    private Input<ID> cartItemUid = Input.undefined();

    private Input<List<CustomizableOptionInput>> customizableOptions = Input.undefined();

    private Input<GiftMessageInput> giftMessage = Input.undefined();

    private Input<ID> giftWrappingId = Input.undefined();

    private Input<Double> quantity = Input.undefined();

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
    public CartItemUpdateInput setCartItemId(Integer cartItemId) {
        this.cartItemId = Input.optional(cartItemId);
        return this;
    }

    /**
     * Deprecated. Use `cart_item_uid` instead.
     */
    public CartItemUpdateInput setCartItemIdInput(Input<Integer> cartItemId) {
        if (cartItemId == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.cartItemId = cartItemId;
        return this;
    }

    /**
     * The unique ID for a `CartItemInterface` object.
     */
    public ID getCartItemUid() {
        return cartItemUid.getValue();
    }

    /**
     * The unique ID for a `CartItemInterface` object.
     */
    public Input<ID> getCartItemUidInput() {
        return cartItemUid;
    }

    /**
     * The unique ID for a `CartItemInterface` object.
     */
    public CartItemUpdateInput setCartItemUid(ID cartItemUid) {
        this.cartItemUid = Input.optional(cartItemUid);
        return this;
    }

    /**
     * The unique ID for a `CartItemInterface` object.
     */
    public CartItemUpdateInput setCartItemUidInput(Input<ID> cartItemUid) {
        if (cartItemUid == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.cartItemUid = cartItemUid;
        return this;
    }

    /**
     * An array that defines customizable options for the product.
     */
    public List<CustomizableOptionInput> getCustomizableOptions() {
        return customizableOptions.getValue();
    }

    /**
     * An array that defines customizable options for the product.
     */
    public Input<List<CustomizableOptionInput>> getCustomizableOptionsInput() {
        return customizableOptions;
    }

    /**
     * An array that defines customizable options for the product.
     */
    public CartItemUpdateInput setCustomizableOptions(List<CustomizableOptionInput> customizableOptions) {
        this.customizableOptions = Input.optional(customizableOptions);
        return this;
    }

    /**
     * An array that defines customizable options for the product.
     */
    public CartItemUpdateInput setCustomizableOptionsInput(Input<List<CustomizableOptionInput>> customizableOptions) {
        if (customizableOptions == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.customizableOptions = customizableOptions;
        return this;
    }

    /**
     * Gift message details for the cart item
     */
    public GiftMessageInput getGiftMessage() {
        return giftMessage.getValue();
    }

    /**
     * Gift message details for the cart item
     */
    public Input<GiftMessageInput> getGiftMessageInput() {
        return giftMessage;
    }

    /**
     * Gift message details for the cart item
     */
    public CartItemUpdateInput setGiftMessage(GiftMessageInput giftMessage) {
        this.giftMessage = Input.optional(giftMessage);
        return this;
    }

    /**
     * Gift message details for the cart item
     */
    public CartItemUpdateInput setGiftMessageInput(Input<GiftMessageInput> giftMessage) {
        if (giftMessage == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.giftMessage = giftMessage;
        return this;
    }

    /**
     * The unique ID for a `GiftWrapping` object to be used for the cart item.
     */
    public ID getGiftWrappingId() {
        return giftWrappingId.getValue();
    }

    /**
     * The unique ID for a `GiftWrapping` object to be used for the cart item.
     */
    public Input<ID> getGiftWrappingIdInput() {
        return giftWrappingId;
    }

    /**
     * The unique ID for a `GiftWrapping` object to be used for the cart item.
     */
    public CartItemUpdateInput setGiftWrappingId(ID giftWrappingId) {
        this.giftWrappingId = Input.optional(giftWrappingId);
        return this;
    }

    /**
     * The unique ID for a `GiftWrapping` object to be used for the cart item.
     */
    public CartItemUpdateInput setGiftWrappingIdInput(Input<ID> giftWrappingId) {
        if (giftWrappingId == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.giftWrappingId = giftWrappingId;
        return this;
    }

    /**
     * The new quantity of the item.
     */
    public Double getQuantity() {
        return quantity.getValue();
    }

    /**
     * The new quantity of the item.
     */
    public Input<Double> getQuantityInput() {
        return quantity;
    }

    /**
     * The new quantity of the item.
     */
    public CartItemUpdateInput setQuantity(Double quantity) {
        this.quantity = Input.optional(quantity);
        return this;
    }

    /**
     * The new quantity of the item.
     */
    public CartItemUpdateInput setQuantityInput(Input<Double> quantity) {
        if (quantity == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.quantity = quantity;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

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

        if (this.customizableOptions.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("customizable_options:");
            if (customizableOptions.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (CustomizableOptionInput item1 : customizableOptions.getValue()) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        item1.appendTo(_queryBuilder);
                    }
                }
                _queryBuilder.append(']');
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.giftMessage.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("gift_message:");
            if (giftMessage.getValue() != null) {
                giftMessage.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.giftWrappingId.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("gift_wrapping_id:");
            if (giftWrappingId.getValue() != null) {
                AbstractQuery.appendQuotedString(_queryBuilder, giftWrappingId.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

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

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

public class CartItemUpdateInput implements Serializable {
    private int cartItemId;

    private Input<List<CustomizableOptionInput>> customizableOptions = Input.undefined();

    private Input<GiftMessageInput> giftMessage = Input.undefined();

    private Input<ID> giftWrappingId = Input.undefined();

    private Input<Double> quantity = Input.undefined();

    public CartItemUpdateInput(int cartItemId) {
        this.cartItemId = cartItemId;
    }

    public int getCartItemId() {
        return cartItemId;
    }

    public CartItemUpdateInput setCartItemId(int cartItemId) {
        this.cartItemId = cartItemId;
        return this;
    }

    public List<CustomizableOptionInput> getCustomizableOptions() {
        return customizableOptions.getValue();
    }

    public Input<List<CustomizableOptionInput>> getCustomizableOptionsInput() {
        return customizableOptions;
    }

    public CartItemUpdateInput setCustomizableOptions(List<CustomizableOptionInput> customizableOptions) {
        this.customizableOptions = Input.optional(customizableOptions);
        return this;
    }

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
     * The unique identifier of the gift wrapping to be used for the cart item
     */
    public ID getGiftWrappingId() {
        return giftWrappingId.getValue();
    }

    /**
     * The unique identifier of the gift wrapping to be used for the cart item
     */
    public Input<ID> getGiftWrappingIdInput() {
        return giftWrappingId;
    }

    /**
     * The unique identifier of the gift wrapping to be used for the cart item
     */
    public CartItemUpdateInput setGiftWrappingId(ID giftWrappingId) {
        this.giftWrappingId = Input.optional(giftWrappingId);
        return this;
    }

    /**
     * The unique identifier of the gift wrapping to be used for the cart item
     */
    public CartItemUpdateInput setGiftWrappingIdInput(Input<ID> giftWrappingId) {
        if (giftWrappingId == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.giftWrappingId = giftWrappingId;
        return this;
    }

    public Double getQuantity() {
        return quantity.getValue();
    }

    public Input<Double> getQuantityInput() {
        return quantity;
    }

    public CartItemUpdateInput setQuantity(Double quantity) {
        this.quantity = Input.optional(quantity);
        return this;
    }

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

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("cart_item_id:");
        _queryBuilder.append(cartItemId);

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

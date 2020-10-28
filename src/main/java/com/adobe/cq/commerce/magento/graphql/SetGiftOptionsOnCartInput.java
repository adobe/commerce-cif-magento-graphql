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

public class SetGiftOptionsOnCartInput implements Serializable {
    private String cartId;

    private boolean giftReceiptIncluded;

    private boolean printedCardIncluded;

    private Input<GiftMessageInput> giftMessage = Input.undefined();

    private Input<ID> giftWrappingId = Input.undefined();

    public SetGiftOptionsOnCartInput(String cartId, boolean giftReceiptIncluded, boolean printedCardIncluded) {
        this.cartId = cartId;

        this.giftReceiptIncluded = giftReceiptIncluded;

        this.printedCardIncluded = printedCardIncluded;
    }

    /**
     * The unique ID that identifies the shopper&#39;s cart
     */
    public String getCartId() {
        return cartId;
    }

    /**
     * The unique ID that identifies the shopper&#39;s cart
     */
    public SetGiftOptionsOnCartInput setCartId(String cartId) {
        this.cartId = cartId;
        return this;
    }

    /**
     * Whether customer requested gift receipt for the cart
     */
    public boolean getGiftReceiptIncluded() {
        return giftReceiptIncluded;
    }

    /**
     * Whether customer requested gift receipt for the cart
     */
    public SetGiftOptionsOnCartInput setGiftReceiptIncluded(boolean giftReceiptIncluded) {
        this.giftReceiptIncluded = giftReceiptIncluded;
        return this;
    }

    /**
     * Whether customer requested printed card for the cart
     */
    public boolean getPrintedCardIncluded() {
        return printedCardIncluded;
    }

    /**
     * Whether customer requested printed card for the cart
     */
    public SetGiftOptionsOnCartInput setPrintedCardIncluded(boolean printedCardIncluded) {
        this.printedCardIncluded = printedCardIncluded;
        return this;
    }

    /**
     * Gift message details for the cart
     */
    public GiftMessageInput getGiftMessage() {
        return giftMessage.getValue();
    }

    /**
     * Gift message details for the cart
     */
    public Input<GiftMessageInput> getGiftMessageInput() {
        return giftMessage;
    }

    /**
     * Gift message details for the cart
     */
    public SetGiftOptionsOnCartInput setGiftMessage(GiftMessageInput giftMessage) {
        this.giftMessage = Input.optional(giftMessage);
        return this;
    }

    /**
     * Gift message details for the cart
     */
    public SetGiftOptionsOnCartInput setGiftMessageInput(Input<GiftMessageInput> giftMessage) {
        if (giftMessage == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.giftMessage = giftMessage;
        return this;
    }

    /**
     * The unique identifier of the gift wrapping to be used for the cart
     */
    public ID getGiftWrappingId() {
        return giftWrappingId.getValue();
    }

    /**
     * The unique identifier of the gift wrapping to be used for the cart
     */
    public Input<ID> getGiftWrappingIdInput() {
        return giftWrappingId;
    }

    /**
     * The unique identifier of the gift wrapping to be used for the cart
     */
    public SetGiftOptionsOnCartInput setGiftWrappingId(ID giftWrappingId) {
        this.giftWrappingId = Input.optional(giftWrappingId);
        return this;
    }

    /**
     * The unique identifier of the gift wrapping to be used for the cart
     */
    public SetGiftOptionsOnCartInput setGiftWrappingIdInput(Input<ID> giftWrappingId) {
        if (giftWrappingId == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.giftWrappingId = giftWrappingId;
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
        _queryBuilder.append("gift_receipt_included:");
        _queryBuilder.append(giftReceiptIncluded);

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("printed_card_included:");
        _queryBuilder.append(printedCardIncluded);

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

        _queryBuilder.append('}');
    }
}

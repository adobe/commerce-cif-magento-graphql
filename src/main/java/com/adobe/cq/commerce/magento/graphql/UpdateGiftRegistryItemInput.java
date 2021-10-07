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

public class UpdateGiftRegistryItemInput implements Serializable {
    private ID giftRegistryItemUid;

    private double quantity;

    private Input<String> note = Input.undefined();

    public UpdateGiftRegistryItemInput(ID giftRegistryItemUid, double quantity) {
        this.giftRegistryItemUid = giftRegistryItemUid;

        this.quantity = quantity;
    }

    /**
     * The unique ID of a `giftRegistryItem` object
     */
    public ID getGiftRegistryItemUid() {
        return giftRegistryItemUid;
    }

    /**
     * The unique ID of a `giftRegistryItem` object
     */
    public UpdateGiftRegistryItemInput setGiftRegistryItemUid(ID giftRegistryItemUid) {
        this.giftRegistryItemUid = giftRegistryItemUid;
        return this;
    }

    /**
     * The updated quantity of the gift registry item
     */
    public double getQuantity() {
        return quantity;
    }

    /**
     * The updated quantity of the gift registry item
     */
    public UpdateGiftRegistryItemInput setQuantity(double quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     * The updated description of the item
     */
    public String getNote() {
        return note.getValue();
    }

    /**
     * The updated description of the item
     */
    public Input<String> getNoteInput() {
        return note;
    }

    /**
     * The updated description of the item
     */
    public UpdateGiftRegistryItemInput setNote(String note) {
        this.note = Input.optional(note);
        return this;
    }

    /**
     * The updated description of the item
     */
    public UpdateGiftRegistryItemInput setNoteInput(Input<String> note) {
        if (note == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.note = note;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("gift_registry_item_uid:");
        AbstractQuery.appendQuotedString(_queryBuilder, giftRegistryItemUid.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("quantity:");
        _queryBuilder.append(quantity);

        if (this.note.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("note:");
            if (note.getValue() != null) {
                AbstractQuery.appendQuotedString(_queryBuilder, note.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}

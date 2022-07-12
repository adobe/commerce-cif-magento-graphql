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
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Input;

/**
 * Defines updates to items in a wish list.
 */
public class WishlistItemUpdateInput implements Serializable {
    private ID wishlistItemId;

    private Input<String> description = Input.undefined();

    private Input<List<EnteredOptionInput>> enteredOptions = Input.undefined();

    private Input<Double> quantity = Input.undefined();

    private Input<List<ID>> selectedOptions = Input.undefined();

    private Map<String, Input<Serializable>> customFilters = new HashMap<>();

    public WishlistItemUpdateInput(ID wishlistItemId) {
        this.wishlistItemId = wishlistItemId;
    }

    /**
     * The unique ID for a `WishlistItemInterface` object.
     */
    public ID getWishlistItemId() {
        return wishlistItemId;
    }

    /**
     * The unique ID for a `WishlistItemInterface` object.
     */
    public WishlistItemUpdateInput setWishlistItemId(ID wishlistItemId) {
        this.wishlistItemId = wishlistItemId;
        return this;
    }

    /**
     * Customer-entered comments about the item.
     */
    public String getDescription() {
        return description.getValue();
    }

    /**
     * Customer-entered comments about the item.
     */
    public Input<String> getDescriptionInput() {
        return description;
    }

    /**
     * Customer-entered comments about the item.
     */
    public WishlistItemUpdateInput setDescription(String description) {
        this.description = Input.optional(description);
        return this;
    }

    /**
     * Customer-entered comments about the item.
     */
    public WishlistItemUpdateInput setDescriptionInput(Input<String> description) {
        if (description == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.description = description;
        return this;
    }

    /**
     * An array of options that the customer entered.
     */
    public List<EnteredOptionInput> getEnteredOptions() {
        return enteredOptions.getValue();
    }

    /**
     * An array of options that the customer entered.
     */
    public Input<List<EnteredOptionInput>> getEnteredOptionsInput() {
        return enteredOptions;
    }

    /**
     * An array of options that the customer entered.
     */
    public WishlistItemUpdateInput setEnteredOptions(List<EnteredOptionInput> enteredOptions) {
        this.enteredOptions = Input.optional(enteredOptions);
        return this;
    }

    /**
     * An array of options that the customer entered.
     */
    public WishlistItemUpdateInput setEnteredOptionsInput(Input<List<EnteredOptionInput>> enteredOptions) {
        if (enteredOptions == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.enteredOptions = enteredOptions;
        return this;
    }

    /**
     * The new amount or number of this item.
     */
    public Double getQuantity() {
        return quantity.getValue();
    }

    /**
     * The new amount or number of this item.
     */
    public Input<Double> getQuantityInput() {
        return quantity;
    }

    /**
     * The new amount or number of this item.
     */
    public WishlistItemUpdateInput setQuantity(Double quantity) {
        this.quantity = Input.optional(quantity);
        return this;
    }

    /**
     * The new amount or number of this item.
     */
    public WishlistItemUpdateInput setQuantityInput(Input<Double> quantity) {
        if (quantity == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.quantity = quantity;
        return this;
    }

    /**
     * An array of strings corresponding to options the customer selected.
     */
    public List<ID> getSelectedOptions() {
        return selectedOptions.getValue();
    }

    /**
     * An array of strings corresponding to options the customer selected.
     */
    public Input<List<ID>> getSelectedOptionsInput() {
        return selectedOptions;
    }

    /**
     * An array of strings corresponding to options the customer selected.
     */
    public WishlistItemUpdateInput setSelectedOptions(List<ID> selectedOptions) {
        this.selectedOptions = Input.optional(selectedOptions);
        return this;
    }

    /**
     * An array of strings corresponding to options the customer selected.
     */
    public WishlistItemUpdateInput setSelectedOptionsInput(Input<List<ID>> selectedOptions) {
        if (selectedOptions == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.selectedOptions = selectedOptions;
        return this;
    }

    /**
     * Set custom filter.
     */
    public WishlistItemUpdateInput setCustomFilter(String name, Serializable filterInput) {
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
        _queryBuilder.append("wishlist_item_id:");
        AbstractQuery.appendQuotedString(_queryBuilder, wishlistItemId.toString());

        if (this.description.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("description:");
            if (description.getValue() != null) {
                AbstractQuery.appendQuotedString(_queryBuilder, description.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.enteredOptions.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("entered_options:");
            if (enteredOptions.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (EnteredOptionInput item1 : enteredOptions.getValue()) {
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

        if (this.selectedOptions.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("selected_options:");
            if (selectedOptions.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (ID item1 : selectedOptions.getValue()) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        AbstractQuery.appendQuotedString(_queryBuilder, item1.toString());
                    }
                }
                _queryBuilder.append(']');
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}

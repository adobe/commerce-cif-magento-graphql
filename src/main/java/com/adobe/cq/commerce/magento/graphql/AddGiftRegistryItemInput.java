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
import com.shopify.graphql.support.Input;

public class AddGiftRegistryItemInput implements Serializable {
    private double quantity;

    private String sku;

    private Input<List<EnteredOptionInput>> enteredOptions = Input.undefined();

    private Input<String> note = Input.undefined();

    private Input<String> parentSku = Input.undefined();

    private Input<List<String>> selectedOptions = Input.undefined();

    private Map<String, Input<Serializable>> customFilters = new HashMap<>();

    public AddGiftRegistryItemInput(double quantity, String sku) {
        this.quantity = quantity;

        this.sku = sku;
    }

    /**
     * The quantity of the product to add
     */
    public double getQuantity() {
        return quantity;
    }

    /**
     * The quantity of the product to add
     */
    public AddGiftRegistryItemInput setQuantity(double quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     * The SKU of the product to add to the gift registry
     */
    public String getSku() {
        return sku;
    }

    /**
     * The SKU of the product to add to the gift registry
     */
    public AddGiftRegistryItemInput setSku(String sku) {
        this.sku = sku;
        return this;
    }

    /**
     * An array of options the customer has entered
     */
    public List<EnteredOptionInput> getEnteredOptions() {
        return enteredOptions.getValue();
    }

    /**
     * An array of options the customer has entered
     */
    public Input<List<EnteredOptionInput>> getEnteredOptionsInput() {
        return enteredOptions;
    }

    /**
     * An array of options the customer has entered
     */
    public AddGiftRegistryItemInput setEnteredOptions(List<EnteredOptionInput> enteredOptions) {
        this.enteredOptions = Input.optional(enteredOptions);
        return this;
    }

    /**
     * An array of options the customer has entered
     */
    public AddGiftRegistryItemInput setEnteredOptionsInput(Input<List<EnteredOptionInput>> enteredOptions) {
        if (enteredOptions == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.enteredOptions = enteredOptions;
        return this;
    }

    /**
     * A brief note about the item
     */
    public String getNote() {
        return note.getValue();
    }

    /**
     * A brief note about the item
     */
    public Input<String> getNoteInput() {
        return note;
    }

    /**
     * A brief note about the item
     */
    public AddGiftRegistryItemInput setNote(String note) {
        this.note = Input.optional(note);
        return this;
    }

    /**
     * A brief note about the item
     */
    public AddGiftRegistryItemInput setNoteInput(Input<String> note) {
        if (note == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.note = note;
        return this;
    }

    /**
     * For complex product types, the SKU of the parent product
     */
    public String getParentSku() {
        return parentSku.getValue();
    }

    /**
     * For complex product types, the SKU of the parent product
     */
    public Input<String> getParentSkuInput() {
        return parentSku;
    }

    /**
     * For complex product types, the SKU of the parent product
     */
    public AddGiftRegistryItemInput setParentSku(String parentSku) {
        this.parentSku = Input.optional(parentSku);
        return this;
    }

    /**
     * For complex product types, the SKU of the parent product
     */
    public AddGiftRegistryItemInput setParentSkuInput(Input<String> parentSku) {
        if (parentSku == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.parentSku = parentSku;
        return this;
    }

    /**
     * An array of strings corresponding to options the customer has selected
     */
    public List<String> getSelectedOptions() {
        return selectedOptions.getValue();
    }

    /**
     * An array of strings corresponding to options the customer has selected
     */
    public Input<List<String>> getSelectedOptionsInput() {
        return selectedOptions;
    }

    /**
     * An array of strings corresponding to options the customer has selected
     */
    public AddGiftRegistryItemInput setSelectedOptions(List<String> selectedOptions) {
        this.selectedOptions = Input.optional(selectedOptions);
        return this;
    }

    /**
     * An array of strings corresponding to options the customer has selected
     */
    public AddGiftRegistryItemInput setSelectedOptionsInput(Input<List<String>> selectedOptions) {
        if (selectedOptions == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.selectedOptions = selectedOptions;
        return this;
    }

    /**
     * Set custom filter.
     */
    public AddGiftRegistryItemInput setCustomFilter(String name, Serializable filterInput) {
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
        _queryBuilder.append("quantity:");
        _queryBuilder.append(quantity);

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("sku:");
        AbstractQuery.appendQuotedString(_queryBuilder, sku.toString());

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

        if (this.parentSku.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("parent_sku:");
            if (parentSku.getValue() != null) {
                AbstractQuery.appendQuotedString(_queryBuilder, parentSku.getValue().toString());
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
                    for (String item1 : selectedOptions.getValue()) {
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

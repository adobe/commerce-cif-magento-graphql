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
 * Defines which items in a requisition list to update.
 */
public class UpdateRequisitionListItemsInput implements Serializable {
    private ID itemId;

    private Input<List<EnteredOptionInput>> enteredOptions = Input.undefined();

    private Input<Double> quantity = Input.undefined();

    private Input<List<String>> selectedOptions = Input.undefined();

    public UpdateRequisitionListItemsInput(ID itemId) {
        this.itemId = itemId;
    }

    /**
     * The ID of the requisition list item to update.
     */
    public ID getItemId() {
        return itemId;
    }

    /**
     * The ID of the requisition list item to update.
     */
    public UpdateRequisitionListItemsInput setItemId(ID itemId) {
        this.itemId = itemId;
        return this;
    }

    /**
     * An array of customer-entered options.
     */
    public List<EnteredOptionInput> getEnteredOptions() {
        return enteredOptions.getValue();
    }

    /**
     * An array of customer-entered options.
     */
    public Input<List<EnteredOptionInput>> getEnteredOptionsInput() {
        return enteredOptions;
    }

    /**
     * An array of customer-entered options.
     */
    public UpdateRequisitionListItemsInput setEnteredOptions(List<EnteredOptionInput> enteredOptions) {
        this.enteredOptions = Input.optional(enteredOptions);
        return this;
    }

    /**
     * An array of customer-entered options.
     */
    public UpdateRequisitionListItemsInput setEnteredOptionsInput(Input<List<EnteredOptionInput>> enteredOptions) {
        if (enteredOptions == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.enteredOptions = enteredOptions;
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
    public UpdateRequisitionListItemsInput setQuantity(Double quantity) {
        this.quantity = Input.optional(quantity);
        return this;
    }

    /**
     * The new quantity of the item.
     */
    public UpdateRequisitionListItemsInput setQuantityInput(Input<Double> quantity) {
        if (quantity == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.quantity = quantity;
        return this;
    }

    /**
     * An array of selected option IDs.
     */
    public List<String> getSelectedOptions() {
        return selectedOptions.getValue();
    }

    /**
     * An array of selected option IDs.
     */
    public Input<List<String>> getSelectedOptionsInput() {
        return selectedOptions;
    }

    /**
     * An array of selected option IDs.
     */
    public UpdateRequisitionListItemsInput setSelectedOptions(List<String> selectedOptions) {
        this.selectedOptions = Input.optional(selectedOptions);
        return this;
    }

    /**
     * An array of selected option IDs.
     */
    public UpdateRequisitionListItemsInput setSelectedOptionsInput(Input<List<String>> selectedOptions) {
        if (selectedOptions == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.selectedOptions = selectedOptions;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("item_id:");
        AbstractQuery.appendQuotedString(_queryBuilder, itemId.toString());

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

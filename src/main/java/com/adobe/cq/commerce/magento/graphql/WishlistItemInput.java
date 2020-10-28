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
 * Defines the items to add to a wish list
 */
public class WishlistItemInput implements Serializable {
    private double quantity;

    private String sku;

    private Input<List<EnteredOptionInput>> enteredOptions = Input.undefined();

    private Input<String> parentSku = Input.undefined();

    private Input<List<ID>> selectedOptions = Input.undefined();

    public WishlistItemInput(double quantity, String sku) {
        this.quantity = quantity;

        this.sku = sku;
    }

    /**
     * The amount or number of items to add
     */
    public double getQuantity() {
        return quantity;
    }

    /**
     * The amount or number of items to add
     */
    public WishlistItemInput setQuantity(double quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     * The SKU of the product to add. For complex product types, specify the child product SKU
     */
    public String getSku() {
        return sku;
    }

    /**
     * The SKU of the product to add. For complex product types, specify the child product SKU
     */
    public WishlistItemInput setSku(String sku) {
        this.sku = sku;
        return this;
    }

    /**
     * An array of options that the customer entered
     */
    public List<EnteredOptionInput> getEnteredOptions() {
        return enteredOptions.getValue();
    }

    /**
     * An array of options that the customer entered
     */
    public Input<List<EnteredOptionInput>> getEnteredOptionsInput() {
        return enteredOptions;
    }

    /**
     * An array of options that the customer entered
     */
    public WishlistItemInput setEnteredOptions(List<EnteredOptionInput> enteredOptions) {
        this.enteredOptions = Input.optional(enteredOptions);
        return this;
    }

    /**
     * An array of options that the customer entered
     */
    public WishlistItemInput setEnteredOptionsInput(Input<List<EnteredOptionInput>> enteredOptions) {
        if (enteredOptions == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.enteredOptions = enteredOptions;
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
    public WishlistItemInput setParentSku(String parentSku) {
        this.parentSku = Input.optional(parentSku);
        return this;
    }

    /**
     * For complex product types, the SKU of the parent product
     */
    public WishlistItemInput setParentSkuInput(Input<String> parentSku) {
        if (parentSku == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.parentSku = parentSku;
        return this;
    }

    /**
     * An array of strings corresponding to options the customer selected
     */
    public List<ID> getSelectedOptions() {
        return selectedOptions.getValue();
    }

    /**
     * An array of strings corresponding to options the customer selected
     */
    public Input<List<ID>> getSelectedOptionsInput() {
        return selectedOptions;
    }

    /**
     * An array of strings corresponding to options the customer selected
     */
    public WishlistItemInput setSelectedOptions(List<ID> selectedOptions) {
        this.selectedOptions = Input.optional(selectedOptions);
        return this;
    }

    /**
     * An array of strings corresponding to options the customer selected
     */
    public WishlistItemInput setSelectedOptionsInput(Input<List<ID>> selectedOptions) {
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

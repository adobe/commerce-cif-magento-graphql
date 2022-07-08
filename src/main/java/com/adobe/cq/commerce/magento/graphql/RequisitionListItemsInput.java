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

/**
 * Defines the items to add.
 */
public class RequisitionListItemsInput implements Serializable {
    private String sku;

    private Input<List<EnteredOptionInput>> enteredOptions = Input.undefined();

    private Input<String> parentSku = Input.undefined();

    private Input<Double> quantity = Input.undefined();

    private Input<List<String>> selectedOptions = Input.undefined();

    private Map<String, Input<Serializable>> customFilters = new HashMap<>();

    public RequisitionListItemsInput(String sku) {
        this.sku = sku;
    }

    /**
     * The product SKU.
     */
    public String getSku() {
        return sku;
    }

    /**
     * The product SKU.
     */
    public RequisitionListItemsInput setSku(String sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Entered option IDs.
     */
    public List<EnteredOptionInput> getEnteredOptions() {
        return enteredOptions.getValue();
    }

    /**
     * Entered option IDs.
     */
    public Input<List<EnteredOptionInput>> getEnteredOptionsInput() {
        return enteredOptions;
    }

    /**
     * Entered option IDs.
     */
    public RequisitionListItemsInput setEnteredOptions(List<EnteredOptionInput> enteredOptions) {
        this.enteredOptions = Input.optional(enteredOptions);
        return this;
    }

    /**
     * Entered option IDs.
     */
    public RequisitionListItemsInput setEnteredOptionsInput(Input<List<EnteredOptionInput>> enteredOptions) {
        if (enteredOptions == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.enteredOptions = enteredOptions;
        return this;
    }

    /**
     * For configurable products, the SKU of the parent product.
     */
    public String getParentSku() {
        return parentSku.getValue();
    }

    /**
     * For configurable products, the SKU of the parent product.
     */
    public Input<String> getParentSkuInput() {
        return parentSku;
    }

    /**
     * For configurable products, the SKU of the parent product.
     */
    public RequisitionListItemsInput setParentSku(String parentSku) {
        this.parentSku = Input.optional(parentSku);
        return this;
    }

    /**
     * For configurable products, the SKU of the parent product.
     */
    public RequisitionListItemsInput setParentSkuInput(Input<String> parentSku) {
        if (parentSku == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.parentSku = parentSku;
        return this;
    }

    /**
     * The quantity of the product to add.
     */
    public Double getQuantity() {
        return quantity.getValue();
    }

    /**
     * The quantity of the product to add.
     */
    public Input<Double> getQuantityInput() {
        return quantity;
    }

    /**
     * The quantity of the product to add.
     */
    public RequisitionListItemsInput setQuantity(Double quantity) {
        this.quantity = Input.optional(quantity);
        return this;
    }

    /**
     * The quantity of the product to add.
     */
    public RequisitionListItemsInput setQuantityInput(Input<Double> quantity) {
        if (quantity == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.quantity = quantity;
        return this;
    }

    /**
     * Selected option IDs.
     */
    public List<String> getSelectedOptions() {
        return selectedOptions.getValue();
    }

    /**
     * Selected option IDs.
     */
    public Input<List<String>> getSelectedOptionsInput() {
        return selectedOptions;
    }

    /**
     * Selected option IDs.
     */
    public RequisitionListItemsInput setSelectedOptions(List<String> selectedOptions) {
        this.selectedOptions = Input.optional(selectedOptions);
        return this;
    }

    /**
     * Selected option IDs.
     */
    public RequisitionListItemsInput setSelectedOptionsInput(Input<List<String>> selectedOptions) {
        if (selectedOptions == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.selectedOptions = selectedOptions;
        return this;
    }

    /**
     * Set custom filter.
     */
    public RequisitionListItemsInput setCustomFilter(String name, Serializable filterInput) {
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

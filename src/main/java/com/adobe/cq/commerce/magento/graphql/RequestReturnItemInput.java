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

public class RequestReturnItemInput implements Serializable {
    private ID orderItemUid;

    private double quantityToReturn;

    private Input<List<EnteredCustomAttributeInput>> enteredCustomAttributes = Input.undefined();

    private Input<List<SelectedCustomAttributeInput>> selectedCustomAttributes = Input.undefined();

    private Map<String, Input<Serializable>> customFilters = new HashMap<>();

    public RequestReturnItemInput(ID orderItemUid, double quantityToReturn) {
        this.orderItemUid = orderItemUid;

        this.quantityToReturn = quantityToReturn;
    }

    /**
     * The unique ID for a `OrderItemInterface` object
     */
    public ID getOrderItemUid() {
        return orderItemUid;
    }

    /**
     * The unique ID for a `OrderItemInterface` object
     */
    public RequestReturnItemInput setOrderItemUid(ID orderItemUid) {
        this.orderItemUid = orderItemUid;
        return this;
    }

    /**
     * The quantity of the item to be returned
     */
    public double getQuantityToReturn() {
        return quantityToReturn;
    }

    /**
     * The quantity of the item to be returned
     */
    public RequestReturnItemInput setQuantityToReturn(double quantityToReturn) {
        this.quantityToReturn = quantityToReturn;
        return this;
    }

    /**
     * Contains details about a custom attribute that was entered, such as text or a file
     */
    public List<EnteredCustomAttributeInput> getEnteredCustomAttributes() {
        return enteredCustomAttributes.getValue();
    }

    /**
     * Contains details about a custom attribute that was entered, such as text or a file
     */
    public Input<List<EnteredCustomAttributeInput>> getEnteredCustomAttributesInput() {
        return enteredCustomAttributes;
    }

    /**
     * Contains details about a custom attribute that was entered, such as text or a file
     */
    public RequestReturnItemInput setEnteredCustomAttributes(List<EnteredCustomAttributeInput> enteredCustomAttributes) {
        this.enteredCustomAttributes = Input.optional(enteredCustomAttributes);
        return this;
    }

    /**
     * Contains details about a custom attribute that was entered, such as text or a file
     */
    public RequestReturnItemInput setEnteredCustomAttributesInput(Input<List<EnteredCustomAttributeInput>> enteredCustomAttributes) {
        if (enteredCustomAttributes == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.enteredCustomAttributes = enteredCustomAttributes;
        return this;
    }

    /**
     * An array of selected custom option IDs associated with the item to be returned. For example, the IDs
     * for the selected color and size of a configurable product
     */
    public List<SelectedCustomAttributeInput> getSelectedCustomAttributes() {
        return selectedCustomAttributes.getValue();
    }

    /**
     * An array of selected custom option IDs associated with the item to be returned. For example, the IDs
     * for the selected color and size of a configurable product
     */
    public Input<List<SelectedCustomAttributeInput>> getSelectedCustomAttributesInput() {
        return selectedCustomAttributes;
    }

    /**
     * An array of selected custom option IDs associated with the item to be returned. For example, the IDs
     * for the selected color and size of a configurable product
     */
    public RequestReturnItemInput setSelectedCustomAttributes(List<SelectedCustomAttributeInput> selectedCustomAttributes) {
        this.selectedCustomAttributes = Input.optional(selectedCustomAttributes);
        return this;
    }

    /**
     * An array of selected custom option IDs associated with the item to be returned. For example, the IDs
     * for the selected color and size of a configurable product
     */
    public RequestReturnItemInput setSelectedCustomAttributesInput(Input<List<SelectedCustomAttributeInput>> selectedCustomAttributes) {
        if (selectedCustomAttributes == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.selectedCustomAttributes = selectedCustomAttributes;
        return this;
    }

    /**
     * Set custom filter.
     */
    public RequestReturnItemInput setCustomFilter(String name, Serializable filterInput) {
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
        _queryBuilder.append("order_item_uid:");
        AbstractQuery.appendQuotedString(_queryBuilder, orderItemUid.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("quantity_to_return:");
        _queryBuilder.append(quantityToReturn);

        if (this.enteredCustomAttributes.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("entered_custom_attributes:");
            if (enteredCustomAttributes.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (EnteredCustomAttributeInput item1 : enteredCustomAttributes.getValue()) {
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

        if (this.selectedCustomAttributes.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("selected_custom_attributes:");
            if (selectedCustomAttributes.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (SelectedCustomAttributeInput item1 : selectedCustomAttributes.getValue()) {
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

        _queryBuilder.append('}');
    }
}

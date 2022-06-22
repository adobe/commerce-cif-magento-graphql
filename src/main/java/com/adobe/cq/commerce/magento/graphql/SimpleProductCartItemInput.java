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

import com.shopify.graphql.support.Input;

/**
 * Defines a single product to add to the cart.
 */
public class SimpleProductCartItemInput implements Serializable {
    private CartItemInput data;

    private Input<List<CustomizableOptionInput>> customizableOptions = Input.undefined();

    public SimpleProductCartItemInput(CartItemInput data) {
        this.data = data;
    }

    /**
     * An object containing the `sku`, `quantity`, and other relevant information about the product.
     */
    public CartItemInput getData() {
        return data;
    }

    /**
     * An object containing the `sku`, `quantity`, and other relevant information about the product.
     */
    public SimpleProductCartItemInput setData(CartItemInput data) {
        this.data = data;
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
    public SimpleProductCartItemInput setCustomizableOptions(List<CustomizableOptionInput> customizableOptions) {
        this.customizableOptions = Input.optional(customizableOptions);
        return this;
    }

    /**
     * An array that defines customizable options for the product.
     */
    public SimpleProductCartItemInput setCustomizableOptionsInput(Input<List<CustomizableOptionInput>> customizableOptions) {
        if (customizableOptions == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.customizableOptions = customizableOptions;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("data:");
        data.appendTo(_queryBuilder);

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

        _queryBuilder.append('}');
    }
}

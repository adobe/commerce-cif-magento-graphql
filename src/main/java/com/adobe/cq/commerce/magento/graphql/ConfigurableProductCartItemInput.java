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

public class ConfigurableProductCartItemInput implements Serializable {
    private CartItemInput data;

    private Input<List<CustomizableOptionInput>> customizableOptions = Input.undefined();

    private Input<String> parentSku = Input.undefined();

    private Input<String> variantSku = Input.undefined();

    private Map<String, Input<Serializable>> customFilters = new HashMap<>();

    public ConfigurableProductCartItemInput(CartItemInput data) {
        this.data = data;
    }

    /**
     * The quantity and SKU of the configurable product.
     */
    public CartItemInput getData() {
        return data;
    }

    /**
     * The quantity and SKU of the configurable product.
     */
    public ConfigurableProductCartItemInput setData(CartItemInput data) {
        this.data = data;
        return this;
    }

    /**
     * The ID and value of the option.
     */
    public List<CustomizableOptionInput> getCustomizableOptions() {
        return customizableOptions.getValue();
    }

    /**
     * The ID and value of the option.
     */
    public Input<List<CustomizableOptionInput>> getCustomizableOptionsInput() {
        return customizableOptions;
    }

    /**
     * The ID and value of the option.
     */
    public ConfigurableProductCartItemInput setCustomizableOptions(List<CustomizableOptionInput> customizableOptions) {
        this.customizableOptions = Input.optional(customizableOptions);
        return this;
    }

    /**
     * The ID and value of the option.
     */
    public ConfigurableProductCartItemInput setCustomizableOptionsInput(Input<List<CustomizableOptionInput>> customizableOptions) {
        if (customizableOptions == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.customizableOptions = customizableOptions;
        return this;
    }

    /**
     * The SKU of the parent configurable product.
     */
    public String getParentSku() {
        return parentSku.getValue();
    }

    /**
     * The SKU of the parent configurable product.
     */
    public Input<String> getParentSkuInput() {
        return parentSku;
    }

    /**
     * The SKU of the parent configurable product.
     */
    public ConfigurableProductCartItemInput setParentSku(String parentSku) {
        this.parentSku = Input.optional(parentSku);
        return this;
    }

    /**
     * The SKU of the parent configurable product.
     */
    public ConfigurableProductCartItemInput setParentSkuInput(Input<String> parentSku) {
        if (parentSku == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.parentSku = parentSku;
        return this;
    }

    /**
     * Deprecated. Use `CartItemInput.sku` instead.
     */
    public String getVariantSku() {
        return variantSku.getValue();
    }

    /**
     * Deprecated. Use `CartItemInput.sku` instead.
     */
    public Input<String> getVariantSkuInput() {
        return variantSku;
    }

    /**
     * Deprecated. Use `CartItemInput.sku` instead.
     */
    public ConfigurableProductCartItemInput setVariantSku(String variantSku) {
        this.variantSku = Input.optional(variantSku);
        return this;
    }

    /**
     * Deprecated. Use `CartItemInput.sku` instead.
     */
    public ConfigurableProductCartItemInput setVariantSkuInput(Input<String> variantSku) {
        if (variantSku == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.variantSku = variantSku;
        return this;
    }

    /**
     * Set custom filter.
     */
    public ConfigurableProductCartItemInput setCustomFilter(String name, Serializable filterInput) {
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

        if (this.variantSku.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("variant_sku:");
            if (variantSku.getValue() != null) {
                AbstractQuery.appendQuotedString(_queryBuilder, variantSku.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}

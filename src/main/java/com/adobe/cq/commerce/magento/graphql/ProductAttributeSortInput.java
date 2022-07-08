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
import java.util.Map;

import com.shopify.graphql.support.Input;

/**
 * Specifies the attribute to use for sorting search results and indicates whether the results are
 * sorted in ascending or descending order. It&#39;s possible to sort products using searchable attributes
 * with enabled &#39;Use in Filter Options&#39; option
 */
public class ProductAttributeSortInput implements Serializable {
    private Input<SortEnum> name = Input.undefined();

    private Input<SortEnum> position = Input.undefined();

    private Input<SortEnum> price = Input.undefined();

    private Input<SortEnum> relevance = Input.undefined();

    private Map<String, Input<Serializable>> customFilters = new HashMap<>();

    /**
     * Attribute label: Product Name
     */
    public SortEnum getName() {
        return name.getValue();
    }

    /**
     * Attribute label: Product Name
     */
    public Input<SortEnum> getNameInput() {
        return name;
    }

    /**
     * Attribute label: Product Name
     */
    public ProductAttributeSortInput setName(SortEnum name) {
        this.name = Input.optional(name);
        return this;
    }

    /**
     * Attribute label: Product Name
     */
    public ProductAttributeSortInput setNameInput(Input<SortEnum> name) {
        if (name == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.name = name;
        return this;
    }

    /**
     * Sort by the position assigned to each product.
     */
    public SortEnum getPosition() {
        return position.getValue();
    }

    /**
     * Sort by the position assigned to each product.
     */
    public Input<SortEnum> getPositionInput() {
        return position;
    }

    /**
     * Sort by the position assigned to each product.
     */
    public ProductAttributeSortInput setPosition(SortEnum position) {
        this.position = Input.optional(position);
        return this;
    }

    /**
     * Sort by the position assigned to each product.
     */
    public ProductAttributeSortInput setPositionInput(Input<SortEnum> position) {
        if (position == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.position = position;
        return this;
    }

    /**
     * Attribute label: Price
     */
    public SortEnum getPrice() {
        return price.getValue();
    }

    /**
     * Attribute label: Price
     */
    public Input<SortEnum> getPriceInput() {
        return price;
    }

    /**
     * Attribute label: Price
     */
    public ProductAttributeSortInput setPrice(SortEnum price) {
        this.price = Input.optional(price);
        return this;
    }

    /**
     * Attribute label: Price
     */
    public ProductAttributeSortInput setPriceInput(Input<SortEnum> price) {
        if (price == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.price = price;
        return this;
    }

    /**
     * Sort by the search relevance score (default).
     */
    public SortEnum getRelevance() {
        return relevance.getValue();
    }

    /**
     * Sort by the search relevance score (default).
     */
    public Input<SortEnum> getRelevanceInput() {
        return relevance;
    }

    /**
     * Sort by the search relevance score (default).
     */
    public ProductAttributeSortInput setRelevance(SortEnum relevance) {
        this.relevance = Input.optional(relevance);
        return this;
    }

    /**
     * Sort by the search relevance score (default).
     */
    public ProductAttributeSortInput setRelevanceInput(Input<SortEnum> relevance) {
        if (relevance == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.relevance = relevance;
        return this;
    }

    /**
     * Set custom filter.
     */
    public ProductAttributeSortInput setCustomFilter(String name, Serializable filterInput) {
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

        if (this.name.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("name:");
            if (name.getValue() != null) {
                _queryBuilder.append(name.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.position.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("position:");
            if (position.getValue() != null) {
                _queryBuilder.append(position.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.price.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("price:");
            if (price.getValue() != null) {
                _queryBuilder.append(price.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.relevance.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("relevance:");
            if (relevance.getValue() != null) {
                _queryBuilder.append(relevance.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}

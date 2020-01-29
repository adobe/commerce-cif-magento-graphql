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

import com.shopify.graphql.support.Input;

/**
 * ProductAttributeFilterInput defines the filters to be used in the search. A filter contains at least
 * one attribute, a comparison operator, and the value that is being searched for.
 */
public class ProductAttributeFilterInput implements Serializable {
    private Input<FilterEqualTypeInput> categoryId = Input.undefined();

    private Input<FilterMatchTypeInput> description = Input.undefined();

    private Input<FilterMatchTypeInput> name = Input.undefined();

    private Input<FilterRangeTypeInput> price = Input.undefined();

    private Input<FilterMatchTypeInput> shortDescription = Input.undefined();

    private Input<FilterEqualTypeInput> sku = Input.undefined();

    private Input<FilterEqualTypeInput> urlKey = Input.undefined();

    /**
     * Filter product by category id
     */
    public FilterEqualTypeInput getCategoryId() {
        return categoryId.getValue();
    }

    /**
     * Filter product by category id
     */
    public Input<FilterEqualTypeInput> getCategoryIdInput() {
        return categoryId;
    }

    /**
     * Filter product by category id
     */
    public ProductAttributeFilterInput setCategoryId(FilterEqualTypeInput categoryId) {
        this.categoryId = Input.optional(categoryId);
        return this;
    }

    /**
     * Filter product by category id
     */
    public ProductAttributeFilterInput setCategoryIdInput(Input<FilterEqualTypeInput> categoryId) {
        if (categoryId == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.categoryId = categoryId;
        return this;
    }

    /**
     * Attribute label: Description
     */
    public FilterMatchTypeInput getDescription() {
        return description.getValue();
    }

    /**
     * Attribute label: Description
     */
    public Input<FilterMatchTypeInput> getDescriptionInput() {
        return description;
    }

    /**
     * Attribute label: Description
     */
    public ProductAttributeFilterInput setDescription(FilterMatchTypeInput description) {
        this.description = Input.optional(description);
        return this;
    }

    /**
     * Attribute label: Description
     */
    public ProductAttributeFilterInput setDescriptionInput(Input<FilterMatchTypeInput> description) {
        if (description == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.description = description;
        return this;
    }

    /**
     * Attribute label: Product Name
     */
    public FilterMatchTypeInput getName() {
        return name.getValue();
    }

    /**
     * Attribute label: Product Name
     */
    public Input<FilterMatchTypeInput> getNameInput() {
        return name;
    }

    /**
     * Attribute label: Product Name
     */
    public ProductAttributeFilterInput setName(FilterMatchTypeInput name) {
        this.name = Input.optional(name);
        return this;
    }

    /**
     * Attribute label: Product Name
     */
    public ProductAttributeFilterInput setNameInput(Input<FilterMatchTypeInput> name) {
        if (name == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.name = name;
        return this;
    }

    /**
     * Attribute label: Price
     */
    public FilterRangeTypeInput getPrice() {
        return price.getValue();
    }

    /**
     * Attribute label: Price
     */
    public Input<FilterRangeTypeInput> getPriceInput() {
        return price;
    }

    /**
     * Attribute label: Price
     */
    public ProductAttributeFilterInput setPrice(FilterRangeTypeInput price) {
        this.price = Input.optional(price);
        return this;
    }

    /**
     * Attribute label: Price
     */
    public ProductAttributeFilterInput setPriceInput(Input<FilterRangeTypeInput> price) {
        if (price == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.price = price;
        return this;
    }

    /**
     * Attribute label: Short Description
     */
    public FilterMatchTypeInput getShortDescription() {
        return shortDescription.getValue();
    }

    /**
     * Attribute label: Short Description
     */
    public Input<FilterMatchTypeInput> getShortDescriptionInput() {
        return shortDescription;
    }

    /**
     * Attribute label: Short Description
     */
    public ProductAttributeFilterInput setShortDescription(FilterMatchTypeInput shortDescription) {
        this.shortDescription = Input.optional(shortDescription);
        return this;
    }

    /**
     * Attribute label: Short Description
     */
    public ProductAttributeFilterInput setShortDescriptionInput(Input<FilterMatchTypeInput> shortDescription) {
        if (shortDescription == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.shortDescription = shortDescription;
        return this;
    }

    /**
     * Attribute label: SKU
     */
    public FilterEqualTypeInput getSku() {
        return sku.getValue();
    }

    /**
     * Attribute label: SKU
     */
    public Input<FilterEqualTypeInput> getSkuInput() {
        return sku;
    }

    /**
     * Attribute label: SKU
     */
    public ProductAttributeFilterInput setSku(FilterEqualTypeInput sku) {
        this.sku = Input.optional(sku);
        return this;
    }

    /**
     * Attribute label: SKU
     */
    public ProductAttributeFilterInput setSkuInput(Input<FilterEqualTypeInput> sku) {
        if (sku == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.sku = sku;
        return this;
    }

    /**
     * The part of the URL that identifies the product
     */
    public FilterEqualTypeInput getUrlKey() {
        return urlKey.getValue();
    }

    /**
     * The part of the URL that identifies the product
     */
    public Input<FilterEqualTypeInput> getUrlKeyInput() {
        return urlKey;
    }

    /**
     * The part of the URL that identifies the product
     */
    public ProductAttributeFilterInput setUrlKey(FilterEqualTypeInput urlKey) {
        this.urlKey = Input.optional(urlKey);
        return this;
    }

    /**
     * The part of the URL that identifies the product
     */
    public ProductAttributeFilterInput setUrlKeyInput(Input<FilterEqualTypeInput> urlKey) {
        if (urlKey == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.urlKey = urlKey;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.categoryId.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("category_id:");
            if (categoryId.getValue() != null) {
                categoryId.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.description.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("description:");
            if (description.getValue() != null) {
                description.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.name.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("name:");
            if (name.getValue() != null) {
                name.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.price.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("price:");
            if (price.getValue() != null) {
                price.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.shortDescription.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("short_description:");
            if (shortDescription.getValue() != null) {
                shortDescription.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.sku.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("sku:");
            if (sku.getValue() != null) {
                sku.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.urlKey.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("url_key:");
            if (urlKey.getValue() != null) {
                urlKey.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}

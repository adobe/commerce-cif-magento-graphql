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
 * Defines the filters to be used in the search. A filter contains at least one attribute, a comparison
 * operator, and the value that is being searched for.
 */
public class ProductAttributeFilterInput implements Serializable {
    private Input<FilterEqualTypeInput> categoryId = Input.undefined();

    private Input<FilterEqualTypeInput> categoryUid = Input.undefined();

    private Input<FilterEqualTypeInput> color = Input.undefined();

    private Input<FilterMatchTypeInput> description = Input.undefined();

    private Input<FilterEqualTypeInput> fashionColor = Input.undefined();

    private Input<FilterEqualTypeInput> fashionMaterial = Input.undefined();

    private Input<FilterEqualTypeInput> fashionSize = Input.undefined();

    private Input<FilterEqualTypeInput> fashionStyle = Input.undefined();

    private Input<FilterEqualTypeInput> format = Input.undefined();

    private Input<FilterEqualTypeInput> hasVideo = Input.undefined();

    private Input<FilterMatchTypeInput> name = Input.undefined();

    private Input<FilterRangeTypeInput> price = Input.undefined();

    private Input<FilterEqualTypeInput> purpose = Input.undefined();

    private Input<FilterMatchTypeInput> shortDescription = Input.undefined();

    private Input<FilterEqualTypeInput> sku = Input.undefined();

    private Input<FilterEqualTypeInput> urlKey = Input.undefined();

    /**
     * Deprecated: use `category_uid` to filter product by category ID.
     */
    public FilterEqualTypeInput getCategoryId() {
        return categoryId.getValue();
    }

    /**
     * Deprecated: use `category_uid` to filter product by category ID.
     */
    public Input<FilterEqualTypeInput> getCategoryIdInput() {
        return categoryId;
    }

    /**
     * Deprecated: use `category_uid` to filter product by category ID.
     */
    public ProductAttributeFilterInput setCategoryId(FilterEqualTypeInput categoryId) {
        this.categoryId = Input.optional(categoryId);
        return this;
    }

    /**
     * Deprecated: use `category_uid` to filter product by category ID.
     */
    public ProductAttributeFilterInput setCategoryIdInput(Input<FilterEqualTypeInput> categoryId) {
        if (categoryId == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.categoryId = categoryId;
        return this;
    }

    /**
     * Filter product by the unique ID for a `CategoryInterface` object.
     */
    public FilterEqualTypeInput getCategoryUid() {
        return categoryUid.getValue();
    }

    /**
     * Filter product by the unique ID for a `CategoryInterface` object.
     */
    public Input<FilterEqualTypeInput> getCategoryUidInput() {
        return categoryUid;
    }

    /**
     * Filter product by the unique ID for a `CategoryInterface` object.
     */
    public ProductAttributeFilterInput setCategoryUid(FilterEqualTypeInput categoryUid) {
        this.categoryUid = Input.optional(categoryUid);
        return this;
    }

    /**
     * Filter product by the unique ID for a `CategoryInterface` object.
     */
    public ProductAttributeFilterInput setCategoryUidInput(Input<FilterEqualTypeInput> categoryUid) {
        if (categoryUid == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.categoryUid = categoryUid;
        return this;
    }

    /**
     * Attribute label: Color
     */
    public FilterEqualTypeInput getColor() {
        return color.getValue();
    }

    /**
     * Attribute label: Color
     */
    public Input<FilterEqualTypeInput> getColorInput() {
        return color;
    }

    /**
     * Attribute label: Color
     */
    public ProductAttributeFilterInput setColor(FilterEqualTypeInput color) {
        this.color = Input.optional(color);
        return this;
    }

    /**
     * Attribute label: Color
     */
    public ProductAttributeFilterInput setColorInput(Input<FilterEqualTypeInput> color) {
        if (color == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.color = color;
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
     * Attribute label: Color
     */
    public FilterEqualTypeInput getFashionColor() {
        return fashionColor.getValue();
    }

    /**
     * Attribute label: Color
     */
    public Input<FilterEqualTypeInput> getFashionColorInput() {
        return fashionColor;
    }

    /**
     * Attribute label: Color
     */
    public ProductAttributeFilterInput setFashionColor(FilterEqualTypeInput fashionColor) {
        this.fashionColor = Input.optional(fashionColor);
        return this;
    }

    /**
     * Attribute label: Color
     */
    public ProductAttributeFilterInput setFashionColorInput(Input<FilterEqualTypeInput> fashionColor) {
        if (fashionColor == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.fashionColor = fashionColor;
        return this;
    }

    /**
     * Attribute label: Material
     */
    public FilterEqualTypeInput getFashionMaterial() {
        return fashionMaterial.getValue();
    }

    /**
     * Attribute label: Material
     */
    public Input<FilterEqualTypeInput> getFashionMaterialInput() {
        return fashionMaterial;
    }

    /**
     * Attribute label: Material
     */
    public ProductAttributeFilterInput setFashionMaterial(FilterEqualTypeInput fashionMaterial) {
        this.fashionMaterial = Input.optional(fashionMaterial);
        return this;
    }

    /**
     * Attribute label: Material
     */
    public ProductAttributeFilterInput setFashionMaterialInput(Input<FilterEqualTypeInput> fashionMaterial) {
        if (fashionMaterial == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.fashionMaterial = fashionMaterial;
        return this;
    }

    /**
     * Attribute label: Size
     */
    public FilterEqualTypeInput getFashionSize() {
        return fashionSize.getValue();
    }

    /**
     * Attribute label: Size
     */
    public Input<FilterEqualTypeInput> getFashionSizeInput() {
        return fashionSize;
    }

    /**
     * Attribute label: Size
     */
    public ProductAttributeFilterInput setFashionSize(FilterEqualTypeInput fashionSize) {
        this.fashionSize = Input.optional(fashionSize);
        return this;
    }

    /**
     * Attribute label: Size
     */
    public ProductAttributeFilterInput setFashionSizeInput(Input<FilterEqualTypeInput> fashionSize) {
        if (fashionSize == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.fashionSize = fashionSize;
        return this;
    }

    /**
     * Attribute label: Style
     */
    public FilterEqualTypeInput getFashionStyle() {
        return fashionStyle.getValue();
    }

    /**
     * Attribute label: Style
     */
    public Input<FilterEqualTypeInput> getFashionStyleInput() {
        return fashionStyle;
    }

    /**
     * Attribute label: Style
     */
    public ProductAttributeFilterInput setFashionStyle(FilterEqualTypeInput fashionStyle) {
        this.fashionStyle = Input.optional(fashionStyle);
        return this;
    }

    /**
     * Attribute label: Style
     */
    public ProductAttributeFilterInput setFashionStyleInput(Input<FilterEqualTypeInput> fashionStyle) {
        if (fashionStyle == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.fashionStyle = fashionStyle;
        return this;
    }

    /**
     * Attribute label: Format
     */
    public FilterEqualTypeInput getFormat() {
        return format.getValue();
    }

    /**
     * Attribute label: Format
     */
    public Input<FilterEqualTypeInput> getFormatInput() {
        return format;
    }

    /**
     * Attribute label: Format
     */
    public ProductAttributeFilterInput setFormat(FilterEqualTypeInput format) {
        this.format = Input.optional(format);
        return this;
    }

    /**
     * Attribute label: Format
     */
    public ProductAttributeFilterInput setFormatInput(Input<FilterEqualTypeInput> format) {
        if (format == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.format = format;
        return this;
    }

    /**
     * Attribute label: Has Video
     */
    public FilterEqualTypeInput getHasVideo() {
        return hasVideo.getValue();
    }

    /**
     * Attribute label: Has Video
     */
    public Input<FilterEqualTypeInput> getHasVideoInput() {
        return hasVideo;
    }

    /**
     * Attribute label: Has Video
     */
    public ProductAttributeFilterInput setHasVideo(FilterEqualTypeInput hasVideo) {
        this.hasVideo = Input.optional(hasVideo);
        return this;
    }

    /**
     * Attribute label: Has Video
     */
    public ProductAttributeFilterInput setHasVideoInput(Input<FilterEqualTypeInput> hasVideo) {
        if (hasVideo == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.hasVideo = hasVideo;
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
     * Attribute label: Purpose
     */
    public FilterEqualTypeInput getPurpose() {
        return purpose.getValue();
    }

    /**
     * Attribute label: Purpose
     */
    public Input<FilterEqualTypeInput> getPurposeInput() {
        return purpose;
    }

    /**
     * Attribute label: Purpose
     */
    public ProductAttributeFilterInput setPurpose(FilterEqualTypeInput purpose) {
        this.purpose = Input.optional(purpose);
        return this;
    }

    /**
     * Attribute label: Purpose
     */
    public ProductAttributeFilterInput setPurposeInput(Input<FilterEqualTypeInput> purpose) {
        if (purpose == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.purpose = purpose;
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

        if (this.categoryUid.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("category_uid:");
            if (categoryUid.getValue() != null) {
                categoryUid.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.color.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("color:");
            if (color.getValue() != null) {
                color.getValue().appendTo(_queryBuilder);
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

        if (this.fashionColor.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("fashion_color:");
            if (fashionColor.getValue() != null) {
                fashionColor.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.fashionMaterial.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("fashion_material:");
            if (fashionMaterial.getValue() != null) {
                fashionMaterial.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.fashionSize.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("fashion_size:");
            if (fashionSize.getValue() != null) {
                fashionSize.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.fashionStyle.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("fashion_style:");
            if (fashionStyle.getValue() != null) {
                fashionStyle.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.format.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("format:");
            if (format.getValue() != null) {
                format.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.hasVideo.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("has_video:");
            if (hasVideo.getValue() != null) {
                hasVideo.getValue().appendTo(_queryBuilder);
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

        if (this.purpose.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("purpose:");
            if (purpose.getValue() != null) {
                purpose.getValue().appendTo(_queryBuilder);
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

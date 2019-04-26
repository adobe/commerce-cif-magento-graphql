/*******************************************************************************
*
*    Copyright 2019 Adobe. All rights reserved.
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

public class ProductFilterInput implements Serializable {
    private Input<FilterTypeInput> categoryId = Input.undefined();

    private Input<FilterTypeInput> countryOfManufacture = Input.undefined();

    private Input<FilterTypeInput> createdAt = Input.undefined();

    private Input<FilterTypeInput> customLayout = Input.undefined();

    private Input<FilterTypeInput> customLayoutUpdate = Input.undefined();

    private Input<FilterTypeInput> description = Input.undefined();

    private Input<FilterTypeInput> giftMessageAvailable = Input.undefined();

    private Input<FilterTypeInput> hasOptions = Input.undefined();

    private Input<FilterTypeInput> image = Input.undefined();

    private Input<FilterTypeInput> imageLabel = Input.undefined();

    private Input<FilterTypeInput> manufacturer = Input.undefined();

    private Input<FilterTypeInput> maxPrice = Input.undefined();

    private Input<FilterTypeInput> metaDescription = Input.undefined();

    private Input<FilterTypeInput> metaKeyword = Input.undefined();

    private Input<FilterTypeInput> metaTitle = Input.undefined();

    private Input<FilterTypeInput> minPrice = Input.undefined();

    private Input<FilterTypeInput> name = Input.undefined();

    private Input<FilterTypeInput> newsFromDate = Input.undefined();

    private Input<FilterTypeInput> newsToDate = Input.undefined();

    private Input<FilterTypeInput> optionsContainer = Input.undefined();

    private Input<ProductFilterInput> or = Input.undefined();

    private Input<FilterTypeInput> price = Input.undefined();

    private Input<FilterTypeInput> requiredOptions = Input.undefined();

    private Input<FilterTypeInput> shortDescription = Input.undefined();

    private Input<FilterTypeInput> sku = Input.undefined();

    private Input<FilterTypeInput> smallImage = Input.undefined();

    private Input<FilterTypeInput> smallImageLabel = Input.undefined();

    private Input<FilterTypeInput> specialFromDate = Input.undefined();

    private Input<FilterTypeInput> specialPrice = Input.undefined();

    private Input<FilterTypeInput> specialToDate = Input.undefined();

    private Input<FilterTypeInput> swatchImage = Input.undefined();

    private Input<FilterTypeInput> thumbnail = Input.undefined();

    private Input<FilterTypeInput> thumbnailLabel = Input.undefined();

    private Input<FilterTypeInput> tierPrice = Input.undefined();

    private Input<FilterTypeInput> updatedAt = Input.undefined();

    private Input<FilterTypeInput> urlKey = Input.undefined();

    private Input<FilterTypeInput> urlPath = Input.undefined();

    private Input<FilterTypeInput> weight = Input.undefined();

    public FilterTypeInput getCategoryId() {
        return categoryId.getValue();
    }

    public Input<FilterTypeInput> getCategoryIdInput() {
        return categoryId;
    }

    public ProductFilterInput setCategoryId(FilterTypeInput categoryId) {
        this.categoryId = Input.optional(categoryId);
        return this;
    }

    public ProductFilterInput setCategoryIdInput(Input<FilterTypeInput> categoryId) {
        if (categoryId == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.categoryId = categoryId;
        return this;
    }

    public FilterTypeInput getCountryOfManufacture() {
        return countryOfManufacture.getValue();
    }

    public Input<FilterTypeInput> getCountryOfManufactureInput() {
        return countryOfManufacture;
    }

    public ProductFilterInput setCountryOfManufacture(FilterTypeInput countryOfManufacture) {
        this.countryOfManufacture = Input.optional(countryOfManufacture);
        return this;
    }

    public ProductFilterInput setCountryOfManufactureInput(Input<FilterTypeInput> countryOfManufacture) {
        if (countryOfManufacture == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.countryOfManufacture = countryOfManufacture;
        return this;
    }

    public FilterTypeInput getCreatedAt() {
        return createdAt.getValue();
    }

    public Input<FilterTypeInput> getCreatedAtInput() {
        return createdAt;
    }

    public ProductFilterInput setCreatedAt(FilterTypeInput createdAt) {
        this.createdAt = Input.optional(createdAt);
        return this;
    }

    public ProductFilterInput setCreatedAtInput(Input<FilterTypeInput> createdAt) {
        if (createdAt == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.createdAt = createdAt;
        return this;
    }

    public FilterTypeInput getCustomLayout() {
        return customLayout.getValue();
    }

    public Input<FilterTypeInput> getCustomLayoutInput() {
        return customLayout;
    }

    public ProductFilterInput setCustomLayout(FilterTypeInput customLayout) {
        this.customLayout = Input.optional(customLayout);
        return this;
    }

    public ProductFilterInput setCustomLayoutInput(Input<FilterTypeInput> customLayout) {
        if (customLayout == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.customLayout = customLayout;
        return this;
    }

    public FilterTypeInput getCustomLayoutUpdate() {
        return customLayoutUpdate.getValue();
    }

    public Input<FilterTypeInput> getCustomLayoutUpdateInput() {
        return customLayoutUpdate;
    }

    public ProductFilterInput setCustomLayoutUpdate(FilterTypeInput customLayoutUpdate) {
        this.customLayoutUpdate = Input.optional(customLayoutUpdate);
        return this;
    }

    public ProductFilterInput setCustomLayoutUpdateInput(Input<FilterTypeInput> customLayoutUpdate) {
        if (customLayoutUpdate == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.customLayoutUpdate = customLayoutUpdate;
        return this;
    }

    public FilterTypeInput getDescription() {
        return description.getValue();
    }

    public Input<FilterTypeInput> getDescriptionInput() {
        return description;
    }

    public ProductFilterInput setDescription(FilterTypeInput description) {
        this.description = Input.optional(description);
        return this;
    }

    public ProductFilterInput setDescriptionInput(Input<FilterTypeInput> description) {
        if (description == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.description = description;
        return this;
    }

    public FilterTypeInput getGiftMessageAvailable() {
        return giftMessageAvailable.getValue();
    }

    public Input<FilterTypeInput> getGiftMessageAvailableInput() {
        return giftMessageAvailable;
    }

    public ProductFilterInput setGiftMessageAvailable(FilterTypeInput giftMessageAvailable) {
        this.giftMessageAvailable = Input.optional(giftMessageAvailable);
        return this;
    }

    public ProductFilterInput setGiftMessageAvailableInput(Input<FilterTypeInput> giftMessageAvailable) {
        if (giftMessageAvailable == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.giftMessageAvailable = giftMessageAvailable;
        return this;
    }

    public FilterTypeInput getHasOptions() {
        return hasOptions.getValue();
    }

    public Input<FilterTypeInput> getHasOptionsInput() {
        return hasOptions;
    }

    public ProductFilterInput setHasOptions(FilterTypeInput hasOptions) {
        this.hasOptions = Input.optional(hasOptions);
        return this;
    }

    public ProductFilterInput setHasOptionsInput(Input<FilterTypeInput> hasOptions) {
        if (hasOptions == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.hasOptions = hasOptions;
        return this;
    }

    public FilterTypeInput getImage() {
        return image.getValue();
    }

    public Input<FilterTypeInput> getImageInput() {
        return image;
    }

    public ProductFilterInput setImage(FilterTypeInput image) {
        this.image = Input.optional(image);
        return this;
    }

    public ProductFilterInput setImageInput(Input<FilterTypeInput> image) {
        if (image == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.image = image;
        return this;
    }

    public FilterTypeInput getImageLabel() {
        return imageLabel.getValue();
    }

    public Input<FilterTypeInput> getImageLabelInput() {
        return imageLabel;
    }

    public ProductFilterInput setImageLabel(FilterTypeInput imageLabel) {
        this.imageLabel = Input.optional(imageLabel);
        return this;
    }

    public ProductFilterInput setImageLabelInput(Input<FilterTypeInput> imageLabel) {
        if (imageLabel == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.imageLabel = imageLabel;
        return this;
    }

    public FilterTypeInput getManufacturer() {
        return manufacturer.getValue();
    }

    public Input<FilterTypeInput> getManufacturerInput() {
        return manufacturer;
    }

    public ProductFilterInput setManufacturer(FilterTypeInput manufacturer) {
        this.manufacturer = Input.optional(manufacturer);
        return this;
    }

    public ProductFilterInput setManufacturerInput(Input<FilterTypeInput> manufacturer) {
        if (manufacturer == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.manufacturer = manufacturer;
        return this;
    }

    public FilterTypeInput getMaxPrice() {
        return maxPrice.getValue();
    }

    public Input<FilterTypeInput> getMaxPriceInput() {
        return maxPrice;
    }

    public ProductFilterInput setMaxPrice(FilterTypeInput maxPrice) {
        this.maxPrice = Input.optional(maxPrice);
        return this;
    }

    public ProductFilterInput setMaxPriceInput(Input<FilterTypeInput> maxPrice) {
        if (maxPrice == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.maxPrice = maxPrice;
        return this;
    }

    public FilterTypeInput getMetaDescription() {
        return metaDescription.getValue();
    }

    public Input<FilterTypeInput> getMetaDescriptionInput() {
        return metaDescription;
    }

    public ProductFilterInput setMetaDescription(FilterTypeInput metaDescription) {
        this.metaDescription = Input.optional(metaDescription);
        return this;
    }

    public ProductFilterInput setMetaDescriptionInput(Input<FilterTypeInput> metaDescription) {
        if (metaDescription == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.metaDescription = metaDescription;
        return this;
    }

    public FilterTypeInput getMetaKeyword() {
        return metaKeyword.getValue();
    }

    public Input<FilterTypeInput> getMetaKeywordInput() {
        return metaKeyword;
    }

    public ProductFilterInput setMetaKeyword(FilterTypeInput metaKeyword) {
        this.metaKeyword = Input.optional(metaKeyword);
        return this;
    }

    public ProductFilterInput setMetaKeywordInput(Input<FilterTypeInput> metaKeyword) {
        if (metaKeyword == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.metaKeyword = metaKeyword;
        return this;
    }

    public FilterTypeInput getMetaTitle() {
        return metaTitle.getValue();
    }

    public Input<FilterTypeInput> getMetaTitleInput() {
        return metaTitle;
    }

    public ProductFilterInput setMetaTitle(FilterTypeInput metaTitle) {
        this.metaTitle = Input.optional(metaTitle);
        return this;
    }

    public ProductFilterInput setMetaTitleInput(Input<FilterTypeInput> metaTitle) {
        if (metaTitle == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.metaTitle = metaTitle;
        return this;
    }

    public FilterTypeInput getMinPrice() {
        return minPrice.getValue();
    }

    public Input<FilterTypeInput> getMinPriceInput() {
        return minPrice;
    }

    public ProductFilterInput setMinPrice(FilterTypeInput minPrice) {
        this.minPrice = Input.optional(minPrice);
        return this;
    }

    public ProductFilterInput setMinPriceInput(Input<FilterTypeInput> minPrice) {
        if (minPrice == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.minPrice = minPrice;
        return this;
    }

    public FilterTypeInput getName() {
        return name.getValue();
    }

    public Input<FilterTypeInput> getNameInput() {
        return name;
    }

    public ProductFilterInput setName(FilterTypeInput name) {
        this.name = Input.optional(name);
        return this;
    }

    public ProductFilterInput setNameInput(Input<FilterTypeInput> name) {
        if (name == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.name = name;
        return this;
    }

    public FilterTypeInput getNewsFromDate() {
        return newsFromDate.getValue();
    }

    public Input<FilterTypeInput> getNewsFromDateInput() {
        return newsFromDate;
    }

    public ProductFilterInput setNewsFromDate(FilterTypeInput newsFromDate) {
        this.newsFromDate = Input.optional(newsFromDate);
        return this;
    }

    public ProductFilterInput setNewsFromDateInput(Input<FilterTypeInput> newsFromDate) {
        if (newsFromDate == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.newsFromDate = newsFromDate;
        return this;
    }

    public FilterTypeInput getNewsToDate() {
        return newsToDate.getValue();
    }

    public Input<FilterTypeInput> getNewsToDateInput() {
        return newsToDate;
    }

    public ProductFilterInput setNewsToDate(FilterTypeInput newsToDate) {
        this.newsToDate = Input.optional(newsToDate);
        return this;
    }

    public ProductFilterInput setNewsToDateInput(Input<FilterTypeInput> newsToDate) {
        if (newsToDate == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.newsToDate = newsToDate;
        return this;
    }

    public FilterTypeInput getOptionsContainer() {
        return optionsContainer.getValue();
    }

    public Input<FilterTypeInput> getOptionsContainerInput() {
        return optionsContainer;
    }

    public ProductFilterInput setOptionsContainer(FilterTypeInput optionsContainer) {
        this.optionsContainer = Input.optional(optionsContainer);
        return this;
    }

    public ProductFilterInput setOptionsContainerInput(Input<FilterTypeInput> optionsContainer) {
        if (optionsContainer == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.optionsContainer = optionsContainer;
        return this;
    }

    public ProductFilterInput getOr() {
        return or.getValue();
    }

    public Input<ProductFilterInput> getOrInput() {
        return or;
    }

    public ProductFilterInput setOr(ProductFilterInput or) {
        this.or = Input.optional(or);
        return this;
    }

    public ProductFilterInput setOrInput(Input<ProductFilterInput> or) {
        if (or == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.or = or;
        return this;
    }

    public FilterTypeInput getPrice() {
        return price.getValue();
    }

    public Input<FilterTypeInput> getPriceInput() {
        return price;
    }

    public ProductFilterInput setPrice(FilterTypeInput price) {
        this.price = Input.optional(price);
        return this;
    }

    public ProductFilterInput setPriceInput(Input<FilterTypeInput> price) {
        if (price == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.price = price;
        return this;
    }

    public FilterTypeInput getRequiredOptions() {
        return requiredOptions.getValue();
    }

    public Input<FilterTypeInput> getRequiredOptionsInput() {
        return requiredOptions;
    }

    public ProductFilterInput setRequiredOptions(FilterTypeInput requiredOptions) {
        this.requiredOptions = Input.optional(requiredOptions);
        return this;
    }

    public ProductFilterInput setRequiredOptionsInput(Input<FilterTypeInput> requiredOptions) {
        if (requiredOptions == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.requiredOptions = requiredOptions;
        return this;
    }

    public FilterTypeInput getShortDescription() {
        return shortDescription.getValue();
    }

    public Input<FilterTypeInput> getShortDescriptionInput() {
        return shortDescription;
    }

    public ProductFilterInput setShortDescription(FilterTypeInput shortDescription) {
        this.shortDescription = Input.optional(shortDescription);
        return this;
    }

    public ProductFilterInput setShortDescriptionInput(Input<FilterTypeInput> shortDescription) {
        if (shortDescription == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.shortDescription = shortDescription;
        return this;
    }

    public FilterTypeInput getSku() {
        return sku.getValue();
    }

    public Input<FilterTypeInput> getSkuInput() {
        return sku;
    }

    public ProductFilterInput setSku(FilterTypeInput sku) {
        this.sku = Input.optional(sku);
        return this;
    }

    public ProductFilterInput setSkuInput(Input<FilterTypeInput> sku) {
        if (sku == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.sku = sku;
        return this;
    }

    public FilterTypeInput getSmallImage() {
        return smallImage.getValue();
    }

    public Input<FilterTypeInput> getSmallImageInput() {
        return smallImage;
    }

    public ProductFilterInput setSmallImage(FilterTypeInput smallImage) {
        this.smallImage = Input.optional(smallImage);
        return this;
    }

    public ProductFilterInput setSmallImageInput(Input<FilterTypeInput> smallImage) {
        if (smallImage == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.smallImage = smallImage;
        return this;
    }

    public FilterTypeInput getSmallImageLabel() {
        return smallImageLabel.getValue();
    }

    public Input<FilterTypeInput> getSmallImageLabelInput() {
        return smallImageLabel;
    }

    public ProductFilterInput setSmallImageLabel(FilterTypeInput smallImageLabel) {
        this.smallImageLabel = Input.optional(smallImageLabel);
        return this;
    }

    public ProductFilterInput setSmallImageLabelInput(Input<FilterTypeInput> smallImageLabel) {
        if (smallImageLabel == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.smallImageLabel = smallImageLabel;
        return this;
    }

    public FilterTypeInput getSpecialFromDate() {
        return specialFromDate.getValue();
    }

    public Input<FilterTypeInput> getSpecialFromDateInput() {
        return specialFromDate;
    }

    public ProductFilterInput setSpecialFromDate(FilterTypeInput specialFromDate) {
        this.specialFromDate = Input.optional(specialFromDate);
        return this;
    }

    public ProductFilterInput setSpecialFromDateInput(Input<FilterTypeInput> specialFromDate) {
        if (specialFromDate == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.specialFromDate = specialFromDate;
        return this;
    }

    public FilterTypeInput getSpecialPrice() {
        return specialPrice.getValue();
    }

    public Input<FilterTypeInput> getSpecialPriceInput() {
        return specialPrice;
    }

    public ProductFilterInput setSpecialPrice(FilterTypeInput specialPrice) {
        this.specialPrice = Input.optional(specialPrice);
        return this;
    }

    public ProductFilterInput setSpecialPriceInput(Input<FilterTypeInput> specialPrice) {
        if (specialPrice == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.specialPrice = specialPrice;
        return this;
    }

    public FilterTypeInput getSpecialToDate() {
        return specialToDate.getValue();
    }

    public Input<FilterTypeInput> getSpecialToDateInput() {
        return specialToDate;
    }

    public ProductFilterInput setSpecialToDate(FilterTypeInput specialToDate) {
        this.specialToDate = Input.optional(specialToDate);
        return this;
    }

    public ProductFilterInput setSpecialToDateInput(Input<FilterTypeInput> specialToDate) {
        if (specialToDate == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.specialToDate = specialToDate;
        return this;
    }

    public FilterTypeInput getSwatchImage() {
        return swatchImage.getValue();
    }

    public Input<FilterTypeInput> getSwatchImageInput() {
        return swatchImage;
    }

    public ProductFilterInput setSwatchImage(FilterTypeInput swatchImage) {
        this.swatchImage = Input.optional(swatchImage);
        return this;
    }

    public ProductFilterInput setSwatchImageInput(Input<FilterTypeInput> swatchImage) {
        if (swatchImage == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.swatchImage = swatchImage;
        return this;
    }

    public FilterTypeInput getThumbnail() {
        return thumbnail.getValue();
    }

    public Input<FilterTypeInput> getThumbnailInput() {
        return thumbnail;
    }

    public ProductFilterInput setThumbnail(FilterTypeInput thumbnail) {
        this.thumbnail = Input.optional(thumbnail);
        return this;
    }

    public ProductFilterInput setThumbnailInput(Input<FilterTypeInput> thumbnail) {
        if (thumbnail == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.thumbnail = thumbnail;
        return this;
    }

    public FilterTypeInput getThumbnailLabel() {
        return thumbnailLabel.getValue();
    }

    public Input<FilterTypeInput> getThumbnailLabelInput() {
        return thumbnailLabel;
    }

    public ProductFilterInput setThumbnailLabel(FilterTypeInput thumbnailLabel) {
        this.thumbnailLabel = Input.optional(thumbnailLabel);
        return this;
    }

    public ProductFilterInput setThumbnailLabelInput(Input<FilterTypeInput> thumbnailLabel) {
        if (thumbnailLabel == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.thumbnailLabel = thumbnailLabel;
        return this;
    }

    public FilterTypeInput getTierPrice() {
        return tierPrice.getValue();
    }

    public Input<FilterTypeInput> getTierPriceInput() {
        return tierPrice;
    }

    public ProductFilterInput setTierPrice(FilterTypeInput tierPrice) {
        this.tierPrice = Input.optional(tierPrice);
        return this;
    }

    public ProductFilterInput setTierPriceInput(Input<FilterTypeInput> tierPrice) {
        if (tierPrice == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.tierPrice = tierPrice;
        return this;
    }

    public FilterTypeInput getUpdatedAt() {
        return updatedAt.getValue();
    }

    public Input<FilterTypeInput> getUpdatedAtInput() {
        return updatedAt;
    }

    public ProductFilterInput setUpdatedAt(FilterTypeInput updatedAt) {
        this.updatedAt = Input.optional(updatedAt);
        return this;
    }

    public ProductFilterInput setUpdatedAtInput(Input<FilterTypeInput> updatedAt) {
        if (updatedAt == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.updatedAt = updatedAt;
        return this;
    }

    public FilterTypeInput getUrlKey() {
        return urlKey.getValue();
    }

    public Input<FilterTypeInput> getUrlKeyInput() {
        return urlKey;
    }

    public ProductFilterInput setUrlKey(FilterTypeInput urlKey) {
        this.urlKey = Input.optional(urlKey);
        return this;
    }

    public ProductFilterInput setUrlKeyInput(Input<FilterTypeInput> urlKey) {
        if (urlKey == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.urlKey = urlKey;
        return this;
    }

    public FilterTypeInput getUrlPath() {
        return urlPath.getValue();
    }

    public Input<FilterTypeInput> getUrlPathInput() {
        return urlPath;
    }

    public ProductFilterInput setUrlPath(FilterTypeInput urlPath) {
        this.urlPath = Input.optional(urlPath);
        return this;
    }

    public ProductFilterInput setUrlPathInput(Input<FilterTypeInput> urlPath) {
        if (urlPath == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.urlPath = urlPath;
        return this;
    }

    public FilterTypeInput getWeight() {
        return weight.getValue();
    }

    public Input<FilterTypeInput> getWeightInput() {
        return weight;
    }

    public ProductFilterInput setWeight(FilterTypeInput weight) {
        this.weight = Input.optional(weight);
        return this;
    }

    public ProductFilterInput setWeightInput(Input<FilterTypeInput> weight) {
        if (weight == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.weight = weight;
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

        if (this.countryOfManufacture.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("country_of_manufacture:");
            if (countryOfManufacture.getValue() != null) {
                countryOfManufacture.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.createdAt.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("created_at:");
            if (createdAt.getValue() != null) {
                createdAt.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.customLayout.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("custom_layout:");
            if (customLayout.getValue() != null) {
                customLayout.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.customLayoutUpdate.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("custom_layout_update:");
            if (customLayoutUpdate.getValue() != null) {
                customLayoutUpdate.getValue().appendTo(_queryBuilder);
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

        if (this.giftMessageAvailable.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("gift_message_available:");
            if (giftMessageAvailable.getValue() != null) {
                giftMessageAvailable.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.hasOptions.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("has_options:");
            if (hasOptions.getValue() != null) {
                hasOptions.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.image.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("image:");
            if (image.getValue() != null) {
                image.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.imageLabel.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("image_label:");
            if (imageLabel.getValue() != null) {
                imageLabel.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.manufacturer.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("manufacturer:");
            if (manufacturer.getValue() != null) {
                manufacturer.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.maxPrice.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("max_price:");
            if (maxPrice.getValue() != null) {
                maxPrice.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.metaDescription.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("meta_description:");
            if (metaDescription.getValue() != null) {
                metaDescription.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.metaKeyword.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("meta_keyword:");
            if (metaKeyword.getValue() != null) {
                metaKeyword.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.metaTitle.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("meta_title:");
            if (metaTitle.getValue() != null) {
                metaTitle.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.minPrice.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("min_price:");
            if (minPrice.getValue() != null) {
                minPrice.getValue().appendTo(_queryBuilder);
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

        if (this.newsFromDate.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("news_from_date:");
            if (newsFromDate.getValue() != null) {
                newsFromDate.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.newsToDate.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("news_to_date:");
            if (newsToDate.getValue() != null) {
                newsToDate.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.optionsContainer.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("options_container:");
            if (optionsContainer.getValue() != null) {
                optionsContainer.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.or.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("or:");
            if (or.getValue() != null) {
                or.getValue().appendTo(_queryBuilder);
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

        if (this.requiredOptions.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("required_options:");
            if (requiredOptions.getValue() != null) {
                requiredOptions.getValue().appendTo(_queryBuilder);
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

        if (this.smallImage.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("small_image:");
            if (smallImage.getValue() != null) {
                smallImage.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.smallImageLabel.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("small_image_label:");
            if (smallImageLabel.getValue() != null) {
                smallImageLabel.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.specialFromDate.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("special_from_date:");
            if (specialFromDate.getValue() != null) {
                specialFromDate.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.specialPrice.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("special_price:");
            if (specialPrice.getValue() != null) {
                specialPrice.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.specialToDate.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("special_to_date:");
            if (specialToDate.getValue() != null) {
                specialToDate.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.swatchImage.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("swatch_image:");
            if (swatchImage.getValue() != null) {
                swatchImage.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.thumbnail.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("thumbnail:");
            if (thumbnail.getValue() != null) {
                thumbnail.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.thumbnailLabel.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("thumbnail_label:");
            if (thumbnailLabel.getValue() != null) {
                thumbnailLabel.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.tierPrice.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("tier_price:");
            if (tierPrice.getValue() != null) {
                tierPrice.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.updatedAt.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("updated_at:");
            if (updatedAt.getValue() != null) {
                updatedAt.getValue().appendTo(_queryBuilder);
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

        if (this.urlPath.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("url_path:");
            if (urlPath.getValue() != null) {
                urlPath.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.weight.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("weight:");
            if (weight.getValue() != null) {
                weight.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}

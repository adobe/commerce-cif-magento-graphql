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

public class ProductSortInput implements Serializable {
    private Input<SortEnum> countryOfManufacture = Input.undefined();

    private Input<SortEnum> createdAt = Input.undefined();

    private Input<SortEnum> customLayout = Input.undefined();

    private Input<SortEnum> customLayoutUpdate = Input.undefined();

    private Input<SortEnum> description = Input.undefined();

    private Input<SortEnum> giftMessageAvailable = Input.undefined();

    private Input<SortEnum> hasOptions = Input.undefined();

    private Input<SortEnum> image = Input.undefined();

    private Input<SortEnum> imageLabel = Input.undefined();

    private Input<SortEnum> manufacturer = Input.undefined();

    private Input<SortEnum> metaDescription = Input.undefined();

    private Input<SortEnum> metaKeyword = Input.undefined();

    private Input<SortEnum> metaTitle = Input.undefined();

    private Input<SortEnum> name = Input.undefined();

    private Input<SortEnum> newsFromDate = Input.undefined();

    private Input<SortEnum> newsToDate = Input.undefined();

    private Input<SortEnum> optionsContainer = Input.undefined();

    private Input<SortEnum> price = Input.undefined();

    private Input<SortEnum> requiredOptions = Input.undefined();

    private Input<SortEnum> shortDescription = Input.undefined();

    private Input<SortEnum> sku = Input.undefined();

    private Input<SortEnum> smallImage = Input.undefined();

    private Input<SortEnum> smallImageLabel = Input.undefined();

    private Input<SortEnum> specialFromDate = Input.undefined();

    private Input<SortEnum> specialPrice = Input.undefined();

    private Input<SortEnum> specialToDate = Input.undefined();

    private Input<SortEnum> swatchImage = Input.undefined();

    private Input<SortEnum> thumbnail = Input.undefined();

    private Input<SortEnum> thumbnailLabel = Input.undefined();

    private Input<SortEnum> tierPrice = Input.undefined();

    private Input<SortEnum> updatedAt = Input.undefined();

    private Input<SortEnum> urlKey = Input.undefined();

    private Input<SortEnum> urlPath = Input.undefined();

    private Input<SortEnum> weight = Input.undefined();

    public SortEnum getCountryOfManufacture() {
        return countryOfManufacture.getValue();
    }

    public Input<SortEnum> getCountryOfManufactureInput() {
        return countryOfManufacture;
    }

    public ProductSortInput setCountryOfManufacture(SortEnum countryOfManufacture) {
        this.countryOfManufacture = Input.optional(countryOfManufacture);
        return this;
    }

    public ProductSortInput setCountryOfManufactureInput(Input<SortEnum> countryOfManufacture) {
        if (countryOfManufacture == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.countryOfManufacture = countryOfManufacture;
        return this;
    }

    public SortEnum getCreatedAt() {
        return createdAt.getValue();
    }

    public Input<SortEnum> getCreatedAtInput() {
        return createdAt;
    }

    public ProductSortInput setCreatedAt(SortEnum createdAt) {
        this.createdAt = Input.optional(createdAt);
        return this;
    }

    public ProductSortInput setCreatedAtInput(Input<SortEnum> createdAt) {
        if (createdAt == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.createdAt = createdAt;
        return this;
    }

    public SortEnum getCustomLayout() {
        return customLayout.getValue();
    }

    public Input<SortEnum> getCustomLayoutInput() {
        return customLayout;
    }

    public ProductSortInput setCustomLayout(SortEnum customLayout) {
        this.customLayout = Input.optional(customLayout);
        return this;
    }

    public ProductSortInput setCustomLayoutInput(Input<SortEnum> customLayout) {
        if (customLayout == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.customLayout = customLayout;
        return this;
    }

    public SortEnum getCustomLayoutUpdate() {
        return customLayoutUpdate.getValue();
    }

    public Input<SortEnum> getCustomLayoutUpdateInput() {
        return customLayoutUpdate;
    }

    public ProductSortInput setCustomLayoutUpdate(SortEnum customLayoutUpdate) {
        this.customLayoutUpdate = Input.optional(customLayoutUpdate);
        return this;
    }

    public ProductSortInput setCustomLayoutUpdateInput(Input<SortEnum> customLayoutUpdate) {
        if (customLayoutUpdate == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.customLayoutUpdate = customLayoutUpdate;
        return this;
    }

    public SortEnum getDescription() {
        return description.getValue();
    }

    public Input<SortEnum> getDescriptionInput() {
        return description;
    }

    public ProductSortInput setDescription(SortEnum description) {
        this.description = Input.optional(description);
        return this;
    }

    public ProductSortInput setDescriptionInput(Input<SortEnum> description) {
        if (description == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.description = description;
        return this;
    }

    public SortEnum getGiftMessageAvailable() {
        return giftMessageAvailable.getValue();
    }

    public Input<SortEnum> getGiftMessageAvailableInput() {
        return giftMessageAvailable;
    }

    public ProductSortInput setGiftMessageAvailable(SortEnum giftMessageAvailable) {
        this.giftMessageAvailable = Input.optional(giftMessageAvailable);
        return this;
    }

    public ProductSortInput setGiftMessageAvailableInput(Input<SortEnum> giftMessageAvailable) {
        if (giftMessageAvailable == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.giftMessageAvailable = giftMessageAvailable;
        return this;
    }

    public SortEnum getHasOptions() {
        return hasOptions.getValue();
    }

    public Input<SortEnum> getHasOptionsInput() {
        return hasOptions;
    }

    public ProductSortInput setHasOptions(SortEnum hasOptions) {
        this.hasOptions = Input.optional(hasOptions);
        return this;
    }

    public ProductSortInput setHasOptionsInput(Input<SortEnum> hasOptions) {
        if (hasOptions == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.hasOptions = hasOptions;
        return this;
    }

    public SortEnum getImage() {
        return image.getValue();
    }

    public Input<SortEnum> getImageInput() {
        return image;
    }

    public ProductSortInput setImage(SortEnum image) {
        this.image = Input.optional(image);
        return this;
    }

    public ProductSortInput setImageInput(Input<SortEnum> image) {
        if (image == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.image = image;
        return this;
    }

    public SortEnum getImageLabel() {
        return imageLabel.getValue();
    }

    public Input<SortEnum> getImageLabelInput() {
        return imageLabel;
    }

    public ProductSortInput setImageLabel(SortEnum imageLabel) {
        this.imageLabel = Input.optional(imageLabel);
        return this;
    }

    public ProductSortInput setImageLabelInput(Input<SortEnum> imageLabel) {
        if (imageLabel == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.imageLabel = imageLabel;
        return this;
    }

    public SortEnum getManufacturer() {
        return manufacturer.getValue();
    }

    public Input<SortEnum> getManufacturerInput() {
        return manufacturer;
    }

    public ProductSortInput setManufacturer(SortEnum manufacturer) {
        this.manufacturer = Input.optional(manufacturer);
        return this;
    }

    public ProductSortInput setManufacturerInput(Input<SortEnum> manufacturer) {
        if (manufacturer == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.manufacturer = manufacturer;
        return this;
    }

    public SortEnum getMetaDescription() {
        return metaDescription.getValue();
    }

    public Input<SortEnum> getMetaDescriptionInput() {
        return metaDescription;
    }

    public ProductSortInput setMetaDescription(SortEnum metaDescription) {
        this.metaDescription = Input.optional(metaDescription);
        return this;
    }

    public ProductSortInput setMetaDescriptionInput(Input<SortEnum> metaDescription) {
        if (metaDescription == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.metaDescription = metaDescription;
        return this;
    }

    public SortEnum getMetaKeyword() {
        return metaKeyword.getValue();
    }

    public Input<SortEnum> getMetaKeywordInput() {
        return metaKeyword;
    }

    public ProductSortInput setMetaKeyword(SortEnum metaKeyword) {
        this.metaKeyword = Input.optional(metaKeyword);
        return this;
    }

    public ProductSortInput setMetaKeywordInput(Input<SortEnum> metaKeyword) {
        if (metaKeyword == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.metaKeyword = metaKeyword;
        return this;
    }

    public SortEnum getMetaTitle() {
        return metaTitle.getValue();
    }

    public Input<SortEnum> getMetaTitleInput() {
        return metaTitle;
    }

    public ProductSortInput setMetaTitle(SortEnum metaTitle) {
        this.metaTitle = Input.optional(metaTitle);
        return this;
    }

    public ProductSortInput setMetaTitleInput(Input<SortEnum> metaTitle) {
        if (metaTitle == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.metaTitle = metaTitle;
        return this;
    }

    public SortEnum getName() {
        return name.getValue();
    }

    public Input<SortEnum> getNameInput() {
        return name;
    }

    public ProductSortInput setName(SortEnum name) {
        this.name = Input.optional(name);
        return this;
    }

    public ProductSortInput setNameInput(Input<SortEnum> name) {
        if (name == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.name = name;
        return this;
    }

    public SortEnum getNewsFromDate() {
        return newsFromDate.getValue();
    }

    public Input<SortEnum> getNewsFromDateInput() {
        return newsFromDate;
    }

    public ProductSortInput setNewsFromDate(SortEnum newsFromDate) {
        this.newsFromDate = Input.optional(newsFromDate);
        return this;
    }

    public ProductSortInput setNewsFromDateInput(Input<SortEnum> newsFromDate) {
        if (newsFromDate == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.newsFromDate = newsFromDate;
        return this;
    }

    public SortEnum getNewsToDate() {
        return newsToDate.getValue();
    }

    public Input<SortEnum> getNewsToDateInput() {
        return newsToDate;
    }

    public ProductSortInput setNewsToDate(SortEnum newsToDate) {
        this.newsToDate = Input.optional(newsToDate);
        return this;
    }

    public ProductSortInput setNewsToDateInput(Input<SortEnum> newsToDate) {
        if (newsToDate == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.newsToDate = newsToDate;
        return this;
    }

    public SortEnum getOptionsContainer() {
        return optionsContainer.getValue();
    }

    public Input<SortEnum> getOptionsContainerInput() {
        return optionsContainer;
    }

    public ProductSortInput setOptionsContainer(SortEnum optionsContainer) {
        this.optionsContainer = Input.optional(optionsContainer);
        return this;
    }

    public ProductSortInput setOptionsContainerInput(Input<SortEnum> optionsContainer) {
        if (optionsContainer == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.optionsContainer = optionsContainer;
        return this;
    }

    public SortEnum getPrice() {
        return price.getValue();
    }

    public Input<SortEnum> getPriceInput() {
        return price;
    }

    public ProductSortInput setPrice(SortEnum price) {
        this.price = Input.optional(price);
        return this;
    }

    public ProductSortInput setPriceInput(Input<SortEnum> price) {
        if (price == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.price = price;
        return this;
    }

    public SortEnum getRequiredOptions() {
        return requiredOptions.getValue();
    }

    public Input<SortEnum> getRequiredOptionsInput() {
        return requiredOptions;
    }

    public ProductSortInput setRequiredOptions(SortEnum requiredOptions) {
        this.requiredOptions = Input.optional(requiredOptions);
        return this;
    }

    public ProductSortInput setRequiredOptionsInput(Input<SortEnum> requiredOptions) {
        if (requiredOptions == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.requiredOptions = requiredOptions;
        return this;
    }

    public SortEnum getShortDescription() {
        return shortDescription.getValue();
    }

    public Input<SortEnum> getShortDescriptionInput() {
        return shortDescription;
    }

    public ProductSortInput setShortDescription(SortEnum shortDescription) {
        this.shortDescription = Input.optional(shortDescription);
        return this;
    }

    public ProductSortInput setShortDescriptionInput(Input<SortEnum> shortDescription) {
        if (shortDescription == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.shortDescription = shortDescription;
        return this;
    }

    public SortEnum getSku() {
        return sku.getValue();
    }

    public Input<SortEnum> getSkuInput() {
        return sku;
    }

    public ProductSortInput setSku(SortEnum sku) {
        this.sku = Input.optional(sku);
        return this;
    }

    public ProductSortInput setSkuInput(Input<SortEnum> sku) {
        if (sku == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.sku = sku;
        return this;
    }

    public SortEnum getSmallImage() {
        return smallImage.getValue();
    }

    public Input<SortEnum> getSmallImageInput() {
        return smallImage;
    }

    public ProductSortInput setSmallImage(SortEnum smallImage) {
        this.smallImage = Input.optional(smallImage);
        return this;
    }

    public ProductSortInput setSmallImageInput(Input<SortEnum> smallImage) {
        if (smallImage == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.smallImage = smallImage;
        return this;
    }

    public SortEnum getSmallImageLabel() {
        return smallImageLabel.getValue();
    }

    public Input<SortEnum> getSmallImageLabelInput() {
        return smallImageLabel;
    }

    public ProductSortInput setSmallImageLabel(SortEnum smallImageLabel) {
        this.smallImageLabel = Input.optional(smallImageLabel);
        return this;
    }

    public ProductSortInput setSmallImageLabelInput(Input<SortEnum> smallImageLabel) {
        if (smallImageLabel == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.smallImageLabel = smallImageLabel;
        return this;
    }

    public SortEnum getSpecialFromDate() {
        return specialFromDate.getValue();
    }

    public Input<SortEnum> getSpecialFromDateInput() {
        return specialFromDate;
    }

    public ProductSortInput setSpecialFromDate(SortEnum specialFromDate) {
        this.specialFromDate = Input.optional(specialFromDate);
        return this;
    }

    public ProductSortInput setSpecialFromDateInput(Input<SortEnum> specialFromDate) {
        if (specialFromDate == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.specialFromDate = specialFromDate;
        return this;
    }

    public SortEnum getSpecialPrice() {
        return specialPrice.getValue();
    }

    public Input<SortEnum> getSpecialPriceInput() {
        return specialPrice;
    }

    public ProductSortInput setSpecialPrice(SortEnum specialPrice) {
        this.specialPrice = Input.optional(specialPrice);
        return this;
    }

    public ProductSortInput setSpecialPriceInput(Input<SortEnum> specialPrice) {
        if (specialPrice == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.specialPrice = specialPrice;
        return this;
    }

    public SortEnum getSpecialToDate() {
        return specialToDate.getValue();
    }

    public Input<SortEnum> getSpecialToDateInput() {
        return specialToDate;
    }

    public ProductSortInput setSpecialToDate(SortEnum specialToDate) {
        this.specialToDate = Input.optional(specialToDate);
        return this;
    }

    public ProductSortInput setSpecialToDateInput(Input<SortEnum> specialToDate) {
        if (specialToDate == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.specialToDate = specialToDate;
        return this;
    }

    public SortEnum getSwatchImage() {
        return swatchImage.getValue();
    }

    public Input<SortEnum> getSwatchImageInput() {
        return swatchImage;
    }

    public ProductSortInput setSwatchImage(SortEnum swatchImage) {
        this.swatchImage = Input.optional(swatchImage);
        return this;
    }

    public ProductSortInput setSwatchImageInput(Input<SortEnum> swatchImage) {
        if (swatchImage == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.swatchImage = swatchImage;
        return this;
    }

    public SortEnum getThumbnail() {
        return thumbnail.getValue();
    }

    public Input<SortEnum> getThumbnailInput() {
        return thumbnail;
    }

    public ProductSortInput setThumbnail(SortEnum thumbnail) {
        this.thumbnail = Input.optional(thumbnail);
        return this;
    }

    public ProductSortInput setThumbnailInput(Input<SortEnum> thumbnail) {
        if (thumbnail == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.thumbnail = thumbnail;
        return this;
    }

    public SortEnum getThumbnailLabel() {
        return thumbnailLabel.getValue();
    }

    public Input<SortEnum> getThumbnailLabelInput() {
        return thumbnailLabel;
    }

    public ProductSortInput setThumbnailLabel(SortEnum thumbnailLabel) {
        this.thumbnailLabel = Input.optional(thumbnailLabel);
        return this;
    }

    public ProductSortInput setThumbnailLabelInput(Input<SortEnum> thumbnailLabel) {
        if (thumbnailLabel == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.thumbnailLabel = thumbnailLabel;
        return this;
    }

    public SortEnum getTierPrice() {
        return tierPrice.getValue();
    }

    public Input<SortEnum> getTierPriceInput() {
        return tierPrice;
    }

    public ProductSortInput setTierPrice(SortEnum tierPrice) {
        this.tierPrice = Input.optional(tierPrice);
        return this;
    }

    public ProductSortInput setTierPriceInput(Input<SortEnum> tierPrice) {
        if (tierPrice == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.tierPrice = tierPrice;
        return this;
    }

    public SortEnum getUpdatedAt() {
        return updatedAt.getValue();
    }

    public Input<SortEnum> getUpdatedAtInput() {
        return updatedAt;
    }

    public ProductSortInput setUpdatedAt(SortEnum updatedAt) {
        this.updatedAt = Input.optional(updatedAt);
        return this;
    }

    public ProductSortInput setUpdatedAtInput(Input<SortEnum> updatedAt) {
        if (updatedAt == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.updatedAt = updatedAt;
        return this;
    }

    public SortEnum getUrlKey() {
        return urlKey.getValue();
    }

    public Input<SortEnum> getUrlKeyInput() {
        return urlKey;
    }

    public ProductSortInput setUrlKey(SortEnum urlKey) {
        this.urlKey = Input.optional(urlKey);
        return this;
    }

    public ProductSortInput setUrlKeyInput(Input<SortEnum> urlKey) {
        if (urlKey == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.urlKey = urlKey;
        return this;
    }

    public SortEnum getUrlPath() {
        return urlPath.getValue();
    }

    public Input<SortEnum> getUrlPathInput() {
        return urlPath;
    }

    public ProductSortInput setUrlPath(SortEnum urlPath) {
        this.urlPath = Input.optional(urlPath);
        return this;
    }

    public ProductSortInput setUrlPathInput(Input<SortEnum> urlPath) {
        if (urlPath == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.urlPath = urlPath;
        return this;
    }

    public SortEnum getWeight() {
        return weight.getValue();
    }

    public Input<SortEnum> getWeightInput() {
        return weight;
    }

    public ProductSortInput setWeight(SortEnum weight) {
        this.weight = Input.optional(weight);
        return this;
    }

    public ProductSortInput setWeightInput(Input<SortEnum> weight) {
        if (weight == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.weight = weight;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.countryOfManufacture.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("country_of_manufacture:");
            if (countryOfManufacture.getValue() != null) {
                _queryBuilder.append(countryOfManufacture.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.createdAt.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("created_at:");
            if (createdAt.getValue() != null) {
                _queryBuilder.append(createdAt.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.customLayout.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("custom_layout:");
            if (customLayout.getValue() != null) {
                _queryBuilder.append(customLayout.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.customLayoutUpdate.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("custom_layout_update:");
            if (customLayoutUpdate.getValue() != null) {
                _queryBuilder.append(customLayoutUpdate.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.description.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("description:");
            if (description.getValue() != null) {
                _queryBuilder.append(description.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.giftMessageAvailable.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("gift_message_available:");
            if (giftMessageAvailable.getValue() != null) {
                _queryBuilder.append(giftMessageAvailable.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.hasOptions.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("has_options:");
            if (hasOptions.getValue() != null) {
                _queryBuilder.append(hasOptions.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.image.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("image:");
            if (image.getValue() != null) {
                _queryBuilder.append(image.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.imageLabel.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("image_label:");
            if (imageLabel.getValue() != null) {
                _queryBuilder.append(imageLabel.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.manufacturer.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("manufacturer:");
            if (manufacturer.getValue() != null) {
                _queryBuilder.append(manufacturer.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.metaDescription.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("meta_description:");
            if (metaDescription.getValue() != null) {
                _queryBuilder.append(metaDescription.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.metaKeyword.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("meta_keyword:");
            if (metaKeyword.getValue() != null) {
                _queryBuilder.append(metaKeyword.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.metaTitle.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("meta_title:");
            if (metaTitle.getValue() != null) {
                _queryBuilder.append(metaTitle.getValue().toString());
            } else {
                _queryBuilder.append("null");
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

        if (this.newsFromDate.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("news_from_date:");
            if (newsFromDate.getValue() != null) {
                _queryBuilder.append(newsFromDate.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.newsToDate.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("news_to_date:");
            if (newsToDate.getValue() != null) {
                _queryBuilder.append(newsToDate.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.optionsContainer.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("options_container:");
            if (optionsContainer.getValue() != null) {
                _queryBuilder.append(optionsContainer.getValue().toString());
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

        if (this.requiredOptions.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("required_options:");
            if (requiredOptions.getValue() != null) {
                _queryBuilder.append(requiredOptions.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.shortDescription.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("short_description:");
            if (shortDescription.getValue() != null) {
                _queryBuilder.append(shortDescription.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.sku.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("sku:");
            if (sku.getValue() != null) {
                _queryBuilder.append(sku.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.smallImage.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("small_image:");
            if (smallImage.getValue() != null) {
                _queryBuilder.append(smallImage.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.smallImageLabel.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("small_image_label:");
            if (smallImageLabel.getValue() != null) {
                _queryBuilder.append(smallImageLabel.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.specialFromDate.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("special_from_date:");
            if (specialFromDate.getValue() != null) {
                _queryBuilder.append(specialFromDate.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.specialPrice.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("special_price:");
            if (specialPrice.getValue() != null) {
                _queryBuilder.append(specialPrice.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.specialToDate.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("special_to_date:");
            if (specialToDate.getValue() != null) {
                _queryBuilder.append(specialToDate.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.swatchImage.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("swatch_image:");
            if (swatchImage.getValue() != null) {
                _queryBuilder.append(swatchImage.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.thumbnail.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("thumbnail:");
            if (thumbnail.getValue() != null) {
                _queryBuilder.append(thumbnail.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.thumbnailLabel.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("thumbnail_label:");
            if (thumbnailLabel.getValue() != null) {
                _queryBuilder.append(thumbnailLabel.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.tierPrice.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("tier_price:");
            if (tierPrice.getValue() != null) {
                _queryBuilder.append(tierPrice.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.updatedAt.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("updated_at:");
            if (updatedAt.getValue() != null) {
                _queryBuilder.append(updatedAt.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.urlKey.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("url_key:");
            if (urlKey.getValue() != null) {
                _queryBuilder.append(urlKey.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.urlPath.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("url_path:");
            if (urlPath.getValue() != null) {
                _queryBuilder.append(urlPath.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.weight.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("weight:");
            if (weight.getValue() != null) {
                _queryBuilder.append(weight.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}

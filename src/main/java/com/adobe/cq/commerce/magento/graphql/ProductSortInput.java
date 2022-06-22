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
 * Deprecated. Use `ProductAttributeSortInput` instead. Specifies the attribute to use for sorting
 * search results and indicates whether the results are sorted in ascending or descending order.
 */
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

    private Input<SortEnum> isReturnable = Input.undefined();

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

    /**
     * The product&#39;s country of origin.
     */
    public SortEnum getCountryOfManufacture() {
        return countryOfManufacture.getValue();
    }

    /**
     * The product&#39;s country of origin.
     */
    public Input<SortEnum> getCountryOfManufactureInput() {
        return countryOfManufacture;
    }

    /**
     * The product&#39;s country of origin.
     */
    public ProductSortInput setCountryOfManufacture(SortEnum countryOfManufacture) {
        this.countryOfManufacture = Input.optional(countryOfManufacture);
        return this;
    }

    /**
     * The product&#39;s country of origin.
     */
    public ProductSortInput setCountryOfManufactureInput(Input<SortEnum> countryOfManufacture) {
        if (countryOfManufacture == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.countryOfManufacture = countryOfManufacture;
        return this;
    }

    /**
     * The timestamp indicating when the product was created.
     */
    public SortEnum getCreatedAt() {
        return createdAt.getValue();
    }

    /**
     * The timestamp indicating when the product was created.
     */
    public Input<SortEnum> getCreatedAtInput() {
        return createdAt;
    }

    /**
     * The timestamp indicating when the product was created.
     */
    public ProductSortInput setCreatedAt(SortEnum createdAt) {
        this.createdAt = Input.optional(createdAt);
        return this;
    }

    /**
     * The timestamp indicating when the product was created.
     */
    public ProductSortInput setCreatedAtInput(Input<SortEnum> createdAt) {
        if (createdAt == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.createdAt = createdAt;
        return this;
    }

    /**
     * The name of a custom layout.
     */
    public SortEnum getCustomLayout() {
        return customLayout.getValue();
    }

    /**
     * The name of a custom layout.
     */
    public Input<SortEnum> getCustomLayoutInput() {
        return customLayout;
    }

    /**
     * The name of a custom layout.
     */
    public ProductSortInput setCustomLayout(SortEnum customLayout) {
        this.customLayout = Input.optional(customLayout);
        return this;
    }

    /**
     * The name of a custom layout.
     */
    public ProductSortInput setCustomLayoutInput(Input<SortEnum> customLayout) {
        if (customLayout == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.customLayout = customLayout;
        return this;
    }

    /**
     * XML code that is applied as a layout update to the product page.
     */
    public SortEnum getCustomLayoutUpdate() {
        return customLayoutUpdate.getValue();
    }

    /**
     * XML code that is applied as a layout update to the product page.
     */
    public Input<SortEnum> getCustomLayoutUpdateInput() {
        return customLayoutUpdate;
    }

    /**
     * XML code that is applied as a layout update to the product page.
     */
    public ProductSortInput setCustomLayoutUpdate(SortEnum customLayoutUpdate) {
        this.customLayoutUpdate = Input.optional(customLayoutUpdate);
        return this;
    }

    /**
     * XML code that is applied as a layout update to the product page.
     */
    public ProductSortInput setCustomLayoutUpdateInput(Input<SortEnum> customLayoutUpdate) {
        if (customLayoutUpdate == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.customLayoutUpdate = customLayoutUpdate;
        return this;
    }

    /**
     * Detailed information about the product. The value can include simple HTML tags.
     */
    public SortEnum getDescription() {
        return description.getValue();
    }

    /**
     * Detailed information about the product. The value can include simple HTML tags.
     */
    public Input<SortEnum> getDescriptionInput() {
        return description;
    }

    /**
     * Detailed information about the product. The value can include simple HTML tags.
     */
    public ProductSortInput setDescription(SortEnum description) {
        this.description = Input.optional(description);
        return this;
    }

    /**
     * Detailed information about the product. The value can include simple HTML tags.
     */
    public ProductSortInput setDescriptionInput(Input<SortEnum> description) {
        if (description == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.description = description;
        return this;
    }

    /**
     * Indicates whether a gift message is available.
     */
    public SortEnum getGiftMessageAvailable() {
        return giftMessageAvailable.getValue();
    }

    /**
     * Indicates whether a gift message is available.
     */
    public Input<SortEnum> getGiftMessageAvailableInput() {
        return giftMessageAvailable;
    }

    /**
     * Indicates whether a gift message is available.
     */
    public ProductSortInput setGiftMessageAvailable(SortEnum giftMessageAvailable) {
        this.giftMessageAvailable = Input.optional(giftMessageAvailable);
        return this;
    }

    /**
     * Indicates whether a gift message is available.
     */
    public ProductSortInput setGiftMessageAvailableInput(Input<SortEnum> giftMessageAvailable) {
        if (giftMessageAvailable == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.giftMessageAvailable = giftMessageAvailable;
        return this;
    }

    /**
     * Indicates whether additional attributes have been created for the product.
     */
    public SortEnum getHasOptions() {
        return hasOptions.getValue();
    }

    /**
     * Indicates whether additional attributes have been created for the product.
     */
    public Input<SortEnum> getHasOptionsInput() {
        return hasOptions;
    }

    /**
     * Indicates whether additional attributes have been created for the product.
     */
    public ProductSortInput setHasOptions(SortEnum hasOptions) {
        this.hasOptions = Input.optional(hasOptions);
        return this;
    }

    /**
     * Indicates whether additional attributes have been created for the product.
     */
    public ProductSortInput setHasOptionsInput(Input<SortEnum> hasOptions) {
        if (hasOptions == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.hasOptions = hasOptions;
        return this;
    }

    /**
     * The relative path to the main image on the product page.
     */
    public SortEnum getImage() {
        return image.getValue();
    }

    /**
     * The relative path to the main image on the product page.
     */
    public Input<SortEnum> getImageInput() {
        return image;
    }

    /**
     * The relative path to the main image on the product page.
     */
    public ProductSortInput setImage(SortEnum image) {
        this.image = Input.optional(image);
        return this;
    }

    /**
     * The relative path to the main image on the product page.
     */
    public ProductSortInput setImageInput(Input<SortEnum> image) {
        if (image == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.image = image;
        return this;
    }

    /**
     * The label assigned to a product image.
     */
    public SortEnum getImageLabel() {
        return imageLabel.getValue();
    }

    /**
     * The label assigned to a product image.
     */
    public Input<SortEnum> getImageLabelInput() {
        return imageLabel;
    }

    /**
     * The label assigned to a product image.
     */
    public ProductSortInput setImageLabel(SortEnum imageLabel) {
        this.imageLabel = Input.optional(imageLabel);
        return this;
    }

    /**
     * The label assigned to a product image.
     */
    public ProductSortInput setImageLabelInput(Input<SortEnum> imageLabel) {
        if (imageLabel == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.imageLabel = imageLabel;
        return this;
    }

    /**
     * Indicates whether the product can be returned.
     */
    public SortEnum getIsReturnable() {
        return isReturnable.getValue();
    }

    /**
     * Indicates whether the product can be returned.
     */
    public Input<SortEnum> getIsReturnableInput() {
        return isReturnable;
    }

    /**
     * Indicates whether the product can be returned.
     */
    public ProductSortInput setIsReturnable(SortEnum isReturnable) {
        this.isReturnable = Input.optional(isReturnable);
        return this;
    }

    /**
     * Indicates whether the product can be returned.
     */
    public ProductSortInput setIsReturnableInput(Input<SortEnum> isReturnable) {
        if (isReturnable == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.isReturnable = isReturnable;
        return this;
    }

    /**
     * A number representing the product&#39;s manufacturer.
     */
    public SortEnum getManufacturer() {
        return manufacturer.getValue();
    }

    /**
     * A number representing the product&#39;s manufacturer.
     */
    public Input<SortEnum> getManufacturerInput() {
        return manufacturer;
    }

    /**
     * A number representing the product&#39;s manufacturer.
     */
    public ProductSortInput setManufacturer(SortEnum manufacturer) {
        this.manufacturer = Input.optional(manufacturer);
        return this;
    }

    /**
     * A number representing the product&#39;s manufacturer.
     */
    public ProductSortInput setManufacturerInput(Input<SortEnum> manufacturer) {
        if (manufacturer == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.manufacturer = manufacturer;
        return this;
    }

    /**
     * A brief overview of the product for search results listings, maximum 255 characters.
     */
    public SortEnum getMetaDescription() {
        return metaDescription.getValue();
    }

    /**
     * A brief overview of the product for search results listings, maximum 255 characters.
     */
    public Input<SortEnum> getMetaDescriptionInput() {
        return metaDescription;
    }

    /**
     * A brief overview of the product for search results listings, maximum 255 characters.
     */
    public ProductSortInput setMetaDescription(SortEnum metaDescription) {
        this.metaDescription = Input.optional(metaDescription);
        return this;
    }

    /**
     * A brief overview of the product for search results listings, maximum 255 characters.
     */
    public ProductSortInput setMetaDescriptionInput(Input<SortEnum> metaDescription) {
        if (metaDescription == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.metaDescription = metaDescription;
        return this;
    }

    /**
     * A comma-separated list of keywords that are visible only to search engines.
     */
    public SortEnum getMetaKeyword() {
        return metaKeyword.getValue();
    }

    /**
     * A comma-separated list of keywords that are visible only to search engines.
     */
    public Input<SortEnum> getMetaKeywordInput() {
        return metaKeyword;
    }

    /**
     * A comma-separated list of keywords that are visible only to search engines.
     */
    public ProductSortInput setMetaKeyword(SortEnum metaKeyword) {
        this.metaKeyword = Input.optional(metaKeyword);
        return this;
    }

    /**
     * A comma-separated list of keywords that are visible only to search engines.
     */
    public ProductSortInput setMetaKeywordInput(Input<SortEnum> metaKeyword) {
        if (metaKeyword == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.metaKeyword = metaKeyword;
        return this;
    }

    /**
     * A string that is displayed in the title bar and tab of the browser and in search results lists.
     */
    public SortEnum getMetaTitle() {
        return metaTitle.getValue();
    }

    /**
     * A string that is displayed in the title bar and tab of the browser and in search results lists.
     */
    public Input<SortEnum> getMetaTitleInput() {
        return metaTitle;
    }

    /**
     * A string that is displayed in the title bar and tab of the browser and in search results lists.
     */
    public ProductSortInput setMetaTitle(SortEnum metaTitle) {
        this.metaTitle = Input.optional(metaTitle);
        return this;
    }

    /**
     * A string that is displayed in the title bar and tab of the browser and in search results lists.
     */
    public ProductSortInput setMetaTitleInput(Input<SortEnum> metaTitle) {
        if (metaTitle == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.metaTitle = metaTitle;
        return this;
    }

    /**
     * The product name. Customers use this name to identify the product.
     */
    public SortEnum getName() {
        return name.getValue();
    }

    /**
     * The product name. Customers use this name to identify the product.
     */
    public Input<SortEnum> getNameInput() {
        return name;
    }

    /**
     * The product name. Customers use this name to identify the product.
     */
    public ProductSortInput setName(SortEnum name) {
        this.name = Input.optional(name);
        return this;
    }

    /**
     * The product name. Customers use this name to identify the product.
     */
    public ProductSortInput setNameInput(Input<SortEnum> name) {
        if (name == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.name = name;
        return this;
    }

    /**
     * The beginning date for new product listings, and determines if the product is featured as a new
     * product.
     */
    public SortEnum getNewsFromDate() {
        return newsFromDate.getValue();
    }

    /**
     * The beginning date for new product listings, and determines if the product is featured as a new
     * product.
     */
    public Input<SortEnum> getNewsFromDateInput() {
        return newsFromDate;
    }

    /**
     * The beginning date for new product listings, and determines if the product is featured as a new
     * product.
     */
    public ProductSortInput setNewsFromDate(SortEnum newsFromDate) {
        this.newsFromDate = Input.optional(newsFromDate);
        return this;
    }

    /**
     * The beginning date for new product listings, and determines if the product is featured as a new
     * product.
     */
    public ProductSortInput setNewsFromDateInput(Input<SortEnum> newsFromDate) {
        if (newsFromDate == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.newsFromDate = newsFromDate;
        return this;
    }

    /**
     * The end date for new product listings.
     */
    public SortEnum getNewsToDate() {
        return newsToDate.getValue();
    }

    /**
     * The end date for new product listings.
     */
    public Input<SortEnum> getNewsToDateInput() {
        return newsToDate;
    }

    /**
     * The end date for new product listings.
     */
    public ProductSortInput setNewsToDate(SortEnum newsToDate) {
        this.newsToDate = Input.optional(newsToDate);
        return this;
    }

    /**
     * The end date for new product listings.
     */
    public ProductSortInput setNewsToDateInput(Input<SortEnum> newsToDate) {
        if (newsToDate == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.newsToDate = newsToDate;
        return this;
    }

    /**
     * If the product has multiple options, determines where they appear on the product page.
     */
    public SortEnum getOptionsContainer() {
        return optionsContainer.getValue();
    }

    /**
     * If the product has multiple options, determines where they appear on the product page.
     */
    public Input<SortEnum> getOptionsContainerInput() {
        return optionsContainer;
    }

    /**
     * If the product has multiple options, determines where they appear on the product page.
     */
    public ProductSortInput setOptionsContainer(SortEnum optionsContainer) {
        this.optionsContainer = Input.optional(optionsContainer);
        return this;
    }

    /**
     * If the product has multiple options, determines where they appear on the product page.
     */
    public ProductSortInput setOptionsContainerInput(Input<SortEnum> optionsContainer) {
        if (optionsContainer == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.optionsContainer = optionsContainer;
        return this;
    }

    /**
     * The price of the item.
     */
    public SortEnum getPrice() {
        return price.getValue();
    }

    /**
     * The price of the item.
     */
    public Input<SortEnum> getPriceInput() {
        return price;
    }

    /**
     * The price of the item.
     */
    public ProductSortInput setPrice(SortEnum price) {
        this.price = Input.optional(price);
        return this;
    }

    /**
     * The price of the item.
     */
    public ProductSortInput setPriceInput(Input<SortEnum> price) {
        if (price == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.price = price;
        return this;
    }

    /**
     * Indicates whether the product has required options.
     */
    public SortEnum getRequiredOptions() {
        return requiredOptions.getValue();
    }

    /**
     * Indicates whether the product has required options.
     */
    public Input<SortEnum> getRequiredOptionsInput() {
        return requiredOptions;
    }

    /**
     * Indicates whether the product has required options.
     */
    public ProductSortInput setRequiredOptions(SortEnum requiredOptions) {
        this.requiredOptions = Input.optional(requiredOptions);
        return this;
    }

    /**
     * Indicates whether the product has required options.
     */
    public ProductSortInput setRequiredOptionsInput(Input<SortEnum> requiredOptions) {
        if (requiredOptions == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.requiredOptions = requiredOptions;
        return this;
    }

    /**
     * A short description of the product. Its use depends on the theme.
     */
    public SortEnum getShortDescription() {
        return shortDescription.getValue();
    }

    /**
     * A short description of the product. Its use depends on the theme.
     */
    public Input<SortEnum> getShortDescriptionInput() {
        return shortDescription;
    }

    /**
     * A short description of the product. Its use depends on the theme.
     */
    public ProductSortInput setShortDescription(SortEnum shortDescription) {
        this.shortDescription = Input.optional(shortDescription);
        return this;
    }

    /**
     * A short description of the product. Its use depends on the theme.
     */
    public ProductSortInput setShortDescriptionInput(Input<SortEnum> shortDescription) {
        if (shortDescription == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.shortDescription = shortDescription;
        return this;
    }

    /**
     * A number or code assigned to a product to identify the product, options, price, and manufacturer.
     */
    public SortEnum getSku() {
        return sku.getValue();
    }

    /**
     * A number or code assigned to a product to identify the product, options, price, and manufacturer.
     */
    public Input<SortEnum> getSkuInput() {
        return sku;
    }

    /**
     * A number or code assigned to a product to identify the product, options, price, and manufacturer.
     */
    public ProductSortInput setSku(SortEnum sku) {
        this.sku = Input.optional(sku);
        return this;
    }

    /**
     * A number or code assigned to a product to identify the product, options, price, and manufacturer.
     */
    public ProductSortInput setSkuInput(Input<SortEnum> sku) {
        if (sku == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.sku = sku;
        return this;
    }

    /**
     * The relative path to the small image, which is used on catalog pages.
     */
    public SortEnum getSmallImage() {
        return smallImage.getValue();
    }

    /**
     * The relative path to the small image, which is used on catalog pages.
     */
    public Input<SortEnum> getSmallImageInput() {
        return smallImage;
    }

    /**
     * The relative path to the small image, which is used on catalog pages.
     */
    public ProductSortInput setSmallImage(SortEnum smallImage) {
        this.smallImage = Input.optional(smallImage);
        return this;
    }

    /**
     * The relative path to the small image, which is used on catalog pages.
     */
    public ProductSortInput setSmallImageInput(Input<SortEnum> smallImage) {
        if (smallImage == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.smallImage = smallImage;
        return this;
    }

    /**
     * The label assigned to a product&#39;s small image.
     */
    public SortEnum getSmallImageLabel() {
        return smallImageLabel.getValue();
    }

    /**
     * The label assigned to a product&#39;s small image.
     */
    public Input<SortEnum> getSmallImageLabelInput() {
        return smallImageLabel;
    }

    /**
     * The label assigned to a product&#39;s small image.
     */
    public ProductSortInput setSmallImageLabel(SortEnum smallImageLabel) {
        this.smallImageLabel = Input.optional(smallImageLabel);
        return this;
    }

    /**
     * The label assigned to a product&#39;s small image.
     */
    public ProductSortInput setSmallImageLabelInput(Input<SortEnum> smallImageLabel) {
        if (smallImageLabel == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.smallImageLabel = smallImageLabel;
        return this;
    }

    /**
     * The beginning date that a product has a special price.
     */
    public SortEnum getSpecialFromDate() {
        return specialFromDate.getValue();
    }

    /**
     * The beginning date that a product has a special price.
     */
    public Input<SortEnum> getSpecialFromDateInput() {
        return specialFromDate;
    }

    /**
     * The beginning date that a product has a special price.
     */
    public ProductSortInput setSpecialFromDate(SortEnum specialFromDate) {
        this.specialFromDate = Input.optional(specialFromDate);
        return this;
    }

    /**
     * The beginning date that a product has a special price.
     */
    public ProductSortInput setSpecialFromDateInput(Input<SortEnum> specialFromDate) {
        if (specialFromDate == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.specialFromDate = specialFromDate;
        return this;
    }

    /**
     * The discounted price of the product.
     */
    public SortEnum getSpecialPrice() {
        return specialPrice.getValue();
    }

    /**
     * The discounted price of the product.
     */
    public Input<SortEnum> getSpecialPriceInput() {
        return specialPrice;
    }

    /**
     * The discounted price of the product.
     */
    public ProductSortInput setSpecialPrice(SortEnum specialPrice) {
        this.specialPrice = Input.optional(specialPrice);
        return this;
    }

    /**
     * The discounted price of the product.
     */
    public ProductSortInput setSpecialPriceInput(Input<SortEnum> specialPrice) {
        if (specialPrice == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.specialPrice = specialPrice;
        return this;
    }

    /**
     * The end date that a product has a special price.
     */
    public SortEnum getSpecialToDate() {
        return specialToDate.getValue();
    }

    /**
     * The end date that a product has a special price.
     */
    public Input<SortEnum> getSpecialToDateInput() {
        return specialToDate;
    }

    /**
     * The end date that a product has a special price.
     */
    public ProductSortInput setSpecialToDate(SortEnum specialToDate) {
        this.specialToDate = Input.optional(specialToDate);
        return this;
    }

    /**
     * The end date that a product has a special price.
     */
    public ProductSortInput setSpecialToDateInput(Input<SortEnum> specialToDate) {
        if (specialToDate == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.specialToDate = specialToDate;
        return this;
    }

    /**
     * Indicates the criteria to sort swatches.
     */
    public SortEnum getSwatchImage() {
        return swatchImage.getValue();
    }

    /**
     * Indicates the criteria to sort swatches.
     */
    public Input<SortEnum> getSwatchImageInput() {
        return swatchImage;
    }

    /**
     * Indicates the criteria to sort swatches.
     */
    public ProductSortInput setSwatchImage(SortEnum swatchImage) {
        this.swatchImage = Input.optional(swatchImage);
        return this;
    }

    /**
     * Indicates the criteria to sort swatches.
     */
    public ProductSortInput setSwatchImageInput(Input<SortEnum> swatchImage) {
        if (swatchImage == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.swatchImage = swatchImage;
        return this;
    }

    /**
     * The relative path to the product&#39;s thumbnail image.
     */
    public SortEnum getThumbnail() {
        return thumbnail.getValue();
    }

    /**
     * The relative path to the product&#39;s thumbnail image.
     */
    public Input<SortEnum> getThumbnailInput() {
        return thumbnail;
    }

    /**
     * The relative path to the product&#39;s thumbnail image.
     */
    public ProductSortInput setThumbnail(SortEnum thumbnail) {
        this.thumbnail = Input.optional(thumbnail);
        return this;
    }

    /**
     * The relative path to the product&#39;s thumbnail image.
     */
    public ProductSortInput setThumbnailInput(Input<SortEnum> thumbnail) {
        if (thumbnail == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.thumbnail = thumbnail;
        return this;
    }

    /**
     * The label assigned to a product&#39;s thumbnail image.
     */
    public SortEnum getThumbnailLabel() {
        return thumbnailLabel.getValue();
    }

    /**
     * The label assigned to a product&#39;s thumbnail image.
     */
    public Input<SortEnum> getThumbnailLabelInput() {
        return thumbnailLabel;
    }

    /**
     * The label assigned to a product&#39;s thumbnail image.
     */
    public ProductSortInput setThumbnailLabel(SortEnum thumbnailLabel) {
        this.thumbnailLabel = Input.optional(thumbnailLabel);
        return this;
    }

    /**
     * The label assigned to a product&#39;s thumbnail image.
     */
    public ProductSortInput setThumbnailLabelInput(Input<SortEnum> thumbnailLabel) {
        if (thumbnailLabel == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.thumbnailLabel = thumbnailLabel;
        return this;
    }

    /**
     * The price when tier pricing is in effect and the items purchased threshold has been reached.
     */
    public SortEnum getTierPrice() {
        return tierPrice.getValue();
    }

    /**
     * The price when tier pricing is in effect and the items purchased threshold has been reached.
     */
    public Input<SortEnum> getTierPriceInput() {
        return tierPrice;
    }

    /**
     * The price when tier pricing is in effect and the items purchased threshold has been reached.
     */
    public ProductSortInput setTierPrice(SortEnum tierPrice) {
        this.tierPrice = Input.optional(tierPrice);
        return this;
    }

    /**
     * The price when tier pricing is in effect and the items purchased threshold has been reached.
     */
    public ProductSortInput setTierPriceInput(Input<SortEnum> tierPrice) {
        if (tierPrice == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.tierPrice = tierPrice;
        return this;
    }

    /**
     * The timestamp indicating when the product was updated.
     */
    public SortEnum getUpdatedAt() {
        return updatedAt.getValue();
    }

    /**
     * The timestamp indicating when the product was updated.
     */
    public Input<SortEnum> getUpdatedAtInput() {
        return updatedAt;
    }

    /**
     * The timestamp indicating when the product was updated.
     */
    public ProductSortInput setUpdatedAt(SortEnum updatedAt) {
        this.updatedAt = Input.optional(updatedAt);
        return this;
    }

    /**
     * The timestamp indicating when the product was updated.
     */
    public ProductSortInput setUpdatedAtInput(Input<SortEnum> updatedAt) {
        if (updatedAt == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * The part of the URL that identifies the product
     */
    public SortEnum getUrlKey() {
        return urlKey.getValue();
    }

    /**
     * The part of the URL that identifies the product
     */
    public Input<SortEnum> getUrlKeyInput() {
        return urlKey;
    }

    /**
     * The part of the URL that identifies the product
     */
    public ProductSortInput setUrlKey(SortEnum urlKey) {
        this.urlKey = Input.optional(urlKey);
        return this;
    }

    /**
     * The part of the URL that identifies the product
     */
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

    /**
     * The weight of the item, in units defined by the store.
     */
    public SortEnum getWeight() {
        return weight.getValue();
    }

    /**
     * The weight of the item, in units defined by the store.
     */
    public Input<SortEnum> getWeightInput() {
        return weight;
    }

    /**
     * The weight of the item, in units defined by the store.
     */
    public ProductSortInput setWeight(SortEnum weight) {
        this.weight = Input.optional(weight);
        return this;
    }

    /**
     * The weight of the item, in units defined by the store.
     */
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

        if (this.isReturnable.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("is_returnable:");
            if (isReturnable.getValue() != null) {
                _queryBuilder.append(isReturnable.getValue().toString());
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

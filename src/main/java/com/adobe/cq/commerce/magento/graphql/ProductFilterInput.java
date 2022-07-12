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
 * ProductFilterInput is deprecated, use @ProductAttributeFilterInput instead. ProductFilterInput
 * defines the filters to be used in the search. A filter contains at least one attribute, a comparison
 * operator, and the value that is being searched for.
 */
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

    private Input<FilterTypeInput> isReturnable = Input.undefined();

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

    private Map<String, Input<Serializable>> customFilters = new HashMap<>();

    /**
     * The category ID the product belongs to.
     */
    public FilterTypeInput getCategoryId() {
        return categoryId.getValue();
    }

    /**
     * The category ID the product belongs to.
     */
    public Input<FilterTypeInput> getCategoryIdInput() {
        return categoryId;
    }

    /**
     * The category ID the product belongs to.
     */
    public ProductFilterInput setCategoryId(FilterTypeInput categoryId) {
        this.categoryId = Input.optional(categoryId);
        return this;
    }

    /**
     * The category ID the product belongs to.
     */
    public ProductFilterInput setCategoryIdInput(Input<FilterTypeInput> categoryId) {
        if (categoryId == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.categoryId = categoryId;
        return this;
    }

    /**
     * The product&#39;s country of origin.
     */
    public FilterTypeInput getCountryOfManufacture() {
        return countryOfManufacture.getValue();
    }

    /**
     * The product&#39;s country of origin.
     */
    public Input<FilterTypeInput> getCountryOfManufactureInput() {
        return countryOfManufacture;
    }

    /**
     * The product&#39;s country of origin.
     */
    public ProductFilterInput setCountryOfManufacture(FilterTypeInput countryOfManufacture) {
        this.countryOfManufacture = Input.optional(countryOfManufacture);
        return this;
    }

    /**
     * The product&#39;s country of origin.
     */
    public ProductFilterInput setCountryOfManufactureInput(Input<FilterTypeInput> countryOfManufacture) {
        if (countryOfManufacture == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.countryOfManufacture = countryOfManufacture;
        return this;
    }

    /**
     * The timestamp indicating when the product was created.
     */
    public FilterTypeInput getCreatedAt() {
        return createdAt.getValue();
    }

    /**
     * The timestamp indicating when the product was created.
     */
    public Input<FilterTypeInput> getCreatedAtInput() {
        return createdAt;
    }

    /**
     * The timestamp indicating when the product was created.
     */
    public ProductFilterInput setCreatedAt(FilterTypeInput createdAt) {
        this.createdAt = Input.optional(createdAt);
        return this;
    }

    /**
     * The timestamp indicating when the product was created.
     */
    public ProductFilterInput setCreatedAtInput(Input<FilterTypeInput> createdAt) {
        if (createdAt == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.createdAt = createdAt;
        return this;
    }

    /**
     * The name of a custom layout.
     */
    public FilterTypeInput getCustomLayout() {
        return customLayout.getValue();
    }

    /**
     * The name of a custom layout.
     */
    public Input<FilterTypeInput> getCustomLayoutInput() {
        return customLayout;
    }

    /**
     * The name of a custom layout.
     */
    public ProductFilterInput setCustomLayout(FilterTypeInput customLayout) {
        this.customLayout = Input.optional(customLayout);
        return this;
    }

    /**
     * The name of a custom layout.
     */
    public ProductFilterInput setCustomLayoutInput(Input<FilterTypeInput> customLayout) {
        if (customLayout == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.customLayout = customLayout;
        return this;
    }

    /**
     * XML code that is applied as a layout update to the product page.
     */
    public FilterTypeInput getCustomLayoutUpdate() {
        return customLayoutUpdate.getValue();
    }

    /**
     * XML code that is applied as a layout update to the product page.
     */
    public Input<FilterTypeInput> getCustomLayoutUpdateInput() {
        return customLayoutUpdate;
    }

    /**
     * XML code that is applied as a layout update to the product page.
     */
    public ProductFilterInput setCustomLayoutUpdate(FilterTypeInput customLayoutUpdate) {
        this.customLayoutUpdate = Input.optional(customLayoutUpdate);
        return this;
    }

    /**
     * XML code that is applied as a layout update to the product page.
     */
    public ProductFilterInput setCustomLayoutUpdateInput(Input<FilterTypeInput> customLayoutUpdate) {
        if (customLayoutUpdate == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.customLayoutUpdate = customLayoutUpdate;
        return this;
    }

    /**
     * Detailed information about the product. The value can include simple HTML tags.
     */
    public FilterTypeInput getDescription() {
        return description.getValue();
    }

    /**
     * Detailed information about the product. The value can include simple HTML tags.
     */
    public Input<FilterTypeInput> getDescriptionInput() {
        return description;
    }

    /**
     * Detailed information about the product. The value can include simple HTML tags.
     */
    public ProductFilterInput setDescription(FilterTypeInput description) {
        this.description = Input.optional(description);
        return this;
    }

    /**
     * Detailed information about the product. The value can include simple HTML tags.
     */
    public ProductFilterInput setDescriptionInput(Input<FilterTypeInput> description) {
        if (description == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.description = description;
        return this;
    }

    /**
     * Indicates whether a gift message is available.
     */
    public FilterTypeInput getGiftMessageAvailable() {
        return giftMessageAvailable.getValue();
    }

    /**
     * Indicates whether a gift message is available.
     */
    public Input<FilterTypeInput> getGiftMessageAvailableInput() {
        return giftMessageAvailable;
    }

    /**
     * Indicates whether a gift message is available.
     */
    public ProductFilterInput setGiftMessageAvailable(FilterTypeInput giftMessageAvailable) {
        this.giftMessageAvailable = Input.optional(giftMessageAvailable);
        return this;
    }

    /**
     * Indicates whether a gift message is available.
     */
    public ProductFilterInput setGiftMessageAvailableInput(Input<FilterTypeInput> giftMessageAvailable) {
        if (giftMessageAvailable == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.giftMessageAvailable = giftMessageAvailable;
        return this;
    }

    /**
     * Indicates whether additional attributes have been created for the product.
     */
    public FilterTypeInput getHasOptions() {
        return hasOptions.getValue();
    }

    /**
     * Indicates whether additional attributes have been created for the product.
     */
    public Input<FilterTypeInput> getHasOptionsInput() {
        return hasOptions;
    }

    /**
     * Indicates whether additional attributes have been created for the product.
     */
    public ProductFilterInput setHasOptions(FilterTypeInput hasOptions) {
        this.hasOptions = Input.optional(hasOptions);
        return this;
    }

    /**
     * Indicates whether additional attributes have been created for the product.
     */
    public ProductFilterInput setHasOptionsInput(Input<FilterTypeInput> hasOptions) {
        if (hasOptions == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.hasOptions = hasOptions;
        return this;
    }

    /**
     * The relative path to the main image on the product page.
     */
    public FilterTypeInput getImage() {
        return image.getValue();
    }

    /**
     * The relative path to the main image on the product page.
     */
    public Input<FilterTypeInput> getImageInput() {
        return image;
    }

    /**
     * The relative path to the main image on the product page.
     */
    public ProductFilterInput setImage(FilterTypeInput image) {
        this.image = Input.optional(image);
        return this;
    }

    /**
     * The relative path to the main image on the product page.
     */
    public ProductFilterInput setImageInput(Input<FilterTypeInput> image) {
        if (image == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.image = image;
        return this;
    }

    /**
     * The label assigned to a product image.
     */
    public FilterTypeInput getImageLabel() {
        return imageLabel.getValue();
    }

    /**
     * The label assigned to a product image.
     */
    public Input<FilterTypeInput> getImageLabelInput() {
        return imageLabel;
    }

    /**
     * The label assigned to a product image.
     */
    public ProductFilterInput setImageLabel(FilterTypeInput imageLabel) {
        this.imageLabel = Input.optional(imageLabel);
        return this;
    }

    /**
     * The label assigned to a product image.
     */
    public ProductFilterInput setImageLabelInput(Input<FilterTypeInput> imageLabel) {
        if (imageLabel == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.imageLabel = imageLabel;
        return this;
    }

    /**
     * Indicates whether the product can be returned.
     */
    public FilterTypeInput getIsReturnable() {
        return isReturnable.getValue();
    }

    /**
     * Indicates whether the product can be returned.
     */
    public Input<FilterTypeInput> getIsReturnableInput() {
        return isReturnable;
    }

    /**
     * Indicates whether the product can be returned.
     */
    public ProductFilterInput setIsReturnable(FilterTypeInput isReturnable) {
        this.isReturnable = Input.optional(isReturnable);
        return this;
    }

    /**
     * Indicates whether the product can be returned.
     */
    public ProductFilterInput setIsReturnableInput(Input<FilterTypeInput> isReturnable) {
        if (isReturnable == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.isReturnable = isReturnable;
        return this;
    }

    /**
     * A number representing the product&#39;s manufacturer.
     */
    public FilterTypeInput getManufacturer() {
        return manufacturer.getValue();
    }

    /**
     * A number representing the product&#39;s manufacturer.
     */
    public Input<FilterTypeInput> getManufacturerInput() {
        return manufacturer;
    }

    /**
     * A number representing the product&#39;s manufacturer.
     */
    public ProductFilterInput setManufacturer(FilterTypeInput manufacturer) {
        this.manufacturer = Input.optional(manufacturer);
        return this;
    }

    /**
     * A number representing the product&#39;s manufacturer.
     */
    public ProductFilterInput setManufacturerInput(Input<FilterTypeInput> manufacturer) {
        if (manufacturer == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.manufacturer = manufacturer;
        return this;
    }

    /**
     * The numeric maximal price of the product. Do not include the currency code.
     */
    public FilterTypeInput getMaxPrice() {
        return maxPrice.getValue();
    }

    /**
     * The numeric maximal price of the product. Do not include the currency code.
     */
    public Input<FilterTypeInput> getMaxPriceInput() {
        return maxPrice;
    }

    /**
     * The numeric maximal price of the product. Do not include the currency code.
     */
    public ProductFilterInput setMaxPrice(FilterTypeInput maxPrice) {
        this.maxPrice = Input.optional(maxPrice);
        return this;
    }

    /**
     * The numeric maximal price of the product. Do not include the currency code.
     */
    public ProductFilterInput setMaxPriceInput(Input<FilterTypeInput> maxPrice) {
        if (maxPrice == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.maxPrice = maxPrice;
        return this;
    }

    /**
     * A brief overview of the product for search results listings, maximum 255 characters.
     */
    public FilterTypeInput getMetaDescription() {
        return metaDescription.getValue();
    }

    /**
     * A brief overview of the product for search results listings, maximum 255 characters.
     */
    public Input<FilterTypeInput> getMetaDescriptionInput() {
        return metaDescription;
    }

    /**
     * A brief overview of the product for search results listings, maximum 255 characters.
     */
    public ProductFilterInput setMetaDescription(FilterTypeInput metaDescription) {
        this.metaDescription = Input.optional(metaDescription);
        return this;
    }

    /**
     * A brief overview of the product for search results listings, maximum 255 characters.
     */
    public ProductFilterInput setMetaDescriptionInput(Input<FilterTypeInput> metaDescription) {
        if (metaDescription == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.metaDescription = metaDescription;
        return this;
    }

    /**
     * A comma-separated list of keywords that are visible only to search engines.
     */
    public FilterTypeInput getMetaKeyword() {
        return metaKeyword.getValue();
    }

    /**
     * A comma-separated list of keywords that are visible only to search engines.
     */
    public Input<FilterTypeInput> getMetaKeywordInput() {
        return metaKeyword;
    }

    /**
     * A comma-separated list of keywords that are visible only to search engines.
     */
    public ProductFilterInput setMetaKeyword(FilterTypeInput metaKeyword) {
        this.metaKeyword = Input.optional(metaKeyword);
        return this;
    }

    /**
     * A comma-separated list of keywords that are visible only to search engines.
     */
    public ProductFilterInput setMetaKeywordInput(Input<FilterTypeInput> metaKeyword) {
        if (metaKeyword == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.metaKeyword = metaKeyword;
        return this;
    }

    /**
     * A string that is displayed in the title bar and tab of the browser and in search results lists.
     */
    public FilterTypeInput getMetaTitle() {
        return metaTitle.getValue();
    }

    /**
     * A string that is displayed in the title bar and tab of the browser and in search results lists.
     */
    public Input<FilterTypeInput> getMetaTitleInput() {
        return metaTitle;
    }

    /**
     * A string that is displayed in the title bar and tab of the browser and in search results lists.
     */
    public ProductFilterInput setMetaTitle(FilterTypeInput metaTitle) {
        this.metaTitle = Input.optional(metaTitle);
        return this;
    }

    /**
     * A string that is displayed in the title bar and tab of the browser and in search results lists.
     */
    public ProductFilterInput setMetaTitleInput(Input<FilterTypeInput> metaTitle) {
        if (metaTitle == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.metaTitle = metaTitle;
        return this;
    }

    /**
     * The numeric minimal price of the product. Do not include the currency code.
     */
    public FilterTypeInput getMinPrice() {
        return minPrice.getValue();
    }

    /**
     * The numeric minimal price of the product. Do not include the currency code.
     */
    public Input<FilterTypeInput> getMinPriceInput() {
        return minPrice;
    }

    /**
     * The numeric minimal price of the product. Do not include the currency code.
     */
    public ProductFilterInput setMinPrice(FilterTypeInput minPrice) {
        this.minPrice = Input.optional(minPrice);
        return this;
    }

    /**
     * The numeric minimal price of the product. Do not include the currency code.
     */
    public ProductFilterInput setMinPriceInput(Input<FilterTypeInput> minPrice) {
        if (minPrice == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.minPrice = minPrice;
        return this;
    }

    /**
     * The product name. Customers use this name to identify the product.
     */
    public FilterTypeInput getName() {
        return name.getValue();
    }

    /**
     * The product name. Customers use this name to identify the product.
     */
    public Input<FilterTypeInput> getNameInput() {
        return name;
    }

    /**
     * The product name. Customers use this name to identify the product.
     */
    public ProductFilterInput setName(FilterTypeInput name) {
        this.name = Input.optional(name);
        return this;
    }

    /**
     * The product name. Customers use this name to identify the product.
     */
    public ProductFilterInput setNameInput(Input<FilterTypeInput> name) {
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
    public FilterTypeInput getNewsFromDate() {
        return newsFromDate.getValue();
    }

    /**
     * The beginning date for new product listings, and determines if the product is featured as a new
     * product.
     */
    public Input<FilterTypeInput> getNewsFromDateInput() {
        return newsFromDate;
    }

    /**
     * The beginning date for new product listings, and determines if the product is featured as a new
     * product.
     */
    public ProductFilterInput setNewsFromDate(FilterTypeInput newsFromDate) {
        this.newsFromDate = Input.optional(newsFromDate);
        return this;
    }

    /**
     * The beginning date for new product listings, and determines if the product is featured as a new
     * product.
     */
    public ProductFilterInput setNewsFromDateInput(Input<FilterTypeInput> newsFromDate) {
        if (newsFromDate == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.newsFromDate = newsFromDate;
        return this;
    }

    /**
     * The end date for new product listings.
     */
    public FilterTypeInput getNewsToDate() {
        return newsToDate.getValue();
    }

    /**
     * The end date for new product listings.
     */
    public Input<FilterTypeInput> getNewsToDateInput() {
        return newsToDate;
    }

    /**
     * The end date for new product listings.
     */
    public ProductFilterInput setNewsToDate(FilterTypeInput newsToDate) {
        this.newsToDate = Input.optional(newsToDate);
        return this;
    }

    /**
     * The end date for new product listings.
     */
    public ProductFilterInput setNewsToDateInput(Input<FilterTypeInput> newsToDate) {
        if (newsToDate == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.newsToDate = newsToDate;
        return this;
    }

    /**
     * If the product has multiple options, determines where they appear on the product page.
     */
    public FilterTypeInput getOptionsContainer() {
        return optionsContainer.getValue();
    }

    /**
     * If the product has multiple options, determines where they appear on the product page.
     */
    public Input<FilterTypeInput> getOptionsContainerInput() {
        return optionsContainer;
    }

    /**
     * If the product has multiple options, determines where they appear on the product page.
     */
    public ProductFilterInput setOptionsContainer(FilterTypeInput optionsContainer) {
        this.optionsContainer = Input.optional(optionsContainer);
        return this;
    }

    /**
     * If the product has multiple options, determines where they appear on the product page.
     */
    public ProductFilterInput setOptionsContainerInput(Input<FilterTypeInput> optionsContainer) {
        if (optionsContainer == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.optionsContainer = optionsContainer;
        return this;
    }

    /**
     * The keyword required to perform a logical OR comparison.
     */
    public ProductFilterInput getOr() {
        return or.getValue();
    }

    /**
     * The keyword required to perform a logical OR comparison.
     */
    public Input<ProductFilterInput> getOrInput() {
        return or;
    }

    /**
     * The keyword required to perform a logical OR comparison.
     */
    public ProductFilterInput setOr(ProductFilterInput or) {
        this.or = Input.optional(or);
        return this;
    }

    /**
     * The keyword required to perform a logical OR comparison.
     */
    public ProductFilterInput setOrInput(Input<ProductFilterInput> or) {
        if (or == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.or = or;
        return this;
    }

    /**
     * The price of an item.
     */
    public FilterTypeInput getPrice() {
        return price.getValue();
    }

    /**
     * The price of an item.
     */
    public Input<FilterTypeInput> getPriceInput() {
        return price;
    }

    /**
     * The price of an item.
     */
    public ProductFilterInput setPrice(FilterTypeInput price) {
        this.price = Input.optional(price);
        return this;
    }

    /**
     * The price of an item.
     */
    public ProductFilterInput setPriceInput(Input<FilterTypeInput> price) {
        if (price == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.price = price;
        return this;
    }

    /**
     * Indicates whether the product has required options.
     */
    public FilterTypeInput getRequiredOptions() {
        return requiredOptions.getValue();
    }

    /**
     * Indicates whether the product has required options.
     */
    public Input<FilterTypeInput> getRequiredOptionsInput() {
        return requiredOptions;
    }

    /**
     * Indicates whether the product has required options.
     */
    public ProductFilterInput setRequiredOptions(FilterTypeInput requiredOptions) {
        this.requiredOptions = Input.optional(requiredOptions);
        return this;
    }

    /**
     * Indicates whether the product has required options.
     */
    public ProductFilterInput setRequiredOptionsInput(Input<FilterTypeInput> requiredOptions) {
        if (requiredOptions == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.requiredOptions = requiredOptions;
        return this;
    }

    /**
     * A short description of the product. Its use depends on the theme.
     */
    public FilterTypeInput getShortDescription() {
        return shortDescription.getValue();
    }

    /**
     * A short description of the product. Its use depends on the theme.
     */
    public Input<FilterTypeInput> getShortDescriptionInput() {
        return shortDescription;
    }

    /**
     * A short description of the product. Its use depends on the theme.
     */
    public ProductFilterInput setShortDescription(FilterTypeInput shortDescription) {
        this.shortDescription = Input.optional(shortDescription);
        return this;
    }

    /**
     * A short description of the product. Its use depends on the theme.
     */
    public ProductFilterInput setShortDescriptionInput(Input<FilterTypeInput> shortDescription) {
        if (shortDescription == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.shortDescription = shortDescription;
        return this;
    }

    /**
     * A number or code assigned to a product to identify the product, options, price, and manufacturer.
     */
    public FilterTypeInput getSku() {
        return sku.getValue();
    }

    /**
     * A number or code assigned to a product to identify the product, options, price, and manufacturer.
     */
    public Input<FilterTypeInput> getSkuInput() {
        return sku;
    }

    /**
     * A number or code assigned to a product to identify the product, options, price, and manufacturer.
     */
    public ProductFilterInput setSku(FilterTypeInput sku) {
        this.sku = Input.optional(sku);
        return this;
    }

    /**
     * A number or code assigned to a product to identify the product, options, price, and manufacturer.
     */
    public ProductFilterInput setSkuInput(Input<FilterTypeInput> sku) {
        if (sku == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.sku = sku;
        return this;
    }

    /**
     * The relative path to the small image, which is used on catalog pages.
     */
    public FilterTypeInput getSmallImage() {
        return smallImage.getValue();
    }

    /**
     * The relative path to the small image, which is used on catalog pages.
     */
    public Input<FilterTypeInput> getSmallImageInput() {
        return smallImage;
    }

    /**
     * The relative path to the small image, which is used on catalog pages.
     */
    public ProductFilterInput setSmallImage(FilterTypeInput smallImage) {
        this.smallImage = Input.optional(smallImage);
        return this;
    }

    /**
     * The relative path to the small image, which is used on catalog pages.
     */
    public ProductFilterInput setSmallImageInput(Input<FilterTypeInput> smallImage) {
        if (smallImage == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.smallImage = smallImage;
        return this;
    }

    /**
     * The label assigned to a product&#39;s small image.
     */
    public FilterTypeInput getSmallImageLabel() {
        return smallImageLabel.getValue();
    }

    /**
     * The label assigned to a product&#39;s small image.
     */
    public Input<FilterTypeInput> getSmallImageLabelInput() {
        return smallImageLabel;
    }

    /**
     * The label assigned to a product&#39;s small image.
     */
    public ProductFilterInput setSmallImageLabel(FilterTypeInput smallImageLabel) {
        this.smallImageLabel = Input.optional(smallImageLabel);
        return this;
    }

    /**
     * The label assigned to a product&#39;s small image.
     */
    public ProductFilterInput setSmallImageLabelInput(Input<FilterTypeInput> smallImageLabel) {
        if (smallImageLabel == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.smallImageLabel = smallImageLabel;
        return this;
    }

    /**
     * The beginning date that a product has a special price.
     */
    public FilterTypeInput getSpecialFromDate() {
        return specialFromDate.getValue();
    }

    /**
     * The beginning date that a product has a special price.
     */
    public Input<FilterTypeInput> getSpecialFromDateInput() {
        return specialFromDate;
    }

    /**
     * The beginning date that a product has a special price.
     */
    public ProductFilterInput setSpecialFromDate(FilterTypeInput specialFromDate) {
        this.specialFromDate = Input.optional(specialFromDate);
        return this;
    }

    /**
     * The beginning date that a product has a special price.
     */
    public ProductFilterInput setSpecialFromDateInput(Input<FilterTypeInput> specialFromDate) {
        if (specialFromDate == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.specialFromDate = specialFromDate;
        return this;
    }

    /**
     * The discounted price of the product. Do not include the currency code.
     */
    public FilterTypeInput getSpecialPrice() {
        return specialPrice.getValue();
    }

    /**
     * The discounted price of the product. Do not include the currency code.
     */
    public Input<FilterTypeInput> getSpecialPriceInput() {
        return specialPrice;
    }

    /**
     * The discounted price of the product. Do not include the currency code.
     */
    public ProductFilterInput setSpecialPrice(FilterTypeInput specialPrice) {
        this.specialPrice = Input.optional(specialPrice);
        return this;
    }

    /**
     * The discounted price of the product. Do not include the currency code.
     */
    public ProductFilterInput setSpecialPriceInput(Input<FilterTypeInput> specialPrice) {
        if (specialPrice == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.specialPrice = specialPrice;
        return this;
    }

    /**
     * The end date that a product has a special price.
     */
    public FilterTypeInput getSpecialToDate() {
        return specialToDate.getValue();
    }

    /**
     * The end date that a product has a special price.
     */
    public Input<FilterTypeInput> getSpecialToDateInput() {
        return specialToDate;
    }

    /**
     * The end date that a product has a special price.
     */
    public ProductFilterInput setSpecialToDate(FilterTypeInput specialToDate) {
        this.specialToDate = Input.optional(specialToDate);
        return this;
    }

    /**
     * The end date that a product has a special price.
     */
    public ProductFilterInput setSpecialToDateInput(Input<FilterTypeInput> specialToDate) {
        if (specialToDate == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.specialToDate = specialToDate;
        return this;
    }

    /**
     * The file name of a swatch image.
     */
    public FilterTypeInput getSwatchImage() {
        return swatchImage.getValue();
    }

    /**
     * The file name of a swatch image.
     */
    public Input<FilterTypeInput> getSwatchImageInput() {
        return swatchImage;
    }

    /**
     * The file name of a swatch image.
     */
    public ProductFilterInput setSwatchImage(FilterTypeInput swatchImage) {
        this.swatchImage = Input.optional(swatchImage);
        return this;
    }

    /**
     * The file name of a swatch image.
     */
    public ProductFilterInput setSwatchImageInput(Input<FilterTypeInput> swatchImage) {
        if (swatchImage == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.swatchImage = swatchImage;
        return this;
    }

    /**
     * The relative path to the product&#39;s thumbnail image.
     */
    public FilterTypeInput getThumbnail() {
        return thumbnail.getValue();
    }

    /**
     * The relative path to the product&#39;s thumbnail image.
     */
    public Input<FilterTypeInput> getThumbnailInput() {
        return thumbnail;
    }

    /**
     * The relative path to the product&#39;s thumbnail image.
     */
    public ProductFilterInput setThumbnail(FilterTypeInput thumbnail) {
        this.thumbnail = Input.optional(thumbnail);
        return this;
    }

    /**
     * The relative path to the product&#39;s thumbnail image.
     */
    public ProductFilterInput setThumbnailInput(Input<FilterTypeInput> thumbnail) {
        if (thumbnail == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.thumbnail = thumbnail;
        return this;
    }

    /**
     * The label assigned to a product&#39;s thumbnail image.
     */
    public FilterTypeInput getThumbnailLabel() {
        return thumbnailLabel.getValue();
    }

    /**
     * The label assigned to a product&#39;s thumbnail image.
     */
    public Input<FilterTypeInput> getThumbnailLabelInput() {
        return thumbnailLabel;
    }

    /**
     * The label assigned to a product&#39;s thumbnail image.
     */
    public ProductFilterInput setThumbnailLabel(FilterTypeInput thumbnailLabel) {
        this.thumbnailLabel = Input.optional(thumbnailLabel);
        return this;
    }

    /**
     * The label assigned to a product&#39;s thumbnail image.
     */
    public ProductFilterInput setThumbnailLabelInput(Input<FilterTypeInput> thumbnailLabel) {
        if (thumbnailLabel == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.thumbnailLabel = thumbnailLabel;
        return this;
    }

    /**
     * The price when tier pricing is in effect and the items purchased threshold has been reached.
     */
    public FilterTypeInput getTierPrice() {
        return tierPrice.getValue();
    }

    /**
     * The price when tier pricing is in effect and the items purchased threshold has been reached.
     */
    public Input<FilterTypeInput> getTierPriceInput() {
        return tierPrice;
    }

    /**
     * The price when tier pricing is in effect and the items purchased threshold has been reached.
     */
    public ProductFilterInput setTierPrice(FilterTypeInput tierPrice) {
        this.tierPrice = Input.optional(tierPrice);
        return this;
    }

    /**
     * The price when tier pricing is in effect and the items purchased threshold has been reached.
     */
    public ProductFilterInput setTierPriceInput(Input<FilterTypeInput> tierPrice) {
        if (tierPrice == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.tierPrice = tierPrice;
        return this;
    }

    /**
     * The timestamp indicating when the product was updated.
     */
    public FilterTypeInput getUpdatedAt() {
        return updatedAt.getValue();
    }

    /**
     * The timestamp indicating when the product was updated.
     */
    public Input<FilterTypeInput> getUpdatedAtInput() {
        return updatedAt;
    }

    /**
     * The timestamp indicating when the product was updated.
     */
    public ProductFilterInput setUpdatedAt(FilterTypeInput updatedAt) {
        this.updatedAt = Input.optional(updatedAt);
        return this;
    }

    /**
     * The timestamp indicating when the product was updated.
     */
    public ProductFilterInput setUpdatedAtInput(Input<FilterTypeInput> updatedAt) {
        if (updatedAt == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * The part of the URL that identifies the product
     */
    public FilterTypeInput getUrlKey() {
        return urlKey.getValue();
    }

    /**
     * The part of the URL that identifies the product
     */
    public Input<FilterTypeInput> getUrlKeyInput() {
        return urlKey;
    }

    /**
     * The part of the URL that identifies the product
     */
    public ProductFilterInput setUrlKey(FilterTypeInput urlKey) {
        this.urlKey = Input.optional(urlKey);
        return this;
    }

    /**
     * The part of the URL that identifies the product
     */
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

    /**
     * The weight of the item, in units defined by the store.
     */
    public FilterTypeInput getWeight() {
        return weight.getValue();
    }

    /**
     * The weight of the item, in units defined by the store.
     */
    public Input<FilterTypeInput> getWeightInput() {
        return weight;
    }

    /**
     * The weight of the item, in units defined by the store.
     */
    public ProductFilterInput setWeight(FilterTypeInput weight) {
        this.weight = Input.optional(weight);
        return this;
    }

    /**
     * The weight of the item, in units defined by the store.
     */
    public ProductFilterInput setWeightInput(Input<FilterTypeInput> weight) {
        if (weight == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.weight = weight;
        return this;
    }

    /**
     * Set custom filter.
     */
    public ProductFilterInput setCustomFilter(String name, Serializable filterInput) {
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

        if (this.isReturnable.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("is_returnable:");
            if (isReturnable.getValue() != null) {
                isReturnable.getValue().appendTo(_queryBuilder);
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

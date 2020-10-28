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

import java.util.List;

import com.shopify.graphql.support.CustomFieldInterface;
import com.shopify.graphql.support.ID;

/**
 * The ProductInterface contains attributes that are common to all types of products. Note that
 * descriptions may not be available for custom and EAV attributes.
 */

public interface ProductInterface extends CustomFieldInterface {
    String getGraphQlTypeName();

    /**
     * The attribute set assigned to the product.
     */
    Integer getAttributeSetId();

    /**
     * Relative canonical URL. This value is returned only if the system setting &#39;Use Canonical Link Meta
     * Tag For Products&#39; is enabled
     */
    String getCanonicalUrl();

    /**
     * The categories assigned to a product.
     */
    List<CategoryInterface> getCategories();

    Integer getColor();

    /**
     * The product&#39;s country of origin.
     */
    String getCountryOfManufacture();

    /**
     * Timestamp indicating when the product was created.
     */
    String getCreatedAt();

    /**
     * Crosssell Products
     */
    List<ProductInterface> getCrosssellProducts();

    /**
     * Detailed information about the product. The value can include simple HTML tags.
     */
    ComplexTextValue getDescription();

    /**
     * Indicates whether a gift message is available.
     */
    String getGiftMessageAvailable();

    /**
     * The ID number assigned to the product.
     */
    Integer getId();

    /**
     * The relative path to the main image on the product page.
     */
    ProductImage getImage();

    /**
     * Indicates whether the product can be returned
     */
    String getIsReturnable();

    /**
     * A number representing the product&#39;s manufacturer.
     */
    Integer getManufacturer();

    /**
     * An array of Media Gallery objects.
     */
    List<MediaGalleryInterface> getMediaGallery();

    /**
     * An array of MediaGalleryEntry objects.
     *
     * @deprecated Use product&#39;s `media_gallery` instead
     */
    @Deprecated
    List<MediaGalleryEntry> getMediaGalleryEntries();

    /**
     * A brief overview of the product for search results listings, maximum 255 characters.
     */
    String getMetaDescription();

    /**
     * A comma-separated list of keywords that are visible only to search engines.
     */
    String getMetaKeyword();

    /**
     * A string that is displayed in the title bar and tab of the browser and in search results lists.
     */
    String getMetaTitle();

    /**
     * The product name. Customers use this name to identify the product.
     */
    String getName();

    /**
     * The beginning date for new product listings, and determines if the product is featured as a new
     * product.
     */
    String getNewFromDate();

    /**
     * The end date for new product listings.
     */
    String getNewToDate();

    /**
     * Product stock only x left count
     */
    Double getOnlyXLeftInStock();

    /**
     * If the product has multiple options, determines where they appear on the product page.
     */
    String getOptionsContainer();

    /**
     * A ProductPrices object, indicating the price of an item.
     *
     * @deprecated Use price_range for product price information.
     */
    @Deprecated
    ProductPrices getPrice();

    /**
     * A PriceRange object, indicating the range of prices for the product
     */
    PriceRange getPriceRange();

    /**
     * An array of TierPrice objects.
     */
    List<TierPrice> getPriceTiers();

    /**
     * An array of ProductLinks objects.
     */
    List<ProductLinksInterface> getProductLinks();

    /**
     * The average of all the ratings given to the product.
     */
    Double getRatingSummary();

    /**
     * Related Products
     */
    List<ProductInterface> getRelatedProducts();

    /**
     * The total count of all the reviews given to the product.
     */
    Integer getReviewCount();

    /**
     * The list of products reviews.
     */
    ProductReviews getReviews();

    /**
     * A short description of the product. Its use depends on the theme.
     */
    ComplexTextValue getShortDescription();

    /**
     * A number or code assigned to a product to identify the product, options, price, and manufacturer.
     */
    String getSku();

    /**
     * The relative path to the small image, which is used on catalog pages.
     */
    ProductImage getSmallImage();

    /**
     * The beginning date that a product has a special price.
     */
    String getSpecialFromDate();

    /**
     * The discounted price of the product.
     */
    Double getSpecialPrice();

    /**
     * The end date that a product has a special price.
     */
    String getSpecialToDate();

    /**
     * Stock status of the product
     */
    ProductStockStatus getStockStatus();

    /**
     * The file name of a swatch image
     */
    String getSwatchImage();

    /**
     * The relative path to the product&#39;s thumbnail image.
     */
    ProductImage getThumbnail();

    /**
     * The price when tier pricing is in effect and the items purchased threshold has been reached.
     *
     * @deprecated Use price_tiers for product tier price information.
     */
    @Deprecated
    Double getTierPrice();

    /**
     * An array of ProductTierPrices objects.
     *
     * @deprecated Use price_tiers for product tier price information.
     */
    @Deprecated
    List<ProductTierPrices> getTierPrices();

    /**
     * One of simple, virtual, bundle, downloadable, grouped, or configurable.
     *
     * @deprecated Use __typename instead.
     */
    @Deprecated
    String getTypeId();

    /**
     * Timestamp indicating when the product was updated.
     */
    String getUpdatedAt();

    /**
     * Upsell Products
     */
    List<ProductInterface> getUpsellProducts();

    /**
     * The part of the URL that identifies the product
     */
    String getUrlKey();

    /**
     * @deprecated Use product&#39;s `canonical_url` or url rewrites instead
     */
    @Deprecated
    String getUrlPath();

    /**
     * URL rewrites list
     */
    List<UrlRewrite> getUrlRewrites();

    /**
     * The part of the product URL that is appended after the url key
     */
    String getUrlSuffix();

    /**
     * An array of websites in which the product is available.
     *
     * @deprecated The field should not be used on the storefront.
     */
    @Deprecated
    List<Website> getWebsites();
}

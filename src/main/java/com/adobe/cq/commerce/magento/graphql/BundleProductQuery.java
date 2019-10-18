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

import com.shopify.graphql.support.AbstractQuery;

/**
 * BundleProduct defines basic features of a bundle product and contains multiple BundleItems.
 */
public class BundleProductQuery extends AbstractQuery<BundleProductQuery> {
    BundleProductQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
     * The attribute set assigned to the product.
     */
    public BundleProductQuery attributeSetId() {
        startField("attribute_set_id");

        return this;
    }

    /**
     * Canonical URL.
     */
    public BundleProductQuery canonicalUrl() {
        startField("canonical_url");

        return this;
    }

    /**
     * The categories assigned to a product.
     */
    public BundleProductQuery categories(CategoryInterfaceQueryDefinition queryDef) {
        startField("categories");

        _queryBuilder.append('{');
        queryDef.define(new CategoryInterfaceQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public BundleProductQuery color() {
        startField("color");

        return this;
    }

    /**
     * The product&#39;s country of origin.
     */
    public BundleProductQuery countryOfManufacture() {
        startField("country_of_manufacture");

        return this;
    }

    /**
     * Timestamp indicating when the product was created.
     */
    public BundleProductQuery createdAt() {
        startField("created_at");

        return this;
    }

    /**
     * Crosssell Products
     */
    public BundleProductQuery crosssellProducts(ProductInterfaceQueryDefinition queryDef) {
        startField("crosssell_products");

        _queryBuilder.append('{');
        queryDef.define(new ProductInterfaceQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Detailed information about the product. The value can include simple HTML tags.
     */
    public BundleProductQuery description(ComplexTextValueQueryDefinition queryDef) {
        startField("description");

        _queryBuilder.append('{');
        queryDef.define(new ComplexTextValueQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Indicates whether the bundle product has a dynamic price.
     */
    public BundleProductQuery dynamicPrice() {
        startField("dynamic_price");

        return this;
    }

    /**
     * Indicates whether the bundle product has a dynamic SK.
     */
    public BundleProductQuery dynamicSku() {
        startField("dynamic_sku");

        return this;
    }

    /**
     * Indicates whether the bundle product has a dynamically calculated weight.
     */
    public BundleProductQuery dynamicWeight() {
        startField("dynamic_weight");

        return this;
    }

    /**
     * Indicates whether a gift message is available.
     */
    public BundleProductQuery giftMessageAvailable() {
        startField("gift_message_available");

        return this;
    }

    /**
     * The ID number assigned to the product.
     */
    public BundleProductQuery id() {
        startField("id");

        return this;
    }

    /**
     * The relative path to the main image on the product page.
     */
    public BundleProductQuery image(ProductImageQueryDefinition queryDef) {
        startField("image");

        _queryBuilder.append('{');
        queryDef.define(new ProductImageQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * An array containing information about individual bundle items.
     */
    public BundleProductQuery items(BundleItemQueryDefinition queryDef) {
        startField("items");

        _queryBuilder.append('{');
        queryDef.define(new BundleItemQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * A number representing the product&#39;s manufacturer.
     */
    public BundleProductQuery manufacturer() {
        startField("manufacturer");

        return this;
    }

    /**
     * An array of Media Gallery objects.
     */
    public BundleProductQuery mediaGallery(MediaGalleryInterfaceQueryDefinition queryDef) {
        startField("media_gallery");

        _queryBuilder.append('{');
        queryDef.define(new MediaGalleryInterfaceQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * An array of MediaGalleryEntry objects.
     */
    public BundleProductQuery mediaGalleryEntries(MediaGalleryEntryQueryDefinition queryDef) {
        startField("media_gallery_entries");

        _queryBuilder.append('{');
        queryDef.define(new MediaGalleryEntryQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * A brief overview of the product for search results listings, maximum 255 characters.
     */
    public BundleProductQuery metaDescription() {
        startField("meta_description");

        return this;
    }

    /**
     * A comma-separated list of keywords that are visible only to search engines.
     */
    public BundleProductQuery metaKeyword() {
        startField("meta_keyword");

        return this;
    }

    /**
     * A string that is displayed in the title bar and tab of the browser and in search results lists.
     */
    public BundleProductQuery metaTitle() {
        startField("meta_title");

        return this;
    }

    /**
     * The product name. Customers use this name to identify the product.
     */
    public BundleProductQuery name() {
        startField("name");

        return this;
    }

    /**
     * The beginning date for new product listings, and determines if the product is featured as a new
     * product.
     */
    public BundleProductQuery newFromDate() {
        startField("new_from_date");

        return this;
    }

    /**
     * The end date for new product listings.
     */
    public BundleProductQuery newToDate() {
        startField("new_to_date");

        return this;
    }

    /**
     * Product stock only x left count
     */
    public BundleProductQuery onlyXLeftInStock() {
        startField("only_x_left_in_stock");

        return this;
    }

    /**
     * An array of options for a customizable product.
     */
    public BundleProductQuery options(CustomizableOptionInterfaceQueryDefinition queryDef) {
        startField("options");

        _queryBuilder.append('{');
        queryDef.define(new CustomizableOptionInterfaceQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * If the product has multiple options, determines where they appear on the product page.
     */
    public BundleProductQuery optionsContainer() {
        startField("options_container");

        return this;
    }

    /**
     * A ProductPrices object, indicating the price of an item.
     */
    public BundleProductQuery price(ProductPricesQueryDefinition queryDef) {
        startField("price");

        _queryBuilder.append('{');
        queryDef.define(new ProductPricesQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * One of PRICE_RANGE or AS_LOW_AS.
     */
    public BundleProductQuery priceView() {
        startField("price_view");

        return this;
    }

    /**
     * An array of ProductLinks objects.
     */
    public BundleProductQuery productLinks(ProductLinksInterfaceQueryDefinition queryDef) {
        startField("product_links");

        _queryBuilder.append('{');
        queryDef.define(new ProductLinksInterfaceQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Related Products
     */
    public BundleProductQuery relatedProducts(ProductInterfaceQueryDefinition queryDef) {
        startField("related_products");

        _queryBuilder.append('{');
        queryDef.define(new ProductInterfaceQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Indicates whether to ship bundle items together or individually.
     */
    public BundleProductQuery shipBundleItems() {
        startField("ship_bundle_items");

        return this;
    }

    /**
     * A short description of the product. Its use depends on the theme.
     */
    public BundleProductQuery shortDescription(ComplexTextValueQueryDefinition queryDef) {
        startField("short_description");

        _queryBuilder.append('{');
        queryDef.define(new ComplexTextValueQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * A number or code assigned to a product to identify the product, options, price, and manufacturer.
     */
    public BundleProductQuery sku() {
        startField("sku");

        return this;
    }

    /**
     * The relative path to the small image, which is used on catalog pages.
     */
    public BundleProductQuery smallImage(ProductImageQueryDefinition queryDef) {
        startField("small_image");

        _queryBuilder.append('{');
        queryDef.define(new ProductImageQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The beginning date that a product has a special price.
     */
    public BundleProductQuery specialFromDate() {
        startField("special_from_date");

        return this;
    }

    /**
     * The discounted price of the product.
     */
    public BundleProductQuery specialPrice() {
        startField("special_price");

        return this;
    }

    /**
     * The end date that a product has a special price.
     */
    public BundleProductQuery specialToDate() {
        startField("special_to_date");

        return this;
    }

    /**
     * Stock status of the product
     */
    public BundleProductQuery stockStatus() {
        startField("stock_status");

        return this;
    }

    /**
     * The file name of a swatch image
     */
    public BundleProductQuery swatchImage() {
        startField("swatch_image");

        return this;
    }

    /**
     * The relative path to the product&#39;s thumbnail image.
     */
    public BundleProductQuery thumbnail(ProductImageQueryDefinition queryDef) {
        startField("thumbnail");

        _queryBuilder.append('{');
        queryDef.define(new ProductImageQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The price when tier pricing is in effect and the items purchased threshold has been reached.
     */
    public BundleProductQuery tierPrice() {
        startField("tier_price");

        return this;
    }

    /**
     * An array of ProductTierPrices objects.
     */
    public BundleProductQuery tierPrices(ProductTierPricesQueryDefinition queryDef) {
        startField("tier_prices");

        _queryBuilder.append('{');
        queryDef.define(new ProductTierPricesQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * One of simple, virtual, bundle, downloadable, grouped, or configurable.
     */
    public BundleProductQuery typeId() {
        startField("type_id");

        return this;
    }

    /**
     * Timestamp indicating when the product was updated.
     */
    public BundleProductQuery updatedAt() {
        startField("updated_at");

        return this;
    }

    /**
     * Upsell Products
     */
    public BundleProductQuery upsellProducts(ProductInterfaceQueryDefinition queryDef) {
        startField("upsell_products");

        _queryBuilder.append('{');
        queryDef.define(new ProductInterfaceQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The part of the URL that identifies the product
     */
    public BundleProductQuery urlKey() {
        startField("url_key");

        return this;
    }

    public BundleProductQuery urlPath() {
        startField("url_path");

        return this;
    }

    /**
     * URL rewrites list
     */
    public BundleProductQuery urlRewrites(UrlRewriteQueryDefinition queryDef) {
        startField("url_rewrites");

        _queryBuilder.append('{');
        queryDef.define(new UrlRewriteQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * An array of websites in which the product is available.
     */
    public BundleProductQuery websites(WebsiteQueryDefinition queryDef) {
        startField("websites");

        _queryBuilder.append('{');
        queryDef.define(new WebsiteQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The weight of the item, in units defined by the store.
     */
    public BundleProductQuery weight() {
        startField("weight");

        return this;
    }
}

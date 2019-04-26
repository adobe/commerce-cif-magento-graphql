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
 * A virtual product is non-tangible product that does not require shipping and is not kept in
 * inventory
 */
public class VirtualProductQuery extends AbstractQuery<VirtualProductQuery> {
    VirtualProductQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
     * The attribute set assigned to the product
     */
    public VirtualProductQuery attributeSetId() {
        startField("attribute_set_id");

        return this;
    }

    /**
     * Canonical URL
     */
    public VirtualProductQuery canonicalUrl() {
        startField("canonical_url");

        return this;
    }

    /**
     * The categories assigned to a product
     */
    public VirtualProductQuery categories(CategoryInterfaceQueryDefinition queryDef) {
        startField("categories");

        _queryBuilder.append('{');
        queryDef.define(new CategoryInterfaceQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public VirtualProductQuery color() {
        startField("color");

        return this;
    }

    /**
     * The product&#39;s country of origin
     */
    public VirtualProductQuery countryOfManufacture() {
        startField("country_of_manufacture");

        return this;
    }

    /**
     * Timestamp indicating when the product was created
     */
    public VirtualProductQuery createdAt() {
        startField("created_at");

        return this;
    }

    /**
     * Detailed information about the product. The value can include simple HTML tags.
     */
    public VirtualProductQuery description() {
        startField("description");

        return this;
    }

    /**
     * Indicates whether a gift message is available
     */
    public VirtualProductQuery giftMessageAvailable() {
        startField("gift_message_available");

        return this;
    }

    /**
     * The ID number assigned to the product
     */
    public VirtualProductQuery id() {
        startField("id");

        return this;
    }

    /**
     * The relative path to the main image on the product page
     */
    public VirtualProductQuery image() {
        startField("image");

        return this;
    }

    /**
     * The label assigned to a product image
     */
    public VirtualProductQuery imageLabel() {
        startField("image_label");

        return this;
    }

    /**
     * A number representing the product&#39;s manufacturer
     */
    public VirtualProductQuery manufacturer() {
        startField("manufacturer");

        return this;
    }

    /**
     * An array of MediaGalleryEntry objects
     */
    public VirtualProductQuery mediaGalleryEntries(MediaGalleryEntryQueryDefinition queryDef) {
        startField("media_gallery_entries");

        _queryBuilder.append('{');
        queryDef.define(new MediaGalleryEntryQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * A brief overview of the product for search results listings, maximum 255 characters
     */
    public VirtualProductQuery metaDescription() {
        startField("meta_description");

        return this;
    }

    /**
     * A comma-separated list of keywords that are visible only to search engines
     */
    public VirtualProductQuery metaKeyword() {
        startField("meta_keyword");

        return this;
    }

    /**
     * A string that is displayed in the title bar and tab of the browser and in search results lists
     */
    public VirtualProductQuery metaTitle() {
        startField("meta_title");

        return this;
    }

    /**
     * The product name. Customers use this name to identify the product.
     */
    public VirtualProductQuery name() {
        startField("name");

        return this;
    }

    /**
     * The beginning date for new product listings, and determines if the product is featured as a new
     * product
     */
    public VirtualProductQuery newFromDate() {
        startField("new_from_date");

        return this;
    }

    /**
     * The end date for new product listings
     */
    public VirtualProductQuery newToDate() {
        startField("new_to_date");

        return this;
    }

    /**
     * Product stock only x left count
     */
    public VirtualProductQuery onlyXLeftInStock() {
        startField("only_x_left_in_stock");

        return this;
    }

    /**
     * An array of options for a customizable product
     */
    public VirtualProductQuery options(CustomizableOptionInterfaceQueryDefinition queryDef) {
        startField("options");

        _queryBuilder.append('{');
        queryDef.define(new CustomizableOptionInterfaceQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * If the product has multiple options, determines where they appear on the product page
     */
    public VirtualProductQuery optionsContainer() {
        startField("options_container");

        return this;
    }

    /**
     * A ProductPrices object, indicating the price of an item
     */
    public VirtualProductQuery price(ProductPricesQueryDefinition queryDef) {
        startField("price");

        _queryBuilder.append('{');
        queryDef.define(new ProductPricesQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * An array of ProductLinks objects
     */
    public VirtualProductQuery productLinks(ProductLinksInterfaceQueryDefinition queryDef) {
        startField("product_links");

        _queryBuilder.append('{');
        queryDef.define(new ProductLinksInterfaceQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * A short description of the product. Its use depends on the theme.
     */
    public VirtualProductQuery shortDescription() {
        startField("short_description");

        return this;
    }

    /**
     * A number or code assigned to a product to identify the product, options, price, and manufacturer
     */
    public VirtualProductQuery sku() {
        startField("sku");

        return this;
    }

    /**
     * The relative path to the small image, which is used on catalog pages
     */
    public VirtualProductQuery smallImage() {
        startField("small_image");

        return this;
    }

    /**
     * The label assigned to a product&#39;s small image
     */
    public VirtualProductQuery smallImageLabel() {
        startField("small_image_label");

        return this;
    }

    /**
     * The beginning date that a product has a special price
     */
    public VirtualProductQuery specialFromDate() {
        startField("special_from_date");

        return this;
    }

    /**
     * The discounted price of the product
     */
    public VirtualProductQuery specialPrice() {
        startField("special_price");

        return this;
    }

    /**
     * The end date that a product has a special price
     */
    public VirtualProductQuery specialToDate() {
        startField("special_to_date");

        return this;
    }

    /**
     * Stock status of the product
     */
    public VirtualProductQuery stockStatus() {
        startField("stock_status");

        return this;
    }

    /**
     * The file name of a swatch image
     */
    public VirtualProductQuery swatchImage() {
        startField("swatch_image");

        return this;
    }

    /**
     * The relative path to the product&#39;s thumbnail image
     */
    public VirtualProductQuery thumbnail() {
        startField("thumbnail");

        return this;
    }

    /**
     * The label assigned to a product&#39;s thumbnail image
     */
    public VirtualProductQuery thumbnailLabel() {
        startField("thumbnail_label");

        return this;
    }

    /**
     * The price when tier pricing is in effect and the items purchased threshold has been reached
     */
    public VirtualProductQuery tierPrice() {
        startField("tier_price");

        return this;
    }

    /**
     * An array of ProductTierPrices objects
     */
    public VirtualProductQuery tierPrices(ProductTierPricesQueryDefinition queryDef) {
        startField("tier_prices");

        _queryBuilder.append('{');
        queryDef.define(new ProductTierPricesQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * One of simple, virtual, bundle, downloadable, grouped, or configurable
     */
    public VirtualProductQuery typeId() {
        startField("type_id");

        return this;
    }

    /**
     * Timestamp indicating when the product was updated
     */
    public VirtualProductQuery updatedAt() {
        startField("updated_at");

        return this;
    }

    /**
     * The part of the URL that identifies the product
     */
    public VirtualProductQuery urlKey() {
        startField("url_key");

        return this;
    }

    /**
     * The part of the URL that precedes the url_key
     */
    public VirtualProductQuery urlPath() {
        startField("url_path");

        return this;
    }

    /**
     * An array of websites in which the product is available
     */
    public VirtualProductQuery websites(WebsiteQueryDefinition queryDef) {
        startField("websites");

        _queryBuilder.append('{');
        queryDef.define(new WebsiteQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}

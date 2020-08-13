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

import com.shopify.graphql.support.AbstractQuery;
import com.shopify.graphql.support.Fragment;

/**
 * GroupedProduct defines a grouped product
 */
public class GroupedProductQuery extends AbstractQuery<GroupedProductQuery> {
    GroupedProductQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
     * The attribute set assigned to the product.
     */
    public GroupedProductQuery attributeSetId() {
        startField("attribute_set_id");

        return this;
    }

    /**
     * Relative canonical URL. This value is returned only if the system setting &#39;Use Canonical Link Meta
     * Tag For Products&#39; is enabled
     */
    public GroupedProductQuery canonicalUrl() {
        startField("canonical_url");

        return this;
    }

    /**
     * The categories assigned to a product.
     */
    public GroupedProductQuery categories(CategoryInterfaceQueryDefinition queryDef) {
        startField("categories");

        _queryBuilder.append('{');
        queryDef.define(new CategoryInterfaceQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public GroupedProductQuery color() {
        startField("color");

        return this;
    }

    /**
     * The product&#39;s country of origin.
     */
    public GroupedProductQuery countryOfManufacture() {
        startField("country_of_manufacture");

        return this;
    }

    /**
     * Timestamp indicating when the product was created.
     */
    public GroupedProductQuery createdAt() {
        startField("created_at");

        return this;
    }

    /**
     * Crosssell Products
     */
    public GroupedProductQuery crosssellProducts(ProductInterfaceQueryDefinition queryDef) {
        startField("crosssell_products");

        _queryBuilder.append('{');
        queryDef.define(new ProductInterfaceQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Detailed information about the product. The value can include simple HTML tags.
     */
    public GroupedProductQuery description(ComplexTextValueQueryDefinition queryDef) {
        startField("description");

        _queryBuilder.append('{');
        queryDef.define(new ComplexTextValueQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Indicates whether a gift message is available.
     */
    public GroupedProductQuery giftMessageAvailable() {
        startField("gift_message_available");

        return this;
    }

    /**
     * The ID number assigned to the product.
     */
    public GroupedProductQuery id() {
        startField("id");

        return this;
    }

    /**
     * The relative path to the main image on the product page.
     */
    public GroupedProductQuery image(ProductImageQueryDefinition queryDef) {
        startField("image");

        _queryBuilder.append('{');
        queryDef.define(new ProductImageQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * An array containing grouped product items
     */
    public GroupedProductQuery items(GroupedProductItemQueryDefinition queryDef) {
        startField("items");

        _queryBuilder.append('{');
        queryDef.define(new GroupedProductItemQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * A number representing the product&#39;s manufacturer.
     */
    public GroupedProductQuery manufacturer() {
        startField("manufacturer");

        return this;
    }

    /**
     * An array of Media Gallery objects.
     */
    public GroupedProductQuery mediaGallery(MediaGalleryInterfaceQueryDefinition queryDef) {
        startField("media_gallery");

        _queryBuilder.append('{');
        queryDef.define(new MediaGalleryInterfaceQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * An array of MediaGalleryEntry objects.
     *
     * @deprecated Use product&#39;s `media_gallery` instead
     */
    @Deprecated
    public GroupedProductQuery mediaGalleryEntries(MediaGalleryEntryQueryDefinition queryDef) {
        startField("media_gallery_entries");

        _queryBuilder.append('{');
        queryDef.define(new MediaGalleryEntryQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * A brief overview of the product for search results listings, maximum 255 characters.
     */
    public GroupedProductQuery metaDescription() {
        startField("meta_description");

        return this;
    }

    /**
     * A comma-separated list of keywords that are visible only to search engines.
     */
    public GroupedProductQuery metaKeyword() {
        startField("meta_keyword");

        return this;
    }

    /**
     * A string that is displayed in the title bar and tab of the browser and in search results lists.
     */
    public GroupedProductQuery metaTitle() {
        startField("meta_title");

        return this;
    }

    /**
     * The product name. Customers use this name to identify the product.
     */
    public GroupedProductQuery name() {
        startField("name");

        return this;
    }

    /**
     * The beginning date for new product listings, and determines if the product is featured as a new
     * product.
     */
    public GroupedProductQuery newFromDate() {
        startField("new_from_date");

        return this;
    }

    /**
     * The end date for new product listings.
     */
    public GroupedProductQuery newToDate() {
        startField("new_to_date");

        return this;
    }

    /**
     * Product stock only x left count
     */
    public GroupedProductQuery onlyXLeftInStock() {
        startField("only_x_left_in_stock");

        return this;
    }

    /**
     * If the product has multiple options, determines where they appear on the product page.
     */
    public GroupedProductQuery optionsContainer() {
        startField("options_container");

        return this;
    }

    /**
     * A ProductPrices object, indicating the price of an item.
     *
     * @deprecated Use price_range for product price information.
     */
    @Deprecated
    public GroupedProductQuery price(ProductPricesQueryDefinition queryDef) {
        startField("price");

        _queryBuilder.append('{');
        queryDef.define(new ProductPricesQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * A PriceRange object, indicating the range of prices for the product
     */
    public GroupedProductQuery priceRange(PriceRangeQueryDefinition queryDef) {
        startField("price_range");

        _queryBuilder.append('{');
        queryDef.define(new PriceRangeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * An array of TierPrice objects.
     */
    public GroupedProductQuery priceTiers(TierPriceQueryDefinition queryDef) {
        startField("price_tiers");

        _queryBuilder.append('{');
        queryDef.define(new TierPriceQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * An array of ProductLinks objects.
     */
    public GroupedProductQuery productLinks(ProductLinksInterfaceQueryDefinition queryDef) {
        startField("product_links");

        _queryBuilder.append('{');
        queryDef.define(new ProductLinksInterfaceQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Related Products
     */
    public GroupedProductQuery relatedProducts(ProductInterfaceQueryDefinition queryDef) {
        startField("related_products");

        _queryBuilder.append('{');
        queryDef.define(new ProductInterfaceQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * A short description of the product. Its use depends on the theme.
     */
    public GroupedProductQuery shortDescription(ComplexTextValueQueryDefinition queryDef) {
        startField("short_description");

        _queryBuilder.append('{');
        queryDef.define(new ComplexTextValueQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * A number or code assigned to a product to identify the product, options, price, and manufacturer.
     */
    public GroupedProductQuery sku() {
        startField("sku");

        return this;
    }

    /**
     * The relative path to the small image, which is used on catalog pages.
     */
    public GroupedProductQuery smallImage(ProductImageQueryDefinition queryDef) {
        startField("small_image");

        _queryBuilder.append('{');
        queryDef.define(new ProductImageQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The beginning date that a product has a special price.
     */
    public GroupedProductQuery specialFromDate() {
        startField("special_from_date");

        return this;
    }

    /**
     * The discounted price of the product.
     */
    public GroupedProductQuery specialPrice() {
        startField("special_price");

        return this;
    }

    /**
     * The end date that a product has a special price.
     */
    public GroupedProductQuery specialToDate() {
        startField("special_to_date");

        return this;
    }

    /**
     * Stock status of the product
     */
    public GroupedProductQuery stockStatus() {
        startField("stock_status");

        return this;
    }

    /**
     * The file name of a swatch image
     */
    public GroupedProductQuery swatchImage() {
        startField("swatch_image");

        return this;
    }

    /**
     * The relative path to the product&#39;s thumbnail image.
     */
    public GroupedProductQuery thumbnail(ProductImageQueryDefinition queryDef) {
        startField("thumbnail");

        _queryBuilder.append('{');
        queryDef.define(new ProductImageQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The price when tier pricing is in effect and the items purchased threshold has been reached.
     *
     * @deprecated Use price_tiers for product tier price information.
     */
    @Deprecated
    public GroupedProductQuery tierPrice() {
        startField("tier_price");

        return this;
    }

    /**
     * An array of ProductTierPrices objects.
     *
     * @deprecated Use price_tiers for product tier price information.
     */
    @Deprecated
    public GroupedProductQuery tierPrices(ProductTierPricesQueryDefinition queryDef) {
        startField("tier_prices");

        _queryBuilder.append('{');
        queryDef.define(new ProductTierPricesQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * One of simple, virtual, bundle, downloadable, grouped, or configurable.
     *
     * @deprecated Use __typename instead.
     */
    @Deprecated
    public GroupedProductQuery typeId() {
        startField("type_id");

        return this;
    }

    /**
     * Timestamp indicating when the product was updated.
     */
    public GroupedProductQuery updatedAt() {
        startField("updated_at");

        return this;
    }

    /**
     * Upsell Products
     */
    public GroupedProductQuery upsellProducts(ProductInterfaceQueryDefinition queryDef) {
        startField("upsell_products");

        _queryBuilder.append('{');
        queryDef.define(new ProductInterfaceQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The part of the URL that identifies the product
     */
    public GroupedProductQuery urlKey() {
        startField("url_key");

        return this;
    }

    /**
     * @deprecated Use product&#39;s `canonical_url` or url rewrites instead
     */
    @Deprecated
    public GroupedProductQuery urlPath() {
        startField("url_path");

        return this;
    }

    /**
     * URL rewrites list
     */
    public GroupedProductQuery urlRewrites(UrlRewriteQueryDefinition queryDef) {
        startField("url_rewrites");

        _queryBuilder.append('{');
        queryDef.define(new UrlRewriteQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The part of the product URL that is appended after the url key
     */
    public GroupedProductQuery urlSuffix() {
        startField("url_suffix");

        return this;
    }

    /**
     * An array of websites in which the product is available.
     *
     * @deprecated The field should not be used on the storefront.
     */
    @Deprecated
    public GroupedProductQuery websites(WebsiteQueryDefinition queryDef) {
        startField("websites");

        _queryBuilder.append('{');
        queryDef.define(new WebsiteQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The weight of the item, in units defined by the store.
     */
    public GroupedProductQuery weight() {
        startField("weight");

        return this;
    }

    /**
     * Creates a GraphQL "named" fragment with the specified query type definition.
     * The generics nature of fragments ensures that a fragment can only be used at the right place in the GraphQL request.
     * 
     * @param name The name of the fragment, must be unique for a given GraphQL request.
     * @param queryDef The fragment definition.
     * @return The fragment of a given generics type.
     */
    public static Fragment<GroupedProductQuery> createFragment(String name, GroupedProductQueryDefinition queryDef) {
        StringBuilder sb = new StringBuilder();
        queryDef.define(new GroupedProductQuery(sb));
        return new Fragment<>(name, "GroupedProduct", sb.toString());
    }

    /**
     * Adds a <code>GroupedProductQuery</code> fragment reference at the current position of the query.
     * For example for a fragment named <code>test</code>, calling this method will add the
     * reference <code>...test</code> in the query. For GraphQL types implementing an interface, there
     * will be some similar methods using the Query type of each implemented interface.
     * 
     * @param fragment The fragment to reference.
     */
    public GroupedProductQuery addFragmentReference(Fragment<GroupedProductQuery> fragment) {
        startField("..." + fragment.getName());
        return this;
    }

    /**
     * Adds a <code>PhysicalProductInterfaceQuery</code> fragment reference at the current position of the query.
     * For example for a fragment named <code>test</code>, calling this method will add the
     * reference <code>...test</code> in the query.
     * 
     * @param fragment The fragment to reference.
     */
    public GroupedProductQuery addPhysicalProductInterfaceFragmentReference(Fragment<PhysicalProductInterfaceQuery> fragment) {
        startField("..." + fragment.getName());
        return this;
    }

    /**
     * Adds a <code>ProductInterfaceQuery</code> fragment reference at the current position of the query.
     * For example for a fragment named <code>test</code>, calling this method will add the
     * reference <code>...test</code> in the query.
     * 
     * @param fragment The fragment to reference.
     */
    public GroupedProductQuery addProductInterfaceFragmentReference(Fragment<ProductInterfaceQuery> fragment) {
        startField("..." + fragment.getName());
        return this;
    }
}

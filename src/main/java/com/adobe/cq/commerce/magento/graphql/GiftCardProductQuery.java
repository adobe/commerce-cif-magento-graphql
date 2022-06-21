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
import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Fragment;

/**
 * Defines properties of a gift card.
 */
public class GiftCardProductQuery extends AbstractQuery<GiftCardProductQuery> {
    GiftCardProductQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
     * Indicates whether the customer can provide a message to accompany the gift card.
     */
    public GiftCardProductQuery allowMessage() {
        startField("allow_message");

        return this;
    }

    /**
     * Indicates whether shoppers have the ability to set the value of the gift card.
     */
    public GiftCardProductQuery allowOpenAmount() {
        startField("allow_open_amount");

        return this;
    }

    /**
     * The attribute set assigned to the product.
     *
     * @deprecated The field should not be used on the storefront.
     */
    @Deprecated
    public GiftCardProductQuery attributeSetId() {
        startField("attribute_set_id");

        return this;
    }

    /**
     * The relative canonical URL. This value is returned only if the system setting &#39;Use Canonical Link
     * Meta Tag For Products&#39; is enabled.
     */
    public GiftCardProductQuery canonicalUrl() {
        startField("canonical_url");

        return this;
    }

    /**
     * The categories assigned to a product.
     */
    public GiftCardProductQuery categories(CategoryInterfaceQueryDefinition queryDef) {
        startField("categories");

        _queryBuilder.append('{');
        queryDef.define(new CategoryInterfaceQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public GiftCardProductQuery color() {
        startField("color");

        return this;
    }

    /**
     * The product&#39;s country of origin.
     */
    public GiftCardProductQuery countryOfManufacture() {
        startField("country_of_manufacture");

        return this;
    }

    /**
     * Timestamp indicating when the product was created.
     *
     * @deprecated The field should not be used on the storefront.
     */
    @Deprecated
    public GiftCardProductQuery createdAt() {
        startField("created_at");

        return this;
    }

    /**
     * An array of cross-sell products.
     */
    public GiftCardProductQuery crosssellProducts(ProductInterfaceQueryDefinition queryDef) {
        startField("crosssell_products");

        _queryBuilder.append('{');
        queryDef.define(new ProductInterfaceQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Detailed information about the product. The value can include simple HTML tags.
     */
    public GiftCardProductQuery description(ComplexTextValueQueryDefinition queryDef) {
        startField("description");

        _queryBuilder.append('{');
        queryDef.define(new ComplexTextValueQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public GiftCardProductQuery fashionColor() {
        startField("fashion_color");

        return this;
    }

    public GiftCardProductQuery fashionMaterial() {
        startField("fashion_material");

        return this;
    }

    public GiftCardProductQuery fashionSize() {
        startField("fashion_size");

        return this;
    }

    public GiftCardProductQuery fashionStyle() {
        startField("fashion_style");

        return this;
    }

    public GiftCardProductQuery format() {
        startField("format");

        return this;
    }

    /**
     * An array of customizable gift card options.
     */
    public GiftCardProductQuery giftCardOptions(CustomizableOptionInterfaceQueryDefinition queryDef) {
        startField("gift_card_options");

        _queryBuilder.append('{');
        queryDef.define(new CustomizableOptionInterfaceQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Indicates whether a gift message is available.
     */
    public GiftCardProductQuery giftMessageAvailable() {
        startField("gift_message_available");

        return this;
    }

    /**
     * An array that contains information about the values and ID of a gift card.
     */
    public GiftCardProductQuery giftcardAmounts(GiftCardAmountsQueryDefinition queryDef) {
        startField("giftcard_amounts");

        _queryBuilder.append('{');
        queryDef.define(new GiftCardAmountsQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * An enumeration that specifies the type of gift card.
     */
    public GiftCardProductQuery giftcardType() {
        startField("giftcard_type");

        return this;
    }

    public GiftCardProductQuery hasVideo() {
        startField("has_video");

        return this;
    }

    /**
     * The ID number assigned to the product.
     *
     * @deprecated Use the `uid` field instead.
     */
    @Deprecated
    public GiftCardProductQuery id() {
        startField("id");

        return this;
    }

    /**
     * The relative path to the main image on the product page.
     */
    public GiftCardProductQuery image(ProductImageQueryDefinition queryDef) {
        startField("image");

        _queryBuilder.append('{');
        queryDef.define(new ProductImageQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Indicates whether the customer can redeem the value on the card for cash.
     */
    public GiftCardProductQuery isRedeemable() {
        startField("is_redeemable");

        return this;
    }

    /**
     * Indicates whether the product can be returned.
     */
    public GiftCardProductQuery isReturnable() {
        startField("is_returnable");

        return this;
    }

    /**
     * The number of days after purchase until the gift card expires. A null value means there is no limit.
     */
    public GiftCardProductQuery lifetime() {
        startField("lifetime");

        return this;
    }

    /**
     * A number representing the product&#39;s manufacturer.
     */
    public GiftCardProductQuery manufacturer() {
        startField("manufacturer");

        return this;
    }

    /**
     * An array of media gallery objects.
     */
    public GiftCardProductQuery mediaGallery(MediaGalleryInterfaceQueryDefinition queryDef) {
        startField("media_gallery");

        _queryBuilder.append('{');
        queryDef.define(new MediaGalleryInterfaceQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * An array of MediaGalleryEntry objects.
     *
     * @deprecated Use `media_gallery` instead.
     */
    @Deprecated
    public GiftCardProductQuery mediaGalleryEntries(MediaGalleryEntryQueryDefinition queryDef) {
        startField("media_gallery_entries");

        _queryBuilder.append('{');
        queryDef.define(new MediaGalleryEntryQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The maximum number of characters the gift message can contain.
     */
    public GiftCardProductQuery messageMaxLength() {
        startField("message_max_length");

        return this;
    }

    /**
     * A brief overview of the product for search results listings, maximum 255 characters.
     */
    public GiftCardProductQuery metaDescription() {
        startField("meta_description");

        return this;
    }

    /**
     * A comma-separated list of keywords that are visible only to search engines.
     */
    public GiftCardProductQuery metaKeyword() {
        startField("meta_keyword");

        return this;
    }

    /**
     * A string that is displayed in the title bar and tab of the browser and in search results lists.
     */
    public GiftCardProductQuery metaTitle() {
        startField("meta_title");

        return this;
    }

    /**
     * The product name. Customers use this name to identify the product.
     */
    public GiftCardProductQuery name() {
        startField("name");

        return this;
    }

    /**
     * The beginning date for new product listings, and determines if the product is featured as a new
     * product.
     *
     * @deprecated The field should not be used on the storefront.
     */
    @Deprecated
    public GiftCardProductQuery newFromDate() {
        startField("new_from_date");

        return this;
    }

    /**
     * The end date for new product listings.
     *
     * @deprecated The field should not be used on the storefront.
     */
    @Deprecated
    public GiftCardProductQuery newToDate() {
        startField("new_to_date");

        return this;
    }

    /**
     * Product stock only x left count
     */
    public GiftCardProductQuery onlyXLeftInStock() {
        startField("only_x_left_in_stock");

        return this;
    }

    /**
     * The maximum acceptable value of an open amount gift card.
     */
    public GiftCardProductQuery openAmountMax() {
        startField("open_amount_max");

        return this;
    }

    /**
     * The minimum acceptable value of an open amount gift card.
     */
    public GiftCardProductQuery openAmountMin() {
        startField("open_amount_min");

        return this;
    }

    /**
     * An array of options for a customizable product.
     */
    public GiftCardProductQuery options(CustomizableOptionInterfaceQueryDefinition queryDef) {
        startField("options");

        _queryBuilder.append('{');
        queryDef.define(new CustomizableOptionInterfaceQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * If the product has multiple options, determines where they appear on the product page.
     */
    public GiftCardProductQuery optionsContainer() {
        startField("options_container");

        return this;
    }

    /**
     * Indicates the price of an item.
     *
     * @deprecated Use `price_range` for product price information.
     */
    @Deprecated
    public GiftCardProductQuery price(ProductPricesQueryDefinition queryDef) {
        startField("price");

        _queryBuilder.append('{');
        queryDef.define(new ProductPricesQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The range of prices for the product
     */
    public GiftCardProductQuery priceRange(PriceRangeQueryDefinition queryDef) {
        startField("price_range");

        _queryBuilder.append('{');
        queryDef.define(new PriceRangeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * An array of `TierPrice` objects.
     */
    public GiftCardProductQuery priceTiers(TierPriceQueryDefinition queryDef) {
        startField("price_tiers");

        _queryBuilder.append('{');
        queryDef.define(new TierPriceQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * An array of `ProductLinks` objects.
     */
    public GiftCardProductQuery productLinks(ProductLinksInterfaceQueryDefinition queryDef) {
        startField("product_links");

        _queryBuilder.append('{');
        queryDef.define(new ProductLinksInterfaceQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public GiftCardProductQuery purpose() {
        startField("purpose");

        return this;
    }

    /**
     * The average of all the ratings given to the product.
     */
    public GiftCardProductQuery ratingSummary() {
        startField("rating_summary");

        return this;
    }

    /**
     * Contains 0 when there is no redirect error. A value of 301 indicates the URL of the requested
     * resource has been changed permanently, while a value of 302 indicates a temporary redirect.
     */
    public GiftCardProductQuery redirectCode() {
        startField("redirect_code");

        return this;
    }

    /**
     * An array of related products.
     */
    public GiftCardProductQuery relatedProducts(ProductInterfaceQueryDefinition queryDef) {
        startField("related_products");

        _queryBuilder.append('{');
        queryDef.define(new ProductInterfaceQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The internal relative URL. If the specified URL is a redirect, the query returns the redirected URL,
     * not the original.
     */
    public GiftCardProductQuery relativeUrl() {
        startField("relative_url");

        return this;
    }

    /**
     * The total count of all the reviews given to the product.
     */
    public GiftCardProductQuery reviewCount() {
        startField("review_count");

        return this;
    }

    public class ReviewsArguments extends Arguments {
        ReviewsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
         * The maximum number of results to return at once. The default is 20.
         */
        public ReviewsArguments pageSize(Integer value) {
            if (value != null) {
                startArgument("pageSize");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
         * The page of results to return. The default is 1.
         */
        public ReviewsArguments currentPage(Integer value) {
            if (value != null) {
                startArgument("currentPage");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface ReviewsArgumentsDefinition {
        void define(ReviewsArguments args);
    }

    /**
     * The list of products reviews.
     */
    public GiftCardProductQuery reviews(ProductReviewsQueryDefinition queryDef) {
        return reviews(args -> {}, queryDef);
    }

    /**
     * The list of products reviews.
     */
    public GiftCardProductQuery reviews(ReviewsArgumentsDefinition argsDef, ProductReviewsQueryDefinition queryDef) {
        startField("reviews");

        ReviewsArguments args = new ReviewsArguments(_queryBuilder);
        argsDef.define(args);
        ReviewsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ProductReviewsQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * A short description of the product. Its use depends on the theme.
     */
    public GiftCardProductQuery shortDescription(ComplexTextValueQueryDefinition queryDef) {
        startField("short_description");

        _queryBuilder.append('{');
        queryDef.define(new ComplexTextValueQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * A number or code assigned to a product to identify the product, options, price, and manufacturer.
     */
    public GiftCardProductQuery sku() {
        startField("sku");

        return this;
    }

    /**
     * The relative path to the small image, which is used on catalog pages.
     */
    public GiftCardProductQuery smallImage(ProductImageQueryDefinition queryDef) {
        startField("small_image");

        _queryBuilder.append('{');
        queryDef.define(new ProductImageQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The beginning date that a product has a special price.
     *
     * @deprecated The field should not be used on the storefront.
     */
    @Deprecated
    public GiftCardProductQuery specialFromDate() {
        startField("special_from_date");

        return this;
    }

    /**
     * The discounted price of the product.
     */
    public GiftCardProductQuery specialPrice() {
        startField("special_price");

        return this;
    }

    /**
     * The end date for a product with a special price.
     */
    public GiftCardProductQuery specialToDate() {
        startField("special_to_date");

        return this;
    }

    /**
     * Indicates whether the product is staged for a future campaign.
     */
    public GiftCardProductQuery staged() {
        startField("staged");

        return this;
    }

    /**
     * Stock status of the product
     */
    public GiftCardProductQuery stockStatus() {
        startField("stock_status");

        return this;
    }

    /**
     * The file name of a swatch image.
     */
    public GiftCardProductQuery swatchImage() {
        startField("swatch_image");

        return this;
    }

    /**
     * The relative path to the product&#39;s thumbnail image.
     */
    public GiftCardProductQuery thumbnail(ProductImageQueryDefinition queryDef) {
        startField("thumbnail");

        _queryBuilder.append('{');
        queryDef.define(new ProductImageQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The price when tier pricing is in effect and the items purchased threshold has been reached.
     *
     * @deprecated Use `price_tiers` for product tier price information.
     */
    @Deprecated
    public GiftCardProductQuery tierPrice() {
        startField("tier_price");

        return this;
    }

    /**
     * An array of ProductTierPrices objects.
     *
     * @deprecated Use `price_tiers` for product tier price information.
     */
    @Deprecated
    public GiftCardProductQuery tierPrices(ProductTierPricesQueryDefinition queryDef) {
        startField("tier_prices");

        _queryBuilder.append('{');
        queryDef.define(new ProductTierPricesQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * One of PRODUCT, CATEGORY, or CMS_PAGE.
     */
    public GiftCardProductQuery type() {
        startField("type");

        return this;
    }

    /**
     * One of simple, virtual, bundle, downloadable, grouped, or configurable.
     *
     * @deprecated Use `__typename` instead.
     */
    @Deprecated
    public GiftCardProductQuery typeId() {
        startField("type_id");

        return this;
    }

    /**
     * The unique ID for a `ProductInterface` object.
     */
    public GiftCardProductQuery uid() {
        startField("uid");

        return this;
    }

    /**
     * Timestamp indicating when the product was updated.
     *
     * @deprecated The field should not be used on the storefront.
     */
    @Deprecated
    public GiftCardProductQuery updatedAt() {
        startField("updated_at");

        return this;
    }

    /**
     * An array of up-sell products.
     */
    public GiftCardProductQuery upsellProducts(ProductInterfaceQueryDefinition queryDef) {
        startField("upsell_products");

        _queryBuilder.append('{');
        queryDef.define(new ProductInterfaceQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The part of the URL that identifies the product
     */
    public GiftCardProductQuery urlKey() {
        startField("url_key");

        return this;
    }

    /**
     * @deprecated Use product&#39;s `canonical_url` or url rewrites instead
     */
    @Deprecated
    public GiftCardProductQuery urlPath() {
        startField("url_path");

        return this;
    }

    /**
     * URL rewrites list
     */
    public GiftCardProductQuery urlRewrites(UrlRewriteQueryDefinition queryDef) {
        startField("url_rewrites");

        _queryBuilder.append('{');
        queryDef.define(new UrlRewriteQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The part of the product URL that is appended after the url key
     */
    public GiftCardProductQuery urlSuffix() {
        startField("url_suffix");

        return this;
    }

    public GiftCardProductQuery videoFile() {
        startField("video_file");

        return this;
    }

    /**
     * An array of websites in which the product is available.
     *
     * @deprecated The field should not be used on the storefront.
     */
    @Deprecated
    public GiftCardProductQuery websites(WebsiteQueryDefinition queryDef) {
        startField("websites");

        _queryBuilder.append('{');
        queryDef.define(new WebsiteQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The weight of the item, in units defined by the store.
     */
    public GiftCardProductQuery weight() {
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
    public static Fragment<GiftCardProductQuery> createFragment(String name, GiftCardProductQueryDefinition queryDef) {
        StringBuilder sb = new StringBuilder();
        queryDef.define(new GiftCardProductQuery(sb));
        return new Fragment<>(name, "GiftCardProduct", sb.toString());
    }

    /**
     * Adds a <code>GiftCardProductQuery</code> fragment reference at the current position of the query.
     * For example for a fragment named <code>test</code>, calling this method will add the
     * reference <code>...test</code> in the query. For GraphQL types implementing an interface, there
     * will be some similar methods using the Query type of each implemented interface.
     * 
     * @param fragment The fragment to reference.
     */
    public GiftCardProductQuery addFragmentReference(Fragment<GiftCardProductQuery> fragment) {
        startField("..." + fragment.getName());
        return this;
    }

    /**
     * Adds a <code>CustomizableProductInterfaceQuery</code> fragment reference at the current position of the query.
     * For example for a fragment named <code>test</code>, calling this method will add the
     * reference <code>...test</code> in the query.
     * 
     * @param fragment The fragment to reference.
     */
    public GiftCardProductQuery addCustomizableProductInterfaceFragmentReference(Fragment<CustomizableProductInterfaceQuery> fragment) {
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
    public GiftCardProductQuery addPhysicalProductInterfaceFragmentReference(Fragment<PhysicalProductInterfaceQuery> fragment) {
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
    public GiftCardProductQuery addProductInterfaceFragmentReference(Fragment<ProductInterfaceQuery> fragment) {
        startField("..." + fragment.getName());
        return this;
    }

    /**
     * Adds a <code>RoutableInterfaceQuery</code> fragment reference at the current position of the query.
     * For example for a fragment named <code>test</code>, calling this method will add the
     * reference <code>...test</code> in the query.
     * 
     * @param fragment The fragment to reference.
     */
    public GiftCardProductQuery addRoutableInterfaceFragmentReference(Fragment<RoutableInterfaceQuery> fragment) {
        startField("..." + fragment.getName());
        return this;
    }
}

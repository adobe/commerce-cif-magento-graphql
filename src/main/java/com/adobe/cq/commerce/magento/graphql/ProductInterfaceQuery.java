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
 * The ProductInterface contains attributes that are common to all types of products. Note that
 * descriptions may not be available for custom and EAV attributes.
 */
public class ProductInterfaceQuery extends AbstractQuery<ProductInterfaceQuery> {
    ProductInterfaceQuery(StringBuilder _queryBuilder) {
        this(_queryBuilder, true);
    }

    ProductInterfaceQuery(StringBuilder _queryBuilder, boolean addTypename) {
        super(_queryBuilder);
        if (addTypename) {
            startField("__typename");
        }
    }

    /**
     * The attribute set assigned to the product.
     *
     * @deprecated The field should not be used on the storefront.
     */
    @Deprecated
    public ProductInterfaceQuery attributeSetId() {
        startField("attribute_set_id");

        return this;
    }

    /**
     * Relative canonical URL. This value is returned only if the system setting &#39;Use Canonical Link Meta
     * Tag For Products&#39; is enabled
     */
    public ProductInterfaceQuery canonicalUrl() {
        startField("canonical_url");

        return this;
    }

    /**
     * The categories assigned to a product.
     */
    public ProductInterfaceQuery categories(CategoryInterfaceQueryDefinition queryDef) {
        startField("categories");

        _queryBuilder.append('{');
        queryDef.define(new CategoryInterfaceQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public ProductInterfaceQuery color() {
        startField("color");

        return this;
    }

    /**
     * The product&#39;s country of origin.
     */
    public ProductInterfaceQuery countryOfManufacture() {
        startField("country_of_manufacture");

        return this;
    }

    /**
     * Timestamp indicating when the product was created.
     *
     * @deprecated The field should not be used on the storefront.
     */
    @Deprecated
    public ProductInterfaceQuery createdAt() {
        startField("created_at");

        return this;
    }

    /**
     * Crosssell Products
     */
    public ProductInterfaceQuery crosssellProducts(ProductInterfaceQueryDefinition queryDef) {
        startField("crosssell_products");

        _queryBuilder.append('{');
        queryDef.define(new ProductInterfaceQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Detailed information about the product. The value can include simple HTML tags.
     */
    public ProductInterfaceQuery description(ComplexTextValueQueryDefinition queryDef) {
        startField("description");

        _queryBuilder.append('{');
        queryDef.define(new ComplexTextValueQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Indicates whether a gift message is available.
     */
    public ProductInterfaceQuery giftMessageAvailable() {
        startField("gift_message_available");

        return this;
    }

    /**
     * The ID number assigned to the product.
     *
     * @deprecated Use the `uid` field instead.
     */
    @Deprecated
    public ProductInterfaceQuery id() {
        startField("id");

        return this;
    }

    /**
     * The relative path to the main image on the product page.
     */
    public ProductInterfaceQuery image(ProductImageQueryDefinition queryDef) {
        startField("image");

        _queryBuilder.append('{');
        queryDef.define(new ProductImageQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Indicates whether the product can be returned
     */
    public ProductInterfaceQuery isReturnable() {
        startField("is_returnable");

        return this;
    }

    /**
     * A number representing the product&#39;s manufacturer.
     */
    public ProductInterfaceQuery manufacturer() {
        startField("manufacturer");

        return this;
    }

    /**
     * An array of Media Gallery objects.
     */
    public ProductInterfaceQuery mediaGallery(MediaGalleryInterfaceQueryDefinition queryDef) {
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
    public ProductInterfaceQuery mediaGalleryEntries(MediaGalleryEntryQueryDefinition queryDef) {
        startField("media_gallery_entries");

        _queryBuilder.append('{');
        queryDef.define(new MediaGalleryEntryQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * A brief overview of the product for search results listings, maximum 255 characters.
     */
    public ProductInterfaceQuery metaDescription() {
        startField("meta_description");

        return this;
    }

    /**
     * A comma-separated list of keywords that are visible only to search engines.
     */
    public ProductInterfaceQuery metaKeyword() {
        startField("meta_keyword");

        return this;
    }

    /**
     * A string that is displayed in the title bar and tab of the browser and in search results lists.
     */
    public ProductInterfaceQuery metaTitle() {
        startField("meta_title");

        return this;
    }

    /**
     * The product name. Customers use this name to identify the product.
     */
    public ProductInterfaceQuery name() {
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
    public ProductInterfaceQuery newFromDate() {
        startField("new_from_date");

        return this;
    }

    /**
     * The end date for new product listings.
     *
     * @deprecated The field should not be used on the storefront.
     */
    @Deprecated
    public ProductInterfaceQuery newToDate() {
        startField("new_to_date");

        return this;
    }

    /**
     * Product stock only x left count
     */
    public ProductInterfaceQuery onlyXLeftInStock() {
        startField("only_x_left_in_stock");

        return this;
    }

    /**
     * If the product has multiple options, determines where they appear on the product page.
     */
    public ProductInterfaceQuery optionsContainer() {
        startField("options_container");

        return this;
    }

    /**
     * A ProductPrices object, indicating the price of an item.
     *
     * @deprecated Use price_range for product price information.
     */
    @Deprecated
    public ProductInterfaceQuery price(ProductPricesQueryDefinition queryDef) {
        startField("price");

        _queryBuilder.append('{');
        queryDef.define(new ProductPricesQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * A PriceRange object, indicating the range of prices for the product
     */
    public ProductInterfaceQuery priceRange(PriceRangeQueryDefinition queryDef) {
        startField("price_range");

        _queryBuilder.append('{');
        queryDef.define(new PriceRangeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * An array of TierPrice objects.
     */
    public ProductInterfaceQuery priceTiers(TierPriceQueryDefinition queryDef) {
        startField("price_tiers");

        _queryBuilder.append('{');
        queryDef.define(new TierPriceQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * An array of ProductLinks objects.
     */
    public ProductInterfaceQuery productLinks(ProductLinksInterfaceQueryDefinition queryDef) {
        startField("product_links");

        _queryBuilder.append('{');
        queryDef.define(new ProductLinksInterfaceQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The average of all the ratings given to the product.
     */
    public ProductInterfaceQuery ratingSummary() {
        startField("rating_summary");

        return this;
    }

    /**
     * Related Products
     */
    public ProductInterfaceQuery relatedProducts(ProductInterfaceQueryDefinition queryDef) {
        startField("related_products");

        _queryBuilder.append('{');
        queryDef.define(new ProductInterfaceQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The total count of all the reviews given to the product.
     */
    public ProductInterfaceQuery reviewCount() {
        startField("review_count");

        return this;
    }

    public class ReviewsArguments extends Arguments {
        ReviewsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
         * Specifies the maximum number of results to return at once.
         */
        public ReviewsArguments pageSize(Integer value) {
            if (value != null) {
                startArgument("pageSize");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
         * Specifies which page of results to return.
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
    public ProductInterfaceQuery reviews(ProductReviewsQueryDefinition queryDef) {
        return reviews(args -> {}, queryDef);
    }

    /**
     * The list of products reviews.
     */
    public ProductInterfaceQuery reviews(ReviewsArgumentsDefinition argsDef, ProductReviewsQueryDefinition queryDef) {
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
    public ProductInterfaceQuery shortDescription(ComplexTextValueQueryDefinition queryDef) {
        startField("short_description");

        _queryBuilder.append('{');
        queryDef.define(new ComplexTextValueQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * A number or code assigned to a product to identify the product, options, price, and manufacturer.
     */
    public ProductInterfaceQuery sku() {
        startField("sku");

        return this;
    }

    /**
     * The relative path to the small image, which is used on catalog pages.
     */
    public ProductInterfaceQuery smallImage(ProductImageQueryDefinition queryDef) {
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
    public ProductInterfaceQuery specialFromDate() {
        startField("special_from_date");

        return this;
    }

    /**
     * The discounted price of the product.
     */
    public ProductInterfaceQuery specialPrice() {
        startField("special_price");

        return this;
    }

    /**
     * The end date that a product has a special price.
     */
    public ProductInterfaceQuery specialToDate() {
        startField("special_to_date");

        return this;
    }

    public ProductInterfaceQuery staged() {
        startField("staged");

        return this;
    }

    /**
     * Stock status of the product
     */
    public ProductInterfaceQuery stockStatus() {
        startField("stock_status");

        return this;
    }

    /**
     * The file name of a swatch image
     */
    public ProductInterfaceQuery swatchImage() {
        startField("swatch_image");

        return this;
    }

    /**
     * The relative path to the product&#39;s thumbnail image.
     */
    public ProductInterfaceQuery thumbnail(ProductImageQueryDefinition queryDef) {
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
    public ProductInterfaceQuery tierPrice() {
        startField("tier_price");

        return this;
    }

    /**
     * An array of ProductTierPrices objects.
     *
     * @deprecated Use price_tiers for product tier price information.
     */
    @Deprecated
    public ProductInterfaceQuery tierPrices(ProductTierPricesQueryDefinition queryDef) {
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
    public ProductInterfaceQuery typeId() {
        startField("type_id");

        return this;
    }

    /**
     * The unique ID for a `ProductInterface` object.
     */
    public ProductInterfaceQuery uid() {
        startField("uid");

        return this;
    }

    /**
     * Timestamp indicating when the product was updated.
     *
     * @deprecated The field should not be used on the storefront.
     */
    @Deprecated
    public ProductInterfaceQuery updatedAt() {
        startField("updated_at");

        return this;
    }

    /**
     * Upsell Products
     */
    public ProductInterfaceQuery upsellProducts(ProductInterfaceQueryDefinition queryDef) {
        startField("upsell_products");

        _queryBuilder.append('{');
        queryDef.define(new ProductInterfaceQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The part of the URL that identifies the product
     */
    public ProductInterfaceQuery urlKey() {
        startField("url_key");

        return this;
    }

    /**
     * @deprecated Use product&#39;s `canonical_url` or url rewrites instead
     */
    @Deprecated
    public ProductInterfaceQuery urlPath() {
        startField("url_path");

        return this;
    }

    /**
     * URL rewrites list
     */
    public ProductInterfaceQuery urlRewrites(UrlRewriteQueryDefinition queryDef) {
        startField("url_rewrites");

        _queryBuilder.append('{');
        queryDef.define(new UrlRewriteQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The part of the product URL that is appended after the url key
     */
    public ProductInterfaceQuery urlSuffix() {
        startField("url_suffix");

        return this;
    }

    /**
     * An array of websites in which the product is available.
     *
     * @deprecated The field should not be used on the storefront.
     */
    @Deprecated
    public ProductInterfaceQuery websites(WebsiteQueryDefinition queryDef) {
        startField("websites");

        _queryBuilder.append('{');
        queryDef.define(new WebsiteQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public ProductInterfaceQuery onBundleProduct(BundleProductQueryDefinition queryDef) {
        startInlineFragment("BundleProduct");
        queryDef.define(new BundleProductQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public ProductInterfaceQuery onConfigurableProduct(ConfigurableProductQueryDefinition queryDef) {
        startInlineFragment("ConfigurableProduct");
        queryDef.define(new ConfigurableProductQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public ProductInterfaceQuery onDownloadableProduct(DownloadableProductQueryDefinition queryDef) {
        startInlineFragment("DownloadableProduct");
        queryDef.define(new DownloadableProductQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public ProductInterfaceQuery onGiftCardProduct(GiftCardProductQueryDefinition queryDef) {
        startInlineFragment("GiftCardProduct");
        queryDef.define(new GiftCardProductQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public ProductInterfaceQuery onGroupedProduct(GroupedProductQueryDefinition queryDef) {
        startInlineFragment("GroupedProduct");
        queryDef.define(new GroupedProductQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public ProductInterfaceQuery onSimpleProduct(SimpleProductQueryDefinition queryDef) {
        startInlineFragment("SimpleProduct");
        queryDef.define(new SimpleProductQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public ProductInterfaceQuery onVirtualProduct(VirtualProductQueryDefinition queryDef) {
        startInlineFragment("VirtualProduct");
        queryDef.define(new VirtualProductQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public ProductInterfaceQuery onCustomizableProductInterface(CustomizableProductInterfaceQueryDefinition queryDef) {
        startInlineFragment("CustomizableProductInterface");
        queryDef.define(new CustomizableProductInterfaceQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public ProductInterfaceQuery onPhysicalProductInterface(PhysicalProductInterfaceQueryDefinition queryDef) {
        startInlineFragment("PhysicalProductInterface");
        queryDef.define(new PhysicalProductInterfaceQuery(_queryBuilder));
        _queryBuilder.append('}');
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
    public static Fragment<ProductInterfaceQuery> createFragment(String name, ProductInterfaceQueryDefinition queryDef) {
        StringBuilder sb = new StringBuilder();
        queryDef.define(new ProductInterfaceQuery(sb, false));
        return new Fragment<>(name, "ProductInterface", sb.toString());
    }

    /**
     * Adds a <code>ProductInterfaceQuery</code> fragment reference at the current position of the query.
     * For example for a fragment named <code>test</code>, calling this method will add the
     * reference <code>...test</code> in the query. For GraphQL types implementing an interface, there
     * will be some similar methods using the Query type of each implemented interface.
     * 
     * @param fragment The fragment to reference.
     */
    public ProductInterfaceQuery addFragmentReference(Fragment<ProductInterfaceQuery> fragment) {
        startField("..." + fragment.getName());
        return this;
    }
}

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

import com.shopify.graphql.support.AbstractQuery;
import com.shopify.graphql.support.Fragment;
import com.shopify.graphql.support.ID;

/**
 * The type contains information about a store config
 */
public class StoreConfigQuery extends AbstractQuery<StoreConfigQuery> {
    StoreConfigQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
     * Footer Miscellaneous HTML
     */
    public StoreConfigQuery absoluteFooter() {
        startField("absolute_footer");

        return this;
    }

    /**
     * Allow Gift Receipt
     */
    public StoreConfigQuery allowGiftReceipt() {
        startField("allow_gift_receipt");

        return this;
    }

    /**
     * Allow Gift Wrapping on Order Level
     */
    public StoreConfigQuery allowGiftWrappingOnOrder() {
        startField("allow_gift_wrapping_on_order");

        return this;
    }

    /**
     * Allow Gift Wrapping for Order Items
     */
    public StoreConfigQuery allowGiftWrappingOnOrderItems() {
        startField("allow_gift_wrapping_on_order_items");

        return this;
    }

    /**
     * Indicates whether guest users can write product reviews. Possible values: 1 (Yes) and 0 (No)
     */
    public StoreConfigQuery allowGuestsToWriteProductReviews() {
        startField("allow_guests_to_write_product_reviews");

        return this;
    }

    /**
     * The value of the Allow Gift Messages for Order Items option
     */
    public StoreConfigQuery allowItems() {
        startField("allow_items");

        return this;
    }

    /**
     * The value of the Allow Gift Messages on Order Level option
     */
    public StoreConfigQuery allowOrder() {
        startField("allow_order");

        return this;
    }

    /**
     * Allow Printed Card
     */
    public StoreConfigQuery allowPrintedCard() {
        startField("allow_printed_card");

        return this;
    }

    /**
     * Enable autocomplete on login and forgot password forms
     */
    public StoreConfigQuery autocompleteOnStorefront() {
        startField("autocomplete_on_storefront");

        return this;
    }

    /**
     * Base currency code
     */
    public StoreConfigQuery baseCurrencyCode() {
        startField("base_currency_code");

        return this;
    }

    /**
     * Base link URL for the store
     */
    public StoreConfigQuery baseLinkUrl() {
        startField("base_link_url");

        return this;
    }

    /**
     * Base media URL for the store
     */
    public StoreConfigQuery baseMediaUrl() {
        startField("base_media_url");

        return this;
    }

    /**
     * Base static URL for the store
     */
    public StoreConfigQuery baseStaticUrl() {
        startField("base_static_url");

        return this;
    }

    /**
     * Base URL for the store
     */
    public StoreConfigQuery baseUrl() {
        startField("base_url");

        return this;
    }

    /**
     * Display Gift Wrapping Prices
     */
    public StoreConfigQuery cartGiftWrapping() {
        startField("cart_gift_wrapping");

        return this;
    }

    /**
     * Display Printed Card Prices
     */
    public StoreConfigQuery cartPrintedCard() {
        startField("cart_printed_card");

        return this;
    }

    /**
     * Default Sort By.
     */
    public StoreConfigQuery catalogDefaultSortBy() {
        startField("catalog_default_sort_by");

        return this;
    }

    /**
     * Corresponds to the &#39;Display Prices In Product Lists&#39; field. It indicates how FPT information is
     * displayed on category pages
     */
    public StoreConfigQuery categoryFixedProductTaxDisplaySetting() {
        startField("category_fixed_product_tax_display_setting");

        return this;
    }

    /**
     * Category URL Suffix.
     */
    public StoreConfigQuery categoryUrlSuffix() {
        startField("category_url_suffix");

        return this;
    }

    /**
     * CMS Home Page
     */
    public StoreConfigQuery cmsHomePage() {
        startField("cms_home_page");

        return this;
    }

    /**
     * CMS No Cookies Page
     */
    public StoreConfigQuery cmsNoCookies() {
        startField("cms_no_cookies");

        return this;
    }

    /**
     * CMS No Route Page
     */
    public StoreConfigQuery cmsNoRoute() {
        startField("cms_no_route");

        return this;
    }

    /**
     * A code assigned to the store to identify it
     */
    public StoreConfigQuery code() {
        startField("code");

        return this;
    }

    /**
     * Copyright
     */
    public StoreConfigQuery copyright() {
        startField("copyright");

        return this;
    }

    /**
     * Default Meta Description
     */
    public StoreConfigQuery defaultDescription() {
        startField("default_description");

        return this;
    }

    /**
     * Default display currency code
     */
    public StoreConfigQuery defaultDisplayCurrencyCode() {
        startField("default_display_currency_code");

        return this;
    }

    /**
     * Default Meta Keywords
     */
    public StoreConfigQuery defaultKeywords() {
        startField("default_keywords");

        return this;
    }

    /**
     * Default Page Title
     */
    public StoreConfigQuery defaultTitle() {
        startField("default_title");

        return this;
    }

    /**
     * Display Demo Store Notice
     */
    public StoreConfigQuery demonotice() {
        startField("demonotice");

        return this;
    }

    /**
     * Default Web URL
     */
    public StoreConfigQuery front() {
        startField("front");

        return this;
    }

    /**
     * Products per Page on Grid Default Value.
     */
    public StoreConfigQuery gridPerPage() {
        startField("grid_per_page");

        return this;
    }

    /**
     * Products per Page on Grid Allowed Values.
     */
    public StoreConfigQuery gridPerPageValues() {
        startField("grid_per_page_values");

        return this;
    }

    /**
     * Scripts and Style Sheets
     */
    public StoreConfigQuery headIncludes() {
        startField("head_includes");

        return this;
    }

    /**
     * Favicon Icon
     */
    public StoreConfigQuery headShortcutIcon() {
        startField("head_shortcut_icon");

        return this;
    }

    /**
     * Logo Image
     */
    public StoreConfigQuery headerLogoSrc() {
        startField("header_logo_src");

        return this;
    }

    /**
     * The ID number assigned to the store
     */
    public StoreConfigQuery id() {
        startField("id");

        return this;
    }

    /**
     * List Mode.
     */
    public StoreConfigQuery listMode() {
        startField("list_mode");

        return this;
    }

    /**
     * Products per Page on List Default Value.
     */
    public StoreConfigQuery listPerPage() {
        startField("list_per_page");

        return this;
    }

    /**
     * Products per Page on List Allowed Values.
     */
    public StoreConfigQuery listPerPageValues() {
        startField("list_per_page_values");

        return this;
    }

    /**
     * Store locale
     */
    public StoreConfigQuery locale() {
        startField("locale");

        return this;
    }

    /**
     * Logo Image Alt
     */
    public StoreConfigQuery logoAlt() {
        startField("logo_alt");

        return this;
    }

    /**
     * Logo Attribute Height
     */
    public StoreConfigQuery logoHeight() {
        startField("logo_height");

        return this;
    }

    /**
     * Logo Attribute Width
     */
    public StoreConfigQuery logoWidth() {
        startField("logo_width");

        return this;
    }

    /**
     * Reward points functionality status: enabled/disabled
     */
    public StoreConfigQuery magentoRewardGeneralIsEnabled() {
        startField("magento_reward_general_is_enabled");

        return this;
    }

    /**
     * Reward points functionality status on the storefront: enabled/disabled
     */
    public StoreConfigQuery magentoRewardGeneralIsEnabledOnFront() {
        startField("magento_reward_general_is_enabled_on_front");

        return this;
    }

    /**
     * Reward points redemption minimum threshold
     */
    public StoreConfigQuery magentoRewardGeneralMinPointsBalance() {
        startField("magento_reward_general_min_points_balance");

        return this;
    }

    /**
     * Enable reward points history for the customer
     */
    public StoreConfigQuery magentoRewardGeneralPublishHistory() {
        startField("magento_reward_general_publish_history");

        return this;
    }

    /**
     * Number of points for referral, when invitee registers on the site
     */
    public StoreConfigQuery magentoRewardPointsInvitationCustomer() {
        startField("magento_reward_points_invitation_customer");

        return this;
    }

    /**
     * Maximum number of registration referrals that will qualify for rewards
     */
    public StoreConfigQuery magentoRewardPointsInvitationCustomerLimit() {
        startField("magento_reward_points_invitation_customer_limit");

        return this;
    }

    /**
     * Number of points for referral, when invitee places an initial order on the site
     */
    public StoreConfigQuery magentoRewardPointsInvitationOrder() {
        startField("magento_reward_points_invitation_order");

        return this;
    }

    /**
     * Maximum number of order placements by invitees that will qualify for rewards
     */
    public StoreConfigQuery magentoRewardPointsInvitationOrderLimit() {
        startField("magento_reward_points_invitation_order_limit");

        return this;
    }

    /**
     * Number of points for newsletter subscription
     */
    public StoreConfigQuery magentoRewardPointsNewsletter() {
        startField("magento_reward_points_newsletter");

        return this;
    }

    /**
     * Whether customer earns points for shopping according to the reward point exchange rate. In Luma this
     * also controls whether to show a message in shopping cart about the rewards points earned for the
     * purchase, as well as the customer’s current reward point balance
     */
    public StoreConfigQuery magentoRewardPointsOrder() {
        startField("magento_reward_points_order");

        return this;
    }

    /**
     * Number of points customer gets for registration
     */
    public StoreConfigQuery magentoRewardPointsRegister() {
        startField("magento_reward_points_register");

        return this;
    }

    /**
     * Number of points for writing a review
     */
    public StoreConfigQuery magentoRewardPointsReview() {
        startField("magento_reward_points_review");

        return this;
    }

    /**
     * Maximum number of reviews that will qualify for the rewards
     */
    public StoreConfigQuery magentoRewardPointsReviewLimit() {
        startField("magento_reward_points_review_limit");

        return this;
    }

    /**
     * Indicates whether wishlists are enabled (1) or disabled (0)
     */
    public StoreConfigQuery magentoWishlistGeneralIsEnabled() {
        startField("magento_wishlist_general_is_enabled");

        return this;
    }

    /**
     * The minimum number of characters required for a valid password.
     */
    public StoreConfigQuery minimumPasswordLength() {
        startField("minimum_password_length");

        return this;
    }

    /**
     * Default No-route URL
     */
    public StoreConfigQuery noRoute() {
        startField("no_route");

        return this;
    }

    /**
     * Payflow Pro vault status.
     */
    public StoreConfigQuery paymentPayflowproCcVaultActive() {
        startField("payment_payflowpro_cc_vault_active");

        return this;
    }

    /**
     * Default Price for Printed Card
     */
    public StoreConfigQuery printedCardPrice() {
        startField("printed_card_price");

        return this;
    }

    /**
     * Corresponds to the &#39;Display Prices On Product View Page&#39; field. It indicates how FPT information is
     * displayed on product pages
     */
    public StoreConfigQuery productFixedProductTaxDisplaySetting() {
        startField("product_fixed_product_tax_display_setting");

        return this;
    }

    /**
     * Indicates whether product reviews are enabled. Possible values: 1 (Yes) and 0 (No)
     */
    public StoreConfigQuery productReviewsEnabled() {
        startField("product_reviews_enabled");

        return this;
    }

    /**
     * Product URL Suffix.
     */
    public StoreConfigQuery productUrlSuffix() {
        startField("product_url_suffix");

        return this;
    }

    /**
     * The number of different character classes required in a password (lowercase, uppercase, digits,
     * special characters).
     */
    public StoreConfigQuery requiredCharacterClassesNumber() {
        startField("required_character_classes_number");

        return this;
    }

    /**
     * The ID of the root category
     */
    public StoreConfigQuery rootCategoryId() {
        startField("root_category_id");

        return this;
    }

    /**
     * Corresponds to the &#39;Display Prices In Sales Modules&#39; field. It indicates how FPT information is
     * displayed on cart, checkout, and order pages
     */
    public StoreConfigQuery salesFixedProductTaxDisplaySetting() {
        startField("sales_fixed_product_tax_display_setting");

        return this;
    }

    /**
     * Display Gift Wrapping Prices
     */
    public StoreConfigQuery salesGiftWrapping() {
        startField("sales_gift_wrapping");

        return this;
    }

    /**
     * Display Printed Card Prices
     */
    public StoreConfigQuery salesPrintedCard() {
        startField("sales_printed_card");

        return this;
    }

    /**
     * Secure base link URL for the store
     */
    public StoreConfigQuery secureBaseLinkUrl() {
        startField("secure_base_link_url");

        return this;
    }

    /**
     * Secure base media URL for the store
     */
    public StoreConfigQuery secureBaseMediaUrl() {
        startField("secure_base_media_url");

        return this;
    }

    /**
     * Secure base static URL for the store
     */
    public StoreConfigQuery secureBaseStaticUrl() {
        startField("secure_base_static_url");

        return this;
    }

    /**
     * Secure base URL for the store
     */
    public StoreConfigQuery secureBaseUrl() {
        startField("secure_base_url");

        return this;
    }

    /**
     * Email to a Friend configuration.
     */
    public StoreConfigQuery sendFriend(SendFriendConfigurationQueryDefinition queryDef) {
        startField("send_friend");

        _queryBuilder.append('{');
        queryDef.define(new SendFriendConfigurationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Show Breadcrumbs for CMS Pages
     */
    public StoreConfigQuery showCmsBreadcrumbs() {
        startField("show_cms_breadcrumbs");

        return this;
    }

    /**
     * Name of the store
     */
    public StoreConfigQuery storeName() {
        startField("store_name");

        return this;
    }

    /**
     * Timezone of the store
     */
    public StoreConfigQuery timezone() {
        startField("timezone");

        return this;
    }

    /**
     * Page Title Prefix
     */
    public StoreConfigQuery titlePrefix() {
        startField("title_prefix");

        return this;
    }

    /**
     * Page Title Separator.
     */
    public StoreConfigQuery titleSeparator() {
        startField("title_separator");

        return this;
    }

    /**
     * Page Title Suffix
     */
    public StoreConfigQuery titleSuffix() {
        startField("title_suffix");

        return this;
    }

    /**
     * The ID number assigned to the website store belongs
     */
    public StoreConfigQuery websiteId() {
        startField("website_id");

        return this;
    }

    /**
     * The unit of weight
     */
    public StoreConfigQuery weightUnit() {
        startField("weight_unit");

        return this;
    }

    /**
     * Welcome Text
     */
    public StoreConfigQuery welcome() {
        startField("welcome");

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
    public static Fragment<StoreConfigQuery> createFragment(String name, StoreConfigQueryDefinition queryDef) {
        StringBuilder sb = new StringBuilder();
        queryDef.define(new StoreConfigQuery(sb));
        return new Fragment<>(name, "StoreConfig", sb.toString());
    }

    /**
     * Adds a <code>StoreConfigQuery</code> fragment reference at the current position of the query.
     * For example for a fragment named <code>test</code>, calling this method will add the
     * reference <code>...test</code> in the query. For GraphQL types implementing an interface, there
     * will be some similar methods using the Query type of each implemented interface.
     * 
     * @param fragment The fragment to reference.
     */
    public StoreConfigQuery addFragmentReference(Fragment<StoreConfigQuery> fragment) {
        startField("..." + fragment.getName());
        return this;
    }
}

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
 * Contains information about a store&#39;s configuration.
 */
public class StoreConfigQuery extends AbstractQuery<StoreConfigQuery> {
    StoreConfigQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
     * Contains scripts that must be included in the HTML before the closing `&lt;body&gt;` tag.
     */
    public StoreConfigQuery absoluteFooter() {
        startField("absolute_footer");

        return this;
    }

    /**
     * Indicates if the gift sender has the option to send a gift receipt. Possible values: 1 (Yes) and 0
     * (No).
     */
    public StoreConfigQuery allowGiftReceipt() {
        startField("allow_gift_receipt");

        return this;
    }

    /**
     * Indicates whether gift wrapping can be added for the entire order. Possible values: 1 (Yes) and 0
     * (No).
     */
    public StoreConfigQuery allowGiftWrappingOnOrder() {
        startField("allow_gift_wrapping_on_order");

        return this;
    }

    /**
     * Indicates whether gift wrapping can be added for individual order items. Possible values: 1 (Yes)
     * and 0 (No).
     */
    public StoreConfigQuery allowGiftWrappingOnOrderItems() {
        startField("allow_gift_wrapping_on_order_items");

        return this;
    }

    /**
     * Indicates whether guest users can write product reviews. Possible values: 1 (Yes) and 0 (No).
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
     * Indicates if a printed card can accompany an order. Possible values: 1 (Yes) and 0 (No).
     */
    public StoreConfigQuery allowPrintedCard() {
        startField("allow_printed_card");

        return this;
    }

    /**
     * Indicates whether to enable autocomplete on login and forgot password forms.
     */
    public StoreConfigQuery autocompleteOnStorefront() {
        startField("autocomplete_on_storefront");

        return this;
    }

    /**
     * The base currency code.
     */
    public StoreConfigQuery baseCurrencyCode() {
        startField("base_currency_code");

        return this;
    }

    /**
     * A fully-qualified URL that is used to create relative links to the `base_url`.
     */
    public StoreConfigQuery baseLinkUrl() {
        startField("base_link_url");

        return this;
    }

    /**
     * The fully-qualified URL that specifies the location of media files.
     */
    public StoreConfigQuery baseMediaUrl() {
        startField("base_media_url");

        return this;
    }

    /**
     * The fully-qualified URL that specifies the location of static view files.
     */
    public StoreConfigQuery baseStaticUrl() {
        startField("base_static_url");

        return this;
    }

    /**
     * The store’s fully-qualified base URL.
     */
    public StoreConfigQuery baseUrl() {
        startField("base_url");

        return this;
    }

    /**
     * Braintree cc vault status.
     */
    public StoreConfigQuery braintreeCcVaultActive() {
        startField("braintree_cc_vault_active");

        return this;
    }

    /**
     * Indicates if gift wrapping prices are displayed on the Shopping Cart page. Possible values: 1 (Yes)
     * and 0 (No).
     */
    public StoreConfigQuery cartGiftWrapping() {
        startField("cart_gift_wrapping");

        return this;
    }

    /**
     * Indicates if printed card prices are displayed on the Shopping Cart page. Possible values: 1 (Yes)
     * and 0 (No).
     */
    public StoreConfigQuery cartPrintedCard() {
        startField("cart_printed_card");

        return this;
    }

    /**
     * The default sort order of the search results list.
     */
    public StoreConfigQuery catalogDefaultSortBy() {
        startField("catalog_default_sort_by");

        return this;
    }

    /**
     * Corresponds to the &#39;Display Prices In Product Lists&#39; field in the Admin. It indicates how FPT
     * information is displayed on category pages.
     */
    public StoreConfigQuery categoryFixedProductTaxDisplaySetting() {
        startField("category_fixed_product_tax_display_setting");

        return this;
    }

    /**
     * The suffix applied to category pages, such as `.htm` or `.html`.
     */
    public StoreConfigQuery categoryUrlSuffix() {
        startField("category_url_suffix");

        return this;
    }

    /**
     * Indicates whether only specific countries can use this payment method.
     */
    public StoreConfigQuery checkMoneyOrderEnableForSpecificCountries() {
        startField("check_money_order_enable_for_specific_countries");

        return this;
    }

    /**
     * Indicates whether the Check/Money Order payment method is enabled.
     */
    public StoreConfigQuery checkMoneyOrderEnabled() {
        startField("check_money_order_enabled");

        return this;
    }

    /**
     * The name of the party to whom the check must be payable.
     */
    public StoreConfigQuery checkMoneyOrderMakeCheckPayableTo() {
        startField("check_money_order_make_check_payable_to");

        return this;
    }

    /**
     * The maximum order amount required to qualify for the Check/Money Order payment method.
     */
    public StoreConfigQuery checkMoneyOrderMaxOrderTotal() {
        startField("check_money_order_max_order_total");

        return this;
    }

    /**
     * The minimum order amount required to qualify for the Check/Money Order payment method.
     */
    public StoreConfigQuery checkMoneyOrderMinOrderTotal() {
        startField("check_money_order_min_order_total");

        return this;
    }

    /**
     * The status of new orders placed using the Check/Money Order payment method.
     */
    public StoreConfigQuery checkMoneyOrderNewOrderStatus() {
        startField("check_money_order_new_order_status");

        return this;
    }

    /**
     * A comma-separated list of specific countries allowed to use the Check/Money Order payment method.
     */
    public StoreConfigQuery checkMoneyOrderPaymentFromSpecificCountries() {
        startField("check_money_order_payment_from_specific_countries");

        return this;
    }

    /**
     * The full street address or PO Box where the checks are mailed.
     */
    public StoreConfigQuery checkMoneyOrderSendCheckTo() {
        startField("check_money_order_send_check_to");

        return this;
    }

    /**
     * A number indicating the position of the Check/Money Order payment method in the list of available
     * payment methods during checkout.
     */
    public StoreConfigQuery checkMoneyOrderSortOrder() {
        startField("check_money_order_sort_order");

        return this;
    }

    /**
     * The title of the Check/Money Order payment method displayed on the storefront.
     */
    public StoreConfigQuery checkMoneyOrderTitle() {
        startField("check_money_order_title");

        return this;
    }

    /**
     * The name of the CMS page that identifies the home page for the store.
     */
    public StoreConfigQuery cmsHomePage() {
        startField("cms_home_page");

        return this;
    }

    /**
     * A specific CMS page that displays when cookies are not enabled for the browser.
     */
    public StoreConfigQuery cmsNoCookies() {
        startField("cms_no_cookies");

        return this;
    }

    /**
     * A specific CMS page that displays when a 404 &#39;Page Not Found&#39; error occurs.
     */
    public StoreConfigQuery cmsNoRoute() {
        startField("cms_no_route");

        return this;
    }

    /**
     * A code assigned to the store to identify it.
     *
     * @deprecated Use `store_code` instead.
     */
    @Deprecated
    public StoreConfigQuery code() {
        startField("code");

        return this;
    }

    /**
     * Indicates whether the `parent` or child (`itself`) thumbnail should be used in the cart for
     * configurable products.
     */
    public StoreConfigQuery configurableThumbnailSource() {
        startField("configurable_thumbnail_source");

        return this;
    }

    /**
     * The copyright statement that appears at the bottom of each page.
     */
    public StoreConfigQuery copyright() {
        startField("copyright");

        return this;
    }

    /**
     * The description that provides a summary of your site for search engine listings. It should not be
     * more than 160 characters in length.
     */
    public StoreConfigQuery defaultDescription() {
        startField("default_description");

        return this;
    }

    /**
     * The default display currency code.
     */
    public StoreConfigQuery defaultDisplayCurrencyCode() {
        startField("default_display_currency_code");

        return this;
    }

    /**
     * A series of keywords that describe your store, each separated by a comma.
     */
    public StoreConfigQuery defaultKeywords() {
        startField("default_keywords");

        return this;
    }

    /**
     * The title that appears at the title bar of each page when viewed in a browser.
     */
    public StoreConfigQuery defaultTitle() {
        startField("default_title");

        return this;
    }

    /**
     * Controls the display of the demo store notice at the top of the page. Options: 0 (No) or 1 (Yes).
     */
    public StoreConfigQuery demonotice() {
        startField("demonotice");

        return this;
    }

    /**
     * Indicates whether customers can have multiple wish lists. Possible values: 1 (Yes) and 0 (No).
     */
    public StoreConfigQuery enableMultipleWishlists() {
        startField("enable_multiple_wishlists");

        return this;
    }

    /**
     * The landing page that is associated with the base URL.
     */
    public StoreConfigQuery front() {
        startField("front");

        return this;
    }

    /**
     * The default number of products per page in Grid View.
     */
    public StoreConfigQuery gridPerPage() {
        startField("grid_per_page");

        return this;
    }

    /**
     * A list of numbers that define how many products can be displayed in Grid View.
     */
    public StoreConfigQuery gridPerPageValues() {
        startField("grid_per_page_values");

        return this;
    }

    /**
     * Scripts that must be included in the HTML before the closing `&lt;head&gt;` tag.
     */
    public StoreConfigQuery headIncludes() {
        startField("head_includes");

        return this;
    }

    /**
     * The small graphic image (favicon) that appears in the address bar and tab of the browser.
     */
    public StoreConfigQuery headShortcutIcon() {
        startField("head_shortcut_icon");

        return this;
    }

    /**
     * The path to the logo that appears in the header.
     */
    public StoreConfigQuery headerLogoSrc() {
        startField("header_logo_src");

        return this;
    }

    /**
     * The ID number assigned to the store.
     *
     * @deprecated Use `store_code` instead.
     */
    @Deprecated
    public StoreConfigQuery id() {
        startField("id");

        return this;
    }

    /**
     * Indicates whether the store view has been designated as the default within the store group.
     */
    public StoreConfigQuery isDefaultStore() {
        startField("is_default_store");

        return this;
    }

    /**
     * Indicates whether the store group has been designated as the default within the website.
     */
    public StoreConfigQuery isDefaultStoreGroup() {
        startField("is_default_store_group");

        return this;
    }

    /**
     * Indicates whether negotiable quote functionality is enabled.
     */
    public StoreConfigQuery isNegotiableQuoteActive() {
        startField("is_negotiable_quote_active");

        return this;
    }

    /**
     * Indicates whether requisition lists are enabled. Possible values: 1 (Yes) and 0 (No).
     */
    public StoreConfigQuery isRequisitionListActive() {
        startField("is_requisition_list_active");

        return this;
    }

    /**
     * The format of the search results list.
     */
    public StoreConfigQuery listMode() {
        startField("list_mode");

        return this;
    }

    /**
     * The default number of products per page in List View.
     */
    public StoreConfigQuery listPerPage() {
        startField("list_per_page");

        return this;
    }

    /**
     * A list of numbers that define how many products can be displayed in List View.
     */
    public StoreConfigQuery listPerPageValues() {
        startField("list_per_page_values");

        return this;
    }

    /**
     * The store locale.
     */
    public StoreConfigQuery locale() {
        startField("locale");

        return this;
    }

    /**
     * The Alt text that is associated with the logo.
     */
    public StoreConfigQuery logoAlt() {
        startField("logo_alt");

        return this;
    }

    /**
     * The height of the logo image, in pixels.
     */
    public StoreConfigQuery logoHeight() {
        startField("logo_height");

        return this;
    }

    /**
     * The width of the logo image, in pixels.
     */
    public StoreConfigQuery logoWidth() {
        startField("logo_width");

        return this;
    }

    /**
     * Indicates whether reward points functionality is enabled. Possible values: 1 (Enabled) and 0
     * (Disabled).
     */
    public StoreConfigQuery magentoRewardGeneralIsEnabled() {
        startField("magento_reward_general_is_enabled");

        return this;
    }

    /**
     * Indicates whether reward points functionality is enabled on the storefront. Possible values: 1
     * (Enabled) and 0 (Disabled).
     */
    public StoreConfigQuery magentoRewardGeneralIsEnabledOnFront() {
        startField("magento_reward_general_is_enabled_on_front");

        return this;
    }

    /**
     * The minimum point balance customers must have before they can redeem them. A null value indicates no
     * minimum.
     */
    public StoreConfigQuery magentoRewardGeneralMinPointsBalance() {
        startField("magento_reward_general_min_points_balance");

        return this;
    }

    /**
     * When enabled, customers can see a detailed history of their reward points. Possible values: 1
     * (Enabled) and 0 (Disabled).
     */
    public StoreConfigQuery magentoRewardGeneralPublishHistory() {
        startField("magento_reward_general_publish_history");

        return this;
    }

    /**
     * The number of points for a referral when an invitee registers on the site.
     */
    public StoreConfigQuery magentoRewardPointsInvitationCustomer() {
        startField("magento_reward_points_invitation_customer");

        return this;
    }

    /**
     * The maximum number of registration referrals that will qualify for rewards. A null value indicates
     * no limit.
     */
    public StoreConfigQuery magentoRewardPointsInvitationCustomerLimit() {
        startField("magento_reward_points_invitation_customer_limit");

        return this;
    }

    /**
     * The number of points for a referral, when an invitee places their first order on the site.
     */
    public StoreConfigQuery magentoRewardPointsInvitationOrder() {
        startField("magento_reward_points_invitation_order");

        return this;
    }

    /**
     * The number of order conversions that can earn points for the customer who sends the invitation. A
     * null value indicates no limit.
     */
    public StoreConfigQuery magentoRewardPointsInvitationOrderLimit() {
        startField("magento_reward_points_invitation_order_limit");

        return this;
    }

    /**
     * The number of points earned by registered customers who subscribe to a newsletter.
     */
    public StoreConfigQuery magentoRewardPointsNewsletter() {
        startField("magento_reward_points_newsletter");

        return this;
    }

    /**
     * Indicates customers earn points for shopping according to the reward point exchange rate. In Luma,
     * this also controls whether to show a message in the shopping cart about the rewards points earned
     * for the purchase, as well as the customer’s current reward point balance.
     */
    public StoreConfigQuery magentoRewardPointsOrder() {
        startField("magento_reward_points_order");

        return this;
    }

    /**
     * The number of points customer gets for registering.
     */
    public StoreConfigQuery magentoRewardPointsRegister() {
        startField("magento_reward_points_register");

        return this;
    }

    /**
     * The number of points for writing a review.
     */
    public StoreConfigQuery magentoRewardPointsReview() {
        startField("magento_reward_points_review");

        return this;
    }

    /**
     * The maximum number of reviews that will qualify for the rewards. A null value indicates no limit.
     */
    public StoreConfigQuery magentoRewardPointsReviewLimit() {
        startField("magento_reward_points_review_limit");

        return this;
    }

    /**
     * Indicates whether wishlists are enabled (1) or disabled (0).
     */
    public StoreConfigQuery magentoWishlistGeneralIsEnabled() {
        startField("magento_wishlist_general_is_enabled");

        return this;
    }

    /**
     * If multiple wish lists are enabled, the maximum number of wish lists the customer can have.
     */
    public StoreConfigQuery maximumNumberOfWishlists() {
        startField("maximum_number_of_wishlists");

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
     * The default page that displays when a 404 &#39;Page not Found&#39; error occurs.
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
     * The default price of a printed card that accompanies an order.
     */
    public StoreConfigQuery printedCardPrice() {
        startField("printed_card_price");

        return this;
    }

    /**
     * Corresponds to the &#39;Display Prices On Product View Page&#39; field in the Admin. It indicates how FPT
     * information is displayed on product pages.
     */
    public StoreConfigQuery productFixedProductTaxDisplaySetting() {
        startField("product_fixed_product_tax_display_setting");

        return this;
    }

    /**
     * Indicates whether product reviews are enabled. Possible values: 1 (Yes) and 0 (No).
     */
    public StoreConfigQuery productReviewsEnabled() {
        startField("product_reviews_enabled");

        return this;
    }

    /**
     * The suffix applied to product pages, such as `.htm` or `.html`.
     */
    public StoreConfigQuery productUrlSuffix() {
        startField("product_url_suffix");

        return this;
    }

    /**
     * The number of different character classes (lowercase, uppercase, digits, special characters)
     * required in a password.
     */
    public StoreConfigQuery requiredCharacterClassesNumber() {
        startField("required_character_classes_number");

        return this;
    }

    /**
     * Indicates whether RMA is enabled on the storefront. Possible values: enabled/disabled.
     */
    public StoreConfigQuery returnsEnabled() {
        startField("returns_enabled");

        return this;
    }

    /**
     * The ID of the root category.
     *
     * @deprecated Use `root_category_uid` instead.
     */
    @Deprecated
    public StoreConfigQuery rootCategoryId() {
        startField("root_category_id");

        return this;
    }

    /**
     * The unique ID for a `CategoryInterface` object.
     */
    public StoreConfigQuery rootCategoryUid() {
        startField("root_category_uid");

        return this;
    }

    /**
     * Corresponds to the &#39;Display Prices In Sales Modules&#39; field in the Admin. It indicates how FPT
     * information is displayed on cart, checkout, and order pages.
     */
    public StoreConfigQuery salesFixedProductTaxDisplaySetting() {
        startField("sales_fixed_product_tax_display_setting");

        return this;
    }

    /**
     * Indicates if gift wrapping prices are displayed on the Orders page. Possible values: 1 (Yes) and 0
     * (No).
     */
    public StoreConfigQuery salesGiftWrapping() {
        startField("sales_gift_wrapping");

        return this;
    }

    /**
     * Indicates if printed card prices are displayed on the Orders page. Possible values: 1 (Yes) and 0
     * (No).
     */
    public StoreConfigQuery salesPrintedCard() {
        startField("sales_printed_card");

        return this;
    }

    /**
     * A secure fully-qualified URL that is used to create relative links to the `base_url`.
     */
    public StoreConfigQuery secureBaseLinkUrl() {
        startField("secure_base_link_url");

        return this;
    }

    /**
     * The secure fully-qualified URL that specifies the location of media files.
     */
    public StoreConfigQuery secureBaseMediaUrl() {
        startField("secure_base_media_url");

        return this;
    }

    /**
     * The secure fully-qualified URL that specifies the location of static view files.
     */
    public StoreConfigQuery secureBaseStaticUrl() {
        startField("secure_base_static_url");

        return this;
    }

    /**
     * The store’s fully-qualified secure base URL.
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
     * Indicates whether a breadcrumb trail appears on all CMS pages in the catalog. 0 (No) or 1 (Yes).
     */
    public StoreConfigQuery showCmsBreadcrumbs() {
        startField("show_cms_breadcrumbs");

        return this;
    }

    /**
     * The unique ID of the store view. In the Admin, this is called the Store View Code. When making a
     * GraphQL call, assign this value to the `Store` header to provide the scope.
     */
    public StoreConfigQuery storeCode() {
        startField("store_code");

        return this;
    }

    /**
     * The unique ID assigned to the store group. In the Admin, this is called the Store Name.
     */
    public StoreConfigQuery storeGroupCode() {
        startField("store_group_code");

        return this;
    }

    /**
     * The label assigned to the store group.
     */
    public StoreConfigQuery storeGroupName() {
        startField("store_group_name");

        return this;
    }

    /**
     * The label assigned to the store view.
     */
    public StoreConfigQuery storeName() {
        startField("store_name");

        return this;
    }

    /**
     * The store view sort order.
     */
    public StoreConfigQuery storeSortOrder() {
        startField("store_sort_order");

        return this;
    }

    /**
     * The time zone of the store.
     */
    public StoreConfigQuery timezone() {
        startField("timezone");

        return this;
    }

    /**
     * A prefix that appears before the title to create a two- or three-part title.
     */
    public StoreConfigQuery titlePrefix() {
        startField("title_prefix");

        return this;
    }

    /**
     * The character that separates the category name and subcategory in the browser title bar.
     */
    public StoreConfigQuery titleSeparator() {
        startField("title_separator");

        return this;
    }

    /**
     * A suffix that appears after the title to create a two- or three-part title.
     */
    public StoreConfigQuery titleSuffix() {
        startField("title_suffix");

        return this;
    }

    /**
     * Indicates whether the store code should be used in the URL.
     */
    public StoreConfigQuery useStoreInUrl() {
        startField("use_store_in_url");

        return this;
    }

    /**
     * The unique ID for the website.
     */
    public StoreConfigQuery websiteCode() {
        startField("website_code");

        return this;
    }

    /**
     * The ID number assigned to the website store.
     *
     * @deprecated The field should not be used on the storefront.
     */
    @Deprecated
    public StoreConfigQuery websiteId() {
        startField("website_id");

        return this;
    }

    /**
     * The label assigned to the website.
     */
    public StoreConfigQuery websiteName() {
        startField("website_name");

        return this;
    }

    /**
     * The unit of weight.
     */
    public StoreConfigQuery weightUnit() {
        startField("weight_unit");

        return this;
    }

    /**
     * Text that appears in the header of the page and includes the name of the logged in customer.
     */
    public StoreConfigQuery welcome() {
        startField("welcome");

        return this;
    }

    /**
     * Indicates whether only specific countries can use this payment method.
     */
    public StoreConfigQuery zeroSubtotalEnableForSpecificCountries() {
        startField("zero_subtotal_enable_for_specific_countries");

        return this;
    }

    /**
     * Indicates whether the Zero Subtotal payment method is enabled.
     */
    public StoreConfigQuery zeroSubtotalEnabled() {
        startField("zero_subtotal_enabled");

        return this;
    }

    /**
     * The status of new orders placed using the Zero Subtotal payment method.
     */
    public StoreConfigQuery zeroSubtotalNewOrderStatus() {
        startField("zero_subtotal_new_order_status");

        return this;
    }

    /**
     * When the new order status is &#39;Processing&#39;, this can be set to `authorize_capture` to automatically
     * invoice all items that have a zero balance.
     */
    public StoreConfigQuery zeroSubtotalPaymentAction() {
        startField("zero_subtotal_payment_action");

        return this;
    }

    /**
     * A comma-separated list of specific countries allowed to use the Zero Subtotal payment method.
     */
    public StoreConfigQuery zeroSubtotalPaymentFromSpecificCountries() {
        startField("zero_subtotal_payment_from_specific_countries");

        return this;
    }

    /**
     * A number indicating the position of the Zero Subtotal payment method in the list of available
     * payment methods during checkout.
     */
    public StoreConfigQuery zeroSubtotalSortOrder() {
        startField("zero_subtotal_sort_order");

        return this;
    }

    /**
     * The title of the Zero Subtotal payment method displayed on the storefront.
     */
    public StoreConfigQuery zeroSubtotalTitle() {
        startField("zero_subtotal_title");

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

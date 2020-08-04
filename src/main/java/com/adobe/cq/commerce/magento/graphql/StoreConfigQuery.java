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
     * Corresponds to the &#39;Display Prices On Product View Page&#39; field. It indicates how FPT information is
     * displayed on product pages
     */
    public StoreConfigQuery productFixedProductTaxDisplaySetting() {
        startField("product_fixed_product_tax_display_setting");

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
}

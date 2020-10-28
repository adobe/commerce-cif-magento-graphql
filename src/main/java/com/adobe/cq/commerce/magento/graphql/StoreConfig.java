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
import java.util.Map;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;

/**
 * The type contains information about a store config
 */
public class StoreConfig extends AbstractResponse<StoreConfig> {
    public StoreConfig() {
    }

    public StoreConfig(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "absolute_footer": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "allow_gift_receipt": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "allow_gift_wrapping_on_order": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "allow_gift_wrapping_on_order_items": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "allow_guests_to_write_product_reviews": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "allow_items": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "allow_order": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "allow_printed_card": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "autocomplete_on_storefront": {
                    Boolean optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsBoolean(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "base_currency_code": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "base_link_url": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "base_media_url": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "base_static_url": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "base_url": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "cart_gift_wrapping": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "cart_printed_card": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "catalog_default_sort_by": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "category_fixed_product_tax_display_setting": {
                    FixedProductTaxDisplaySettings optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = FixedProductTaxDisplaySettings.fromGraphQl(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "category_url_suffix": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "cms_home_page": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "cms_no_cookies": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "cms_no_route": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "code": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "copyright": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "default_description": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "default_display_currency_code": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "default_keywords": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "default_title": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "demonotice": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "front": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "grid_per_page": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "grid_per_page_values": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "head_includes": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "head_shortcut_icon": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "header_logo_src": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "id": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "list_mode": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "list_per_page": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "list_per_page_values": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "locale": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "logo_alt": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "logo_height": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "logo_width": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "magento_reward_general_is_enabled": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "magento_reward_general_is_enabled_on_front": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "magento_reward_general_min_points_balance": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "magento_reward_general_publish_history": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "magento_reward_points_invitation_customer": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "magento_reward_points_invitation_customer_limit": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "magento_reward_points_invitation_order": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "magento_reward_points_invitation_order_limit": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "magento_reward_points_newsletter": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "magento_reward_points_order": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "magento_reward_points_register": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "magento_reward_points_review": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "magento_reward_points_review_limit": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "magento_wishlist_general_is_enabled": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "minimum_password_length": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "no_route": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "payment_payflowpro_cc_vault_active": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "printed_card_price": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "product_fixed_product_tax_display_setting": {
                    FixedProductTaxDisplaySettings optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = FixedProductTaxDisplaySettings.fromGraphQl(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "product_reviews_enabled": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "product_url_suffix": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "required_character_classes_number": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "root_category_id": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "sales_fixed_product_tax_display_setting": {
                    FixedProductTaxDisplaySettings optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = FixedProductTaxDisplaySettings.fromGraphQl(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "sales_gift_wrapping": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "sales_printed_card": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "secure_base_link_url": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "secure_base_media_url": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "secure_base_static_url": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "secure_base_url": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "send_friend": {
                    SendFriendConfiguration optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new SendFriendConfiguration(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "show_cms_breadcrumbs": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "store_name": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "timezone": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "title_prefix": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "title_separator": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "title_suffix": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "website_id": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "weight_unit": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "welcome": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "__typename": {
                    responseData.put(key, jsonAsString(field.getValue(), key));
                    break;
                }

                default: {
                    readCustomField(fieldName, field.getValue());
                }
            }
        }
    }

    public String getGraphQlTypeName() {
        return "StoreConfig";
    }

    /**
     * Footer Miscellaneous HTML
     */
    public String getAbsoluteFooter() {
        return (String) get("absolute_footer");
    }

    public StoreConfig setAbsoluteFooter(String arg) {
        optimisticData.put(getKey("absolute_footer"), arg);
        return this;
    }

    /**
     * Allow Gift Receipt
     */
    public String getAllowGiftReceipt() {
        return (String) get("allow_gift_receipt");
    }

    public StoreConfig setAllowGiftReceipt(String arg) {
        optimisticData.put(getKey("allow_gift_receipt"), arg);
        return this;
    }

    /**
     * Allow Gift Wrapping on Order Level
     */
    public String getAllowGiftWrappingOnOrder() {
        return (String) get("allow_gift_wrapping_on_order");
    }

    public StoreConfig setAllowGiftWrappingOnOrder(String arg) {
        optimisticData.put(getKey("allow_gift_wrapping_on_order"), arg);
        return this;
    }

    /**
     * Allow Gift Wrapping for Order Items
     */
    public String getAllowGiftWrappingOnOrderItems() {
        return (String) get("allow_gift_wrapping_on_order_items");
    }

    public StoreConfig setAllowGiftWrappingOnOrderItems(String arg) {
        optimisticData.put(getKey("allow_gift_wrapping_on_order_items"), arg);
        return this;
    }

    /**
     * Indicates whether guest users can write product reviews. Possible values: 1 (Yes) and 0 (No)
     */
    public String getAllowGuestsToWriteProductReviews() {
        return (String) get("allow_guests_to_write_product_reviews");
    }

    public StoreConfig setAllowGuestsToWriteProductReviews(String arg) {
        optimisticData.put(getKey("allow_guests_to_write_product_reviews"), arg);
        return this;
    }

    /**
     * The value of the Allow Gift Messages for Order Items option
     */
    public String getAllowItems() {
        return (String) get("allow_items");
    }

    public StoreConfig setAllowItems(String arg) {
        optimisticData.put(getKey("allow_items"), arg);
        return this;
    }

    /**
     * The value of the Allow Gift Messages on Order Level option
     */
    public String getAllowOrder() {
        return (String) get("allow_order");
    }

    public StoreConfig setAllowOrder(String arg) {
        optimisticData.put(getKey("allow_order"), arg);
        return this;
    }

    /**
     * Allow Printed Card
     */
    public String getAllowPrintedCard() {
        return (String) get("allow_printed_card");
    }

    public StoreConfig setAllowPrintedCard(String arg) {
        optimisticData.put(getKey("allow_printed_card"), arg);
        return this;
    }

    /**
     * Enable autocomplete on login and forgot password forms
     */
    public Boolean getAutocompleteOnStorefront() {
        return (Boolean) get("autocomplete_on_storefront");
    }

    public StoreConfig setAutocompleteOnStorefront(Boolean arg) {
        optimisticData.put(getKey("autocomplete_on_storefront"), arg);
        return this;
    }

    /**
     * Base currency code
     */
    public String getBaseCurrencyCode() {
        return (String) get("base_currency_code");
    }

    public StoreConfig setBaseCurrencyCode(String arg) {
        optimisticData.put(getKey("base_currency_code"), arg);
        return this;
    }

    /**
     * Base link URL for the store
     */
    public String getBaseLinkUrl() {
        return (String) get("base_link_url");
    }

    public StoreConfig setBaseLinkUrl(String arg) {
        optimisticData.put(getKey("base_link_url"), arg);
        return this;
    }

    /**
     * Base media URL for the store
     */
    public String getBaseMediaUrl() {
        return (String) get("base_media_url");
    }

    public StoreConfig setBaseMediaUrl(String arg) {
        optimisticData.put(getKey("base_media_url"), arg);
        return this;
    }

    /**
     * Base static URL for the store
     */
    public String getBaseStaticUrl() {
        return (String) get("base_static_url");
    }

    public StoreConfig setBaseStaticUrl(String arg) {
        optimisticData.put(getKey("base_static_url"), arg);
        return this;
    }

    /**
     * Base URL for the store
     */
    public String getBaseUrl() {
        return (String) get("base_url");
    }

    public StoreConfig setBaseUrl(String arg) {
        optimisticData.put(getKey("base_url"), arg);
        return this;
    }

    /**
     * Display Gift Wrapping Prices
     */
    public String getCartGiftWrapping() {
        return (String) get("cart_gift_wrapping");
    }

    public StoreConfig setCartGiftWrapping(String arg) {
        optimisticData.put(getKey("cart_gift_wrapping"), arg);
        return this;
    }

    /**
     * Display Printed Card Prices
     */
    public String getCartPrintedCard() {
        return (String) get("cart_printed_card");
    }

    public StoreConfig setCartPrintedCard(String arg) {
        optimisticData.put(getKey("cart_printed_card"), arg);
        return this;
    }

    /**
     * Default Sort By.
     */
    public String getCatalogDefaultSortBy() {
        return (String) get("catalog_default_sort_by");
    }

    public StoreConfig setCatalogDefaultSortBy(String arg) {
        optimisticData.put(getKey("catalog_default_sort_by"), arg);
        return this;
    }

    /**
     * Corresponds to the &#39;Display Prices In Product Lists&#39; field. It indicates how FPT information is
     * displayed on category pages
     */
    public FixedProductTaxDisplaySettings getCategoryFixedProductTaxDisplaySetting() {
        return (FixedProductTaxDisplaySettings) get("category_fixed_product_tax_display_setting");
    }

    public StoreConfig setCategoryFixedProductTaxDisplaySetting(FixedProductTaxDisplaySettings arg) {
        optimisticData.put(getKey("category_fixed_product_tax_display_setting"), arg);
        return this;
    }

    /**
     * Category URL Suffix.
     */
    public String getCategoryUrlSuffix() {
        return (String) get("category_url_suffix");
    }

    public StoreConfig setCategoryUrlSuffix(String arg) {
        optimisticData.put(getKey("category_url_suffix"), arg);
        return this;
    }

    /**
     * CMS Home Page
     */
    public String getCmsHomePage() {
        return (String) get("cms_home_page");
    }

    public StoreConfig setCmsHomePage(String arg) {
        optimisticData.put(getKey("cms_home_page"), arg);
        return this;
    }

    /**
     * CMS No Cookies Page
     */
    public String getCmsNoCookies() {
        return (String) get("cms_no_cookies");
    }

    public StoreConfig setCmsNoCookies(String arg) {
        optimisticData.put(getKey("cms_no_cookies"), arg);
        return this;
    }

    /**
     * CMS No Route Page
     */
    public String getCmsNoRoute() {
        return (String) get("cms_no_route");
    }

    public StoreConfig setCmsNoRoute(String arg) {
        optimisticData.put(getKey("cms_no_route"), arg);
        return this;
    }

    /**
     * A code assigned to the store to identify it
     */
    public String getCode() {
        return (String) get("code");
    }

    public StoreConfig setCode(String arg) {
        optimisticData.put(getKey("code"), arg);
        return this;
    }

    /**
     * Copyright
     */
    public String getCopyright() {
        return (String) get("copyright");
    }

    public StoreConfig setCopyright(String arg) {
        optimisticData.put(getKey("copyright"), arg);
        return this;
    }

    /**
     * Default Meta Description
     */
    public String getDefaultDescription() {
        return (String) get("default_description");
    }

    public StoreConfig setDefaultDescription(String arg) {
        optimisticData.put(getKey("default_description"), arg);
        return this;
    }

    /**
     * Default display currency code
     */
    public String getDefaultDisplayCurrencyCode() {
        return (String) get("default_display_currency_code");
    }

    public StoreConfig setDefaultDisplayCurrencyCode(String arg) {
        optimisticData.put(getKey("default_display_currency_code"), arg);
        return this;
    }

    /**
     * Default Meta Keywords
     */
    public String getDefaultKeywords() {
        return (String) get("default_keywords");
    }

    public StoreConfig setDefaultKeywords(String arg) {
        optimisticData.put(getKey("default_keywords"), arg);
        return this;
    }

    /**
     * Default Page Title
     */
    public String getDefaultTitle() {
        return (String) get("default_title");
    }

    public StoreConfig setDefaultTitle(String arg) {
        optimisticData.put(getKey("default_title"), arg);
        return this;
    }

    /**
     * Display Demo Store Notice
     */
    public Integer getDemonotice() {
        return (Integer) get("demonotice");
    }

    public StoreConfig setDemonotice(Integer arg) {
        optimisticData.put(getKey("demonotice"), arg);
        return this;
    }

    /**
     * Default Web URL
     */
    public String getFront() {
        return (String) get("front");
    }

    public StoreConfig setFront(String arg) {
        optimisticData.put(getKey("front"), arg);
        return this;
    }

    /**
     * Products per Page on Grid Default Value.
     */
    public Integer getGridPerPage() {
        return (Integer) get("grid_per_page");
    }

    public StoreConfig setGridPerPage(Integer arg) {
        optimisticData.put(getKey("grid_per_page"), arg);
        return this;
    }

    /**
     * Products per Page on Grid Allowed Values.
     */
    public String getGridPerPageValues() {
        return (String) get("grid_per_page_values");
    }

    public StoreConfig setGridPerPageValues(String arg) {
        optimisticData.put(getKey("grid_per_page_values"), arg);
        return this;
    }

    /**
     * Scripts and Style Sheets
     */
    public String getHeadIncludes() {
        return (String) get("head_includes");
    }

    public StoreConfig setHeadIncludes(String arg) {
        optimisticData.put(getKey("head_includes"), arg);
        return this;
    }

    /**
     * Favicon Icon
     */
    public String getHeadShortcutIcon() {
        return (String) get("head_shortcut_icon");
    }

    public StoreConfig setHeadShortcutIcon(String arg) {
        optimisticData.put(getKey("head_shortcut_icon"), arg);
        return this;
    }

    /**
     * Logo Image
     */
    public String getHeaderLogoSrc() {
        return (String) get("header_logo_src");
    }

    public StoreConfig setHeaderLogoSrc(String arg) {
        optimisticData.put(getKey("header_logo_src"), arg);
        return this;
    }

    /**
     * The ID number assigned to the store
     */
    public Integer getId() {
        return (Integer) get("id");
    }

    public StoreConfig setId(Integer arg) {
        optimisticData.put(getKey("id"), arg);
        return this;
    }

    /**
     * List Mode.
     */
    public String getListMode() {
        return (String) get("list_mode");
    }

    public StoreConfig setListMode(String arg) {
        optimisticData.put(getKey("list_mode"), arg);
        return this;
    }

    /**
     * Products per Page on List Default Value.
     */
    public Integer getListPerPage() {
        return (Integer) get("list_per_page");
    }

    public StoreConfig setListPerPage(Integer arg) {
        optimisticData.put(getKey("list_per_page"), arg);
        return this;
    }

    /**
     * Products per Page on List Allowed Values.
     */
    public String getListPerPageValues() {
        return (String) get("list_per_page_values");
    }

    public StoreConfig setListPerPageValues(String arg) {
        optimisticData.put(getKey("list_per_page_values"), arg);
        return this;
    }

    /**
     * Store locale
     */
    public String getLocale() {
        return (String) get("locale");
    }

    public StoreConfig setLocale(String arg) {
        optimisticData.put(getKey("locale"), arg);
        return this;
    }

    /**
     * Logo Image Alt
     */
    public String getLogoAlt() {
        return (String) get("logo_alt");
    }

    public StoreConfig setLogoAlt(String arg) {
        optimisticData.put(getKey("logo_alt"), arg);
        return this;
    }

    /**
     * Logo Attribute Height
     */
    public Integer getLogoHeight() {
        return (Integer) get("logo_height");
    }

    public StoreConfig setLogoHeight(Integer arg) {
        optimisticData.put(getKey("logo_height"), arg);
        return this;
    }

    /**
     * Logo Attribute Width
     */
    public Integer getLogoWidth() {
        return (Integer) get("logo_width");
    }

    public StoreConfig setLogoWidth(Integer arg) {
        optimisticData.put(getKey("logo_width"), arg);
        return this;
    }

    /**
     * Reward points functionality status: enabled/disabled
     */
    public String getMagentoRewardGeneralIsEnabled() {
        return (String) get("magento_reward_general_is_enabled");
    }

    public StoreConfig setMagentoRewardGeneralIsEnabled(String arg) {
        optimisticData.put(getKey("magento_reward_general_is_enabled"), arg);
        return this;
    }

    /**
     * Reward points functionality status on the storefront: enabled/disabled
     */
    public String getMagentoRewardGeneralIsEnabledOnFront() {
        return (String) get("magento_reward_general_is_enabled_on_front");
    }

    public StoreConfig setMagentoRewardGeneralIsEnabledOnFront(String arg) {
        optimisticData.put(getKey("magento_reward_general_is_enabled_on_front"), arg);
        return this;
    }

    /**
     * Reward points redemption minimum threshold
     */
    public String getMagentoRewardGeneralMinPointsBalance() {
        return (String) get("magento_reward_general_min_points_balance");
    }

    public StoreConfig setMagentoRewardGeneralMinPointsBalance(String arg) {
        optimisticData.put(getKey("magento_reward_general_min_points_balance"), arg);
        return this;
    }

    /**
     * Enable reward points history for the customer
     */
    public String getMagentoRewardGeneralPublishHistory() {
        return (String) get("magento_reward_general_publish_history");
    }

    public StoreConfig setMagentoRewardGeneralPublishHistory(String arg) {
        optimisticData.put(getKey("magento_reward_general_publish_history"), arg);
        return this;
    }

    /**
     * Number of points for referral, when invitee registers on the site
     */
    public String getMagentoRewardPointsInvitationCustomer() {
        return (String) get("magento_reward_points_invitation_customer");
    }

    public StoreConfig setMagentoRewardPointsInvitationCustomer(String arg) {
        optimisticData.put(getKey("magento_reward_points_invitation_customer"), arg);
        return this;
    }

    /**
     * Maximum number of registration referrals that will qualify for rewards
     */
    public String getMagentoRewardPointsInvitationCustomerLimit() {
        return (String) get("magento_reward_points_invitation_customer_limit");
    }

    public StoreConfig setMagentoRewardPointsInvitationCustomerLimit(String arg) {
        optimisticData.put(getKey("magento_reward_points_invitation_customer_limit"), arg);
        return this;
    }

    /**
     * Number of points for referral, when invitee places an initial order on the site
     */
    public String getMagentoRewardPointsInvitationOrder() {
        return (String) get("magento_reward_points_invitation_order");
    }

    public StoreConfig setMagentoRewardPointsInvitationOrder(String arg) {
        optimisticData.put(getKey("magento_reward_points_invitation_order"), arg);
        return this;
    }

    /**
     * Maximum number of order placements by invitees that will qualify for rewards
     */
    public String getMagentoRewardPointsInvitationOrderLimit() {
        return (String) get("magento_reward_points_invitation_order_limit");
    }

    public StoreConfig setMagentoRewardPointsInvitationOrderLimit(String arg) {
        optimisticData.put(getKey("magento_reward_points_invitation_order_limit"), arg);
        return this;
    }

    /**
     * Number of points for newsletter subscription
     */
    public String getMagentoRewardPointsNewsletter() {
        return (String) get("magento_reward_points_newsletter");
    }

    public StoreConfig setMagentoRewardPointsNewsletter(String arg) {
        optimisticData.put(getKey("magento_reward_points_newsletter"), arg);
        return this;
    }

    /**
     * Whether customer earns points for shopping according to the reward point exchange rate. In Luma this
     * also controls whether to show a message in shopping cart about the rewards points earned for the
     * purchase, as well as the customer’s current reward point balance
     */
    public String getMagentoRewardPointsOrder() {
        return (String) get("magento_reward_points_order");
    }

    public StoreConfig setMagentoRewardPointsOrder(String arg) {
        optimisticData.put(getKey("magento_reward_points_order"), arg);
        return this;
    }

    /**
     * Number of points customer gets for registration
     */
    public String getMagentoRewardPointsRegister() {
        return (String) get("magento_reward_points_register");
    }

    public StoreConfig setMagentoRewardPointsRegister(String arg) {
        optimisticData.put(getKey("magento_reward_points_register"), arg);
        return this;
    }

    /**
     * Number of points for writing a review
     */
    public String getMagentoRewardPointsReview() {
        return (String) get("magento_reward_points_review");
    }

    public StoreConfig setMagentoRewardPointsReview(String arg) {
        optimisticData.put(getKey("magento_reward_points_review"), arg);
        return this;
    }

    /**
     * Maximum number of reviews that will qualify for the rewards
     */
    public String getMagentoRewardPointsReviewLimit() {
        return (String) get("magento_reward_points_review_limit");
    }

    public StoreConfig setMagentoRewardPointsReviewLimit(String arg) {
        optimisticData.put(getKey("magento_reward_points_review_limit"), arg);
        return this;
    }

    /**
     * Indicates whether wishlists are enabled (1) or disabled (0)
     */
    public String getMagentoWishlistGeneralIsEnabled() {
        return (String) get("magento_wishlist_general_is_enabled");
    }

    public StoreConfig setMagentoWishlistGeneralIsEnabled(String arg) {
        optimisticData.put(getKey("magento_wishlist_general_is_enabled"), arg);
        return this;
    }

    /**
     * The minimum number of characters required for a valid password.
     */
    public String getMinimumPasswordLength() {
        return (String) get("minimum_password_length");
    }

    public StoreConfig setMinimumPasswordLength(String arg) {
        optimisticData.put(getKey("minimum_password_length"), arg);
        return this;
    }

    /**
     * Default No-route URL
     */
    public String getNoRoute() {
        return (String) get("no_route");
    }

    public StoreConfig setNoRoute(String arg) {
        optimisticData.put(getKey("no_route"), arg);
        return this;
    }

    /**
     * Payflow Pro vault status.
     */
    public String getPaymentPayflowproCcVaultActive() {
        return (String) get("payment_payflowpro_cc_vault_active");
    }

    public StoreConfig setPaymentPayflowproCcVaultActive(String arg) {
        optimisticData.put(getKey("payment_payflowpro_cc_vault_active"), arg);
        return this;
    }

    /**
     * Default Price for Printed Card
     */
    public String getPrintedCardPrice() {
        return (String) get("printed_card_price");
    }

    public StoreConfig setPrintedCardPrice(String arg) {
        optimisticData.put(getKey("printed_card_price"), arg);
        return this;
    }

    /**
     * Corresponds to the &#39;Display Prices On Product View Page&#39; field. It indicates how FPT information is
     * displayed on product pages
     */
    public FixedProductTaxDisplaySettings getProductFixedProductTaxDisplaySetting() {
        return (FixedProductTaxDisplaySettings) get("product_fixed_product_tax_display_setting");
    }

    public StoreConfig setProductFixedProductTaxDisplaySetting(FixedProductTaxDisplaySettings arg) {
        optimisticData.put(getKey("product_fixed_product_tax_display_setting"), arg);
        return this;
    }

    /**
     * Indicates whether product reviews are enabled. Possible values: 1 (Yes) and 0 (No)
     */
    public String getProductReviewsEnabled() {
        return (String) get("product_reviews_enabled");
    }

    public StoreConfig setProductReviewsEnabled(String arg) {
        optimisticData.put(getKey("product_reviews_enabled"), arg);
        return this;
    }

    /**
     * Product URL Suffix.
     */
    public String getProductUrlSuffix() {
        return (String) get("product_url_suffix");
    }

    public StoreConfig setProductUrlSuffix(String arg) {
        optimisticData.put(getKey("product_url_suffix"), arg);
        return this;
    }

    /**
     * The number of different character classes required in a password (lowercase, uppercase, digits,
     * special characters).
     */
    public String getRequiredCharacterClassesNumber() {
        return (String) get("required_character_classes_number");
    }

    public StoreConfig setRequiredCharacterClassesNumber(String arg) {
        optimisticData.put(getKey("required_character_classes_number"), arg);
        return this;
    }

    /**
     * The ID of the root category
     */
    public Integer getRootCategoryId() {
        return (Integer) get("root_category_id");
    }

    public StoreConfig setRootCategoryId(Integer arg) {
        optimisticData.put(getKey("root_category_id"), arg);
        return this;
    }

    /**
     * Corresponds to the &#39;Display Prices In Sales Modules&#39; field. It indicates how FPT information is
     * displayed on cart, checkout, and order pages
     */
    public FixedProductTaxDisplaySettings getSalesFixedProductTaxDisplaySetting() {
        return (FixedProductTaxDisplaySettings) get("sales_fixed_product_tax_display_setting");
    }

    public StoreConfig setSalesFixedProductTaxDisplaySetting(FixedProductTaxDisplaySettings arg) {
        optimisticData.put(getKey("sales_fixed_product_tax_display_setting"), arg);
        return this;
    }

    /**
     * Display Gift Wrapping Prices
     */
    public String getSalesGiftWrapping() {
        return (String) get("sales_gift_wrapping");
    }

    public StoreConfig setSalesGiftWrapping(String arg) {
        optimisticData.put(getKey("sales_gift_wrapping"), arg);
        return this;
    }

    /**
     * Display Printed Card Prices
     */
    public String getSalesPrintedCard() {
        return (String) get("sales_printed_card");
    }

    public StoreConfig setSalesPrintedCard(String arg) {
        optimisticData.put(getKey("sales_printed_card"), arg);
        return this;
    }

    /**
     * Secure base link URL for the store
     */
    public String getSecureBaseLinkUrl() {
        return (String) get("secure_base_link_url");
    }

    public StoreConfig setSecureBaseLinkUrl(String arg) {
        optimisticData.put(getKey("secure_base_link_url"), arg);
        return this;
    }

    /**
     * Secure base media URL for the store
     */
    public String getSecureBaseMediaUrl() {
        return (String) get("secure_base_media_url");
    }

    public StoreConfig setSecureBaseMediaUrl(String arg) {
        optimisticData.put(getKey("secure_base_media_url"), arg);
        return this;
    }

    /**
     * Secure base static URL for the store
     */
    public String getSecureBaseStaticUrl() {
        return (String) get("secure_base_static_url");
    }

    public StoreConfig setSecureBaseStaticUrl(String arg) {
        optimisticData.put(getKey("secure_base_static_url"), arg);
        return this;
    }

    /**
     * Secure base URL for the store
     */
    public String getSecureBaseUrl() {
        return (String) get("secure_base_url");
    }

    public StoreConfig setSecureBaseUrl(String arg) {
        optimisticData.put(getKey("secure_base_url"), arg);
        return this;
    }

    /**
     * Email to a Friend configuration.
     */
    public SendFriendConfiguration getSendFriend() {
        return (SendFriendConfiguration) get("send_friend");
    }

    public StoreConfig setSendFriend(SendFriendConfiguration arg) {
        optimisticData.put(getKey("send_friend"), arg);
        return this;
    }

    /**
     * Show Breadcrumbs for CMS Pages
     */
    public Integer getShowCmsBreadcrumbs() {
        return (Integer) get("show_cms_breadcrumbs");
    }

    public StoreConfig setShowCmsBreadcrumbs(Integer arg) {
        optimisticData.put(getKey("show_cms_breadcrumbs"), arg);
        return this;
    }

    /**
     * Name of the store
     */
    public String getStoreName() {
        return (String) get("store_name");
    }

    public StoreConfig setStoreName(String arg) {
        optimisticData.put(getKey("store_name"), arg);
        return this;
    }

    /**
     * Timezone of the store
     */
    public String getTimezone() {
        return (String) get("timezone");
    }

    public StoreConfig setTimezone(String arg) {
        optimisticData.put(getKey("timezone"), arg);
        return this;
    }

    /**
     * Page Title Prefix
     */
    public String getTitlePrefix() {
        return (String) get("title_prefix");
    }

    public StoreConfig setTitlePrefix(String arg) {
        optimisticData.put(getKey("title_prefix"), arg);
        return this;
    }

    /**
     * Page Title Separator.
     */
    public String getTitleSeparator() {
        return (String) get("title_separator");
    }

    public StoreConfig setTitleSeparator(String arg) {
        optimisticData.put(getKey("title_separator"), arg);
        return this;
    }

    /**
     * Page Title Suffix
     */
    public String getTitleSuffix() {
        return (String) get("title_suffix");
    }

    public StoreConfig setTitleSuffix(String arg) {
        optimisticData.put(getKey("title_suffix"), arg);
        return this;
    }

    /**
     * The ID number assigned to the website store belongs
     */
    public Integer getWebsiteId() {
        return (Integer) get("website_id");
    }

    public StoreConfig setWebsiteId(Integer arg) {
        optimisticData.put(getKey("website_id"), arg);
        return this;
    }

    /**
     * The unit of weight
     */
    public String getWeightUnit() {
        return (String) get("weight_unit");
    }

    public StoreConfig setWeightUnit(String arg) {
        optimisticData.put(getKey("weight_unit"), arg);
        return this;
    }

    /**
     * Welcome Text
     */
    public String getWelcome() {
        return (String) get("welcome");
    }

    public StoreConfig setWelcome(String arg) {
        optimisticData.put(getKey("welcome"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "absolute_footer": return false;

            case "allow_gift_receipt": return false;

            case "allow_gift_wrapping_on_order": return false;

            case "allow_gift_wrapping_on_order_items": return false;

            case "allow_guests_to_write_product_reviews": return false;

            case "allow_items": return false;

            case "allow_order": return false;

            case "allow_printed_card": return false;

            case "autocomplete_on_storefront": return false;

            case "base_currency_code": return false;

            case "base_link_url": return false;

            case "base_media_url": return false;

            case "base_static_url": return false;

            case "base_url": return false;

            case "cart_gift_wrapping": return false;

            case "cart_printed_card": return false;

            case "catalog_default_sort_by": return false;

            case "category_fixed_product_tax_display_setting": return false;

            case "category_url_suffix": return false;

            case "cms_home_page": return false;

            case "cms_no_cookies": return false;

            case "cms_no_route": return false;

            case "code": return false;

            case "copyright": return false;

            case "default_description": return false;

            case "default_display_currency_code": return false;

            case "default_keywords": return false;

            case "default_title": return false;

            case "demonotice": return false;

            case "front": return false;

            case "grid_per_page": return false;

            case "grid_per_page_values": return false;

            case "head_includes": return false;

            case "head_shortcut_icon": return false;

            case "header_logo_src": return false;

            case "id": return false;

            case "list_mode": return false;

            case "list_per_page": return false;

            case "list_per_page_values": return false;

            case "locale": return false;

            case "logo_alt": return false;

            case "logo_height": return false;

            case "logo_width": return false;

            case "magento_reward_general_is_enabled": return false;

            case "magento_reward_general_is_enabled_on_front": return false;

            case "magento_reward_general_min_points_balance": return false;

            case "magento_reward_general_publish_history": return false;

            case "magento_reward_points_invitation_customer": return false;

            case "magento_reward_points_invitation_customer_limit": return false;

            case "magento_reward_points_invitation_order": return false;

            case "magento_reward_points_invitation_order_limit": return false;

            case "magento_reward_points_newsletter": return false;

            case "magento_reward_points_order": return false;

            case "magento_reward_points_register": return false;

            case "magento_reward_points_review": return false;

            case "magento_reward_points_review_limit": return false;

            case "magento_wishlist_general_is_enabled": return false;

            case "minimum_password_length": return false;

            case "no_route": return false;

            case "payment_payflowpro_cc_vault_active": return false;

            case "printed_card_price": return false;

            case "product_fixed_product_tax_display_setting": return false;

            case "product_reviews_enabled": return false;

            case "product_url_suffix": return false;

            case "required_character_classes_number": return false;

            case "root_category_id": return false;

            case "sales_fixed_product_tax_display_setting": return false;

            case "sales_gift_wrapping": return false;

            case "sales_printed_card": return false;

            case "secure_base_link_url": return false;

            case "secure_base_media_url": return false;

            case "secure_base_static_url": return false;

            case "secure_base_url": return false;

            case "send_friend": return true;

            case "show_cms_breadcrumbs": return false;

            case "store_name": return false;

            case "timezone": return false;

            case "title_prefix": return false;

            case "title_separator": return false;

            case "title_suffix": return false;

            case "website_id": return false;

            case "weight_unit": return false;

            case "welcome": return false;

            default: return false;
        }
    }
}

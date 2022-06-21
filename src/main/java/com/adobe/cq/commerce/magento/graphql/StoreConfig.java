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

import java.util.Map;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;

/**
 * Contains information about a store&#39;s configuration.
 */
public class StoreConfig extends AbstractResponse<StoreConfig> {
    public StoreConfig() {}

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

                case "braintree_cc_vault_active": {
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

                case "check_money_order_enable_for_specific_countries": {
                    Boolean optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsBoolean(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "check_money_order_enabled": {
                    Boolean optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsBoolean(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "check_money_order_make_check_payable_to": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "check_money_order_max_order_total": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "check_money_order_min_order_total": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "check_money_order_new_order_status": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "check_money_order_payment_from_specific_countries": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "check_money_order_send_check_to": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "check_money_order_sort_order": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "check_money_order_title": {
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

                case "configurable_thumbnail_source": {
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

                case "enable_multiple_wishlists": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
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

                case "is_default_store": {
                    Boolean optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsBoolean(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "is_default_store_group": {
                    Boolean optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsBoolean(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "is_negotiable_quote_active": {
                    Boolean optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsBoolean(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "is_requisition_list_active": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
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

                case "maximum_number_of_wishlists": {
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

                case "returns_enabled": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

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

                case "root_category_uid": {
                    ID optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ID(jsonAsString(field.getValue(), key));
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

                case "store_code": {
                    ID optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ID(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "store_group_code": {
                    ID optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ID(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "store_group_name": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
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

                case "store_sort_order": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
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

                case "use_store_in_url": {
                    Boolean optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsBoolean(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "website_code": {
                    ID optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ID(jsonAsString(field.getValue(), key));
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

                case "website_name": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
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

                case "zero_subtotal_enable_for_specific_countries": {
                    Boolean optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsBoolean(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "zero_subtotal_enabled": {
                    Boolean optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsBoolean(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "zero_subtotal_new_order_status": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "zero_subtotal_payment_action": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "zero_subtotal_payment_from_specific_countries": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "zero_subtotal_sort_order": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "zero_subtotal_title": {
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
     * Contains scripts that must be included in the HTML before the closing `&lt;body&gt;` tag.
     */
    public String getAbsoluteFooter() {
        return (String) get("absolute_footer");
    }

    public StoreConfig setAbsoluteFooter(String arg) {
        optimisticData.put(getKey("absolute_footer"), arg);
        return this;
    }

    /**
     * Indicates if the gift sender has the option to send a gift receipt. Possible values: 1 (Yes) and 0
     * (No).
     */
    public String getAllowGiftReceipt() {
        return (String) get("allow_gift_receipt");
    }

    public StoreConfig setAllowGiftReceipt(String arg) {
        optimisticData.put(getKey("allow_gift_receipt"), arg);
        return this;
    }

    /**
     * Indicates whether gift wrapping can be added for the entire order. Possible values: 1 (Yes) and 0
     * (No).
     */
    public String getAllowGiftWrappingOnOrder() {
        return (String) get("allow_gift_wrapping_on_order");
    }

    public StoreConfig setAllowGiftWrappingOnOrder(String arg) {
        optimisticData.put(getKey("allow_gift_wrapping_on_order"), arg);
        return this;
    }

    /**
     * Indicates whether gift wrapping can be added for individual order items. Possible values: 1 (Yes)
     * and 0 (No).
     */
    public String getAllowGiftWrappingOnOrderItems() {
        return (String) get("allow_gift_wrapping_on_order_items");
    }

    public StoreConfig setAllowGiftWrappingOnOrderItems(String arg) {
        optimisticData.put(getKey("allow_gift_wrapping_on_order_items"), arg);
        return this;
    }

    /**
     * Indicates whether guest users can write product reviews. Possible values: 1 (Yes) and 0 (No).
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
     * Indicates if a printed card can accompany an order. Possible values: 1 (Yes) and 0 (No).
     */
    public String getAllowPrintedCard() {
        return (String) get("allow_printed_card");
    }

    public StoreConfig setAllowPrintedCard(String arg) {
        optimisticData.put(getKey("allow_printed_card"), arg);
        return this;
    }

    /**
     * Indicates whether to enable autocomplete on login and forgot password forms.
     */
    public Boolean getAutocompleteOnStorefront() {
        return (Boolean) get("autocomplete_on_storefront");
    }

    public StoreConfig setAutocompleteOnStorefront(Boolean arg) {
        optimisticData.put(getKey("autocomplete_on_storefront"), arg);
        return this;
    }

    /**
     * The base currency code.
     */
    public String getBaseCurrencyCode() {
        return (String) get("base_currency_code");
    }

    public StoreConfig setBaseCurrencyCode(String arg) {
        optimisticData.put(getKey("base_currency_code"), arg);
        return this;
    }

    /**
     * A fully-qualified URL that is used to create relative links to the `base_url`.
     */
    public String getBaseLinkUrl() {
        return (String) get("base_link_url");
    }

    public StoreConfig setBaseLinkUrl(String arg) {
        optimisticData.put(getKey("base_link_url"), arg);
        return this;
    }

    /**
     * The fully-qualified URL that specifies the location of media files.
     */
    public String getBaseMediaUrl() {
        return (String) get("base_media_url");
    }

    public StoreConfig setBaseMediaUrl(String arg) {
        optimisticData.put(getKey("base_media_url"), arg);
        return this;
    }

    /**
     * The fully-qualified URL that specifies the location of static view files.
     */
    public String getBaseStaticUrl() {
        return (String) get("base_static_url");
    }

    public StoreConfig setBaseStaticUrl(String arg) {
        optimisticData.put(getKey("base_static_url"), arg);
        return this;
    }

    /**
     * The store’s fully-qualified base URL.
     */
    public String getBaseUrl() {
        return (String) get("base_url");
    }

    public StoreConfig setBaseUrl(String arg) {
        optimisticData.put(getKey("base_url"), arg);
        return this;
    }

    /**
     * Braintree cc vault status.
     */
    public String getBraintreeCcVaultActive() {
        return (String) get("braintree_cc_vault_active");
    }

    public StoreConfig setBraintreeCcVaultActive(String arg) {
        optimisticData.put(getKey("braintree_cc_vault_active"), arg);
        return this;
    }

    /**
     * Indicates if gift wrapping prices are displayed on the Shopping Cart page. Possible values: 1 (Yes)
     * and 0 (No).
     */
    public String getCartGiftWrapping() {
        return (String) get("cart_gift_wrapping");
    }

    public StoreConfig setCartGiftWrapping(String arg) {
        optimisticData.put(getKey("cart_gift_wrapping"), arg);
        return this;
    }

    /**
     * Indicates if printed card prices are displayed on the Shopping Cart page. Possible values: 1 (Yes)
     * and 0 (No).
     */
    public String getCartPrintedCard() {
        return (String) get("cart_printed_card");
    }

    public StoreConfig setCartPrintedCard(String arg) {
        optimisticData.put(getKey("cart_printed_card"), arg);
        return this;
    }

    /**
     * The default sort order of the search results list.
     */
    public String getCatalogDefaultSortBy() {
        return (String) get("catalog_default_sort_by");
    }

    public StoreConfig setCatalogDefaultSortBy(String arg) {
        optimisticData.put(getKey("catalog_default_sort_by"), arg);
        return this;
    }

    /**
     * Corresponds to the &#39;Display Prices In Product Lists&#39; field in the Admin. It indicates how FPT
     * information is displayed on category pages.
     */
    public FixedProductTaxDisplaySettings getCategoryFixedProductTaxDisplaySetting() {
        return (FixedProductTaxDisplaySettings) get("category_fixed_product_tax_display_setting");
    }

    public StoreConfig setCategoryFixedProductTaxDisplaySetting(FixedProductTaxDisplaySettings arg) {
        optimisticData.put(getKey("category_fixed_product_tax_display_setting"), arg);
        return this;
    }

    /**
     * The suffix applied to category pages, such as `.htm` or `.html`.
     */
    public String getCategoryUrlSuffix() {
        return (String) get("category_url_suffix");
    }

    public StoreConfig setCategoryUrlSuffix(String arg) {
        optimisticData.put(getKey("category_url_suffix"), arg);
        return this;
    }

    /**
     * Indicates whether only specific countries can use this payment method.
     */
    public Boolean getCheckMoneyOrderEnableForSpecificCountries() {
        return (Boolean) get("check_money_order_enable_for_specific_countries");
    }

    public StoreConfig setCheckMoneyOrderEnableForSpecificCountries(Boolean arg) {
        optimisticData.put(getKey("check_money_order_enable_for_specific_countries"), arg);
        return this;
    }

    /**
     * Indicates whether the Check/Money Order payment method is enabled.
     */
    public Boolean getCheckMoneyOrderEnabled() {
        return (Boolean) get("check_money_order_enabled");
    }

    public StoreConfig setCheckMoneyOrderEnabled(Boolean arg) {
        optimisticData.put(getKey("check_money_order_enabled"), arg);
        return this;
    }

    /**
     * The name of the party to whom the check must be payable.
     */
    public String getCheckMoneyOrderMakeCheckPayableTo() {
        return (String) get("check_money_order_make_check_payable_to");
    }

    public StoreConfig setCheckMoneyOrderMakeCheckPayableTo(String arg) {
        optimisticData.put(getKey("check_money_order_make_check_payable_to"), arg);
        return this;
    }

    /**
     * The maximum order amount required to qualify for the Check/Money Order payment method.
     */
    public String getCheckMoneyOrderMaxOrderTotal() {
        return (String) get("check_money_order_max_order_total");
    }

    public StoreConfig setCheckMoneyOrderMaxOrderTotal(String arg) {
        optimisticData.put(getKey("check_money_order_max_order_total"), arg);
        return this;
    }

    /**
     * The minimum order amount required to qualify for the Check/Money Order payment method.
     */
    public String getCheckMoneyOrderMinOrderTotal() {
        return (String) get("check_money_order_min_order_total");
    }

    public StoreConfig setCheckMoneyOrderMinOrderTotal(String arg) {
        optimisticData.put(getKey("check_money_order_min_order_total"), arg);
        return this;
    }

    /**
     * The status of new orders placed using the Check/Money Order payment method.
     */
    public String getCheckMoneyOrderNewOrderStatus() {
        return (String) get("check_money_order_new_order_status");
    }

    public StoreConfig setCheckMoneyOrderNewOrderStatus(String arg) {
        optimisticData.put(getKey("check_money_order_new_order_status"), arg);
        return this;
    }

    /**
     * A comma-separated list of specific countries allowed to use the Check/Money Order payment method.
     */
    public String getCheckMoneyOrderPaymentFromSpecificCountries() {
        return (String) get("check_money_order_payment_from_specific_countries");
    }

    public StoreConfig setCheckMoneyOrderPaymentFromSpecificCountries(String arg) {
        optimisticData.put(getKey("check_money_order_payment_from_specific_countries"), arg);
        return this;
    }

    /**
     * The full street address or PO Box where the checks are mailed.
     */
    public String getCheckMoneyOrderSendCheckTo() {
        return (String) get("check_money_order_send_check_to");
    }

    public StoreConfig setCheckMoneyOrderSendCheckTo(String arg) {
        optimisticData.put(getKey("check_money_order_send_check_to"), arg);
        return this;
    }

    /**
     * A number indicating the position of the Check/Money Order payment method in the list of available
     * payment methods during checkout.
     */
    public Integer getCheckMoneyOrderSortOrder() {
        return (Integer) get("check_money_order_sort_order");
    }

    public StoreConfig setCheckMoneyOrderSortOrder(Integer arg) {
        optimisticData.put(getKey("check_money_order_sort_order"), arg);
        return this;
    }

    /**
     * The title of the Check/Money Order payment method displayed on the storefront.
     */
    public String getCheckMoneyOrderTitle() {
        return (String) get("check_money_order_title");
    }

    public StoreConfig setCheckMoneyOrderTitle(String arg) {
        optimisticData.put(getKey("check_money_order_title"), arg);
        return this;
    }

    /**
     * The name of the CMS page that identifies the home page for the store.
     */
    public String getCmsHomePage() {
        return (String) get("cms_home_page");
    }

    public StoreConfig setCmsHomePage(String arg) {
        optimisticData.put(getKey("cms_home_page"), arg);
        return this;
    }

    /**
     * A specific CMS page that displays when cookies are not enabled for the browser.
     */
    public String getCmsNoCookies() {
        return (String) get("cms_no_cookies");
    }

    public StoreConfig setCmsNoCookies(String arg) {
        optimisticData.put(getKey("cms_no_cookies"), arg);
        return this;
    }

    /**
     * A specific CMS page that displays when a 404 &#39;Page Not Found&#39; error occurs.
     */
    public String getCmsNoRoute() {
        return (String) get("cms_no_route");
    }

    public StoreConfig setCmsNoRoute(String arg) {
        optimisticData.put(getKey("cms_no_route"), arg);
        return this;
    }

    /**
     * A code assigned to the store to identify it.
     *
     * @deprecated Use `store_code` instead.
     */
    @Deprecated
    public String getCode() {
        return (String) get("code");
    }

    public StoreConfig setCode(String arg) {
        optimisticData.put(getKey("code"), arg);
        return this;
    }

    /**
     * Indicates whether the `parent` or child (`itself`) thumbnail should be used in the cart for
     * configurable products.
     */
    public String getConfigurableThumbnailSource() {
        return (String) get("configurable_thumbnail_source");
    }

    public StoreConfig setConfigurableThumbnailSource(String arg) {
        optimisticData.put(getKey("configurable_thumbnail_source"), arg);
        return this;
    }

    /**
     * The copyright statement that appears at the bottom of each page.
     */
    public String getCopyright() {
        return (String) get("copyright");
    }

    public StoreConfig setCopyright(String arg) {
        optimisticData.put(getKey("copyright"), arg);
        return this;
    }

    /**
     * The description that provides a summary of your site for search engine listings. It should not be
     * more than 160 characters in length.
     */
    public String getDefaultDescription() {
        return (String) get("default_description");
    }

    public StoreConfig setDefaultDescription(String arg) {
        optimisticData.put(getKey("default_description"), arg);
        return this;
    }

    /**
     * The default display currency code.
     */
    public String getDefaultDisplayCurrencyCode() {
        return (String) get("default_display_currency_code");
    }

    public StoreConfig setDefaultDisplayCurrencyCode(String arg) {
        optimisticData.put(getKey("default_display_currency_code"), arg);
        return this;
    }

    /**
     * A series of keywords that describe your store, each separated by a comma.
     */
    public String getDefaultKeywords() {
        return (String) get("default_keywords");
    }

    public StoreConfig setDefaultKeywords(String arg) {
        optimisticData.put(getKey("default_keywords"), arg);
        return this;
    }

    /**
     * The title that appears at the title bar of each page when viewed in a browser.
     */
    public String getDefaultTitle() {
        return (String) get("default_title");
    }

    public StoreConfig setDefaultTitle(String arg) {
        optimisticData.put(getKey("default_title"), arg);
        return this;
    }

    /**
     * Controls the display of the demo store notice at the top of the page. Options: 0 (No) or 1 (Yes).
     */
    public Integer getDemonotice() {
        return (Integer) get("demonotice");
    }

    public StoreConfig setDemonotice(Integer arg) {
        optimisticData.put(getKey("demonotice"), arg);
        return this;
    }

    /**
     * Indicates whether customers can have multiple wish lists. Possible values: 1 (Yes) and 0 (No).
     */
    public String getEnableMultipleWishlists() {
        return (String) get("enable_multiple_wishlists");
    }

    public StoreConfig setEnableMultipleWishlists(String arg) {
        optimisticData.put(getKey("enable_multiple_wishlists"), arg);
        return this;
    }

    /**
     * The landing page that is associated with the base URL.
     */
    public String getFront() {
        return (String) get("front");
    }

    public StoreConfig setFront(String arg) {
        optimisticData.put(getKey("front"), arg);
        return this;
    }

    /**
     * The default number of products per page in Grid View.
     */
    public Integer getGridPerPage() {
        return (Integer) get("grid_per_page");
    }

    public StoreConfig setGridPerPage(Integer arg) {
        optimisticData.put(getKey("grid_per_page"), arg);
        return this;
    }

    /**
     * A list of numbers that define how many products can be displayed in Grid View.
     */
    public String getGridPerPageValues() {
        return (String) get("grid_per_page_values");
    }

    public StoreConfig setGridPerPageValues(String arg) {
        optimisticData.put(getKey("grid_per_page_values"), arg);
        return this;
    }

    /**
     * Scripts that must be included in the HTML before the closing `&lt;head&gt;` tag.
     */
    public String getHeadIncludes() {
        return (String) get("head_includes");
    }

    public StoreConfig setHeadIncludes(String arg) {
        optimisticData.put(getKey("head_includes"), arg);
        return this;
    }

    /**
     * The small graphic image (favicon) that appears in the address bar and tab of the browser.
     */
    public String getHeadShortcutIcon() {
        return (String) get("head_shortcut_icon");
    }

    public StoreConfig setHeadShortcutIcon(String arg) {
        optimisticData.put(getKey("head_shortcut_icon"), arg);
        return this;
    }

    /**
     * The path to the logo that appears in the header.
     */
    public String getHeaderLogoSrc() {
        return (String) get("header_logo_src");
    }

    public StoreConfig setHeaderLogoSrc(String arg) {
        optimisticData.put(getKey("header_logo_src"), arg);
        return this;
    }

    /**
     * The ID number assigned to the store.
     *
     * @deprecated Use `store_code` instead.
     */
    @Deprecated
    public Integer getId() {
        return (Integer) get("id");
    }

    public StoreConfig setId(Integer arg) {
        optimisticData.put(getKey("id"), arg);
        return this;
    }

    /**
     * Indicates whether the store view has been designated as the default within the store group.
     */
    public Boolean getIsDefaultStore() {
        return (Boolean) get("is_default_store");
    }

    public StoreConfig setIsDefaultStore(Boolean arg) {
        optimisticData.put(getKey("is_default_store"), arg);
        return this;
    }

    /**
     * Indicates whether the store group has been designated as the default within the website.
     */
    public Boolean getIsDefaultStoreGroup() {
        return (Boolean) get("is_default_store_group");
    }

    public StoreConfig setIsDefaultStoreGroup(Boolean arg) {
        optimisticData.put(getKey("is_default_store_group"), arg);
        return this;
    }

    /**
     * Indicates whether negotiable quote functionality is enabled.
     */
    public Boolean getIsNegotiableQuoteActive() {
        return (Boolean) get("is_negotiable_quote_active");
    }

    public StoreConfig setIsNegotiableQuoteActive(Boolean arg) {
        optimisticData.put(getKey("is_negotiable_quote_active"), arg);
        return this;
    }

    /**
     * Indicates whether requisition lists are enabled. Possible values: 1 (Yes) and 0 (No).
     */
    public String getIsRequisitionListActive() {
        return (String) get("is_requisition_list_active");
    }

    public StoreConfig setIsRequisitionListActive(String arg) {
        optimisticData.put(getKey("is_requisition_list_active"), arg);
        return this;
    }

    /**
     * The format of the search results list.
     */
    public String getListMode() {
        return (String) get("list_mode");
    }

    public StoreConfig setListMode(String arg) {
        optimisticData.put(getKey("list_mode"), arg);
        return this;
    }

    /**
     * The default number of products per page in List View.
     */
    public Integer getListPerPage() {
        return (Integer) get("list_per_page");
    }

    public StoreConfig setListPerPage(Integer arg) {
        optimisticData.put(getKey("list_per_page"), arg);
        return this;
    }

    /**
     * A list of numbers that define how many products can be displayed in List View.
     */
    public String getListPerPageValues() {
        return (String) get("list_per_page_values");
    }

    public StoreConfig setListPerPageValues(String arg) {
        optimisticData.put(getKey("list_per_page_values"), arg);
        return this;
    }

    /**
     * The store locale.
     */
    public String getLocale() {
        return (String) get("locale");
    }

    public StoreConfig setLocale(String arg) {
        optimisticData.put(getKey("locale"), arg);
        return this;
    }

    /**
     * The Alt text that is associated with the logo.
     */
    public String getLogoAlt() {
        return (String) get("logo_alt");
    }

    public StoreConfig setLogoAlt(String arg) {
        optimisticData.put(getKey("logo_alt"), arg);
        return this;
    }

    /**
     * The height of the logo image, in pixels.
     */
    public Integer getLogoHeight() {
        return (Integer) get("logo_height");
    }

    public StoreConfig setLogoHeight(Integer arg) {
        optimisticData.put(getKey("logo_height"), arg);
        return this;
    }

    /**
     * The width of the logo image, in pixels.
     */
    public Integer getLogoWidth() {
        return (Integer) get("logo_width");
    }

    public StoreConfig setLogoWidth(Integer arg) {
        optimisticData.put(getKey("logo_width"), arg);
        return this;
    }

    /**
     * Indicates whether reward points functionality is enabled. Possible values: 1 (Enabled) and 0
     * (Disabled).
     */
    public String getMagentoRewardGeneralIsEnabled() {
        return (String) get("magento_reward_general_is_enabled");
    }

    public StoreConfig setMagentoRewardGeneralIsEnabled(String arg) {
        optimisticData.put(getKey("magento_reward_general_is_enabled"), arg);
        return this;
    }

    /**
     * Indicates whether reward points functionality is enabled on the storefront. Possible values: 1
     * (Enabled) and 0 (Disabled).
     */
    public String getMagentoRewardGeneralIsEnabledOnFront() {
        return (String) get("magento_reward_general_is_enabled_on_front");
    }

    public StoreConfig setMagentoRewardGeneralIsEnabledOnFront(String arg) {
        optimisticData.put(getKey("magento_reward_general_is_enabled_on_front"), arg);
        return this;
    }

    /**
     * The minimum point balance customers must have before they can redeem them. A null value indicates no
     * minimum.
     */
    public String getMagentoRewardGeneralMinPointsBalance() {
        return (String) get("magento_reward_general_min_points_balance");
    }

    public StoreConfig setMagentoRewardGeneralMinPointsBalance(String arg) {
        optimisticData.put(getKey("magento_reward_general_min_points_balance"), arg);
        return this;
    }

    /**
     * When enabled, customers can see a detailed history of their reward points. Possible values: 1
     * (Enabled) and 0 (Disabled).
     */
    public String getMagentoRewardGeneralPublishHistory() {
        return (String) get("magento_reward_general_publish_history");
    }

    public StoreConfig setMagentoRewardGeneralPublishHistory(String arg) {
        optimisticData.put(getKey("magento_reward_general_publish_history"), arg);
        return this;
    }

    /**
     * The number of points for a referral when an invitee registers on the site.
     */
    public String getMagentoRewardPointsInvitationCustomer() {
        return (String) get("magento_reward_points_invitation_customer");
    }

    public StoreConfig setMagentoRewardPointsInvitationCustomer(String arg) {
        optimisticData.put(getKey("magento_reward_points_invitation_customer"), arg);
        return this;
    }

    /**
     * The maximum number of registration referrals that will qualify for rewards. A null value indicates
     * no limit.
     */
    public String getMagentoRewardPointsInvitationCustomerLimit() {
        return (String) get("magento_reward_points_invitation_customer_limit");
    }

    public StoreConfig setMagentoRewardPointsInvitationCustomerLimit(String arg) {
        optimisticData.put(getKey("magento_reward_points_invitation_customer_limit"), arg);
        return this;
    }

    /**
     * The number of points for a referral, when an invitee places their first order on the site.
     */
    public String getMagentoRewardPointsInvitationOrder() {
        return (String) get("magento_reward_points_invitation_order");
    }

    public StoreConfig setMagentoRewardPointsInvitationOrder(String arg) {
        optimisticData.put(getKey("magento_reward_points_invitation_order"), arg);
        return this;
    }

    /**
     * The number of order conversions that can earn points for the customer who sends the invitation. A
     * null value indicates no limit.
     */
    public String getMagentoRewardPointsInvitationOrderLimit() {
        return (String) get("magento_reward_points_invitation_order_limit");
    }

    public StoreConfig setMagentoRewardPointsInvitationOrderLimit(String arg) {
        optimisticData.put(getKey("magento_reward_points_invitation_order_limit"), arg);
        return this;
    }

    /**
     * The number of points earned by registered customers who subscribe to a newsletter.
     */
    public String getMagentoRewardPointsNewsletter() {
        return (String) get("magento_reward_points_newsletter");
    }

    public StoreConfig setMagentoRewardPointsNewsletter(String arg) {
        optimisticData.put(getKey("magento_reward_points_newsletter"), arg);
        return this;
    }

    /**
     * Indicates customers earn points for shopping according to the reward point exchange rate. In Luma,
     * this also controls whether to show a message in the shopping cart about the rewards points earned
     * for the purchase, as well as the customer’s current reward point balance.
     */
    public String getMagentoRewardPointsOrder() {
        return (String) get("magento_reward_points_order");
    }

    public StoreConfig setMagentoRewardPointsOrder(String arg) {
        optimisticData.put(getKey("magento_reward_points_order"), arg);
        return this;
    }

    /**
     * The number of points customer gets for registering.
     */
    public String getMagentoRewardPointsRegister() {
        return (String) get("magento_reward_points_register");
    }

    public StoreConfig setMagentoRewardPointsRegister(String arg) {
        optimisticData.put(getKey("magento_reward_points_register"), arg);
        return this;
    }

    /**
     * The number of points for writing a review.
     */
    public String getMagentoRewardPointsReview() {
        return (String) get("magento_reward_points_review");
    }

    public StoreConfig setMagentoRewardPointsReview(String arg) {
        optimisticData.put(getKey("magento_reward_points_review"), arg);
        return this;
    }

    /**
     * The maximum number of reviews that will qualify for the rewards. A null value indicates no limit.
     */
    public String getMagentoRewardPointsReviewLimit() {
        return (String) get("magento_reward_points_review_limit");
    }

    public StoreConfig setMagentoRewardPointsReviewLimit(String arg) {
        optimisticData.put(getKey("magento_reward_points_review_limit"), arg);
        return this;
    }

    /**
     * Indicates whether wishlists are enabled (1) or disabled (0).
     */
    public String getMagentoWishlistGeneralIsEnabled() {
        return (String) get("magento_wishlist_general_is_enabled");
    }

    public StoreConfig setMagentoWishlistGeneralIsEnabled(String arg) {
        optimisticData.put(getKey("magento_wishlist_general_is_enabled"), arg);
        return this;
    }

    /**
     * If multiple wish lists are enabled, the maximum number of wish lists the customer can have.
     */
    public String getMaximumNumberOfWishlists() {
        return (String) get("maximum_number_of_wishlists");
    }

    public StoreConfig setMaximumNumberOfWishlists(String arg) {
        optimisticData.put(getKey("maximum_number_of_wishlists"), arg);
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
     * The default page that displays when a 404 &#39;Page not Found&#39; error occurs.
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
     * The default price of a printed card that accompanies an order.
     */
    public String getPrintedCardPrice() {
        return (String) get("printed_card_price");
    }

    public StoreConfig setPrintedCardPrice(String arg) {
        optimisticData.put(getKey("printed_card_price"), arg);
        return this;
    }

    /**
     * Corresponds to the &#39;Display Prices On Product View Page&#39; field in the Admin. It indicates how FPT
     * information is displayed on product pages.
     */
    public FixedProductTaxDisplaySettings getProductFixedProductTaxDisplaySetting() {
        return (FixedProductTaxDisplaySettings) get("product_fixed_product_tax_display_setting");
    }

    public StoreConfig setProductFixedProductTaxDisplaySetting(FixedProductTaxDisplaySettings arg) {
        optimisticData.put(getKey("product_fixed_product_tax_display_setting"), arg);
        return this;
    }

    /**
     * Indicates whether product reviews are enabled. Possible values: 1 (Yes) and 0 (No).
     */
    public String getProductReviewsEnabled() {
        return (String) get("product_reviews_enabled");
    }

    public StoreConfig setProductReviewsEnabled(String arg) {
        optimisticData.put(getKey("product_reviews_enabled"), arg);
        return this;
    }

    /**
     * The suffix applied to product pages, such as `.htm` or `.html`.
     */
    public String getProductUrlSuffix() {
        return (String) get("product_url_suffix");
    }

    public StoreConfig setProductUrlSuffix(String arg) {
        optimisticData.put(getKey("product_url_suffix"), arg);
        return this;
    }

    /**
     * The number of different character classes (lowercase, uppercase, digits, special characters)
     * required in a password.
     */
    public String getRequiredCharacterClassesNumber() {
        return (String) get("required_character_classes_number");
    }

    public StoreConfig setRequiredCharacterClassesNumber(String arg) {
        optimisticData.put(getKey("required_character_classes_number"), arg);
        return this;
    }

    /**
     * Indicates whether RMA is enabled on the storefront. Possible values: enabled/disabled.
     */
    public String getReturnsEnabled() {
        return (String) get("returns_enabled");
    }

    public StoreConfig setReturnsEnabled(String arg) {
        optimisticData.put(getKey("returns_enabled"), arg);
        return this;
    }

    /**
     * The ID of the root category.
     *
     * @deprecated Use `root_category_uid` instead.
     */
    @Deprecated
    public Integer getRootCategoryId() {
        return (Integer) get("root_category_id");
    }

    public StoreConfig setRootCategoryId(Integer arg) {
        optimisticData.put(getKey("root_category_id"), arg);
        return this;
    }

    /**
     * The unique ID for a `CategoryInterface` object.
     */
    public ID getRootCategoryUid() {
        return (ID) get("root_category_uid");
    }

    public StoreConfig setRootCategoryUid(ID arg) {
        optimisticData.put(getKey("root_category_uid"), arg);
        return this;
    }

    /**
     * Corresponds to the &#39;Display Prices In Sales Modules&#39; field in the Admin. It indicates how FPT
     * information is displayed on cart, checkout, and order pages.
     */
    public FixedProductTaxDisplaySettings getSalesFixedProductTaxDisplaySetting() {
        return (FixedProductTaxDisplaySettings) get("sales_fixed_product_tax_display_setting");
    }

    public StoreConfig setSalesFixedProductTaxDisplaySetting(FixedProductTaxDisplaySettings arg) {
        optimisticData.put(getKey("sales_fixed_product_tax_display_setting"), arg);
        return this;
    }

    /**
     * Indicates if gift wrapping prices are displayed on the Orders page. Possible values: 1 (Yes) and 0
     * (No).
     */
    public String getSalesGiftWrapping() {
        return (String) get("sales_gift_wrapping");
    }

    public StoreConfig setSalesGiftWrapping(String arg) {
        optimisticData.put(getKey("sales_gift_wrapping"), arg);
        return this;
    }

    /**
     * Indicates if printed card prices are displayed on the Orders page. Possible values: 1 (Yes) and 0
     * (No).
     */
    public String getSalesPrintedCard() {
        return (String) get("sales_printed_card");
    }

    public StoreConfig setSalesPrintedCard(String arg) {
        optimisticData.put(getKey("sales_printed_card"), arg);
        return this;
    }

    /**
     * A secure fully-qualified URL that is used to create relative links to the `base_url`.
     */
    public String getSecureBaseLinkUrl() {
        return (String) get("secure_base_link_url");
    }

    public StoreConfig setSecureBaseLinkUrl(String arg) {
        optimisticData.put(getKey("secure_base_link_url"), arg);
        return this;
    }

    /**
     * The secure fully-qualified URL that specifies the location of media files.
     */
    public String getSecureBaseMediaUrl() {
        return (String) get("secure_base_media_url");
    }

    public StoreConfig setSecureBaseMediaUrl(String arg) {
        optimisticData.put(getKey("secure_base_media_url"), arg);
        return this;
    }

    /**
     * The secure fully-qualified URL that specifies the location of static view files.
     */
    public String getSecureBaseStaticUrl() {
        return (String) get("secure_base_static_url");
    }

    public StoreConfig setSecureBaseStaticUrl(String arg) {
        optimisticData.put(getKey("secure_base_static_url"), arg);
        return this;
    }

    /**
     * The store’s fully-qualified secure base URL.
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
     * Indicates whether a breadcrumb trail appears on all CMS pages in the catalog. 0 (No) or 1 (Yes).
     */
    public Integer getShowCmsBreadcrumbs() {
        return (Integer) get("show_cms_breadcrumbs");
    }

    public StoreConfig setShowCmsBreadcrumbs(Integer arg) {
        optimisticData.put(getKey("show_cms_breadcrumbs"), arg);
        return this;
    }

    /**
     * The unique ID of the store view. In the Admin, this is called the Store View Code. When making a
     * GraphQL call, assign this value to the `Store` header to provide the scope.
     */
    public ID getStoreCode() {
        return (ID) get("store_code");
    }

    public StoreConfig setStoreCode(ID arg) {
        optimisticData.put(getKey("store_code"), arg);
        return this;
    }

    /**
     * The unique ID assigned to the store group. In the Admin, this is called the Store Name.
     */
    public ID getStoreGroupCode() {
        return (ID) get("store_group_code");
    }

    public StoreConfig setStoreGroupCode(ID arg) {
        optimisticData.put(getKey("store_group_code"), arg);
        return this;
    }

    /**
     * The label assigned to the store group.
     */
    public String getStoreGroupName() {
        return (String) get("store_group_name");
    }

    public StoreConfig setStoreGroupName(String arg) {
        optimisticData.put(getKey("store_group_name"), arg);
        return this;
    }

    /**
     * The label assigned to the store view.
     */
    public String getStoreName() {
        return (String) get("store_name");
    }

    public StoreConfig setStoreName(String arg) {
        optimisticData.put(getKey("store_name"), arg);
        return this;
    }

    /**
     * The store view sort order.
     */
    public Integer getStoreSortOrder() {
        return (Integer) get("store_sort_order");
    }

    public StoreConfig setStoreSortOrder(Integer arg) {
        optimisticData.put(getKey("store_sort_order"), arg);
        return this;
    }

    /**
     * The time zone of the store.
     */
    public String getTimezone() {
        return (String) get("timezone");
    }

    public StoreConfig setTimezone(String arg) {
        optimisticData.put(getKey("timezone"), arg);
        return this;
    }

    /**
     * A prefix that appears before the title to create a two- or three-part title.
     */
    public String getTitlePrefix() {
        return (String) get("title_prefix");
    }

    public StoreConfig setTitlePrefix(String arg) {
        optimisticData.put(getKey("title_prefix"), arg);
        return this;
    }

    /**
     * The character that separates the category name and subcategory in the browser title bar.
     */
    public String getTitleSeparator() {
        return (String) get("title_separator");
    }

    public StoreConfig setTitleSeparator(String arg) {
        optimisticData.put(getKey("title_separator"), arg);
        return this;
    }

    /**
     * A suffix that appears after the title to create a two- or three-part title.
     */
    public String getTitleSuffix() {
        return (String) get("title_suffix");
    }

    public StoreConfig setTitleSuffix(String arg) {
        optimisticData.put(getKey("title_suffix"), arg);
        return this;
    }

    /**
     * Indicates whether the store code should be used in the URL.
     */
    public Boolean getUseStoreInUrl() {
        return (Boolean) get("use_store_in_url");
    }

    public StoreConfig setUseStoreInUrl(Boolean arg) {
        optimisticData.put(getKey("use_store_in_url"), arg);
        return this;
    }

    /**
     * The unique ID for the website.
     */
    public ID getWebsiteCode() {
        return (ID) get("website_code");
    }

    public StoreConfig setWebsiteCode(ID arg) {
        optimisticData.put(getKey("website_code"), arg);
        return this;
    }

    /**
     * The ID number assigned to the website store.
     *
     * @deprecated The field should not be used on the storefront.
     */
    @Deprecated
    public Integer getWebsiteId() {
        return (Integer) get("website_id");
    }

    public StoreConfig setWebsiteId(Integer arg) {
        optimisticData.put(getKey("website_id"), arg);
        return this;
    }

    /**
     * The label assigned to the website.
     */
    public String getWebsiteName() {
        return (String) get("website_name");
    }

    public StoreConfig setWebsiteName(String arg) {
        optimisticData.put(getKey("website_name"), arg);
        return this;
    }

    /**
     * The unit of weight.
     */
    public String getWeightUnit() {
        return (String) get("weight_unit");
    }

    public StoreConfig setWeightUnit(String arg) {
        optimisticData.put(getKey("weight_unit"), arg);
        return this;
    }

    /**
     * Text that appears in the header of the page and includes the name of the logged in customer.
     */
    public String getWelcome() {
        return (String) get("welcome");
    }

    public StoreConfig setWelcome(String arg) {
        optimisticData.put(getKey("welcome"), arg);
        return this;
    }

    /**
     * Indicates whether only specific countries can use this payment method.
     */
    public Boolean getZeroSubtotalEnableForSpecificCountries() {
        return (Boolean) get("zero_subtotal_enable_for_specific_countries");
    }

    public StoreConfig setZeroSubtotalEnableForSpecificCountries(Boolean arg) {
        optimisticData.put(getKey("zero_subtotal_enable_for_specific_countries"), arg);
        return this;
    }

    /**
     * Indicates whether the Zero Subtotal payment method is enabled.
     */
    public Boolean getZeroSubtotalEnabled() {
        return (Boolean) get("zero_subtotal_enabled");
    }

    public StoreConfig setZeroSubtotalEnabled(Boolean arg) {
        optimisticData.put(getKey("zero_subtotal_enabled"), arg);
        return this;
    }

    /**
     * The status of new orders placed using the Zero Subtotal payment method.
     */
    public String getZeroSubtotalNewOrderStatus() {
        return (String) get("zero_subtotal_new_order_status");
    }

    public StoreConfig setZeroSubtotalNewOrderStatus(String arg) {
        optimisticData.put(getKey("zero_subtotal_new_order_status"), arg);
        return this;
    }

    /**
     * When the new order status is &#39;Processing&#39;, this can be set to `authorize_capture` to automatically
     * invoice all items that have a zero balance.
     */
    public String getZeroSubtotalPaymentAction() {
        return (String) get("zero_subtotal_payment_action");
    }

    public StoreConfig setZeroSubtotalPaymentAction(String arg) {
        optimisticData.put(getKey("zero_subtotal_payment_action"), arg);
        return this;
    }

    /**
     * A comma-separated list of specific countries allowed to use the Zero Subtotal payment method.
     */
    public String getZeroSubtotalPaymentFromSpecificCountries() {
        return (String) get("zero_subtotal_payment_from_specific_countries");
    }

    public StoreConfig setZeroSubtotalPaymentFromSpecificCountries(String arg) {
        optimisticData.put(getKey("zero_subtotal_payment_from_specific_countries"), arg);
        return this;
    }

    /**
     * A number indicating the position of the Zero Subtotal payment method in the list of available
     * payment methods during checkout.
     */
    public Integer getZeroSubtotalSortOrder() {
        return (Integer) get("zero_subtotal_sort_order");
    }

    public StoreConfig setZeroSubtotalSortOrder(Integer arg) {
        optimisticData.put(getKey("zero_subtotal_sort_order"), arg);
        return this;
    }

    /**
     * The title of the Zero Subtotal payment method displayed on the storefront.
     */
    public String getZeroSubtotalTitle() {
        return (String) get("zero_subtotal_title");
    }

    public StoreConfig setZeroSubtotalTitle(String arg) {
        optimisticData.put(getKey("zero_subtotal_title"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "absolute_footer":
                return false;

            case "allow_gift_receipt":
                return false;

            case "allow_gift_wrapping_on_order":
                return false;

            case "allow_gift_wrapping_on_order_items":
                return false;

            case "allow_guests_to_write_product_reviews":
                return false;

            case "allow_items":
                return false;

            case "allow_order":
                return false;

            case "allow_printed_card":
                return false;

            case "autocomplete_on_storefront":
                return false;

            case "base_currency_code":
                return false;

            case "base_link_url":
                return false;

            case "base_media_url":
                return false;

            case "base_static_url":
                return false;

            case "base_url":
                return false;

            case "braintree_cc_vault_active":
                return false;

            case "cart_gift_wrapping":
                return false;

            case "cart_printed_card":
                return false;

            case "catalog_default_sort_by":
                return false;

            case "category_fixed_product_tax_display_setting":
                return false;

            case "category_url_suffix":
                return false;

            case "check_money_order_enable_for_specific_countries":
                return false;

            case "check_money_order_enabled":
                return false;

            case "check_money_order_make_check_payable_to":
                return false;

            case "check_money_order_max_order_total":
                return false;

            case "check_money_order_min_order_total":
                return false;

            case "check_money_order_new_order_status":
                return false;

            case "check_money_order_payment_from_specific_countries":
                return false;

            case "check_money_order_send_check_to":
                return false;

            case "check_money_order_sort_order":
                return false;

            case "check_money_order_title":
                return false;

            case "cms_home_page":
                return false;

            case "cms_no_cookies":
                return false;

            case "cms_no_route":
                return false;

            case "code":
                return false;

            case "configurable_thumbnail_source":
                return false;

            case "copyright":
                return false;

            case "default_description":
                return false;

            case "default_display_currency_code":
                return false;

            case "default_keywords":
                return false;

            case "default_title":
                return false;

            case "demonotice":
                return false;

            case "enable_multiple_wishlists":
                return false;

            case "front":
                return false;

            case "grid_per_page":
                return false;

            case "grid_per_page_values":
                return false;

            case "head_includes":
                return false;

            case "head_shortcut_icon":
                return false;

            case "header_logo_src":
                return false;

            case "id":
                return false;

            case "is_default_store":
                return false;

            case "is_default_store_group":
                return false;

            case "is_negotiable_quote_active":
                return false;

            case "is_requisition_list_active":
                return false;

            case "list_mode":
                return false;

            case "list_per_page":
                return false;

            case "list_per_page_values":
                return false;

            case "locale":
                return false;

            case "logo_alt":
                return false;

            case "logo_height":
                return false;

            case "logo_width":
                return false;

            case "magento_reward_general_is_enabled":
                return false;

            case "magento_reward_general_is_enabled_on_front":
                return false;

            case "magento_reward_general_min_points_balance":
                return false;

            case "magento_reward_general_publish_history":
                return false;

            case "magento_reward_points_invitation_customer":
                return false;

            case "magento_reward_points_invitation_customer_limit":
                return false;

            case "magento_reward_points_invitation_order":
                return false;

            case "magento_reward_points_invitation_order_limit":
                return false;

            case "magento_reward_points_newsletter":
                return false;

            case "magento_reward_points_order":
                return false;

            case "magento_reward_points_register":
                return false;

            case "magento_reward_points_review":
                return false;

            case "magento_reward_points_review_limit":
                return false;

            case "magento_wishlist_general_is_enabled":
                return false;

            case "maximum_number_of_wishlists":
                return false;

            case "minimum_password_length":
                return false;

            case "no_route":
                return false;

            case "payment_payflowpro_cc_vault_active":
                return false;

            case "printed_card_price":
                return false;

            case "product_fixed_product_tax_display_setting":
                return false;

            case "product_reviews_enabled":
                return false;

            case "product_url_suffix":
                return false;

            case "required_character_classes_number":
                return false;

            case "returns_enabled":
                return false;

            case "root_category_id":
                return false;

            case "root_category_uid":
                return false;

            case "sales_fixed_product_tax_display_setting":
                return false;

            case "sales_gift_wrapping":
                return false;

            case "sales_printed_card":
                return false;

            case "secure_base_link_url":
                return false;

            case "secure_base_media_url":
                return false;

            case "secure_base_static_url":
                return false;

            case "secure_base_url":
                return false;

            case "send_friend":
                return true;

            case "show_cms_breadcrumbs":
                return false;

            case "store_code":
                return false;

            case "store_group_code":
                return false;

            case "store_group_name":
                return false;

            case "store_name":
                return false;

            case "store_sort_order":
                return false;

            case "timezone":
                return false;

            case "title_prefix":
                return false;

            case "title_separator":
                return false;

            case "title_suffix":
                return false;

            case "use_store_in_url":
                return false;

            case "website_code":
                return false;

            case "website_id":
                return false;

            case "website_name":
                return false;

            case "weight_unit":
                return false;

            case "welcome":
                return false;

            case "zero_subtotal_enable_for_specific_countries":
                return false;

            case "zero_subtotal_enabled":
                return false;

            case "zero_subtotal_new_order_status":
                return false;

            case "zero_subtotal_payment_action":
                return false;

            case "zero_subtotal_payment_from_specific_countries":
                return false;

            case "zero_subtotal_sort_order":
                return false;

            case "zero_subtotal_title":
                return false;

            default:
                return false;
        }
    }
}

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

import java.util.Map;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
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

                case "code": {
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

                case "id": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
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

                case "timezone": {
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

                case "__typename": {
                    responseData.put(key, jsonAsString(field.getValue(), key));
                    break;
                }
                default: {
                    throw new SchemaViolationError(this, key, field.getValue());
                }
            }
        }
    }

    public String getGraphQlTypeName() {
        return "StoreConfig";
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

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "base_currency_code": return false;

            case "base_link_url": return false;

            case "base_media_url": return false;

            case "base_static_url": return false;

            case "base_url": return false;

            case "code": return false;

            case "default_display_currency_code": return false;

            case "id": return false;

            case "locale": return false;

            case "secure_base_link_url": return false;

            case "secure_base_media_url": return false;

            case "secure_base_static_url": return false;

            case "secure_base_url": return false;

            case "timezone": return false;

            case "website_id": return false;

            case "weight_unit": return false;

            default: return false;
        }
    }
}


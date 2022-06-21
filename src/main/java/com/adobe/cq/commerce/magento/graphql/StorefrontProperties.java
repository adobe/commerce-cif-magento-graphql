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
import com.shopify.graphql.support.SchemaViolationError;

/**
 * Indicates where an attribute can be displayed.
 */
public class StorefrontProperties extends AbstractResponse<StorefrontProperties> {
    public StorefrontProperties() {}

    public StorefrontProperties(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "position": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "use_in_layered_navigation": {
                    UseInLayeredNavigationOptions optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = UseInLayeredNavigationOptions.fromGraphQl(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "use_in_product_listing": {
                    Boolean optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsBoolean(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "use_in_search_results_layered_navigation": {
                    Boolean optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsBoolean(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "visible_on_catalog_pages": {
                    Boolean optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsBoolean(field.getValue(), key);
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
        return "StorefrontProperties";
    }

    /**
     * The relative position of the attribute in the layered navigation block.
     */
    public Integer getPosition() {
        return (Integer) get("position");
    }

    public StorefrontProperties setPosition(Integer arg) {
        optimisticData.put(getKey("position"), arg);
        return this;
    }

    /**
     * Indicates whether the attribute is filterable with results, without results, or not at all.
     */
    public UseInLayeredNavigationOptions getUseInLayeredNavigation() {
        return (UseInLayeredNavigationOptions) get("use_in_layered_navigation");
    }

    public StorefrontProperties setUseInLayeredNavigation(UseInLayeredNavigationOptions arg) {
        optimisticData.put(getKey("use_in_layered_navigation"), arg);
        return this;
    }

    /**
     * Indicates whether the attribute is displayed in product listings.
     */
    public Boolean getUseInProductListing() {
        return (Boolean) get("use_in_product_listing");
    }

    public StorefrontProperties setUseInProductListing(Boolean arg) {
        optimisticData.put(getKey("use_in_product_listing"), arg);
        return this;
    }

    /**
     * Indicates whether the attribute can be used in layered navigation on search results pages.
     */
    public Boolean getUseInSearchResultsLayeredNavigation() {
        return (Boolean) get("use_in_search_results_layered_navigation");
    }

    public StorefrontProperties setUseInSearchResultsLayeredNavigation(Boolean arg) {
        optimisticData.put(getKey("use_in_search_results_layered_navigation"), arg);
        return this;
    }

    /**
     * Indicates whether the attribute is displayed on product pages.
     */
    public Boolean getVisibleOnCatalogPages() {
        return (Boolean) get("visible_on_catalog_pages");
    }

    public StorefrontProperties setVisibleOnCatalogPages(Boolean arg) {
        optimisticData.put(getKey("visible_on_catalog_pages"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "position":
                return false;

            case "use_in_layered_navigation":
                return false;

            case "use_in_product_listing":
                return false;

            case "use_in_search_results_layered_navigation":
                return false;

            case "visible_on_catalog_pages":
                return false;

            default:
                return false;
        }
    }
}

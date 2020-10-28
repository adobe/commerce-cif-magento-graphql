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
 * Website is deprecated because it is should not be used on storefront. The type contains information
 * about a website
 */
public class Website extends AbstractResponse<Website> {
    public Website() {
    }

    public Website(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "code": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "default_group_id": {
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

                case "is_default": {
                    Boolean optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsBoolean(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "name": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "sort_order": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
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
        return "Website";
    }

    /**
     * A code assigned to the website to identify it
     *
     * @deprecated The field should not be used on the storefront.
     */
    @Deprecated
    public String getCode() {
        return (String) get("code");
    }

    public Website setCode(String arg) {
        optimisticData.put(getKey("code"), arg);
        return this;
    }

    /**
     * The default group ID that the website has
     *
     * @deprecated The field should not be used on the storefront.
     */
    @Deprecated
    public String getDefaultGroupId() {
        return (String) get("default_group_id");
    }

    public Website setDefaultGroupId(String arg) {
        optimisticData.put(getKey("default_group_id"), arg);
        return this;
    }

    /**
     * The ID number assigned to the website
     *
     * @deprecated The field should not be used on the storefront.
     */
    @Deprecated
    public Integer getId() {
        return (Integer) get("id");
    }

    public Website setId(Integer arg) {
        optimisticData.put(getKey("id"), arg);
        return this;
    }

    /**
     * Specifies if this is the default website
     *
     * @deprecated The field should not be used on the storefront.
     */
    @Deprecated
    public Boolean getIsDefault() {
        return (Boolean) get("is_default");
    }

    public Website setIsDefault(Boolean arg) {
        optimisticData.put(getKey("is_default"), arg);
        return this;
    }

    /**
     * The website name. Websites use this name to identify it easier.
     *
     * @deprecated The field should not be used on the storefront.
     */
    @Deprecated
    public String getName() {
        return (String) get("name");
    }

    public Website setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    /**
     * The attribute to use for sorting websites
     *
     * @deprecated The field should not be used on the storefront.
     */
    @Deprecated
    public Integer getSortOrder() {
        return (Integer) get("sort_order");
    }

    public Website setSortOrder(Integer arg) {
        optimisticData.put(getKey("sort_order"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "code": return false;

            case "default_group_id": return false;

            case "id": return false;

            case "is_default": return false;

            case "name": return false;

            case "sort_order": return false;

            default: return false;
        }
    }
}

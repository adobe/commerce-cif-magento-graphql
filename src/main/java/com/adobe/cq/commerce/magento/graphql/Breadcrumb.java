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
 * Breadcrumb item.
 */
public class Breadcrumb extends AbstractResponse<Breadcrumb> {
    public Breadcrumb() {}

    public Breadcrumb(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "category_id": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "category_level": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "category_name": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "category_uid": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "category_url_key": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "category_url_path": {
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
        return "Breadcrumb";
    }

    /**
     * Category ID.
     *
     * @deprecated Use the `category_uid` argument instead.
     */
    @Deprecated
    public Integer getCategoryId() {
        return (Integer) get("category_id");
    }

    public Breadcrumb setCategoryId(Integer arg) {
        optimisticData.put(getKey("category_id"), arg);
        return this;
    }

    /**
     * Category level.
     */
    public Integer getCategoryLevel() {
        return (Integer) get("category_level");
    }

    public Breadcrumb setCategoryLevel(Integer arg) {
        optimisticData.put(getKey("category_level"), arg);
        return this;
    }

    /**
     * Category name.
     */
    public String getCategoryName() {
        return (String) get("category_name");
    }

    public Breadcrumb setCategoryName(String arg) {
        optimisticData.put(getKey("category_name"), arg);
        return this;
    }

    /**
     * The unique ID for a `Breadcrumb` object.
     */
    public ID getCategoryUid() {
        return (ID) get("category_uid");
    }

    public Breadcrumb setCategoryUid(ID arg) {
        optimisticData.put(getKey("category_uid"), arg);
        return this;
    }

    /**
     * Category URL key.
     */
    public String getCategoryUrlKey() {
        return (String) get("category_url_key");
    }

    public Breadcrumb setCategoryUrlKey(String arg) {
        optimisticData.put(getKey("category_url_key"), arg);
        return this;
    }

    /**
     * Category URL path.
     */
    public String getCategoryUrlPath() {
        return (String) get("category_url_path");
    }

    public Breadcrumb setCategoryUrlPath(String arg) {
        optimisticData.put(getKey("category_url_path"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "category_id":
                return false;

            case "category_level":
                return false;

            case "category_name":
                return false;

            case "category_uid":
                return false;

            case "category_url_key":
                return false;

            case "category_url_path":
                return false;

            default:
                return false;
        }
    }
}

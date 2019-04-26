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

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;

/**
* CategoryInterface contains the full set of attributes that can be returned in a category search
*/
public class UnknownCategoryInterface extends AbstractResponse<UnknownCategoryInterface> implements CategoryInterface {
    public UnknownCategoryInterface() {
    }

    public UnknownCategoryInterface(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "available_sort_by": {
                    List<String> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<String> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            String optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = jsonAsString(element1, key);
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "breadcrumbs": {
                    List<Breadcrumb> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<Breadcrumb> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            Breadcrumb optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new Breadcrumb(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "children_count": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "created_at": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "default_sort_by": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "description": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "display_mode": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "filter_price_range": {
                    Double optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsDouble(field.getValue(), key);
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

                case "image": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "include_in_menu": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "is_anchor": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "landing_page": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "level": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "meta_description": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "meta_keywords": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "meta_title": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
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

                case "path": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "path_in_store": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "position": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "product_count": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "products": {
                    CategoryProducts optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CategoryProducts(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "updated_at": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "url_key": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "url_path": {
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

    public static CategoryInterface create(JsonObject fields) throws SchemaViolationError {
        String typeName = fields.getAsJsonPrimitive("__typename").getAsString();
        switch (typeName) {
            case "CategoryTree": {
                return new CategoryTree(fields);
            }

            default: {
                return new UnknownCategoryInterface(fields);
            }
        }
    }

    public String getGraphQlTypeName() {
        return (String) get("__typename");
    }

    public List<String> getAvailableSortBy() {
        return (List<String>) get("available_sort_by");
    }

    public UnknownCategoryInterface setAvailableSortBy(List<String> arg) {
        optimisticData.put(getKey("available_sort_by"), arg);
        return this;
    }

    /**
    * Breadcrumbs, parent categories info
    */

    public List<Breadcrumb> getBreadcrumbs() {
        return (List<Breadcrumb>) get("breadcrumbs");
    }

    public UnknownCategoryInterface setBreadcrumbs(List<Breadcrumb> arg) {
        optimisticData.put(getKey("breadcrumbs"), arg);
        return this;
    }

    public String getChildrenCount() {
        return (String) get("children_count");
    }

    public UnknownCategoryInterface setChildrenCount(String arg) {
        optimisticData.put(getKey("children_count"), arg);
        return this;
    }

    /**
    * Timestamp indicating when the category was created
    */

    public String getCreatedAt() {
        return (String) get("created_at");
    }

    public UnknownCategoryInterface setCreatedAt(String arg) {
        optimisticData.put(getKey("created_at"), arg);
        return this;
    }

    /**
    * The attribute to use for sorting
    */

    public String getDefaultSortBy() {
        return (String) get("default_sort_by");
    }

    public UnknownCategoryInterface setDefaultSortBy(String arg) {
        optimisticData.put(getKey("default_sort_by"), arg);
        return this;
    }

    /**
    * An optional description of the category
    */

    public String getDescription() {
        return (String) get("description");
    }

    public UnknownCategoryInterface setDescription(String arg) {
        optimisticData.put(getKey("description"), arg);
        return this;
    }

    public String getDisplayMode() {
        return (String) get("display_mode");
    }

    public UnknownCategoryInterface setDisplayMode(String arg) {
        optimisticData.put(getKey("display_mode"), arg);
        return this;
    }

    public Double getFilterPriceRange() {
        return (Double) get("filter_price_range");
    }

    public UnknownCategoryInterface setFilterPriceRange(Double arg) {
        optimisticData.put(getKey("filter_price_range"), arg);
        return this;
    }

    /**
    * An ID that uniquely identifies the category
    */

    public Integer getId() {
        return (Integer) get("id");
    }

    public UnknownCategoryInterface setId(Integer arg) {
        optimisticData.put(getKey("id"), arg);
        return this;
    }

    public String getImage() {
        return (String) get("image");
    }

    public UnknownCategoryInterface setImage(String arg) {
        optimisticData.put(getKey("image"), arg);
        return this;
    }

    public Integer getIncludeInMenu() {
        return (Integer) get("include_in_menu");
    }

    public UnknownCategoryInterface setIncludeInMenu(Integer arg) {
        optimisticData.put(getKey("include_in_menu"), arg);
        return this;
    }

    public Integer getIsAnchor() {
        return (Integer) get("is_anchor");
    }

    public UnknownCategoryInterface setIsAnchor(Integer arg) {
        optimisticData.put(getKey("is_anchor"), arg);
        return this;
    }

    public Integer getLandingPage() {
        return (Integer) get("landing_page");
    }

    public UnknownCategoryInterface setLandingPage(Integer arg) {
        optimisticData.put(getKey("landing_page"), arg);
        return this;
    }

    /**
    * Indicates the depth of the category within the tree
    */

    public Integer getLevel() {
        return (Integer) get("level");
    }

    public UnknownCategoryInterface setLevel(Integer arg) {
        optimisticData.put(getKey("level"), arg);
        return this;
    }

    public String getMetaDescription() {
        return (String) get("meta_description");
    }

    public UnknownCategoryInterface setMetaDescription(String arg) {
        optimisticData.put(getKey("meta_description"), arg);
        return this;
    }

    public String getMetaKeywords() {
        return (String) get("meta_keywords");
    }

    public UnknownCategoryInterface setMetaKeywords(String arg) {
        optimisticData.put(getKey("meta_keywords"), arg);
        return this;
    }

    public String getMetaTitle() {
        return (String) get("meta_title");
    }

    public UnknownCategoryInterface setMetaTitle(String arg) {
        optimisticData.put(getKey("meta_title"), arg);
        return this;
    }

    /**
    * The display name of the category
    */

    public String getName() {
        return (String) get("name");
    }

    public UnknownCategoryInterface setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    /**
    * Category Path
    */

    public String getPath() {
        return (String) get("path");
    }

    public UnknownCategoryInterface setPath(String arg) {
        optimisticData.put(getKey("path"), arg);
        return this;
    }

    /**
    * Category path in store
    */

    public String getPathInStore() {
        return (String) get("path_in_store");
    }

    public UnknownCategoryInterface setPathInStore(String arg) {
        optimisticData.put(getKey("path_in_store"), arg);
        return this;
    }

    /**
    * The position of the category relative to other categories at the same level in tree
    */

    public Integer getPosition() {
        return (Integer) get("position");
    }

    public UnknownCategoryInterface setPosition(Integer arg) {
        optimisticData.put(getKey("position"), arg);
        return this;
    }

    /**
    * The number of products in the category
    */

    public Integer getProductCount() {
        return (Integer) get("product_count");
    }

    public UnknownCategoryInterface setProductCount(Integer arg) {
        optimisticData.put(getKey("product_count"), arg);
        return this;
    }

    /**
    * The list of products assigned to the category
    */

    public CategoryProducts getProducts() {
        return (CategoryProducts) get("products");
    }

    public UnknownCategoryInterface setProducts(CategoryProducts arg) {
        optimisticData.put(getKey("products"), arg);
        return this;
    }

    /**
    * Timestamp indicating when the category was updated
    */

    public String getUpdatedAt() {
        return (String) get("updated_at");
    }

    public UnknownCategoryInterface setUpdatedAt(String arg) {
        optimisticData.put(getKey("updated_at"), arg);
        return this;
    }

    /**
    * The url key assigned to the category
    */

    public String getUrlKey() {
        return (String) get("url_key");
    }

    public UnknownCategoryInterface setUrlKey(String arg) {
        optimisticData.put(getKey("url_key"), arg);
        return this;
    }

    /**
    * The url path assigned to the category
    */

    public String getUrlPath() {
        return (String) get("url_path");
    }

    public UnknownCategoryInterface setUrlPath(String arg) {
        optimisticData.put(getKey("url_path"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "available_sort_by": return false;

            case "breadcrumbs": return true;

            case "children_count": return false;

            case "created_at": return false;

            case "default_sort_by": return false;

            case "description": return false;

            case "display_mode": return false;

            case "filter_price_range": return false;

            case "id": return false;

            case "image": return false;

            case "include_in_menu": return false;

            case "is_anchor": return false;

            case "landing_page": return false;

            case "level": return false;

            case "meta_description": return false;

            case "meta_keywords": return false;

            case "meta_title": return false;

            case "name": return false;

            case "path": return false;

            case "path_in_store": return false;

            case "position": return false;

            case "product_count": return false;

            case "products": return true;

            case "updated_at": return false;

            case "url_key": return false;

            case "url_path": return false;

            default: return false;
        }
    }
}


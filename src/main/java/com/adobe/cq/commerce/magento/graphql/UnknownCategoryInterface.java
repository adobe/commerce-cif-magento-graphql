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

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;

/**
 * Contains the full set of attributes that can be returned in a category search.
 */
public class UnknownCategoryInterface extends AbstractResponse<UnknownCategoryInterface> implements CategoryInterface {
    public UnknownCategoryInterface() {}

    public UnknownCategoryInterface(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "automatic_sorting": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

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

                case "canonical_url": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
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

                case "cms_block": {
                    CmsBlock optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CmsBlock(jsonAsObject(field.getValue(), key));
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

                case "custom_layout_update_file": {
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

                case "staged": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "uid": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

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

                case "url_suffix": {
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

    public String getAutomaticSorting() {
        return (String) get("automatic_sorting");
    }

    public UnknownCategoryInterface setAutomaticSorting(String arg) {
        optimisticData.put(getKey("automatic_sorting"), arg);
        return this;
    }

    public List<String> getAvailableSortBy() {
        return (List<String>) get("available_sort_by");
    }

    public UnknownCategoryInterface setAvailableSortBy(List<String> arg) {
        optimisticData.put(getKey("available_sort_by"), arg);
        return this;
    }

    /**
     * An array of breadcrumb items.
     */
    public List<Breadcrumb> getBreadcrumbs() {
        return (List<Breadcrumb>) get("breadcrumbs");
    }

    public UnknownCategoryInterface setBreadcrumbs(List<Breadcrumb> arg) {
        optimisticData.put(getKey("breadcrumbs"), arg);
        return this;
    }

    /**
     * The relative canonical URL. This value is returned only if the system setting &#39;Use Canonical Link
     * Meta Tag For Categories&#39; is enabled.
     */
    public String getCanonicalUrl() {
        return (String) get("canonical_url");
    }

    public UnknownCategoryInterface setCanonicalUrl(String arg) {
        optimisticData.put(getKey("canonical_url"), arg);
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
     * Contains a category CMS block.
     */
    public CmsBlock getCmsBlock() {
        return (CmsBlock) get("cms_block");
    }

    public UnknownCategoryInterface setCmsBlock(CmsBlock arg) {
        optimisticData.put(getKey("cms_block"), arg);
        return this;
    }

    /**
     * The timestamp indicating when the category was created.
     *
     * @deprecated The field should not be used on the storefront.
     */
    @Deprecated
    public String getCreatedAt() {
        return (String) get("created_at");
    }

    public UnknownCategoryInterface setCreatedAt(String arg) {
        optimisticData.put(getKey("created_at"), arg);
        return this;
    }

    public String getCustomLayoutUpdateFile() {
        return (String) get("custom_layout_update_file");
    }

    public UnknownCategoryInterface setCustomLayoutUpdateFile(String arg) {
        optimisticData.put(getKey("custom_layout_update_file"), arg);
        return this;
    }

    /**
     * The attribute to use for sorting.
     */
    public String getDefaultSortBy() {
        return (String) get("default_sort_by");
    }

    public UnknownCategoryInterface setDefaultSortBy(String arg) {
        optimisticData.put(getKey("default_sort_by"), arg);
        return this;
    }

    /**
     * An optional description of the category.
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
     * An ID that uniquely identifies the category.
     *
     * @deprecated Use `uid` instead.
     */
    @Deprecated
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
     * The depth of the category within the tree.
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
     * The display name of the category.
     */
    public String getName() {
        return (String) get("name");
    }

    public UnknownCategoryInterface setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    /**
     * The full category path.
     */
    public String getPath() {
        return (String) get("path");
    }

    public UnknownCategoryInterface setPath(String arg) {
        optimisticData.put(getKey("path"), arg);
        return this;
    }

    /**
     * The category path within the store.
     */
    public String getPathInStore() {
        return (String) get("path_in_store");
    }

    public UnknownCategoryInterface setPathInStore(String arg) {
        optimisticData.put(getKey("path_in_store"), arg);
        return this;
    }

    /**
     * The position of the category relative to other categories at the same level in tree.
     */
    public Integer getPosition() {
        return (Integer) get("position");
    }

    public UnknownCategoryInterface setPosition(Integer arg) {
        optimisticData.put(getKey("position"), arg);
        return this;
    }

    /**
     * The number of products in the category that are marked as visible. By default, in complex products,
     * parent products are visible, but their child products are not.
     */
    public Integer getProductCount() {
        return (Integer) get("product_count");
    }

    public UnknownCategoryInterface setProductCount(Integer arg) {
        optimisticData.put(getKey("product_count"), arg);
        return this;
    }

    /**
     * The list of products assigned to the category.
     */
    public CategoryProducts getProducts() {
        return (CategoryProducts) get("products");
    }

    public UnknownCategoryInterface setProducts(CategoryProducts arg) {
        optimisticData.put(getKey("products"), arg);
        return this;
    }

    /**
     * Indicates whether the category is staged for a future campaign.
     */
    public Boolean getStaged() {
        return (Boolean) get("staged");
    }

    public UnknownCategoryInterface setStaged(Boolean arg) {
        optimisticData.put(getKey("staged"), arg);
        return this;
    }

    /**
     * The unique ID for a `CategoryInterface` object.
     */
    public ID getUid() {
        return (ID) get("uid");
    }

    public UnknownCategoryInterface setUid(ID arg) {
        optimisticData.put(getKey("uid"), arg);
        return this;
    }

    /**
     * The timestamp indicating when the category was updated.
     *
     * @deprecated The field should not be used on the storefront.
     */
    @Deprecated
    public String getUpdatedAt() {
        return (String) get("updated_at");
    }

    public UnknownCategoryInterface setUpdatedAt(String arg) {
        optimisticData.put(getKey("updated_at"), arg);
        return this;
    }

    /**
     * The URL key assigned to the category.
     */
    public String getUrlKey() {
        return (String) get("url_key");
    }

    public UnknownCategoryInterface setUrlKey(String arg) {
        optimisticData.put(getKey("url_key"), arg);
        return this;
    }

    /**
     * The URL path assigned to the category.
     */
    public String getUrlPath() {
        return (String) get("url_path");
    }

    public UnknownCategoryInterface setUrlPath(String arg) {
        optimisticData.put(getKey("url_path"), arg);
        return this;
    }

    /**
     * The part of the category URL that is appended after the url key
     */
    public String getUrlSuffix() {
        return (String) get("url_suffix");
    }

    public UnknownCategoryInterface setUrlSuffix(String arg) {
        optimisticData.put(getKey("url_suffix"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "automatic_sorting":
                return false;

            case "available_sort_by":
                return false;

            case "breadcrumbs":
                return true;

            case "canonical_url":
                return false;

            case "children_count":
                return false;

            case "cms_block":
                return true;

            case "created_at":
                return false;

            case "custom_layout_update_file":
                return false;

            case "default_sort_by":
                return false;

            case "description":
                return false;

            case "display_mode":
                return false;

            case "filter_price_range":
                return false;

            case "id":
                return false;

            case "image":
                return false;

            case "include_in_menu":
                return false;

            case "is_anchor":
                return false;

            case "landing_page":
                return false;

            case "level":
                return false;

            case "meta_description":
                return false;

            case "meta_keywords":
                return false;

            case "meta_title":
                return false;

            case "name":
                return false;

            case "path":
                return false;

            case "path_in_store":
                return false;

            case "position":
                return false;

            case "product_count":
                return false;

            case "products":
                return true;

            case "staged":
                return false;

            case "uid":
                return false;

            case "updated_at":
                return false;

            case "url_key":
                return false;

            case "url_path":
                return false;

            case "url_suffix":
                return false;

            default:
                return false;
        }
    }
}

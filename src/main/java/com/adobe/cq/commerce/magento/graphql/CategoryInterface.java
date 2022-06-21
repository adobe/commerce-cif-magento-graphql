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

import com.shopify.graphql.support.CustomFieldInterface;
import com.shopify.graphql.support.ID;

/**
 * Contains the full set of attributes that can be returned in a category search.
 */

public interface CategoryInterface extends CustomFieldInterface {
    String getGraphQlTypeName();

    String getAutomaticSorting();

    List<String> getAvailableSortBy();

    /**
     * An array of breadcrumb items.
     */
    List<Breadcrumb> getBreadcrumbs();

    /**
     * The relative canonical URL. This value is returned only if the system setting &#39;Use Canonical Link
     * Meta Tag For Categories&#39; is enabled.
     */
    String getCanonicalUrl();

    String getChildrenCount();

    /**
     * Contains a category CMS block.
     */
    CmsBlock getCmsBlock();

    /**
     * The timestamp indicating when the category was created.
     *
     * @deprecated The field should not be used on the storefront.
     */
    @Deprecated
    String getCreatedAt();

    String getCustomLayoutUpdateFile();

    /**
     * The attribute to use for sorting.
     */
    String getDefaultSortBy();

    /**
     * An optional description of the category.
     */
    String getDescription();

    String getDisplayMode();

    Double getFilterPriceRange();

    /**
     * An ID that uniquely identifies the category.
     *
     * @deprecated Use `uid` instead.
     */
    @Deprecated
    Integer getId();

    String getImage();

    Integer getIncludeInMenu();

    Integer getIsAnchor();

    Integer getLandingPage();

    /**
     * The depth of the category within the tree.
     */
    Integer getLevel();

    String getMetaDescription();

    String getMetaKeywords();

    String getMetaTitle();

    /**
     * The display name of the category.
     */
    String getName();

    /**
     * The full category path.
     */
    String getPath();

    /**
     * The category path within the store.
     */
    String getPathInStore();

    /**
     * The position of the category relative to other categories at the same level in tree.
     */
    Integer getPosition();

    /**
     * The number of products in the category that are marked as visible. By default, in complex products,
     * parent products are visible, but their child products are not.
     */
    Integer getProductCount();

    /**
     * The list of products assigned to the category.
     */
    CategoryProducts getProducts();

    /**
     * Indicates whether the category is staged for a future campaign.
     */
    Boolean getStaged();

    /**
     * The unique ID for a `CategoryInterface` object.
     */
    ID getUid();

    /**
     * The timestamp indicating when the category was updated.
     *
     * @deprecated The field should not be used on the storefront.
     */
    @Deprecated
    String getUpdatedAt();

    /**
     * The URL key assigned to the category.
     */
    String getUrlKey();

    /**
     * The URL path assigned to the category.
     */
    String getUrlPath();

    /**
     * The part of the category URL that is appended after the url key
     */
    String getUrlSuffix();
}

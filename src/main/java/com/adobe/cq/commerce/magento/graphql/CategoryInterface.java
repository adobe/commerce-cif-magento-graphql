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
 * CategoryInterface contains the full set of attributes that can be returned in a category search.
 */

public interface CategoryInterface extends CustomFieldInterface {
    String getGraphQlTypeName();

    String getAutomaticSorting();

    List<String> getAvailableSortBy();

    /**
     * Breadcrumbs, parent categories info.
     */
    List<Breadcrumb> getBreadcrumbs();

    /**
     * Relative canonical URL. This value is returned only if the system setting &#39;Use Canonical Link Meta
     * Tag For Categories&#39; is enabled
     */
    String getCanonicalUrl();

    String getChildrenCount();

    /**
     * Category CMS Block.
     */
    CmsBlock getCmsBlock();

    /**
     * Timestamp indicating when the category was created.
     */
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
     */
    Integer getId();

    String getImage();

    Integer getIncludeInMenu();

    Integer getIsAnchor();

    Integer getLandingPage();

    /**
     * Indicates the depth of the category within the tree.
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
     * Category Path.
     */
    String getPath();

    /**
     * Category path in store.
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
     * Timestamp indicating when the category was updated.
     */
    String getUpdatedAt();

    /**
     * The url key assigned to the category.
     */
    String getUrlKey();

    /**
     * The url path assigned to the category.
     */
    String getUrlPath();

    /**
     * The part of the category URL that is appended after the url key
     */
    String getUrlSuffix();
}

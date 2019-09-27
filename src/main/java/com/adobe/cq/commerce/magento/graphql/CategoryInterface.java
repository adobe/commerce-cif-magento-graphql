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

import java.util.List;

import com.shopify.graphql.support.CustomFieldInterface;

/**
 * CategoryInterface contains the full set of attributes that can be returned in a category search
 */

public interface CategoryInterface extends CustomFieldInterface {
    String getGraphQlTypeName();

    List<String> getAvailableSortBy();

    List<Breadcrumb> getBreadcrumbs();

    String getChildrenCount();

    String getCreatedAt();

    String getDefaultSortBy();

    String getDescription();

    String getDisplayMode();

    Double getFilterPriceRange();

    Integer getId();

    String getImage();

    Integer getIncludeInMenu();

    Integer getIsAnchor();

    Integer getLandingPage();

    Integer getLevel();

    String getMetaDescription();

    String getMetaKeywords();

    String getMetaTitle();

    String getName();

    String getPath();

    String getPathInStore();

    Integer getPosition();

    Integer getProductCount();

    CategoryProducts getProducts();

    String getUpdatedAt();

    String getUrlKey();

    String getUrlPath();
}


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

/**
* The ProductInterface contains attributes that are common to all types of products. Note that
* descriptions may not be available for custom and EAV attributes.
*/

public interface ProductInterface {
    String getGraphQlTypeName();

    Integer getAttributeSetId();

    String getCanonicalUrl();

    List<CategoryInterface> getCategories();

    Integer getColor();

    String getCountryOfManufacture();

    String getCreatedAt();

    String getDescription();

    String getGiftMessageAvailable();

    Integer getId();

    String getImage();

    String getImageLabel();

    Integer getManufacturer();

    List<MediaGalleryEntry> getMediaGalleryEntries();

    String getMetaDescription();

    String getMetaKeyword();

    String getMetaTitle();

    String getName();

    String getNewFromDate();

    String getNewToDate();

    Double getOnlyXLeftInStock();

    String getOptionsContainer();

    ProductPrices getPrice();

    List<ProductLinksInterface> getProductLinks();

    String getShortDescription();

    String getSku();

    String getSmallImage();

    String getSmallImageLabel();

    String getSpecialFromDate();

    Double getSpecialPrice();

    String getSpecialToDate();

    ProductStockStatus getStockStatus();

    String getSwatchImage();

    String getThumbnail();

    String getThumbnailLabel();

    Double getTierPrice();

    List<ProductTierPrices> getTierPrices();

    String getTypeId();

    String getUpdatedAt();

    String getUrlKey();

    String getUrlPath();

    List<Website> getWebsites();
}


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

import com.shopify.graphql.support.CustomFieldInterface;

/**
 * Contains basic information about a product image or video.
 */

public interface MediaGalleryInterface extends CustomFieldInterface {
    String getGraphQlTypeName();

    /**
     * Indicates whether the image is hidden from view.
     */
    Boolean getDisabled();

    /**
     * The label of the product image or video.
     */
    String getLabel();

    /**
     * The media item&#39;s position after it has been sorted.
     */
    Integer getPosition();

    /**
     * The URL of the product image or video.
     */
    String getUrl();
}

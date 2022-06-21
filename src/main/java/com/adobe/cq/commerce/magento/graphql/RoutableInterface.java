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
 * Routable entities serve as the model for a rendered page.
 */

public interface RoutableInterface extends CustomFieldInterface {
    String getGraphQlTypeName();

    /**
     * Contains 0 when there is no redirect error. A value of 301 indicates the URL of the requested
     * resource has been changed permanently, while a value of 302 indicates a temporary redirect.
     */
    Integer getRedirectCode();

    /**
     * The internal relative URL. If the specified URL is a redirect, the query returns the redirected URL,
     * not the original.
     */
    String getRelativeUrl();

    /**
     * One of PRODUCT, CATEGORY, or CMS_PAGE.
     */
    UrlRewriteEntityTypeEnum getType();
}

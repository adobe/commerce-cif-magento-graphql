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

/**
 * This enumeration defines the entity type.
 */
public enum UrlRewriteEntityTypeEnum {
    CATEGORY,

    CMS_PAGE,

    PRODUCT,

    UNKNOWN_VALUE;

    public static UrlRewriteEntityTypeEnum fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "CATEGORY": {
                return CATEGORY;
            }

            case "CMS_PAGE": {
                return CMS_PAGE;
            }

            case "PRODUCT": {
                return PRODUCT;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case CATEGORY: {
                return "CATEGORY";
            }

            case CMS_PAGE: {
                return "CMS_PAGE";
            }

            case PRODUCT: {
                return "PRODUCT";
            }

            default: {
                return "";
            }
        }
    }
}

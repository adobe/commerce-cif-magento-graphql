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
 * Indicates the selected Dynamic Blocks Rotator inline widget.
 */
public enum DynamicBlockTypeEnum {
    CART_PRICE_RULE_RELATED,

    CATALOG_PRICE_RULE_RELATED,

    SPECIFIED,

    UNKNOWN_VALUE;

    public static DynamicBlockTypeEnum fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "CART_PRICE_RULE_RELATED": {
                return CART_PRICE_RULE_RELATED;
            }

            case "CATALOG_PRICE_RULE_RELATED": {
                return CATALOG_PRICE_RULE_RELATED;
            }

            case "SPECIFIED": {
                return SPECIFIED;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }

    public String toString() {
        switch (this) {
            case CART_PRICE_RULE_RELATED: {
                return "CART_PRICE_RULE_RELATED";
            }

            case CATALOG_PRICE_RULE_RELATED: {
                return "CATALOG_PRICE_RULE_RELATED";
            }

            case SPECIFIED: {
                return "SPECIFIED";
            }

            default: {
                return "";
            }
        }
    }
}

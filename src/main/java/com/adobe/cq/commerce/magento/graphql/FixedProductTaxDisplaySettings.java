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
 * This enumeration display settings for the fixed product tax
 */
public enum FixedProductTaxDisplaySettings {
    /**
     * The displayed price does not include the FPT amount. The values of ProductPrice.fixed_product_taxes
     * and the price including the FPT are displayed separately. This value corresponds to &#39;Excluding FPT,
     * Including FPT description and final price&#39;
     */
    EXCLUDE_FPT_AND_INCLUDE_WITH_DETAILS,

    /**
     * The displayed price does not include the FPT amount. The values from
     * ProductPrice.fixed_product_taxes are not displayed. This value corresponds to &#39;Excluding FPT&#39;
     */
    EXCLUDE_FPT_WITHOUT_DETAILS,

    /**
     * The FPT feature is not enabled. You can omit  ProductPrice.fixed_product_taxes from your query
     */
    FPT_DISABLED,

    /**
     * The displayed price includes the FPT amount without displaying the ProductPrice.fixed_product_taxes
     * values. This value corresponds to &#39;Including FPT only&#39;
     */
    INCLUDE_FPT_WITHOUT_DETAILS,

    /**
     * The displayed price includes the FPT amount while displaying the values of
     * ProductPrice.fixed_product_taxes separately. This value corresponds to &#39;Including FPT and FPT
     * description&#39;
     */
    INCLUDE_FPT_WITH_DETAILS,

    UNKNOWN_VALUE;

    public static FixedProductTaxDisplaySettings fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "EXCLUDE_FPT_AND_INCLUDE_WITH_DETAILS": {
                return EXCLUDE_FPT_AND_INCLUDE_WITH_DETAILS;
            }

            case "EXCLUDE_FPT_WITHOUT_DETAILS": {
                return EXCLUDE_FPT_WITHOUT_DETAILS;
            }

            case "FPT_DISABLED": {
                return FPT_DISABLED;
            }

            case "INCLUDE_FPT_WITHOUT_DETAILS": {
                return INCLUDE_FPT_WITHOUT_DETAILS;
            }

            case "INCLUDE_FPT_WITH_DETAILS": {
                return INCLUDE_FPT_WITH_DETAILS;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case EXCLUDE_FPT_AND_INCLUDE_WITH_DETAILS: {
                return "EXCLUDE_FPT_AND_INCLUDE_WITH_DETAILS";
            }

            case EXCLUDE_FPT_WITHOUT_DETAILS: {
                return "EXCLUDE_FPT_WITHOUT_DETAILS";
            }

            case FPT_DISABLED: {
                return "FPT_DISABLED";
            }

            case INCLUDE_FPT_WITHOUT_DETAILS: {
                return "INCLUDE_FPT_WITHOUT_DETAILS";
            }

            case INCLUDE_FPT_WITH_DETAILS: {
                return "INCLUDE_FPT_WITH_DETAILS";
            }

            default: {
                return "";
            }
        }
    }
}


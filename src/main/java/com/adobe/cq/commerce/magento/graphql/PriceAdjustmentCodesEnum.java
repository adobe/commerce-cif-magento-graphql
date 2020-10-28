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
 * PriceAdjustment.code is deprecated. This enumeration contains values defined in modules other than
 * the Catalog module.
 */
public enum PriceAdjustmentCodesEnum {
    /**
     * @deprecated PriceAdjustmentCodesEnum is deprecated. Tax is included or excluded in price. Tax is not shown separtely in Catalog
     */
    @Deprecated
    TAX,

    /**
     * @deprecated WEEE code is deprecated, use fixed_product_taxes.label
     */
    @Deprecated
    WEEE,

    /**
     * @deprecated Use fixed_product_taxes. PriceAdjustmentCodesEnum is deprecated. Tax is included or excluded in price. Tax is not shown separtely in Catalog
     */
    @Deprecated
    WEEE_TAX,

    UNKNOWN_VALUE;

    public static PriceAdjustmentCodesEnum fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "TAX": {
                return TAX;
            }

            case "WEEE": {
                return WEEE;
            }

            case "WEEE_TAX": {
                return WEEE_TAX;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case TAX: {
                return "TAX";
            }

            case WEEE: {
                return "WEEE";
            }

            case WEEE_TAX: {
                return "WEEE_TAX";
            }

            default: {
                return "";
            }
        }
    }
}

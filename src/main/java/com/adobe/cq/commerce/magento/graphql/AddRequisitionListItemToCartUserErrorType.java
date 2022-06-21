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

public enum AddRequisitionListItemToCartUserErrorType {
    LOW_QUANTITY,

    OPTIONS_UPDATED,

    OUT_OF_STOCK,

    UNAVAILABLE_SKU,

    UNKNOWN_VALUE;

    public static AddRequisitionListItemToCartUserErrorType fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "LOW_QUANTITY": {
                return LOW_QUANTITY;
            }

            case "OPTIONS_UPDATED": {
                return OPTIONS_UPDATED;
            }

            case "OUT_OF_STOCK": {
                return OUT_OF_STOCK;
            }

            case "UNAVAILABLE_SKU": {
                return UNAVAILABLE_SKU;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }

    public String toString() {
        switch (this) {
            case LOW_QUANTITY: {
                return "LOW_QUANTITY";
            }

            case OPTIONS_UPDATED: {
                return "OPTIONS_UPDATED";
            }

            case OUT_OF_STOCK: {
                return "OUT_OF_STOCK";
            }

            case UNAVAILABLE_SKU: {
                return "UNAVAILABLE_SKU";
            }

            default: {
                return "";
            }
        }
    }
}

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

public enum CompanyCreditOperationType {
    ALLOCATION,

    PURCHASE,

    REFUND,

    REIMBURSEMENT,

    REVERT,

    UPDATE,

    UNKNOWN_VALUE;

    public static CompanyCreditOperationType fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "ALLOCATION": {
                return ALLOCATION;
            }

            case "PURCHASE": {
                return PURCHASE;
            }

            case "REFUND": {
                return REFUND;
            }

            case "REIMBURSEMENT": {
                return REIMBURSEMENT;
            }

            case "REVERT": {
                return REVERT;
            }

            case "UPDATE": {
                return UPDATE;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }

    public String toString() {
        switch (this) {
            case ALLOCATION: {
                return "ALLOCATION";
            }

            case PURCHASE: {
                return "PURCHASE";
            }

            case REFUND: {
                return "REFUND";
            }

            case REIMBURSEMENT: {
                return "REIMBURSEMENT";
            }

            case REVERT: {
                return "REVERT";
            }

            case UPDATE: {
                return "UPDATE";
            }

            default: {
                return "";
            }
        }
    }
}

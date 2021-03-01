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

public enum ReturnStatus {
    APPROVED,

    AUTHORIZED,

    CLOSED,

    DENIED,

    PARTIALLY_APPROVED,

    PARTIALLY_AUTHORIZED,

    PARTIALLY_RECEIVED,

    PARTIALLY_REJECTED,

    PENDING,

    PROCESSED_AND_CLOSED,

    RECEIVED,

    REJECTED,

    UNKNOWN_VALUE;

    public static ReturnStatus fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "APPROVED": {
                return APPROVED;
            }

            case "AUTHORIZED": {
                return AUTHORIZED;
            }

            case "CLOSED": {
                return CLOSED;
            }

            case "DENIED": {
                return DENIED;
            }

            case "PARTIALLY_APPROVED": {
                return PARTIALLY_APPROVED;
            }

            case "PARTIALLY_AUTHORIZED": {
                return PARTIALLY_AUTHORIZED;
            }

            case "PARTIALLY_RECEIVED": {
                return PARTIALLY_RECEIVED;
            }

            case "PARTIALLY_REJECTED": {
                return PARTIALLY_REJECTED;
            }

            case "PENDING": {
                return PENDING;
            }

            case "PROCESSED_AND_CLOSED": {
                return PROCESSED_AND_CLOSED;
            }

            case "RECEIVED": {
                return RECEIVED;
            }

            case "REJECTED": {
                return REJECTED;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }

    public String toString() {
        switch (this) {
            case APPROVED: {
                return "APPROVED";
            }

            case AUTHORIZED: {
                return "AUTHORIZED";
            }

            case CLOSED: {
                return "CLOSED";
            }

            case DENIED: {
                return "DENIED";
            }

            case PARTIALLY_APPROVED: {
                return "PARTIALLY_APPROVED";
            }

            case PARTIALLY_AUTHORIZED: {
                return "PARTIALLY_AUTHORIZED";
            }

            case PARTIALLY_RECEIVED: {
                return "PARTIALLY_RECEIVED";
            }

            case PARTIALLY_REJECTED: {
                return "PARTIALLY_REJECTED";
            }

            case PENDING: {
                return "PENDING";
            }

            case PROCESSED_AND_CLOSED: {
                return "PROCESSED_AND_CLOSED";
            }

            case RECEIVED: {
                return "RECEIVED";
            }

            case REJECTED: {
                return "REJECTED";
            }

            default: {
                return "";
            }
        }
    }
}

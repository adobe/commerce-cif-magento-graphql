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
 * An enum describing what kind of type a given `__Type` is.
 */
public enum __TypeKind {
    /**
     * Indicates this type is an enum. `enumValues` is a valid field.
     */
    ENUM,

    /**
     * Indicates this type is an input object. `inputFields` is a valid field.
     */
    INPUT_OBJECT,

    /**
     * Indicates this type is an interface. `fields` and `possibleTypes` are valid fields.
     */
    INTERFACE,

    /**
     * Indicates this type is a list. `ofType` is a valid field.
     */
    LIST,

    /**
     * Indicates this type is a non-null. `ofType` is a valid field.
     */
    NON_NULL,

    /**
     * Indicates this type is an object. `fields` and `interfaces` are valid fields.
     */
    OBJECT,

    /**
     * Indicates this type is a scalar.
     */
    SCALAR,

    /**
     * Indicates this type is a union. `possibleTypes` is a valid field.
     */
    UNION,

    UNKNOWN_VALUE;

    public static __TypeKind fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "ENUM": {
                return ENUM;
            }

            case "INPUT_OBJECT": {
                return INPUT_OBJECT;
            }

            case "INTERFACE": {
                return INTERFACE;
            }

            case "LIST": {
                return LIST;
            }

            case "NON_NULL": {
                return NON_NULL;
            }

            case "OBJECT": {
                return OBJECT;
            }

            case "SCALAR": {
                return SCALAR;
            }

            case "UNION": {
                return UNION;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }

    public String toString() {
        switch (this) {
            case ENUM: {
                return "ENUM";
            }

            case INPUT_OBJECT: {
                return "INPUT_OBJECT";
            }

            case INTERFACE: {
                return "INTERFACE";
            }

            case LIST: {
                return "LIST";
            }

            case NON_NULL: {
                return "NON_NULL";
            }

            case OBJECT: {
                return "OBJECT";
            }

            case SCALAR: {
                return "SCALAR";
            }

            case UNION: {
                return "UNION";
            }

            default: {
                return "";
            }
        }
    }
}

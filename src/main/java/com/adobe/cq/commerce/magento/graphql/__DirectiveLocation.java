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
 * A Directive can be adjacent to many parts of the GraphQL language, a __DirectiveLocation describes
 * one such possible adjacencies.
 */
public enum __DirectiveLocation {
    /**
     * Location adjacent to an argument definition.
     */
    ARGUMENT_DEFINITION,

    /**
     * Location adjacent to an enum definition.
     */
    ENUM,

    /**
     * Location adjacent to an enum value definition.
     */
    ENUM_VALUE,

    /**
     * Location adjacent to a field.
     */
    FIELD,

    /**
     * Location adjacent to a field definition.
     */
    FIELD_DEFINITION,

    /**
     * Location adjacent to a fragment definition.
     */
    FRAGMENT_DEFINITION,

    /**
     * Location adjacent to a fragment spread.
     */
    FRAGMENT_SPREAD,

    /**
     * Location adjacent to an inline fragment.
     */
    INLINE_FRAGMENT,

    /**
     * Location adjacent to an input object field definition.
     */
    INPUT_FIELD_DEFINITION,

    /**
     * Location adjacent to an input object type definition.
     */
    INPUT_OBJECT,

    /**
     * Location adjacent to an interface definition.
     */
    INTERFACE,

    /**
     * Location adjacent to a mutation operation.
     */
    MUTATION,

    /**
     * Location adjacent to an object type definition.
     */
    OBJECT,

    /**
     * Location adjacent to a query operation.
     */
    QUERY,

    /**
     * Location adjacent to a scalar definition.
     */
    SCALAR,

    /**
     * Location adjacent to a schema definition.
     */
    SCHEMA,

    /**
     * Location adjacent to a subscription operation.
     */
    SUBSCRIPTION,

    /**
     * Location adjacent to a union definition.
     */
    UNION,

    UNKNOWN_VALUE;

    public static __DirectiveLocation fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "ARGUMENT_DEFINITION": {
                return ARGUMENT_DEFINITION;
            }

            case "ENUM": {
                return ENUM;
            }

            case "ENUM_VALUE": {
                return ENUM_VALUE;
            }

            case "FIELD": {
                return FIELD;
            }

            case "FIELD_DEFINITION": {
                return FIELD_DEFINITION;
            }

            case "FRAGMENT_DEFINITION": {
                return FRAGMENT_DEFINITION;
            }

            case "FRAGMENT_SPREAD": {
                return FRAGMENT_SPREAD;
            }

            case "INLINE_FRAGMENT": {
                return INLINE_FRAGMENT;
            }

            case "INPUT_FIELD_DEFINITION": {
                return INPUT_FIELD_DEFINITION;
            }

            case "INPUT_OBJECT": {
                return INPUT_OBJECT;
            }

            case "INTERFACE": {
                return INTERFACE;
            }

            case "MUTATION": {
                return MUTATION;
            }

            case "OBJECT": {
                return OBJECT;
            }

            case "QUERY": {
                return QUERY;
            }

            case "SCALAR": {
                return SCALAR;
            }

            case "SCHEMA": {
                return SCHEMA;
            }

            case "SUBSCRIPTION": {
                return SUBSCRIPTION;
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
            case ARGUMENT_DEFINITION: {
                return "ARGUMENT_DEFINITION";
            }

            case ENUM: {
                return "ENUM";
            }

            case ENUM_VALUE: {
                return "ENUM_VALUE";
            }

            case FIELD: {
                return "FIELD";
            }

            case FIELD_DEFINITION: {
                return "FIELD_DEFINITION";
            }

            case FRAGMENT_DEFINITION: {
                return "FRAGMENT_DEFINITION";
            }

            case FRAGMENT_SPREAD: {
                return "FRAGMENT_SPREAD";
            }

            case INLINE_FRAGMENT: {
                return "INLINE_FRAGMENT";
            }

            case INPUT_FIELD_DEFINITION: {
                return "INPUT_FIELD_DEFINITION";
            }

            case INPUT_OBJECT: {
                return "INPUT_OBJECT";
            }

            case INTERFACE: {
                return "INTERFACE";
            }

            case MUTATION: {
                return "MUTATION";
            }

            case OBJECT: {
                return "OBJECT";
            }

            case QUERY: {
                return "QUERY";
            }

            case SCALAR: {
                return "SCALAR";
            }

            case SCHEMA: {
                return "SCHEMA";
            }

            case SUBSCRIPTION: {
                return "SUBSCRIPTION";
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

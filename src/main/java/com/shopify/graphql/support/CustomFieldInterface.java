/*******************************************************************************
 *
 *    Copyright 2019 Adobe. All rights reserved.
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

package com.shopify.graphql.support;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;

/**
 * In order to allow custom fields from being "gettable" via java interface classes, this class
 * defines all the getter methods for custom fields. Note that all these methods are already implemented in
 * {@link AbstractResponse} so they immediately available to all interfaces.
 */
public interface CustomFieldInterface {

    /**
     * Gets a field as a raw object.
     * 
     * @param field The name of the field.
     * @return The raw object.
     */
    public default Object get(String field) {
        return null;
    }

    /**
     * Tries to deserialise and return the given JSON field as a String. The field itself is expected
     * to be stored in the object data as a {@link JsonElement}, which is the case for custom simple fields.
     * 
     * @param field The name of the field.
     * @return The value of the field.
     */
    public default String getAsString(String field) throws SchemaViolationError {
        return null;
    }

    /**
     * Tries to deserialise and return the given JSON field as an Integer. The field itself is expected
     * to be stored in the object data as a {@link JsonElement}, which is the case for custom simple fields.
     * 
     * @param field The name of the field.
     * @return The value of the field.
     */
    public default Integer getAsInteger(String field) throws SchemaViolationError {
        return null;
    }

    /**
     * Tries to deserialise and return the given JSON field as a Double. The field itself is expected
     * to be stored in the object data as a {@link JsonElement}, which is the case for custom simple fields.
     * 
     * @param field The name of the field.
     * @return The value of the field.
     */
    public default Double getAsDouble(String field) throws SchemaViolationError {
        return null;
    }

    /**
     * Tries to deserialise and return the given JSON field as a Boolean. The field itself is expected
     * to be stored in the object data as a {@link JsonElement}, which is the case for custom simple fields.
     * 
     * @param field The name of the field.
     * @return The value of the field.
     */
    public default Boolean getAsBoolean(String field) throws SchemaViolationError {
        return null;
    }

    /**
     * Tries to deserialise and return the given JSON field as an Array. The field itself is expected
     * to be stored in the object data as a {@link JsonElement}, which is the case for custom simple fields.
     * 
     * @param field The name of the field.
     * @return The value of the field.
     */
    public default JsonArray getAsArray(String field) throws SchemaViolationError {
        return null;
    }
}

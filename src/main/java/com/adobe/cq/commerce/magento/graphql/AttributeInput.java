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

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import com.shopify.graphql.support.AbstractQuery;
import com.shopify.graphql.support.Input;

/**
 * Defines the attribute characteristics to search for the `attribute_code` and `entity_type` to
 * search.
 */
public class AttributeInput implements Serializable {
    private Input<String> attributeCode = Input.undefined();

    private Input<String> entityType = Input.undefined();

    private Map<String, Input<Serializable>> customFilters = new HashMap<>();

    /**
     * The unique identifier for an attribute code. This value should be in lowercase letters without
     * spaces.
     */
    public String getAttributeCode() {
        return attributeCode.getValue();
    }

    /**
     * The unique identifier for an attribute code. This value should be in lowercase letters without
     * spaces.
     */
    public Input<String> getAttributeCodeInput() {
        return attributeCode;
    }

    /**
     * The unique identifier for an attribute code. This value should be in lowercase letters without
     * spaces.
     */
    public AttributeInput setAttributeCode(String attributeCode) {
        this.attributeCode = Input.optional(attributeCode);
        return this;
    }

    /**
     * The unique identifier for an attribute code. This value should be in lowercase letters without
     * spaces.
     */
    public AttributeInput setAttributeCodeInput(Input<String> attributeCode) {
        if (attributeCode == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.attributeCode = attributeCode;
        return this;
    }

    /**
     * The type of entity that defines the attribute.
     */
    public String getEntityType() {
        return entityType.getValue();
    }

    /**
     * The type of entity that defines the attribute.
     */
    public Input<String> getEntityTypeInput() {
        return entityType;
    }

    /**
     * The type of entity that defines the attribute.
     */
    public AttributeInput setEntityType(String entityType) {
        this.entityType = Input.optional(entityType);
        return this;
    }

    /**
     * The type of entity that defines the attribute.
     */
    public AttributeInput setEntityTypeInput(Input<String> entityType) {
        if (entityType == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.entityType = entityType;
        return this;
    }

    /**
     * Set custom filter.
     */
    public AttributeInput setCustomFilter(String name, Serializable filterInput) {
        this.customFilters.put(name, Input.optional(filterInput));
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (!this.customFilters.isEmpty()) {
            for (Map.Entry<String, Input<Serializable>> entry : customFilters.entrySet()) {
                _queryBuilder.append(separator);
                separator = ",";
                _queryBuilder.append(entry.getKey() + ":");

                Serializable filter = entry.getValue().getValue();

                if (filter != null) {
                    try {
                        Method appendTo = filter.getClass().getMethod("appendTo", StringBuilder.class);
                        appendTo.invoke(filter, _queryBuilder);
                    } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
                        _queryBuilder.append("null");
                    }
                } else {
                    _queryBuilder.append("null");
                }
            }
        }

        if (this.attributeCode.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("attribute_code:");
            if (attributeCode.getValue() != null) {
                AbstractQuery.appendQuotedString(_queryBuilder, attributeCode.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.entityType.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("entity_type:");
            if (entityType.getValue() != null) {
                AbstractQuery.appendQuotedString(_queryBuilder, entityType.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}

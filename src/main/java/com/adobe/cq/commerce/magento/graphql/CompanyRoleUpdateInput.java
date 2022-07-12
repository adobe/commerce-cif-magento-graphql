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
import java.util.List;
import java.util.Map;

import com.shopify.graphql.support.AbstractQuery;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Input;

/**
 * Defines the input schema for updating a company role.
 */
public class CompanyRoleUpdateInput implements Serializable {
    private ID id;

    private Input<String> name = Input.undefined();

    private Input<List<String>> permissions = Input.undefined();

    private Map<String, Input<Serializable>> customFilters = new HashMap<>();

    public CompanyRoleUpdateInput(ID id) {
        this.id = id;
    }

    /**
     * The unique ID for a `CompanyRole` object.
     */
    public ID getId() {
        return id;
    }

    /**
     * The unique ID for a `CompanyRole` object.
     */
    public CompanyRoleUpdateInput setId(ID id) {
        this.id = id;
        return this;
    }

    /**
     * The name of the role to update.
     */
    public String getName() {
        return name.getValue();
    }

    /**
     * The name of the role to update.
     */
    public Input<String> getNameInput() {
        return name;
    }

    /**
     * The name of the role to update.
     */
    public CompanyRoleUpdateInput setName(String name) {
        this.name = Input.optional(name);
        return this;
    }

    /**
     * The name of the role to update.
     */
    public CompanyRoleUpdateInput setNameInput(Input<String> name) {
        if (name == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.name = name;
        return this;
    }

    /**
     * A list of resources the role can access.
     */
    public List<String> getPermissions() {
        return permissions.getValue();
    }

    /**
     * A list of resources the role can access.
     */
    public Input<List<String>> getPermissionsInput() {
        return permissions;
    }

    /**
     * A list of resources the role can access.
     */
    public CompanyRoleUpdateInput setPermissions(List<String> permissions) {
        this.permissions = Input.optional(permissions);
        return this;
    }

    /**
     * A list of resources the role can access.
     */
    public CompanyRoleUpdateInput setPermissionsInput(Input<List<String>> permissions) {
        if (permissions == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.permissions = permissions;
        return this;
    }

    /**
     * Set custom filter.
     */
    public CompanyRoleUpdateInput setCustomFilter(String name, Serializable filterInput) {
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

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("id:");
        AbstractQuery.appendQuotedString(_queryBuilder, id.toString());

        if (this.name.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("name:");
            if (name.getValue() != null) {
                AbstractQuery.appendQuotedString(_queryBuilder, name.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.permissions.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("permissions:");
            if (permissions.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (String item1 : permissions.getValue()) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        AbstractQuery.appendQuotedString(_queryBuilder, item1.toString());
                    }
                }
                _queryBuilder.append(']');
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}

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
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Input;

/**
 * Defines the input schema for updating a company team.
 */
public class CompanyTeamUpdateInput implements Serializable {
    private ID id;

    private Input<String> description = Input.undefined();

    private Input<String> name = Input.undefined();

    private Map<String, Input<Serializable>> customFilters = new HashMap<>();

    public CompanyTeamUpdateInput(ID id) {
        this.id = id;
    }

    /**
     * The unique ID of the `CompanyTeam` object to update.
     */
    public ID getId() {
        return id;
    }

    /**
     * The unique ID of the `CompanyTeam` object to update.
     */
    public CompanyTeamUpdateInput setId(ID id) {
        this.id = id;
        return this;
    }

    /**
     * An optional description of the team.
     */
    public String getDescription() {
        return description.getValue();
    }

    /**
     * An optional description of the team.
     */
    public Input<String> getDescriptionInput() {
        return description;
    }

    /**
     * An optional description of the team.
     */
    public CompanyTeamUpdateInput setDescription(String description) {
        this.description = Input.optional(description);
        return this;
    }

    /**
     * An optional description of the team.
     */
    public CompanyTeamUpdateInput setDescriptionInput(Input<String> description) {
        if (description == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.description = description;
        return this;
    }

    /**
     * The display name of the team.
     */
    public String getName() {
        return name.getValue();
    }

    /**
     * The display name of the team.
     */
    public Input<String> getNameInput() {
        return name;
    }

    /**
     * The display name of the team.
     */
    public CompanyTeamUpdateInput setName(String name) {
        this.name = Input.optional(name);
        return this;
    }

    /**
     * The display name of the team.
     */
    public CompanyTeamUpdateInput setNameInput(Input<String> name) {
        if (name == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.name = name;
        return this;
    }

    /**
     * Set custom filter.
     */
    public CompanyTeamUpdateInput setCustomFilter(String name, Serializable filterInput) {
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

        if (this.description.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("description:");
            if (description.getValue() != null) {
                AbstractQuery.appendQuotedString(_queryBuilder, description.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

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

        _queryBuilder.append('}');
    }
}

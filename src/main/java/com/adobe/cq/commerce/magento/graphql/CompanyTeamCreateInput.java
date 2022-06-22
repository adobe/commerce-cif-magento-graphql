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

import com.shopify.graphql.support.AbstractQuery;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Input;

/**
 * Defines the input schema for creating a company team.
 */
public class CompanyTeamCreateInput implements Serializable {
    private String name;

    private Input<String> description = Input.undefined();

    private Input<ID> targetId = Input.undefined();

    public CompanyTeamCreateInput(String name) {
        this.name = name;
    }

    /**
     * The display name of the team.
     */
    public String getName() {
        return name;
    }

    /**
     * The display name of the team.
     */
    public CompanyTeamCreateInput setName(String name) {
        this.name = name;
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
    public CompanyTeamCreateInput setDescription(String description) {
        this.description = Input.optional(description);
        return this;
    }

    /**
     * An optional description of the team.
     */
    public CompanyTeamCreateInput setDescriptionInput(Input<String> description) {
        if (description == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.description = description;
        return this;
    }

    /**
     * The ID of a node within a company&#39;s structure. This ID will be the parent of the created team.
     */
    public ID getTargetId() {
        return targetId.getValue();
    }

    /**
     * The ID of a node within a company&#39;s structure. This ID will be the parent of the created team.
     */
    public Input<ID> getTargetIdInput() {
        return targetId;
    }

    /**
     * The ID of a node within a company&#39;s structure. This ID will be the parent of the created team.
     */
    public CompanyTeamCreateInput setTargetId(ID targetId) {
        this.targetId = Input.optional(targetId);
        return this;
    }

    /**
     * The ID of a node within a company&#39;s structure. This ID will be the parent of the created team.
     */
    public CompanyTeamCreateInput setTargetIdInput(Input<ID> targetId) {
        if (targetId == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.targetId = targetId;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("name:");
        AbstractQuery.appendQuotedString(_queryBuilder, name.toString());

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

        if (this.targetId.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("target_id:");
            if (targetId.getValue() != null) {
                AbstractQuery.appendQuotedString(_queryBuilder, targetId.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}

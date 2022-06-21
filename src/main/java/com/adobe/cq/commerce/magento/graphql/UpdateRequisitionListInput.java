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
import com.shopify.graphql.support.Input;

/**
 * An input object that defines which requistion list characteristics to update.
 */
public class UpdateRequisitionListInput implements Serializable {
    private String name;

    private Input<String> description = Input.undefined();

    public UpdateRequisitionListInput(String name) {
        this.name = name;
    }

    /**
     * The new name of the requisition list.
     */
    public String getName() {
        return name;
    }

    /**
     * The new name of the requisition list.
     */
    public UpdateRequisitionListInput setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * The updated description of the requisition list.
     */
    public String getDescription() {
        return description.getValue();
    }

    /**
     * The updated description of the requisition list.
     */
    public Input<String> getDescriptionInput() {
        return description;
    }

    /**
     * The updated description of the requisition list.
     */
    public UpdateRequisitionListInput setDescription(String description) {
        this.description = Input.optional(description);
        return this;
    }

    /**
     * The updated description of the requisition list.
     */
    public UpdateRequisitionListInput setDescriptionInput(Input<String> description) {
        if (description == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.description = description;
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

        _queryBuilder.append('}');
    }
}

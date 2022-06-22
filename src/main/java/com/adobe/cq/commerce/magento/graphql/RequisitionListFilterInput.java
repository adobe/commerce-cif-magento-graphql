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

import com.shopify.graphql.support.Input;

/**
 * Defines requisition list filters.
 */
public class RequisitionListFilterInput implements Serializable {
    private Input<FilterMatchTypeInput> name = Input.undefined();

    private Input<FilterEqualTypeInput> uids = Input.undefined();

    /**
     * Filter by the display name of the requisition list.
     */
    public FilterMatchTypeInput getName() {
        return name.getValue();
    }

    /**
     * Filter by the display name of the requisition list.
     */
    public Input<FilterMatchTypeInput> getNameInput() {
        return name;
    }

    /**
     * Filter by the display name of the requisition list.
     */
    public RequisitionListFilterInput setName(FilterMatchTypeInput name) {
        this.name = Input.optional(name);
        return this;
    }

    /**
     * Filter by the display name of the requisition list.
     */
    public RequisitionListFilterInput setNameInput(Input<FilterMatchTypeInput> name) {
        if (name == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.name = name;
        return this;
    }

    /**
     * Filter requisition lists by one or more requisition list IDs.
     */
    public FilterEqualTypeInput getUids() {
        return uids.getValue();
    }

    /**
     * Filter requisition lists by one or more requisition list IDs.
     */
    public Input<FilterEqualTypeInput> getUidsInput() {
        return uids;
    }

    /**
     * Filter requisition lists by one or more requisition list IDs.
     */
    public RequisitionListFilterInput setUids(FilterEqualTypeInput uids) {
        this.uids = Input.optional(uids);
        return this;
    }

    /**
     * Filter requisition lists by one or more requisition list IDs.
     */
    public RequisitionListFilterInput setUidsInput(Input<FilterEqualTypeInput> uids) {
        if (uids == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.uids = uids;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.name.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("name:");
            if (name.getValue() != null) {
                name.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.uids.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("uids:");
            if (uids.getValue() != null) {
                uids.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}

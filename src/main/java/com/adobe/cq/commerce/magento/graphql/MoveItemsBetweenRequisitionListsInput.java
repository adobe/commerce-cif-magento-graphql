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
 * An input object that defines the items in a requisition list to be moved.
 */
public class MoveItemsBetweenRequisitionListsInput implements Serializable {
    private List<ID> requisitionListItemUids;

    private Map<String, Input<Serializable>> customFilters = new HashMap<>();

    public MoveItemsBetweenRequisitionListsInput(List<ID> requisitionListItemUids) {
        this.requisitionListItemUids = requisitionListItemUids;
    }

    /**
     * An array of IDs representing products moved from one requisition list to another.
     */
    public List<ID> getRequisitionListItemUids() {
        return requisitionListItemUids;
    }

    /**
     * An array of IDs representing products moved from one requisition list to another.
     */
    public MoveItemsBetweenRequisitionListsInput setRequisitionListItemUids(List<ID> requisitionListItemUids) {
        this.requisitionListItemUids = requisitionListItemUids;
        return this;
    }

    /**
     * Set custom filter.
     */
    public MoveItemsBetweenRequisitionListsInput setCustomFilter(String name, Serializable filterInput) {
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
        _queryBuilder.append("requisitionListItemUids:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (ID item1 : requisitionListItemUids) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                AbstractQuery.appendQuotedString(_queryBuilder, item1.toString());
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append('}');
    }
}

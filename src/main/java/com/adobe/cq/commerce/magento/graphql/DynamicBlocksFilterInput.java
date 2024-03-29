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
 * Defines the dynamic block filter. The filter can identify the block type, location and IDs to
 * return.
 */
public class DynamicBlocksFilterInput implements Serializable {
    private DynamicBlockTypeEnum type;

    private Input<List<ID>> dynamicBlockUids = Input.undefined();

    private Input<List<DynamicBlockLocationEnum>> locations = Input.undefined();

    private Map<String, Input<Serializable>> customFilters = new HashMap<>();

    public DynamicBlocksFilterInput(DynamicBlockTypeEnum type) {
        this.type = type;
    }

    /**
     * A value indicating the type of dynamic block to filter on.
     */
    public DynamicBlockTypeEnum getType() {
        return type;
    }

    /**
     * A value indicating the type of dynamic block to filter on.
     */
    public DynamicBlocksFilterInput setType(DynamicBlockTypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * An array of dynamic block UIDs to filter on.
     */
    public List<ID> getDynamicBlockUids() {
        return dynamicBlockUids.getValue();
    }

    /**
     * An array of dynamic block UIDs to filter on.
     */
    public Input<List<ID>> getDynamicBlockUidsInput() {
        return dynamicBlockUids;
    }

    /**
     * An array of dynamic block UIDs to filter on.
     */
    public DynamicBlocksFilterInput setDynamicBlockUids(List<ID> dynamicBlockUids) {
        this.dynamicBlockUids = Input.optional(dynamicBlockUids);
        return this;
    }

    /**
     * An array of dynamic block UIDs to filter on.
     */
    public DynamicBlocksFilterInput setDynamicBlockUidsInput(Input<List<ID>> dynamicBlockUids) {
        if (dynamicBlockUids == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.dynamicBlockUids = dynamicBlockUids;
        return this;
    }

    /**
     * An array indicating the locations the dynamic block can be placed.
     */
    public List<DynamicBlockLocationEnum> getLocations() {
        return locations.getValue();
    }

    /**
     * An array indicating the locations the dynamic block can be placed.
     */
    public Input<List<DynamicBlockLocationEnum>> getLocationsInput() {
        return locations;
    }

    /**
     * An array indicating the locations the dynamic block can be placed.
     */
    public DynamicBlocksFilterInput setLocations(List<DynamicBlockLocationEnum> locations) {
        this.locations = Input.optional(locations);
        return this;
    }

    /**
     * An array indicating the locations the dynamic block can be placed.
     */
    public DynamicBlocksFilterInput setLocationsInput(Input<List<DynamicBlockLocationEnum>> locations) {
        if (locations == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.locations = locations;
        return this;
    }

    /**
     * Set custom filter.
     */
    public DynamicBlocksFilterInput setCustomFilter(String name, Serializable filterInput) {
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
        _queryBuilder.append("type:");
        _queryBuilder.append(type.toString());

        if (this.dynamicBlockUids.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("dynamic_block_uids:");
            if (dynamicBlockUids.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (ID item1 : dynamicBlockUids.getValue()) {
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

        if (this.locations.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("locations:");
            if (locations.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (DynamicBlockLocationEnum item1 : locations.getValue()) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        _queryBuilder.append(item1.toString());
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

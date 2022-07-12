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
 * Defines the customer&#39;s state or province.
 */
public class CustomerAddressRegionInput implements Serializable {
    private Input<String> region = Input.undefined();

    private Input<String> regionCode = Input.undefined();

    private Input<Integer> regionId = Input.undefined();

    private Map<String, Input<Serializable>> customFilters = new HashMap<>();

    /**
     * The state or province name.
     */
    public String getRegion() {
        return region.getValue();
    }

    /**
     * The state or province name.
     */
    public Input<String> getRegionInput() {
        return region;
    }

    /**
     * The state or province name.
     */
    public CustomerAddressRegionInput setRegion(String region) {
        this.region = Input.optional(region);
        return this;
    }

    /**
     * The state or province name.
     */
    public CustomerAddressRegionInput setRegionInput(Input<String> region) {
        if (region == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.region = region;
        return this;
    }

    /**
     * The address region code.
     */
    public String getRegionCode() {
        return regionCode.getValue();
    }

    /**
     * The address region code.
     */
    public Input<String> getRegionCodeInput() {
        return regionCode;
    }

    /**
     * The address region code.
     */
    public CustomerAddressRegionInput setRegionCode(String regionCode) {
        this.regionCode = Input.optional(regionCode);
        return this;
    }

    /**
     * The address region code.
     */
    public CustomerAddressRegionInput setRegionCodeInput(Input<String> regionCode) {
        if (regionCode == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.regionCode = regionCode;
        return this;
    }

    /**
     * The unique ID for a pre-defined region.
     */
    public Integer getRegionId() {
        return regionId.getValue();
    }

    /**
     * The unique ID for a pre-defined region.
     */
    public Input<Integer> getRegionIdInput() {
        return regionId;
    }

    /**
     * The unique ID for a pre-defined region.
     */
    public CustomerAddressRegionInput setRegionId(Integer regionId) {
        this.regionId = Input.optional(regionId);
        return this;
    }

    /**
     * The unique ID for a pre-defined region.
     */
    public CustomerAddressRegionInput setRegionIdInput(Input<Integer> regionId) {
        if (regionId == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.regionId = regionId;
        return this;
    }

    /**
     * Set custom filter.
     */
    public CustomerAddressRegionInput setCustomFilter(String name, Serializable filterInput) {
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

        if (this.region.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("region:");
            if (region.getValue() != null) {
                AbstractQuery.appendQuotedString(_queryBuilder, region.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.regionCode.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("region_code:");
            if (regionCode.getValue() != null) {
                AbstractQuery.appendQuotedString(_queryBuilder, regionCode.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.regionId.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("region_id:");
            if (regionId.getValue() != null) {
                _queryBuilder.append(regionId.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}

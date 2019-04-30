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

package com.adobe.cq.commerce.magento.graphql;

import java.io.Serializable;

import com.shopify.graphql.support.AbstractQuery;
import com.shopify.graphql.support.Input;

public class CustomerAddressRegionInput implements Serializable {
    private Input<String> region = Input.undefined();

    private Input<String> regionCode = Input.undefined();

    private Input<Integer> regionId = Input.undefined();

    public String getRegion() {
        return region.getValue();
    }

    public Input<String> getRegionInput() {
        return region;
    }

    public CustomerAddressRegionInput setRegion(String region) {
        this.region = Input.optional(region);
        return this;
    }

    public CustomerAddressRegionInput setRegionInput(Input<String> region) {
        if (region == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.region = region;
        return this;
    }

    public String getRegionCode() {
        return regionCode.getValue();
    }

    public Input<String> getRegionCodeInput() {
        return regionCode;
    }

    public CustomerAddressRegionInput setRegionCode(String regionCode) {
        this.regionCode = Input.optional(regionCode);
        return this;
    }

    public CustomerAddressRegionInput setRegionCodeInput(Input<String> regionCode) {
        if (regionCode == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.regionCode = regionCode;
        return this;
    }

    public Integer getRegionId() {
        return regionId.getValue();
    }

    public Input<Integer> getRegionIdInput() {
        return regionId;
    }

    public CustomerAddressRegionInput setRegionId(Integer regionId) {
        this.regionId = Input.optional(regionId);
        return this;
    }

    public CustomerAddressRegionInput setRegionIdInput(Input<Integer> regionId) {
        if (regionId == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.regionId = regionId;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

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

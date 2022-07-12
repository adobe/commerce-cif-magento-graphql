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

import com.shopify.graphql.support.Input;

/**
 * PickupLocationFilterInput defines the list of attributes and filters for the search.
 */
public class PickupLocationFilterInput implements Serializable {
    private Input<FilterTypeInput> city = Input.undefined();

    private Input<FilterTypeInput> countryId = Input.undefined();

    private Input<FilterTypeInput> name = Input.undefined();

    private Input<FilterTypeInput> pickupLocationCode = Input.undefined();

    private Input<FilterTypeInput> postcode = Input.undefined();

    private Input<FilterTypeInput> region = Input.undefined();

    private Input<FilterTypeInput> regionId = Input.undefined();

    private Input<FilterTypeInput> street = Input.undefined();

    private Map<String, Input<Serializable>> customFilters = new HashMap<>();

    /**
     * Filter by city.
     */
    public FilterTypeInput getCity() {
        return city.getValue();
    }

    /**
     * Filter by city.
     */
    public Input<FilterTypeInput> getCityInput() {
        return city;
    }

    /**
     * Filter by city.
     */
    public PickupLocationFilterInput setCity(FilterTypeInput city) {
        this.city = Input.optional(city);
        return this;
    }

    /**
     * Filter by city.
     */
    public PickupLocationFilterInput setCityInput(Input<FilterTypeInput> city) {
        if (city == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.city = city;
        return this;
    }

    /**
     * Filter by country.
     */
    public FilterTypeInput getCountryId() {
        return countryId.getValue();
    }

    /**
     * Filter by country.
     */
    public Input<FilterTypeInput> getCountryIdInput() {
        return countryId;
    }

    /**
     * Filter by country.
     */
    public PickupLocationFilterInput setCountryId(FilterTypeInput countryId) {
        this.countryId = Input.optional(countryId);
        return this;
    }

    /**
     * Filter by country.
     */
    public PickupLocationFilterInput setCountryIdInput(Input<FilterTypeInput> countryId) {
        if (countryId == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.countryId = countryId;
        return this;
    }

    /**
     * Filter by pickup location name.
     */
    public FilterTypeInput getName() {
        return name.getValue();
    }

    /**
     * Filter by pickup location name.
     */
    public Input<FilterTypeInput> getNameInput() {
        return name;
    }

    /**
     * Filter by pickup location name.
     */
    public PickupLocationFilterInput setName(FilterTypeInput name) {
        this.name = Input.optional(name);
        return this;
    }

    /**
     * Filter by pickup location name.
     */
    public PickupLocationFilterInput setNameInput(Input<FilterTypeInput> name) {
        if (name == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.name = name;
        return this;
    }

    /**
     * Filter by pickup location code.
     */
    public FilterTypeInput getPickupLocationCode() {
        return pickupLocationCode.getValue();
    }

    /**
     * Filter by pickup location code.
     */
    public Input<FilterTypeInput> getPickupLocationCodeInput() {
        return pickupLocationCode;
    }

    /**
     * Filter by pickup location code.
     */
    public PickupLocationFilterInput setPickupLocationCode(FilterTypeInput pickupLocationCode) {
        this.pickupLocationCode = Input.optional(pickupLocationCode);
        return this;
    }

    /**
     * Filter by pickup location code.
     */
    public PickupLocationFilterInput setPickupLocationCodeInput(Input<FilterTypeInput> pickupLocationCode) {
        if (pickupLocationCode == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.pickupLocationCode = pickupLocationCode;
        return this;
    }

    /**
     * Filter by postcode.
     */
    public FilterTypeInput getPostcode() {
        return postcode.getValue();
    }

    /**
     * Filter by postcode.
     */
    public Input<FilterTypeInput> getPostcodeInput() {
        return postcode;
    }

    /**
     * Filter by postcode.
     */
    public PickupLocationFilterInput setPostcode(FilterTypeInput postcode) {
        this.postcode = Input.optional(postcode);
        return this;
    }

    /**
     * Filter by postcode.
     */
    public PickupLocationFilterInput setPostcodeInput(Input<FilterTypeInput> postcode) {
        if (postcode == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.postcode = postcode;
        return this;
    }

    /**
     * Filter by region.
     */
    public FilterTypeInput getRegion() {
        return region.getValue();
    }

    /**
     * Filter by region.
     */
    public Input<FilterTypeInput> getRegionInput() {
        return region;
    }

    /**
     * Filter by region.
     */
    public PickupLocationFilterInput setRegion(FilterTypeInput region) {
        this.region = Input.optional(region);
        return this;
    }

    /**
     * Filter by region.
     */
    public PickupLocationFilterInput setRegionInput(Input<FilterTypeInput> region) {
        if (region == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.region = region;
        return this;
    }

    /**
     * Filter by region id.
     */
    public FilterTypeInput getRegionId() {
        return regionId.getValue();
    }

    /**
     * Filter by region id.
     */
    public Input<FilterTypeInput> getRegionIdInput() {
        return regionId;
    }

    /**
     * Filter by region id.
     */
    public PickupLocationFilterInput setRegionId(FilterTypeInput regionId) {
        this.regionId = Input.optional(regionId);
        return this;
    }

    /**
     * Filter by region id.
     */
    public PickupLocationFilterInput setRegionIdInput(Input<FilterTypeInput> regionId) {
        if (regionId == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.regionId = regionId;
        return this;
    }

    /**
     * Filter by street.
     */
    public FilterTypeInput getStreet() {
        return street.getValue();
    }

    /**
     * Filter by street.
     */
    public Input<FilterTypeInput> getStreetInput() {
        return street;
    }

    /**
     * Filter by street.
     */
    public PickupLocationFilterInput setStreet(FilterTypeInput street) {
        this.street = Input.optional(street);
        return this;
    }

    /**
     * Filter by street.
     */
    public PickupLocationFilterInput setStreetInput(Input<FilterTypeInput> street) {
        if (street == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.street = street;
        return this;
    }

    /**
     * Set custom filter.
     */
    public PickupLocationFilterInput setCustomFilter(String name, Serializable filterInput) {
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

        if (this.city.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("city:");
            if (city.getValue() != null) {
                city.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.countryId.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("country_id:");
            if (countryId.getValue() != null) {
                countryId.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

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

        if (this.pickupLocationCode.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("pickup_location_code:");
            if (pickupLocationCode.getValue() != null) {
                pickupLocationCode.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.postcode.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("postcode:");
            if (postcode.getValue() != null) {
                postcode.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.region.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("region:");
            if (region.getValue() != null) {
                region.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.regionId.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("region_id:");
            if (regionId.getValue() != null) {
                regionId.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.street.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("street:");
            if (street.getValue() != null) {
                street.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}

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
 * PickupLocationSortInput specifies attribute to use for sorting search results and indicates whether
 * the results are sorted in ascending or descending order.
 */
public class PickupLocationSortInput implements Serializable {
    private Input<SortEnum> city = Input.undefined();

    private Input<SortEnum> contactName = Input.undefined();

    private Input<SortEnum> countryId = Input.undefined();

    private Input<SortEnum> description = Input.undefined();

    private Input<SortEnum> distance = Input.undefined();

    private Input<SortEnum> email = Input.undefined();

    private Input<SortEnum> fax = Input.undefined();

    private Input<SortEnum> latitude = Input.undefined();

    private Input<SortEnum> longitude = Input.undefined();

    private Input<SortEnum> name = Input.undefined();

    private Input<SortEnum> phone = Input.undefined();

    private Input<SortEnum> pickupLocationCode = Input.undefined();

    private Input<SortEnum> postcode = Input.undefined();

    private Input<SortEnum> region = Input.undefined();

    private Input<SortEnum> regionId = Input.undefined();

    private Input<SortEnum> street = Input.undefined();

    private Map<String, Input<Serializable>> customFilters = new HashMap<>();

    /**
     * City where pickup location is placed.
     */
    public SortEnum getCity() {
        return city.getValue();
    }

    /**
     * City where pickup location is placed.
     */
    public Input<SortEnum> getCityInput() {
        return city;
    }

    /**
     * City where pickup location is placed.
     */
    public PickupLocationSortInput setCity(SortEnum city) {
        this.city = Input.optional(city);
        return this;
    }

    /**
     * City where pickup location is placed.
     */
    public PickupLocationSortInput setCityInput(Input<SortEnum> city) {
        if (city == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.city = city;
        return this;
    }

    /**
     * Name of the contact person.
     */
    public SortEnum getContactName() {
        return contactName.getValue();
    }

    /**
     * Name of the contact person.
     */
    public Input<SortEnum> getContactNameInput() {
        return contactName;
    }

    /**
     * Name of the contact person.
     */
    public PickupLocationSortInput setContactName(SortEnum contactName) {
        this.contactName = Input.optional(contactName);
        return this;
    }

    /**
     * Name of the contact person.
     */
    public PickupLocationSortInput setContactNameInput(Input<SortEnum> contactName) {
        if (contactName == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.contactName = contactName;
        return this;
    }

    /**
     * Id of the country in two letters.
     */
    public SortEnum getCountryId() {
        return countryId.getValue();
    }

    /**
     * Id of the country in two letters.
     */
    public Input<SortEnum> getCountryIdInput() {
        return countryId;
    }

    /**
     * Id of the country in two letters.
     */
    public PickupLocationSortInput setCountryId(SortEnum countryId) {
        this.countryId = Input.optional(countryId);
        return this;
    }

    /**
     * Id of the country in two letters.
     */
    public PickupLocationSortInput setCountryIdInput(Input<SortEnum> countryId) {
        if (countryId == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.countryId = countryId;
        return this;
    }

    /**
     * Description of the pickup location.
     */
    public SortEnum getDescription() {
        return description.getValue();
    }

    /**
     * Description of the pickup location.
     */
    public Input<SortEnum> getDescriptionInput() {
        return description;
    }

    /**
     * Description of the pickup location.
     */
    public PickupLocationSortInput setDescription(SortEnum description) {
        this.description = Input.optional(description);
        return this;
    }

    /**
     * Description of the pickup location.
     */
    public PickupLocationSortInput setDescriptionInput(Input<SortEnum> description) {
        if (description == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.description = description;
        return this;
    }

    /**
     * Distance to the address, requested by distance filter. Applicable only with distance filter. If
     * distance sort order is present, all other sort orders will be ignored.
     */
    public SortEnum getDistance() {
        return distance.getValue();
    }

    /**
     * Distance to the address, requested by distance filter. Applicable only with distance filter. If
     * distance sort order is present, all other sort orders will be ignored.
     */
    public Input<SortEnum> getDistanceInput() {
        return distance;
    }

    /**
     * Distance to the address, requested by distance filter. Applicable only with distance filter. If
     * distance sort order is present, all other sort orders will be ignored.
     */
    public PickupLocationSortInput setDistance(SortEnum distance) {
        this.distance = Input.optional(distance);
        return this;
    }

    /**
     * Distance to the address, requested by distance filter. Applicable only with distance filter. If
     * distance sort order is present, all other sort orders will be ignored.
     */
    public PickupLocationSortInput setDistanceInput(Input<SortEnum> distance) {
        if (distance == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.distance = distance;
        return this;
    }

    /**
     * Contact email of the pickup location.
     */
    public SortEnum getEmail() {
        return email.getValue();
    }

    /**
     * Contact email of the pickup location.
     */
    public Input<SortEnum> getEmailInput() {
        return email;
    }

    /**
     * Contact email of the pickup location.
     */
    public PickupLocationSortInput setEmail(SortEnum email) {
        this.email = Input.optional(email);
        return this;
    }

    /**
     * Contact email of the pickup location.
     */
    public PickupLocationSortInput setEmailInput(Input<SortEnum> email) {
        if (email == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.email = email;
        return this;
    }

    /**
     * Contact fax of the pickup location.
     */
    public SortEnum getFax() {
        return fax.getValue();
    }

    /**
     * Contact fax of the pickup location.
     */
    public Input<SortEnum> getFaxInput() {
        return fax;
    }

    /**
     * Contact fax of the pickup location.
     */
    public PickupLocationSortInput setFax(SortEnum fax) {
        this.fax = Input.optional(fax);
        return this;
    }

    /**
     * Contact fax of the pickup location.
     */
    public PickupLocationSortInput setFaxInput(Input<SortEnum> fax) {
        if (fax == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.fax = fax;
        return this;
    }

    /**
     * Geographic latitude where pickup location is placed.
     */
    public SortEnum getLatitude() {
        return latitude.getValue();
    }

    /**
     * Geographic latitude where pickup location is placed.
     */
    public Input<SortEnum> getLatitudeInput() {
        return latitude;
    }

    /**
     * Geographic latitude where pickup location is placed.
     */
    public PickupLocationSortInput setLatitude(SortEnum latitude) {
        this.latitude = Input.optional(latitude);
        return this;
    }

    /**
     * Geographic latitude where pickup location is placed.
     */
    public PickupLocationSortInput setLatitudeInput(Input<SortEnum> latitude) {
        if (latitude == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.latitude = latitude;
        return this;
    }

    /**
     * Geographic longitude where pickup location is placed.
     */
    public SortEnum getLongitude() {
        return longitude.getValue();
    }

    /**
     * Geographic longitude where pickup location is placed.
     */
    public Input<SortEnum> getLongitudeInput() {
        return longitude;
    }

    /**
     * Geographic longitude where pickup location is placed.
     */
    public PickupLocationSortInput setLongitude(SortEnum longitude) {
        this.longitude = Input.optional(longitude);
        return this;
    }

    /**
     * Geographic longitude where pickup location is placed.
     */
    public PickupLocationSortInput setLongitudeInput(Input<SortEnum> longitude) {
        if (longitude == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.longitude = longitude;
        return this;
    }

    /**
     * The pickup location name. Customer use this to identify the pickup location.
     */
    public SortEnum getName() {
        return name.getValue();
    }

    /**
     * The pickup location name. Customer use this to identify the pickup location.
     */
    public Input<SortEnum> getNameInput() {
        return name;
    }

    /**
     * The pickup location name. Customer use this to identify the pickup location.
     */
    public PickupLocationSortInput setName(SortEnum name) {
        this.name = Input.optional(name);
        return this;
    }

    /**
     * The pickup location name. Customer use this to identify the pickup location.
     */
    public PickupLocationSortInput setNameInput(Input<SortEnum> name) {
        if (name == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.name = name;
        return this;
    }

    /**
     * Contact phone number of the pickup location.
     */
    public SortEnum getPhone() {
        return phone.getValue();
    }

    /**
     * Contact phone number of the pickup location.
     */
    public Input<SortEnum> getPhoneInput() {
        return phone;
    }

    /**
     * Contact phone number of the pickup location.
     */
    public PickupLocationSortInput setPhone(SortEnum phone) {
        this.phone = Input.optional(phone);
        return this;
    }

    /**
     * Contact phone number of the pickup location.
     */
    public PickupLocationSortInput setPhoneInput(Input<SortEnum> phone) {
        if (phone == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.phone = phone;
        return this;
    }

    /**
     * A code assigned to pickup location to identify the source.
     */
    public SortEnum getPickupLocationCode() {
        return pickupLocationCode.getValue();
    }

    /**
     * A code assigned to pickup location to identify the source.
     */
    public Input<SortEnum> getPickupLocationCodeInput() {
        return pickupLocationCode;
    }

    /**
     * A code assigned to pickup location to identify the source.
     */
    public PickupLocationSortInput setPickupLocationCode(SortEnum pickupLocationCode) {
        this.pickupLocationCode = Input.optional(pickupLocationCode);
        return this;
    }

    /**
     * A code assigned to pickup location to identify the source.
     */
    public PickupLocationSortInput setPickupLocationCodeInput(Input<SortEnum> pickupLocationCode) {
        if (pickupLocationCode == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.pickupLocationCode = pickupLocationCode;
        return this;
    }

    /**
     * Postcode where pickup location is placed.
     */
    public SortEnum getPostcode() {
        return postcode.getValue();
    }

    /**
     * Postcode where pickup location is placed.
     */
    public Input<SortEnum> getPostcodeInput() {
        return postcode;
    }

    /**
     * Postcode where pickup location is placed.
     */
    public PickupLocationSortInput setPostcode(SortEnum postcode) {
        this.postcode = Input.optional(postcode);
        return this;
    }

    /**
     * Postcode where pickup location is placed.
     */
    public PickupLocationSortInput setPostcodeInput(Input<SortEnum> postcode) {
        if (postcode == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.postcode = postcode;
        return this;
    }

    /**
     * Name of the region.
     */
    public SortEnum getRegion() {
        return region.getValue();
    }

    /**
     * Name of the region.
     */
    public Input<SortEnum> getRegionInput() {
        return region;
    }

    /**
     * Name of the region.
     */
    public PickupLocationSortInput setRegion(SortEnum region) {
        this.region = Input.optional(region);
        return this;
    }

    /**
     * Name of the region.
     */
    public PickupLocationSortInput setRegionInput(Input<SortEnum> region) {
        if (region == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.region = region;
        return this;
    }

    /**
     * Id of the region.
     */
    public SortEnum getRegionId() {
        return regionId.getValue();
    }

    /**
     * Id of the region.
     */
    public Input<SortEnum> getRegionIdInput() {
        return regionId;
    }

    /**
     * Id of the region.
     */
    public PickupLocationSortInput setRegionId(SortEnum regionId) {
        this.regionId = Input.optional(regionId);
        return this;
    }

    /**
     * Id of the region.
     */
    public PickupLocationSortInput setRegionIdInput(Input<SortEnum> regionId) {
        if (regionId == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.regionId = regionId;
        return this;
    }

    /**
     * Street where pickup location is placed.
     */
    public SortEnum getStreet() {
        return street.getValue();
    }

    /**
     * Street where pickup location is placed.
     */
    public Input<SortEnum> getStreetInput() {
        return street;
    }

    /**
     * Street where pickup location is placed.
     */
    public PickupLocationSortInput setStreet(SortEnum street) {
        this.street = Input.optional(street);
        return this;
    }

    /**
     * Street where pickup location is placed.
     */
    public PickupLocationSortInput setStreetInput(Input<SortEnum> street) {
        if (street == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.street = street;
        return this;
    }

    /**
     * Set custom filter.
     */
    public PickupLocationSortInput setCustomFilter(String name, Serializable filterInput) {
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
                _queryBuilder.append(city.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.contactName.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("contact_name:");
            if (contactName.getValue() != null) {
                _queryBuilder.append(contactName.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.countryId.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("country_id:");
            if (countryId.getValue() != null) {
                _queryBuilder.append(countryId.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.description.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("description:");
            if (description.getValue() != null) {
                _queryBuilder.append(description.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.distance.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("distance:");
            if (distance.getValue() != null) {
                _queryBuilder.append(distance.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.email.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("email:");
            if (email.getValue() != null) {
                _queryBuilder.append(email.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.fax.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("fax:");
            if (fax.getValue() != null) {
                _queryBuilder.append(fax.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.latitude.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("latitude:");
            if (latitude.getValue() != null) {
                _queryBuilder.append(latitude.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.longitude.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("longitude:");
            if (longitude.getValue() != null) {
                _queryBuilder.append(longitude.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.name.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("name:");
            if (name.getValue() != null) {
                _queryBuilder.append(name.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.phone.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("phone:");
            if (phone.getValue() != null) {
                _queryBuilder.append(phone.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.pickupLocationCode.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("pickup_location_code:");
            if (pickupLocationCode.getValue() != null) {
                _queryBuilder.append(pickupLocationCode.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.postcode.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("postcode:");
            if (postcode.getValue() != null) {
                _queryBuilder.append(postcode.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.region.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("region:");
            if (region.getValue() != null) {
                _queryBuilder.append(region.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.regionId.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("region_id:");
            if (regionId.getValue() != null) {
                _queryBuilder.append(regionId.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.street.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("street:");
            if (street.getValue() != null) {
                _queryBuilder.append(street.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}

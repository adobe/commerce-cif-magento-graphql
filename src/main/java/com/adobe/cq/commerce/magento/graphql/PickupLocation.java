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

import java.util.Map;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;

/**
 * Defines Pickup Location information.
 */
public class PickupLocation extends AbstractResponse<PickupLocation> {
    public PickupLocation() {
    }

    public PickupLocation(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "city": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "contact_name": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "country_id": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "description": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "email": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "fax": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "latitude": {
                    Double optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsDouble(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "longitude": {
                    Double optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsDouble(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "name": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "phone": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "pickup_location_code": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "postcode": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "region": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "region_id": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "street": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "__typename": {
                    responseData.put(key, jsonAsString(field.getValue(), key));
                    break;
                }

                default: {
                    readCustomField(fieldName, field.getValue());
                }
            }
        }
    }

    public String getGraphQlTypeName() {
        return "PickupLocation";
    }

    public String getCity() {
        return (String) get("city");
    }

    public PickupLocation setCity(String arg) {
        optimisticData.put(getKey("city"), arg);
        return this;
    }

    public String getContactName() {
        return (String) get("contact_name");
    }

    public PickupLocation setContactName(String arg) {
        optimisticData.put(getKey("contact_name"), arg);
        return this;
    }

    public String getCountryId() {
        return (String) get("country_id");
    }

    public PickupLocation setCountryId(String arg) {
        optimisticData.put(getKey("country_id"), arg);
        return this;
    }

    public String getDescription() {
        return (String) get("description");
    }

    public PickupLocation setDescription(String arg) {
        optimisticData.put(getKey("description"), arg);
        return this;
    }

    public String getEmail() {
        return (String) get("email");
    }

    public PickupLocation setEmail(String arg) {
        optimisticData.put(getKey("email"), arg);
        return this;
    }

    public String getFax() {
        return (String) get("fax");
    }

    public PickupLocation setFax(String arg) {
        optimisticData.put(getKey("fax"), arg);
        return this;
    }

    public Double getLatitude() {
        return (Double) get("latitude");
    }

    public PickupLocation setLatitude(Double arg) {
        optimisticData.put(getKey("latitude"), arg);
        return this;
    }

    public Double getLongitude() {
        return (Double) get("longitude");
    }

    public PickupLocation setLongitude(Double arg) {
        optimisticData.put(getKey("longitude"), arg);
        return this;
    }

    public String getName() {
        return (String) get("name");
    }

    public PickupLocation setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    public String getPhone() {
        return (String) get("phone");
    }

    public PickupLocation setPhone(String arg) {
        optimisticData.put(getKey("phone"), arg);
        return this;
    }

    public String getPickupLocationCode() {
        return (String) get("pickup_location_code");
    }

    public PickupLocation setPickupLocationCode(String arg) {
        optimisticData.put(getKey("pickup_location_code"), arg);
        return this;
    }

    public String getPostcode() {
        return (String) get("postcode");
    }

    public PickupLocation setPostcode(String arg) {
        optimisticData.put(getKey("postcode"), arg);
        return this;
    }

    public String getRegion() {
        return (String) get("region");
    }

    public PickupLocation setRegion(String arg) {
        optimisticData.put(getKey("region"), arg);
        return this;
    }

    public Integer getRegionId() {
        return (Integer) get("region_id");
    }

    public PickupLocation setRegionId(Integer arg) {
        optimisticData.put(getKey("region_id"), arg);
        return this;
    }

    public String getStreet() {
        return (String) get("street");
    }

    public PickupLocation setStreet(String arg) {
        optimisticData.put(getKey("street"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "city": return false;

            case "contact_name": return false;

            case "country_id": return false;

            case "description": return false;

            case "email": return false;

            case "fax": return false;

            case "latitude": return false;

            case "longitude": return false;

            case "name": return false;

            case "phone": return false;

            case "pickup_location_code": return false;

            case "postcode": return false;

            case "region": return false;

            case "region_id": return false;

            case "street": return false;

            default: return false;
        }
    }
}


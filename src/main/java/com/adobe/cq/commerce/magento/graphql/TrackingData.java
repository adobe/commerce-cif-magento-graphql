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

public class TrackingData extends AbstractResponse<TrackingData> {
    public TrackingData() {}

    public TrackingData(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "page_tracking_enabled": {
                    Boolean optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsBoolean(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "region_prefix": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "roi_tracking_enabled": {
                    Boolean optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsBoolean(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "wbt_profile_id": {
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
        return "TrackingData";
    }

    /**
     * Is Page Tracking enabled
     */
    public Boolean getPageTrackingEnabled() {
        return (Boolean) get("page_tracking_enabled");
    }

    public TrackingData setPageTrackingEnabled(Boolean arg) {
        optimisticData.put(getKey("page_tracking_enabled"), arg);
        return this;
    }

    /**
     * dotdigital region prefix
     */
    public String getRegionPrefix() {
        return (String) get("region_prefix");
    }

    public TrackingData setRegionPrefix(String arg) {
        optimisticData.put(getKey("region_prefix"), arg);
        return this;
    }

    /**
     * Is ROI Tracking enabled
     */
    public Boolean getRoiTrackingEnabled() {
        return (Boolean) get("roi_tracking_enabled");
    }

    public TrackingData setRoiTrackingEnabled(Boolean arg) {
        optimisticData.put(getKey("roi_tracking_enabled"), arg);
        return this;
    }

    /**
     * Web Behaviour Tracking profile ID
     */
    public String getWbtProfileId() {
        return (String) get("wbt_profile_id");
    }

    public TrackingData setWbtProfileId(String arg) {
        optimisticData.put(getKey("wbt_profile_id"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "page_tracking_enabled":
                return false;

            case "region_prefix":
                return false;

            case "roi_tracking_enabled":
                return false;

            case "wbt_profile_id":
                return false;

            default:
                return false;
        }
    }
}

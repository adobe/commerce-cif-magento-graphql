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
 * CustomerAddressRegion defines the customer&#39;s state or province
 */
public class CustomerAddressRegion extends AbstractResponse<CustomerAddressRegion> {
    public CustomerAddressRegion() {
    }

    public CustomerAddressRegion(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "region": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "region_code": {
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
        return "CustomerAddressRegion";
    }

    /**
     * The state or province name
     */
    public String getRegion() {
        return (String) get("region");
    }

    public CustomerAddressRegion setRegion(String arg) {
        optimisticData.put(getKey("region"), arg);
        return this;
    }

    /**
     * The address region code
     */
    public String getRegionCode() {
        return (String) get("region_code");
    }

    public CustomerAddressRegion setRegionCode(String arg) {
        optimisticData.put(getKey("region_code"), arg);
        return this;
    }

    /**
     * The unique ID for a pre-defined region
     */
    public Integer getRegionId() {
        return (Integer) get("region_id");
    }

    public CustomerAddressRegion setRegionId(Integer arg) {
        optimisticData.put(getKey("region_id"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "region": return false;

            case "region_code": return false;

            case "region_id": return false;

            default: return false;
        }
    }
}


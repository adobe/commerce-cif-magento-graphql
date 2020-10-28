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
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;

/**
 * GiftCardAmounts contains the value of a gift card, the website that generated the card, and related
 * information
 */
public class GiftCardAmounts extends AbstractResponse<GiftCardAmounts> {
    public GiftCardAmounts() {}

    public GiftCardAmounts(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "attribute_id": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "uid": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "value": {
                    Double optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsDouble(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "value_id": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "website_id": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "website_value": {
                    Double optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsDouble(field.getValue(), key);
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
        return "GiftCardAmounts";
    }

    /**
     * An internal attribute ID.
     */
    public Integer getAttributeId() {
        return (Integer) get("attribute_id");
    }

    public GiftCardAmounts setAttributeId(Integer arg) {
        optimisticData.put(getKey("attribute_id"), arg);
        return this;
    }

    /**
     * A string that encodes option details.
     */
    public ID getUid() {
        return (ID) get("uid");
    }

    public GiftCardAmounts setUid(ID arg) {
        optimisticData.put(getKey("uid"), arg);
        return this;
    }

    /**
     * The value of the gift card
     */
    public Double getValue() {
        return (Double) get("value");
    }

    public GiftCardAmounts setValue(Double arg) {
        optimisticData.put(getKey("value"), arg);
        return this;
    }

    /**
     * An ID that is assigned to each unique gift card amount.
     */
    public Integer getValueId() {
        return (Integer) get("value_id");
    }

    public GiftCardAmounts setValueId(Integer arg) {
        optimisticData.put(getKey("value_id"), arg);
        return this;
    }

    /**
     * ID of the website that generated the gift card
     */
    public Integer getWebsiteId() {
        return (Integer) get("website_id");
    }

    public GiftCardAmounts setWebsiteId(Integer arg) {
        optimisticData.put(getKey("website_id"), arg);
        return this;
    }

    /**
     * The value of the gift card
     */
    public Double getWebsiteValue() {
        return (Double) get("website_value");
    }

    public GiftCardAmounts setWebsiteValue(Double arg) {
        optimisticData.put(getKey("website_value"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "attribute_id":
                return false;

            case "uid":
                return false;

            case "value":
                return false;

            case "value_id":
                return false;

            case "website_id":
                return false;

            case "website_value":
                return false;

            default:
                return false;
        }
    }
}

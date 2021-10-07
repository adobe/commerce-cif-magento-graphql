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

public class GiftRegistryDynamicAttributeMetadata extends AbstractResponse<GiftRegistryDynamicAttributeMetadata> implements
    GiftRegistryDynamicAttributeMetadataInterface {
    public GiftRegistryDynamicAttributeMetadata() {}

    public GiftRegistryDynamicAttributeMetadata(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "attribute_group": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "code": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "input_type": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "is_required": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "label": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "sort_order": {
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
        return "GiftRegistryDynamicAttributeMetadata";
    }

    /**
     * Indicates which group the dynamic attribute a member of
     */
    public String getAttributeGroup() {
        return (String) get("attribute_group");
    }

    public GiftRegistryDynamicAttributeMetadata setAttributeGroup(String arg) {
        optimisticData.put(getKey("attribute_group"), arg);
        return this;
    }

    /**
     * The internal ID of the dynamic attribute
     */
    public ID getCode() {
        return (ID) get("code");
    }

    public GiftRegistryDynamicAttributeMetadata setCode(ID arg) {
        optimisticData.put(getKey("code"), arg);
        return this;
    }

    /**
     * The selected input type for this dynamic attribute. The value can be one of several static or custom
     * types
     */
    public String getInputType() {
        return (String) get("input_type");
    }

    public GiftRegistryDynamicAttributeMetadata setInputType(String arg) {
        optimisticData.put(getKey("input_type"), arg);
        return this;
    }

    /**
     * Indicates whether the dynamic attribute is required
     */
    public Boolean getIsRequired() {
        return (Boolean) get("is_required");
    }

    public GiftRegistryDynamicAttributeMetadata setIsRequired(Boolean arg) {
        optimisticData.put(getKey("is_required"), arg);
        return this;
    }

    /**
     * The display name of the dynamic attribute
     */
    public String getLabel() {
        return (String) get("label");
    }

    public GiftRegistryDynamicAttributeMetadata setLabel(String arg) {
        optimisticData.put(getKey("label"), arg);
        return this;
    }

    /**
     * The order in which to display the dynamic attribute
     */
    public Integer getSortOrder() {
        return (Integer) get("sort_order");
    }

    public GiftRegistryDynamicAttributeMetadata setSortOrder(Integer arg) {
        optimisticData.put(getKey("sort_order"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "attribute_group":
                return false;

            case "code":
                return false;

            case "input_type":
                return false;

            case "is_required":
                return false;

            case "label":
                return false;

            case "sort_order":
                return false;

            default:
                return false;
        }
    }
}

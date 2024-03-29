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

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;

/**
 * Contains details about a gift registry type.
 */
public class GiftRegistryType extends AbstractResponse<GiftRegistryType> {
    public GiftRegistryType() {}

    public GiftRegistryType(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "dynamic_attributes_metadata": {
                    List<GiftRegistryDynamicAttributeMetadataInterface> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<GiftRegistryDynamicAttributeMetadataInterface> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            GiftRegistryDynamicAttributeMetadataInterface optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = UnknownGiftRegistryDynamicAttributeMetadataInterface.create(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "label": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "uid": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

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
        return "GiftRegistryType";
    }

    /**
     * An array of attributes that define elements of the gift registry. Each attribute is specified as a
     * code-value pair.
     */
    public List<GiftRegistryDynamicAttributeMetadataInterface> getDynamicAttributesMetadata() {
        return (List<GiftRegistryDynamicAttributeMetadataInterface>) get("dynamic_attributes_metadata");
    }

    public GiftRegistryType setDynamicAttributesMetadata(List<GiftRegistryDynamicAttributeMetadataInterface> arg) {
        optimisticData.put(getKey("dynamic_attributes_metadata"), arg);
        return this;
    }

    /**
     * The label assigned to the gift registry type on the Admin.
     */
    public String getLabel() {
        return (String) get("label");
    }

    public GiftRegistryType setLabel(String arg) {
        optimisticData.put(getKey("label"), arg);
        return this;
    }

    /**
     * The unique ID assigned to the gift registry type.
     */
    public ID getUid() {
        return (ID) get("uid");
    }

    public GiftRegistryType setUid(ID arg) {
        optimisticData.put(getKey("uid"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "dynamic_attributes_metadata":
                return false;

            case "label":
                return false;

            case "uid":
                return false;

            default:
                return false;
        }
    }
}

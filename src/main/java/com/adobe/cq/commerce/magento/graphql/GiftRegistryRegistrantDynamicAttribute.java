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

public class GiftRegistryRegistrantDynamicAttribute extends AbstractResponse<GiftRegistryRegistrantDynamicAttribute> implements
    GiftRegistryDynamicAttributeInterface {
    public GiftRegistryRegistrantDynamicAttribute() {}

    public GiftRegistryRegistrantDynamicAttribute(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "code": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "label": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "value": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

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
        return "GiftRegistryRegistrantDynamicAttribute";
    }

    /**
     * The internal ID of the dynamic attribute.
     */
    public ID getCode() {
        return (ID) get("code");
    }

    public GiftRegistryRegistrantDynamicAttribute setCode(ID arg) {
        optimisticData.put(getKey("code"), arg);
        return this;
    }

    /**
     * The display name of the dynamic attribute.
     */
    public String getLabel() {
        return (String) get("label");
    }

    public GiftRegistryRegistrantDynamicAttribute setLabel(String arg) {
        optimisticData.put(getKey("label"), arg);
        return this;
    }

    /**
     * A corresponding value for the code.
     */
    public String getValue() {
        return (String) get("value");
    }

    public GiftRegistryRegistrantDynamicAttribute setValue(String arg) {
        optimisticData.put(getKey("value"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "code":
                return false;

            case "label":
                return false;

            case "value":
                return false;

            default:
                return false;
        }
    }
}

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

public class ChatData extends AbstractResponse<ChatData> {
    public ChatData() {}

    public ChatData(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "api_space_id": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "cookie_name": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "is_enabled": {
                    Boolean optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsBoolean(field.getValue(), key);
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
        return "ChatData";
    }

    /**
     * API space id
     */
    public String getApiSpaceId() {
        return (String) get("api_space_id");
    }

    public ChatData setApiSpaceId(String arg) {
        optimisticData.put(getKey("api_space_id"), arg);
        return this;
    }

    /**
     * Cookie name
     */
    public String getCookieName() {
        return (String) get("cookie_name");
    }

    public ChatData setCookieName(String arg) {
        optimisticData.put(getKey("cookie_name"), arg);
        return this;
    }

    /**
     * Is chat enabled
     */
    public Boolean getIsEnabled() {
        return (Boolean) get("is_enabled");
    }

    public ChatData setIsEnabled(Boolean arg) {
        optimisticData.put(getKey("is_enabled"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "api_space_id":
                return false;

            case "cookie_name":
                return false;

            case "is_enabled":
                return false;

            default:
                return false;
        }
    }
}

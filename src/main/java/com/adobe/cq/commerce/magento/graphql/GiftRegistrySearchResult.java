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
 * Contains the results of a gift registry search.
 */
public class GiftRegistrySearchResult extends AbstractResponse<GiftRegistrySearchResult> {
    public GiftRegistrySearchResult() {}

    public GiftRegistrySearchResult(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "event_date": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "event_title": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "gift_registry_uid": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "location": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "name": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "type": {
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
        return "GiftRegistrySearchResult";
    }

    /**
     * The date of the event.
     */
    public String getEventDate() {
        return (String) get("event_date");
    }

    public GiftRegistrySearchResult setEventDate(String arg) {
        optimisticData.put(getKey("event_date"), arg);
        return this;
    }

    /**
     * The title given to the event.
     */
    public String getEventTitle() {
        return (String) get("event_title");
    }

    public GiftRegistrySearchResult setEventTitle(String arg) {
        optimisticData.put(getKey("event_title"), arg);
        return this;
    }

    /**
     * The URL key of the gift registry.
     */
    public ID getGiftRegistryUid() {
        return (ID) get("gift_registry_uid");
    }

    public GiftRegistrySearchResult setGiftRegistryUid(ID arg) {
        optimisticData.put(getKey("gift_registry_uid"), arg);
        return this;
    }

    /**
     * The location of the event.
     */
    public String getLocation() {
        return (String) get("location");
    }

    public GiftRegistrySearchResult setLocation(String arg) {
        optimisticData.put(getKey("location"), arg);
        return this;
    }

    /**
     * The name of the gift registry owner.
     */
    public String getName() {
        return (String) get("name");
    }

    public GiftRegistrySearchResult setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    /**
     * The type of event being held.
     */
    public String getType() {
        return (String) get("type");
    }

    public GiftRegistrySearchResult setType(String arg) {
        optimisticData.put(getKey("type"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "event_date":
                return false;

            case "event_title":
                return false;

            case "gift_registry_uid":
                return false;

            case "location":
                return false;

            case "name":
                return false;

            case "type":
                return false;

            default:
                return false;
        }
    }
}

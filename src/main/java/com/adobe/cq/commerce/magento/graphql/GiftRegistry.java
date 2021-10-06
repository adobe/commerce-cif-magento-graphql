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

public class GiftRegistry extends AbstractResponse<GiftRegistry> {
    public GiftRegistry() {}

    public GiftRegistry(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "created_at": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "dynamic_attributes": {
                    List<GiftRegistryDynamicAttribute> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<GiftRegistryDynamicAttribute> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            GiftRegistryDynamicAttribute optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new GiftRegistryDynamicAttribute(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "event_name": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "items": {
                    List<GiftRegistryItemInterface> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<GiftRegistryItemInterface> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            GiftRegistryItemInterface optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = UnknownGiftRegistryItemInterface.create(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "message": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "owner_name": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "privacy_settings": {
                    responseData.put(key, GiftRegistryPrivacySettings.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "registrants": {
                    List<GiftRegistryRegistrant> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<GiftRegistryRegistrant> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            GiftRegistryRegistrant optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new GiftRegistryRegistrant(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "shipping_address": {
                    CustomerAddress optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CustomerAddress(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "status": {
                    responseData.put(key, GiftRegistryStatus.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "type": {
                    GiftRegistryType optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new GiftRegistryType(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

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
        return "GiftRegistry";
    }

    /**
     * The date on which the gift registry was created. Only the registry owner can access this attribute
     */
    public String getCreatedAt() {
        return (String) get("created_at");
    }

    public GiftRegistry setCreatedAt(String arg) {
        optimisticData.put(getKey("created_at"), arg);
        return this;
    }

    /**
     * An array of attributes that define elements of the gift registry. Each attribute is specified as a
     * code-value pair
     */
    public List<GiftRegistryDynamicAttribute> getDynamicAttributes() {
        return (List<GiftRegistryDynamicAttribute>) get("dynamic_attributes");
    }

    public GiftRegistry setDynamicAttributes(List<GiftRegistryDynamicAttribute> arg) {
        optimisticData.put(getKey("dynamic_attributes"), arg);
        return this;
    }

    /**
     * The name of the event
     */
    public String getEventName() {
        return (String) get("event_name");
    }

    public GiftRegistry setEventName(String arg) {
        optimisticData.put(getKey("event_name"), arg);
        return this;
    }

    /**
     * An array of products added to the gift registry
     */
    public List<GiftRegistryItemInterface> getItems() {
        return (List<GiftRegistryItemInterface>) get("items");
    }

    public GiftRegistry setItems(List<GiftRegistryItemInterface> arg) {
        optimisticData.put(getKey("items"), arg);
        return this;
    }

    /**
     * The message text the customer entered to describe the event
     */
    public String getMessage() {
        return (String) get("message");
    }

    public GiftRegistry setMessage(String arg) {
        optimisticData.put(getKey("message"), arg);
        return this;
    }

    /**
     * The customer who created the gift registry
     */
    public String getOwnerName() {
        return (String) get("owner_name");
    }

    public GiftRegistry setOwnerName(String arg) {
        optimisticData.put(getKey("owner_name"), arg);
        return this;
    }

    /**
     * An enum that states whether the gift registry is PRIVATE or PUBLIC. Only the registry owner can
     * access this attribute
     */
    public GiftRegistryPrivacySettings getPrivacySettings() {
        return (GiftRegistryPrivacySettings) get("privacy_settings");
    }

    public GiftRegistry setPrivacySettings(GiftRegistryPrivacySettings arg) {
        optimisticData.put(getKey("privacy_settings"), arg);
        return this;
    }

    /**
     * Contains details about each registrant for the event
     */
    public List<GiftRegistryRegistrant> getRegistrants() {
        return (List<GiftRegistryRegistrant>) get("registrants");
    }

    public GiftRegistry setRegistrants(List<GiftRegistryRegistrant> arg) {
        optimisticData.put(getKey("registrants"), arg);
        return this;
    }

    /**
     * Contains the customer&#39;s shipping address. Only the registry owner can access this attribute
     */
    public CustomerAddress getShippingAddress() {
        return (CustomerAddress) get("shipping_address");
    }

    public GiftRegistry setShippingAddress(CustomerAddress arg) {
        optimisticData.put(getKey("shipping_address"), arg);
        return this;
    }

    /**
     * An enum that states whether the gift registry is ACTIVE or INACTIVE. Only the registry owner can
     * access this attribute
     */
    public GiftRegistryStatus getStatus() {
        return (GiftRegistryStatus) get("status");
    }

    public GiftRegistry setStatus(GiftRegistryStatus arg) {
        optimisticData.put(getKey("status"), arg);
        return this;
    }

    /**
     * Contains details about the type of gift registry
     */
    public GiftRegistryType getType() {
        return (GiftRegistryType) get("type");
    }

    public GiftRegistry setType(GiftRegistryType arg) {
        optimisticData.put(getKey("type"), arg);
        return this;
    }

    /**
     * The unique ID assigned to the gift registry
     */
    public ID getUid() {
        return (ID) get("uid");
    }

    public GiftRegistry setUid(ID arg) {
        optimisticData.put(getKey("uid"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "created_at":
                return false;

            case "dynamic_attributes":
                return true;

            case "event_name":
                return false;

            case "items":
                return false;

            case "message":
                return false;

            case "owner_name":
                return false;

            case "privacy_settings":
                return false;

            case "registrants":
                return true;

            case "shipping_address":
                return true;

            case "status":
                return false;

            case "type":
                return true;

            case "uid":
                return false;

            default:
                return false;
        }
    }
}

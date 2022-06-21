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
 * Defines the contents of a requisition list.
 */
public class RequisitionList extends AbstractResponse<RequisitionList> {
    public RequisitionList() {}

    public RequisitionList(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "description": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "items": {
                    RequistionListItems optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new RequistionListItems(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "items_count": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

                    break;
                }

                case "name": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "uid": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "updated_at": {
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
        return "RequisitionList";
    }

    /**
     * Optional text that describes the requisition list.
     */
    public String getDescription() {
        return (String) get("description");
    }

    public RequisitionList setDescription(String arg) {
        optimisticData.put(getKey("description"), arg);
        return this;
    }

    /**
     * An array of products added to the requisition list.
     */
    public RequistionListItems getItems() {
        return (RequistionListItems) get("items");
    }

    public RequisitionList setItems(RequistionListItems arg) {
        optimisticData.put(getKey("items"), arg);
        return this;
    }

    /**
     * The number of items in the list.
     */
    public Integer getItemsCount() {
        return (Integer) get("items_count");
    }

    public RequisitionList setItemsCount(Integer arg) {
        optimisticData.put(getKey("items_count"), arg);
        return this;
    }

    /**
     * The requisition list name.
     */
    public String getName() {
        return (String) get("name");
    }

    public RequisitionList setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    /**
     * The unique requisition list ID.
     */
    public ID getUid() {
        return (ID) get("uid");
    }

    public RequisitionList setUid(ID arg) {
        optimisticData.put(getKey("uid"), arg);
        return this;
    }

    /**
     * The time of the last modification of the requisition list.
     */
    public String getUpdatedAt() {
        return (String) get("updated_at");
    }

    public RequisitionList setUpdatedAt(String arg) {
        optimisticData.put(getKey("updated_at"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "description":
                return false;

            case "items":
                return true;

            case "items_count":
                return false;

            case "name":
                return false;

            case "uid":
                return false;

            case "updated_at":
                return false;

            default:
                return false;
        }
    }
}

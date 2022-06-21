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
 * Contains details about a change for a negotiable quote.
 */
public class NegotiableQuoteHistoryEntry extends AbstractResponse<NegotiableQuoteHistoryEntry> {
    public NegotiableQuoteHistoryEntry() {}

    public NegotiableQuoteHistoryEntry(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "author": {
                    responseData.put(key, new NegotiableQuoteUser(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "change_type": {
                    responseData.put(key, NegotiableQuoteHistoryEntryChangeType.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "changes": {
                    NegotiableQuoteHistoryChanges optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new NegotiableQuoteHistoryChanges(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "created_at": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
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
        return "NegotiableQuoteHistoryEntry";
    }

    /**
     * The person who made a change in the status of the negotiable quote.
     */
    public NegotiableQuoteUser getAuthor() {
        return (NegotiableQuoteUser) get("author");
    }

    public NegotiableQuoteHistoryEntry setAuthor(NegotiableQuoteUser arg) {
        optimisticData.put(getKey("author"), arg);
        return this;
    }

    /**
     * An enum that describes the why the entry in the negotiable quote history changed status.
     */
    public NegotiableQuoteHistoryEntryChangeType getChangeType() {
        return (NegotiableQuoteHistoryEntryChangeType) get("change_type");
    }

    public NegotiableQuoteHistoryEntry setChangeType(NegotiableQuoteHistoryEntryChangeType arg) {
        optimisticData.put(getKey("change_type"), arg);
        return this;
    }

    /**
     * The set of changes in the negotiable quote.
     */
    public NegotiableQuoteHistoryChanges getChanges() {
        return (NegotiableQuoteHistoryChanges) get("changes");
    }

    public NegotiableQuoteHistoryEntry setChanges(NegotiableQuoteHistoryChanges arg) {
        optimisticData.put(getKey("changes"), arg);
        return this;
    }

    /**
     * Timestamp indicating when the negotiable quote entry was created.
     */
    public String getCreatedAt() {
        return (String) get("created_at");
    }

    public NegotiableQuoteHistoryEntry setCreatedAt(String arg) {
        optimisticData.put(getKey("created_at"), arg);
        return this;
    }

    /**
     * The unique ID of a `NegotiableQuoteHistoryEntry` object.
     */
    public ID getUid() {
        return (ID) get("uid");
    }

    public NegotiableQuoteHistoryEntry setUid(ID arg) {
        optimisticData.put(getKey("uid"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "author":
                return true;

            case "change_type":
                return false;

            case "changes":
                return true;

            case "created_at":
                return false;

            case "uid":
                return false;

            default:
                return false;
        }
    }
}

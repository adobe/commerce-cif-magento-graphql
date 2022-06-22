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
 * Lists a new status change applied to a negotiable quote and the previous status.
 */
public class NegotiableQuoteHistoryStatusChange extends AbstractResponse<NegotiableQuoteHistoryStatusChange> {
    public NegotiableQuoteHistoryStatusChange() {}

    public NegotiableQuoteHistoryStatusChange(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "new_status": {
                    responseData.put(key, NegotiableQuoteStatus.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "old_status": {
                    NegotiableQuoteStatus optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = NegotiableQuoteStatus.fromGraphQl(jsonAsString(field.getValue(), key));
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
        return "NegotiableQuoteHistoryStatusChange";
    }

    /**
     * The updated status.
     */
    public NegotiableQuoteStatus getNewStatus() {
        return (NegotiableQuoteStatus) get("new_status");
    }

    public NegotiableQuoteHistoryStatusChange setNewStatus(NegotiableQuoteStatus arg) {
        optimisticData.put(getKey("new_status"), arg);
        return this;
    }

    /**
     * The previous status. The value will be null for the first history entry in a negotiable quote.
     */
    public NegotiableQuoteStatus getOldStatus() {
        return (NegotiableQuoteStatus) get("old_status");
    }

    public NegotiableQuoteHistoryStatusChange setOldStatus(NegotiableQuoteStatus arg) {
        optimisticData.put(getKey("old_status"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "new_status":
                return false;

            case "old_status":
                return false;

            default:
                return false;
        }
    }
}

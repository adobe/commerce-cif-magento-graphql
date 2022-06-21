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
 * Contains a list of changes to a negotiable quote.
 */
public class NegotiableQuoteHistoryChanges extends AbstractResponse<NegotiableQuoteHistoryChanges> {
    public NegotiableQuoteHistoryChanges() {}

    public NegotiableQuoteHistoryChanges(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "comment_added": {
                    NegotiableQuoteHistoryCommentChange optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new NegotiableQuoteHistoryCommentChange(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "custom_changes": {
                    NegotiableQuoteCustomLogChange optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new NegotiableQuoteCustomLogChange(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "expiration": {
                    NegotiableQuoteHistoryExpirationChange optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new NegotiableQuoteHistoryExpirationChange(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "products_removed": {
                    NegotiableQuoteHistoryProductsRemovedChange optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new NegotiableQuoteHistoryProductsRemovedChange(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "statuses": {
                    NegotiableQuoteHistoryStatusesChange optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new NegotiableQuoteHistoryStatusesChange(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "total": {
                    NegotiableQuoteHistoryTotalChange optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new NegotiableQuoteHistoryTotalChange(jsonAsObject(field.getValue(), key));
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
        return "NegotiableQuoteHistoryChanges";
    }

    /**
     * The comment provided with a change in the negotiable quote history.
     */
    public NegotiableQuoteHistoryCommentChange getCommentAdded() {
        return (NegotiableQuoteHistoryCommentChange) get("comment_added");
    }

    public NegotiableQuoteHistoryChanges setCommentAdded(NegotiableQuoteHistoryCommentChange arg) {
        optimisticData.put(getKey("comment_added"), arg);
        return this;
    }

    /**
     * Lists log entries added by third-party extensions.
     */
    public NegotiableQuoteCustomLogChange getCustomChanges() {
        return (NegotiableQuoteCustomLogChange) get("custom_changes");
    }

    public NegotiableQuoteHistoryChanges setCustomChanges(NegotiableQuoteCustomLogChange arg) {
        optimisticData.put(getKey("custom_changes"), arg);
        return this;
    }

    /**
     * The expiration date of the negotiable quote before and after a change in the quote history.
     */
    public NegotiableQuoteHistoryExpirationChange getExpiration() {
        return (NegotiableQuoteHistoryExpirationChange) get("expiration");
    }

    public NegotiableQuoteHistoryChanges setExpiration(NegotiableQuoteHistoryExpirationChange arg) {
        optimisticData.put(getKey("expiration"), arg);
        return this;
    }

    /**
     * Lists products that were removed as a result of a change in the quote history.
     */
    public NegotiableQuoteHistoryProductsRemovedChange getProductsRemoved() {
        return (NegotiableQuoteHistoryProductsRemovedChange) get("products_removed");
    }

    public NegotiableQuoteHistoryChanges setProductsRemoved(NegotiableQuoteHistoryProductsRemovedChange arg) {
        optimisticData.put(getKey("products_removed"), arg);
        return this;
    }

    /**
     * The status before and after a change in the negotiable quote history.
     */
    public NegotiableQuoteHistoryStatusesChange getStatuses() {
        return (NegotiableQuoteHistoryStatusesChange) get("statuses");
    }

    public NegotiableQuoteHistoryChanges setStatuses(NegotiableQuoteHistoryStatusesChange arg) {
        optimisticData.put(getKey("statuses"), arg);
        return this;
    }

    /**
     * The total amount of the negotiable quote before and after a change in the quote history.
     */
    public NegotiableQuoteHistoryTotalChange getTotal() {
        return (NegotiableQuoteHistoryTotalChange) get("total");
    }

    public NegotiableQuoteHistoryChanges setTotal(NegotiableQuoteHistoryTotalChange arg) {
        optimisticData.put(getKey("total"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "comment_added":
                return true;

            case "custom_changes":
                return true;

            case "expiration":
                return true;

            case "products_removed":
                return true;

            case "statuses":
                return true;

            case "total":
                return true;

            default:
                return false;
        }
    }
}

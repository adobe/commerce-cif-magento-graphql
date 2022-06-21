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
import com.shopify.graphql.support.SchemaViolationError;

/**
 * Contains a list of undeleted negotiable quotes the company user can view.
 */
public class DeleteNegotiableQuotesOutput extends AbstractResponse<DeleteNegotiableQuotesOutput> {
    public DeleteNegotiableQuotesOutput() {}

    public DeleteNegotiableQuotesOutput(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "negotiable_quotes": {
                    NegotiableQuotesOutput optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new NegotiableQuotesOutput(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "operation_results": {
                    List<DeleteNegotiableQuoteOperationResult> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        DeleteNegotiableQuoteOperationResult optional2 = null;
                        if (!element1.isJsonNull()) {
                            optional2 = UnknownDeleteNegotiableQuoteOperationResult.create(jsonAsObject(element1, key));
                        }

                        list1.add(optional2);
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "result_status": {
                    responseData.put(key, BatchMutationStatus.fromGraphQl(jsonAsString(field.getValue(), key)));

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
        return "DeleteNegotiableQuotesOutput";
    }

    /**
     * A list of negotiable quotes that the customer can view
     */
    public NegotiableQuotesOutput getNegotiableQuotes() {
        return (NegotiableQuotesOutput) get("negotiable_quotes");
    }

    public DeleteNegotiableQuotesOutput setNegotiableQuotes(NegotiableQuotesOutput arg) {
        optimisticData.put(getKey("negotiable_quotes"), arg);
        return this;
    }

    /**
     * An array of deleted negotiable quote UIDs and details about any errors.
     */
    public List<DeleteNegotiableQuoteOperationResult> getOperationResults() {
        return (List<DeleteNegotiableQuoteOperationResult>) get("operation_results");
    }

    public DeleteNegotiableQuotesOutput setOperationResults(List<DeleteNegotiableQuoteOperationResult> arg) {
        optimisticData.put(getKey("operation_results"), arg);
        return this;
    }

    /**
     * The status of the request to delete one or more negotiable quotes.
     */
    public BatchMutationStatus getResultStatus() {
        return (BatchMutationStatus) get("result_status");
    }

    public DeleteNegotiableQuotesOutput setResultStatus(BatchMutationStatus arg) {
        optimisticData.put(getKey("result_status"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "negotiable_quotes":
                return true;

            case "operation_results":
                return false;

            case "result_status":
                return false;

            default:
                return false;
        }
    }
}

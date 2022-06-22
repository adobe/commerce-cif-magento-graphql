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
 * Contains the closed negotiable quotes and other negotiable quotes the company user can view.
 */
public class CloseNegotiableQuotesOutput extends AbstractResponse<CloseNegotiableQuotesOutput> {
    public CloseNegotiableQuotesOutput() {}

    public CloseNegotiableQuotesOutput(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "closed_quotes": {
                    List<NegotiableQuote> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<NegotiableQuote> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            NegotiableQuote optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new NegotiableQuote(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "negotiable_quotes": {
                    NegotiableQuotesOutput optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new NegotiableQuotesOutput(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "operation_results": {
                    List<CloseNegotiableQuoteOperationResult> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        CloseNegotiableQuoteOperationResult optional2 = null;
                        if (!element1.isJsonNull()) {
                            optional2 = UnknownCloseNegotiableQuoteOperationResult.create(jsonAsObject(element1, key));
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
        return "CloseNegotiableQuotesOutput";
    }

    /**
     * An array containing the negotiable quotes that were just closed.
     *
     * @deprecated Use `operation_results` instead.
     */
    @Deprecated
    public List<NegotiableQuote> getClosedQuotes() {
        return (List<NegotiableQuote>) get("closed_quotes");
    }

    public CloseNegotiableQuotesOutput setClosedQuotes(List<NegotiableQuote> arg) {
        optimisticData.put(getKey("closed_quotes"), arg);
        return this;
    }

    /**
     * A list of negotiable quotes that can be viewed by the logged-in customer
     */
    public NegotiableQuotesOutput getNegotiableQuotes() {
        return (NegotiableQuotesOutput) get("negotiable_quotes");
    }

    public CloseNegotiableQuotesOutput setNegotiableQuotes(NegotiableQuotesOutput arg) {
        optimisticData.put(getKey("negotiable_quotes"), arg);
        return this;
    }

    /**
     * An array of closed negotiable quote UIDs and details about any errors.
     */
    public List<CloseNegotiableQuoteOperationResult> getOperationResults() {
        return (List<CloseNegotiableQuoteOperationResult>) get("operation_results");
    }

    public CloseNegotiableQuotesOutput setOperationResults(List<CloseNegotiableQuoteOperationResult> arg) {
        optimisticData.put(getKey("operation_results"), arg);
        return this;
    }

    /**
     * The status of the request to close one or more negotiable quotes.
     */
    public BatchMutationStatus getResultStatus() {
        return (BatchMutationStatus) get("result_status");
    }

    public CloseNegotiableQuotesOutput setResultStatus(BatchMutationStatus arg) {
        optimisticData.put(getKey("result_status"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "closed_quotes":
                return true;

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

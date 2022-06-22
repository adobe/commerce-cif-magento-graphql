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

/**
 * Contains details about a failed close operation on a negotiable quote.
 */
public class CloseNegotiableQuoteOperationFailure extends AbstractResponse<CloseNegotiableQuoteOperationFailure> implements
    CloseNegotiableQuoteOperationResult {
    public CloseNegotiableQuoteOperationFailure() {}

    public CloseNegotiableQuoteOperationFailure(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "errors": {
                    List<CloseNegotiableQuoteError> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        CloseNegotiableQuoteError optional2 = null;
                        if (!element1.isJsonNull()) {
                            optional2 = UnknownCloseNegotiableQuoteError.create(jsonAsObject(element1, key));
                        }

                        list1.add(optional2);
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "quote_uid": {
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
        return "CloseNegotiableQuoteOperationFailure";
    }

    /**
     * An array of errors encountered while attempting close the negotiable quote.
     */
    public List<CloseNegotiableQuoteError> getErrors() {
        return (List<CloseNegotiableQuoteError>) get("errors");
    }

    public CloseNegotiableQuoteOperationFailure setErrors(List<CloseNegotiableQuoteError> arg) {
        optimisticData.put(getKey("errors"), arg);
        return this;
    }

    /**
     * The unique ID of a `NegotiableQuote` object.
     */
    public ID getQuoteUid() {
        return (ID) get("quote_uid");
    }

    public CloseNegotiableQuoteOperationFailure setQuoteUid(ID arg) {
        optimisticData.put(getKey("quote_uid"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "errors":
                return false;

            case "quote_uid":
                return false;

            default:
                return false;
        }
    }
}

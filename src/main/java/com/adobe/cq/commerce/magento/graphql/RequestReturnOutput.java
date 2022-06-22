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
 * Contains the response to a return request.
 */
public class RequestReturnOutput extends AbstractResponse<RequestReturnOutput> {
    public RequestReturnOutput() {}

    public RequestReturnOutput(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "return": {
                    Return optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Return(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "returns": {
                    Returns optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Returns(jsonAsObject(field.getValue(), key));
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
        return "RequestReturnOutput";
    }

    /**
     * Details about a single return request.
     */
    public Return getReturn() {
        return (Return) get("return");
    }

    public RequestReturnOutput setReturn(Return arg) {
        optimisticData.put(getKey("return"), arg);
        return this;
    }

    /**
     * An array of return requests.
     */
    public Returns getReturns() {
        return (Returns) get("returns");
    }

    public RequestReturnOutput setReturns(Returns arg) {
        optimisticData.put(getKey("returns"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "return":
                return true;

            case "returns":
                return true;

            default:
                return false;
        }
    }
}

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
 * Contains the secure information used to authorize transaction. Applies to Payflow Pro and Payments
 * Pro payment methods.
 */
public class CreatePayflowProTokenOutput extends AbstractResponse<CreatePayflowProTokenOutput> {
    public CreatePayflowProTokenOutput() {}

    public CreatePayflowProTokenOutput(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "response_message": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "result": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

                    break;
                }

                case "result_code": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

                    break;
                }

                case "secure_token": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "secure_token_id": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

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
        return "CreatePayflowProTokenOutput";
    }

    public String getResponseMessage() {
        return (String) get("response_message");
    }

    public CreatePayflowProTokenOutput setResponseMessage(String arg) {
        optimisticData.put(getKey("response_message"), arg);
        return this;
    }

    public Integer getResult() {
        return (Integer) get("result");
    }

    public CreatePayflowProTokenOutput setResult(Integer arg) {
        optimisticData.put(getKey("result"), arg);
        return this;
    }

    public Integer getResultCode() {
        return (Integer) get("result_code");
    }

    public CreatePayflowProTokenOutput setResultCode(Integer arg) {
        optimisticData.put(getKey("result_code"), arg);
        return this;
    }

    public String getSecureToken() {
        return (String) get("secure_token");
    }

    public CreatePayflowProTokenOutput setSecureToken(String arg) {
        optimisticData.put(getKey("secure_token"), arg);
        return this;
    }

    public String getSecureTokenId() {
        return (String) get("secure_token_id");
    }

    public CreatePayflowProTokenOutput setSecureTokenId(String arg) {
        optimisticData.put(getKey("secure_token_id"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "response_message":
                return false;

            case "result":
                return false;

            case "result_code":
                return false;

            case "secure_token":
                return false;

            case "secure_token_id":
                return false;

            default:
                return false;
        }
    }
}

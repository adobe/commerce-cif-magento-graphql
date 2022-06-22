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
 * An error encountered while adding an item to the cart.
 */
public class CheckoutUserInputError extends AbstractResponse<CheckoutUserInputError> {
    public CheckoutUserInputError() {}

    public CheckoutUserInputError(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "code": {
                    responseData.put(key, CheckoutUserInputErrorCodes.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "message": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "path": {
                    List<String> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        String optional2 = null;
                        if (!element1.isJsonNull()) {
                            optional2 = jsonAsString(element1, key);
                        }

                        list1.add(optional2);
                    }

                    responseData.put(key, list1);

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
        return "CheckoutUserInputError";
    }

    /**
     * An error code that is specific to Checkout.
     */
    public CheckoutUserInputErrorCodes getCode() {
        return (CheckoutUserInputErrorCodes) get("code");
    }

    public CheckoutUserInputError setCode(CheckoutUserInputErrorCodes arg) {
        optimisticData.put(getKey("code"), arg);
        return this;
    }

    /**
     * A localized error message.
     */
    public String getMessage() {
        return (String) get("message");
    }

    public CheckoutUserInputError setMessage(String arg) {
        optimisticData.put(getKey("message"), arg);
        return this;
    }

    /**
     * The path to the input field that caused an error. See the GraphQL specification about path errors
     * for details: http://spec.graphql.org/draft/#sec-Errors
     */
    public List<String> getPath() {
        return (List<String>) get("path");
    }

    public CheckoutUserInputError setPath(List<String> arg) {
        optimisticData.put(getKey("path"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "code":
                return false;

            case "message":
                return false;

            case "path":
                return false;

            default:
                return false;
        }
    }
}

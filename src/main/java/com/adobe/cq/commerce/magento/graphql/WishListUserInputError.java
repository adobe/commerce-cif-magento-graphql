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
 * An error encountered while performing operations with WishList.
 */
public class WishListUserInputError extends AbstractResponse<WishListUserInputError> {
    public WishListUserInputError() {}

    public WishListUserInputError(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "code": {
                    responseData.put(key, WishListUserInputErrorType.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "message": {
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
        return "WishListUserInputError";
    }

    /**
     * A wish list-specific error code.
     */
    public WishListUserInputErrorType getCode() {
        return (WishListUserInputErrorType) get("code");
    }

    public WishListUserInputError setCode(WishListUserInputErrorType arg) {
        optimisticData.put(getKey("code"), arg);
        return this;
    }

    /**
     * A localized error message.
     */
    public String getMessage() {
        return (String) get("message");
    }

    public WishListUserInputError setMessage(String arg) {
        optimisticData.put(getKey("message"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "code":
                return false;

            case "message":
                return false;

            default:
                return false;
        }
    }
}

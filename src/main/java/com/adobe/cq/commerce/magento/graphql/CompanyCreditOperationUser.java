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
 * Defines the administrator or company user that submitted a company credit operation.
 */
public class CompanyCreditOperationUser extends AbstractResponse<CompanyCreditOperationUser> {
    public CompanyCreditOperationUser() {}

    public CompanyCreditOperationUser(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "name": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "type": {
                    responseData.put(key, CompanyCreditOperationUserType.fromGraphQl(jsonAsString(field.getValue(), key)));

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
        return "CompanyCreditOperationUser";
    }

    /**
     * The name of the company user submitting the company credit operation.
     */
    public String getName() {
        return (String) get("name");
    }

    public CompanyCreditOperationUser setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    /**
     * The type of the company user submitting the company credit operation.
     */
    public CompanyCreditOperationUserType getType() {
        return (CompanyCreditOperationUserType) get("type");
    }

    public CompanyCreditOperationUser setType(CompanyCreditOperationUserType arg) {
        optimisticData.put(getKey("type"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "name":
                return false;

            case "type":
                return false;

            default:
                return false;
        }
    }
}

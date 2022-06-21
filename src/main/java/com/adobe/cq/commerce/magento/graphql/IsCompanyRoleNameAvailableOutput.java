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
 * Contains the response of a role name validation query.
 */
public class IsCompanyRoleNameAvailableOutput extends AbstractResponse<IsCompanyRoleNameAvailableOutput> {
    public IsCompanyRoleNameAvailableOutput() {}

    public IsCompanyRoleNameAvailableOutput(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "is_role_name_available": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

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
        return "IsCompanyRoleNameAvailableOutput";
    }

    /**
     * Indicates whether the specified company role name is available.
     */
    public Boolean getIsRoleNameAvailable() {
        return (Boolean) get("is_role_name_available");
    }

    public IsCompanyRoleNameAvailableOutput setIsRoleNameAvailable(Boolean arg) {
        optimisticData.put(getKey("is_role_name_available"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "is_role_name_available":
                return false;

            default:
                return false;
        }
    }
}

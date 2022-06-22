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
 * Contails details about a single role.
 */
public class CompanyRole extends AbstractResponse<CompanyRole> {
    public CompanyRole() {}

    public CompanyRole(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "name": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "permissions": {
                    List<CompanyAclResource> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<CompanyAclResource> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            CompanyAclResource optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new CompanyAclResource(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "users_count": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
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
        return "CompanyRole";
    }

    /**
     * The unique ID for a `CompanyRole` object.
     */
    public ID getId() {
        return (ID) get("id");
    }

    public CompanyRole setId(ID arg) {
        optimisticData.put(getKey("id"), arg);
        return this;
    }

    /**
     * The name assigned to the role.
     */
    public String getName() {
        return (String) get("name");
    }

    public CompanyRole setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    /**
     * A list of permission resources defined for a role.
     */
    public List<CompanyAclResource> getPermissions() {
        return (List<CompanyAclResource>) get("permissions");
    }

    public CompanyRole setPermissions(List<CompanyAclResource> arg) {
        optimisticData.put(getKey("permissions"), arg);
        return this;
    }

    /**
     * The total number of users assigned the specified role.
     */
    public Integer getUsersCount() {
        return (Integer) get("users_count");
    }

    public CompanyRole setUsersCount(Integer arg) {
        optimisticData.put(getKey("users_count"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "id":
                return false;

            case "name":
                return false;

            case "permissions":
                return true;

            case "users_count":
                return false;

            default:
                return false;
        }
    }
}

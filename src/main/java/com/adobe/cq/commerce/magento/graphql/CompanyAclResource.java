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
 * Contains details about the access control list settings of a resource.
 */
public class CompanyAclResource extends AbstractResponse<CompanyAclResource> {
    public CompanyAclResource() {}

    public CompanyAclResource(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "children": {
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

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "sort_order": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "text": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
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
        return "CompanyAclResource";
    }

    /**
     * An array of sub-resources.
     */
    public List<CompanyAclResource> getChildren() {
        return (List<CompanyAclResource>) get("children");
    }

    public CompanyAclResource setChildren(List<CompanyAclResource> arg) {
        optimisticData.put(getKey("children"), arg);
        return this;
    }

    /**
     * The unique ID for a `CompanyAclResource` object.
     */
    public ID getId() {
        return (ID) get("id");
    }

    public CompanyAclResource setId(ID arg) {
        optimisticData.put(getKey("id"), arg);
        return this;
    }

    /**
     * The sort order of an ACL resource.
     */
    public Integer getSortOrder() {
        return (Integer) get("sort_order");
    }

    public CompanyAclResource setSortOrder(Integer arg) {
        optimisticData.put(getKey("sort_order"), arg);
        return this;
    }

    /**
     * The label assigned to the ACL resource.
     */
    public String getText() {
        return (String) get("text");
    }

    public CompanyAclResource setText(String arg) {
        optimisticData.put(getKey("text"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "children":
                return true;

            case "id":
                return false;

            case "sort_order":
                return false;

            case "text":
                return false;

            default:
                return false;
        }
    }
}

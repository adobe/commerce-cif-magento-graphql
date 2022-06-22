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
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;

/**
 * Defines an individual node in the company structure.
 */
public class CompanyStructureItem extends AbstractResponse<CompanyStructureItem> {
    public CompanyStructureItem() {}

    public CompanyStructureItem(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "entity": {
                    CompanyStructureEntity optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = UnknownCompanyStructureEntity.create(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "parent_id": {
                    ID optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ID(jsonAsString(field.getValue(), key));
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
        return "CompanyStructureItem";
    }

    /**
     * A union of `CompanyTeam` and `Customer` objects.
     */
    public CompanyStructureEntity getEntity() {
        return (CompanyStructureEntity) get("entity");
    }

    public CompanyStructureItem setEntity(CompanyStructureEntity arg) {
        optimisticData.put(getKey("entity"), arg);
        return this;
    }

    /**
     * The unique ID for a `CompanyStructureItem` object.
     */
    public ID getId() {
        return (ID) get("id");
    }

    public CompanyStructureItem setId(ID arg) {
        optimisticData.put(getKey("id"), arg);
        return this;
    }

    /**
     * The ID of the parent item in the company hierarchy.
     */
    public ID getParentId() {
        return (ID) get("parent_id");
    }

    public CompanyStructureItem setParentId(ID arg) {
        optimisticData.put(getKey("parent_id"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "entity":
                return false;

            case "id":
                return false;

            case "parent_id":
                return false;

            default:
                return false;
        }
    }
}

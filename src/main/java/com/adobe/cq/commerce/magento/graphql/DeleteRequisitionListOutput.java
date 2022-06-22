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
 * Indicates whether the request to delete the requisition list was successful.
 */
public class DeleteRequisitionListOutput extends AbstractResponse<DeleteRequisitionListOutput> {
    public DeleteRequisitionListOutput() {}

    public DeleteRequisitionListOutput(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "requisition_lists": {
                    RequisitionLists optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new RequisitionLists(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "status": {
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
        return "DeleteRequisitionListOutput";
    }

    /**
     * The customer&#39;s requisition lists after deleting a requisition list.
     */
    public RequisitionLists getRequisitionLists() {
        return (RequisitionLists) get("requisition_lists");
    }

    public DeleteRequisitionListOutput setRequisitionLists(RequisitionLists arg) {
        optimisticData.put(getKey("requisition_lists"), arg);
        return this;
    }

    /**
     * Indicates whether the request to delete the requisition list was successful.
     */
    public Boolean getStatus() {
        return (Boolean) get("status");
    }

    public DeleteRequisitionListOutput setStatus(Boolean arg) {
        optimisticData.put(getKey("status"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "requisition_lists":
                return true;

            case "status":
                return false;

            default:
                return false;
        }
    }
}

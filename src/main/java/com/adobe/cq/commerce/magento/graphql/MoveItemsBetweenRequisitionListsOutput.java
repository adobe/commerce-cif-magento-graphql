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
 * Output of the request to move items to another requisition list.
 */
public class MoveItemsBetweenRequisitionListsOutput extends AbstractResponse<MoveItemsBetweenRequisitionListsOutput> {
    public MoveItemsBetweenRequisitionListsOutput() {}

    public MoveItemsBetweenRequisitionListsOutput(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "destination_requisition_list": {
                    RequisitionList optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new RequisitionList(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "source_requisition_list": {
                    RequisitionList optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new RequisitionList(jsonAsObject(field.getValue(), key));
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
        return "MoveItemsBetweenRequisitionListsOutput";
    }

    /**
     * The destination requisition list after moving items.
     */
    public RequisitionList getDestinationRequisitionList() {
        return (RequisitionList) get("destination_requisition_list");
    }

    public MoveItemsBetweenRequisitionListsOutput setDestinationRequisitionList(RequisitionList arg) {
        optimisticData.put(getKey("destination_requisition_list"), arg);
        return this;
    }

    /**
     * The source requisition list after moving items.
     */
    public RequisitionList getSourceRequisitionList() {
        return (RequisitionList) get("source_requisition_list");
    }

    public MoveItemsBetweenRequisitionListsOutput setSourceRequisitionList(RequisitionList arg) {
        optimisticData.put(getKey("source_requisition_list"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "destination_requisition_list":
                return true;

            case "source_requisition_list":
                return true;

            default:
                return false;
        }
    }
}

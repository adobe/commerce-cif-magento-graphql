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
 * Contains the results of the request to assign a compare list.
 */
public class AssignCompareListToCustomerOutput extends AbstractResponse<AssignCompareListToCustomerOutput> {
    public AssignCompareListToCustomerOutput() {}

    public AssignCompareListToCustomerOutput(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "compare_list": {
                    CompareList optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CompareList(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "result": {
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
        return "AssignCompareListToCustomerOutput";
    }

    /**
     * The contents of the customer&#39;s compare list.
     */
    public CompareList getCompareList() {
        return (CompareList) get("compare_list");
    }

    public AssignCompareListToCustomerOutput setCompareList(CompareList arg) {
        optimisticData.put(getKey("compare_list"), arg);
        return this;
    }

    /**
     * Indicates whether the compare list was successfully assigned to the customer.
     */
    public Boolean getResult() {
        return (Boolean) get("result");
    }

    public AssignCompareListToCustomerOutput setResult(Boolean arg) {
        optimisticData.put(getKey("result"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "compare_list":
                return true;

            case "result":
                return false;

            default:
                return false;
        }
    }
}

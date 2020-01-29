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
 * Order mapping fields
 */
public class CustomerOrder extends AbstractResponse<CustomerOrder> {
    public CustomerOrder() {
    }

    public CustomerOrder(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "created_at": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "grand_total": {
                    Double optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsDouble(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "id": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "increment_id": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "order_number": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "status": {
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
        return "CustomerOrder";
    }

    public String getCreatedAt() {
        return (String) get("created_at");
    }

    public CustomerOrder setCreatedAt(String arg) {
        optimisticData.put(getKey("created_at"), arg);
        return this;
    }

    public Double getGrandTotal() {
        return (Double) get("grand_total");
    }

    public CustomerOrder setGrandTotal(Double arg) {
        optimisticData.put(getKey("grand_total"), arg);
        return this;
    }

    public Integer getId() {
        return (Integer) get("id");
    }

    public CustomerOrder setId(Integer arg) {
        optimisticData.put(getKey("id"), arg);
        return this;
    }

    /**
     * @deprecated Use the order_number instead.
     */
    @Deprecated
    public String getIncrementId() {
        return (String) get("increment_id");
    }

    public CustomerOrder setIncrementId(String arg) {
        optimisticData.put(getKey("increment_id"), arg);
        return this;
    }

    /**
     * The order number
     */
    public String getOrderNumber() {
        return (String) get("order_number");
    }

    public CustomerOrder setOrderNumber(String arg) {
        optimisticData.put(getKey("order_number"), arg);
        return this;
    }

    public String getStatus() {
        return (String) get("status");
    }

    public CustomerOrder setStatus(String arg) {
        optimisticData.put(getKey("status"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "created_at": return false;

            case "grand_total": return false;

            case "id": return false;

            case "increment_id": return false;

            case "order_number": return false;

            case "status": return false;

            default: return false;
        }
    }
}


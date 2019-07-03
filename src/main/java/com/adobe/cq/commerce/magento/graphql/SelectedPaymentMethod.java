/*******************************************************************************
 *
 *    Copyright 2019 Adobe. All rights reserved.
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
 * 
 */
public class SelectedPaymentMethod extends AbstractResponse<SelectedPaymentMethod> {
    public SelectedPaymentMethod() {
    }

    public SelectedPaymentMethod(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "code": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "purchase_order_number": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "title": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "__typename": {
                    responseData.put(key, jsonAsString(field.getValue(), key));
                    break;
                }
                default: {
                    throw new SchemaViolationError(this, key, field.getValue());
                }
            }
        }
    }

    public String getGraphQlTypeName() {
        return "SelectedPaymentMethod";
    }

    /**
     * The payment method code
     */

    public String getCode() {
        return (String) get("code");
    }

    public SelectedPaymentMethod setCode(String arg) {
        optimisticData.put(getKey("code"), arg);
        return this;
    }

    /**
     * The purchase order number.
     */

    public String getPurchaseOrderNumber() {
        return (String) get("purchase_order_number");
    }

    public SelectedPaymentMethod setPurchaseOrderNumber(String arg) {
        optimisticData.put(getKey("purchase_order_number"), arg);
        return this;
    }

    /**
     * The payment method title.
     */

    public String getTitle() {
        return (String) get("title");
    }

    public SelectedPaymentMethod setTitle(String arg) {
        optimisticData.put(getKey("title"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "code": return false;

            case "purchase_order_number": return false;

            case "title": return false;

            default: return false;
        }
    }
}


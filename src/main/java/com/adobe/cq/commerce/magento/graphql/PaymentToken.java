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
 * The stored payment method available to the customer
 */
public class PaymentToken extends AbstractResponse<PaymentToken> {
    public PaymentToken() {}

    public PaymentToken(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "details": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "payment_method_code": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "public_hash": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "type": {
                    responseData.put(key, PaymentTokenTypeEnum.fromGraphQl(jsonAsString(field.getValue(), key)));

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
        return "PaymentToken";
    }

    /**
     * Stored account details
     */
    public String getDetails() {
        return (String) get("details");
    }

    public PaymentToken setDetails(String arg) {
        optimisticData.put(getKey("details"), arg);
        return this;
    }

    /**
     * The payment method code associated with the token
     */
    public String getPaymentMethodCode() {
        return (String) get("payment_method_code");
    }

    public PaymentToken setPaymentMethodCode(String arg) {
        optimisticData.put(getKey("payment_method_code"), arg);
        return this;
    }

    /**
     * The public hash of the token
     */
    public String getPublicHash() {
        return (String) get("public_hash");
    }

    public PaymentToken setPublicHash(String arg) {
        optimisticData.put(getKey("public_hash"), arg);
        return this;
    }

    public PaymentTokenTypeEnum getType() {
        return (PaymentTokenTypeEnum) get("type");
    }

    public PaymentToken setType(PaymentTokenTypeEnum arg) {
        optimisticData.put(getKey("type"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "details":
                return false;

            case "payment_method_code":
                return false;

            case "public_hash":
                return false;

            case "type":
                return false;

            default:
                return false;
        }
    }
}

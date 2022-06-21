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
 * Deprecated. Use `PaypalExpressTokenOutput` instead.
 */
public class PaypalExpressToken extends AbstractResponse<PaypalExpressToken> {
    public PaypalExpressToken() {}

    public PaypalExpressToken(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "paypal_urls": {
                    PaypalExpressUrlList optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new PaypalExpressUrlList(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "token": {
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
        return "PaypalExpressToken";
    }

    /**
     * A set of URLs that allow the buyer to authorize payment and adjust checkout details.
     *
     * @deprecated Use `PaypalExpressTokenOutput.paypal_urls` instead.
     */
    @Deprecated
    public PaypalExpressUrlList getPaypalUrls() {
        return (PaypalExpressUrlList) get("paypal_urls");
    }

    public PaypalExpressToken setPaypalUrls(PaypalExpressUrlList arg) {
        optimisticData.put(getKey("paypal_urls"), arg);
        return this;
    }

    /**
     * The token returned by PayPal.
     *
     * @deprecated Use `PaypalExpressTokenOutput.token` instead.
     */
    @Deprecated
    public String getToken() {
        return (String) get("token");
    }

    public PaypalExpressToken setToken(String arg) {
        optimisticData.put(getKey("token"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "paypal_urls":
                return true;

            case "token":
                return false;

            default:
                return false;
        }
    }
}

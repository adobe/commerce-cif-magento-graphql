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
 * Contains the negotiable quote.
 */
public class SetNegotiableQuoteShippingMethodsOutput extends AbstractResponse<SetNegotiableQuoteShippingMethodsOutput> {
    public SetNegotiableQuoteShippingMethodsOutput() {}

    public SetNegotiableQuoteShippingMethodsOutput(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "quote": {
                    NegotiableQuote optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new NegotiableQuote(jsonAsObject(field.getValue(), key));
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
        return "SetNegotiableQuoteShippingMethodsOutput";
    }

    /**
     * The negotiable quote after applying shipping methods.
     */
    public NegotiableQuote getQuote() {
        return (NegotiableQuote) get("quote");
    }

    public SetNegotiableQuoteShippingMethodsOutput setQuote(NegotiableQuote arg) {
        optimisticData.put(getKey("quote"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "quote":
                return true;

            default:
                return false;
        }
    }
}

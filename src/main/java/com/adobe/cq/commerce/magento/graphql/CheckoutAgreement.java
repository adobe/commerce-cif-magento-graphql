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
 * Defines all Checkout Agreement information
 */
public class CheckoutAgreement extends AbstractResponse<CheckoutAgreement> {
    public CheckoutAgreement() {
    }

    public CheckoutAgreement(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "agreement_id": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

                    break;
                }

                case "checkbox_text": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "content": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "content_height": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "is_html": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "mode": {
                    responseData.put(key, CheckoutAgreementMode.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "name": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

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
        return "CheckoutAgreement";
    }

    /**
     * Checkout Agreement identifier
     */
    public Integer getAgreementId() {
        return (Integer) get("agreement_id");
    }

    public CheckoutAgreement setAgreementId(Integer arg) {
        optimisticData.put(getKey("agreement_id"), arg);
        return this;
    }

    /**
     * Checkout Agreement checkbox text
     */
    public String getCheckboxText() {
        return (String) get("checkbox_text");
    }

    public CheckoutAgreement setCheckboxText(String arg) {
        optimisticData.put(getKey("checkbox_text"), arg);
        return this;
    }

    /**
     * Checkout Agreement content
     */
    public String getContent() {
        return (String) get("content");
    }

    public CheckoutAgreement setContent(String arg) {
        optimisticData.put(getKey("content"), arg);
        return this;
    }

    /**
     * Checkout Agreement content height
     */
    public String getContentHeight() {
        return (String) get("content_height");
    }

    public CheckoutAgreement setContentHeight(String arg) {
        optimisticData.put(getKey("content_height"), arg);
        return this;
    }

    /**
     * Is Checkout Agreement content in HTML format
     */
    public Boolean getIsHtml() {
        return (Boolean) get("is_html");
    }

    public CheckoutAgreement setIsHtml(Boolean arg) {
        optimisticData.put(getKey("is_html"), arg);
        return this;
    }

    public CheckoutAgreementMode getMode() {
        return (CheckoutAgreementMode) get("mode");
    }

    public CheckoutAgreement setMode(CheckoutAgreementMode arg) {
        optimisticData.put(getKey("mode"), arg);
        return this;
    }

    /**
     * Checkout Agreement name
     */
    public String getName() {
        return (String) get("name");
    }

    public CheckoutAgreement setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "agreement_id": return false;

            case "checkbox_text": return false;

            case "content": return false;

            case "content_height": return false;

            case "is_html": return false;

            case "mode": return false;

            case "name": return false;

            default: return false;
        }
    }
}

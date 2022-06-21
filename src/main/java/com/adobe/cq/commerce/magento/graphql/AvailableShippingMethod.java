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
 * Contains details about the possible shipping methods and carriers.
 */
public class AvailableShippingMethod extends AbstractResponse<AvailableShippingMethod> {
    public AvailableShippingMethod() {}

    public AvailableShippingMethod(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "amount": {
                    responseData.put(key, new Money(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "available": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "base_amount": {
                    Money optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Money(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "carrier_code": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "carrier_title": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "error_message": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "method_code": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "method_title": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "price_excl_tax": {
                    responseData.put(key, new Money(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "price_incl_tax": {
                    responseData.put(key, new Money(jsonAsObject(field.getValue(), key)));

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
        return "AvailableShippingMethod";
    }

    /**
     * The cost of shipping using this shipping method.
     */
    public Money getAmount() {
        return (Money) get("amount");
    }

    public AvailableShippingMethod setAmount(Money arg) {
        optimisticData.put(getKey("amount"), arg);
        return this;
    }

    /**
     * Indicates whether this shipping method can be applied to the cart.
     */
    public Boolean getAvailable() {
        return (Boolean) get("available");
    }

    public AvailableShippingMethod setAvailable(Boolean arg) {
        optimisticData.put(getKey("available"), arg);
        return this;
    }

    /**
     * @deprecated The field should not be used on the storefront.
     */
    @Deprecated
    public Money getBaseAmount() {
        return (Money) get("base_amount");
    }

    public AvailableShippingMethod setBaseAmount(Money arg) {
        optimisticData.put(getKey("base_amount"), arg);
        return this;
    }

    /**
     * A string that identifies a commercial carrier or an offline shipping method.
     */
    public String getCarrierCode() {
        return (String) get("carrier_code");
    }

    public AvailableShippingMethod setCarrierCode(String arg) {
        optimisticData.put(getKey("carrier_code"), arg);
        return this;
    }

    /**
     * The label for the carrier code.
     */
    public String getCarrierTitle() {
        return (String) get("carrier_title");
    }

    public AvailableShippingMethod setCarrierTitle(String arg) {
        optimisticData.put(getKey("carrier_title"), arg);
        return this;
    }

    /**
     * Describes an error condition.
     */
    public String getErrorMessage() {
        return (String) get("error_message");
    }

    public AvailableShippingMethod setErrorMessage(String arg) {
        optimisticData.put(getKey("error_message"), arg);
        return this;
    }

    /**
     * A shipping method code associated with a carrier. The value could be null if no method is available.
     */
    public String getMethodCode() {
        return (String) get("method_code");
    }

    public AvailableShippingMethod setMethodCode(String arg) {
        optimisticData.put(getKey("method_code"), arg);
        return this;
    }

    /**
     * The label for the shipping method code. The value could be null if no method is available.
     */
    public String getMethodTitle() {
        return (String) get("method_title");
    }

    public AvailableShippingMethod setMethodTitle(String arg) {
        optimisticData.put(getKey("method_title"), arg);
        return this;
    }

    /**
     * The cost of shipping using this shipping method, excluding tax.
     */
    public Money getPriceExclTax() {
        return (Money) get("price_excl_tax");
    }

    public AvailableShippingMethod setPriceExclTax(Money arg) {
        optimisticData.put(getKey("price_excl_tax"), arg);
        return this;
    }

    /**
     * The cost of shipping using this shipping method, including tax.
     */
    public Money getPriceInclTax() {
        return (Money) get("price_incl_tax");
    }

    public AvailableShippingMethod setPriceInclTax(Money arg) {
        optimisticData.put(getKey("price_incl_tax"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "amount":
                return true;

            case "available":
                return false;

            case "base_amount":
                return true;

            case "carrier_code":
                return false;

            case "carrier_title":
                return false;

            case "error_message":
                return false;

            case "method_code":
                return false;

            case "method_title":
                return false;

            case "price_excl_tax":
                return true;

            case "price_incl_tax":
                return true;

            default:
                return false;
        }
    }
}

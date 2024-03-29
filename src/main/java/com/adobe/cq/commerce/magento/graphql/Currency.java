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

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;

public class Currency extends AbstractResponse<Currency> {
    public Currency() {}

    public Currency(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "available_currency_codes": {
                    List<String> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<String> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            String optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = jsonAsString(element1, key);
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "base_currency_code": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "base_currency_symbol": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "default_display_currecy_code": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "default_display_currecy_symbol": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "default_display_currency_code": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "default_display_currency_symbol": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "exchange_rates": {
                    List<ExchangeRate> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<ExchangeRate> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            ExchangeRate optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new ExchangeRate(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
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
        return "Currency";
    }

    /**
     * An array of three-letter currency codes accepted by the store, such as USD and EUR.
     */
    public List<String> getAvailableCurrencyCodes() {
        return (List<String>) get("available_currency_codes");
    }

    public Currency setAvailableCurrencyCodes(List<String> arg) {
        optimisticData.put(getKey("available_currency_codes"), arg);
        return this;
    }

    /**
     * The base currency set for the store, such as USD.
     */
    public String getBaseCurrencyCode() {
        return (String) get("base_currency_code");
    }

    public Currency setBaseCurrencyCode(String arg) {
        optimisticData.put(getKey("base_currency_code"), arg);
        return this;
    }

    /**
     * The symbol for the specified base currency, such as $.
     */
    public String getBaseCurrencySymbol() {
        return (String) get("base_currency_symbol");
    }

    public Currency setBaseCurrencySymbol(String arg) {
        optimisticData.put(getKey("base_currency_symbol"), arg);
        return this;
    }

    /**
     * @deprecated Symbol was missed. Use `default_display_currency_code`.
     */
    @Deprecated
    public String getDefaultDisplayCurrecyCode() {
        return (String) get("default_display_currecy_code");
    }

    public Currency setDefaultDisplayCurrecyCode(String arg) {
        optimisticData.put(getKey("default_display_currecy_code"), arg);
        return this;
    }

    /**
     * @deprecated Symbol was missed. Use `default_display_currency_code`.
     */
    @Deprecated
    public String getDefaultDisplayCurrecySymbol() {
        return (String) get("default_display_currecy_symbol");
    }

    public Currency setDefaultDisplayCurrecySymbol(String arg) {
        optimisticData.put(getKey("default_display_currecy_symbol"), arg);
        return this;
    }

    /**
     * The currency that is displayed by default, such as USD.
     */
    public String getDefaultDisplayCurrencyCode() {
        return (String) get("default_display_currency_code");
    }

    public Currency setDefaultDisplayCurrencyCode(String arg) {
        optimisticData.put(getKey("default_display_currency_code"), arg);
        return this;
    }

    /**
     * The currency symbol that is displayed by default, such as $.
     */
    public String getDefaultDisplayCurrencySymbol() {
        return (String) get("default_display_currency_symbol");
    }

    public Currency setDefaultDisplayCurrencySymbol(String arg) {
        optimisticData.put(getKey("default_display_currency_symbol"), arg);
        return this;
    }

    /**
     * An array of exchange rates for currencies defined in the store.
     */
    public List<ExchangeRate> getExchangeRates() {
        return (List<ExchangeRate>) get("exchange_rates");
    }

    public Currency setExchangeRates(List<ExchangeRate> arg) {
        optimisticData.put(getKey("exchange_rates"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "available_currency_codes":
                return false;

            case "base_currency_code":
                return false;

            case "base_currency_symbol":
                return false;

            case "default_display_currecy_code":
                return false;

            case "default_display_currecy_symbol":
                return false;

            case "default_display_currency_code":
                return false;

            case "default_display_currency_symbol":
                return false;

            case "exchange_rates":
                return true;

            default:
                return false;
        }
    }
}

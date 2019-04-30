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

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;

/**
 * 
 */
public class Country extends AbstractResponse<Country> {
    public Country() {
    }

    public Country(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "available_regions": {
                    List<Region> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<Region> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            Region optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new Region(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "full_name_english": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "full_name_locale": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "id": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "three_letter_abbreviation": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "two_letter_abbreviation": {
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
                    throw new SchemaViolationError(this, key, field.getValue());
                }
            }
        }
    }

    public String getGraphQlTypeName() {
        return "Country";
    }

    public List<Region> getAvailableRegions() {
        return (List<Region>) get("available_regions");
    }

    public Country setAvailableRegions(List<Region> arg) {
        optimisticData.put(getKey("available_regions"), arg);
        return this;
    }

    public String getFullNameEnglish() {
        return (String) get("full_name_english");
    }

    public Country setFullNameEnglish(String arg) {
        optimisticData.put(getKey("full_name_english"), arg);
        return this;
    }

    public String getFullNameLocale() {
        return (String) get("full_name_locale");
    }

    public Country setFullNameLocale(String arg) {
        optimisticData.put(getKey("full_name_locale"), arg);
        return this;
    }

    public String getId() {
        return (String) get("id");
    }

    public Country setId(String arg) {
        optimisticData.put(getKey("id"), arg);
        return this;
    }

    public String getThreeLetterAbbreviation() {
        return (String) get("three_letter_abbreviation");
    }

    public Country setThreeLetterAbbreviation(String arg) {
        optimisticData.put(getKey("three_letter_abbreviation"), arg);
        return this;
    }

    public String getTwoLetterAbbreviation() {
        return (String) get("two_letter_abbreviation");
    }

    public Country setTwoLetterAbbreviation(String arg) {
        optimisticData.put(getKey("two_letter_abbreviation"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "available_regions": return true;

            case "full_name_english": return false;

            case "full_name_locale": return false;

            case "id": return false;

            case "three_letter_abbreviation": return false;

            case "two_letter_abbreviation": return false;

            default: return false;
        }
    }
}


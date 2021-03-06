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

public class Categories extends AbstractResponse<Categories> {
    public Categories() {}

    public Categories(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "asset_urls": {
                    List<Assets> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<Assets> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            Assets optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new Assets(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "identifier": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

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
        return "Categories";
    }

    /**
     * The payment method assets
     */
    public List<Assets> getAssetUrls() {
        return (List<Assets>) get("asset_urls");
    }

    public Categories setAssetUrls(List<Assets> arg) {
        optimisticData.put(getKey("asset_urls"), arg);
        return this;
    }

    /**
     * The payment method identifier
     */
    public String getIdentifier() {
        return (String) get("identifier");
    }

    public Categories setIdentifier(String arg) {
        optimisticData.put(getKey("identifier"), arg);
        return this;
    }

    /**
     * The payment method name
     */
    public String getName() {
        return (String) get("name");
    }

    public Categories setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "asset_urls":
                return true;

            case "identifier":
                return false;

            case "name":
                return false;

            default:
                return false;
        }
    }
}

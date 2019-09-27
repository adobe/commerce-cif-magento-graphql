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
 * The object contains URL rewrite details
 */
public class UrlRewrite extends AbstractResponse<UrlRewrite> {
    public UrlRewrite() {
    }

    public UrlRewrite(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "parameters": {
                    List<HttpQueryParameter> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<HttpQueryParameter> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            HttpQueryParameter optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new HttpQueryParameter(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "url": {
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
        return "UrlRewrite";
    }

    /**
     * Request parameters
     */

    public List<HttpQueryParameter> getParameters() {
        return (List<HttpQueryParameter>) get("parameters");
    }

    public UrlRewrite setParameters(List<HttpQueryParameter> arg) {
        optimisticData.put(getKey("parameters"), arg);
        return this;
    }

    /**
     * Request URL
     */

    public String getUrl() {
        return (String) get("url");
    }

    public UrlRewrite setUrl(String arg) {
        optimisticData.put(getKey("url"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "parameters": return true;

            case "url": return false;

            default: return false;
        }
    }
}


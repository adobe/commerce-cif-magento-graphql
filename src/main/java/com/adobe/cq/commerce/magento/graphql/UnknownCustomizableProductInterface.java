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
 * CustomizableProductInterface contains information about customizable product options.
 */
public class UnknownCustomizableProductInterface extends AbstractResponse<UnknownCustomizableProductInterface> implements CustomizableProductInterface {
    public UnknownCustomizableProductInterface() {
    }

    public UnknownCustomizableProductInterface(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "options": {
                    List<CustomizableOptionInterface> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<CustomizableOptionInterface> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            CustomizableOptionInterface optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = UnknownCustomizableOptionInterface.create(jsonAsObject(element1, key));
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
                    throw new SchemaViolationError(this, key, field.getValue());
                }
            }
        }
    }

    public static CustomizableProductInterface create(JsonObject fields) throws SchemaViolationError {
        String typeName = fields.getAsJsonPrimitive("__typename").getAsString();
        switch (typeName) {
            case "BundleProduct": {
                return new BundleProduct(fields);
            }

            case "ConfigurableProduct": {
                return new ConfigurableProduct(fields);
            }

            case "DownloadableProduct": {
                return new DownloadableProduct(fields);
            }

            case "SimpleProduct": {
                return new SimpleProduct(fields);
            }

            case "VirtualProduct": {
                return new VirtualProduct(fields);
            }

            default: {
                return new UnknownCustomizableProductInterface(fields);
            }
        }
    }

    public String getGraphQlTypeName() {
        return (String) get("__typename");
    }

    /**
     * An array of options for a customizable product
     */

    public List<CustomizableOptionInterface> getOptions() {
        return (List<CustomizableOptionInterface>) get("options");
    }

    public UnknownCustomizableProductInterface setOptions(List<CustomizableOptionInterface> arg) {
        optimisticData.put(getKey("options"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "options": return false;

            default: return false;
        }
    }
}


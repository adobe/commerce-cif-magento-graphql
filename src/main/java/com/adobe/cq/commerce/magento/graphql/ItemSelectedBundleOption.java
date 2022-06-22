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
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;

/**
 * A list of options of the selected bundle product.
 */
public class ItemSelectedBundleOption extends AbstractResponse<ItemSelectedBundleOption> {
    public ItemSelectedBundleOption() {}

    public ItemSelectedBundleOption(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "label": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "uid": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "values": {
                    List<ItemSelectedBundleOptionValue> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<ItemSelectedBundleOptionValue> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            ItemSelectedBundleOptionValue optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new ItemSelectedBundleOptionValue(jsonAsObject(element1, key));
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
        return "ItemSelectedBundleOption";
    }

    /**
     * The unique ID for a `ItemSelectedBundleOption` object.
     *
     * @deprecated Use `uid` instead.
     */
    @Deprecated
    public ID getId() {
        return (ID) get("id");
    }

    public ItemSelectedBundleOption setId(ID arg) {
        optimisticData.put(getKey("id"), arg);
        return this;
    }

    /**
     * The label of the option.
     */
    public String getLabel() {
        return (String) get("label");
    }

    public ItemSelectedBundleOption setLabel(String arg) {
        optimisticData.put(getKey("label"), arg);
        return this;
    }

    /**
     * The unique ID for a `ItemSelectedBundleOption` object.
     */
    public ID getUid() {
        return (ID) get("uid");
    }

    public ItemSelectedBundleOption setUid(ID arg) {
        optimisticData.put(getKey("uid"), arg);
        return this;
    }

    /**
     * A list of products that represent the values of the parent option.
     */
    public List<ItemSelectedBundleOptionValue> getValues() {
        return (List<ItemSelectedBundleOptionValue>) get("values");
    }

    public ItemSelectedBundleOption setValues(List<ItemSelectedBundleOptionValue> arg) {
        optimisticData.put(getKey("values"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "id":
                return false;

            case "label":
                return false;

            case "uid":
                return false;

            case "values":
                return true;

            default:
                return false;
        }
    }
}

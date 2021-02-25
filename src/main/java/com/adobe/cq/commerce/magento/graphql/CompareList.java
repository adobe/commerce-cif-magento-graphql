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

public class CompareList extends AbstractResponse<CompareList> {
    public CompareList() {}

    public CompareList(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "attributes": {
                    List<ComparableAttribute> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<ComparableAttribute> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            ComparableAttribute optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new ComparableAttribute(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "item_count": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

                    break;
                }

                case "items": {
                    List<ComparableItem> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<ComparableItem> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            ComparableItem optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new ComparableItem(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "uid": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

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
        return "CompareList";
    }

    /**
     * An array of attributes that can be used for comparing products
     */
    public List<ComparableAttribute> getAttributes() {
        return (List<ComparableAttribute>) get("attributes");
    }

    public CompareList setAttributes(List<ComparableAttribute> arg) {
        optimisticData.put(getKey("attributes"), arg);
        return this;
    }

    /**
     * The number of items in the compare list
     */
    public Integer getItemCount() {
        return (Integer) get("item_count");
    }

    public CompareList setItemCount(Integer arg) {
        optimisticData.put(getKey("item_count"), arg);
        return this;
    }

    /**
     * An array of products to compare
     */
    public List<ComparableItem> getItems() {
        return (List<ComparableItem>) get("items");
    }

    public CompareList setItems(List<ComparableItem> arg) {
        optimisticData.put(getKey("items"), arg);
        return this;
    }

    /**
     * The unique ID assigned to the compare list
     */
    public ID getUid() {
        return (ID) get("uid");
    }

    public CompareList setUid(ID arg) {
        optimisticData.put(getKey("uid"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "attributes":
                return true;

            case "item_count":
                return false;

            case "items":
                return true;

            case "uid":
                return false;

            default:
                return false;
        }
    }
}

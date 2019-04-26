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

import java.util.Map;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;

/**
 * 
 */
public class LayerFilterItem extends AbstractResponse<LayerFilterItem> implements LayerFilterItemInterface {
    public LayerFilterItem() {
    }

    public LayerFilterItem(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "items_count": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "label": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "value_string": {
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
        return "LayerFilterItem";
    }

    /**
     * Count of items by filter
     */

    public Integer getItemsCount() {
        return (Integer) get("items_count");
    }

    public LayerFilterItem setItemsCount(Integer arg) {
        optimisticData.put(getKey("items_count"), arg);
        return this;
    }

    /**
     * Filter label
     */

    public String getLabel() {
        return (String) get("label");
    }

    public LayerFilterItem setLabel(String arg) {
        optimisticData.put(getKey("label"), arg);
        return this;
    }

    /**
     * Value for filter request variable to be used in query
     */

    public String getValueString() {
        return (String) get("value_string");
    }

    public LayerFilterItem setValueString(String arg) {
        optimisticData.put(getKey("value_string"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "items_count": return false;

            case "label": return false;

            case "value_string": return false;

            default: return false;
        }
    }
}


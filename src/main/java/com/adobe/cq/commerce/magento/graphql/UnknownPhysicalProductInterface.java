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
* PhysicalProductInterface contains attributes specific to tangible products
*/
public class UnknownPhysicalProductInterface extends AbstractResponse<UnknownPhysicalProductInterface> implements PhysicalProductInterface {
    public UnknownPhysicalProductInterface() {
    }

    public UnknownPhysicalProductInterface(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "weight": {
                    Double optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsDouble(field.getValue(), key);
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

    public static PhysicalProductInterface create(JsonObject fields) throws SchemaViolationError {
        String typeName = fields.getAsJsonPrimitive("__typename").getAsString();
        switch (typeName) {
            case "BundleProduct": {
                return new BundleProduct(fields);
            }

            case "ConfigurableProduct": {
                return new ConfigurableProduct(fields);
            }

            case "GroupedProduct": {
                return new GroupedProduct(fields);
            }

            case "SimpleProduct": {
                return new SimpleProduct(fields);
            }

            default: {
                return new UnknownPhysicalProductInterface(fields);
            }
        }
    }

    public String getGraphQlTypeName() {
        return (String) get("__typename");
    }

    /**
    * The weight of the item, in units defined by the store
    */

    public Double getWeight() {
        return (Double) get("weight");
    }

    public UnknownPhysicalProductInterface setWeight(Double arg) {
        optimisticData.put(getKey("weight"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "weight": return false;

            default: return false;
        }
    }
}


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
 * Price range for a product. If the product has a single price, the minimum and maximum price will be
 * the same.
 */
public class PriceRange extends AbstractResponse<PriceRange> {
    public PriceRange() {}

    public PriceRange(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "maximum_price": {
                    ProductPrice optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ProductPrice(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "minimum_price": {
                    responseData.put(key, new ProductPrice(jsonAsObject(field.getValue(), key)));

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
        return "PriceRange";
    }

    /**
     * The highest possible price for the product.
     */
    public ProductPrice getMaximumPrice() {
        return (ProductPrice) get("maximum_price");
    }

    public PriceRange setMaximumPrice(ProductPrice arg) {
        optimisticData.put(getKey("maximum_price"), arg);
        return this;
    }

    /**
     * The lowest possible price for the product.
     */
    public ProductPrice getMinimumPrice() {
        return (ProductPrice) get("minimum_price");
    }

    public PriceRange setMinimumPrice(ProductPrice arg) {
        optimisticData.put(getKey("minimum_price"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "maximum_price":
                return true;

            case "minimum_price":
                return true;

            default:
                return false;
        }
    }
}

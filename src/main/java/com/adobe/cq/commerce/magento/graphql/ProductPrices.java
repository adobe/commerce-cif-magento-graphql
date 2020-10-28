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
 * ProductPrices is deprecated, replaced by PriceRange. The ProductPrices object contains the regular
 * price of an item, as well as its minimum and maximum prices. Only composite products, which include
 * bundle, configurable, and grouped products, can contain a minimum and maximum price.
 */
public class ProductPrices extends AbstractResponse<ProductPrices> {
    public ProductPrices() {}

    public ProductPrices(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "maximalPrice": {
                    Price optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Price(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "minimalPrice": {
                    Price optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Price(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "regularPrice": {
                    Price optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Price(jsonAsObject(field.getValue(), key));
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
        return "ProductPrices";
    }

    /**
     * The highest possible final price for all the options defined within a composite product. If you are
     * specifying a price range, this would be the to value.
     *
     * @deprecated Use PriceRange.maximum_price.
     */
    @Deprecated
    public Price getMaximalPrice() {
        return (Price) get("maximalPrice");
    }

    public ProductPrices setMaximalPrice(Price arg) {
        optimisticData.put(getKey("maximalPrice"), arg);
        return this;
    }

    /**
     * The lowest possible final price for all the options defined within a composite product. If you are
     * specifying a price range, this would be the from value.
     *
     * @deprecated Use PriceRange.minimum_price.
     */
    @Deprecated
    public Price getMinimalPrice() {
        return (Price) get("minimalPrice");
    }

    public ProductPrices setMinimalPrice(Price arg) {
        optimisticData.put(getKey("minimalPrice"), arg);
        return this;
    }

    /**
     * The base price of a product.
     *
     * @deprecated Use regular_price from PriceRange.minimum_price or PriceRange.maximum_price.
     */
    @Deprecated
    public Price getRegularPrice() {
        return (Price) get("regularPrice");
    }

    public ProductPrices setRegularPrice(Price arg) {
        optimisticData.put(getKey("regularPrice"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "maximalPrice":
                return true;

            case "minimalPrice":
                return true;

            case "regularPrice":
                return true;

            default:
                return false;
        }
    }
}

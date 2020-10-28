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
 * A price based on the quantity purchased.
 */
public class TierPrice extends AbstractResponse<TierPrice> {
    public TierPrice() {}

    public TierPrice(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "discount": {
                    ProductDiscount optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ProductDiscount(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "final_price": {
                    Money optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Money(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "quantity": {
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
                    readCustomField(fieldName, field.getValue());
                }
            }
        }
    }

    public String getGraphQlTypeName() {
        return "TierPrice";
    }

    /**
     * The price discount that this tier represents.
     */
    public ProductDiscount getDiscount() {
        return (ProductDiscount) get("discount");
    }

    public TierPrice setDiscount(ProductDiscount arg) {
        optimisticData.put(getKey("discount"), arg);
        return this;
    }

    public Money getFinalPrice() {
        return (Money) get("final_price");
    }

    public TierPrice setFinalPrice(Money arg) {
        optimisticData.put(getKey("final_price"), arg);
        return this;
    }

    /**
     * The minimum number of items that must be purchased to qualify for this price tier.
     */
    public Double getQuantity() {
        return (Double) get("quantity");
    }

    public TierPrice setQuantity(Double arg) {
        optimisticData.put(getKey("quantity"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "discount":
                return true;

            case "final_price":
                return true;

            case "quantity":
                return false;

            default:
                return false;
        }
    }
}

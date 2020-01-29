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

/**
 * Represents a product price.
 */
public class ProductPrice extends AbstractResponse<ProductPrice> {
    public ProductPrice() {
    }

    public ProductPrice(JsonObject fields) throws SchemaViolationError {
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
                    responseData.put(key, new Money(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "fixed_product_taxes": {
                    List<FixedProductTax> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<FixedProductTax> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            FixedProductTax optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new FixedProductTax(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "regular_price": {
                    responseData.put(key, new Money(jsonAsObject(field.getValue(), key)));

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
        return "ProductPrice";
    }

    /**
     * The price discount. Represents the difference between the regular and final price.
     */
    public ProductDiscount getDiscount() {
        return (ProductDiscount) get("discount");
    }

    public ProductPrice setDiscount(ProductDiscount arg) {
        optimisticData.put(getKey("discount"), arg);
        return this;
    }

    /**
     * The final price of the product after discounts applied.
     */
    public Money getFinalPrice() {
        return (Money) get("final_price");
    }

    public ProductPrice setFinalPrice(Money arg) {
        optimisticData.put(getKey("final_price"), arg);
        return this;
    }

    /**
     * The multiple FPTs that can be applied to a product price.
     */
    public List<FixedProductTax> getFixedProductTaxes() {
        return (List<FixedProductTax>) get("fixed_product_taxes");
    }

    public ProductPrice setFixedProductTaxes(List<FixedProductTax> arg) {
        optimisticData.put(getKey("fixed_product_taxes"), arg);
        return this;
    }

    /**
     * The regular price of the product.
     */
    public Money getRegularPrice() {
        return (Money) get("regular_price");
    }

    public ProductPrice setRegularPrice(Money arg) {
        optimisticData.put(getKey("regular_price"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "discount": return true;

            case "final_price": return true;

            case "fixed_product_taxes": return true;

            case "regular_price": return true;

            default: return false;
        }
    }
}


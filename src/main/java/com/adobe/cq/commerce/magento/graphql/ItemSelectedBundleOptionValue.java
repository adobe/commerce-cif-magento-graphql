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
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;

/**
 * A list of values for the selected bundle product.
 */
public class ItemSelectedBundleOptionValue extends AbstractResponse<ItemSelectedBundleOptionValue> {
    public ItemSelectedBundleOptionValue() {}

    public ItemSelectedBundleOptionValue(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "price": {
                    responseData.put(key, new Money(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "product_name": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "product_sku": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "quantity": {
                    responseData.put(key, jsonAsDouble(field.getValue(), key));

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
        return "ItemSelectedBundleOptionValue";
    }

    /**
     * The unique ID for a `ItemSelectedBundleOptionValue` object.
     *
     * @deprecated Use `uid` instead.
     */
    @Deprecated
    public ID getId() {
        return (ID) get("id");
    }

    public ItemSelectedBundleOptionValue setId(ID arg) {
        optimisticData.put(getKey("id"), arg);
        return this;
    }

    /**
     * The price of the child bundle product.
     */
    public Money getPrice() {
        return (Money) get("price");
    }

    public ItemSelectedBundleOptionValue setPrice(Money arg) {
        optimisticData.put(getKey("price"), arg);
        return this;
    }

    /**
     * The name of the child bundle product.
     */
    public String getProductName() {
        return (String) get("product_name");
    }

    public ItemSelectedBundleOptionValue setProductName(String arg) {
        optimisticData.put(getKey("product_name"), arg);
        return this;
    }

    /**
     * The SKU of the child bundle product.
     */
    public String getProductSku() {
        return (String) get("product_sku");
    }

    public ItemSelectedBundleOptionValue setProductSku(String arg) {
        optimisticData.put(getKey("product_sku"), arg);
        return this;
    }

    /**
     * The number of this bundle product that were ordered.
     */
    public Double getQuantity() {
        return (Double) get("quantity");
    }

    public ItemSelectedBundleOptionValue setQuantity(Double arg) {
        optimisticData.put(getKey("quantity"), arg);
        return this;
    }

    /**
     * The unique ID for a `ItemSelectedBundleOptionValue` object.
     */
    public ID getUid() {
        return (ID) get("uid");
    }

    public ItemSelectedBundleOptionValue setUid(ID arg) {
        optimisticData.put(getKey("uid"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "id":
                return false;

            case "price":
                return true;

            case "product_name":
                return false;

            case "product_sku":
                return false;

            case "quantity":
                return false;

            case "uid":
                return false;

            default:
                return false;
        }
    }
}

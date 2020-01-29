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

public class UnknownCartItemInterface extends AbstractResponse<UnknownCartItemInterface> implements CartItemInterface {
    public UnknownCartItemInterface() {
    }

    public UnknownCartItemInterface(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "id": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "prices": {
                    CartItemPrices optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CartItemPrices(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "product": {
                    responseData.put(key, UnknownProductInterface.create(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "quantity": {
                    responseData.put(key, jsonAsDouble(field.getValue(), key));

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

    public static CartItemInterface create(JsonObject fields) throws SchemaViolationError {
        String typeName = fields.getAsJsonPrimitive("__typename").getAsString();
        switch (typeName) {
            case "BundleCartItem": {
                return new BundleCartItem(fields);
            }

            case "ConfigurableCartItem": {
                return new ConfigurableCartItem(fields);
            }

            case "DownloadableCartItem": {
                return new DownloadableCartItem(fields);
            }

            case "SimpleCartItem": {
                return new SimpleCartItem(fields);
            }

            case "VirtualCartItem": {
                return new VirtualCartItem(fields);
            }

            default: {
                return new UnknownCartItemInterface(fields);
            }
        }
    }

    public String getGraphQlTypeName() {
        return (String) get("__typename");
    }

    public String getId() {
        return (String) get("id");
    }

    public UnknownCartItemInterface setId(String arg) {
        optimisticData.put(getKey("id"), arg);
        return this;
    }

    public CartItemPrices getPrices() {
        return (CartItemPrices) get("prices");
    }

    public UnknownCartItemInterface setPrices(CartItemPrices arg) {
        optimisticData.put(getKey("prices"), arg);
        return this;
    }

    public ProductInterface getProduct() {
        return (ProductInterface) get("product");
    }

    public UnknownCartItemInterface setProduct(ProductInterface arg) {
        optimisticData.put(getKey("product"), arg);
        return this;
    }

    public Double getQuantity() {
        return (Double) get("quantity");
    }

    public UnknownCartItemInterface setQuantity(Double arg) {
        optimisticData.put(getKey("quantity"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "id": return false;

            case "prices": return true;

            case "product": return false;

            case "quantity": return false;

            default: return false;
        }
    }
}


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
 * Defines an object used to iterate through items for product comparisons.
 */
public class ComparableItem extends AbstractResponse<ComparableItem> {
    public ComparableItem() {}

    public ComparableItem(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "attributes": {
                    List<ProductAttribute> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        ProductAttribute optional2 = null;
                        if (!element1.isJsonNull()) {
                            optional2 = new ProductAttribute(jsonAsObject(element1, key));
                        }

                        list1.add(optional2);
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "product": {
                    responseData.put(key, UnknownProductInterface.create(jsonAsObject(field.getValue(), key)));

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
        return "ComparableItem";
    }

    /**
     * An array of product attributes that can be used to compare products.
     */
    public List<ProductAttribute> getAttributes() {
        return (List<ProductAttribute>) get("attributes");
    }

    public ComparableItem setAttributes(List<ProductAttribute> arg) {
        optimisticData.put(getKey("attributes"), arg);
        return this;
    }

    /**
     * Details about a product in a compare list.
     */
    public ProductInterface getProduct() {
        return (ProductInterface) get("product");
    }

    public ComparableItem setProduct(ProductInterface arg) {
        optimisticData.put(getKey("product"), arg);
        return this;
    }

    /**
     * The unique ID of an item in a compare list.
     */
    public ID getUid() {
        return (ID) get("uid");
    }

    public ComparableItem setUid(ID arg) {
        optimisticData.put(getKey("uid"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "attributes":
                return true;

            case "product":
                return false;

            case "uid":
                return false;

            default:
                return false;
        }
    }
}

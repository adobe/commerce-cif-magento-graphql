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
 * GroupedProductItem contains information about an individual grouped product item
 */
public class GroupedProductItem extends AbstractResponse<GroupedProductItem> {
    public GroupedProductItem() {
    }

    public GroupedProductItem(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "position": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "product": {
                    ProductInterface optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = UnknownProductInterface.create(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "qty": {
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
        return "GroupedProductItem";
    }

    /**
     * The relative position of this item compared to the other group items
     */

    public Integer getPosition() {
        return (Integer) get("position");
    }

    public GroupedProductItem setPosition(Integer arg) {
        optimisticData.put(getKey("position"), arg);
        return this;
    }

    /**
     * The ProductInterface object, which contains details about this product option
     */

    public ProductInterface getProduct() {
        return (ProductInterface) get("product");
    }

    public GroupedProductItem setProduct(ProductInterface arg) {
        optimisticData.put(getKey("product"), arg);
        return this;
    }

    /**
     * The quantity of this grouped product item
     */

    public Double getQty() {
        return (Double) get("qty");
    }

    public GroupedProductItem setQty(Double arg) {
        optimisticData.put(getKey("qty"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "position": return false;

            case "product": return false;

            case "qty": return false;

            default: return false;
        }
    }
}


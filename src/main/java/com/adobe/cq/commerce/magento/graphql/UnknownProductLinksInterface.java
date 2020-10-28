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
 * ProductLinks contains information about linked products, including the link type and product type of
 * each item.
 */
public class UnknownProductLinksInterface extends AbstractResponse<UnknownProductLinksInterface> implements ProductLinksInterface {
    public UnknownProductLinksInterface() {}

    public UnknownProductLinksInterface(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "link_type": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "linked_product_sku": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "linked_product_type": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "position": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "sku": {
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
                    readCustomField(fieldName, field.getValue());
                }
            }
        }
    }

    public static ProductLinksInterface create(JsonObject fields) throws SchemaViolationError {
        String typeName = fields.getAsJsonPrimitive("__typename").getAsString();
        switch (typeName) {
            case "ProductLinks": {
                return new ProductLinks(fields);
            }

            default: {
                return new UnknownProductLinksInterface(fields);
            }
        }
    }

    public String getGraphQlTypeName() {
        return (String) get("__typename");
    }

    /**
     * One of related, associated, upsell, or crosssell.
     */
    public String getLinkType() {
        return (String) get("link_type");
    }

    public UnknownProductLinksInterface setLinkType(String arg) {
        optimisticData.put(getKey("link_type"), arg);
        return this;
    }

    /**
     * The SKU of the linked product.
     */
    public String getLinkedProductSku() {
        return (String) get("linked_product_sku");
    }

    public UnknownProductLinksInterface setLinkedProductSku(String arg) {
        optimisticData.put(getKey("linked_product_sku"), arg);
        return this;
    }

    /**
     * The type of linked product (simple, virtual, bundle, downloadable, grouped, configurable).
     */
    public String getLinkedProductType() {
        return (String) get("linked_product_type");
    }

    public UnknownProductLinksInterface setLinkedProductType(String arg) {
        optimisticData.put(getKey("linked_product_type"), arg);
        return this;
    }

    /**
     * The position within the list of product links.
     */
    public Integer getPosition() {
        return (Integer) get("position");
    }

    public UnknownProductLinksInterface setPosition(Integer arg) {
        optimisticData.put(getKey("position"), arg);
        return this;
    }

    /**
     * The identifier of the linked product.
     */
    public String getSku() {
        return (String) get("sku");
    }

    public UnknownProductLinksInterface setSku(String arg) {
        optimisticData.put(getKey("sku"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "link_type":
                return false;

            case "linked_product_sku":
                return false;

            case "linked_product_type":
                return false;

            case "position":
                return false;

            case "sku":
                return false;

            default:
                return false;
        }
    }
}

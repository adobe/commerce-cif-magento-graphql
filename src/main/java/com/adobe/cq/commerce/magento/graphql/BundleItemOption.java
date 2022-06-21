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
 * Defines the characteristics that comprise a specific bundle item and its options.
 */
public class BundleItemOption extends AbstractResponse<BundleItemOption> {
    public BundleItemOption() {}

    public BundleItemOption(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "can_change_quantity": {
                    Boolean optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsBoolean(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "id": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "is_default": {
                    Boolean optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsBoolean(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "label": {
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

                case "price": {
                    Double optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsDouble(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "price_type": {
                    PriceTypeEnum optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = PriceTypeEnum.fromGraphQl(jsonAsString(field.getValue(), key));
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

                case "quantity": {
                    Double optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsDouble(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

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
        return "BundleItemOption";
    }

    /**
     * Indicates whether the customer can change the number of items for this option.
     */
    public Boolean getCanChangeQuantity() {
        return (Boolean) get("can_change_quantity");
    }

    public BundleItemOption setCanChangeQuantity(Boolean arg) {
        optimisticData.put(getKey("can_change_quantity"), arg);
        return this;
    }

    /**
     * The ID assigned to the bundled item option.
     *
     * @deprecated Use `uid` instead
     */
    @Deprecated
    public Integer getId() {
        return (Integer) get("id");
    }

    public BundleItemOption setId(Integer arg) {
        optimisticData.put(getKey("id"), arg);
        return this;
    }

    /**
     * Indicates whether this option is the default option.
     */
    public Boolean getIsDefault() {
        return (Boolean) get("is_default");
    }

    public BundleItemOption setIsDefault(Boolean arg) {
        optimisticData.put(getKey("is_default"), arg);
        return this;
    }

    /**
     * The text that identifies the bundled item option.
     */
    public String getLabel() {
        return (String) get("label");
    }

    public BundleItemOption setLabel(String arg) {
        optimisticData.put(getKey("label"), arg);
        return this;
    }

    /**
     * When a bundle item contains multiple options, the relative position of this option compared to the
     * other options.
     */
    public Integer getPosition() {
        return (Integer) get("position");
    }

    public BundleItemOption setPosition(Integer arg) {
        optimisticData.put(getKey("position"), arg);
        return this;
    }

    /**
     * The price of the selected option.
     */
    public Double getPrice() {
        return (Double) get("price");
    }

    public BundleItemOption setPrice(Double arg) {
        optimisticData.put(getKey("price"), arg);
        return this;
    }

    /**
     * One of FIXED, PERCENT, or DYNAMIC.
     */
    public PriceTypeEnum getPriceType() {
        return (PriceTypeEnum) get("price_type");
    }

    public BundleItemOption setPriceType(PriceTypeEnum arg) {
        optimisticData.put(getKey("price_type"), arg);
        return this;
    }

    /**
     * Contains details about this product option.
     */
    public ProductInterface getProduct() {
        return (ProductInterface) get("product");
    }

    public BundleItemOption setProduct(ProductInterface arg) {
        optimisticData.put(getKey("product"), arg);
        return this;
    }

    /**
     * Indicates the quantity of this specific bundle item.
     *
     * @deprecated Use `quantity` instead.
     */
    @Deprecated
    public Double getQty() {
        return (Double) get("qty");
    }

    public BundleItemOption setQty(Double arg) {
        optimisticData.put(getKey("qty"), arg);
        return this;
    }

    /**
     * The quantity of this specific bundle item.
     */
    public Double getQuantity() {
        return (Double) get("quantity");
    }

    public BundleItemOption setQuantity(Double arg) {
        optimisticData.put(getKey("quantity"), arg);
        return this;
    }

    /**
     * The unique ID for a `BundleItemOption` object.
     */
    public ID getUid() {
        return (ID) get("uid");
    }

    public BundleItemOption setUid(ID arg) {
        optimisticData.put(getKey("uid"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "can_change_quantity":
                return false;

            case "id":
                return false;

            case "is_default":
                return false;

            case "label":
                return false;

            case "position":
                return false;

            case "price":
                return false;

            case "price_type":
                return false;

            case "product":
                return false;

            case "qty":
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

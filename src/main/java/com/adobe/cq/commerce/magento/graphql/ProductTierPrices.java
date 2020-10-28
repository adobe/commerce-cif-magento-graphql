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
 * ProductTierPrices is deprecated and has been replaced by TierPrice. The ProductTierPrices object
 * defines a tier price, which is a quantity discount offered to a specific customer group.
 */
public class ProductTierPrices extends AbstractResponse<ProductTierPrices> {
    public ProductTierPrices() {}

    public ProductTierPrices(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "customer_group_id": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "percentage_value": {
                    Double optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsDouble(field.getValue(), key);
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

                case "value": {
                    Double optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsDouble(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "website_id": {
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
        return "ProductTierPrices";
    }

    /**
     * The ID of the customer group.
     *
     * @deprecated customer_group_id is not relevant for storefront.
     */
    @Deprecated
    public String getCustomerGroupId() {
        return (String) get("customer_group_id");
    }

    public ProductTierPrices setCustomerGroupId(String arg) {
        optimisticData.put(getKey("customer_group_id"), arg);
        return this;
    }

    /**
     * The percentage discount of the item.
     *
     * @deprecated ProductTierPrices is deprecated. Use TierPrice.discount.
     */
    @Deprecated
    public Double getPercentageValue() {
        return (Double) get("percentage_value");
    }

    public ProductTierPrices setPercentageValue(Double arg) {
        optimisticData.put(getKey("percentage_value"), arg);
        return this;
    }

    /**
     * The number of items that must be purchased to qualify for tier pricing.
     *
     * @deprecated ProductTierPrices is deprecated, use TierPrice.quantity.
     */
    @Deprecated
    public Double getQty() {
        return (Double) get("qty");
    }

    public ProductTierPrices setQty(Double arg) {
        optimisticData.put(getKey("qty"), arg);
        return this;
    }

    /**
     * The price of the fixed price item.
     *
     * @deprecated ProductTierPrices is deprecated. Use TierPrice.final_price
     */
    @Deprecated
    public Double getValue() {
        return (Double) get("value");
    }

    public ProductTierPrices setValue(Double arg) {
        optimisticData.put(getKey("value"), arg);
        return this;
    }

    /**
     * The ID assigned to the website.
     *
     * @deprecated website_id is not relevant for storefront.
     */
    @Deprecated
    public Double getWebsiteId() {
        return (Double) get("website_id");
    }

    public ProductTierPrices setWebsiteId(Double arg) {
        optimisticData.put(getKey("website_id"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "customer_group_id":
                return false;

            case "percentage_value":
                return false;

            case "qty":
                return false;

            case "value":
                return false;

            case "website_id":
                return false;

            default:
                return false;
        }
    }
}

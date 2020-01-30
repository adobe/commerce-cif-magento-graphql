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
 * PriceAdjustment is deprecated. Taxes will be included or excluded in the price. The PricedAdjustment
 * object defines the amount of money to apply as an adjustment, the type of adjustment to apply, and
 * whether the item is included or excluded from the adjustment.
 */
public class PriceAdjustment extends AbstractResponse<PriceAdjustment> {
    public PriceAdjustment() {
    }

    public PriceAdjustment(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "amount": {
                    Money optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Money(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "code": {
                    PriceAdjustmentCodesEnum optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = PriceAdjustmentCodesEnum.fromGraphQl(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "description": {
                    PriceAdjustmentDescriptionEnum optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = PriceAdjustmentDescriptionEnum.fromGraphQl(jsonAsString(field.getValue(), key));
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
        return "PriceAdjustment";
    }

    /**
     * The amount of the price adjustment and its currency code.
     */
    public Money getAmount() {
        return (Money) get("amount");
    }

    public PriceAdjustment setAmount(Money arg) {
        optimisticData.put(getKey("amount"), arg);
        return this;
    }

    /**
     * Indicates whether the adjustment involves tax, weee, or weee_tax.
     *
     * @deprecated PriceAdjustment is deprecated.
     */
    @Deprecated
    public PriceAdjustmentCodesEnum getCode() {
        return (PriceAdjustmentCodesEnum) get("code");
    }

    public PriceAdjustment setCode(PriceAdjustmentCodesEnum arg) {
        optimisticData.put(getKey("code"), arg);
        return this;
    }

    /**
     * Indicates whether the entity described by the code attribute is included or excluded from the
     * adjustment.
     *
     * @deprecated PriceAdjustment is deprecated.
     */
    @Deprecated
    public PriceAdjustmentDescriptionEnum getDescription() {
        return (PriceAdjustmentDescriptionEnum) get("description");
    }

    public PriceAdjustment setDescription(PriceAdjustmentDescriptionEnum arg) {
        optimisticData.put(getKey("description"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "amount": return true;

            case "code": return false;

            case "description": return false;

            default: return false;
        }
    }
}


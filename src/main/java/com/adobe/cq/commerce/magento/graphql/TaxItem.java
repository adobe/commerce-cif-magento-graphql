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
 * Contains tax item details.
 */
public class TaxItem extends AbstractResponse<TaxItem> {
    public TaxItem() {}

    public TaxItem(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "amount": {
                    responseData.put(key, new Money(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "rate": {
                    responseData.put(key, jsonAsDouble(field.getValue(), key));

                    break;
                }

                case "title": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

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
        return "TaxItem";
    }

    /**
     * The amount of tax applied to the item.
     */
    public Money getAmount() {
        return (Money) get("amount");
    }

    public TaxItem setAmount(Money arg) {
        optimisticData.put(getKey("amount"), arg);
        return this;
    }

    /**
     * The rate used to calculate the tax.
     */
    public Double getRate() {
        return (Double) get("rate");
    }

    public TaxItem setRate(Double arg) {
        optimisticData.put(getKey("rate"), arg);
        return this;
    }

    /**
     * A title that describes the tax.
     */
    public String getTitle() {
        return (String) get("title");
    }

    public TaxItem setTitle(String arg) {
        optimisticData.put(getKey("title"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "amount":
                return true;

            case "rate":
                return false;

            case "title":
                return false;

            default:
                return false;
        }
    }
}

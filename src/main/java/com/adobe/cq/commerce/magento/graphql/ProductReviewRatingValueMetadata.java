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
 * Contains details about a single value in a product review.
 */
public class ProductReviewRatingValueMetadata extends AbstractResponse<ProductReviewRatingValueMetadata> {
    public ProductReviewRatingValueMetadata() {}

    public ProductReviewRatingValueMetadata(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "value": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "value_id": {
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
        return "ProductReviewRatingValueMetadata";
    }

    /**
     * A ratings scale, such as the number of stars awarded.
     */
    public String getValue() {
        return (String) get("value");
    }

    public ProductReviewRatingValueMetadata setValue(String arg) {
        optimisticData.put(getKey("value"), arg);
        return this;
    }

    /**
     * An encoded rating value ID.
     */
    public String getValueId() {
        return (String) get("value_id");
    }

    public ProductReviewRatingValueMetadata setValueId(String arg) {
        optimisticData.put(getKey("value_id"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "value":
                return false;

            case "value_id":
                return false;

            default:
                return false;
        }
    }
}

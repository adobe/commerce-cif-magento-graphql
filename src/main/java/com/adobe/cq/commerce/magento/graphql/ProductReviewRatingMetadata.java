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

public class ProductReviewRatingMetadata extends AbstractResponse<ProductReviewRatingMetadata> {
    public ProductReviewRatingMetadata() {}

    public ProductReviewRatingMetadata(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "id": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "name": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "values": {
                    List<ProductReviewRatingValueMetadata> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        ProductReviewRatingValueMetadata optional2 = null;
                        if (!element1.isJsonNull()) {
                            optional2 = new ProductReviewRatingValueMetadata(jsonAsObject(element1, key));
                        }

                        list1.add(optional2);
                    }

                    responseData.put(key, list1);

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
        return "ProductReviewRatingMetadata";
    }

    /**
     * An encoded rating ID.
     */
    public String getId() {
        return (String) get("id");
    }

    public ProductReviewRatingMetadata setId(String arg) {
        optimisticData.put(getKey("id"), arg);
        return this;
    }

    /**
     * The label assigned to an aspect of a product that is being rated, such as quality or price
     */
    public String getName() {
        return (String) get("name");
    }

    public ProductReviewRatingMetadata setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    /**
     * List of product review ratings sorted by position.
     */
    public List<ProductReviewRatingValueMetadata> getValues() {
        return (List<ProductReviewRatingValueMetadata>) get("values");
    }

    public ProductReviewRatingMetadata setValues(List<ProductReviewRatingValueMetadata> arg) {
        optimisticData.put(getKey("values"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "id":
                return false;

            case "name":
                return false;

            case "values":
                return true;

            default:
                return false;
        }
    }
}

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
import com.shopify.graphql.support.SchemaViolationError;

/**
 * Details of a product review
 */
public class ProductReview extends AbstractResponse<ProductReview> {
    public ProductReview() {
    }

    public ProductReview(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "average_rating": {
                    responseData.put(key, jsonAsDouble(field.getValue(), key));

                    break;
                }

                case "created_at": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "nickname": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "product": {
                    responseData.put(key, UnknownProductInterface.create(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "ratings_breakdown": {
                    List<ProductReviewRating> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        ProductReviewRating optional2 = null;
                        if (!element1.isJsonNull()) {
                            optional2 = new ProductReviewRating(jsonAsObject(element1, key));
                        }

                        list1.add(optional2);
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "summary": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "text": {
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
        return "ProductReview";
    }

    /**
     * The average rating for product review.
     */
    public Double getAverageRating() {
        return (Double) get("average_rating");
    }

    public ProductReview setAverageRating(Double arg) {
        optimisticData.put(getKey("average_rating"), arg);
        return this;
    }

    /**
     * Date indicating when the review was created.
     */
    public String getCreatedAt() {
        return (String) get("created_at");
    }

    public ProductReview setCreatedAt(String arg) {
        optimisticData.put(getKey("created_at"), arg);
        return this;
    }

    /**
     * The customer&#39;s nickname. Defaults to the customer name, if logged in
     */
    public String getNickname() {
        return (String) get("nickname");
    }

    public ProductReview setNickname(String arg) {
        optimisticData.put(getKey("nickname"), arg);
        return this;
    }

    /**
     * Contains details about the reviewed product
     */
    public ProductInterface getProduct() {
        return (ProductInterface) get("product");
    }

    public ProductReview setProduct(ProductInterface arg) {
        optimisticData.put(getKey("product"), arg);
        return this;
    }

    /**
     * An array of ratings by rating category, such as quality, price, and value
     */
    public List<ProductReviewRating> getRatingsBreakdown() {
        return (List<ProductReviewRating>) get("ratings_breakdown");
    }

    public ProductReview setRatingsBreakdown(List<ProductReviewRating> arg) {
        optimisticData.put(getKey("ratings_breakdown"), arg);
        return this;
    }

    /**
     * The summary (title) of the review
     */
    public String getSummary() {
        return (String) get("summary");
    }

    public ProductReview setSummary(String arg) {
        optimisticData.put(getKey("summary"), arg);
        return this;
    }

    /**
     * The review text.
     */
    public String getText() {
        return (String) get("text");
    }

    public ProductReview setText(String arg) {
        optimisticData.put(getKey("text"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "average_rating": return false;

            case "created_at": return false;

            case "nickname": return false;

            case "product": return false;

            case "ratings_breakdown": return true;

            case "summary": return false;

            case "text": return false;

            default: return false;
        }
    }
}

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

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.shopify.graphql.support.AbstractQuery;
import com.shopify.graphql.support.Input;

/**
 * Defines a new product review.
 */
public class CreateProductReviewInput implements Serializable {
    private String nickname;

    private List<ProductReviewRatingInput> ratings;

    private String sku;

    private String summary;

    private String text;

    private Map<String, Input<Serializable>> customFilters = new HashMap<>();

    public CreateProductReviewInput(String nickname, List<ProductReviewRatingInput> ratings, String sku, String summary, String text) {
        this.nickname = nickname;

        this.ratings = ratings;

        this.sku = sku;

        this.summary = summary;

        this.text = text;
    }

    /**
     * The customer&#39;s nickname. Defaults to the customer name, if logged in.
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * The customer&#39;s nickname. Defaults to the customer name, if logged in.
     */
    public CreateProductReviewInput setNickname(String nickname) {
        this.nickname = nickname;
        return this;
    }

    /**
     * The ratings details by category. For example, Price: 5 stars, Quality: 4 stars, etc.
     */
    public List<ProductReviewRatingInput> getRatings() {
        return ratings;
    }

    /**
     * The ratings details by category. For example, Price: 5 stars, Quality: 4 stars, etc.
     */
    public CreateProductReviewInput setRatings(List<ProductReviewRatingInput> ratings) {
        this.ratings = ratings;
        return this;
    }

    /**
     * The SKU of the reviewed product.
     */
    public String getSku() {
        return sku;
    }

    /**
     * The SKU of the reviewed product.
     */
    public CreateProductReviewInput setSku(String sku) {
        this.sku = sku;
        return this;
    }

    /**
     * The summary (title) of the review.
     */
    public String getSummary() {
        return summary;
    }

    /**
     * The summary (title) of the review.
     */
    public CreateProductReviewInput setSummary(String summary) {
        this.summary = summary;
        return this;
    }

    /**
     * The review text.
     */
    public String getText() {
        return text;
    }

    /**
     * The review text.
     */
    public CreateProductReviewInput setText(String text) {
        this.text = text;
        return this;
    }

    /**
     * Set custom filter.
     */
    public CreateProductReviewInput setCustomFilter(String name, Serializable filterInput) {
        this.customFilters.put(name, Input.optional(filterInput));
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (!this.customFilters.isEmpty()) {
            for (Map.Entry<String, Input<Serializable>> entry : customFilters.entrySet()) {
                _queryBuilder.append(separator);
                separator = ",";
                _queryBuilder.append(entry.getKey() + ":");

                Serializable filter = entry.getValue().getValue();

                if (filter != null) {
                    try {
                        Method appendTo = filter.getClass().getMethod("appendTo", StringBuilder.class);
                        appendTo.invoke(filter, _queryBuilder);
                    } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
                        _queryBuilder.append("null");
                    }
                } else {
                    _queryBuilder.append("null");
                }
            }
        }

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("nickname:");
        AbstractQuery.appendQuotedString(_queryBuilder, nickname.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("ratings:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (ProductReviewRatingInput item1 : ratings) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                item1.appendTo(_queryBuilder);
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("sku:");
        AbstractQuery.appendQuotedString(_queryBuilder, sku.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("summary:");
        AbstractQuery.appendQuotedString(_queryBuilder, summary.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("text:");
        AbstractQuery.appendQuotedString(_queryBuilder, text.toString());

        _queryBuilder.append('}');
    }
}

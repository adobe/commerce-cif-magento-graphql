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

import com.shopify.graphql.support.AbstractQuery;
import com.shopify.graphql.support.Fragment;

/**
 * Contains details of a product review.
 */
public class ProductReviewQuery extends AbstractQuery<ProductReviewQuery> {
    ProductReviewQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
     * The average of all ratings for this product.
     */
    public ProductReviewQuery averageRating() {
        startField("average_rating");

        return this;
    }

    /**
     * The date the review was created.
     */
    public ProductReviewQuery createdAt() {
        startField("created_at");

        return this;
    }

    /**
     * The customer&#39;s nickname. Defaults to the customer name, if logged in.
     */
    public ProductReviewQuery nickname() {
        startField("nickname");

        return this;
    }

    /**
     * The reviewed product.
     */
    public ProductReviewQuery product(ProductInterfaceQueryDefinition queryDef) {
        startField("product");

        _queryBuilder.append('{');
        queryDef.define(new ProductInterfaceQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * An array of ratings by rating category, such as quality, price, and value.
     */
    public ProductReviewQuery ratingsBreakdown(ProductReviewRatingQueryDefinition queryDef) {
        startField("ratings_breakdown");

        _queryBuilder.append('{');
        queryDef.define(new ProductReviewRatingQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The summary (title) of the review.
     */
    public ProductReviewQuery summary() {
        startField("summary");

        return this;
    }

    /**
     * The review text.
     */
    public ProductReviewQuery text() {
        startField("text");

        return this;
    }

    /**
     * Creates a GraphQL "named" fragment with the specified query type definition.
     * The generics nature of fragments ensures that a fragment can only be used at the right place in the GraphQL request.
     * 
     * @param name The name of the fragment, must be unique for a given GraphQL request.
     * @param queryDef The fragment definition.
     * @return The fragment of a given generics type.
     */
    public static Fragment<ProductReviewQuery> createFragment(String name, ProductReviewQueryDefinition queryDef) {
        StringBuilder sb = new StringBuilder();
        queryDef.define(new ProductReviewQuery(sb));
        return new Fragment<>(name, "ProductReview", sb.toString());
    }

    /**
     * Adds a <code>ProductReviewQuery</code> fragment reference at the current position of the query.
     * For example for a fragment named <code>test</code>, calling this method will add the
     * reference <code>...test</code> in the query. For GraphQL types implementing an interface, there
     * will be some similar methods using the Query type of each implemented interface.
     * 
     * @param fragment The fragment to reference.
     */
    public ProductReviewQuery addFragmentReference(Fragment<ProductReviewQuery> fragment) {
        startField("..." + fragment.getName());
        return this;
    }
}

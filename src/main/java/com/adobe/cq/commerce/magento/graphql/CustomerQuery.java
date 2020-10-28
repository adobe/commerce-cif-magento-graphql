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
import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Fragment;
import com.shopify.graphql.support.ID;

/**
 * Customer defines the customer name and address and other details
 */
public class CustomerQuery extends AbstractQuery<CustomerQuery> {
    CustomerQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
     * An array containing the customer&#39;s shipping and billing addresses
     */
    public CustomerQuery addresses(CustomerAddressQueryDefinition queryDef) {
        startField("addresses");

        _queryBuilder.append('{');
        queryDef.define(new CustomerAddressQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Timestamp indicating when the account was created
     */
    public CustomerQuery createdAt() {
        startField("created_at");

        return this;
    }

    /**
     * The customer&#39;s date of birth
     */
    public CustomerQuery dateOfBirth() {
        startField("date_of_birth");

        return this;
    }

    /**
     * The ID assigned to the billing address
     */
    public CustomerQuery defaultBilling() {
        startField("default_billing");

        return this;
    }

    /**
     * The ID assigned to the shipping address
     */
    public CustomerQuery defaultShipping() {
        startField("default_shipping");

        return this;
    }

    /**
     * The customer&#39;s date of birth
     *
     * @deprecated Use `date_of_birth` instead
     */
    @Deprecated
    public CustomerQuery dob() {
        startField("dob");

        return this;
    }

    /**
     * The customer&#39;s email address. Required
     */
    public CustomerQuery email() {
        startField("email");

        return this;
    }

    /**
     * The customer&#39;s first name
     */
    public CustomerQuery firstname() {
        startField("firstname");

        return this;
    }

    /**
     * The customer&#39;s gender (Male - 1, Female - 2)
     */
    public CustomerQuery gender() {
        startField("gender");

        return this;
    }

    /**
     * @deprecated Customer group should not be exposed in the storefront scenarios
     */
    @Deprecated
    public CustomerQuery groupId() {
        startField("group_id");

        return this;
    }

    /**
     * The ID assigned to the customer
     *
     * @deprecated id is not needed as part of Customer because on server side it can be identified based on customer token used for authentication. There is no need to know customer ID on the client side.
     */
    @Deprecated
    public CustomerQuery id() {
        startField("id");

        return this;
    }

    /**
     * Indicates whether the customer is subscribed to the company&#39;s newsletter
     */
    public CustomerQuery isSubscribed() {
        startField("is_subscribed");

        return this;
    }

    /**
     * The customer&#39;s family name
     */
    public CustomerQuery lastname() {
        startField("lastname");

        return this;
    }

    /**
     * The customer&#39;s middle name
     */
    public CustomerQuery middlename() {
        startField("middlename");

        return this;
    }

    public class OrdersArguments extends Arguments {
        OrdersArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
         * Defines the filter to use for searching customer orders
         */
        public OrdersArguments filter(CustomerOrdersFilterInput value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
         * Specifies which page of results to return. The default value is 1
         */
        public OrdersArguments currentPage(Integer value) {
            if (value != null) {
                startArgument("currentPage");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
         * Specifies the maximum number of results to return at once. The default value is 20
         */
        public OrdersArguments pageSize(Integer value) {
            if (value != null) {
                startArgument("pageSize");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface OrdersArgumentsDefinition {
        void define(OrdersArguments args);
    }

    public CustomerQuery orders(CustomerOrdersQueryDefinition queryDef) {
        return orders(args -> {}, queryDef);
    }

    public CustomerQuery orders(OrdersArgumentsDefinition argsDef, CustomerOrdersQueryDefinition queryDef) {
        startField("orders");

        OrdersArguments args = new OrdersArguments(_queryBuilder);
        argsDef.define(args);
        OrdersArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new CustomerOrdersQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * An honorific, such as Dr., Mr., or Mrs.
     */
    public CustomerQuery prefix() {
        startField("prefix");

        return this;
    }

    public class ReviewsArguments extends Arguments {
        ReviewsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
         * Specifies the maximum number of results to return at once.
         */
        public ReviewsArguments pageSize(Integer value) {
            if (value != null) {
                startArgument("pageSize");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
         * Specifies which page of results to return.
         */
        public ReviewsArguments currentPage(Integer value) {
            if (value != null) {
                startArgument("currentPage");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface ReviewsArgumentsDefinition {
        void define(ReviewsArguments args);
    }

    /**
     * Contains the customer&#39;s product reviews
     */
    public CustomerQuery reviews(ProductReviewsQueryDefinition queryDef) {
        return reviews(args -> {}, queryDef);
    }

    /**
     * Contains the customer&#39;s product reviews
     */
    public CustomerQuery reviews(ReviewsArgumentsDefinition argsDef, ProductReviewsQueryDefinition queryDef) {
        startField("reviews");

        ReviewsArguments args = new ReviewsArguments(_queryBuilder);
        argsDef.define(args);
        ReviewsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ProductReviewsQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Customer reward points details
     */
    public CustomerQuery rewardPoints(RewardPointsQueryDefinition queryDef) {
        startField("reward_points");

        _queryBuilder.append('{');
        queryDef.define(new RewardPointsQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Contains the store credit information applied for the logged in customer
     */
    public CustomerQuery storeCredit(CustomerStoreCreditQueryDefinition queryDef) {
        startField("store_credit");

        _queryBuilder.append('{');
        queryDef.define(new CustomerStoreCreditQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * A value such as Sr., Jr., or III
     */
    public CustomerQuery suffix() {
        startField("suffix");

        return this;
    }

    /**
     * The customer&#39;s Value-added tax (VAT) number (for corporate customers)
     */
    public CustomerQuery taxvat() {
        startField("taxvat");

        return this;
    }

    /**
     * Contains the contents of a customer&#39;s wish lists
     */
    public CustomerQuery wishlist(WishlistQueryDefinition queryDef) {
        startField("wishlist");

        _queryBuilder.append('{');
        queryDef.define(new WishlistQuery(_queryBuilder));
        _queryBuilder.append('}');

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
    public static Fragment<CustomerQuery> createFragment(String name, CustomerQueryDefinition queryDef) {
        StringBuilder sb = new StringBuilder();
        queryDef.define(new CustomerQuery(sb));
        return new Fragment<>(name, "Customer", sb.toString());
    }

    /**
     * Adds a <code>CustomerQuery</code> fragment reference at the current position of the query.
     * For example for a fragment named <code>test</code>, calling this method will add the
     * reference <code>...test</code> in the query. For GraphQL types implementing an interface, there
     * will be some similar methods using the Query type of each implemented interface.
     * 
     * @param fragment The fragment to reference.
     */
    public CustomerQuery addFragmentReference(Fragment<CustomerQuery> fragment) {
        startField("..." + fragment.getName());
        return this;
    }
}

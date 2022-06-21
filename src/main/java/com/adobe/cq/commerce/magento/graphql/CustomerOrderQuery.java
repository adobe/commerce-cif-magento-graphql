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

/**
 * Contains details about each of the customer&#39;s orders.
 */
public class CustomerOrderQuery extends AbstractQuery<CustomerOrderQuery> {
    CustomerOrderQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
     * The billing address for the order.
     */
    public CustomerOrderQuery billingAddress(OrderAddressQueryDefinition queryDef) {
        startField("billing_address");

        _queryBuilder.append('{');
        queryDef.define(new OrderAddressQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The shipping carrier for the order delivery.
     */
    public CustomerOrderQuery carrier() {
        startField("carrier");

        return this;
    }

    /**
     * Comments about the order.
     */
    public CustomerOrderQuery comments(SalesCommentItemQueryDefinition queryDef) {
        startField("comments");

        _queryBuilder.append('{');
        queryDef.define(new SalesCommentItemQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * @deprecated Use the `order_date` field instead.
     */
    @Deprecated
    public CustomerOrderQuery createdAt() {
        startField("created_at");

        return this;
    }

    /**
     * A list of credit memos.
     */
    public CustomerOrderQuery creditMemos(CreditMemoQueryDefinition queryDef) {
        startField("credit_memos");

        _queryBuilder.append('{');
        queryDef.define(new CreditMemoQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The entered gift message for the order
     */
    public CustomerOrderQuery giftMessage(GiftMessageQueryDefinition queryDef) {
        startField("gift_message");

        _queryBuilder.append('{');
        queryDef.define(new GiftMessageQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Indicates whether the customer requested a gift receipt for the order.
     */
    public CustomerOrderQuery giftReceiptIncluded() {
        startField("gift_receipt_included");

        return this;
    }

    /**
     * The selected gift wrapping for the order.
     */
    public CustomerOrderQuery giftWrapping(GiftWrappingQueryDefinition queryDef) {
        startField("gift_wrapping");

        _queryBuilder.append('{');
        queryDef.define(new GiftWrappingQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * @deprecated Use the `totals.grand_total` field instead.
     */
    @Deprecated
    public CustomerOrderQuery grandTotal() {
        startField("grand_total");

        return this;
    }

    /**
     * The unique ID for a `CustomerOrder` object.
     */
    public CustomerOrderQuery id() {
        startField("id");

        return this;
    }

    /**
     * @deprecated Use the `id` field instead.
     */
    @Deprecated
    public CustomerOrderQuery incrementId() {
        startField("increment_id");

        return this;
    }

    /**
     * A list of invoices for the order.
     */
    public CustomerOrderQuery invoices(InvoiceQueryDefinition queryDef) {
        startField("invoices");

        _queryBuilder.append('{');
        queryDef.define(new InvoiceQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * An array containing the items purchased in this order.
     */
    public CustomerOrderQuery items(OrderItemInterfaceQueryDefinition queryDef) {
        startField("items");

        _queryBuilder.append('{');
        queryDef.define(new OrderItemInterfaceQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * A list of order items eligible to be in a return request.
     */
    public CustomerOrderQuery itemsEligibleForReturn(OrderItemInterfaceQueryDefinition queryDef) {
        startField("items_eligible_for_return");

        _queryBuilder.append('{');
        queryDef.define(new OrderItemInterfaceQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The order number.
     */
    public CustomerOrderQuery number() {
        startField("number");

        return this;
    }

    /**
     * The date the order was placed.
     */
    public CustomerOrderQuery orderDate() {
        startField("order_date");

        return this;
    }

    /**
     * @deprecated Use the `number` field instead.
     */
    @Deprecated
    public CustomerOrderQuery orderNumber() {
        startField("order_number");

        return this;
    }

    /**
     * Payment details for the order.
     */
    public CustomerOrderQuery paymentMethods(OrderPaymentMethodQueryDefinition queryDef) {
        startField("payment_methods");

        _queryBuilder.append('{');
        queryDef.define(new OrderPaymentMethodQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Indicates whether the customer requested a printed card for the order.
     */
    public CustomerOrderQuery printedCardIncluded() {
        startField("printed_card_included");

        return this;
    }

    public class ReturnsArguments extends Arguments {
        ReturnsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
         * The maximum number of results to return at once. The default is 20.
         */
        public ReturnsArguments pageSize(Integer value) {
            if (value != null) {
                startArgument("pageSize");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
         * The page of results to return. The default is 1.
         */
        public ReturnsArguments currentPage(Integer value) {
            if (value != null) {
                startArgument("currentPage");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface ReturnsArgumentsDefinition {
        void define(ReturnsArguments args);
    }

    /**
     * Return requests associated with this order.
     */
    public CustomerOrderQuery returns(ReturnsQueryDefinition queryDef) {
        return returns(args -> {}, queryDef);
    }

    /**
     * Return requests associated with this order.
     */
    public CustomerOrderQuery returns(ReturnsArgumentsDefinition argsDef, ReturnsQueryDefinition queryDef) {
        startField("returns");

        ReturnsArguments args = new ReturnsArguments(_queryBuilder);
        argsDef.define(args);
        ReturnsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ReturnsQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * A list of shipments for the order.
     */
    public CustomerOrderQuery shipments(OrderShipmentQueryDefinition queryDef) {
        startField("shipments");

        _queryBuilder.append('{');
        queryDef.define(new OrderShipmentQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The shipping address for the order.
     */
    public CustomerOrderQuery shippingAddress(OrderAddressQueryDefinition queryDef) {
        startField("shipping_address");

        _queryBuilder.append('{');
        queryDef.define(new OrderAddressQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The delivery method for the order.
     */
    public CustomerOrderQuery shippingMethod() {
        startField("shipping_method");

        return this;
    }

    /**
     * The current status of the order.
     */
    public CustomerOrderQuery status() {
        startField("status");

        return this;
    }

    /**
     * Details about the calculated totals for this order.
     */
    public CustomerOrderQuery total(OrderTotalQueryDefinition queryDef) {
        startField("total");

        _queryBuilder.append('{');
        queryDef.define(new OrderTotalQuery(_queryBuilder));
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
    public static Fragment<CustomerOrderQuery> createFragment(String name, CustomerOrderQueryDefinition queryDef) {
        StringBuilder sb = new StringBuilder();
        queryDef.define(new CustomerOrderQuery(sb));
        return new Fragment<>(name, "CustomerOrder", sb.toString());
    }

    /**
     * Adds a <code>CustomerOrderQuery</code> fragment reference at the current position of the query.
     * For example for a fragment named <code>test</code>, calling this method will add the
     * reference <code>...test</code> in the query. For GraphQL types implementing an interface, there
     * will be some similar methods using the Query type of each implemented interface.
     * 
     * @param fragment The fragment to reference.
     */
    public CustomerOrderQuery addFragmentReference(Fragment<CustomerOrderQuery> fragment) {
        startField("..." + fragment.getName());
        return this;
    }
}

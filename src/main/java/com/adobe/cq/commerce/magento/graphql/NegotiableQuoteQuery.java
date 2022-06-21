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
 * Contains details about a negotiable quote.
 */
public class NegotiableQuoteQuery extends AbstractQuery<NegotiableQuoteQuery> {
    NegotiableQuoteQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
     * An array of payment methods that can be applied to the negotiable quote.
     */
    public NegotiableQuoteQuery availablePaymentMethods(AvailablePaymentMethodQueryDefinition queryDef) {
        startField("available_payment_methods");

        _queryBuilder.append('{');
        queryDef.define(new AvailablePaymentMethodQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The billing address applied to the negotiable quote.
     */
    public NegotiableQuoteQuery billingAddress(NegotiableQuoteBillingAddressQueryDefinition queryDef) {
        startField("billing_address");

        _queryBuilder.append('{');
        queryDef.define(new NegotiableQuoteBillingAddressQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The first and last name of the buyer.
     */
    public NegotiableQuoteQuery buyer(NegotiableQuoteUserQueryDefinition queryDef) {
        startField("buyer");

        _queryBuilder.append('{');
        queryDef.define(new NegotiableQuoteUserQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * A list of comments made by the buyer and seller.
     */
    public NegotiableQuoteQuery comments(NegotiableQuoteCommentQueryDefinition queryDef) {
        startField("comments");

        _queryBuilder.append('{');
        queryDef.define(new NegotiableQuoteCommentQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Timestamp indicating when the negotiable quote was created.
     */
    public NegotiableQuoteQuery createdAt() {
        startField("created_at");

        return this;
    }

    /**
     * The email address of the company user.
     */
    public NegotiableQuoteQuery email() {
        startField("email");

        return this;
    }

    /**
     * A list of status and price changes for the negotiable quote.
     */
    public NegotiableQuoteQuery history(NegotiableQuoteHistoryEntryQueryDefinition queryDef) {
        startField("history");

        _queryBuilder.append('{');
        queryDef.define(new NegotiableQuoteHistoryEntryQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Indicates whether the negotiable quote contains only virtual products.
     */
    public NegotiableQuoteQuery isVirtual() {
        startField("is_virtual");

        return this;
    }

    /**
     * The list of items in the negotiable quote.
     */
    public NegotiableQuoteQuery items(CartItemInterfaceQueryDefinition queryDef) {
        startField("items");

        _queryBuilder.append('{');
        queryDef.define(new CartItemInterfaceQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The title assigned to the negotiable quote.
     */
    public NegotiableQuoteQuery name() {
        startField("name");

        return this;
    }

    /**
     * A set of subtotals and totals applied to the negotiable quote.
     */
    public NegotiableQuoteQuery prices(CartPricesQueryDefinition queryDef) {
        startField("prices");

        _queryBuilder.append('{');
        queryDef.define(new CartPricesQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The payment method that was applied to the negotiable quote.
     */
    public NegotiableQuoteQuery selectedPaymentMethod(SelectedPaymentMethodQueryDefinition queryDef) {
        startField("selected_payment_method");

        _queryBuilder.append('{');
        queryDef.define(new SelectedPaymentMethodQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * A list of shipping addresses applied to the negotiable quote.
     */
    public NegotiableQuoteQuery shippingAddresses(NegotiableQuoteShippingAddressQueryDefinition queryDef) {
        startField("shipping_addresses");

        _queryBuilder.append('{');
        queryDef.define(new NegotiableQuoteShippingAddressQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The status of the negotiable quote.
     */
    public NegotiableQuoteQuery status() {
        startField("status");

        return this;
    }

    /**
     * The total number of items in the negotiable quote.
     */
    public NegotiableQuoteQuery totalQuantity() {
        startField("total_quantity");

        return this;
    }

    /**
     * The unique ID of a `NegotiableQuote` object.
     */
    public NegotiableQuoteQuery uid() {
        startField("uid");

        return this;
    }

    /**
     * Timestamp indicating when the negotiable quote was updated.
     */
    public NegotiableQuoteQuery updatedAt() {
        startField("updated_at");

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
    public static Fragment<NegotiableQuoteQuery> createFragment(String name, NegotiableQuoteQueryDefinition queryDef) {
        StringBuilder sb = new StringBuilder();
        queryDef.define(new NegotiableQuoteQuery(sb));
        return new Fragment<>(name, "NegotiableQuote", sb.toString());
    }

    /**
     * Adds a <code>NegotiableQuoteQuery</code> fragment reference at the current position of the query.
     * For example for a fragment named <code>test</code>, calling this method will add the
     * reference <code>...test</code> in the query. For GraphQL types implementing an interface, there
     * will be some similar methods using the Query type of each implemented interface.
     * 
     * @param fragment The fragment to reference.
     */
    public NegotiableQuoteQuery addFragmentReference(Fragment<NegotiableQuoteQuery> fragment) {
        startField("..." + fragment.getName());
        return this;
    }
}

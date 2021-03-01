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

public class GiftCardOrderItemQuery extends AbstractQuery<GiftCardOrderItemQuery> {
    GiftCardOrderItemQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
     * The final discount information for the product
     */
    public GiftCardOrderItemQuery discounts(DiscountQueryDefinition queryDef) {
        startField("discounts");

        _queryBuilder.append('{');
        queryDef.define(new DiscountQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Indicates whether the order item is eligible is eligible to be in a return request
     */
    public GiftCardOrderItemQuery eligibleForReturn() {
        startField("eligible_for_return");

        return this;
    }

    /**
     * The entered option for the base product, such as a logo or image
     */
    public GiftCardOrderItemQuery enteredOptions(OrderItemOptionQueryDefinition queryDef) {
        startField("entered_options");

        _queryBuilder.append('{');
        queryDef.define(new OrderItemOptionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Selected gift card properties for an order item
     */
    public GiftCardOrderItemQuery giftCard(GiftCardItemQueryDefinition queryDef) {
        startField("gift_card");

        _queryBuilder.append('{');
        queryDef.define(new GiftCardItemQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The selected gift wrapping for the order item
     */
    public GiftCardOrderItemQuery giftWrapping(GiftWrappingQueryDefinition queryDef) {
        startField("gift_wrapping");

        _queryBuilder.append('{');
        queryDef.define(new GiftWrappingQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The unique ID for a `OrderItemInterface` object
     */
    public GiftCardOrderItemQuery id() {
        startField("id");

        return this;
    }

    /**
     * The name of the base product
     */
    public GiftCardOrderItemQuery productName() {
        startField("product_name");

        return this;
    }

    /**
     * The sale price of the base product, including selected options
     */
    public GiftCardOrderItemQuery productSalePrice(MoneyQueryDefinition queryDef) {
        startField("product_sale_price");

        _queryBuilder.append('{');
        queryDef.define(new MoneyQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The SKU of the base product
     */
    public GiftCardOrderItemQuery productSku() {
        startField("product_sku");

        return this;
    }

    /**
     * The type of product, such as simple, configurable, etc.
     */
    public GiftCardOrderItemQuery productType() {
        startField("product_type");

        return this;
    }

    /**
     * URL key of the base product
     */
    public GiftCardOrderItemQuery productUrlKey() {
        startField("product_url_key");

        return this;
    }

    /**
     * The number of canceled items
     */
    public GiftCardOrderItemQuery quantityCanceled() {
        startField("quantity_canceled");

        return this;
    }

    /**
     * The number of invoiced items
     */
    public GiftCardOrderItemQuery quantityInvoiced() {
        startField("quantity_invoiced");

        return this;
    }

    /**
     * The number of units ordered for this item
     */
    public GiftCardOrderItemQuery quantityOrdered() {
        startField("quantity_ordered");

        return this;
    }

    /**
     * The number of refunded items
     */
    public GiftCardOrderItemQuery quantityRefunded() {
        startField("quantity_refunded");

        return this;
    }

    /**
     * The number of returned items
     */
    public GiftCardOrderItemQuery quantityReturned() {
        startField("quantity_returned");

        return this;
    }

    /**
     * The number of shipped items
     */
    public GiftCardOrderItemQuery quantityShipped() {
        startField("quantity_shipped");

        return this;
    }

    /**
     * The selected options for the base product, such as color or size
     */
    public GiftCardOrderItemQuery selectedOptions(OrderItemOptionQueryDefinition queryDef) {
        startField("selected_options");

        _queryBuilder.append('{');
        queryDef.define(new OrderItemOptionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The status of the order item
     */
    public GiftCardOrderItemQuery status() {
        startField("status");

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
    public static Fragment<GiftCardOrderItemQuery> createFragment(String name, GiftCardOrderItemQueryDefinition queryDef) {
        StringBuilder sb = new StringBuilder();
        queryDef.define(new GiftCardOrderItemQuery(sb));
        return new Fragment<>(name, "GiftCardOrderItem", sb.toString());
    }

    /**
     * Adds a <code>GiftCardOrderItemQuery</code> fragment reference at the current position of the query.
     * For example for a fragment named <code>test</code>, calling this method will add the
     * reference <code>...test</code> in the query. For GraphQL types implementing an interface, there
     * will be some similar methods using the Query type of each implemented interface.
     * 
     * @param fragment The fragment to reference.
     */
    public GiftCardOrderItemQuery addFragmentReference(Fragment<GiftCardOrderItemQuery> fragment) {
        startField("..." + fragment.getName());
        return this;
    }

    /**
     * Adds a <code>OrderItemInterfaceQuery</code> fragment reference at the current position of the query.
     * For example for a fragment named <code>test</code>, calling this method will add the
     * reference <code>...test</code> in the query.
     * 
     * @param fragment The fragment to reference.
     */
    public GiftCardOrderItemQuery addOrderItemInterfaceFragmentReference(Fragment<OrderItemInterfaceQuery> fragment) {
        startField("..." + fragment.getName());
        return this;
    }
}

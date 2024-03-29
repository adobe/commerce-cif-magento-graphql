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

public class GiftCardInvoiceItemQuery extends AbstractQuery<GiftCardInvoiceItemQuery> {
    GiftCardInvoiceItemQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
     * Information about the final discount amount for the base product, including discounts on options.
     */
    public GiftCardInvoiceItemQuery discounts(DiscountQueryDefinition queryDef) {
        startField("discounts");

        _queryBuilder.append('{');
        queryDef.define(new DiscountQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Selected gift card properties for an invoice item.
     */
    public GiftCardInvoiceItemQuery giftCard(GiftCardItemQueryDefinition queryDef) {
        startField("gift_card");

        _queryBuilder.append('{');
        queryDef.define(new GiftCardItemQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The unique ID for an `InvoiceItemInterface` object.
     */
    public GiftCardInvoiceItemQuery id() {
        startField("id");

        return this;
    }

    /**
     * Details about an individual order item.
     */
    public GiftCardInvoiceItemQuery orderItem(OrderItemInterfaceQueryDefinition queryDef) {
        startField("order_item");

        _queryBuilder.append('{');
        queryDef.define(new OrderItemInterfaceQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The name of the base product.
     */
    public GiftCardInvoiceItemQuery productName() {
        startField("product_name");

        return this;
    }

    /**
     * The sale price for the base product including selected options.
     */
    public GiftCardInvoiceItemQuery productSalePrice(MoneyQueryDefinition queryDef) {
        startField("product_sale_price");

        _queryBuilder.append('{');
        queryDef.define(new MoneyQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The SKU of the base product.
     */
    public GiftCardInvoiceItemQuery productSku() {
        startField("product_sku");

        return this;
    }

    /**
     * The number of invoiced items.
     */
    public GiftCardInvoiceItemQuery quantityInvoiced() {
        startField("quantity_invoiced");

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
    public static Fragment<GiftCardInvoiceItemQuery> createFragment(String name, GiftCardInvoiceItemQueryDefinition queryDef) {
        StringBuilder sb = new StringBuilder();
        queryDef.define(new GiftCardInvoiceItemQuery(sb));
        return new Fragment<>(name, "GiftCardInvoiceItem", sb.toString());
    }

    /**
     * Adds a <code>GiftCardInvoiceItemQuery</code> fragment reference at the current position of the query.
     * For example for a fragment named <code>test</code>, calling this method will add the
     * reference <code>...test</code> in the query. For GraphQL types implementing an interface, there
     * will be some similar methods using the Query type of each implemented interface.
     * 
     * @param fragment The fragment to reference.
     */
    public GiftCardInvoiceItemQuery addFragmentReference(Fragment<GiftCardInvoiceItemQuery> fragment) {
        startField("..." + fragment.getName());
        return this;
    }

    /**
     * Adds a <code>InvoiceItemInterfaceQuery</code> fragment reference at the current position of the query.
     * For example for a fragment named <code>test</code>, calling this method will add the
     * reference <code>...test</code> in the query.
     * 
     * @param fragment The fragment to reference.
     */
    public GiftCardInvoiceItemQuery addInvoiceItemInterfaceFragmentReference(Fragment<InvoiceItemInterfaceQuery> fragment) {
        startField("..." + fragment.getName());
        return this;
    }
}

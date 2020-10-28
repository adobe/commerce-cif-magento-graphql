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
import com.shopify.graphql.support.ID;

/**
 * Invoice item details
 */
public class InvoiceItemInterfaceQuery extends AbstractQuery<InvoiceItemInterfaceQuery> {
    InvoiceItemInterfaceQuery(StringBuilder _queryBuilder) {
        this(_queryBuilder, true);
    }

    InvoiceItemInterfaceQuery(StringBuilder _queryBuilder, boolean addTypename) {
        super(_queryBuilder);
        if (addTypename) {
            startField("__typename");
        }
    }

    /**
     * Contains information about the final discount amount for the base product, including discounts on
     * options
     */
    public InvoiceItemInterfaceQuery discounts(DiscountQueryDefinition queryDef) {
        startField("discounts");

        _queryBuilder.append('{');
        queryDef.define(new DiscountQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The unique ID of the invoice item
     */
    public InvoiceItemInterfaceQuery id() {
        startField("id");

        return this;
    }

    /**
     * Contains details about an individual order item
     */
    public InvoiceItemInterfaceQuery orderItem(OrderItemInterfaceQueryDefinition queryDef) {
        startField("order_item");

        _queryBuilder.append('{');
        queryDef.define(new OrderItemInterfaceQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The name of the base product
     */
    public InvoiceItemInterfaceQuery productName() {
        startField("product_name");

        return this;
    }

    /**
     * The sale price for the base product including selected options
     */
    public InvoiceItemInterfaceQuery productSalePrice(MoneyQueryDefinition queryDef) {
        startField("product_sale_price");

        _queryBuilder.append('{');
        queryDef.define(new MoneyQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The SKU of the base product
     */
    public InvoiceItemInterfaceQuery productSku() {
        startField("product_sku");

        return this;
    }

    /**
     * The number of invoiced items
     */
    public InvoiceItemInterfaceQuery quantityInvoiced() {
        startField("quantity_invoiced");

        return this;
    }

    public InvoiceItemInterfaceQuery onBundleInvoiceItem(BundleInvoiceItemQueryDefinition queryDef) {
        startInlineFragment("BundleInvoiceItem");
        queryDef.define(new BundleInvoiceItemQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public InvoiceItemInterfaceQuery onDownloadableInvoiceItem(DownloadableInvoiceItemQueryDefinition queryDef) {
        startInlineFragment("DownloadableInvoiceItem");
        queryDef.define(new DownloadableInvoiceItemQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public InvoiceItemInterfaceQuery onGiftCardInvoiceItem(GiftCardInvoiceItemQueryDefinition queryDef) {
        startInlineFragment("GiftCardInvoiceItem");
        queryDef.define(new GiftCardInvoiceItemQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public InvoiceItemInterfaceQuery onInvoiceItem(InvoiceItemQueryDefinition queryDef) {
        startInlineFragment("InvoiceItem");
        queryDef.define(new InvoiceItemQuery(_queryBuilder));
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
    public static Fragment<InvoiceItemInterfaceQuery> createFragment(String name, InvoiceItemInterfaceQueryDefinition queryDef) {
        StringBuilder sb = new StringBuilder();
        queryDef.define(new InvoiceItemInterfaceQuery(sb, false));
        return new Fragment<>(name, "InvoiceItemInterface", sb.toString());
    }

    /**
     * Adds a <code>InvoiceItemInterfaceQuery</code> fragment reference at the current position of the query.
     * For example for a fragment named <code>test</code>, calling this method will add the
     * reference <code>...test</code> in the query. For GraphQL types implementing an interface, there
     * will be some similar methods using the Query type of each implemented interface.
     * 
     * @param fragment The fragment to reference.
     */
    public InvoiceItemInterfaceQuery addFragmentReference(Fragment<InvoiceItemInterfaceQuery> fragment) {
        startField("..." + fragment.getName());
        return this;
    }
}

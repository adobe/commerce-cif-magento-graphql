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

public class DownloadableInvoiceItemQuery extends AbstractQuery<DownloadableInvoiceItemQuery> {
    DownloadableInvoiceItemQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
     * Contains information about the final discount amount for the base product, including discounts on
     * options
     */
    public DownloadableInvoiceItemQuery discounts(DiscountQueryDefinition queryDef) {
        startField("discounts");

        _queryBuilder.append('{');
        queryDef.define(new DiscountQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * A list of downloadable links that are invoiced from the downloadable product
     */
    public DownloadableInvoiceItemQuery downloadableLinks(DownloadableItemsLinksQueryDefinition queryDef) {
        startField("downloadable_links");

        _queryBuilder.append('{');
        queryDef.define(new DownloadableItemsLinksQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The unique ID of the invoice item
     */
    public DownloadableInvoiceItemQuery id() {
        startField("id");

        return this;
    }

    /**
     * Contains details about an individual order item
     */
    public DownloadableInvoiceItemQuery orderItem(OrderItemInterfaceQueryDefinition queryDef) {
        startField("order_item");

        _queryBuilder.append('{');
        queryDef.define(new OrderItemInterfaceQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The name of the base product
     */
    public DownloadableInvoiceItemQuery productName() {
        startField("product_name");

        return this;
    }

    /**
     * The sale price for the base product including selected options
     */
    public DownloadableInvoiceItemQuery productSalePrice(MoneyQueryDefinition queryDef) {
        startField("product_sale_price");

        _queryBuilder.append('{');
        queryDef.define(new MoneyQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The SKU of the base product
     */
    public DownloadableInvoiceItemQuery productSku() {
        startField("product_sku");

        return this;
    }

    /**
     * The number of invoiced items
     */
    public DownloadableInvoiceItemQuery quantityInvoiced() {
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
    public static Fragment<DownloadableInvoiceItemQuery> createFragment(String name, DownloadableInvoiceItemQueryDefinition queryDef) {
        StringBuilder sb = new StringBuilder();
        queryDef.define(new DownloadableInvoiceItemQuery(sb));
        return new Fragment<>(name, "DownloadableInvoiceItem", sb.toString());
    }

    /**
     * Adds a <code>DownloadableInvoiceItemQuery</code> fragment reference at the current position of the query.
     * For example for a fragment named <code>test</code>, calling this method will add the
     * reference <code>...test</code> in the query. For GraphQL types implementing an interface, there
     * will be some similar methods using the Query type of each implemented interface.
     * 
     * @param fragment The fragment to reference.
     */
    public DownloadableInvoiceItemQuery addFragmentReference(Fragment<DownloadableInvoiceItemQuery> fragment) {
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
    public DownloadableInvoiceItemQuery addInvoiceItemInterfaceFragmentReference(Fragment<InvoiceItemInterfaceQuery> fragment) {
        startField("..." + fragment.getName());
        return this;
    }
}

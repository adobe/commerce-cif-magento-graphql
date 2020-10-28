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
 * Contains price details from an invoice
 */
public class InvoiceTotalQuery extends AbstractQuery<InvoiceTotalQuery> {
    InvoiceTotalQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
     * The final base grand total amount in the base currency
     */
    public InvoiceTotalQuery baseGrandTotal(MoneyQueryDefinition queryDef) {
        startField("base_grand_total");

        _queryBuilder.append('{');
        queryDef.define(new MoneyQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The applied discounts to the invoice
     */
    public InvoiceTotalQuery discounts(DiscountQueryDefinition queryDef) {
        startField("discounts");

        _queryBuilder.append('{');
        queryDef.define(new DiscountQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The final total amount, including shipping, discounts, and taxes
     */
    public InvoiceTotalQuery grandTotal(MoneyQueryDefinition queryDef) {
        startField("grand_total");

        _queryBuilder.append('{');
        queryDef.define(new MoneyQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Contains details about the shipping and handling costs for the invoice
     */
    public InvoiceTotalQuery shippingHandling(ShippingHandlingQueryDefinition queryDef) {
        startField("shipping_handling");

        _queryBuilder.append('{');
        queryDef.define(new ShippingHandlingQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The subtotal of the invoice, excluding shipping, discounts, and taxes
     */
    public InvoiceTotalQuery subtotal(MoneyQueryDefinition queryDef) {
        startField("subtotal");

        _queryBuilder.append('{');
        queryDef.define(new MoneyQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The invoice tax details
     */
    public InvoiceTotalQuery taxes(TaxItemQueryDefinition queryDef) {
        startField("taxes");

        _queryBuilder.append('{');
        queryDef.define(new TaxItemQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The shipping amount for the invoice
     */
    public InvoiceTotalQuery totalShipping(MoneyQueryDefinition queryDef) {
        startField("total_shipping");

        _queryBuilder.append('{');
        queryDef.define(new MoneyQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The amount of tax applied to the invoice
     */
    public InvoiceTotalQuery totalTax(MoneyQueryDefinition queryDef) {
        startField("total_tax");

        _queryBuilder.append('{');
        queryDef.define(new MoneyQuery(_queryBuilder));
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
    public static Fragment<InvoiceTotalQuery> createFragment(String name, InvoiceTotalQueryDefinition queryDef) {
        StringBuilder sb = new StringBuilder();
        queryDef.define(new InvoiceTotalQuery(sb));
        return new Fragment<>(name, "InvoiceTotal", sb.toString());
    }

    /**
     * Adds a <code>InvoiceTotalQuery</code> fragment reference at the current position of the query.
     * For example for a fragment named <code>test</code>, calling this method will add the
     * reference <code>...test</code> in the query. For GraphQL types implementing an interface, there
     * will be some similar methods using the Query type of each implemented interface.
     * 
     * @param fragment The fragment to reference.
     */
    public InvoiceTotalQuery addFragmentReference(Fragment<InvoiceTotalQuery> fragment) {
        startField("..." + fragment.getName());
        return this;
    }
}

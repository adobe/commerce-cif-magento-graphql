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
 * Credit memo item details
 */
public class CreditMemoItemInterfaceQuery extends AbstractQuery<CreditMemoItemInterfaceQuery> {
    CreditMemoItemInterfaceQuery(StringBuilder _queryBuilder) {
        this(_queryBuilder, true);
    }

    CreditMemoItemInterfaceQuery(StringBuilder _queryBuilder, boolean addTypename) {
        super(_queryBuilder);
        if (addTypename) {
            startField("__typename");
        }
    }

    /**
     * Contains information about the final discount amount for the base product, including discounts on
     * options
     */
    public CreditMemoItemInterfaceQuery discounts(DiscountQueryDefinition queryDef) {
        startField("discounts");

        _queryBuilder.append('{');
        queryDef.define(new DiscountQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The unique ID of the credit memo item, used for API purposes
     */
    public CreditMemoItemInterfaceQuery id() {
        startField("id");

        return this;
    }

    /**
     * The order item the credit memo is applied to
     */
    public CreditMemoItemInterfaceQuery orderItem(OrderItemInterfaceQueryDefinition queryDef) {
        startField("order_item");

        _queryBuilder.append('{');
        queryDef.define(new OrderItemInterfaceQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The name of the base product
     */
    public CreditMemoItemInterfaceQuery productName() {
        startField("product_name");

        return this;
    }

    /**
     * The sale price for the base product, including selected options
     */
    public CreditMemoItemInterfaceQuery productSalePrice(MoneyQueryDefinition queryDef) {
        startField("product_sale_price");

        _queryBuilder.append('{');
        queryDef.define(new MoneyQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * SKU of the base product
     */
    public CreditMemoItemInterfaceQuery productSku() {
        startField("product_sku");

        return this;
    }

    /**
     * The number of refunded items
     */
    public CreditMemoItemInterfaceQuery quantityRefunded() {
        startField("quantity_refunded");

        return this;
    }

    public CreditMemoItemInterfaceQuery onBundleCreditMemoItem(BundleCreditMemoItemQueryDefinition queryDef) {
        startInlineFragment("BundleCreditMemoItem");
        queryDef.define(new BundleCreditMemoItemQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public CreditMemoItemInterfaceQuery onCreditMemoItem(CreditMemoItemQueryDefinition queryDef) {
        startInlineFragment("CreditMemoItem");
        queryDef.define(new CreditMemoItemQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public CreditMemoItemInterfaceQuery onDownloadableCreditMemoItem(DownloadableCreditMemoItemQueryDefinition queryDef) {
        startInlineFragment("DownloadableCreditMemoItem");
        queryDef.define(new DownloadableCreditMemoItemQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public CreditMemoItemInterfaceQuery onGiftCardCreditMemoItem(GiftCardCreditMemoItemQueryDefinition queryDef) {
        startInlineFragment("GiftCardCreditMemoItem");
        queryDef.define(new GiftCardCreditMemoItemQuery(_queryBuilder));
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
    public static Fragment<CreditMemoItemInterfaceQuery> createFragment(String name, CreditMemoItemInterfaceQueryDefinition queryDef) {
        StringBuilder sb = new StringBuilder();
        queryDef.define(new CreditMemoItemInterfaceQuery(sb, false));
        return new Fragment<>(name, "CreditMemoItemInterface", sb.toString());
    }

    /**
     * Adds a <code>CreditMemoItemInterfaceQuery</code> fragment reference at the current position of the query.
     * For example for a fragment named <code>test</code>, calling this method will add the
     * reference <code>...test</code> in the query. For GraphQL types implementing an interface, there
     * will be some similar methods using the Query type of each implemented interface.
     * 
     * @param fragment The fragment to reference.
     */
    public CreditMemoItemInterfaceQuery addFragmentReference(Fragment<CreditMemoItemInterfaceQuery> fragment) {
        startField("..." + fragment.getName());
        return this;
    }
}

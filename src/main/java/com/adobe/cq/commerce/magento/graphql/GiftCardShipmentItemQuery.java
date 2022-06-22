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

public class GiftCardShipmentItemQuery extends AbstractQuery<GiftCardShipmentItemQuery> {
    GiftCardShipmentItemQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
     * Selected gift card properties for a shipment item.
     */
    public GiftCardShipmentItemQuery giftCard(GiftCardItemQueryDefinition queryDef) {
        startField("gift_card");

        _queryBuilder.append('{');
        queryDef.define(new GiftCardItemQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The unique ID for a `ShipmentItemInterface` object.
     */
    public GiftCardShipmentItemQuery id() {
        startField("id");

        return this;
    }

    /**
     * The order item associated with the shipment item.
     */
    public GiftCardShipmentItemQuery orderItem(OrderItemInterfaceQueryDefinition queryDef) {
        startField("order_item");

        _queryBuilder.append('{');
        queryDef.define(new OrderItemInterfaceQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The name of the base product.
     */
    public GiftCardShipmentItemQuery productName() {
        startField("product_name");

        return this;
    }

    /**
     * The sale price for the base product.
     */
    public GiftCardShipmentItemQuery productSalePrice(MoneyQueryDefinition queryDef) {
        startField("product_sale_price");

        _queryBuilder.append('{');
        queryDef.define(new MoneyQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The SKU of the base product.
     */
    public GiftCardShipmentItemQuery productSku() {
        startField("product_sku");

        return this;
    }

    /**
     * The number of shipped items.
     */
    public GiftCardShipmentItemQuery quantityShipped() {
        startField("quantity_shipped");

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
    public static Fragment<GiftCardShipmentItemQuery> createFragment(String name, GiftCardShipmentItemQueryDefinition queryDef) {
        StringBuilder sb = new StringBuilder();
        queryDef.define(new GiftCardShipmentItemQuery(sb));
        return new Fragment<>(name, "GiftCardShipmentItem", sb.toString());
    }

    /**
     * Adds a <code>GiftCardShipmentItemQuery</code> fragment reference at the current position of the query.
     * For example for a fragment named <code>test</code>, calling this method will add the
     * reference <code>...test</code> in the query. For GraphQL types implementing an interface, there
     * will be some similar methods using the Query type of each implemented interface.
     * 
     * @param fragment The fragment to reference.
     */
    public GiftCardShipmentItemQuery addFragmentReference(Fragment<GiftCardShipmentItemQuery> fragment) {
        startField("..." + fragment.getName());
        return this;
    }

    /**
     * Adds a <code>ShipmentItemInterfaceQuery</code> fragment reference at the current position of the query.
     * For example for a fragment named <code>test</code>, calling this method will add the
     * reference <code>...test</code> in the query.
     * 
     * @param fragment The fragment to reference.
     */
    public GiftCardShipmentItemQuery addShipmentItemInterfaceFragmentReference(Fragment<ShipmentItemInterfaceQuery> fragment) {
        startField("..." + fragment.getName());
        return this;
    }
}

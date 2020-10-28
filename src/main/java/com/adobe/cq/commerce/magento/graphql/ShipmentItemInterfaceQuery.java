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
 * Order shipment item details
 */
public class ShipmentItemInterfaceQuery extends AbstractQuery<ShipmentItemInterfaceQuery> {
    ShipmentItemInterfaceQuery(StringBuilder _queryBuilder) {
        this(_queryBuilder, true);
    }
    ShipmentItemInterfaceQuery(StringBuilder _queryBuilder, boolean addTypename) {
        super(_queryBuilder);
        if (addTypename) {
            startField("__typename");
        }
    }

    /**
     * Shipment item unique identifier
     */
    public ShipmentItemInterfaceQuery id() {
        startField("id");

        return this;
    }

    /**
     * Associated order item
     */
    public ShipmentItemInterfaceQuery orderItem(OrderItemInterfaceQueryDefinition queryDef) {
        startField("order_item");

        _queryBuilder.append('{');
        queryDef.define(new OrderItemInterfaceQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Name of the base product
     */
    public ShipmentItemInterfaceQuery productName() {
        startField("product_name");

        return this;
    }

    /**
     * Sale price for the base product
     */
    public ShipmentItemInterfaceQuery productSalePrice(MoneyQueryDefinition queryDef) {
        startField("product_sale_price");

        _queryBuilder.append('{');
        queryDef.define(new MoneyQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * SKU of the base product
     */
    public ShipmentItemInterfaceQuery productSku() {
        startField("product_sku");

        return this;
    }

    /**
     * Number of shipped items
     */
    public ShipmentItemInterfaceQuery quantityShipped() {
        startField("quantity_shipped");

        return this;
    }

    public ShipmentItemInterfaceQuery onBundleShipmentItem(BundleShipmentItemQueryDefinition queryDef) {
        startInlineFragment("BundleShipmentItem");
        queryDef.define(new BundleShipmentItemQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public ShipmentItemInterfaceQuery onGiftCardShipmentItem(GiftCardShipmentItemQueryDefinition queryDef) {
        startInlineFragment("GiftCardShipmentItem");
        queryDef.define(new GiftCardShipmentItemQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public ShipmentItemInterfaceQuery onShipmentItem(ShipmentItemQueryDefinition queryDef) {
        startInlineFragment("ShipmentItem");
        queryDef.define(new ShipmentItemQuery(_queryBuilder));
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
    public static Fragment<ShipmentItemInterfaceQuery> createFragment(String name, ShipmentItemInterfaceQueryDefinition queryDef) {
        StringBuilder sb = new StringBuilder();
        queryDef.define(new ShipmentItemInterfaceQuery(sb, false));
        return new Fragment<>(name, "ShipmentItemInterface", sb.toString());
    }

    /**
     * Adds a <code>ShipmentItemInterfaceQuery</code> fragment reference at the current position of the query.
     * For example for a fragment named <code>test</code>, calling this method will add the
     * reference <code>...test</code> in the query. For GraphQL types implementing an interface, there
     * will be some similar methods using the Query type of each implemented interface.
     * 
     * @param fragment The fragment to reference.
     */
    public ShipmentItemInterfaceQuery addFragmentReference(Fragment<ShipmentItemInterfaceQuery> fragment) {
        startField("..." + fragment.getName());
        return this;
    }
}

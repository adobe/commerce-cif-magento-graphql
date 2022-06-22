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
 * Defines bundle product options for `ShipmentItemInterface`.
 */
public class BundleShipmentItemQuery extends AbstractQuery<BundleShipmentItemQuery> {
    BundleShipmentItemQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
     * A list of bundle options that are assigned to a shipped product.
     */
    public BundleShipmentItemQuery bundleOptions(ItemSelectedBundleOptionQueryDefinition queryDef) {
        startField("bundle_options");

        _queryBuilder.append('{');
        queryDef.define(new ItemSelectedBundleOptionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The unique ID for a `ShipmentItemInterface` object.
     */
    public BundleShipmentItemQuery id() {
        startField("id");

        return this;
    }

    /**
     * The order item associated with the shipment item.
     */
    public BundleShipmentItemQuery orderItem(OrderItemInterfaceQueryDefinition queryDef) {
        startField("order_item");

        _queryBuilder.append('{');
        queryDef.define(new OrderItemInterfaceQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The name of the base product.
     */
    public BundleShipmentItemQuery productName() {
        startField("product_name");

        return this;
    }

    /**
     * The sale price for the base product.
     */
    public BundleShipmentItemQuery productSalePrice(MoneyQueryDefinition queryDef) {
        startField("product_sale_price");

        _queryBuilder.append('{');
        queryDef.define(new MoneyQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The SKU of the base product.
     */
    public BundleShipmentItemQuery productSku() {
        startField("product_sku");

        return this;
    }

    /**
     * The number of shipped items.
     */
    public BundleShipmentItemQuery quantityShipped() {
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
    public static Fragment<BundleShipmentItemQuery> createFragment(String name, BundleShipmentItemQueryDefinition queryDef) {
        StringBuilder sb = new StringBuilder();
        queryDef.define(new BundleShipmentItemQuery(sb));
        return new Fragment<>(name, "BundleShipmentItem", sb.toString());
    }

    /**
     * Adds a <code>BundleShipmentItemQuery</code> fragment reference at the current position of the query.
     * For example for a fragment named <code>test</code>, calling this method will add the
     * reference <code>...test</code> in the query. For GraphQL types implementing an interface, there
     * will be some similar methods using the Query type of each implemented interface.
     * 
     * @param fragment The fragment to reference.
     */
    public BundleShipmentItemQuery addFragmentReference(Fragment<BundleShipmentItemQuery> fragment) {
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
    public BundleShipmentItemQuery addShipmentItemInterfaceFragmentReference(Fragment<ShipmentItemInterfaceQuery> fragment) {
        startField("..." + fragment.getName());
        return this;
    }
}

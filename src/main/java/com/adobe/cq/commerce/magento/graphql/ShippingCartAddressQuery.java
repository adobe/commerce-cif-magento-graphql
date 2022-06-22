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
 * Contains shipping addresses and methods.
 */
public class ShippingCartAddressQuery extends AbstractQuery<ShippingCartAddressQuery> {
    ShippingCartAddressQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
     * An array that lists the shipping methods that can be applied to the cart.
     */
    public ShippingCartAddressQuery availableShippingMethods(AvailableShippingMethodQueryDefinition queryDef) {
        startField("available_shipping_methods");

        _queryBuilder.append('{');
        queryDef.define(new AvailableShippingMethodQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * @deprecated Use `cart_items_v2` instead.
     */
    @Deprecated
    public ShippingCartAddressQuery cartItems(CartItemQuantityQueryDefinition queryDef) {
        startField("cart_items");

        _queryBuilder.append('{');
        queryDef.define(new CartItemQuantityQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * An array that lists the items in the cart.
     */
    public ShippingCartAddressQuery cartItemsV2(CartItemInterfaceQueryDefinition queryDef) {
        startField("cart_items_v2");

        _queryBuilder.append('{');
        queryDef.define(new CartItemInterfaceQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The city specified for the billing or shipping address.
     */
    public ShippingCartAddressQuery city() {
        startField("city");

        return this;
    }

    /**
     * The company specified for the billing or shipping address.
     */
    public ShippingCartAddressQuery company() {
        startField("company");

        return this;
    }

    /**
     * An object containing the country label and code.
     */
    public ShippingCartAddressQuery country(CartAddressCountryQueryDefinition queryDef) {
        startField("country");

        _queryBuilder.append('{');
        queryDef.define(new CartAddressCountryQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Text provided by the shopper.
     */
    public ShippingCartAddressQuery customerNotes() {
        startField("customer_notes");

        return this;
    }

    /**
     * The first name of the customer or guest.
     */
    public ShippingCartAddressQuery firstname() {
        startField("firstname");

        return this;
    }

    /**
     * @deprecated This information should not be exposed on the frontend.
     */
    @Deprecated
    public ShippingCartAddressQuery itemsWeight() {
        startField("items_weight");

        return this;
    }

    /**
     * The last name of the customer or guest.
     */
    public ShippingCartAddressQuery lastname() {
        startField("lastname");

        return this;
    }

    public ShippingCartAddressQuery pickupLocationCode() {
        startField("pickup_location_code");

        return this;
    }

    /**
     * The ZIP or postal code of the billing or shipping address.
     */
    public ShippingCartAddressQuery postcode() {
        startField("postcode");

        return this;
    }

    /**
     * An object containing the region label and code.
     */
    public ShippingCartAddressQuery region(CartAddressRegionQueryDefinition queryDef) {
        startField("region");

        _queryBuilder.append('{');
        queryDef.define(new CartAddressRegionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * An object that describes the selected shipping method.
     */
    public ShippingCartAddressQuery selectedShippingMethod(SelectedShippingMethodQueryDefinition queryDef) {
        startField("selected_shipping_method");

        _queryBuilder.append('{');
        queryDef.define(new SelectedShippingMethodQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * An array containing the street for the billing or shipping address.
     */
    public ShippingCartAddressQuery street() {
        startField("street");

        return this;
    }

    /**
     * The telephone number for the billing or shipping address.
     */
    public ShippingCartAddressQuery telephone() {
        startField("telephone");

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
    public static Fragment<ShippingCartAddressQuery> createFragment(String name, ShippingCartAddressQueryDefinition queryDef) {
        StringBuilder sb = new StringBuilder();
        queryDef.define(new ShippingCartAddressQuery(sb));
        return new Fragment<>(name, "ShippingCartAddress", sb.toString());
    }

    /**
     * Adds a <code>ShippingCartAddressQuery</code> fragment reference at the current position of the query.
     * For example for a fragment named <code>test</code>, calling this method will add the
     * reference <code>...test</code> in the query. For GraphQL types implementing an interface, there
     * will be some similar methods using the Query type of each implemented interface.
     * 
     * @param fragment The fragment to reference.
     */
    public ShippingCartAddressQuery addFragmentReference(Fragment<ShippingCartAddressQuery> fragment) {
        startField("..." + fragment.getName());
        return this;
    }

    /**
     * Adds a <code>CartAddressInterfaceQuery</code> fragment reference at the current position of the query.
     * For example for a fragment named <code>test</code>, calling this method will add the
     * reference <code>...test</code> in the query.
     * 
     * @param fragment The fragment to reference.
     */
    public ShippingCartAddressQuery addCartAddressInterfaceFragmentReference(Fragment<CartAddressInterfaceQuery> fragment) {
        startField("..." + fragment.getName());
        return this;
    }
}

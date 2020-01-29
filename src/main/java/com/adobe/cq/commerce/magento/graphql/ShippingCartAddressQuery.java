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

public class ShippingCartAddressQuery extends AbstractQuery<ShippingCartAddressQuery> {
    ShippingCartAddressQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public ShippingCartAddressQuery availableShippingMethods(AvailableShippingMethodQueryDefinition queryDef) {
        startField("available_shipping_methods");

        _queryBuilder.append('{');
        queryDef.define(new AvailableShippingMethodQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * @deprecated `cart_items_v2` should be used instead
     */
    @Deprecated
    public ShippingCartAddressQuery cartItems(CartItemQuantityQueryDefinition queryDef) {
        startField("cart_items");

        _queryBuilder.append('{');
        queryDef.define(new CartItemQuantityQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public ShippingCartAddressQuery cartItemsV2(CartItemInterfaceQueryDefinition queryDef) {
        startField("cart_items_v2");

        _queryBuilder.append('{');
        queryDef.define(new CartItemInterfaceQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public ShippingCartAddressQuery city() {
        startField("city");

        return this;
    }

    public ShippingCartAddressQuery company() {
        startField("company");

        return this;
    }

    public ShippingCartAddressQuery country(CartAddressCountryQueryDefinition queryDef) {
        startField("country");

        _queryBuilder.append('{');
        queryDef.define(new CartAddressCountryQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public ShippingCartAddressQuery customerNotes() {
        startField("customer_notes");

        return this;
    }

    public ShippingCartAddressQuery firstname() {
        startField("firstname");

        return this;
    }

    /**
     * @deprecated This information shoud not be exposed on frontend
     */
    @Deprecated
    public ShippingCartAddressQuery itemsWeight() {
        startField("items_weight");

        return this;
    }

    public ShippingCartAddressQuery lastname() {
        startField("lastname");

        return this;
    }

    public ShippingCartAddressQuery postcode() {
        startField("postcode");

        return this;
    }

    public ShippingCartAddressQuery region(CartAddressRegionQueryDefinition queryDef) {
        startField("region");

        _queryBuilder.append('{');
        queryDef.define(new CartAddressRegionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public ShippingCartAddressQuery selectedShippingMethod(SelectedShippingMethodQueryDefinition queryDef) {
        startField("selected_shipping_method");

        _queryBuilder.append('{');
        queryDef.define(new SelectedShippingMethodQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public ShippingCartAddressQuery street() {
        startField("street");

        return this;
    }

    public ShippingCartAddressQuery telephone() {
        startField("telephone");

        return this;
    }
}

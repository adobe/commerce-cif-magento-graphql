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

public class CartAddressInterfaceQuery extends AbstractQuery<CartAddressInterfaceQuery> {
    CartAddressInterfaceQuery(StringBuilder _queryBuilder) {
        this(_queryBuilder, true);
    }

    CartAddressInterfaceQuery(StringBuilder _queryBuilder, boolean addTypename) {
        super(_queryBuilder);
        if (addTypename) {
            startField("__typename");
        }
    }

    public CartAddressInterfaceQuery city() {
        startField("city");

        return this;
    }

    public CartAddressInterfaceQuery company() {
        startField("company");

        return this;
    }

    public CartAddressInterfaceQuery country(CartAddressCountryQueryDefinition queryDef) {
        startField("country");

        _queryBuilder.append('{');
        queryDef.define(new CartAddressCountryQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public CartAddressInterfaceQuery firstname() {
        startField("firstname");

        return this;
    }

    public CartAddressInterfaceQuery lastname() {
        startField("lastname");

        return this;
    }

    public CartAddressInterfaceQuery postcode() {
        startField("postcode");

        return this;
    }

    public CartAddressInterfaceQuery region(CartAddressRegionQueryDefinition queryDef) {
        startField("region");

        _queryBuilder.append('{');
        queryDef.define(new CartAddressRegionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public CartAddressInterfaceQuery street() {
        startField("street");

        return this;
    }

    public CartAddressInterfaceQuery telephone() {
        startField("telephone");

        return this;
    }

    public CartAddressInterfaceQuery onBillingCartAddress(BillingCartAddressQueryDefinition queryDef) {
        startInlineFragment("BillingCartAddress");
        queryDef.define(new BillingCartAddressQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public CartAddressInterfaceQuery onShippingCartAddress(ShippingCartAddressQueryDefinition queryDef) {
        startInlineFragment("ShippingCartAddress");
        queryDef.define(new ShippingCartAddressQuery(_queryBuilder));
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
    public static Fragment<CartAddressInterfaceQuery> createFragment(String name, CartAddressInterfaceQueryDefinition queryDef) {
        StringBuilder sb = new StringBuilder();
        queryDef.define(new CartAddressInterfaceQuery(sb, false));
        return new Fragment<>(name, "CartAddressInterface", sb.toString());
    }

    /**
     * Adds a <code>CartAddressInterfaceQuery</code> fragment reference at the current position of the query.
     * For example for a fragment named <code>test</code>, calling this method will add the
     * reference <code>...test</code> in the query. For GraphQL types implementing an interface, there
     * will be some similar methods using the Query type of each implemented interface.
     * 
     * @param fragment The fragment to reference.
     */
    public CartAddressInterfaceQuery addFragmentReference(Fragment<CartAddressInterfaceQuery> fragment) {
        startField("..." + fragment.getName());
        return this;
    }
}

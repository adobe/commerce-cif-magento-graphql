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

public class CartAddressInterfaceQuery extends AbstractQuery<CartAddressInterfaceQuery> {
    CartAddressInterfaceQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
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
}

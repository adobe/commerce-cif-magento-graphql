/*******************************************************************************
 *
 *    Copyright 2019 Adobe. All rights reserved.
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

/**
 * 
 */
public class BillingCartAddressQuery extends AbstractQuery<BillingCartAddressQuery> {
    BillingCartAddressQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public BillingCartAddressQuery city() {
        startField("city");

        return this;
    }

    public BillingCartAddressQuery company() {
        startField("company");

        return this;
    }

    public BillingCartAddressQuery country(CartAddressCountryQueryDefinition queryDef) {
        startField("country");

        _queryBuilder.append('{');
        queryDef.define(new CartAddressCountryQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public BillingCartAddressQuery customerNotes() {
        startField("customer_notes");

        return this;
    }

    public BillingCartAddressQuery firstname() {
        startField("firstname");

        return this;
    }

    public BillingCartAddressQuery lastname() {
        startField("lastname");

        return this;
    }

    public BillingCartAddressQuery postcode() {
        startField("postcode");

        return this;
    }

    public BillingCartAddressQuery region(CartAddressRegionQueryDefinition queryDef) {
        startField("region");

        _queryBuilder.append('{');
        queryDef.define(new CartAddressRegionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public BillingCartAddressQuery street() {
        startField("street");

        return this;
    }

    public BillingCartAddressQuery telephone() {
        startField("telephone");

        return this;
    }
}

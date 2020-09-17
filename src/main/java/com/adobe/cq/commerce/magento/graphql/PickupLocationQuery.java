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
 * Defines Pickup Location information.
 */
public class PickupLocationQuery extends AbstractQuery<PickupLocationQuery> {
    PickupLocationQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public PickupLocationQuery city() {
        startField("city");

        return this;
    }

    public PickupLocationQuery contactName() {
        startField("contact_name");

        return this;
    }

    public PickupLocationQuery countryId() {
        startField("country_id");

        return this;
    }

    public PickupLocationQuery description() {
        startField("description");

        return this;
    }

    public PickupLocationQuery email() {
        startField("email");

        return this;
    }

    public PickupLocationQuery fax() {
        startField("fax");

        return this;
    }

    public PickupLocationQuery latitude() {
        startField("latitude");

        return this;
    }

    public PickupLocationQuery longitude() {
        startField("longitude");

        return this;
    }

    public PickupLocationQuery name() {
        startField("name");

        return this;
    }

    public PickupLocationQuery phone() {
        startField("phone");

        return this;
    }

    public PickupLocationQuery pickupLocationCode() {
        startField("pickup_location_code");

        return this;
    }

    public PickupLocationQuery postcode() {
        startField("postcode");

        return this;
    }

    public PickupLocationQuery region() {
        startField("region");

        return this;
    }

    public PickupLocationQuery regionId() {
        startField("region_id");

        return this;
    }

    public PickupLocationQuery street() {
        startField("street");

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
    public static Fragment<PickupLocationQuery> createFragment(String name, PickupLocationQueryDefinition queryDef) {
        StringBuilder sb = new StringBuilder();
        queryDef.define(new PickupLocationQuery(sb));
        return new Fragment<>(name, "PickupLocation", sb.toString());
    }

    /**
     * Adds a <code>PickupLocationQuery</code> fragment reference at the current position of the query.
     * For example for a fragment named <code>test</code>, calling this method will add the
     * reference <code>...test</code> in the query. For GraphQL types implementing an interface, there
     * will be some similar methods using the Query type of each implemented interface.
     * 
     * @param fragment The fragment to reference.
     */
    public PickupLocationQuery addFragmentReference(Fragment<PickupLocationQuery> fragment) {
        startField("..." + fragment.getName());
        return this;
    }
}

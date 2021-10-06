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

public class GiftRegistryQuery extends AbstractQuery<GiftRegistryQuery> {
    GiftRegistryQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
     * The date on which the gift registry was created. Only the registry owner can access this attribute
     */
    public GiftRegistryQuery createdAt() {
        startField("created_at");

        return this;
    }

    /**
     * An array of attributes that define elements of the gift registry. Each attribute is specified as a
     * code-value pair
     */
    public GiftRegistryQuery dynamicAttributes(GiftRegistryDynamicAttributeQueryDefinition queryDef) {
        startField("dynamic_attributes");

        _queryBuilder.append('{');
        queryDef.define(new GiftRegistryDynamicAttributeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The name of the event
     */
    public GiftRegistryQuery eventName() {
        startField("event_name");

        return this;
    }

    /**
     * An array of products added to the gift registry
     */
    public GiftRegistryQuery items(GiftRegistryItemInterfaceQueryDefinition queryDef) {
        startField("items");

        _queryBuilder.append('{');
        queryDef.define(new GiftRegistryItemInterfaceQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The message text the customer entered to describe the event
     */
    public GiftRegistryQuery message() {
        startField("message");

        return this;
    }

    /**
     * The customer who created the gift registry
     */
    public GiftRegistryQuery ownerName() {
        startField("owner_name");

        return this;
    }

    /**
     * An enum that states whether the gift registry is PRIVATE or PUBLIC. Only the registry owner can
     * access this attribute
     */
    public GiftRegistryQuery privacySettings() {
        startField("privacy_settings");

        return this;
    }

    /**
     * Contains details about each registrant for the event
     */
    public GiftRegistryQuery registrants(GiftRegistryRegistrantQueryDefinition queryDef) {
        startField("registrants");

        _queryBuilder.append('{');
        queryDef.define(new GiftRegistryRegistrantQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Contains the customer&#39;s shipping address. Only the registry owner can access this attribute
     */
    public GiftRegistryQuery shippingAddress(CustomerAddressQueryDefinition queryDef) {
        startField("shipping_address");

        _queryBuilder.append('{');
        queryDef.define(new CustomerAddressQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * An enum that states whether the gift registry is ACTIVE or INACTIVE. Only the registry owner can
     * access this attribute
     */
    public GiftRegistryQuery status() {
        startField("status");

        return this;
    }

    /**
     * Contains details about the type of gift registry
     */
    public GiftRegistryQuery type(GiftRegistryTypeQueryDefinition queryDef) {
        startField("type");

        _queryBuilder.append('{');
        queryDef.define(new GiftRegistryTypeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The unique ID assigned to the gift registry
     */
    public GiftRegistryQuery uid() {
        startField("uid");

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
    public static Fragment<GiftRegistryQuery> createFragment(String name, GiftRegistryQueryDefinition queryDef) {
        StringBuilder sb = new StringBuilder();
        queryDef.define(new GiftRegistryQuery(sb));
        return new Fragment<>(name, "GiftRegistry", sb.toString());
    }

    /**
     * Adds a <code>GiftRegistryQuery</code> fragment reference at the current position of the query.
     * For example for a fragment named <code>test</code>, calling this method will add the
     * reference <code>...test</code> in the query. For GraphQL types implementing an interface, there
     * will be some similar methods using the Query type of each implemented interface.
     * 
     * @param fragment The fragment to reference.
     */
    public GiftRegistryQuery addFragmentReference(Fragment<GiftRegistryQuery> fragment) {
        startField("..." + fragment.getName());
        return this;
    }
}

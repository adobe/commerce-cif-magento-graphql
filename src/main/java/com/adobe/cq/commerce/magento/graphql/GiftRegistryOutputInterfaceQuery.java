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
 * Contains the customer&#39;s gift registry
 */
public class GiftRegistryOutputInterfaceQuery extends AbstractQuery<GiftRegistryOutputInterfaceQuery> {
    GiftRegistryOutputInterfaceQuery(StringBuilder _queryBuilder) {
        this(_queryBuilder, true);
    }

    GiftRegistryOutputInterfaceQuery(StringBuilder _queryBuilder, boolean addTypename) {
        super(_queryBuilder);
        if (addTypename) {
            startField("__typename");
        }
    }

    /**
     * The gift registry
     */
    public GiftRegistryOutputInterfaceQuery giftRegistry(GiftRegistryQueryDefinition queryDef) {
        startField("gift_registry");

        _queryBuilder.append('{');
        queryDef.define(new GiftRegistryQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public GiftRegistryOutputInterfaceQuery onGiftRegistryOutput(GiftRegistryOutputQueryDefinition queryDef) {
        startInlineFragment("GiftRegistryOutput");
        queryDef.define(new GiftRegistryOutputQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public GiftRegistryOutputInterfaceQuery onMoveCartItemsToGiftRegistryOutput(MoveCartItemsToGiftRegistryOutputQueryDefinition queryDef) {
        startInlineFragment("MoveCartItemsToGiftRegistryOutput");
        queryDef.define(new MoveCartItemsToGiftRegistryOutputQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public GiftRegistryOutputInterfaceQuery onGiftRegistryItemUserErrorInterface(
        GiftRegistryItemUserErrorInterfaceQueryDefinition queryDef) {
        startInlineFragment("GiftRegistryItemUserErrorInterface");
        queryDef.define(new GiftRegistryItemUserErrorInterfaceQuery(_queryBuilder));
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
    public static Fragment<GiftRegistryOutputInterfaceQuery> createFragment(String name,
        GiftRegistryOutputInterfaceQueryDefinition queryDef) {
        StringBuilder sb = new StringBuilder();
        queryDef.define(new GiftRegistryOutputInterfaceQuery(sb, false));
        return new Fragment<>(name, "GiftRegistryOutputInterface", sb.toString());
    }

    /**
     * Adds a <code>GiftRegistryOutputInterfaceQuery</code> fragment reference at the current position of the query.
     * For example for a fragment named <code>test</code>, calling this method will add the
     * reference <code>...test</code> in the query. For GraphQL types implementing an interface, there
     * will be some similar methods using the Query type of each implemented interface.
     * 
     * @param fragment The fragment to reference.
     */
    public GiftRegistryOutputInterfaceQuery addFragmentReference(Fragment<GiftRegistryOutputInterfaceQuery> fragment) {
        startField("..." + fragment.getName());
        return this;
    }
}

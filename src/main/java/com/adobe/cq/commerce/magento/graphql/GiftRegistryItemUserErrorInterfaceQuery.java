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
 * Contains the status and any errors that encountered with the customer&#39;s gift register item
 */
public class GiftRegistryItemUserErrorInterfaceQuery extends AbstractQuery<GiftRegistryItemUserErrorInterfaceQuery> {
    GiftRegistryItemUserErrorInterfaceQuery(StringBuilder _queryBuilder) {
        this(_queryBuilder, true);
    }

    GiftRegistryItemUserErrorInterfaceQuery(StringBuilder _queryBuilder, boolean addTypename) {
        super(_queryBuilder);
        if (addTypename) {
            startField("__typename");
        }
    }

    /**
     * Indicates whether the attempt to move the cart items to the gift registry was successful
     */
    public GiftRegistryItemUserErrorInterfaceQuery status() {
        startField("status");

        return this;
    }

    /**
     * An array of errors encountered while moving items from the cart to the gift registry
     */
    public GiftRegistryItemUserErrorInterfaceQuery userErrors(GiftRegistryItemsUserErrorQueryDefinition queryDef) {
        startField("user_errors");

        _queryBuilder.append('{');
        queryDef.define(new GiftRegistryItemsUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public GiftRegistryItemUserErrorInterfaceQuery onGiftRegistryItemUserErrors(GiftRegistryItemUserErrorsQueryDefinition queryDef) {
        startInlineFragment("GiftRegistryItemUserErrors");
        queryDef.define(new GiftRegistryItemUserErrorsQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public GiftRegistryItemUserErrorInterfaceQuery onMoveCartItemsToGiftRegistryOutput(
        MoveCartItemsToGiftRegistryOutputQueryDefinition queryDef) {
        startInlineFragment("MoveCartItemsToGiftRegistryOutput");
        queryDef.define(new MoveCartItemsToGiftRegistryOutputQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public GiftRegistryItemUserErrorInterfaceQuery onGiftRegistryOutputInterface(GiftRegistryOutputInterfaceQueryDefinition queryDef) {
        startInlineFragment("GiftRegistryOutputInterface");
        queryDef.define(new GiftRegistryOutputInterfaceQuery(_queryBuilder));
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
    public static Fragment<GiftRegistryItemUserErrorInterfaceQuery> createFragment(String name,
        GiftRegistryItemUserErrorInterfaceQueryDefinition queryDef) {
        StringBuilder sb = new StringBuilder();
        queryDef.define(new GiftRegistryItemUserErrorInterfaceQuery(sb, false));
        return new Fragment<>(name, "GiftRegistryItemUserErrorInterface", sb.toString());
    }

    /**
     * Adds a <code>GiftRegistryItemUserErrorInterfaceQuery</code> fragment reference at the current position of the query.
     * For example for a fragment named <code>test</code>, calling this method will add the
     * reference <code>...test</code> in the query. For GraphQL types implementing an interface, there
     * will be some similar methods using the Query type of each implemented interface.
     * 
     * @param fragment The fragment to reference.
     */
    public GiftRegistryItemUserErrorInterfaceQuery addFragmentReference(Fragment<GiftRegistryItemUserErrorInterfaceQuery> fragment) {
        startField("..." + fragment.getName());
        return this;
    }
}

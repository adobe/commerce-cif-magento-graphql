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

public class GiftRegistryItemInterfaceQuery extends AbstractQuery<GiftRegistryItemInterfaceQuery> {
    GiftRegistryItemInterfaceQuery(StringBuilder _queryBuilder) {
        this(_queryBuilder, true);
    }

    GiftRegistryItemInterfaceQuery(StringBuilder _queryBuilder, boolean addTypename) {
        super(_queryBuilder);
        if (addTypename) {
            startField("__typename");
        }
    }

    /**
     * The date the product was added to the gift registry
     */
    public GiftRegistryItemInterfaceQuery createdAt() {
        startField("created_at");

        return this;
    }

    /**
     * A brief message about the gift registry item
     */
    public GiftRegistryItemInterfaceQuery note() {
        startField("note");

        return this;
    }

    public GiftRegistryItemInterfaceQuery product(ProductInterfaceQueryDefinition queryDef) {
        startField("product");

        _queryBuilder.append('{');
        queryDef.define(new ProductInterfaceQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The requested quantity of the product
     */
    public GiftRegistryItemInterfaceQuery quantity() {
        startField("quantity");

        return this;
    }

    /**
     * The fulfilled quantity of the product
     */
    public GiftRegistryItemInterfaceQuery quantityFulfilled() {
        startField("quantity_fulfilled");

        return this;
    }

    /**
     * The unique ID of a gift registry item
     */
    public GiftRegistryItemInterfaceQuery uid() {
        startField("uid");

        return this;
    }

    public GiftRegistryItemInterfaceQuery onGiftRegistryItem(GiftRegistryItemQueryDefinition queryDef) {
        startInlineFragment("GiftRegistryItem");
        queryDef.define(new GiftRegistryItemQuery(_queryBuilder));
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
    public static Fragment<GiftRegistryItemInterfaceQuery> createFragment(String name, GiftRegistryItemInterfaceQueryDefinition queryDef) {
        StringBuilder sb = new StringBuilder();
        queryDef.define(new GiftRegistryItemInterfaceQuery(sb, false));
        return new Fragment<>(name, "GiftRegistryItemInterface", sb.toString());
    }

    /**
     * Adds a <code>GiftRegistryItemInterfaceQuery</code> fragment reference at the current position of the query.
     * For example for a fragment named <code>test</code>, calling this method will add the
     * reference <code>...test</code> in the query. For GraphQL types implementing an interface, there
     * will be some similar methods using the Query type of each implemented interface.
     * 
     * @param fragment The fragment to reference.
     */
    public GiftRegistryItemInterfaceQuery addFragmentReference(Fragment<GiftRegistryItemInterfaceQuery> fragment) {
        startField("..." + fragment.getName());
        return this;
    }
}

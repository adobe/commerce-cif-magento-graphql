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
 * Contains details about the selected or available gift wrapping options.
 */
public class GiftWrappingQuery extends AbstractQuery<GiftWrappingQuery> {
    GiftWrappingQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
     * The name of the gift wrapping design.
     */
    public GiftWrappingQuery design() {
        startField("design");

        return this;
    }

    /**
     * The unique ID for a `GiftWrapping` object.
     *
     * @deprecated Use `uid` instead
     */
    @Deprecated
    public GiftWrappingQuery id() {
        startField("id");

        return this;
    }

    /**
     * The preview image for a gift wrapping option.
     */
    public GiftWrappingQuery image(GiftWrappingImageQueryDefinition queryDef) {
        startField("image");

        _queryBuilder.append('{');
        queryDef.define(new GiftWrappingImageQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The gift wrapping price.
     */
    public GiftWrappingQuery price(MoneyQueryDefinition queryDef) {
        startField("price");

        _queryBuilder.append('{');
        queryDef.define(new MoneyQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The unique ID for a `GiftWrapping` object.
     */
    public GiftWrappingQuery uid() {
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
    public static Fragment<GiftWrappingQuery> createFragment(String name, GiftWrappingQueryDefinition queryDef) {
        StringBuilder sb = new StringBuilder();
        queryDef.define(new GiftWrappingQuery(sb));
        return new Fragment<>(name, "GiftWrapping", sb.toString());
    }

    /**
     * Adds a <code>GiftWrappingQuery</code> fragment reference at the current position of the query.
     * For example for a fragment named <code>test</code>, calling this method will add the
     * reference <code>...test</code> in the query. For GraphQL types implementing an interface, there
     * will be some similar methods using the Query type of each implemented interface.
     * 
     * @param fragment The fragment to reference.
     */
    public GiftWrappingQuery addFragmentReference(Fragment<GiftWrappingQuery> fragment) {
        startField("..." + fragment.getName());
        return this;
    }
}

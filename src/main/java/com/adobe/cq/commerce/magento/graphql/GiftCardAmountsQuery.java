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
import com.shopify.graphql.support.ID;

/**
 * GiftCardAmounts contains the value of a gift card, the website that generated the card, and related
 * information
 */
public class GiftCardAmountsQuery extends AbstractQuery<GiftCardAmountsQuery> {
    GiftCardAmountsQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
     * An internal attribute ID.
     */
    public GiftCardAmountsQuery attributeId() {
        startField("attribute_id");

        return this;
    }

    /**
     * A string that encodes option details.
     */
    public GiftCardAmountsQuery uid() {
        startField("uid");

        return this;
    }

    /**
     * The value of the gift card
     */
    public GiftCardAmountsQuery value() {
        startField("value");

        return this;
    }

    /**
     * An ID that is assigned to each unique gift card amount.
     */
    public GiftCardAmountsQuery valueId() {
        startField("value_id");

        return this;
    }

    /**
     * ID of the website that generated the gift card
     */
    public GiftCardAmountsQuery websiteId() {
        startField("website_id");

        return this;
    }

    /**
     * The value of the gift card
     */
    public GiftCardAmountsQuery websiteValue() {
        startField("website_value");

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
    public static Fragment<GiftCardAmountsQuery> createFragment(String name, GiftCardAmountsQueryDefinition queryDef) {
        StringBuilder sb = new StringBuilder();
        queryDef.define(new GiftCardAmountsQuery(sb));
        return new Fragment<>(name, "GiftCardAmounts", sb.toString());
    }

    /**
     * Adds a <code>GiftCardAmountsQuery</code> fragment reference at the current position of the query.
     * For example for a fragment named <code>test</code>, calling this method will add the
     * reference <code>...test</code> in the query. For GraphQL types implementing an interface, there
     * will be some similar methods using the Query type of each implemented interface.
     * 
     * @param fragment The fragment to reference.
     */
    public GiftCardAmountsQuery addFragmentReference(Fragment<GiftCardAmountsQuery> fragment) {
        startField("..." + fragment.getName());
        return this;
    }
}

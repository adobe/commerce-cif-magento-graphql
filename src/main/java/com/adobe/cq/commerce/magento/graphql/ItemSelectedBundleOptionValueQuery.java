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
 * A list of values for the selected bundle product
 */
public class ItemSelectedBundleOptionValueQuery extends AbstractQuery<ItemSelectedBundleOptionValueQuery> {
    ItemSelectedBundleOptionValueQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
     * The unique ID for a `ItemSelectedBundleOptionValue` object
     *
     * @deprecated Use `uid` instead
     */
    @Deprecated
    public ItemSelectedBundleOptionValueQuery id() {
        startField("id");

        return this;
    }

    /**
     * The price of the child bundle product
     */
    public ItemSelectedBundleOptionValueQuery price(MoneyQueryDefinition queryDef) {
        startField("price");

        _queryBuilder.append('{');
        queryDef.define(new MoneyQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The name of the child bundle product
     */
    public ItemSelectedBundleOptionValueQuery productName() {
        startField("product_name");

        return this;
    }

    /**
     * The SKU of the child bundle product
     */
    public ItemSelectedBundleOptionValueQuery productSku() {
        startField("product_sku");

        return this;
    }

    /**
     * Indicates how many of this bundle product were ordered
     */
    public ItemSelectedBundleOptionValueQuery quantity() {
        startField("quantity");

        return this;
    }

    /**
     * The unique ID for a `ItemSelectedBundleOptionValue` object
     */
    public ItemSelectedBundleOptionValueQuery uid() {
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
    public static Fragment<ItemSelectedBundleOptionValueQuery> createFragment(String name,
        ItemSelectedBundleOptionValueQueryDefinition queryDef) {
        StringBuilder sb = new StringBuilder();
        queryDef.define(new ItemSelectedBundleOptionValueQuery(sb));
        return new Fragment<>(name, "ItemSelectedBundleOptionValue", sb.toString());
    }

    /**
     * Adds a <code>ItemSelectedBundleOptionValueQuery</code> fragment reference at the current position of the query.
     * For example for a fragment named <code>test</code>, calling this method will add the
     * reference <code>...test</code> in the query. For GraphQL types implementing an interface, there
     * will be some similar methods using the Query type of each implemented interface.
     * 
     * @param fragment The fragment to reference.
     */
    public ItemSelectedBundleOptionValueQuery addFragmentReference(Fragment<ItemSelectedBundleOptionValueQuery> fragment) {
        startField("..." + fragment.getName());
        return this;
    }
}

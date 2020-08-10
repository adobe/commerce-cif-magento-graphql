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
 * PhysicalProductInterface contains attributes specific to tangible products.
 */
public class PhysicalProductInterfaceQuery extends AbstractQuery<PhysicalProductInterfaceQuery> {
    PhysicalProductInterfaceQuery(StringBuilder _queryBuilder) {
        this(_queryBuilder, true);
    }
    PhysicalProductInterfaceQuery(StringBuilder _queryBuilder, boolean addTypename) {
        super(_queryBuilder);
        if (addTypename) {
            startField("__typename");
        }
    }

    /**
     * The weight of the item, in units defined by the store.
     */
    public PhysicalProductInterfaceQuery weight() {
        startField("weight");

        return this;
    }

    public PhysicalProductInterfaceQuery onBundleProduct(BundleProductQueryDefinition queryDef) {
        startInlineFragment("BundleProduct");
        queryDef.define(new BundleProductQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public PhysicalProductInterfaceQuery onConfigurableProduct(ConfigurableProductQueryDefinition queryDef) {
        startInlineFragment("ConfigurableProduct");
        queryDef.define(new ConfigurableProductQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public PhysicalProductInterfaceQuery onGroupedProduct(GroupedProductQueryDefinition queryDef) {
        startInlineFragment("GroupedProduct");
        queryDef.define(new GroupedProductQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public PhysicalProductInterfaceQuery onSimpleProduct(SimpleProductQueryDefinition queryDef) {
        startInlineFragment("SimpleProduct");
        queryDef.define(new SimpleProductQuery(_queryBuilder));
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
    public static Fragment<PhysicalProductInterfaceQuery> createFragment(String name, PhysicalProductInterfaceQueryDefinition queryDef) {
        StringBuilder sb = new StringBuilder();
        queryDef.define(new PhysicalProductInterfaceQuery(sb, false));
        return new Fragment<>(name, "PhysicalProductInterface", sb.toString());
    }

    /**
     * Adds a <code>PhysicalProductInterfaceQuery</code> fragment reference at the current position of the query.
     * For example for a fragment named <code>test</code>, calling this method will add the
     * reference <code>...test</code> in the query. For GraphQL types implementing an interface, there
     * will be some similar methods using the Query type of each implemented interface.
     * 
     * @param fragment The fragment to reference.
     */
    public PhysicalProductInterfaceQuery addFragmentReference(Fragment<PhysicalProductInterfaceQuery> fragment) {
        startField("..." + fragment.getName());
        return this;
    }
}

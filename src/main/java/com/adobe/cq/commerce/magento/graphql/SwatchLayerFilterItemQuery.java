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

public class SwatchLayerFilterItemQuery extends AbstractQuery<SwatchLayerFilterItemQuery> {
    SwatchLayerFilterItemQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
     * Count of items by filter.
     *
     * @deprecated Use AggregationOption.count instead.
     */
    @Deprecated
    public SwatchLayerFilterItemQuery itemsCount() {
        startField("items_count");

        return this;
    }

    /**
     * Filter label.
     *
     * @deprecated Use AggregationOption.label instead.
     */
    @Deprecated
    public SwatchLayerFilterItemQuery label() {
        startField("label");

        return this;
    }

    /**
     * Data required to render swatch filter item
     */
    public SwatchLayerFilterItemQuery swatchData(SwatchDataQueryDefinition queryDef) {
        startField("swatch_data");

        _queryBuilder.append('{');
        queryDef.define(new SwatchDataQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Value for filter request variable to be used in query.
     *
     * @deprecated Use AggregationOption.value instead.
     */
    @Deprecated
    public SwatchLayerFilterItemQuery valueString() {
        startField("value_string");

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
    public static Fragment<SwatchLayerFilterItemQuery> createFragment(String name, SwatchLayerFilterItemQueryDefinition queryDef) {
        StringBuilder sb = new StringBuilder();
        queryDef.define(new SwatchLayerFilterItemQuery(sb));
        return new Fragment<>(name, "SwatchLayerFilterItem", sb.toString());
    }

    /**
     * Adds a <code>SwatchLayerFilterItemQuery</code> fragment reference at the current position of the query.
     * For example for a fragment named <code>test</code>, calling this method will add the
     * reference <code>...test</code> in the query. For GraphQL types implementing an interface, there
     * will be some similar methods using the Query type of each implemented interface.
     * 
     * @param fragment The fragment to reference.
     */
    public SwatchLayerFilterItemQuery addFragmentReference(Fragment<SwatchLayerFilterItemQuery> fragment) {
        startField("..." + fragment.getName());
        return this;
    }

    /**
     * Adds a <code>LayerFilterItemInterfaceQuery</code> fragment reference at the current position of the query.
     * For example for a fragment named <code>test</code>, calling this method will add the
     * reference <code>...test</code> in the query.
     * 
     * @param fragment The fragment to reference.
     */
    public SwatchLayerFilterItemQuery addLayerFilterItemInterfaceFragmentReference(Fragment<LayerFilterItemInterfaceQuery> fragment) {
        startField("..." + fragment.getName());
        return this;
    }

    /**
     * Adds a <code>SwatchLayerFilterItemInterfaceQuery</code> fragment reference at the current position of the query.
     * For example for a fragment named <code>test</code>, calling this method will add the
     * reference <code>...test</code> in the query.
     * 
     * @param fragment The fragment to reference.
     */
    public SwatchLayerFilterItemQuery addSwatchLayerFilterItemInterfaceFragmentReference(
        Fragment<SwatchLayerFilterItemInterfaceQuery> fragment) {
        startField("..." + fragment.getName());
        return this;
    }
}

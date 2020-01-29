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

public class LayerFilterItemInterfaceQuery extends AbstractQuery<LayerFilterItemInterfaceQuery> {
    LayerFilterItemInterfaceQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
    }

    /**
     * Count of items by filter.
     *
     * @deprecated Use AggregationOption.count instead.
     */
    @Deprecated
    public LayerFilterItemInterfaceQuery itemsCount() {
        startField("items_count");

        return this;
    }

    /**
     * Filter label.
     *
     * @deprecated Use AggregationOption.label instead.
     */
    @Deprecated
    public LayerFilterItemInterfaceQuery label() {
        startField("label");

        return this;
    }

    /**
     * Value for filter request variable to be used in query.
     *
     * @deprecated Use AggregationOption.value instead.
     */
    @Deprecated
    public LayerFilterItemInterfaceQuery valueString() {
        startField("value_string");

        return this;
    }

    public LayerFilterItemInterfaceQuery onLayerFilterItem(LayerFilterItemQueryDefinition queryDef) {
        startInlineFragment("LayerFilterItem");
        queryDef.define(new LayerFilterItemQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public LayerFilterItemInterfaceQuery onSwatchLayerFilterItem(SwatchLayerFilterItemQueryDefinition queryDef) {
        startInlineFragment("SwatchLayerFilterItem");
        queryDef.define(new SwatchLayerFilterItemQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}

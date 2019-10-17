/*******************************************************************************
 *
 *    Copyright 2019 Adobe. All rights reserved.
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

/**
 * 
 */
public class LayerFilterQuery extends AbstractQuery<LayerFilterQuery> {
    LayerFilterQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
     * Array of filter items.
     */
    public LayerFilterQuery filterItems(LayerFilterItemInterfaceQueryDefinition queryDef) {
        startField("filter_items");

        _queryBuilder.append('{');
        queryDef.define(new LayerFilterItemInterfaceQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Count of filter items in filter group.
     */
    public LayerFilterQuery filterItemsCount() {
        startField("filter_items_count");

        return this;
    }

    /**
     * Layered navigation filter name.
     */
    public LayerFilterQuery name() {
        startField("name");

        return this;
    }

    /**
     * Request variable name for filter query.
     */
    public LayerFilterQuery requestVar() {
        startField("request_var");

        return this;
    }
}

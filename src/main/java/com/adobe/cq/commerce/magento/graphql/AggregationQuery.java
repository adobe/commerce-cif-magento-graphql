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
 * A bucket that contains information for each filterable option (such as price, category ID, and
 * custom attributes).
 */
public class AggregationQuery extends AbstractQuery<AggregationQuery> {
    AggregationQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
     * Attribute code of the aggregation group.
     */
    public AggregationQuery attributeCode() {
        startField("attribute_code");

        return this;
    }

    /**
     * The number of options in the aggregation group.
     */
    public AggregationQuery count() {
        startField("count");

        return this;
    }

    /**
     * The aggregation display name.
     */
    public AggregationQuery label() {
        startField("label");

        return this;
    }

    /**
     * Array of options for the aggregation.
     */
    public AggregationQuery options(AggregationOptionQueryDefinition queryDef) {
        startField("options");

        _queryBuilder.append('{');
        queryDef.define(new AggregationOptionQuery(_queryBuilder));
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
    public static Fragment<AggregationQuery> createFragment(String name, AggregationQueryDefinition queryDef) {
        StringBuilder sb = new StringBuilder();
        queryDef.define(new AggregationQuery(sb));
        return new Fragment<>(name, "Aggregation", sb.toString());
    }

    /**
     * Adds a <code>AggregationQuery</code> fragment reference at the current position of the query.
     * For example for a fragment named <code>test</code>, calling this method will add the
     * reference <code>...test</code> in the query. For GraphQL types implementing an interface, there
     * will be some similar methods using the Query type of each implemented interface.
     * 
     * @param fragment The fragment to reference.
     */
    public AggregationQuery addFragmentReference(Fragment<AggregationQuery> fragment) {
        startField("..." + fragment.getName());
        return this;
    }
}

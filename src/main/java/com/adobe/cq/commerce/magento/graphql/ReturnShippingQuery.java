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
import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Fragment;
import com.shopify.graphql.support.ID;

/**
 * Contains details about the return shipping address.
 */
public class ReturnShippingQuery extends AbstractQuery<ReturnShippingQuery> {
    ReturnShippingQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
     * The merchant-defined return shipping address.
     */
    public ReturnShippingQuery address(ReturnShippingAddressQueryDefinition queryDef) {
        startField("address");

        _queryBuilder.append('{');
        queryDef.define(new ReturnShippingAddressQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class TrackingArguments extends Arguments {
        TrackingArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        public TrackingArguments uid(ID value) {
            if (value != null) {
                startArgument("uid");
                AbstractQuery.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }
    }

    public interface TrackingArgumentsDefinition {
        void define(TrackingArguments args);
    }

    /**
     * The unique ID for a `ReturnShippingTracking` object. If a single UID is specified, the array
     * contains a single tracking record. Otherwise, array contains all tracking information.
     */
    public ReturnShippingQuery tracking(ReturnShippingTrackingQueryDefinition queryDef) {
        return tracking(args -> {}, queryDef);
    }

    /**
     * The unique ID for a `ReturnShippingTracking` object. If a single UID is specified, the array
     * contains a single tracking record. Otherwise, array contains all tracking information.
     */
    public ReturnShippingQuery tracking(TrackingArgumentsDefinition argsDef, ReturnShippingTrackingQueryDefinition queryDef) {
        startField("tracking");

        TrackingArguments args = new TrackingArguments(_queryBuilder);
        argsDef.define(args);
        TrackingArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ReturnShippingTrackingQuery(_queryBuilder));
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
    public static Fragment<ReturnShippingQuery> createFragment(String name, ReturnShippingQueryDefinition queryDef) {
        StringBuilder sb = new StringBuilder();
        queryDef.define(new ReturnShippingQuery(sb));
        return new Fragment<>(name, "ReturnShipping", sb.toString());
    }

    /**
     * Adds a <code>ReturnShippingQuery</code> fragment reference at the current position of the query.
     * For example for a fragment named <code>test</code>, calling this method will add the
     * reference <code>...test</code> in the query. For GraphQL types implementing an interface, there
     * will be some similar methods using the Query type of each implemented interface.
     * 
     * @param fragment The fragment to reference.
     */
    public ReturnShippingQuery addFragmentReference(Fragment<ReturnShippingQuery> fragment) {
        startField("..." + fragment.getName());
        return this;
    }
}

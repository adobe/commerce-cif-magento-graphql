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

/**
 * Contains the results of a `products` query.
 */
public class ProductsQuery extends AbstractQuery<ProductsQuery> {
    ProductsQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public class AggregationsArguments extends Arguments {
        AggregationsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        public AggregationsArguments filter(AggregationsFilterInput value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }
    }

    public interface AggregationsArgumentsDefinition {
        void define(AggregationsArguments args);
    }

    /**
     * A bucket that contains the attribute code and label for each filterable option.
     */
    public ProductsQuery aggregations(AggregationQueryDefinition queryDef) {
        return aggregations(args -> {}, queryDef);
    }

    /**
     * A bucket that contains the attribute code and label for each filterable option.
     */
    public ProductsQuery aggregations(AggregationsArgumentsDefinition argsDef, AggregationQueryDefinition queryDef) {
        startField("aggregations");

        AggregationsArguments args = new AggregationsArguments(_queryBuilder);
        argsDef.define(args);
        AggregationsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new AggregationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Layered navigation filters array.
     *
     * @deprecated Use `aggregations` instead.
     */
    @Deprecated
    public ProductsQuery filters(LayerFilterQueryDefinition queryDef) {
        startField("filters");

        _queryBuilder.append('{');
        queryDef.define(new LayerFilterQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * An array of products that match the specified search criteria.
     */
    public ProductsQuery items(ProductInterfaceQueryDefinition queryDef) {
        startField("items");

        _queryBuilder.append('{');
        queryDef.define(new ProductInterfaceQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * An object that includes the page_info and currentPage values specified in the query.
     */
    public ProductsQuery pageInfo(SearchResultPageInfoQueryDefinition queryDef) {
        startField("page_info");

        _queryBuilder.append('{');
        queryDef.define(new SearchResultPageInfoQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * An object that includes the default sort field and all available sort fields.
     */
    public ProductsQuery sortFields(SortFieldsQueryDefinition queryDef) {
        startField("sort_fields");

        _queryBuilder.append('{');
        queryDef.define(new SortFieldsQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * An array of search suggestions for case when search query have no results.
     */
    public ProductsQuery suggestions(SearchSuggestionQueryDefinition queryDef) {
        startField("suggestions");

        _queryBuilder.append('{');
        queryDef.define(new SearchSuggestionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The number of products that are marked as visible. By default, in complex products, parent products
     * are visible, but their child products are not.
     */
    public ProductsQuery totalCount() {
        startField("total_count");

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
    public static Fragment<ProductsQuery> createFragment(String name, ProductsQueryDefinition queryDef) {
        StringBuilder sb = new StringBuilder();
        queryDef.define(new ProductsQuery(sb));
        return new Fragment<>(name, "Products", sb.toString());
    }

    /**
     * Adds a <code>ProductsQuery</code> fragment reference at the current position of the query.
     * For example for a fragment named <code>test</code>, calling this method will add the
     * reference <code>...test</code> in the query. For GraphQL types implementing an interface, there
     * will be some similar methods using the Query type of each implemented interface.
     * 
     * @param fragment The fragment to reference.
     */
    public ProductsQuery addFragmentReference(Fragment<ProductsQuery> fragment) {
        startField("..." + fragment.getName());
        return this;
    }
}

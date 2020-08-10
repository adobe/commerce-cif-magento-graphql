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
 * ProductPrices is deprecated, replaced by PriceRange. The ProductPrices object contains the regular
 * price of an item, as well as its minimum and maximum prices. Only composite products, which include
 * bundle, configurable, and grouped products, can contain a minimum and maximum price.
 */
public class ProductPricesQuery extends AbstractQuery<ProductPricesQuery> {
    ProductPricesQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
     * The highest possible final price for all the options defined within a composite product. If you are
     * specifying a price range, this would be the to value.
     *
     * @deprecated Use PriceRange.maximum_price.
     */
    @Deprecated
    public ProductPricesQuery maximalPrice(PriceQueryDefinition queryDef) {
        startField("maximalPrice");

        _queryBuilder.append('{');
        queryDef.define(new PriceQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The lowest possible final price for all the options defined within a composite product. If you are
     * specifying a price range, this would be the from value.
     *
     * @deprecated Use PriceRange.minimum_price.
     */
    @Deprecated
    public ProductPricesQuery minimalPrice(PriceQueryDefinition queryDef) {
        startField("minimalPrice");

        _queryBuilder.append('{');
        queryDef.define(new PriceQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The base price of a product.
     *
     * @deprecated Use regular_price from PriceRange.minimum_price or PriceRange.maximum_price.
     */
    @Deprecated
    public ProductPricesQuery regularPrice(PriceQueryDefinition queryDef) {
        startField("regularPrice");

        _queryBuilder.append('{');
        queryDef.define(new PriceQuery(_queryBuilder));
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
    public static Fragment<ProductPricesQuery> createFragment(String name, ProductPricesQueryDefinition queryDef) {
        StringBuilder sb = new StringBuilder();
        queryDef.define(new ProductPricesQuery(sb));
        return new Fragment<>(name, "ProductPrices", sb.toString());
    }

    /**
     * Adds a <code>ProductPricesQuery</code> fragment reference at the current position of the query.
     * For example for a fragment named <code>test</code>, calling this method will add the
     * reference <code>...test</code> in the query. For GraphQL types implementing an interface, there
     * will be some similar methods using the Query type of each implemented interface.
     * 
     * @param fragment The fragment to reference.
     */
    public ProductPricesQuery addFragmentReference(Fragment<ProductPricesQuery> fragment) {
        startField("..." + fragment.getName());
        return this;
    }
}

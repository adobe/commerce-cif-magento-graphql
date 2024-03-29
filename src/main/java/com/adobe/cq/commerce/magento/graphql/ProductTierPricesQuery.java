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
 * Deprecated. Use `TierPrice` instead. Defines a tier price, which is a quantity discount offered to a
 * specific customer group.
 */
public class ProductTierPricesQuery extends AbstractQuery<ProductTierPricesQuery> {
    ProductTierPricesQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
     * The ID of the customer group.
     *
     * @deprecated Not relevant for the storefront.
     */
    @Deprecated
    public ProductTierPricesQuery customerGroupId() {
        startField("customer_group_id");

        return this;
    }

    /**
     * The percentage discount of the item.
     *
     * @deprecated Use `TierPrice.discount` instead.
     */
    @Deprecated
    public ProductTierPricesQuery percentageValue() {
        startField("percentage_value");

        return this;
    }

    /**
     * The number of items that must be purchased to qualify for tier pricing.
     *
     * @deprecated Use `TierPrice.quantity` instead.
     */
    @Deprecated
    public ProductTierPricesQuery qty() {
        startField("qty");

        return this;
    }

    /**
     * The price of the fixed price item.
     *
     * @deprecated Use `TierPrice.final_price` instead.
     */
    @Deprecated
    public ProductTierPricesQuery value() {
        startField("value");

        return this;
    }

    /**
     * The ID assigned to the website.
     *
     * @deprecated Not relevant for the storefront.
     */
    @Deprecated
    public ProductTierPricesQuery websiteId() {
        startField("website_id");

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
    public static Fragment<ProductTierPricesQuery> createFragment(String name, ProductTierPricesQueryDefinition queryDef) {
        StringBuilder sb = new StringBuilder();
        queryDef.define(new ProductTierPricesQuery(sb));
        return new Fragment<>(name, "ProductTierPrices", sb.toString());
    }

    /**
     * Adds a <code>ProductTierPricesQuery</code> fragment reference at the current position of the query.
     * For example for a fragment named <code>test</code>, calling this method will add the
     * reference <code>...test</code> in the query. For GraphQL types implementing an interface, there
     * will be some similar methods using the Query type of each implemented interface.
     * 
     * @param fragment The fragment to reference.
     */
    public ProductTierPricesQuery addFragmentReference(Fragment<ProductTierPricesQuery> fragment) {
        startField("..." + fragment.getName());
        return this;
    }
}

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
 * Contains information about linked products, including the link type and product type of each item.
 */
public class ProductLinksInterfaceQuery extends AbstractQuery<ProductLinksInterfaceQuery> {
    ProductLinksInterfaceQuery(StringBuilder _queryBuilder) {
        this(_queryBuilder, true);
    }

    ProductLinksInterfaceQuery(StringBuilder _queryBuilder, boolean addTypename) {
        super(_queryBuilder);
        if (addTypename) {
            startField("__typename");
        }
    }

    /**
     * One of related, associated, upsell, or crosssell.
     */
    public ProductLinksInterfaceQuery linkType() {
        startField("link_type");

        return this;
    }

    /**
     * The SKU of the linked product.
     */
    public ProductLinksInterfaceQuery linkedProductSku() {
        startField("linked_product_sku");

        return this;
    }

    /**
     * The type of linked product (simple, virtual, bundle, downloadable, grouped, configurable).
     */
    public ProductLinksInterfaceQuery linkedProductType() {
        startField("linked_product_type");

        return this;
    }

    /**
     * The position within the list of product links.
     */
    public ProductLinksInterfaceQuery position() {
        startField("position");

        return this;
    }

    /**
     * The identifier of the linked product.
     */
    public ProductLinksInterfaceQuery sku() {
        startField("sku");

        return this;
    }

    public ProductLinksInterfaceQuery onProductLinks(ProductLinksQueryDefinition queryDef) {
        startInlineFragment("ProductLinks");
        queryDef.define(new ProductLinksQuery(_queryBuilder));
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
    public static Fragment<ProductLinksInterfaceQuery> createFragment(String name, ProductLinksInterfaceQueryDefinition queryDef) {
        StringBuilder sb = new StringBuilder();
        queryDef.define(new ProductLinksInterfaceQuery(sb, false));
        return new Fragment<>(name, "ProductLinksInterface", sb.toString());
    }

    /**
     * Adds a <code>ProductLinksInterfaceQuery</code> fragment reference at the current position of the query.
     * For example for a fragment named <code>test</code>, calling this method will add the
     * reference <code>...test</code> in the query. For GraphQL types implementing an interface, there
     * will be some similar methods using the Query type of each implemented interface.
     * 
     * @param fragment The fragment to reference.
     */
    public ProductLinksInterfaceQuery addFragmentReference(Fragment<ProductLinksInterfaceQuery> fragment) {
        startField("..." + fragment.getName());
        return this;
    }
}

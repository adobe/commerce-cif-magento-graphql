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

import java.util.function.Function;

public class TestGraphqlQueries {

    /**
     * Test query for product price
     */
    public static final ProductPricesQueryDefinition PRODUCT_PRICE_QUERY = q -> q
        .regularPrice(rp -> rp
            .amount(a -> a
                .currency()
                .value()));

    /**
     * Test query for simple product
     */
    public static final SimpleProductQueryDefinition SIMPLE_PRODUCT_QUERY = q -> q
        .id()
        .sku()
        .name()
        .description()
        .image()
        .thumbnail()
        .urlKey()
        .updatedAt()
        .createdAt()
        .price(PRODUCT_PRICE_QUERY);

    /**
     * Test query for configurable product including variants
     */
    public static final ProductInterfaceQueryDefinition CONFIGURABLE_PRODUCT_QUERY = q -> q
        .id()
        .sku()
        .name()
        .description()
        .image()
        .thumbnail()
        .urlKey()
        .updatedAt()
        .createdAt()
        .price(PRODUCT_PRICE_QUERY)
        .categories(c -> c.urlPath())
        .onConfigurableProduct(cp -> cp
            .variants(v -> v
                .product(SIMPLE_PRODUCT_QUERY)));

    /**
     * Test "lambda" query for category tree WITHOUT "children" part.
     * The "children" part cannot be added because it would otherwise introduce an infinite recursion.
     */
    public static final Function<CategoryTreeQuery, CategoryTreeQuery> CATEGORY_TREE_LAMBDA = q -> q
        .id()
        .name()
        .urlPath()
        .productCount()
        .childrenCount();
}

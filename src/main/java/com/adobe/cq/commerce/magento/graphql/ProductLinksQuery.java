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

/**
 * ProductLinks is an implementation of ProductLinksInterface.
 */
public class ProductLinksQuery extends AbstractQuery<ProductLinksQuery> {
    ProductLinksQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
     * One of related, associated, upsell, or crosssell.
     */
    public ProductLinksQuery linkType() {
        startField("link_type");

        return this;
    }

    /**
     * The SKU of the linked product.
     */
    public ProductLinksQuery linkedProductSku() {
        startField("linked_product_sku");

        return this;
    }

    /**
     * The type of linked product (simple, virtual, bundle, downloadable, grouped, configurable).
     */
    public ProductLinksQuery linkedProductType() {
        startField("linked_product_type");

        return this;
    }

    /**
     * The position within the list of product links.
     */
    public ProductLinksQuery position() {
        startField("position");

        return this;
    }

    /**
     * The identifier of the linked product.
     */
    public ProductLinksQuery sku() {
        startField("sku");

        return this;
    }
}

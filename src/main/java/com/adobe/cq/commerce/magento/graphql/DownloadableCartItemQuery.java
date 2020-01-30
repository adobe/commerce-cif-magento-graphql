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
 * Downloadable Cart Item
 */
public class DownloadableCartItemQuery extends AbstractQuery<DownloadableCartItemQuery> {
    DownloadableCartItemQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public DownloadableCartItemQuery customizableOptions(SelectedCustomizableOptionQueryDefinition queryDef) {
        startField("customizable_options");

        _queryBuilder.append('{');
        queryDef.define(new SelectedCustomizableOptionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public DownloadableCartItemQuery id() {
        startField("id");

        return this;
    }

    /**
     * An array containing information about the links for the added to cart downloadable product
     */
    public DownloadableCartItemQuery links(DownloadableProductLinksQueryDefinition queryDef) {
        startField("links");

        _queryBuilder.append('{');
        queryDef.define(new DownloadableProductLinksQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public DownloadableCartItemQuery prices(CartItemPricesQueryDefinition queryDef) {
        startField("prices");

        _queryBuilder.append('{');
        queryDef.define(new CartItemPricesQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public DownloadableCartItemQuery product(ProductInterfaceQueryDefinition queryDef) {
        startField("product");

        _queryBuilder.append('{');
        queryDef.define(new ProductInterfaceQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public DownloadableCartItemQuery quantity() {
        startField("quantity");

        return this;
    }

    /**
     * DownloadableProductSamples defines characteristics of a downloadable product
     */
    public DownloadableCartItemQuery samples(DownloadableProductSamplesQueryDefinition queryDef) {
        startField("samples");

        _queryBuilder.append('{');
        queryDef.define(new DownloadableProductSamplesQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}

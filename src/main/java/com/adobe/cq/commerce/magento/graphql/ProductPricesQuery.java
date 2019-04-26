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
* The ProductPrices object contains the regular price of an item, as well as its minimum and maximum
* prices. Only composite products, which include bundle, configurable, and grouped products, can
* contain a minimum and maximum price.
*/
public class ProductPricesQuery extends AbstractQuery<ProductPricesQuery> {
    ProductPricesQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The highest possible final price for all the options defined within a composite product. If you are
    * specifying a price range, this would be the to value.
    */
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
    */
    public ProductPricesQuery minimalPrice(PriceQueryDefinition queryDef) {
        startField("minimalPrice");

        _queryBuilder.append('{');
        queryDef.define(new PriceQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The base price of a product.
    */
    public ProductPricesQuery regularPrice(PriceQueryDefinition queryDef) {
        startField("regularPrice");

        _queryBuilder.append('{');
        queryDef.define(new PriceQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}

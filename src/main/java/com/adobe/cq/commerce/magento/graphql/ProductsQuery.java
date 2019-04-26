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
* The Products object is the top-level object returned in a product search
*/
public class ProductsQuery extends AbstractQuery<ProductsQuery> {
    ProductsQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * Layered navigation filters array
    */
    public ProductsQuery filters(LayerFilterQueryDefinition queryDef) {
        startField("filters");

        _queryBuilder.append('{');
        queryDef.define(new LayerFilterQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * An array of products that match the specified search criteria
    */
    public ProductsQuery items(ProductInterfaceQueryDefinition queryDef) {
        startField("items");

        _queryBuilder.append('{');
        queryDef.define(new ProductInterfaceQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * An object that includes the page_info and currentPage values specified in the query
    */
    public ProductsQuery pageInfo(SearchResultPageInfoQueryDefinition queryDef) {
        startField("page_info");

        _queryBuilder.append('{');
        queryDef.define(new SearchResultPageInfoQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * An object that includes the default sort field and all available sort fields
    */
    public ProductsQuery sortFields(SortFieldsQueryDefinition queryDef) {
        startField("sort_fields");

        _queryBuilder.append('{');
        queryDef.define(new SortFieldsQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The number of products returned
    */
    public ProductsQuery totalCount() {
        startField("total_count");

        return this;
    }
}

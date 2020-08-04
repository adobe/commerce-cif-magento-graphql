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
 * A collection of CategoryTree objects and pagination information.
 */
public class CategoryResultQuery extends AbstractQuery<CategoryResultQuery> {
    CategoryResultQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
     * A list of categories that match the filter criteria.
     */
    public CategoryResultQuery items(CategoryTreeQueryDefinition queryDef) {
        startField("items");

        _queryBuilder.append('{');
        queryDef.define(new CategoryTreeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * An object that includes the page_info and currentPage values specified in the query.
     */
    public CategoryResultQuery pageInfo(SearchResultPageInfoQueryDefinition queryDef) {
        startField("page_info");

        _queryBuilder.append('{');
        queryDef.define(new SearchResultPageInfoQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The total number of categories that match the criteria.
     */
    public CategoryResultQuery totalCount() {
        startField("total_count");

        return this;
    }
}

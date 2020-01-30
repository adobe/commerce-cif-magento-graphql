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
 * SortFields contains a default value for sort fields and all available sort fields.
 */
public class SortFieldsQuery extends AbstractQuery<SortFieldsQuery> {
    SortFieldsQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
     * Default value of sort fields.
     */
    public SortFieldsQuery defaultValue() {
        startField("default");

        return this;
    }

    /**
     * Available sort fields.
     */
    public SortFieldsQuery options(SortFieldQueryDefinition queryDef) {
        startField("options");

        _queryBuilder.append('{');
        queryDef.define(new SortFieldQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}

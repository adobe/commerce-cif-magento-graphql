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
* CustomizableDateOption contains information about a date picker that is defined as part of a
* customizable option
*/
public class CustomizableDateOptionQuery extends AbstractQuery<CustomizableDateOptionQuery> {
    CustomizableDateOptionQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The Stock Keeping Unit of the base product
    */
    public CustomizableDateOptionQuery productSku() {
        startField("product_sku");

        return this;
    }

    /**
    * Indicates whether the option is required
    */
    public CustomizableDateOptionQuery required() {
        startField("required");

        return this;
    }

    /**
    * The order in which the option is displayed
    */
    public CustomizableDateOptionQuery sortOrder() {
        startField("sort_order");

        return this;
    }

    /**
    * The display name for this option
    */
    public CustomizableDateOptionQuery title() {
        startField("title");

        return this;
    }

    /**
    * An object that defines a date field in a customizable option.
    */
    public CustomizableDateOptionQuery value(CustomizableDateValueQueryDefinition queryDef) {
        startField("value");

        _queryBuilder.append('{');
        queryDef.define(new CustomizableDateValueQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}

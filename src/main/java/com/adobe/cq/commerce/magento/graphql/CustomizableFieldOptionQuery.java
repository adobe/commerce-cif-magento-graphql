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
 * CustomizableFieldOption contains information about a text field that is defined as part of a
 * customizable option
 */
public class CustomizableFieldOptionQuery extends AbstractQuery<CustomizableFieldOptionQuery> {
    CustomizableFieldOptionQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
     * The Stock Keeping Unit of the base product
     */
    public CustomizableFieldOptionQuery productSku() {
        startField("product_sku");

        return this;
    }

    /**
     * Indicates whether the option is required
     */
    public CustomizableFieldOptionQuery required() {
        startField("required");

        return this;
    }

    /**
     * The order in which the option is displayed
     */
    public CustomizableFieldOptionQuery sortOrder() {
        startField("sort_order");

        return this;
    }

    /**
     * The display name for this option
     */
    public CustomizableFieldOptionQuery title() {
        startField("title");

        return this;
    }

    /**
     * An object that defines a text field
     */
    public CustomizableFieldOptionQuery value(CustomizableFieldValueQueryDefinition queryDef) {
        startField("value");

        _queryBuilder.append('{');
        queryDef.define(new CustomizableFieldValueQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}

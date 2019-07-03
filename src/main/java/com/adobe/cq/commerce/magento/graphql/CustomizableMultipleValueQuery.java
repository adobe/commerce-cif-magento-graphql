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
 * CustomizableMultipleValue defines the price and sku of a product whose page contains a customized
 * multiselect
 */
public class CustomizableMultipleValueQuery extends AbstractQuery<CustomizableMultipleValueQuery> {
    CustomizableMultipleValueQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
     * The ID assigned to the value
     */
    public CustomizableMultipleValueQuery optionTypeId() {
        startField("option_type_id");

        return this;
    }

    /**
     * The price assigned to this option
     */
    public CustomizableMultipleValueQuery price() {
        startField("price");

        return this;
    }

    /**
     * FIXED, PERCENT, or DYNAMIC
     */
    public CustomizableMultipleValueQuery priceType() {
        startField("price_type");

        return this;
    }

    /**
     * The Stock Keeping Unit for this option
     */
    public CustomizableMultipleValueQuery sku() {
        startField("sku");

        return this;
    }

    /**
     * The order in which the option is displayed
     */
    public CustomizableMultipleValueQuery sortOrder() {
        startField("sort_order");

        return this;
    }

    /**
     * The display name for this option
     */
    public CustomizableMultipleValueQuery title() {
        startField("title");

        return this;
    }
}

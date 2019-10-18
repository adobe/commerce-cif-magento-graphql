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
 * CustomizableRadioValue defines the price and sku of a product whose page contains a customized set
 * of radio buttons.
 */
public class CustomizableRadioValueQuery extends AbstractQuery<CustomizableRadioValueQuery> {
    CustomizableRadioValueQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
     * The ID assigned to the value.
     */
    public CustomizableRadioValueQuery optionTypeId() {
        startField("option_type_id");

        return this;
    }

    /**
     * The price assigned to this option.
     */
    public CustomizableRadioValueQuery price() {
        startField("price");

        return this;
    }

    /**
     * FIXED, PERCENT, or DYNAMIC.
     */
    public CustomizableRadioValueQuery priceType() {
        startField("price_type");

        return this;
    }

    /**
     * The Stock Keeping Unit for this option.
     */
    public CustomizableRadioValueQuery sku() {
        startField("sku");

        return this;
    }

    /**
     * The order in which the radio button is displayed.
     */
    public CustomizableRadioValueQuery sortOrder() {
        startField("sort_order");

        return this;
    }

    /**
     * The display name for this option.
     */
    public CustomizableRadioValueQuery title() {
        startField("title");

        return this;
    }
}

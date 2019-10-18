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
 * CustomizableDateValue defines the price and sku of a product whose page contains a customized date
 * picker.
 */
public class CustomizableDateValueQuery extends AbstractQuery<CustomizableDateValueQuery> {
    CustomizableDateValueQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
     * The price assigned to this option.
     */
    public CustomizableDateValueQuery price() {
        startField("price");

        return this;
    }

    /**
     * FIXED, PERCENT, or DYNAMIC.
     */
    public CustomizableDateValueQuery priceType() {
        startField("price_type");

        return this;
    }

    /**
     * The Stock Keeping Unit for this option.
     */
    public CustomizableDateValueQuery sku() {
        startField("sku");

        return this;
    }
}

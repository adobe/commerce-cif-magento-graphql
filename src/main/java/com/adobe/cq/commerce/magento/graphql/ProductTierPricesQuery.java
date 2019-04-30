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
 * The ProductTierPrices object defines a tier price, which is a quantity discount offered to a
 * specific customer group.
 */
public class ProductTierPricesQuery extends AbstractQuery<ProductTierPricesQuery> {
    ProductTierPricesQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
     * The ID of the customer group
     */
    public ProductTierPricesQuery customerGroupId() {
        startField("customer_group_id");

        return this;
    }

    /**
     * The percentage discount of the item
     */
    public ProductTierPricesQuery percentageValue() {
        startField("percentage_value");

        return this;
    }

    /**
     * The number of items that must be purchased to qualify for tier pricing
     */
    public ProductTierPricesQuery qty() {
        startField("qty");

        return this;
    }

    /**
     * The price of the fixed price item
     */
    public ProductTierPricesQuery value() {
        startField("value");

        return this;
    }

    /**
     * The ID assigned to the website
     */
    public ProductTierPricesQuery websiteId() {
        startField("website_id");

        return this;
    }
}

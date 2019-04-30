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
 * BundleItemOption defines characteristics and options for a specific bundle item
 */
public class BundleItemOptionQuery extends AbstractQuery<BundleItemOptionQuery> {
    BundleItemOptionQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
     * Indicates whether the customer can change the number of items for this option
     */
    public BundleItemOptionQuery canChangeQuantity() {
        startField("can_change_quantity");

        return this;
    }

    /**
     * The ID assigned to the bundled item option
     */
    public BundleItemOptionQuery id() {
        startField("id");

        return this;
    }

    /**
     * Indicates whether this option is the default option
     */
    public BundleItemOptionQuery isDefault() {
        startField("is_default");

        return this;
    }

    /**
     * The text that identifies the bundled item option
     */
    public BundleItemOptionQuery label() {
        startField("label");

        return this;
    }

    /**
     * When a bundle item contains multiple options, the relative position of this option compared to the
     * other options
     */
    public BundleItemOptionQuery position() {
        startField("position");

        return this;
    }

    /**
     * The price of the selected option
     */
    public BundleItemOptionQuery price() {
        startField("price");

        return this;
    }

    /**
     * One of FIXED, PERCENT, or DYNAMIC
     */
    public BundleItemOptionQuery priceType() {
        startField("price_type");

        return this;
    }

    /**
     * Contains details about this product option
     */
    public BundleItemOptionQuery product(ProductInterfaceQueryDefinition queryDef) {
        startField("product");

        _queryBuilder.append('{');
        queryDef.define(new ProductInterfaceQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Indicates the quantity of this specific bundle item
     */
    public BundleItemOptionQuery qty() {
        startField("qty");

        return this;
    }
}

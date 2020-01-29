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
 * BundleItem defines an individual item in a bundle product.
 */
public class BundleItemQuery extends AbstractQuery<BundleItemQuery> {
    BundleItemQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
     * An ID assigned to each type of item in a bundle product.
     */
    public BundleItemQuery optionId() {
        startField("option_id");

        return this;
    }

    /**
     * An array of additional options for this bundle item.
     */
    public BundleItemQuery options(BundleItemOptionQueryDefinition queryDef) {
        startField("options");

        _queryBuilder.append('{');
        queryDef.define(new BundleItemOptionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * he relative position of this item compared to the other bundle items.
     */
    public BundleItemQuery position() {
        startField("position");

        return this;
    }

    /**
     * Indicates whether the item must be included in the bundle.
     */
    public BundleItemQuery required() {
        startField("required");

        return this;
    }

    /**
     * The SKU of the bundle product.
     */
    public BundleItemQuery sku() {
        startField("sku");

        return this;
    }

    /**
     * The display name of the item.
     */
    public BundleItemQuery title() {
        startField("title");

        return this;
    }

    /**
     * The input type that the customer uses to select the item. Examples include radio button and
     * checkbox.
     */
    public BundleItemQuery type() {
        startField("type");

        return this;
    }
}

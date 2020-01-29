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
 * ConfigurableProductOptionsValues contains the index number assigned to a configurable product option
 */
public class ConfigurableProductOptionsValuesQuery extends AbstractQuery<ConfigurableProductOptionsValuesQuery> {
    ConfigurableProductOptionsValuesQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
     * The label of the product on the default store
     */
    public ConfigurableProductOptionsValuesQuery defaultLabel() {
        startField("default_label");

        return this;
    }

    /**
     * The label of the product
     */
    public ConfigurableProductOptionsValuesQuery label() {
        startField("label");

        return this;
    }

    /**
     * The label of the product on the current store
     */
    public ConfigurableProductOptionsValuesQuery storeLabel() {
        startField("store_label");

        return this;
    }

    /**
     * Indicates whether to use the default_label
     */
    public ConfigurableProductOptionsValuesQuery useDefaultValue() {
        startField("use_default_value");

        return this;
    }

    /**
     * A unique index number assigned to the configurable product option
     */
    public ConfigurableProductOptionsValuesQuery valueIndex() {
        startField("value_index");

        return this;
    }
}

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
import com.shopify.graphql.support.Fragment;

/**
 * ConfigurableProductOptions defines configurable attributes for the specified product
 */
public class ConfigurableProductOptionsQuery extends AbstractQuery<ConfigurableProductOptionsQuery> {
    ConfigurableProductOptionsQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
     * A string that identifies the attribute
     */
    public ConfigurableProductOptionsQuery attributeCode() {
        startField("attribute_code");

        return this;
    }

    /**
     * The ID assigned to the attribute
     *
     * @deprecated Use attribute_id_v2 instead
     */
    @Deprecated
    public ConfigurableProductOptionsQuery attributeId() {
        startField("attribute_id");

        return this;
    }

    /**
     * The ID assigned to the attribute
     */
    public ConfigurableProductOptionsQuery attributeIdV2() {
        startField("attribute_id_v2");

        return this;
    }

    /**
     * The configurable option ID number assigned by the system
     */
    public ConfigurableProductOptionsQuery id() {
        startField("id");

        return this;
    }

    /**
     * A string that describes the configurable product option, which is displayed on the UI
     */
    public ConfigurableProductOptionsQuery label() {
        startField("label");

        return this;
    }

    /**
     * A number that indicates the order in which the attribute is displayed
     */
    public ConfigurableProductOptionsQuery position() {
        startField("position");

        return this;
    }

    /**
     * This is the same as a product&#39;s id field
     */
    public ConfigurableProductOptionsQuery productId() {
        startField("product_id");

        return this;
    }

    /**
     * Indicates whether the option is the default
     */
    public ConfigurableProductOptionsQuery useDefault() {
        startField("use_default");

        return this;
    }

    /**
     * An array that defines the value_index codes assigned to the configurable product
     */
    public ConfigurableProductOptionsQuery values(ConfigurableProductOptionsValuesQueryDefinition queryDef) {
        startField("values");

        _queryBuilder.append('{');
        queryDef.define(new ConfigurableProductOptionsValuesQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Creates a GraphQL "named" fragment with the specified query type definition.
     * The generics nature of fragments ensures that a fragment can only be used at the right place in the GraphQL request.
     * 
     * @param name The name of the fragment, must be unique for a given GraphQL request.
     * @param queryDef The fragment definition.
     * @return The fragment of a given generics type.
     */
    public static Fragment<ConfigurableProductOptionsQuery> createFragment(String name, ConfigurableProductOptionsQueryDefinition queryDef) {
        StringBuilder sb = new StringBuilder();
        queryDef.define(new ConfigurableProductOptionsQuery(sb));
        return new Fragment<>(name, "ConfigurableProductOptions", sb.toString());
    }

    /**
     * Adds a <code>ConfigurableProductOptionsQuery</code> fragment reference at the current position of the query.
     * For example for a fragment named <code>test</code>, calling this method will add the
     * reference <code>...test</code> in the query. For GraphQL types implementing an interface, there
     * will be some similar methods using the Query type of each implemented interface.
     * 
     * @param fragment The fragment to reference.
     */
    public ConfigurableProductOptionsQuery addFragmentReference(Fragment<ConfigurableProductOptionsQuery> fragment) {
        startField("..." + fragment.getName());
        return this;
    }
}

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
 * Contains details about a selected configurable option.
 */
public class SelectedConfigurableOptionQuery extends AbstractQuery<SelectedConfigurableOptionQuery> {
    SelectedConfigurableOptionQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
     * The unique ID for a `ConfigurableProductOptions` object.
     */
    public SelectedConfigurableOptionQuery configurableProductOptionUid() {
        startField("configurable_product_option_uid");

        return this;
    }

    /**
     * The unique ID for a `ConfigurableProductOptionsValues` object.
     */
    public SelectedConfigurableOptionQuery configurableProductOptionValueUid() {
        startField("configurable_product_option_value_uid");

        return this;
    }

    /**
     * @deprecated Use `SelectedConfigurableOption.configurable_product_option_uid` instead.
     */
    @Deprecated
    public SelectedConfigurableOptionQuery id() {
        startField("id");

        return this;
    }

    /**
     * The display text for the option.
     */
    public SelectedConfigurableOptionQuery optionLabel() {
        startField("option_label");

        return this;
    }

    /**
     * @deprecated Use `SelectedConfigurableOption.configurable_product_option_value_uid` instead.
     */
    @Deprecated
    public SelectedConfigurableOptionQuery valueId() {
        startField("value_id");

        return this;
    }

    /**
     * The display name of the selected configurable option.
     */
    public SelectedConfigurableOptionQuery valueLabel() {
        startField("value_label");

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
    public static Fragment<SelectedConfigurableOptionQuery> createFragment(String name,
        SelectedConfigurableOptionQueryDefinition queryDef) {
        StringBuilder sb = new StringBuilder();
        queryDef.define(new SelectedConfigurableOptionQuery(sb));
        return new Fragment<>(name, "SelectedConfigurableOption", sb.toString());
    }

    /**
     * Adds a <code>SelectedConfigurableOptionQuery</code> fragment reference at the current position of the query.
     * For example for a fragment named <code>test</code>, calling this method will add the
     * reference <code>...test</code> in the query. For GraphQL types implementing an interface, there
     * will be some similar methods using the Query type of each implemented interface.
     * 
     * @param fragment The fragment to reference.
     */
    public SelectedConfigurableOptionQuery addFragmentReference(Fragment<SelectedConfigurableOptionQuery> fragment) {
        startField("..." + fragment.getName());
        return this;
    }
}

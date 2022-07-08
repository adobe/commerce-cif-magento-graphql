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
import com.shopify.graphql.support.ID;

/**
 * Contains details about configurable products added to a requisition list.
 */
public class ConfigurableRequisitionListItemQuery extends AbstractQuery<ConfigurableRequisitionListItemQuery> {
    ConfigurableRequisitionListItemQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
     * Selected configurable options for an item in the requisition list.
     */
    public ConfigurableRequisitionListItemQuery configurableOptions(SelectedConfigurableOptionQueryDefinition queryDef) {
        startField("configurable_options");

        _queryBuilder.append('{');
        queryDef.define(new SelectedConfigurableOptionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Selected custom options for an item in the requisition list.
     */
    public ConfigurableRequisitionListItemQuery customizableOptions(SelectedCustomizableOptionQueryDefinition queryDef) {
        startField("customizable_options");

        _queryBuilder.append('{');
        queryDef.define(new SelectedCustomizableOptionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Details about a requisition list item.
     */
    public ConfigurableRequisitionListItemQuery product(ProductInterfaceQueryDefinition queryDef) {
        startField("product");

        _queryBuilder.append('{');
        queryDef.define(new ProductInterfaceQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The quantity of the product added to the requisition list.
     */
    public ConfigurableRequisitionListItemQuery quantity() {
        startField("quantity");

        return this;
    }

    /**
     * The unique ID of an item in a requisition list.
     */
    public ConfigurableRequisitionListItemQuery uid() {
        startField("uid");

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
    public static Fragment<ConfigurableRequisitionListItemQuery> createFragment(String name,
        ConfigurableRequisitionListItemQueryDefinition queryDef) {
        StringBuilder sb = new StringBuilder();
        queryDef.define(new ConfigurableRequisitionListItemQuery(sb));
        return new Fragment<>(name, "ConfigurableRequisitionListItem", sb.toString());
    }

    /**
     * Adds a <code>ConfigurableRequisitionListItemQuery</code> fragment reference at the current position of the query.
     * For example for a fragment named <code>test</code>, calling this method will add the
     * reference <code>...test</code> in the query. For GraphQL types implementing an interface, there
     * will be some similar methods using the Query type of each implemented interface.
     * 
     * @param fragment The fragment to reference.
     */
    public ConfigurableRequisitionListItemQuery addFragmentReference(Fragment<ConfigurableRequisitionListItemQuery> fragment) {
        startField("..." + fragment.getName());
        return this;
    }

    /**
     * Adds a <code>RequisitionListItemInterfaceQuery</code> fragment reference at the current position of the query.
     * For example for a fragment named <code>test</code>, calling this method will add the
     * reference <code>...test</code> in the query.
     * 
     * @param fragment The fragment to reference.
     */
    public ConfigurableRequisitionListItemQuery addRequisitionListItemInterfaceFragmentReference(
        Fragment<RequisitionListItemInterfaceQuery> fragment) {
        startField("..." + fragment.getName());
        return this;
    }
}

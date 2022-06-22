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
 * The interface for requisition list items.
 */
public class RequisitionListItemInterfaceQuery extends AbstractQuery<RequisitionListItemInterfaceQuery> {
    RequisitionListItemInterfaceQuery(StringBuilder _queryBuilder) {
        this(_queryBuilder, true);
    }

    RequisitionListItemInterfaceQuery(StringBuilder _queryBuilder, boolean addTypename) {
        super(_queryBuilder);
        if (addTypename) {
            startField("__typename");
        }
    }

    /**
     * Selected custom options for an item in the requisition list.
     */
    public RequisitionListItemInterfaceQuery customizableOptions(SelectedCustomizableOptionQueryDefinition queryDef) {
        startField("customizable_options");

        _queryBuilder.append('{');
        queryDef.define(new SelectedCustomizableOptionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Details about a requisition list item.
     */
    public RequisitionListItemInterfaceQuery product(ProductInterfaceQueryDefinition queryDef) {
        startField("product");

        _queryBuilder.append('{');
        queryDef.define(new ProductInterfaceQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The amount added.
     */
    public RequisitionListItemInterfaceQuery quantity() {
        startField("quantity");

        return this;
    }

    /**
     * The unique ID for the requisition list item.
     */
    public RequisitionListItemInterfaceQuery uid() {
        startField("uid");

        return this;
    }

    public RequisitionListItemInterfaceQuery onBundleRequisitionListItem(BundleRequisitionListItemQueryDefinition queryDef) {
        startInlineFragment("BundleRequisitionListItem");
        queryDef.define(new BundleRequisitionListItemQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public RequisitionListItemInterfaceQuery onConfigurableRequisitionListItem(ConfigurableRequisitionListItemQueryDefinition queryDef) {
        startInlineFragment("ConfigurableRequisitionListItem");
        queryDef.define(new ConfigurableRequisitionListItemQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public RequisitionListItemInterfaceQuery onDownloadableRequisitionListItem(DownloadableRequisitionListItemQueryDefinition queryDef) {
        startInlineFragment("DownloadableRequisitionListItem");
        queryDef.define(new DownloadableRequisitionListItemQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public RequisitionListItemInterfaceQuery onGiftCardRequisitionListItem(GiftCardRequisitionListItemQueryDefinition queryDef) {
        startInlineFragment("GiftCardRequisitionListItem");
        queryDef.define(new GiftCardRequisitionListItemQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public RequisitionListItemInterfaceQuery onSimpleRequisitionListItem(SimpleRequisitionListItemQueryDefinition queryDef) {
        startInlineFragment("SimpleRequisitionListItem");
        queryDef.define(new SimpleRequisitionListItemQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public RequisitionListItemInterfaceQuery onVirtualRequisitionListItem(VirtualRequisitionListItemQueryDefinition queryDef) {
        startInlineFragment("VirtualRequisitionListItem");
        queryDef.define(new VirtualRequisitionListItemQuery(_queryBuilder));
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
    public static Fragment<RequisitionListItemInterfaceQuery> createFragment(String name,
        RequisitionListItemInterfaceQueryDefinition queryDef) {
        StringBuilder sb = new StringBuilder();
        queryDef.define(new RequisitionListItemInterfaceQuery(sb, false));
        return new Fragment<>(name, "RequisitionListItemInterface", sb.toString());
    }

    /**
     * Adds a <code>RequisitionListItemInterfaceQuery</code> fragment reference at the current position of the query.
     * For example for a fragment named <code>test</code>, calling this method will add the
     * reference <code>...test</code> in the query. For GraphQL types implementing an interface, there
     * will be some similar methods using the Query type of each implemented interface.
     * 
     * @param fragment The fragment to reference.
     */
    public RequisitionListItemInterfaceQuery addFragmentReference(Fragment<RequisitionListItemInterfaceQuery> fragment) {
        startField("..." + fragment.getName());
        return this;
    }
}

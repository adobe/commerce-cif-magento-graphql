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
 * Contains details about downloadable products added to a requisition list.
 */
public class DownloadableRequisitionListItemQuery extends AbstractQuery<DownloadableRequisitionListItemQuery> {
    DownloadableRequisitionListItemQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
     * Selected custom options for an item in the requisition list.
     */
    public DownloadableRequisitionListItemQuery customizableOptions(SelectedCustomizableOptionQueryDefinition queryDef) {
        startField("customizable_options");

        _queryBuilder.append('{');
        queryDef.define(new SelectedCustomizableOptionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * An array of links for downloadable products in the requisition list.
     */
    public DownloadableRequisitionListItemQuery links(DownloadableProductLinksQueryDefinition queryDef) {
        startField("links");

        _queryBuilder.append('{');
        queryDef.define(new DownloadableProductLinksQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Details about a requisition list item.
     */
    public DownloadableRequisitionListItemQuery product(ProductInterfaceQueryDefinition queryDef) {
        startField("product");

        _queryBuilder.append('{');
        queryDef.define(new ProductInterfaceQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The quantity of the product added to the requisition list.
     */
    public DownloadableRequisitionListItemQuery quantity() {
        startField("quantity");

        return this;
    }

    /**
     * An array of links to downloadable product samples.
     */
    public DownloadableRequisitionListItemQuery samples(DownloadableProductSamplesQueryDefinition queryDef) {
        startField("samples");

        _queryBuilder.append('{');
        queryDef.define(new DownloadableProductSamplesQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The unique ID of an item in a requisition list.
     */
    public DownloadableRequisitionListItemQuery uid() {
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
    public static Fragment<DownloadableRequisitionListItemQuery> createFragment(String name,
        DownloadableRequisitionListItemQueryDefinition queryDef) {
        StringBuilder sb = new StringBuilder();
        queryDef.define(new DownloadableRequisitionListItemQuery(sb));
        return new Fragment<>(name, "DownloadableRequisitionListItem", sb.toString());
    }

    /**
     * Adds a <code>DownloadableRequisitionListItemQuery</code> fragment reference at the current position of the query.
     * For example for a fragment named <code>test</code>, calling this method will add the
     * reference <code>...test</code> in the query. For GraphQL types implementing an interface, there
     * will be some similar methods using the Query type of each implemented interface.
     * 
     * @param fragment The fragment to reference.
     */
    public DownloadableRequisitionListItemQuery addFragmentReference(Fragment<DownloadableRequisitionListItemQuery> fragment) {
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
    public DownloadableRequisitionListItemQuery addRequisitionListItemInterfaceFragmentReference(
        Fragment<RequisitionListItemInterfaceQuery> fragment) {
        startField("..." + fragment.getName());
        return this;
    }
}

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
 * Contains metadata corresponding to the selected configurable options.
 */
public class ConfigurableProductOptionsSelectionQuery extends AbstractQuery<ConfigurableProductOptionsSelectionQuery> {
    ConfigurableProductOptionsSelectionQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
     * An array of all possible configurable options.
     */
    public ConfigurableProductOptionsSelectionQuery configurableOptions(ConfigurableProductOptionQueryDefinition queryDef) {
        startField("configurable_options");

        _queryBuilder.append('{');
        queryDef.define(new ConfigurableProductOptionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Product images and videos corresponding to the specified configurable options selection.
     */
    public ConfigurableProductOptionsSelectionQuery mediaGallery(MediaGalleryInterfaceQueryDefinition queryDef) {
        startField("media_gallery");

        _queryBuilder.append('{');
        queryDef.define(new MediaGalleryInterfaceQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The configurable options available for further selection based on the current selection.
     */
    public ConfigurableProductOptionsSelectionQuery optionsAvailableForSelection(
        ConfigurableOptionAvailableForSelectionQueryDefinition queryDef) {
        startField("options_available_for_selection");

        _queryBuilder.append('{');
        queryDef.define(new ConfigurableOptionAvailableForSelectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * A variant represented by the specified configurable options selection. The value is expected to be
     * null until selections are made for each configurable option.
     */
    public ConfigurableProductOptionsSelectionQuery variant(SimpleProductQueryDefinition queryDef) {
        startField("variant");

        _queryBuilder.append('{');
        queryDef.define(new SimpleProductQuery(_queryBuilder));
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
    public static Fragment<ConfigurableProductOptionsSelectionQuery> createFragment(String name,
        ConfigurableProductOptionsSelectionQueryDefinition queryDef) {
        StringBuilder sb = new StringBuilder();
        queryDef.define(new ConfigurableProductOptionsSelectionQuery(sb));
        return new Fragment<>(name, "ConfigurableProductOptionsSelection", sb.toString());
    }

    /**
     * Adds a <code>ConfigurableProductOptionsSelectionQuery</code> fragment reference at the current position of the query.
     * For example for a fragment named <code>test</code>, calling this method will add the
     * reference <code>...test</code> in the query. For GraphQL types implementing an interface, there
     * will be some similar methods using the Query type of each implemented interface.
     * 
     * @param fragment The fragment to reference.
     */
    public ConfigurableProductOptionsSelectionQuery addFragmentReference(Fragment<ConfigurableProductOptionsSelectionQuery> fragment) {
        startField("..." + fragment.getName());
        return this;
    }
}

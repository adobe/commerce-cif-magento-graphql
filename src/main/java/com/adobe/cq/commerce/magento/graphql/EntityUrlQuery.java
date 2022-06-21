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
 * Contains the `uid`, `relative_url`, and `type` attributes.
 */
public class EntityUrlQuery extends AbstractQuery<EntityUrlQuery> {
    EntityUrlQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
     * @deprecated Use `relative_url` instead.
     */
    @Deprecated
    public EntityUrlQuery canonicalUrl() {
        startField("canonical_url");

        return this;
    }

    /**
     * The unique ID for a `ProductInterface`, `CategoryInterface`, `CmsPage`, or similar object associated
     * with the specified URL. This could be a product, category, or CMS page UID.
     */
    public EntityUrlQuery entityUid() {
        startField("entity_uid");

        return this;
    }

    /**
     * The ID assigned to the object associated with the specified url. This could be a product ID,
     * category ID, or page ID.
     *
     * @deprecated Use `entity_uid` instead.
     */
    @Deprecated
    public EntityUrlQuery id() {
        startField("id");

        return this;
    }

    /**
     * Contains 0 when there is no redirect error. A value of 301 indicates the URL of the requested
     * resource has been changed permanently, while a value of 302 indicates a temporary redirect.
     */
    public EntityUrlQuery redirectCode() {
        startField("redirectCode");

        return this;
    }

    /**
     * The internal relative URL. If the specified URL is a redirect, the query returns the redirected URL,
     * not the original.
     */
    public EntityUrlQuery relativeUrl() {
        startField("relative_url");

        return this;
    }

    /**
     * One of PRODUCT, CATEGORY, or CMS_PAGE.
     */
    public EntityUrlQuery type() {
        startField("type");

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
    public static Fragment<EntityUrlQuery> createFragment(String name, EntityUrlQueryDefinition queryDef) {
        StringBuilder sb = new StringBuilder();
        queryDef.define(new EntityUrlQuery(sb));
        return new Fragment<>(name, "EntityUrl", sb.toString());
    }

    /**
     * Adds a <code>EntityUrlQuery</code> fragment reference at the current position of the query.
     * For example for a fragment named <code>test</code>, calling this method will add the
     * reference <code>...test</code> in the query. For GraphQL types implementing an interface, there
     * will be some similar methods using the Query type of each implemented interface.
     * 
     * @param fragment The fragment to reference.
     */
    public EntityUrlQuery addFragmentReference(Fragment<EntityUrlQuery> fragment) {
        startField("..." + fragment.getName());
        return this;
    }
}

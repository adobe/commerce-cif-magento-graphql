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
 * EntityUrl is an output object containing the `id`, `canonical_url`, and `type` attributes
 */
public class EntityUrlQuery extends AbstractQuery<EntityUrlQuery> {
    EntityUrlQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
     * The internal relative URL. If the specified  url is a redirect, the query returns the redirected
     * URL, not the original.
     */
    public EntityUrlQuery canonicalUrl() {
        startField("canonical_url");

        return this;
    }

    /**
     * The ID assigned to the object associated with the specified url. This could be a product ID,
     * category ID, or page ID.
     */
    public EntityUrlQuery id() {
        startField("id");

        return this;
    }

    /**
     * One of PRODUCT, CATEGORY, or CMS_PAGE.
     */
    public EntityUrlQuery type() {
        startField("type");

        return this;
    }
}

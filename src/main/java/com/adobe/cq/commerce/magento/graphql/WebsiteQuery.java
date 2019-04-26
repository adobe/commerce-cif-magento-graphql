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
 * The type contains information about a website
 */
public class WebsiteQuery extends AbstractQuery<WebsiteQuery> {
    WebsiteQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
     * A code assigned to the website to identify it
     */
    public WebsiteQuery code() {
        startField("code");

        return this;
    }

    /**
     * The default group id that the website has
     */
    public WebsiteQuery defaultGroupId() {
        startField("default_group_id");

        return this;
    }

    /**
     * The ID number assigned to the website
     */
    public WebsiteQuery id() {
        startField("id");

        return this;
    }

    /**
     * Specifies if this is the default website
     */
    public WebsiteQuery isDefault() {
        startField("is_default");

        return this;
    }

    /**
     * The website name. Websites use this name to identify it easyer.
     */
    public WebsiteQuery name() {
        startField("name");

        return this;
    }

    /**
     * The attribute to use for sorting websites
     */
    public WebsiteQuery sortOrder() {
        startField("sort_order");

        return this;
    }
}

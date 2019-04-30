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
 * 
 */
public class WishlistOutputQuery extends AbstractQuery<WishlistOutputQuery> {
    WishlistOutputQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
     * An array of items in the customer&#39;s wish list
     */
    public WishlistOutputQuery items(WishlistItemQueryDefinition queryDef) {
        startField("items");

        _queryBuilder.append('{');
        queryDef.define(new WishlistItemQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The number of items in the wish list
     */
    public WishlistOutputQuery itemsCount() {
        startField("items_count");

        return this;
    }

    /**
     * When multiple wish lists are enabled, the name the customer assigns to the wishlist
     */
    public WishlistOutputQuery name() {
        startField("name");

        return this;
    }

    /**
     * An encrypted code that Magento uses to link to the wish list
     */
    public WishlistOutputQuery sharingCode() {
        startField("sharing_code");

        return this;
    }

    /**
     * The time of the last modification to the wish list
     */
    public WishlistOutputQuery updatedAt() {
        startField("updated_at");

        return this;
    }
}

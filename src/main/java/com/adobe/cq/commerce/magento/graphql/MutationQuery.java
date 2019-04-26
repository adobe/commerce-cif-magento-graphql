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
public class MutationQuery extends AbstractQuery<MutationQuery> {
    MutationQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
     * Creates empty shopping cart for guest or logged in user
     */
    public MutationQuery createEmptyCart() {
        startField("createEmptyCart");

        return this;
    }

    /**
     * Mutation type cannot be declared without fields. The placeholder will be removed when at least one
     * mutation field is declared.
     */
    public MutationQuery placeholderMutation() {
        startField("placeholderMutation");

        return this;
    }

    public String toString() {
        return _queryBuilder.toString();
    }
}

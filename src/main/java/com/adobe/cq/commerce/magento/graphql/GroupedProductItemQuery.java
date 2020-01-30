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

/**
 * GroupedProductItem contains information about an individual grouped product item
 */
public class GroupedProductItemQuery extends AbstractQuery<GroupedProductItemQuery> {
    GroupedProductItemQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
     * The relative position of this item compared to the other group items
     */
    public GroupedProductItemQuery position() {
        startField("position");

        return this;
    }

    /**
     * The ProductInterface object, which contains details about this product option
     */
    public GroupedProductItemQuery product(ProductInterfaceQueryDefinition queryDef) {
        startField("product");

        _queryBuilder.append('{');
        queryDef.define(new ProductInterfaceQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The quantity of this grouped product item
     */
    public GroupedProductItemQuery qty() {
        startField("qty");

        return this;
    }
}

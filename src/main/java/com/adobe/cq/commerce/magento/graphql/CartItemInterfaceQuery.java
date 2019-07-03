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
public class CartItemInterfaceQuery extends AbstractQuery<CartItemInterfaceQuery> {
    CartItemInterfaceQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
    }

    public CartItemInterfaceQuery id() {
        startField("id");

        return this;
    }

    public CartItemInterfaceQuery product(ProductInterfaceQueryDefinition queryDef) {
        startField("product");

        _queryBuilder.append('{');
        queryDef.define(new ProductInterfaceQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public CartItemInterfaceQuery quantity() {
        startField("quantity");

        return this;
    }

    public CartItemInterfaceQuery onConfigurableCartItem(ConfigurableCartItemQueryDefinition queryDef) {
        startInlineFragment("ConfigurableCartItem");
        queryDef.define(new ConfigurableCartItemQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public CartItemInterfaceQuery onSimpleCartItem(SimpleCartItemQueryDefinition queryDef) {
        startInlineFragment("SimpleCartItem");
        queryDef.define(new SimpleCartItemQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public CartItemInterfaceQuery onVirtualCartItem(VirtualCartItemQueryDefinition queryDef) {
        startInlineFragment("VirtualCartItem");
        queryDef.define(new VirtualCartItemQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}

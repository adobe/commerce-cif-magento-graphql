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

public class BundleCartItemQuery extends AbstractQuery<BundleCartItemQuery> {
    BundleCartItemQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public BundleCartItemQuery bundleOptions(SelectedBundleOptionQueryDefinition queryDef) {
        startField("bundle_options");

        _queryBuilder.append('{');
        queryDef.define(new SelectedBundleOptionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public BundleCartItemQuery customizableOptions(SelectedCustomizableOptionQueryDefinition queryDef) {
        startField("customizable_options");

        _queryBuilder.append('{');
        queryDef.define(new SelectedCustomizableOptionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public BundleCartItemQuery id() {
        startField("id");

        return this;
    }

    public BundleCartItemQuery prices(CartItemPricesQueryDefinition queryDef) {
        startField("prices");

        _queryBuilder.append('{');
        queryDef.define(new CartItemPricesQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public BundleCartItemQuery product(ProductInterfaceQueryDefinition queryDef) {
        startField("product");

        _queryBuilder.append('{');
        queryDef.define(new ProductInterfaceQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public BundleCartItemQuery quantity() {
        startField("quantity");

        return this;
    }
}

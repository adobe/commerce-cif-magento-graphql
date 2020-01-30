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

public class SelectedCustomizableOptionValueQuery extends AbstractQuery<SelectedCustomizableOptionValueQuery> {
    SelectedCustomizableOptionValueQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public SelectedCustomizableOptionValueQuery id() {
        startField("id");

        return this;
    }

    public SelectedCustomizableOptionValueQuery label() {
        startField("label");

        return this;
    }

    public SelectedCustomizableOptionValueQuery price(CartItemSelectedOptionValuePriceQueryDefinition queryDef) {
        startField("price");

        _queryBuilder.append('{');
        queryDef.define(new CartItemSelectedOptionValuePriceQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public SelectedCustomizableOptionValueQuery value() {
        startField("value");

        return this;
    }
}

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

public class SelectedShippingMethodQuery extends AbstractQuery<SelectedShippingMethodQuery> {
    SelectedShippingMethodQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public SelectedShippingMethodQuery amount(MoneyQueryDefinition queryDef) {
        startField("amount");

        _queryBuilder.append('{');
        queryDef.define(new MoneyQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * @deprecated The field should not be used on the storefront
     */
    @Deprecated
    public SelectedShippingMethodQuery baseAmount(MoneyQueryDefinition queryDef) {
        startField("base_amount");

        _queryBuilder.append('{');
        queryDef.define(new MoneyQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public SelectedShippingMethodQuery carrierCode() {
        startField("carrier_code");

        return this;
    }

    public SelectedShippingMethodQuery carrierTitle() {
        startField("carrier_title");

        return this;
    }

    public SelectedShippingMethodQuery methodCode() {
        startField("method_code");

        return this;
    }

    public SelectedShippingMethodQuery methodTitle() {
        startField("method_title");

        return this;
    }
}

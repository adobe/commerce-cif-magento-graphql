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
public class AvailableShippingMethodQuery extends AbstractQuery<AvailableShippingMethodQuery> {
    AvailableShippingMethodQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public AvailableShippingMethodQuery amount(MoneyQueryDefinition queryDef) {
        startField("amount");

        _queryBuilder.append('{');
        queryDef.define(new MoneyQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public AvailableShippingMethodQuery available() {
        startField("available");

        return this;
    }

    /**
     * Could be null if method is not available
     */
    public AvailableShippingMethodQuery baseAmount(MoneyQueryDefinition queryDef) {
        startField("base_amount");

        _queryBuilder.append('{');
        queryDef.define(new MoneyQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public AvailableShippingMethodQuery carrierCode() {
        startField("carrier_code");

        return this;
    }

    public AvailableShippingMethodQuery carrierTitle() {
        startField("carrier_title");

        return this;
    }

    public AvailableShippingMethodQuery errorMessage() {
        startField("error_message");

        return this;
    }

    /**
     * Could be null if method is not available
     */
    public AvailableShippingMethodQuery methodCode() {
        startField("method_code");

        return this;
    }

    /**
     * Could be null if method is not available
     */
    public AvailableShippingMethodQuery methodTitle() {
        startField("method_title");

        return this;
    }

    public AvailableShippingMethodQuery priceExclTax(MoneyQueryDefinition queryDef) {
        startField("price_excl_tax");

        _queryBuilder.append('{');
        queryDef.define(new MoneyQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public AvailableShippingMethodQuery priceInclTax(MoneyQueryDefinition queryDef) {
        startField("price_incl_tax");

        _queryBuilder.append('{');
        queryDef.define(new MoneyQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}

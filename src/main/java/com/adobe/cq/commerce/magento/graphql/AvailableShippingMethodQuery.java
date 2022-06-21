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
import com.shopify.graphql.support.Fragment;

/**
 * Contains details about the possible shipping methods and carriers.
 */
public class AvailableShippingMethodQuery extends AbstractQuery<AvailableShippingMethodQuery> {
    AvailableShippingMethodQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
     * The cost of shipping using this shipping method.
     */
    public AvailableShippingMethodQuery amount(MoneyQueryDefinition queryDef) {
        startField("amount");

        _queryBuilder.append('{');
        queryDef.define(new MoneyQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Indicates whether this shipping method can be applied to the cart.
     */
    public AvailableShippingMethodQuery available() {
        startField("available");

        return this;
    }

    /**
     * @deprecated The field should not be used on the storefront.
     */
    @Deprecated
    public AvailableShippingMethodQuery baseAmount(MoneyQueryDefinition queryDef) {
        startField("base_amount");

        _queryBuilder.append('{');
        queryDef.define(new MoneyQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * A string that identifies a commercial carrier or an offline shipping method.
     */
    public AvailableShippingMethodQuery carrierCode() {
        startField("carrier_code");

        return this;
    }

    /**
     * The label for the carrier code.
     */
    public AvailableShippingMethodQuery carrierTitle() {
        startField("carrier_title");

        return this;
    }

    /**
     * Describes an error condition.
     */
    public AvailableShippingMethodQuery errorMessage() {
        startField("error_message");

        return this;
    }

    /**
     * A shipping method code associated with a carrier. The value could be null if no method is available.
     */
    public AvailableShippingMethodQuery methodCode() {
        startField("method_code");

        return this;
    }

    /**
     * The label for the shipping method code. The value could be null if no method is available.
     */
    public AvailableShippingMethodQuery methodTitle() {
        startField("method_title");

        return this;
    }

    /**
     * The cost of shipping using this shipping method, excluding tax.
     */
    public AvailableShippingMethodQuery priceExclTax(MoneyQueryDefinition queryDef) {
        startField("price_excl_tax");

        _queryBuilder.append('{');
        queryDef.define(new MoneyQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The cost of shipping using this shipping method, including tax.
     */
    public AvailableShippingMethodQuery priceInclTax(MoneyQueryDefinition queryDef) {
        startField("price_incl_tax");

        _queryBuilder.append('{');
        queryDef.define(new MoneyQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Creates a GraphQL "named" fragment with the specified query type definition.
     * The generics nature of fragments ensures that a fragment can only be used at the right place in the GraphQL request.
     * 
     * @param name The name of the fragment, must be unique for a given GraphQL request.
     * @param queryDef The fragment definition.
     * @return The fragment of a given generics type.
     */
    public static Fragment<AvailableShippingMethodQuery> createFragment(String name, AvailableShippingMethodQueryDefinition queryDef) {
        StringBuilder sb = new StringBuilder();
        queryDef.define(new AvailableShippingMethodQuery(sb));
        return new Fragment<>(name, "AvailableShippingMethod", sb.toString());
    }

    /**
     * Adds a <code>AvailableShippingMethodQuery</code> fragment reference at the current position of the query.
     * For example for a fragment named <code>test</code>, calling this method will add the
     * reference <code>...test</code> in the query. For GraphQL types implementing an interface, there
     * will be some similar methods using the Query type of each implemented interface.
     * 
     * @param fragment The fragment to reference.
     */
    public AvailableShippingMethodQuery addFragmentReference(Fragment<AvailableShippingMethodQuery> fragment) {
        startField("..." + fragment.getName());
        return this;
    }
}

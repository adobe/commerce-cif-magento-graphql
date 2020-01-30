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
 * Contains the token returned by PayPal and a set of URLs that allow the buyer to authorize payment
 * and adjust checkout details. Applies to Express Checkout and Payments Standard payment methods.
 */
public class PaypalExpressTokenOutputQuery extends AbstractQuery<PaypalExpressTokenOutputQuery> {
    PaypalExpressTokenOutputQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
     * A set of URLs that allow the buyer to authorize payment and adjust checkout details
     */
    public PaypalExpressTokenOutputQuery paypalUrls(PaypalExpressUrlListQueryDefinition queryDef) {
        startField("paypal_urls");

        _queryBuilder.append('{');
        queryDef.define(new PaypalExpressUrlListQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The token returned by PayPal
     */
    public PaypalExpressTokenOutputQuery token() {
        startField("token");

        return this;
    }
}

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
 * A set of URLs that allow the buyer to authorize payment and adjust checkout details for Express
 * Checkout and Payments Standard transactions.
 */
public class PaypalExpressUrlListQuery extends AbstractQuery<PaypalExpressUrlListQuery> {
    PaypalExpressUrlListQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
     * The PayPal URL that allows the buyer to edit their checkout details
     */
    public PaypalExpressUrlListQuery edit() {
        startField("edit");

        return this;
    }

    /**
     * The URL to the PayPal login page
     */
    public PaypalExpressUrlListQuery start() {
        startField("start");

        return this;
    }
}

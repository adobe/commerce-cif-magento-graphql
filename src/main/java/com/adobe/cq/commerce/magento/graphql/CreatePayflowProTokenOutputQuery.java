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
 * Contains the secure information used to authorize transaction. Applies to Payflow Pro and Payments
 * Pro payment methods.
 */
public class CreatePayflowProTokenOutputQuery extends AbstractQuery<CreatePayflowProTokenOutputQuery> {
    CreatePayflowProTokenOutputQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public CreatePayflowProTokenOutputQuery responseMessage() {
        startField("response_message");

        return this;
    }

    public CreatePayflowProTokenOutputQuery result() {
        startField("result");

        return this;
    }

    public CreatePayflowProTokenOutputQuery resultCode() {
        startField("result_code");

        return this;
    }

    public CreatePayflowProTokenOutputQuery secureToken() {
        startField("secure_token");

        return this;
    }

    public CreatePayflowProTokenOutputQuery secureTokenId() {
        startField("secure_token_id");

        return this;
    }
}

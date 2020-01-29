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
 * Defines all Checkout Agreement information
 */
public class CheckoutAgreementQuery extends AbstractQuery<CheckoutAgreementQuery> {
    CheckoutAgreementQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
     * Checkout Agreement identifier
     */
    public CheckoutAgreementQuery agreementId() {
        startField("agreement_id");

        return this;
    }

    /**
     * Checkout Agreement checkbox text
     */
    public CheckoutAgreementQuery checkboxText() {
        startField("checkbox_text");

        return this;
    }

    /**
     * Checkout Agreement content
     */
    public CheckoutAgreementQuery content() {
        startField("content");

        return this;
    }

    /**
     * Checkout Agreement content height
     */
    public CheckoutAgreementQuery contentHeight() {
        startField("content_height");

        return this;
    }

    /**
     * Is Checkout Agreement content in HTML format
     */
    public CheckoutAgreementQuery isHtml() {
        startField("is_html");

        return this;
    }

    public CheckoutAgreementQuery mode() {
        startField("mode");

        return this;
    }

    /**
     * Checkout Agreement name
     */
    public CheckoutAgreementQuery name() {
        startField("name");

        return this;
    }
}

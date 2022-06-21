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
 * Defines details about an individual checkout agreement.
 */
public class CheckoutAgreementQuery extends AbstractQuery<CheckoutAgreementQuery> {
    CheckoutAgreementQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
     * The ID for a checkout agreement.
     */
    public CheckoutAgreementQuery agreementId() {
        startField("agreement_id");

        return this;
    }

    /**
     * The checkbox text for the checkout agreement.
     */
    public CheckoutAgreementQuery checkboxText() {
        startField("checkbox_text");

        return this;
    }

    /**
     * Required. The text of the agreement.
     */
    public CheckoutAgreementQuery content() {
        startField("content");

        return this;
    }

    /**
     * The height of the text box where the Terms and Conditions statement appears during checkout.
     */
    public CheckoutAgreementQuery contentHeight() {
        startField("content_height");

        return this;
    }

    /**
     * Indicates whether the `content` text is in HTML format.
     */
    public CheckoutAgreementQuery isHtml() {
        startField("is_html");

        return this;
    }

    /**
     * Indicates whether agreements are accepted automatically or manually.
     */
    public CheckoutAgreementQuery mode() {
        startField("mode");

        return this;
    }

    /**
     * The name given to the condition.
     */
    public CheckoutAgreementQuery name() {
        startField("name");

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
    public static Fragment<CheckoutAgreementQuery> createFragment(String name, CheckoutAgreementQueryDefinition queryDef) {
        StringBuilder sb = new StringBuilder();
        queryDef.define(new CheckoutAgreementQuery(sb));
        return new Fragment<>(name, "CheckoutAgreement", sb.toString());
    }

    /**
     * Adds a <code>CheckoutAgreementQuery</code> fragment reference at the current position of the query.
     * For example for a fragment named <code>test</code>, calling this method will add the
     * reference <code>...test</code> in the query. For GraphQL types implementing an interface, there
     * will be some similar methods using the Query type of each implemented interface.
     * 
     * @param fragment The fragment to reference.
     */
    public CheckoutAgreementQuery addFragmentReference(Fragment<CheckoutAgreementQuery> fragment) {
        startField("..." + fragment.getName());
        return this;
    }
}

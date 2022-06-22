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

import java.io.Serializable;

import com.shopify.graphql.support.AbstractQuery;
import com.shopify.graphql.support.ID;

/**
 * Defines the payment method of the specified negotiable quote.
 */
public class SetNegotiableQuotePaymentMethodInput implements Serializable {
    private NegotiableQuotePaymentMethodInput paymentMethod;

    private ID quoteUid;

    public SetNegotiableQuotePaymentMethodInput(NegotiableQuotePaymentMethodInput paymentMethod, ID quoteUid) {
        this.paymentMethod = paymentMethod;

        this.quoteUid = quoteUid;
    }

    /**
     * The payment method to be assigned to the negotiable quote.
     */
    public NegotiableQuotePaymentMethodInput getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * The payment method to be assigned to the negotiable quote.
     */
    public SetNegotiableQuotePaymentMethodInput setPaymentMethod(NegotiableQuotePaymentMethodInput paymentMethod) {
        this.paymentMethod = paymentMethod;
        return this;
    }

    /**
     * The unique ID of a `NegotiableQuote` object.
     */
    public ID getQuoteUid() {
        return quoteUid;
    }

    /**
     * The unique ID of a `NegotiableQuote` object.
     */
    public SetNegotiableQuotePaymentMethodInput setQuoteUid(ID quoteUid) {
        this.quoteUid = quoteUid;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("payment_method:");
        paymentMethod.appendTo(_queryBuilder);

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("quote_uid:");
        AbstractQuery.appendQuotedString(_queryBuilder, quoteUid.toString());

        _queryBuilder.append('}');
    }
}

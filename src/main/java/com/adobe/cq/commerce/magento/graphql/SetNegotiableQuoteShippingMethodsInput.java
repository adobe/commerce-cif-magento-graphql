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
import java.util.List;

import com.shopify.graphql.support.AbstractQuery;
import com.shopify.graphql.support.ID;

/**
 * Defines the shipping method to apply to the negotiable quote.
 */
public class SetNegotiableQuoteShippingMethodsInput implements Serializable {
    private ID quoteUid;

    private List<ShippingMethodInput> shippingMethods;

    public SetNegotiableQuoteShippingMethodsInput(ID quoteUid, List<ShippingMethodInput> shippingMethods) {
        this.quoteUid = quoteUid;

        this.shippingMethods = shippingMethods;
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
    public SetNegotiableQuoteShippingMethodsInput setQuoteUid(ID quoteUid) {
        this.quoteUid = quoteUid;
        return this;
    }

    /**
     * An array of shipping methods to apply to the negotiable quote.
     */
    public List<ShippingMethodInput> getShippingMethods() {
        return shippingMethods;
    }

    /**
     * An array of shipping methods to apply to the negotiable quote.
     */
    public SetNegotiableQuoteShippingMethodsInput setShippingMethods(List<ShippingMethodInput> shippingMethods) {
        this.shippingMethods = shippingMethods;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("quote_uid:");
        AbstractQuery.appendQuotedString(_queryBuilder, quoteUid.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("shipping_methods:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (ShippingMethodInput item1 : shippingMethods) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                item1.appendTo(_queryBuilder);
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append('}');
    }
}

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
import com.shopify.graphql.support.Input;

/**
 * Defines the shipping address to assign to the negotiable quote.
 */
public class SetNegotiableQuoteShippingAddressInput implements Serializable {
    private ID quoteUid;

    private Input<ID> customerAddressId = Input.undefined();

    private Input<List<NegotiableQuoteShippingAddressInput>> shippingAddresses = Input.undefined();

    public SetNegotiableQuoteShippingAddressInput(ID quoteUid) {
        this.quoteUid = quoteUid;
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
    public SetNegotiableQuoteShippingAddressInput setQuoteUid(ID quoteUid) {
        this.quoteUid = quoteUid;
        return this;
    }

    /**
     * The unique ID of a `CustomerAddress` object.
     */
    public ID getCustomerAddressId() {
        return customerAddressId.getValue();
    }

    /**
     * The unique ID of a `CustomerAddress` object.
     */
    public Input<ID> getCustomerAddressIdInput() {
        return customerAddressId;
    }

    /**
     * The unique ID of a `CustomerAddress` object.
     */
    public SetNegotiableQuoteShippingAddressInput setCustomerAddressId(ID customerAddressId) {
        this.customerAddressId = Input.optional(customerAddressId);
        return this;
    }

    /**
     * The unique ID of a `CustomerAddress` object.
     */
    public SetNegotiableQuoteShippingAddressInput setCustomerAddressIdInput(Input<ID> customerAddressId) {
        if (customerAddressId == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.customerAddressId = customerAddressId;
        return this;
    }

    /**
     * An array of shipping addresses to apply to the negotiable quote.
     */
    public List<NegotiableQuoteShippingAddressInput> getShippingAddresses() {
        return shippingAddresses.getValue();
    }

    /**
     * An array of shipping addresses to apply to the negotiable quote.
     */
    public Input<List<NegotiableQuoteShippingAddressInput>> getShippingAddressesInput() {
        return shippingAddresses;
    }

    /**
     * An array of shipping addresses to apply to the negotiable quote.
     */
    public SetNegotiableQuoteShippingAddressInput setShippingAddresses(List<NegotiableQuoteShippingAddressInput> shippingAddresses) {
        this.shippingAddresses = Input.optional(shippingAddresses);
        return this;
    }

    /**
     * An array of shipping addresses to apply to the negotiable quote.
     */
    public SetNegotiableQuoteShippingAddressInput setShippingAddressesInput(
        Input<List<NegotiableQuoteShippingAddressInput>> shippingAddresses) {
        if (shippingAddresses == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.shippingAddresses = shippingAddresses;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("quote_uid:");
        AbstractQuery.appendQuotedString(_queryBuilder, quoteUid.toString());

        if (this.customerAddressId.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("customer_address_id:");
            if (customerAddressId.getValue() != null) {
                AbstractQuery.appendQuotedString(_queryBuilder, customerAddressId.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.shippingAddresses.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("shipping_addresses:");
            if (shippingAddresses.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (NegotiableQuoteShippingAddressInput item1 : shippingAddresses.getValue()) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        item1.appendTo(_queryBuilder);
                    }
                }
                _queryBuilder.append(']');
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}

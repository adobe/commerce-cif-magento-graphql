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
import com.shopify.graphql.support.Input;

/**
 * Defines shipping addresses for the negotiable quote.
 */
public class NegotiableQuoteShippingAddressInput implements Serializable {
    private Input<NegotiableQuoteAddressInput> address = Input.undefined();

    private Input<ID> customerAddressUid = Input.undefined();

    private Input<String> customerNotes = Input.undefined();

    /**
     * A shipping address.
     */
    public NegotiableQuoteAddressInput getAddress() {
        return address.getValue();
    }

    /**
     * A shipping address.
     */
    public Input<NegotiableQuoteAddressInput> getAddressInput() {
        return address;
    }

    /**
     * A shipping address.
     */
    public NegotiableQuoteShippingAddressInput setAddress(NegotiableQuoteAddressInput address) {
        this.address = Input.optional(address);
        return this;
    }

    /**
     * A shipping address.
     */
    public NegotiableQuoteShippingAddressInput setAddressInput(Input<NegotiableQuoteAddressInput> address) {
        if (address == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.address = address;
        return this;
    }

    /**
     * An ID from the company user&#39;s address book that uniquely identifies the address to be used for
     * shipping.
     */
    public ID getCustomerAddressUid() {
        return customerAddressUid.getValue();
    }

    /**
     * An ID from the company user&#39;s address book that uniquely identifies the address to be used for
     * shipping.
     */
    public Input<ID> getCustomerAddressUidInput() {
        return customerAddressUid;
    }

    /**
     * An ID from the company user&#39;s address book that uniquely identifies the address to be used for
     * shipping.
     */
    public NegotiableQuoteShippingAddressInput setCustomerAddressUid(ID customerAddressUid) {
        this.customerAddressUid = Input.optional(customerAddressUid);
        return this;
    }

    /**
     * An ID from the company user&#39;s address book that uniquely identifies the address to be used for
     * shipping.
     */
    public NegotiableQuoteShippingAddressInput setCustomerAddressUidInput(Input<ID> customerAddressUid) {
        if (customerAddressUid == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.customerAddressUid = customerAddressUid;
        return this;
    }

    /**
     * Text provided by the company user.
     */
    public String getCustomerNotes() {
        return customerNotes.getValue();
    }

    /**
     * Text provided by the company user.
     */
    public Input<String> getCustomerNotesInput() {
        return customerNotes;
    }

    /**
     * Text provided by the company user.
     */
    public NegotiableQuoteShippingAddressInput setCustomerNotes(String customerNotes) {
        this.customerNotes = Input.optional(customerNotes);
        return this;
    }

    /**
     * Text provided by the company user.
     */
    public NegotiableQuoteShippingAddressInput setCustomerNotesInput(Input<String> customerNotes) {
        if (customerNotes == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.customerNotes = customerNotes;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.address.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("address:");
            if (address.getValue() != null) {
                address.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.customerAddressUid.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("customer_address_uid:");
            if (customerAddressUid.getValue() != null) {
                AbstractQuery.appendQuotedString(_queryBuilder, customerAddressUid.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.customerNotes.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("customer_notes:");
            if (customerNotes.getValue() != null) {
                AbstractQuery.appendQuotedString(_queryBuilder, customerNotes.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}

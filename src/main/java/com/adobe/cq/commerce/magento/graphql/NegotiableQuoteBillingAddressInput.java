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
 * Defines the billing address.
 */
public class NegotiableQuoteBillingAddressInput implements Serializable {
    private Input<NegotiableQuoteAddressInput> address = Input.undefined();

    private Input<ID> customerAddressUid = Input.undefined();

    private Input<Boolean> sameAsShipping = Input.undefined();

    private Input<Boolean> useForShipping = Input.undefined();

    /**
     * Defines a billing address.
     */
    public NegotiableQuoteAddressInput getAddress() {
        return address.getValue();
    }

    /**
     * Defines a billing address.
     */
    public Input<NegotiableQuoteAddressInput> getAddressInput() {
        return address;
    }

    /**
     * Defines a billing address.
     */
    public NegotiableQuoteBillingAddressInput setAddress(NegotiableQuoteAddressInput address) {
        this.address = Input.optional(address);
        return this;
    }

    /**
     * Defines a billing address.
     */
    public NegotiableQuoteBillingAddressInput setAddressInput(Input<NegotiableQuoteAddressInput> address) {
        if (address == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.address = address;
        return this;
    }

    /**
     * The unique ID of a `CustomerAddress` object.
     */
    public ID getCustomerAddressUid() {
        return customerAddressUid.getValue();
    }

    /**
     * The unique ID of a `CustomerAddress` object.
     */
    public Input<ID> getCustomerAddressUidInput() {
        return customerAddressUid;
    }

    /**
     * The unique ID of a `CustomerAddress` object.
     */
    public NegotiableQuoteBillingAddressInput setCustomerAddressUid(ID customerAddressUid) {
        this.customerAddressUid = Input.optional(customerAddressUid);
        return this;
    }

    /**
     * The unique ID of a `CustomerAddress` object.
     */
    public NegotiableQuoteBillingAddressInput setCustomerAddressUidInput(Input<ID> customerAddressUid) {
        if (customerAddressUid == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.customerAddressUid = customerAddressUid;
        return this;
    }

    /**
     * Indicates whether to set the billing address to be the same as the existing shipping address on the
     * negotiable quote.
     */
    public Boolean getSameAsShipping() {
        return sameAsShipping.getValue();
    }

    /**
     * Indicates whether to set the billing address to be the same as the existing shipping address on the
     * negotiable quote.
     */
    public Input<Boolean> getSameAsShippingInput() {
        return sameAsShipping;
    }

    /**
     * Indicates whether to set the billing address to be the same as the existing shipping address on the
     * negotiable quote.
     */
    public NegotiableQuoteBillingAddressInput setSameAsShipping(Boolean sameAsShipping) {
        this.sameAsShipping = Input.optional(sameAsShipping);
        return this;
    }

    /**
     * Indicates whether to set the billing address to be the same as the existing shipping address on the
     * negotiable quote.
     */
    public NegotiableQuoteBillingAddressInput setSameAsShippingInput(Input<Boolean> sameAsShipping) {
        if (sameAsShipping == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.sameAsShipping = sameAsShipping;
        return this;
    }

    /**
     * Indicates whether to set the shipping address to be the same as this billing address.
     */
    public Boolean getUseForShipping() {
        return useForShipping.getValue();
    }

    /**
     * Indicates whether to set the shipping address to be the same as this billing address.
     */
    public Input<Boolean> getUseForShippingInput() {
        return useForShipping;
    }

    /**
     * Indicates whether to set the shipping address to be the same as this billing address.
     */
    public NegotiableQuoteBillingAddressInput setUseForShipping(Boolean useForShipping) {
        this.useForShipping = Input.optional(useForShipping);
        return this;
    }

    /**
     * Indicates whether to set the shipping address to be the same as this billing address.
     */
    public NegotiableQuoteBillingAddressInput setUseForShippingInput(Input<Boolean> useForShipping) {
        if (useForShipping == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.useForShipping = useForShipping;
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

        if (this.sameAsShipping.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("same_as_shipping:");
            if (sameAsShipping.getValue() != null) {
                _queryBuilder.append(sameAsShipping.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.useForShipping.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("use_for_shipping:");
            if (useForShipping.getValue() != null) {
                _queryBuilder.append(useForShipping.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}

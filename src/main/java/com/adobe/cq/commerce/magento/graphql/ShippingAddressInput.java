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
import com.shopify.graphql.support.Input;

public class ShippingAddressInput implements Serializable {
    private Input<CartAddressInput> address = Input.undefined();

    private Input<Integer> customerAddressId = Input.undefined();

    private Input<String> customerNotes = Input.undefined();

    public CartAddressInput getAddress() {
        return address.getValue();
    }

    public Input<CartAddressInput> getAddressInput() {
        return address;
    }

    public ShippingAddressInput setAddress(CartAddressInput address) {
        this.address = Input.optional(address);
        return this;
    }

    public ShippingAddressInput setAddressInput(Input<CartAddressInput> address) {
        if (address == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.address = address;
        return this;
    }

    public Integer getCustomerAddressId() {
        return customerAddressId.getValue();
    }

    public Input<Integer> getCustomerAddressIdInput() {
        return customerAddressId;
    }

    public ShippingAddressInput setCustomerAddressId(Integer customerAddressId) {
        this.customerAddressId = Input.optional(customerAddressId);
        return this;
    }

    public ShippingAddressInput setCustomerAddressIdInput(Input<Integer> customerAddressId) {
        if (customerAddressId == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.customerAddressId = customerAddressId;
        return this;
    }

    public String getCustomerNotes() {
        return customerNotes.getValue();
    }

    public Input<String> getCustomerNotesInput() {
        return customerNotes;
    }

    public ShippingAddressInput setCustomerNotes(String customerNotes) {
        this.customerNotes = Input.optional(customerNotes);
        return this;
    }

    public ShippingAddressInput setCustomerNotesInput(Input<String> customerNotes) {
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

        if (this.customerAddressId.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("customer_address_id:");
            if (customerAddressId.getValue() != null) {
                _queryBuilder.append(customerAddressId.getValue());
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

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

import com.shopify.graphql.support.Input;

public class BillingAddressInput implements Serializable {
    private Input<CartAddressInput> address = Input.undefined();

    private Input<Integer> customerAddressId = Input.undefined();

    private Input<Boolean> sameAsShipping = Input.undefined();

    private Input<Boolean> useForShipping = Input.undefined();

    public CartAddressInput getAddress() {
        return address.getValue();
    }

    public Input<CartAddressInput> getAddressInput() {
        return address;
    }

    public BillingAddressInput setAddress(CartAddressInput address) {
        this.address = Input.optional(address);
        return this;
    }

    public BillingAddressInput setAddressInput(Input<CartAddressInput> address) {
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

    public BillingAddressInput setCustomerAddressId(Integer customerAddressId) {
        this.customerAddressId = Input.optional(customerAddressId);
        return this;
    }

    public BillingAddressInput setCustomerAddressIdInput(Input<Integer> customerAddressId) {
        if (customerAddressId == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.customerAddressId = customerAddressId;
        return this;
    }

    /**
     * Set billing address same as shipping
     */
    public Boolean getSameAsShipping() {
        return sameAsShipping.getValue();
    }

    /**
     * Set billing address same as shipping
     */
    public Input<Boolean> getSameAsShippingInput() {
        return sameAsShipping;
    }

    /**
     * Set billing address same as shipping
     */
    public BillingAddressInput setSameAsShipping(Boolean sameAsShipping) {
        this.sameAsShipping = Input.optional(sameAsShipping);
        return this;
    }

    /**
     * Set billing address same as shipping
     */
    public BillingAddressInput setSameAsShippingInput(Input<Boolean> sameAsShipping) {
        if (sameAsShipping == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.sameAsShipping = sameAsShipping;
        return this;
    }

    /**
     * Deprecated: use `same_as_shipping` field instead
     */
    public Boolean getUseForShipping() {
        return useForShipping.getValue();
    }

    /**
     * Deprecated: use `same_as_shipping` field instead
     */
    public Input<Boolean> getUseForShippingInput() {
        return useForShipping;
    }

    /**
     * Deprecated: use `same_as_shipping` field instead
     */
    public BillingAddressInput setUseForShipping(Boolean useForShipping) {
        this.useForShipping = Input.optional(useForShipping);
        return this;
    }

    /**
     * Deprecated: use `same_as_shipping` field instead
     */
    public BillingAddressInput setUseForShippingInput(Input<Boolean> useForShipping) {
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

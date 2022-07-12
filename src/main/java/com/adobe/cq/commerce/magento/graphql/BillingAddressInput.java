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
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import com.shopify.graphql.support.Input;

/**
 * Defines the billing address.
 */
public class BillingAddressInput implements Serializable {
    private Input<CartAddressInput> address = Input.undefined();

    private Input<Integer> customerAddressId = Input.undefined();

    private Input<Boolean> sameAsShipping = Input.undefined();

    private Input<Boolean> useForShipping = Input.undefined();

    private Map<String, Input<Serializable>> customFilters = new HashMap<>();

    /**
     * Defines a billing address.
     */
    public CartAddressInput getAddress() {
        return address.getValue();
    }

    /**
     * Defines a billing address.
     */
    public Input<CartAddressInput> getAddressInput() {
        return address;
    }

    /**
     * Defines a billing address.
     */
    public BillingAddressInput setAddress(CartAddressInput address) {
        this.address = Input.optional(address);
        return this;
    }

    /**
     * Defines a billing address.
     */
    public BillingAddressInput setAddressInput(Input<CartAddressInput> address) {
        if (address == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.address = address;
        return this;
    }

    /**
     * An ID from the customer&#39;s address book that uniquely identifies the address to be used for billing.
     */
    public Integer getCustomerAddressId() {
        return customerAddressId.getValue();
    }

    /**
     * An ID from the customer&#39;s address book that uniquely identifies the address to be used for billing.
     */
    public Input<Integer> getCustomerAddressIdInput() {
        return customerAddressId;
    }

    /**
     * An ID from the customer&#39;s address book that uniquely identifies the address to be used for billing.
     */
    public BillingAddressInput setCustomerAddressId(Integer customerAddressId) {
        this.customerAddressId = Input.optional(customerAddressId);
        return this;
    }

    /**
     * An ID from the customer&#39;s address book that uniquely identifies the address to be used for billing.
     */
    public BillingAddressInput setCustomerAddressIdInput(Input<Integer> customerAddressId) {
        if (customerAddressId == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.customerAddressId = customerAddressId;
        return this;
    }

    /**
     * Indicates whether to set the billing address to be the same as the existing shipping address on the
     * cart.
     */
    public Boolean getSameAsShipping() {
        return sameAsShipping.getValue();
    }

    /**
     * Indicates whether to set the billing address to be the same as the existing shipping address on the
     * cart.
     */
    public Input<Boolean> getSameAsShippingInput() {
        return sameAsShipping;
    }

    /**
     * Indicates whether to set the billing address to be the same as the existing shipping address on the
     * cart.
     */
    public BillingAddressInput setSameAsShipping(Boolean sameAsShipping) {
        this.sameAsShipping = Input.optional(sameAsShipping);
        return this;
    }

    /**
     * Indicates whether to set the billing address to be the same as the existing shipping address on the
     * cart.
     */
    public BillingAddressInput setSameAsShippingInput(Input<Boolean> sameAsShipping) {
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
    public BillingAddressInput setUseForShipping(Boolean useForShipping) {
        this.useForShipping = Input.optional(useForShipping);
        return this;
    }

    /**
     * Indicates whether to set the shipping address to be the same as this billing address.
     */
    public BillingAddressInput setUseForShippingInput(Input<Boolean> useForShipping) {
        if (useForShipping == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.useForShipping = useForShipping;
        return this;
    }

    /**
     * Set custom filter.
     */
    public BillingAddressInput setCustomFilter(String name, Serializable filterInput) {
        this.customFilters.put(name, Input.optional(filterInput));
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (!this.customFilters.isEmpty()) {
            for (Map.Entry<String, Input<Serializable>> entry : customFilters.entrySet()) {
                _queryBuilder.append(separator);
                separator = ",";
                _queryBuilder.append(entry.getKey() + ":");

                Serializable filter = entry.getValue().getValue();

                if (filter != null) {
                    try {
                        Method appendTo = filter.getClass().getMethod("appendTo", StringBuilder.class);
                        appendTo.invoke(filter, _queryBuilder);
                    } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
                        _queryBuilder.append("null");
                    }
                } else {
                    _queryBuilder.append("null");
                }
            }
        }

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

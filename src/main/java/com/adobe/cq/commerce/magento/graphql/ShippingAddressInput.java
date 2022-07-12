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

import com.shopify.graphql.support.AbstractQuery;
import com.shopify.graphql.support.Input;

/**
 * Defines a single shipping address.
 */
public class ShippingAddressInput implements Serializable {
    private Input<CartAddressInput> address = Input.undefined();

    private Input<Integer> customerAddressId = Input.undefined();

    private Input<String> customerNotes = Input.undefined();

    private Input<String> pickupLocationCode = Input.undefined();

    private Map<String, Input<Serializable>> customFilters = new HashMap<>();

    /**
     * Defines a shipping address.
     */
    public CartAddressInput getAddress() {
        return address.getValue();
    }

    /**
     * Defines a shipping address.
     */
    public Input<CartAddressInput> getAddressInput() {
        return address;
    }

    /**
     * Defines a shipping address.
     */
    public ShippingAddressInput setAddress(CartAddressInput address) {
        this.address = Input.optional(address);
        return this;
    }

    /**
     * Defines a shipping address.
     */
    public ShippingAddressInput setAddressInput(Input<CartAddressInput> address) {
        if (address == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.address = address;
        return this;
    }

    /**
     * An ID from the customer&#39;s address book that uniquely identifies the address to be used for shipping.
     */
    public Integer getCustomerAddressId() {
        return customerAddressId.getValue();
    }

    /**
     * An ID from the customer&#39;s address book that uniquely identifies the address to be used for shipping.
     */
    public Input<Integer> getCustomerAddressIdInput() {
        return customerAddressId;
    }

    /**
     * An ID from the customer&#39;s address book that uniquely identifies the address to be used for shipping.
     */
    public ShippingAddressInput setCustomerAddressId(Integer customerAddressId) {
        this.customerAddressId = Input.optional(customerAddressId);
        return this;
    }

    /**
     * An ID from the customer&#39;s address book that uniquely identifies the address to be used for shipping.
     */
    public ShippingAddressInput setCustomerAddressIdInput(Input<Integer> customerAddressId) {
        if (customerAddressId == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.customerAddressId = customerAddressId;
        return this;
    }

    /**
     * Text provided by the shopper.
     */
    public String getCustomerNotes() {
        return customerNotes.getValue();
    }

    /**
     * Text provided by the shopper.
     */
    public Input<String> getCustomerNotesInput() {
        return customerNotes;
    }

    /**
     * Text provided by the shopper.
     */
    public ShippingAddressInput setCustomerNotes(String customerNotes) {
        this.customerNotes = Input.optional(customerNotes);
        return this;
    }

    /**
     * Text provided by the shopper.
     */
    public ShippingAddressInput setCustomerNotesInput(Input<String> customerNotes) {
        if (customerNotes == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.customerNotes = customerNotes;
        return this;
    }

    /**
     * The code of Pickup Location which will be used for In-Store Pickup.
     */
    public String getPickupLocationCode() {
        return pickupLocationCode.getValue();
    }

    /**
     * The code of Pickup Location which will be used for In-Store Pickup.
     */
    public Input<String> getPickupLocationCodeInput() {
        return pickupLocationCode;
    }

    /**
     * The code of Pickup Location which will be used for In-Store Pickup.
     */
    public ShippingAddressInput setPickupLocationCode(String pickupLocationCode) {
        this.pickupLocationCode = Input.optional(pickupLocationCode);
        return this;
    }

    /**
     * The code of Pickup Location which will be used for In-Store Pickup.
     */
    public ShippingAddressInput setPickupLocationCodeInput(Input<String> pickupLocationCode) {
        if (pickupLocationCode == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.pickupLocationCode = pickupLocationCode;
        return this;
    }

    /**
     * Set custom filter.
     */
    public ShippingAddressInput setCustomFilter(String name, Serializable filterInput) {
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

        if (this.pickupLocationCode.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("pickup_location_code:");
            if (pickupLocationCode.getValue() != null) {
                AbstractQuery.appendQuotedString(_queryBuilder, pickupLocationCode.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}

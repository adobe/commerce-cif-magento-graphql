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
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Input;

/**
 * Specify either address_data or the address_id. If both are provided, validation will fail
 */
public class GiftRegistryShippingAddressInput implements Serializable {
    private Input<CustomerAddressInput> addressData = Input.undefined();

    private Input<ID> addressId = Input.undefined();

    private Map<String, Input<Serializable>> customFilters = new HashMap<>();

    /**
     * Defines the shipping address for this gift registry
     */
    public CustomerAddressInput getAddressData() {
        return addressData.getValue();
    }

    /**
     * Defines the shipping address for this gift registry
     */
    public Input<CustomerAddressInput> getAddressDataInput() {
        return addressData;
    }

    /**
     * Defines the shipping address for this gift registry
     */
    public GiftRegistryShippingAddressInput setAddressData(CustomerAddressInput addressData) {
        this.addressData = Input.optional(addressData);
        return this;
    }

    /**
     * Defines the shipping address for this gift registry
     */
    public GiftRegistryShippingAddressInput setAddressDataInput(Input<CustomerAddressInput> addressData) {
        if (addressData == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.addressData = addressData;
        return this;
    }

    /**
     * The ID assigned to this customer address
     */
    public ID getAddressId() {
        return addressId.getValue();
    }

    /**
     * The ID assigned to this customer address
     */
    public Input<ID> getAddressIdInput() {
        return addressId;
    }

    /**
     * The ID assigned to this customer address
     */
    public GiftRegistryShippingAddressInput setAddressId(ID addressId) {
        this.addressId = Input.optional(addressId);
        return this;
    }

    /**
     * The ID assigned to this customer address
     */
    public GiftRegistryShippingAddressInput setAddressIdInput(Input<ID> addressId) {
        if (addressId == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.addressId = addressId;
        return this;
    }

    /**
     * Set custom filter.
     */
    public GiftRegistryShippingAddressInput setCustomFilter(String name, Serializable filterInput) {
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

        if (this.addressData.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("address_data:");
            if (addressData.getValue() != null) {
                addressData.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.addressId.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("address_id:");
            if (addressId.getValue() != null) {
                AbstractQuery.appendQuotedString(_queryBuilder, addressId.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}

/*******************************************************************************
 *
 *    Copyright 2019 Adobe. All rights reserved.
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

public class SetShippingAddressesOnCartInput implements Serializable {
    private String cartId;

    private List<ShippingAddressInput> shippingAddresses;

    public SetShippingAddressesOnCartInput(String cartId, List<ShippingAddressInput> shippingAddresses) {
        this.cartId = cartId;

        this.shippingAddresses = shippingAddresses;
    }

    public String getCartId() {
        return cartId;
    }

    public SetShippingAddressesOnCartInput setCartId(String cartId) {
        this.cartId = cartId;
        return this;
    }

    public List<ShippingAddressInput> getShippingAddresses() {
        return shippingAddresses;
    }

    public SetShippingAddressesOnCartInput setShippingAddresses(List<ShippingAddressInput> shippingAddresses) {
        this.shippingAddresses = shippingAddresses;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("cart_id:");
        AbstractQuery.appendQuotedString(_queryBuilder, cartId.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("shipping_addresses:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (ShippingAddressInput item1 : shippingAddresses) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                item1.appendTo(_queryBuilder);
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append('}');
    }
}

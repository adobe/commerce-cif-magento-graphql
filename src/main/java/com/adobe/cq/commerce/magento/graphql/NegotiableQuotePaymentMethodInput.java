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
 * Defines the payment method to be applied to the negotiable quote.
 */
public class NegotiableQuotePaymentMethodInput implements Serializable {
    private String code;

    private Input<String> purchaseOrderNumber = Input.undefined();

    private Map<String, Input<Serializable>> customFilters = new HashMap<>();

    public NegotiableQuotePaymentMethodInput(String code) {
        this.code = code;
    }

    /**
     * Payment method code
     */
    public String getCode() {
        return code;
    }

    /**
     * Payment method code
     */
    public NegotiableQuotePaymentMethodInput setCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * The purchase order number. Optional for most payment methods.
     */
    public String getPurchaseOrderNumber() {
        return purchaseOrderNumber.getValue();
    }

    /**
     * The purchase order number. Optional for most payment methods.
     */
    public Input<String> getPurchaseOrderNumberInput() {
        return purchaseOrderNumber;
    }

    /**
     * The purchase order number. Optional for most payment methods.
     */
    public NegotiableQuotePaymentMethodInput setPurchaseOrderNumber(String purchaseOrderNumber) {
        this.purchaseOrderNumber = Input.optional(purchaseOrderNumber);
        return this;
    }

    /**
     * The purchase order number. Optional for most payment methods.
     */
    public NegotiableQuotePaymentMethodInput setPurchaseOrderNumberInput(Input<String> purchaseOrderNumber) {
        if (purchaseOrderNumber == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.purchaseOrderNumber = purchaseOrderNumber;
        return this;
    }

    /**
     * Set custom filter.
     */
    public NegotiableQuotePaymentMethodInput setCustomFilter(String name, Serializable filterInput) {
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

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("code:");
        AbstractQuery.appendQuotedString(_queryBuilder, code.toString());

        if (this.purchaseOrderNumber.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("purchase_order_number:");
            if (purchaseOrderNumber.getValue() != null) {
                AbstractQuery.appendQuotedString(_queryBuilder, purchaseOrderNumber.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}

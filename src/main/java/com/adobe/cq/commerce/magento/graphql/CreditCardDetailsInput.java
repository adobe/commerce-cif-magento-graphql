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
 * Required fields for Payflow Pro and Payments Pro credit card payments
 */
public class CreditCardDetailsInput implements Serializable {
    private int ccExpMonth;

    private int ccExpYear;

    private int ccLast4;

    private String ccType;

    private Map<String, Input<Serializable>> customFilters = new HashMap<>();

    public CreditCardDetailsInput(int ccExpMonth, int ccExpYear, int ccLast4, String ccType) {
        this.ccExpMonth = ccExpMonth;

        this.ccExpYear = ccExpYear;

        this.ccLast4 = ccLast4;

        this.ccType = ccType;
    }

    /**
     * Credit card expiration month
     */
    public int getCcExpMonth() {
        return ccExpMonth;
    }

    /**
     * Credit card expiration month
     */
    public CreditCardDetailsInput setCcExpMonth(int ccExpMonth) {
        this.ccExpMonth = ccExpMonth;
        return this;
    }

    /**
     * Credit card expiration year
     */
    public int getCcExpYear() {
        return ccExpYear;
    }

    /**
     * Credit card expiration year
     */
    public CreditCardDetailsInput setCcExpYear(int ccExpYear) {
        this.ccExpYear = ccExpYear;
        return this;
    }

    /**
     * Last 4 digits of the credit card
     */
    public int getCcLast4() {
        return ccLast4;
    }

    /**
     * Last 4 digits of the credit card
     */
    public CreditCardDetailsInput setCcLast4(int ccLast4) {
        this.ccLast4 = ccLast4;
        return this;
    }

    /**
     * Credit card type
     */
    public String getCcType() {
        return ccType;
    }

    /**
     * Credit card type
     */
    public CreditCardDetailsInput setCcType(String ccType) {
        this.ccType = ccType;
        return this;
    }

    /**
     * Set custom filter.
     */
    public CreditCardDetailsInput setCustomFilter(String name, Serializable filterInput) {
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
        _queryBuilder.append("cc_exp_month:");
        _queryBuilder.append(ccExpMonth);

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("cc_exp_year:");
        _queryBuilder.append(ccExpYear);

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("cc_last_4:");
        _queryBuilder.append(ccLast4);

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("cc_type:");
        AbstractQuery.appendQuotedString(_queryBuilder, ccType.toString());

        _queryBuilder.append('}');
    }
}

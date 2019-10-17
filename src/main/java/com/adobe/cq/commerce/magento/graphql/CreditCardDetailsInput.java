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

import com.shopify.graphql.support.AbstractQuery;

public class CreditCardDetailsInput implements Serializable {
    private int ccExpMonth;

    private int ccExpYear;

    private int ccLast4;

    private String ccType;

    public CreditCardDetailsInput(int ccExpMonth, int ccExpYear, int ccLast4, String ccType) {
        this.ccExpMonth = ccExpMonth;

        this.ccExpYear = ccExpYear;

        this.ccLast4 = ccLast4;

        this.ccType = ccType;
    }

    public int getCcExpMonth() {
        return ccExpMonth;
    }

    public CreditCardDetailsInput setCcExpMonth(int ccExpMonth) {
        this.ccExpMonth = ccExpMonth;
        return this;
    }

    public int getCcExpYear() {
        return ccExpYear;
    }

    public CreditCardDetailsInput setCcExpYear(int ccExpYear) {
        this.ccExpYear = ccExpYear;
        return this;
    }

    public int getCcLast4() {
        return ccLast4;
    }

    public CreditCardDetailsInput setCcLast4(int ccLast4) {
        this.ccLast4 = ccLast4;
        return this;
    }

    public String getCcType() {
        return ccType;
    }

    public CreditCardDetailsInput setCcType(String ccType) {
        this.ccType = ccType;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

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

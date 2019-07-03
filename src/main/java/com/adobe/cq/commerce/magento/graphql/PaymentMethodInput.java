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
import com.shopify.graphql.support.Input;

public class PaymentMethodInput implements Serializable {
    private String code;

    private Input<String> purchaseOrderNumber = Input.undefined();

    public PaymentMethodInput(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public PaymentMethodInput setCode(String code) {
        this.code = code;
        return this;
    }

    public String getPurchaseOrderNumber() {
        return purchaseOrderNumber.getValue();
    }

    public Input<String> getPurchaseOrderNumberInput() {
        return purchaseOrderNumber;
    }

    public PaymentMethodInput setPurchaseOrderNumber(String purchaseOrderNumber) {
        this.purchaseOrderNumber = Input.optional(purchaseOrderNumber);
        return this;
    }

    public PaymentMethodInput setPurchaseOrderNumberInput(Input<String> purchaseOrderNumber) {
        if (purchaseOrderNumber == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.purchaseOrderNumber = purchaseOrderNumber;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

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

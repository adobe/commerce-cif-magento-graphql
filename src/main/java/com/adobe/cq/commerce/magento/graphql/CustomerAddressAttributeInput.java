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

public class CustomerAddressAttributeInput implements Serializable {
    private String attributeCode;

    private String value;

    public CustomerAddressAttributeInput(String attributeCode, String value) {
        this.attributeCode = attributeCode;

        this.value = value;
    }

    public String getAttributeCode() {
        return attributeCode;
    }

    public CustomerAddressAttributeInput setAttributeCode(String attributeCode) {
        this.attributeCode = attributeCode;
        return this;
    }

    public String getValue() {
        return value;
    }

    public CustomerAddressAttributeInput setValue(String value) {
        this.value = value;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("attribute_code:");
        AbstractQuery.appendQuotedString(_queryBuilder, attributeCode.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("value:");
        AbstractQuery.appendQuotedString(_queryBuilder, value.toString());

        _queryBuilder.append('}');
    }
}

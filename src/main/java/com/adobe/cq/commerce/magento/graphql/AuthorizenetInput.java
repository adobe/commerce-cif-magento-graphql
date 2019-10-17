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

public class AuthorizenetInput implements Serializable {
    private int ccLast4;

    private String opaqueDataDescriptor;

    private String opaqueDataValue;

    public AuthorizenetInput(int ccLast4, String opaqueDataDescriptor, String opaqueDataValue) {
        this.ccLast4 = ccLast4;

        this.opaqueDataDescriptor = opaqueDataDescriptor;

        this.opaqueDataValue = opaqueDataValue;
    }

    public int getCcLast4() {
        return ccLast4;
    }

    public AuthorizenetInput setCcLast4(int ccLast4) {
        this.ccLast4 = ccLast4;
        return this;
    }

    public String getOpaqueDataDescriptor() {
        return opaqueDataDescriptor;
    }

    public AuthorizenetInput setOpaqueDataDescriptor(String opaqueDataDescriptor) {
        this.opaqueDataDescriptor = opaqueDataDescriptor;
        return this;
    }

    public String getOpaqueDataValue() {
        return opaqueDataValue;
    }

    public AuthorizenetInput setOpaqueDataValue(String opaqueDataValue) {
        this.opaqueDataValue = opaqueDataValue;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("cc_last_4:");
        _queryBuilder.append(ccLast4);

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("opaque_data_descriptor:");
        AbstractQuery.appendQuotedString(_queryBuilder, opaqueDataDescriptor.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("opaque_data_value:");
        AbstractQuery.appendQuotedString(_queryBuilder, opaqueDataValue.toString());

        _queryBuilder.append('}');
    }
}

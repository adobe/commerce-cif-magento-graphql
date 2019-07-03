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

public class CustomizableOptionInput implements Serializable {
    private int id;

    private String valueString;

    public CustomizableOptionInput(int id, String valueString) {
        this.id = id;

        this.valueString = valueString;
    }

    public int getId() {
        return id;
    }

    public CustomizableOptionInput setId(int id) {
        this.id = id;
        return this;
    }

    public String getValueString() {
        return valueString;
    }

    public CustomizableOptionInput setValueString(String valueString) {
        this.valueString = valueString;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("id:");
        _queryBuilder.append(id);

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("value_string:");
        AbstractQuery.appendQuotedString(_queryBuilder, valueString.toString());

        _queryBuilder.append('}');
    }
}

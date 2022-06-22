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

import com.shopify.graphql.support.AbstractQuery;
import com.shopify.graphql.support.ID;

/**
 * Defines a dynamic attribute.
 */
public class GiftRegistryDynamicAttributeInput implements Serializable {
    private ID code;

    private String value;

    public GiftRegistryDynamicAttributeInput(ID code, String value) {
        this.code = code;

        this.value = value;
    }

    /**
     * A unique key for an additional attribute of the event.
     */
    public ID getCode() {
        return code;
    }

    /**
     * A unique key for an additional attribute of the event.
     */
    public GiftRegistryDynamicAttributeInput setCode(ID code) {
        this.code = code;
        return this;
    }

    /**
     * A string that describes a dynamic attribute.
     */
    public String getValue() {
        return value;
    }

    /**
     * A string that describes a dynamic attribute.
     */
    public GiftRegistryDynamicAttributeInput setValue(String value) {
        this.value = value;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("code:");
        AbstractQuery.appendQuotedString(_queryBuilder, code.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("value:");
        AbstractQuery.appendQuotedString(_queryBuilder, value.toString());

        _queryBuilder.append('}');
    }
}

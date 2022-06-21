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
 * Defines a customer-entered option.
 */
public class EnteredOptionInput implements Serializable {
    private ID uid;

    private String value;

    public EnteredOptionInput(ID uid, String value) {
        this.uid = uid;

        this.value = value;
    }

    /**
     * The unique ID for a `CustomizableOptionInterface` object, such as a `CustomizableFieldOption`,
     * `CustomizableFileOption`, or `CustomizableAreaOption` object.
     */
    public ID getUid() {
        return uid;
    }

    /**
     * The unique ID for a `CustomizableOptionInterface` object, such as a `CustomizableFieldOption`,
     * `CustomizableFileOption`, or `CustomizableAreaOption` object.
     */
    public EnteredOptionInput setUid(ID uid) {
        this.uid = uid;
        return this;
    }

    /**
     * Text the customer entered.
     */
    public String getValue() {
        return value;
    }

    /**
     * Text the customer entered.
     */
    public EnteredOptionInput setValue(String value) {
        this.value = value;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("uid:");
        AbstractQuery.appendQuotedString(_queryBuilder, uid.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("value:");
        AbstractQuery.appendQuotedString(_queryBuilder, value.toString());

        _queryBuilder.append('}');
    }
}

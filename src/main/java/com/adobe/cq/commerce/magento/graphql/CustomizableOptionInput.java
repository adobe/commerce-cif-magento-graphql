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
import com.shopify.graphql.support.Input;

/**
 * Defines a customizable option.
 */
public class CustomizableOptionInput implements Serializable {
    private String valueString;

    private Input<Integer> id = Input.undefined();

    public CustomizableOptionInput(String valueString) {
        this.valueString = valueString;
    }

    /**
     * The string value of the option.
     */
    public String getValueString() {
        return valueString;
    }

    /**
     * The string value of the option.
     */
    public CustomizableOptionInput setValueString(String valueString) {
        this.valueString = valueString;
        return this;
    }

    /**
     * The customizable option ID of the product.
     */
    public Integer getId() {
        return id.getValue();
    }

    /**
     * The customizable option ID of the product.
     */
    public Input<Integer> getIdInput() {
        return id;
    }

    /**
     * The customizable option ID of the product.
     */
    public CustomizableOptionInput setId(Integer id) {
        this.id = Input.optional(id);
        return this;
    }

    /**
     * The customizable option ID of the product.
     */
    public CustomizableOptionInput setIdInput(Input<Integer> id) {
        if (id == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.id = id;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("value_string:");
        AbstractQuery.appendQuotedString(_queryBuilder, valueString.toString());

        if (this.id.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("id:");
            if (id.getValue() != null) {
                _queryBuilder.append(id.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}

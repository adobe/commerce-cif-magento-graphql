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
 * Defines a filter that performs a fuzzy search.
 */
public class FilterMatchTypeInput implements Serializable {
    private Input<String> match = Input.undefined();

    /**
     * Use this attribute to exactly match the specified string. For example, to filter on a specific SKU,
     * specify a value such as `24-MB01`.
     */
    public String getMatch() {
        return match.getValue();
    }

    /**
     * Use this attribute to exactly match the specified string. For example, to filter on a specific SKU,
     * specify a value such as `24-MB01`.
     */
    public Input<String> getMatchInput() {
        return match;
    }

    /**
     * Use this attribute to exactly match the specified string. For example, to filter on a specific SKU,
     * specify a value such as `24-MB01`.
     */
    public FilterMatchTypeInput setMatch(String match) {
        this.match = Input.optional(match);
        return this;
    }

    /**
     * Use this attribute to exactly match the specified string. For example, to filter on a specific SKU,
     * specify a value such as `24-MB01`.
     */
    public FilterMatchTypeInput setMatchInput(Input<String> match) {
        if (match == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.match = match;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.match.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("match:");
            if (match.getValue() != null) {
                AbstractQuery.appendQuotedString(_queryBuilder, match.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}

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

import com.shopify.graphql.support.Input;

/**
 * Defines a filter to limit the negotiable quotes to return.
 */
public class NegotiableQuoteFilterInput implements Serializable {
    private Input<FilterEqualTypeInput> ids = Input.undefined();

    private Input<FilterMatchTypeInput> name = Input.undefined();

    /**
     * Filter by the ID of one or more negotiable quotes.
     */
    public FilterEqualTypeInput getIds() {
        return ids.getValue();
    }

    /**
     * Filter by the ID of one or more negotiable quotes.
     */
    public Input<FilterEqualTypeInput> getIdsInput() {
        return ids;
    }

    /**
     * Filter by the ID of one or more negotiable quotes.
     */
    public NegotiableQuoteFilterInput setIds(FilterEqualTypeInput ids) {
        this.ids = Input.optional(ids);
        return this;
    }

    /**
     * Filter by the ID of one or more negotiable quotes.
     */
    public NegotiableQuoteFilterInput setIdsInput(Input<FilterEqualTypeInput> ids) {
        if (ids == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.ids = ids;
        return this;
    }

    /**
     * Filter by the negotiable quote name.
     */
    public FilterMatchTypeInput getName() {
        return name.getValue();
    }

    /**
     * Filter by the negotiable quote name.
     */
    public Input<FilterMatchTypeInput> getNameInput() {
        return name;
    }

    /**
     * Filter by the negotiable quote name.
     */
    public NegotiableQuoteFilterInput setName(FilterMatchTypeInput name) {
        this.name = Input.optional(name);
        return this;
    }

    /**
     * Filter by the negotiable quote name.
     */
    public NegotiableQuoteFilterInput setNameInput(Input<FilterMatchTypeInput> name) {
        if (name == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.name = name;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.ids.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("ids:");
            if (ids.getValue() != null) {
                ids.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.name.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("name:");
            if (name.getValue() != null) {
                name.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}

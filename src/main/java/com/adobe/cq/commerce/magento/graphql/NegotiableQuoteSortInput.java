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

/**
 * Defines the field to use to sort a list of negotiable quotes.
 */
public class NegotiableQuoteSortInput implements Serializable {
    private SortEnum sortDirection;

    private NegotiableQuoteSortableField sortField;

    public NegotiableQuoteSortInput(SortEnum sortDirection, NegotiableQuoteSortableField sortField) {
        this.sortDirection = sortDirection;

        this.sortField = sortField;
    }

    /**
     * Whether to return results in ascending or descending order.
     */
    public SortEnum getSortDirection() {
        return sortDirection;
    }

    /**
     * Whether to return results in ascending or descending order.
     */
    public NegotiableQuoteSortInput setSortDirection(SortEnum sortDirection) {
        this.sortDirection = sortDirection;
        return this;
    }

    /**
     * The specified sort field.
     */
    public NegotiableQuoteSortableField getSortField() {
        return sortField;
    }

    /**
     * The specified sort field.
     */
    public NegotiableQuoteSortInput setSortField(NegotiableQuoteSortableField sortField) {
        this.sortField = sortField;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("sort_direction:");
        _queryBuilder.append(sortDirection.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("sort_field:");
        _queryBuilder.append(sortField.toString());

        _queryBuilder.append('}');
    }
}

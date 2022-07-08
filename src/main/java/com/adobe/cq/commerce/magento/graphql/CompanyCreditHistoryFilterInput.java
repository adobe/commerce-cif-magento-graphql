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
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import com.shopify.graphql.support.AbstractQuery;
import com.shopify.graphql.support.Input;

/**
 * Defines a filter for narrowing the results of a credit history search.
 */
public class CompanyCreditHistoryFilterInput implements Serializable {
    private Input<String> customReferenceNumber = Input.undefined();

    private Input<CompanyCreditOperationType> operationType = Input.undefined();

    private Input<String> updatedBy = Input.undefined();

    private Map<String, Input<Serializable>> customFilters = new HashMap<>();

    /**
     * The purchase order number associated with the company credit operation.
     */
    public String getCustomReferenceNumber() {
        return customReferenceNumber.getValue();
    }

    /**
     * The purchase order number associated with the company credit operation.
     */
    public Input<String> getCustomReferenceNumberInput() {
        return customReferenceNumber;
    }

    /**
     * The purchase order number associated with the company credit operation.
     */
    public CompanyCreditHistoryFilterInput setCustomReferenceNumber(String customReferenceNumber) {
        this.customReferenceNumber = Input.optional(customReferenceNumber);
        return this;
    }

    /**
     * The purchase order number associated with the company credit operation.
     */
    public CompanyCreditHistoryFilterInput setCustomReferenceNumberInput(Input<String> customReferenceNumber) {
        if (customReferenceNumber == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.customReferenceNumber = customReferenceNumber;
        return this;
    }

    /**
     * The type of the company credit operation.
     */
    public CompanyCreditOperationType getOperationType() {
        return operationType.getValue();
    }

    /**
     * The type of the company credit operation.
     */
    public Input<CompanyCreditOperationType> getOperationTypeInput() {
        return operationType;
    }

    /**
     * The type of the company credit operation.
     */
    public CompanyCreditHistoryFilterInput setOperationType(CompanyCreditOperationType operationType) {
        this.operationType = Input.optional(operationType);
        return this;
    }

    /**
     * The type of the company credit operation.
     */
    public CompanyCreditHistoryFilterInput setOperationTypeInput(Input<CompanyCreditOperationType> operationType) {
        if (operationType == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.operationType = operationType;
        return this;
    }

    /**
     * The name of the person submitting the company credit operation.
     */
    public String getUpdatedBy() {
        return updatedBy.getValue();
    }

    /**
     * The name of the person submitting the company credit operation.
     */
    public Input<String> getUpdatedByInput() {
        return updatedBy;
    }

    /**
     * The name of the person submitting the company credit operation.
     */
    public CompanyCreditHistoryFilterInput setUpdatedBy(String updatedBy) {
        this.updatedBy = Input.optional(updatedBy);
        return this;
    }

    /**
     * The name of the person submitting the company credit operation.
     */
    public CompanyCreditHistoryFilterInput setUpdatedByInput(Input<String> updatedBy) {
        if (updatedBy == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.updatedBy = updatedBy;
        return this;
    }

    /**
     * Set custom filter.
     */
    public CompanyCreditHistoryFilterInput setCustomFilter(String name, Serializable filterInput) {
        this.customFilters.put(name, Input.optional(filterInput));
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (!this.customFilters.isEmpty()) {
            for (Map.Entry<String, Input<Serializable>> entry : customFilters.entrySet()) {
                _queryBuilder.append(separator);
                separator = ",";
                _queryBuilder.append(entry.getKey() + ":");

                Serializable filter = entry.getValue().getValue();

                if (filter != null) {
                    try {
                        Method appendTo = filter.getClass().getMethod("appendTo", StringBuilder.class);
                        appendTo.invoke(filter, _queryBuilder);
                    } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
                        _queryBuilder.append("null");
                    }
                } else {
                    _queryBuilder.append("null");
                }
            }
        }

        if (this.customReferenceNumber.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("custom_reference_number:");
            if (customReferenceNumber.getValue() != null) {
                AbstractQuery.appendQuotedString(_queryBuilder, customReferenceNumber.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.operationType.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("operation_type:");
            if (operationType.getValue() != null) {
                _queryBuilder.append(operationType.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.updatedBy.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("updated_by:");
            if (updatedBy.getValue() != null) {
                AbstractQuery.appendQuotedString(_queryBuilder, updatedBy.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}

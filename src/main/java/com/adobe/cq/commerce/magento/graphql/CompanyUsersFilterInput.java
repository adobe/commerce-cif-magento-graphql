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

import com.shopify.graphql.support.Input;

/**
 * Defines the filter for returning a list of company users.
 */
public class CompanyUsersFilterInput implements Serializable {
    private Input<CompanyUserStatusEnum> status = Input.undefined();

    private Map<String, Input<Serializable>> customFilters = new HashMap<>();

    /**
     * The activity status to filter on.
     */
    public CompanyUserStatusEnum getStatus() {
        return status.getValue();
    }

    /**
     * The activity status to filter on.
     */
    public Input<CompanyUserStatusEnum> getStatusInput() {
        return status;
    }

    /**
     * The activity status to filter on.
     */
    public CompanyUsersFilterInput setStatus(CompanyUserStatusEnum status) {
        this.status = Input.optional(status);
        return this;
    }

    /**
     * The activity status to filter on.
     */
    public CompanyUsersFilterInput setStatusInput(Input<CompanyUserStatusEnum> status) {
        if (status == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.status = status;
        return this;
    }

    /**
     * Set custom filter.
     */
    public CompanyUsersFilterInput setCustomFilter(String name, Serializable filterInput) {
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

        if (this.status.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("status:");
            if (status.getValue() != null) {
                _queryBuilder.append(status.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}

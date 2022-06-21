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
import java.util.List;

import com.shopify.graphql.support.AbstractQuery;

/**
 * Defines the input schema for creating a company role.
 */
public class CompanyRoleCreateInput implements Serializable {
    private String name;

    private List<String> permissions;

    public CompanyRoleCreateInput(String name, List<String> permissions) {
        this.name = name;

        this.permissions = permissions;
    }

    /**
     * The name of the role to create.
     */
    public String getName() {
        return name;
    }

    /**
     * The name of the role to create.
     */
    public CompanyRoleCreateInput setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * A list of resources the role can access.
     */
    public List<String> getPermissions() {
        return permissions;
    }

    /**
     * A list of resources the role can access.
     */
    public CompanyRoleCreateInput setPermissions(List<String> permissions) {
        this.permissions = permissions;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("name:");
        AbstractQuery.appendQuotedString(_queryBuilder, name.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("permissions:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (String item1 : permissions) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                AbstractQuery.appendQuotedString(_queryBuilder, item1.toString());
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append('}');
    }
}

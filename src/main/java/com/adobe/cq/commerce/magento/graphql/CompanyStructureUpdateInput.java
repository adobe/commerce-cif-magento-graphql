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
 * Defines the input schema for updating the company structure.
 */
public class CompanyStructureUpdateInput implements Serializable {
    private ID parentTreeId;

    private ID treeId;

    public CompanyStructureUpdateInput(ID parentTreeId, ID treeId) {
        this.parentTreeId = parentTreeId;

        this.treeId = treeId;
    }

    /**
     * The ID of a company that will be the new parent.
     */
    public ID getParentTreeId() {
        return parentTreeId;
    }

    /**
     * The ID of a company that will be the new parent.
     */
    public CompanyStructureUpdateInput setParentTreeId(ID parentTreeId) {
        this.parentTreeId = parentTreeId;
        return this;
    }

    /**
     * The ID of the company team that is being moved to another parent.
     */
    public ID getTreeId() {
        return treeId;
    }

    /**
     * The ID of the company team that is being moved to another parent.
     */
    public CompanyStructureUpdateInput setTreeId(ID treeId) {
        this.treeId = treeId;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("parent_tree_id:");
        AbstractQuery.appendQuotedString(_queryBuilder, parentTreeId.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("tree_id:");
        AbstractQuery.appendQuotedString(_queryBuilder, treeId.toString());

        _queryBuilder.append('}');
    }
}

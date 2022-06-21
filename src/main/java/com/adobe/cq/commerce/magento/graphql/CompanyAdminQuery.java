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

import com.shopify.graphql.support.AbstractQuery;
import com.shopify.graphql.support.Fragment;

/**
 * Contains details about the company administrator.
 */
public class CompanyAdminQuery extends AbstractQuery<CompanyAdminQuery> {
    CompanyAdminQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
     * The email address of the company administrator.
     */
    public CompanyAdminQuery email() {
        startField("email");

        return this;
    }

    /**
     * The company administrator&#39;s first name.
     */
    public CompanyAdminQuery firstname() {
        startField("firstname");

        return this;
    }

    /**
     * The company administrator&#39;s gender (Male - 1, Female - 2, Not Specified - 3).
     */
    public CompanyAdminQuery gender() {
        startField("gender");

        return this;
    }

    /**
     * The unique ID for a `CompanyAdmin` object.
     */
    public CompanyAdminQuery id() {
        startField("id");

        return this;
    }

    /**
     * The job title of the company administrator.
     */
    public CompanyAdminQuery jobTitle() {
        startField("job_title");

        return this;
    }

    /**
     * The company administrator&#39;s last name.
     */
    public CompanyAdminQuery lastname() {
        startField("lastname");

        return this;
    }

    /**
     * Creates a GraphQL "named" fragment with the specified query type definition.
     * The generics nature of fragments ensures that a fragment can only be used at the right place in the GraphQL request.
     * 
     * @param name The name of the fragment, must be unique for a given GraphQL request.
     * @param queryDef The fragment definition.
     * @return The fragment of a given generics type.
     */
    public static Fragment<CompanyAdminQuery> createFragment(String name, CompanyAdminQueryDefinition queryDef) {
        StringBuilder sb = new StringBuilder();
        queryDef.define(new CompanyAdminQuery(sb));
        return new Fragment<>(name, "CompanyAdmin", sb.toString());
    }

    /**
     * Adds a <code>CompanyAdminQuery</code> fragment reference at the current position of the query.
     * For example for a fragment named <code>test</code>, calling this method will add the
     * reference <code>...test</code> in the query. For GraphQL types implementing an interface, there
     * will be some similar methods using the Query type of each implemented interface.
     * 
     * @param fragment The fragment to reference.
     */
    public CompanyAdminQuery addFragmentReference(Fragment<CompanyAdminQuery> fragment) {
        startField("..." + fragment.getName());
        return this;
    }
}

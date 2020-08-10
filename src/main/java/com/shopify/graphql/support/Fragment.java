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

package com.shopify.graphql.support;

/**
 * This class is used to define a GraphQL "named" fragment.<br>
 * <br>
 * A fragment can be referenced in any request with the <code>addFragmentReference(Fragment)</code> method of the corresponding fragment's
 * generic type and must be added to the root request with the <code>addFragment(Fragment)</code> method of the <code>QueryQuery</code>
 * or <code>MutationQuery</code> classes.
 */
public class Fragment<T> {

    private static final String FORMAT = "fragment %s on %s{%s}";

    protected String name;
    protected String type;
    protected String query;

    public Fragment(String name, String type, String query) {
        this.name = name;
        this.type = type;
        this.query = query;
    }

    @Override
    public String toString() {
        return String.format(FORMAT, name, type, query);
    }

    public String getName() {
        return name;
    }
}

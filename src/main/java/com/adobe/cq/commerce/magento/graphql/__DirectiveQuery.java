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

/**
 * A Directive provides a way to describe alternate runtime execution and type validation behavior in a
 * GraphQL document.
 * In some cases, you need to provide options to alter GraphQL&#39;s execution behavior in ways field
 * arguments will not suffice, such as conditionally including or skipping a field. Directives provide
 * this by describing additional information to the executor.
 */
public class __DirectiveQuery extends AbstractQuery<__DirectiveQuery> {
    __DirectiveQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public __DirectiveQuery args(__InputValueQueryDefinition queryDef) {
        startField("args");

        _queryBuilder.append('{');
        queryDef.define(new __InputValueQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public __DirectiveQuery description() {
        startField("description");

        return this;
    }

    public __DirectiveQuery locations() {
        startField("locations");

        return this;
    }

    public __DirectiveQuery name() {
        startField("name");

        return this;
    }

    /**
     * @deprecated Use `locations`.
     */
    @Deprecated
    public __DirectiveQuery onField() {
        startField("onField");

        return this;
    }

    /**
     * @deprecated Use `locations`.
     */
    @Deprecated
    public __DirectiveQuery onFragment() {
        startField("onFragment");

        return this;
    }

    /**
     * @deprecated Use `locations`.
     */
    @Deprecated
    public __DirectiveQuery onOperation() {
        startField("onOperation");

        return this;
    }
}

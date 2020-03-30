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
 * A GraphQL Schema defines the capabilities of a GraphQL server. It exposes all available types and
 * directives on the server, as well as the entry points for query, mutation, and subscription
 * operations.
 */
public class __SchemaQuery extends AbstractQuery<__SchemaQuery> {
    __SchemaQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
     * A list of all directives supported by this server.
     */
    public __SchemaQuery directives(__DirectiveQueryDefinition queryDef) {
        startField("directives");

        _queryBuilder.append('{');
        queryDef.define(new __DirectiveQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * If this server supports mutation, the type that mutation operations will be rooted at.
     */
    public __SchemaQuery mutationType(__TypeQueryDefinition queryDef) {
        startField("mutationType");

        _queryBuilder.append('{');
        queryDef.define(new __TypeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The type that query operations will be rooted at.
     */
    public __SchemaQuery queryType(__TypeQueryDefinition queryDef) {
        startField("queryType");

        _queryBuilder.append('{');
        queryDef.define(new __TypeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * If this server support subscription, the type that subscription operations will be rooted at.
     */
    public __SchemaQuery subscriptionType(__TypeQueryDefinition queryDef) {
        startField("subscriptionType");

        _queryBuilder.append('{');
        queryDef.define(new __TypeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * A list of all types supported by this server.
     */
    public __SchemaQuery types(__TypeQueryDefinition queryDef) {
        startField("types");

        _queryBuilder.append('{');
        queryDef.define(new __TypeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}

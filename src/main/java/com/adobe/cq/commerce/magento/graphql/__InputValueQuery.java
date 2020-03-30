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
 * Arguments provided to Fields or Directives and the input fields of an InputObject are represented as
 * Input Values which describe their type and optionally a default value.
 */
public class __InputValueQuery extends AbstractQuery<__InputValueQuery> {
    __InputValueQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
     * A GraphQL-formatted string representing the default value for this input value.
     */
    public __InputValueQuery defaultValue() {
        startField("defaultValue");

        return this;
    }

    public __InputValueQuery description() {
        startField("description");

        return this;
    }

    public __InputValueQuery name() {
        startField("name");

        return this;
    }

    public __InputValueQuery type(__TypeQueryDefinition queryDef) {
        startField("type");

        _queryBuilder.append('{');
        queryDef.define(new __TypeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}

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
 * Object and Interface types are described by a list of Fields, each of which has a name, potentially
 * a list of arguments, and a return type.
 */
public class __FieldQuery extends AbstractQuery<__FieldQuery> {
    __FieldQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public __FieldQuery args(__InputValueQueryDefinition queryDef) {
        startField("args");

        _queryBuilder.append('{');
        queryDef.define(new __InputValueQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public __FieldQuery deprecationReason() {
        startField("deprecationReason");

        return this;
    }

    public __FieldQuery description() {
        startField("description");

        return this;
    }

    public __FieldQuery isDeprecated() {
        startField("isDeprecated");

        return this;
    }

    public __FieldQuery name() {
        startField("name");

        return this;
    }

    public __FieldQuery type(__TypeQueryDefinition queryDef) {
        startField("type");

        _queryBuilder.append('{');
        queryDef.define(new __TypeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}

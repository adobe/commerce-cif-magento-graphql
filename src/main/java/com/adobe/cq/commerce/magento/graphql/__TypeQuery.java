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
import com.shopify.graphql.support.Arguments;

/**
 * The fundamental unit of any GraphQL Schema is the type. There are many kinds of types in GraphQL as
 * represented by the `__TypeKind` enum.
 * Depending on the kind of a type, certain fields describe information about that type. Scalar types
 * provide no information beyond a name and description, while Enum types provide their values. Object
 * and Interface types provide the fields they describe. Abstract types, Union and Interface, provide
 * the Object types possible at runtime. List and NonNull types compose other types.
 */
public class __TypeQuery extends AbstractQuery<__TypeQuery> {
    __TypeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public __TypeQuery description() {
        startField("description");

        return this;
    }

    public class EnumValuesArguments extends Arguments {
        EnumValuesArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        public EnumValuesArguments includeDeprecated(Boolean value) {
            if (value != null) {
                startArgument("includeDeprecated");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface EnumValuesArgumentsDefinition {
        void define(EnumValuesArguments args);
    }

    public __TypeQuery enumValues(__EnumValueQueryDefinition queryDef) {
        return enumValues(args -> {}, queryDef);
    }

    public __TypeQuery enumValues(EnumValuesArgumentsDefinition argsDef, __EnumValueQueryDefinition queryDef) {
        startField("enumValues");

        EnumValuesArguments args = new EnumValuesArguments(_queryBuilder);
        argsDef.define(args);
        EnumValuesArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new __EnumValueQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class FieldsArguments extends Arguments {
        FieldsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        public FieldsArguments includeDeprecated(Boolean value) {
            if (value != null) {
                startArgument("includeDeprecated");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface FieldsArgumentsDefinition {
        void define(FieldsArguments args);
    }

    public __TypeQuery fields(__FieldQueryDefinition queryDef) {
        return fields(args -> {}, queryDef);
    }

    public __TypeQuery fields(FieldsArgumentsDefinition argsDef, __FieldQueryDefinition queryDef) {
        startField("fields");

        FieldsArguments args = new FieldsArguments(_queryBuilder);
        argsDef.define(args);
        FieldsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new __FieldQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public __TypeQuery inputFields(__InputValueQueryDefinition queryDef) {
        startField("inputFields");

        _queryBuilder.append('{');
        queryDef.define(new __InputValueQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public __TypeQuery interfaces(__TypeQueryDefinition queryDef) {
        startField("interfaces");

        _queryBuilder.append('{');
        queryDef.define(new __TypeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public __TypeQuery kind() {
        startField("kind");

        return this;
    }

    public __TypeQuery name() {
        startField("name");

        return this;
    }

    public __TypeQuery ofType(__TypeQueryDefinition queryDef) {
        startField("ofType");

        _queryBuilder.append('{');
        queryDef.define(new __TypeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public __TypeQuery possibleTypes(__TypeQueryDefinition queryDef) {
        startField("possibleTypes");

        _queryBuilder.append('{');
        queryDef.define(new __TypeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}

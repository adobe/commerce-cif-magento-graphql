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
 * One possible value for a given Enum. Enum values are unique values, not a placeholder for a string
 * or numeric value. However an Enum value is returned in a JSON response as a string.
 */
public class __EnumValueQuery extends AbstractQuery<__EnumValueQuery> {
    __EnumValueQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public __EnumValueQuery deprecationReason() {
        startField("deprecationReason");

        return this;
    }

    public __EnumValueQuery description() {
        startField("description");

        return this;
    }

    public __EnumValueQuery isDeprecated() {
        startField("isDeprecated");

        return this;
    }

    public __EnumValueQuery name() {
        startField("name");

        return this;
    }
}

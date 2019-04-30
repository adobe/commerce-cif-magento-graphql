/*******************************************************************************
 *
 *    Copyright 2019 Adobe. All rights reserved.
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
 * CustomizableDropDownOption contains information about a drop down menu that is defined as part of a
 * customizable option
 */
public class CustomizableDropDownOptionQuery extends AbstractQuery<CustomizableDropDownOptionQuery> {
    CustomizableDropDownOptionQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
     * Option ID
     */
    public CustomizableDropDownOptionQuery optionId() {
        startField("option_id");

        return this;
    }

    /**
     * Indicates whether the option is required
     */
    public CustomizableDropDownOptionQuery required() {
        startField("required");

        return this;
    }

    /**
     * The order in which the option is displayed
     */
    public CustomizableDropDownOptionQuery sortOrder() {
        startField("sort_order");

        return this;
    }

    /**
     * The display name for this option
     */
    public CustomizableDropDownOptionQuery title() {
        startField("title");

        return this;
    }

    /**
     * An array that defines the set of options for a drop down menu
     */
    public CustomizableDropDownOptionQuery value(CustomizableDropDownValueQueryDefinition queryDef) {
        startField("value");

        _queryBuilder.append('{');
        queryDef.define(new CustomizableDropDownValueQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}

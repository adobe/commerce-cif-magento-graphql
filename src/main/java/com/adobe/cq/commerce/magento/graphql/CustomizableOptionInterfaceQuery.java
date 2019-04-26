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
 * The CustomizableOptionInterface contains basic information about a customizable option. It can be
 * implemented by several types of configurable options.
 */
public class CustomizableOptionInterfaceQuery extends AbstractQuery<CustomizableOptionInterfaceQuery> {
    CustomizableOptionInterfaceQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
    }

    /**
     * Indicates whether the option is required
     */
    public CustomizableOptionInterfaceQuery required() {
        startField("required");

        return this;
    }

    /**
     * The order in which the option is displayed
     */
    public CustomizableOptionInterfaceQuery sortOrder() {
        startField("sort_order");

        return this;
    }

    /**
     * The display name for this option
     */
    public CustomizableOptionInterfaceQuery title() {
        startField("title");

        return this;
    }

    public CustomizableOptionInterfaceQuery onCustomizableAreaOption(CustomizableAreaOptionQueryDefinition queryDef) {
        startInlineFragment("CustomizableAreaOption");
        queryDef.define(new CustomizableAreaOptionQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public CustomizableOptionInterfaceQuery onCustomizableDateOption(CustomizableDateOptionQueryDefinition queryDef) {
        startInlineFragment("CustomizableDateOption");
        queryDef.define(new CustomizableDateOptionQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public CustomizableOptionInterfaceQuery onCustomizableDropDownOption(CustomizableDropDownOptionQueryDefinition queryDef) {
        startInlineFragment("CustomizableDropDownOption");
        queryDef.define(new CustomizableDropDownOptionQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public CustomizableOptionInterfaceQuery onCustomizableFieldOption(CustomizableFieldOptionQueryDefinition queryDef) {
        startInlineFragment("CustomizableFieldOption");
        queryDef.define(new CustomizableFieldOptionQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public CustomizableOptionInterfaceQuery onCustomizableFileOption(CustomizableFileOptionQueryDefinition queryDef) {
        startInlineFragment("CustomizableFileOption");
        queryDef.define(new CustomizableFileOptionQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public CustomizableOptionInterfaceQuery onCustomizableRadioOption(CustomizableRadioOptionQueryDefinition queryDef) {
        startInlineFragment("CustomizableRadioOption");
        queryDef.define(new CustomizableRadioOptionQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}

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
* ConfigurableAttributeOption contains the value_index (and other related information) assigned to a
* configurable product option
*/
public class ConfigurableAttributeOptionQuery extends AbstractQuery<ConfigurableAttributeOptionQuery> {
    ConfigurableAttributeOptionQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The ID assigned to the attribute
    */
    public ConfigurableAttributeOptionQuery code() {
        startField("code");

        return this;
    }

    /**
    * A string that describes the configurable attribute option
    */
    public ConfigurableAttributeOptionQuery label() {
        startField("label");

        return this;
    }

    /**
    * A unique index number assigned to the configurable product option
    */
    public ConfigurableAttributeOptionQuery valueIndex() {
        startField("value_index");

        return this;
    }
}

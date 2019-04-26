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
* Attribute contains the attribute_type of the specified attribute_code and entity_type
*/
public class AttributeQuery extends AbstractQuery<AttributeQuery> {
    AttributeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The unique identifier for an attribute code. This value should be in lowercase letters without
    * spaces.
    */
    public AttributeQuery attributeCode() {
        startField("attribute_code");

        return this;
    }

    /**
    * Attribute options list.
    */
    public AttributeQuery attributeOptions(AttributeOptionQueryDefinition queryDef) {
        startField("attribute_options");

        _queryBuilder.append('{');
        queryDef.define(new AttributeOptionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The data type of the attribute
    */
    public AttributeQuery attributeType() {
        startField("attribute_type");

        return this;
    }

    /**
    * The type of entity that defines the attribute
    */
    public AttributeQuery entityType() {
        startField("entity_type");

        return this;
    }
}

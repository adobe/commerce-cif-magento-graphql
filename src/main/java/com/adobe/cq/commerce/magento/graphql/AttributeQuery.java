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
import com.shopify.graphql.support.Fragment;

/**
 * Contains details about the attribute, including the code and type.
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
     * The data type of the attribute.
     */
    public AttributeQuery attributeType() {
        startField("attribute_type");

        return this;
    }

    /**
     * The type of entity that defines the attribute.
     */
    public AttributeQuery entityType() {
        startField("entity_type");

        return this;
    }

    /**
     * The frontend input type of the attribute.
     */
    public AttributeQuery inputType() {
        startField("input_type");

        return this;
    }

    /**
     * Details about the storefront properties configured for the attribute.
     */
    public AttributeQuery storefrontProperties(StorefrontPropertiesQueryDefinition queryDef) {
        startField("storefront_properties");

        _queryBuilder.append('{');
        queryDef.define(new StorefrontPropertiesQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Creates a GraphQL "named" fragment with the specified query type definition.
     * The generics nature of fragments ensures that a fragment can only be used at the right place in the GraphQL request.
     * 
     * @param name The name of the fragment, must be unique for a given GraphQL request.
     * @param queryDef The fragment definition.
     * @return The fragment of a given generics type.
     */
    public static Fragment<AttributeQuery> createFragment(String name, AttributeQueryDefinition queryDef) {
        StringBuilder sb = new StringBuilder();
        queryDef.define(new AttributeQuery(sb));
        return new Fragment<>(name, "Attribute", sb.toString());
    }

    /**
     * Adds a <code>AttributeQuery</code> fragment reference at the current position of the query.
     * For example for a fragment named <code>test</code>, calling this method will add the
     * reference <code>...test</code> in the query. For GraphQL types implementing an interface, there
     * will be some similar methods using the Query type of each implemented interface.
     * 
     * @param fragment The fragment to reference.
     */
    public AttributeQuery addFragmentReference(Fragment<AttributeQuery> fragment) {
        startField("..." + fragment.getName());
        return this;
    }
}

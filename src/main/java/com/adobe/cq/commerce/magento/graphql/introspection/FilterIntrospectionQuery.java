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

package com.adobe.cq.commerce.magento.graphql.introspection;

/**
 * This represents a introspection query for filterable attributes within Magento.
 *
 * todo: Currently there is no dynamic method for generated these queries but in time one will likely be required for additional introspection calls.
 */
public class FilterIntrospectionQuery {

	public static final String QUERY = "query IntrospectionQuery { __type(name: \"ProductAttributeFilterInput\") { name description "
			+ "inputFields { name type { name }}}}";

}

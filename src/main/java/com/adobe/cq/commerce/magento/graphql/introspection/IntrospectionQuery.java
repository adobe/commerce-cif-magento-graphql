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

import java.util.Map;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;

public class IntrospectionQuery extends AbstractResponse<IntrospectionQuery> {

	public IntrospectionQuery() {
	}

	public IntrospectionQuery(JsonObject fields) throws SchemaViolationError {
		for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
			String key = field.getKey();
			String fieldName = getFieldName(key);
			switch (fieldName) {
			case "__type": {
				IntrospectionType optional1 = null;
				if (!field.getValue().isJsonNull()) {
					optional1 = new IntrospectionType(jsonAsObject(field.getValue(), key));
				}
				responseData.put(key, optional1);

				break;
			}

			case "__typename": {
				responseData.put(key, jsonAsString(field.getValue(), key));
				break;
			}
			default: {
				throw new SchemaViolationError(this, key, field.getValue());
			}
			}
		}

	}


	public IntrospectionType getType() {
		return (IntrospectionType) get("__type");
	}

	public IntrospectionQuery setType(IntrospectionType arg) {
		optimisticData.put(getKey("__type"), arg);
		return this;
	}

	@Override
	public boolean unwrapsToObject(final String key) {
		switch (getFieldName(key)) {
		case "__type":
			return true;

		default:
			return false;
		}
	}
}

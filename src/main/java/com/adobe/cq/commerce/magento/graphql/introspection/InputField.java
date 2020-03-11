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

public class InputField extends AbstractResponse<InputField> {

	public InputField() {
	}


	public InputField(JsonObject fields) throws SchemaViolationError {
		for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
			String key = field.getKey();
			String fieldName = getFieldName(key);
			switch (fieldName) {
			case "name": {
				String optional1 = null;
				if (!field.getValue().isJsonNull()) {
					optional1 = jsonAsString(field.getValue(), key);
				}

				responseData.put(key, optional1);

				break;
			}
			case "type": {
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


	public String getName() {
		return (String) get("name");
	}

	public IntrospectionType getType() {
		return (IntrospectionType) get("type");
	}



	@Override
	public boolean unwrapsToObject(final String key) {
		switch (getFieldName(key)) {
		case "name":
			return true;
		case "type":
			return true;
		default:
			return false;
		}
	}
}

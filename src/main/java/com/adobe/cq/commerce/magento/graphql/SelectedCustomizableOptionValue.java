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

import java.util.Map;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;

/**
 * Identifies the value of the selected customized option.
 */
public class SelectedCustomizableOptionValue extends AbstractResponse<SelectedCustomizableOptionValue> {
    public SelectedCustomizableOptionValue() {}

    public SelectedCustomizableOptionValue(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "customizable_option_value_uid": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "id": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

                    break;
                }

                case "label": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "price": {
                    responseData.put(key, new CartItemSelectedOptionValuePrice(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "value": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "__typename": {
                    responseData.put(key, jsonAsString(field.getValue(), key));
                    break;
                }

                default: {
                    readCustomField(fieldName, field.getValue());
                }
            }
        }
    }

    public String getGraphQlTypeName() {
        return "SelectedCustomizableOptionValue";
    }

    /**
     * The unique ID for a value object that corresponds to the object represented by the
     * `customizable_option_uid` attribute.
     */
    public ID getCustomizableOptionValueUid() {
        return (ID) get("customizable_option_value_uid");
    }

    public SelectedCustomizableOptionValue setCustomizableOptionValueUid(ID arg) {
        optimisticData.put(getKey("customizable_option_value_uid"), arg);
        return this;
    }

    /**
     * @deprecated Use `SelectedCustomizableOptionValue.customizable_option_value_uid` instead.
     */
    @Deprecated
    public Integer getId() {
        return (Integer) get("id");
    }

    public SelectedCustomizableOptionValue setId(Integer arg) {
        optimisticData.put(getKey("id"), arg);
        return this;
    }

    /**
     * The display name of the selected value.
     */
    public String getLabel() {
        return (String) get("label");
    }

    public SelectedCustomizableOptionValue setLabel(String arg) {
        optimisticData.put(getKey("label"), arg);
        return this;
    }

    /**
     * The price of the selected customizable value.
     */
    public CartItemSelectedOptionValuePrice getPrice() {
        return (CartItemSelectedOptionValuePrice) get("price");
    }

    public SelectedCustomizableOptionValue setPrice(CartItemSelectedOptionValuePrice arg) {
        optimisticData.put(getKey("price"), arg);
        return this;
    }

    /**
     * The text identifying the selected value.
     */
    public String getValue() {
        return (String) get("value");
    }

    public SelectedCustomizableOptionValue setValue(String arg) {
        optimisticData.put(getKey("value"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "customizable_option_value_uid":
                return false;

            case "id":
                return false;

            case "label":
                return false;

            case "price":
                return true;

            case "value":
                return false;

            default:
                return false;
        }
    }
}

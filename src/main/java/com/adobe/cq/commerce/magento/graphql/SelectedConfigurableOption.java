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

public class SelectedConfigurableOption extends AbstractResponse<SelectedConfigurableOption> {
    public SelectedConfigurableOption() {}

    public SelectedConfigurableOption(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "configurable_product_option_uid": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "configurable_product_option_value_uid": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "id": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

                    break;
                }

                case "option_label": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "value_id": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

                    break;
                }

                case "value_label": {
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
        return "SelectedConfigurableOption";
    }

    /**
     * The unique ID for a `ConfigurableProductOptions` object
     */
    public ID getConfigurableProductOptionUid() {
        return (ID) get("configurable_product_option_uid");
    }

    public SelectedConfigurableOption setConfigurableProductOptionUid(ID arg) {
        optimisticData.put(getKey("configurable_product_option_uid"), arg);
        return this;
    }

    /**
     * The unique ID for a `ConfigurableProductOptionsValues` object
     */
    public ID getConfigurableProductOptionValueUid() {
        return (ID) get("configurable_product_option_value_uid");
    }

    public SelectedConfigurableOption setConfigurableProductOptionValueUid(ID arg) {
        optimisticData.put(getKey("configurable_product_option_value_uid"), arg);
        return this;
    }

    /**
     * @deprecated Use SelectedConfigurableOption.configurable_product_option_uid instead
     */
    @Deprecated
    public Integer getId() {
        return (Integer) get("id");
    }

    public SelectedConfigurableOption setId(Integer arg) {
        optimisticData.put(getKey("id"), arg);
        return this;
    }

    public String getOptionLabel() {
        return (String) get("option_label");
    }

    public SelectedConfigurableOption setOptionLabel(String arg) {
        optimisticData.put(getKey("option_label"), arg);
        return this;
    }

    /**
     * @deprecated Use SelectedConfigurableOption.configurable_product_option_value_uid instead
     */
    @Deprecated
    public Integer getValueId() {
        return (Integer) get("value_id");
    }

    public SelectedConfigurableOption setValueId(Integer arg) {
        optimisticData.put(getKey("value_id"), arg);
        return this;
    }

    public String getValueLabel() {
        return (String) get("value_label");
    }

    public SelectedConfigurableOption setValueLabel(String arg) {
        optimisticData.put(getKey("value_label"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "configurable_product_option_uid":
                return false;

            case "configurable_product_option_value_uid":
                return false;

            case "id":
                return false;

            case "option_label":
                return false;

            case "value_id":
                return false;

            case "value_label":
                return false;

            default:
                return false;
        }
    }
}

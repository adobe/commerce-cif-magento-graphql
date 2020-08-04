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
import com.shopify.graphql.support.SchemaViolationError;

public class SendFriendConfiguration extends AbstractResponse<SendFriendConfiguration> {
    public SendFriendConfiguration() {
    }

    public SendFriendConfiguration(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "enabled_for_customers": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "enabled_for_guests": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

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
        return "SendFriendConfiguration";
    }

    /**
     * Indicates whether the Email to a Friend feature is enabled.
     */
    public Boolean getEnabledForCustomers() {
        return (Boolean) get("enabled_for_customers");
    }

    public SendFriendConfiguration setEnabledForCustomers(Boolean arg) {
        optimisticData.put(getKey("enabled_for_customers"), arg);
        return this;
    }

    /**
     * Indicates whether the Email to a Friend feature is enabled for guests.
     */
    public Boolean getEnabledForGuests() {
        return (Boolean) get("enabled_for_guests");
    }

    public SendFriendConfiguration setEnabledForGuests(Boolean arg) {
        optimisticData.put(getKey("enabled_for_guests"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "enabled_for_customers": return false;

            case "enabled_for_guests": return false;

            default: return false;
        }
    }
}


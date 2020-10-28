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

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;

public class SendEmailToFriendOutput extends AbstractResponse<SendEmailToFriendOutput> {
    public SendEmailToFriendOutput() {}

    public SendEmailToFriendOutput(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "recipients": {
                    List<SendEmailToFriendRecipient> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<SendEmailToFriendRecipient> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            SendEmailToFriendRecipient optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new SendEmailToFriendRecipient(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "sender": {
                    SendEmailToFriendSender optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new SendEmailToFriendSender(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

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
        return "SendEmailToFriendOutput";
    }

    public List<SendEmailToFriendRecipient> getRecipients() {
        return (List<SendEmailToFriendRecipient>) get("recipients");
    }

    public SendEmailToFriendOutput setRecipients(List<SendEmailToFriendRecipient> arg) {
        optimisticData.put(getKey("recipients"), arg);
        return this;
    }

    public SendEmailToFriendSender getSender() {
        return (SendEmailToFriendSender) get("sender");
    }

    public SendEmailToFriendOutput setSender(SendEmailToFriendSender arg) {
        optimisticData.put(getKey("sender"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "recipients":
                return true;

            case "sender":
                return true;

            default:
                return false;
        }
    }
}

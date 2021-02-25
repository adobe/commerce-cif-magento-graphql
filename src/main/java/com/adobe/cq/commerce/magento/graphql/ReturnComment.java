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

public class ReturnComment extends AbstractResponse<ReturnComment> {
    public ReturnComment() {}

    public ReturnComment(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "author_name": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "created_at": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "text": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "uid": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

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
        return "ReturnComment";
    }

    /**
     * The name or author who posted the comment
     */
    public String getAuthorName() {
        return (String) get("author_name");
    }

    public ReturnComment setAuthorName(String arg) {
        optimisticData.put(getKey("author_name"), arg);
        return this;
    }

    /**
     * The date and time the comment was posted
     */
    public String getCreatedAt() {
        return (String) get("created_at");
    }

    public ReturnComment setCreatedAt(String arg) {
        optimisticData.put(getKey("created_at"), arg);
        return this;
    }

    /**
     * The contents of the comment
     */
    public String getText() {
        return (String) get("text");
    }

    public ReturnComment setText(String arg) {
        optimisticData.put(getKey("text"), arg);
        return this;
    }

    /**
     * The unique ID for a `ReturnComment` object
     */
    public ID getUid() {
        return (ID) get("uid");
    }

    public ReturnComment setUid(ID arg) {
        optimisticData.put(getKey("uid"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "author_name":
                return false;

            case "created_at":
                return false;

            case "text":
                return false;

            case "uid":
                return false;

            default:
                return false;
        }
    }
}

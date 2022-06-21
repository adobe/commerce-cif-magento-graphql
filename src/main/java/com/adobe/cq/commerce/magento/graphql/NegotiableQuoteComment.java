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
 * Contains a single plain text comment from either the buyer or seller.
 */
public class NegotiableQuoteComment extends AbstractResponse<NegotiableQuoteComment> {
    public NegotiableQuoteComment() {}

    public NegotiableQuoteComment(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "author": {
                    responseData.put(key, new NegotiableQuoteUser(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "created_at": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "creator_type": {
                    responseData.put(key, NegotiableQuoteCommentCreatorType.fromGraphQl(jsonAsString(field.getValue(), key)));

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
        return "NegotiableQuoteComment";
    }

    /**
     * The first and last name of the commenter.
     */
    public NegotiableQuoteUser getAuthor() {
        return (NegotiableQuoteUser) get("author");
    }

    public NegotiableQuoteComment setAuthor(NegotiableQuoteUser arg) {
        optimisticData.put(getKey("author"), arg);
        return this;
    }

    /**
     * Timestamp indicating when the comment was created.
     */
    public String getCreatedAt() {
        return (String) get("created_at");
    }

    public NegotiableQuoteComment setCreatedAt(String arg) {
        optimisticData.put(getKey("created_at"), arg);
        return this;
    }

    /**
     * Indicates whether a buyer or seller commented.
     */
    public NegotiableQuoteCommentCreatorType getCreatorType() {
        return (NegotiableQuoteCommentCreatorType) get("creator_type");
    }

    public NegotiableQuoteComment setCreatorType(NegotiableQuoteCommentCreatorType arg) {
        optimisticData.put(getKey("creator_type"), arg);
        return this;
    }

    /**
     * The plain text comment.
     */
    public String getText() {
        return (String) get("text");
    }

    public NegotiableQuoteComment setText(String arg) {
        optimisticData.put(getKey("text"), arg);
        return this;
    }

    /**
     * The unique ID of a `NegotiableQuoteComment` object.
     */
    public ID getUid() {
        return (ID) get("uid");
    }

    public NegotiableQuoteComment setUid(ID arg) {
        optimisticData.put(getKey("uid"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "author":
                return true;

            case "created_at":
                return false;

            case "creator_type":
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

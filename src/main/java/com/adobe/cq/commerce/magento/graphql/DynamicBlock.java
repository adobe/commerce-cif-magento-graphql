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

public class DynamicBlock extends AbstractResponse<DynamicBlock> {
    public DynamicBlock() {}

    public DynamicBlock(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "content": {
                    responseData.put(key, new ComplexTextValue(jsonAsObject(field.getValue(), key)));

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
        return "DynamicBlock";
    }

    /**
     * Contains the renderable HTML code of the dynamic block
     */
    public ComplexTextValue getContent() {
        return (ComplexTextValue) get("content");
    }

    public DynamicBlock setContent(ComplexTextValue arg) {
        optimisticData.put(getKey("content"), arg);
        return this;
    }

    /**
     * The unique ID of a `DynamicBlock` object
     */
    public ID getUid() {
        return (ID) get("uid");
    }

    public DynamicBlock setUid(ID arg) {
        optimisticData.put(getKey("uid"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "content":
                return true;

            case "uid":
                return false;

            default:
                return false;
        }
    }
}

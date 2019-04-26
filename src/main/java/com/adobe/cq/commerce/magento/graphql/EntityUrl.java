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

package com.adobe.cq.commerce.magento.graphql;

import java.util.Map;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;

/**
 * EntityUrl is an output object containing the `id`, `canonical_url`, and `type` attributes
 */
public class EntityUrl extends AbstractResponse<EntityUrl> {
    public EntityUrl() {
    }

    public EntityUrl(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "canonical_url": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "id": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "type": {
                    UrlRewriteEntityTypeEnum optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = UrlRewriteEntityTypeEnum.fromGraphQl(jsonAsString(field.getValue(), key));
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

    public String getGraphQlTypeName() {
        return "EntityUrl";
    }

    /**
     * The internal relative URL. If the specified  url is a redirect, the query returns the redirected
     * URL, not the original.
     */

    public String getCanonicalUrl() {
        return (String) get("canonical_url");
    }

    public EntityUrl setCanonicalUrl(String arg) {
        optimisticData.put(getKey("canonical_url"), arg);
        return this;
    }

    /**
     * The ID assigned to the object associated with the specified url. This could be a product ID,
     * category ID, or page ID.
     */

    public Integer getId() {
        return (Integer) get("id");
    }

    public EntityUrl setId(Integer arg) {
        optimisticData.put(getKey("id"), arg);
        return this;
    }

    /**
     * One of PRODUCT, CATEGORY, or CMS_PAGE.
     */

    public UrlRewriteEntityTypeEnum getType() {
        return (UrlRewriteEntityTypeEnum) get("type");
    }

    public EntityUrl setType(UrlRewriteEntityTypeEnum arg) {
        optimisticData.put(getKey("type"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "canonical_url": return false;

            case "id": return false;

            case "type": return false;

            default: return false;
        }
    }
}


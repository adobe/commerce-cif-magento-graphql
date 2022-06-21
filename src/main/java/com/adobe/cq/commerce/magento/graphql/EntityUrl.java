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
 * Contains the `uid`, `relative_url`, and `type` attributes.
 */
public class EntityUrl extends AbstractResponse<EntityUrl> {
    public EntityUrl() {}

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

                case "entity_uid": {
                    ID optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ID(jsonAsString(field.getValue(), key));
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

                case "redirectCode": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "relative_url": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
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
                    readCustomField(fieldName, field.getValue());
                }
            }
        }
    }

    public String getGraphQlTypeName() {
        return "EntityUrl";
    }

    /**
     * @deprecated Use `relative_url` instead.
     */
    @Deprecated
    public String getCanonicalUrl() {
        return (String) get("canonical_url");
    }

    public EntityUrl setCanonicalUrl(String arg) {
        optimisticData.put(getKey("canonical_url"), arg);
        return this;
    }

    /**
     * The unique ID for a `ProductInterface`, `CategoryInterface`, `CmsPage`, or similar object associated
     * with the specified URL. This could be a product, category, or CMS page UID.
     */
    public ID getEntityUid() {
        return (ID) get("entity_uid");
    }

    public EntityUrl setEntityUid(ID arg) {
        optimisticData.put(getKey("entity_uid"), arg);
        return this;
    }

    /**
     * The ID assigned to the object associated with the specified url. This could be a product ID,
     * category ID, or page ID.
     *
     * @deprecated Use `entity_uid` instead.
     */
    @Deprecated
    public Integer getId() {
        return (Integer) get("id");
    }

    public EntityUrl setId(Integer arg) {
        optimisticData.put(getKey("id"), arg);
        return this;
    }

    /**
     * Contains 0 when there is no redirect error. A value of 301 indicates the URL of the requested
     * resource has been changed permanently, while a value of 302 indicates a temporary redirect.
     */
    public Integer getRedirectCode() {
        return (Integer) get("redirectCode");
    }

    public EntityUrl setRedirectCode(Integer arg) {
        optimisticData.put(getKey("redirectCode"), arg);
        return this;
    }

    /**
     * The internal relative URL. If the specified URL is a redirect, the query returns the redirected URL,
     * not the original.
     */
    public String getRelativeUrl() {
        return (String) get("relative_url");
    }

    public EntityUrl setRelativeUrl(String arg) {
        optimisticData.put(getKey("relative_url"), arg);
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
            case "canonical_url":
                return false;

            case "entity_uid":
                return false;

            case "id":
                return false;

            case "redirectCode":
                return false;

            case "relative_url":
                return false;

            case "type":
                return false;

            default:
                return false;
        }
    }
}

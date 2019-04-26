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
* CMS page defines all CMS page information
*/
public class CmsPage extends AbstractResponse<CmsPage> {
    public CmsPage() {
    }

    public CmsPage(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "content": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "content_heading": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "meta_description": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "meta_keywords": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "meta_title": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "page_layout": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "title": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "url_key": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
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
        return "CmsPage";
    }

    /**
    * CMS page content
    */

    public String getContent() {
        return (String) get("content");
    }

    public CmsPage setContent(String arg) {
        optimisticData.put(getKey("content"), arg);
        return this;
    }

    /**
    * CMS page content heading
    */

    public String getContentHeading() {
        return (String) get("content_heading");
    }

    public CmsPage setContentHeading(String arg) {
        optimisticData.put(getKey("content_heading"), arg);
        return this;
    }

    /**
    * CMS page meta description
    */

    public String getMetaDescription() {
        return (String) get("meta_description");
    }

    public CmsPage setMetaDescription(String arg) {
        optimisticData.put(getKey("meta_description"), arg);
        return this;
    }

    /**
    * CMS page meta keywords
    */

    public String getMetaKeywords() {
        return (String) get("meta_keywords");
    }

    public CmsPage setMetaKeywords(String arg) {
        optimisticData.put(getKey("meta_keywords"), arg);
        return this;
    }

    /**
    * CMS page meta title
    */

    public String getMetaTitle() {
        return (String) get("meta_title");
    }

    public CmsPage setMetaTitle(String arg) {
        optimisticData.put(getKey("meta_title"), arg);
        return this;
    }

    /**
    * CMS page content heading
    */

    public String getPageLayout() {
        return (String) get("page_layout");
    }

    public CmsPage setPageLayout(String arg) {
        optimisticData.put(getKey("page_layout"), arg);
        return this;
    }

    /**
    * CMS page title
    */

    public String getTitle() {
        return (String) get("title");
    }

    public CmsPage setTitle(String arg) {
        optimisticData.put(getKey("title"), arg);
        return this;
    }

    /**
    * URL key of CMS page
    */

    public String getUrlKey() {
        return (String) get("url_key");
    }

    public CmsPage setUrlKey(String arg) {
        optimisticData.put(getKey("url_key"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "content": return false;

            case "content_heading": return false;

            case "meta_description": return false;

            case "meta_keywords": return false;

            case "meta_title": return false;

            case "page_layout": return false;

            case "title": return false;

            case "url_key": return false;

            default: return false;
        }
    }
}


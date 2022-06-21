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

/**
 * Contains details about a CMS page.
 */
public class CmsPage extends AbstractResponse<CmsPage> implements RoutableInterface {
    public CmsPage() {}

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

                case "identifier": {
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

                case "redirect_code": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

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

                case "title": {
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
                    readCustomField(fieldName, field.getValue());
                }
            }
        }
    }

    public String getGraphQlTypeName() {
        return "CmsPage";
    }

    /**
     * The content of the CMS page in raw HTML.
     */
    public String getContent() {
        return (String) get("content");
    }

    public CmsPage setContent(String arg) {
        optimisticData.put(getKey("content"), arg);
        return this;
    }

    /**
     * The heading that displays at the top of the CMS page.
     */
    public String getContentHeading() {
        return (String) get("content_heading");
    }

    public CmsPage setContentHeading(String arg) {
        optimisticData.put(getKey("content_heading"), arg);
        return this;
    }

    /**
     * The ID of a CMS page.
     */
    public String getIdentifier() {
        return (String) get("identifier");
    }

    public CmsPage setIdentifier(String arg) {
        optimisticData.put(getKey("identifier"), arg);
        return this;
    }

    /**
     * A brief description of the page for search results listings.
     */
    public String getMetaDescription() {
        return (String) get("meta_description");
    }

    public CmsPage setMetaDescription(String arg) {
        optimisticData.put(getKey("meta_description"), arg);
        return this;
    }

    /**
     * A brief description of the page for search results listings.
     */
    public String getMetaKeywords() {
        return (String) get("meta_keywords");
    }

    public CmsPage setMetaKeywords(String arg) {
        optimisticData.put(getKey("meta_keywords"), arg);
        return this;
    }

    /**
     * A page title that is indexed by search engines and appears in search results listings.
     */
    public String getMetaTitle() {
        return (String) get("meta_title");
    }

    public CmsPage setMetaTitle(String arg) {
        optimisticData.put(getKey("meta_title"), arg);
        return this;
    }

    /**
     * The design layout of the page, indicating the number of columns and navigation features used on the
     * page.
     */
    public String getPageLayout() {
        return (String) get("page_layout");
    }

    public CmsPage setPageLayout(String arg) {
        optimisticData.put(getKey("page_layout"), arg);
        return this;
    }

    /**
     * Contains 0 when there is no redirect error. A value of 301 indicates the URL of the requested
     * resource has been changed permanently, while a value of 302 indicates a temporary redirect.
     */
    public Integer getRedirectCode() {
        return (Integer) get("redirect_code");
    }

    public CmsPage setRedirectCode(Integer arg) {
        optimisticData.put(getKey("redirect_code"), arg);
        return this;
    }

    /**
     * The internal relative URL. If the specified URL is a redirect, the query returns the redirected URL,
     * not the original.
     */
    public String getRelativeUrl() {
        return (String) get("relative_url");
    }

    public CmsPage setRelativeUrl(String arg) {
        optimisticData.put(getKey("relative_url"), arg);
        return this;
    }

    /**
     * The name that appears in the breadcrumb trail navigation and in the browser title bar and tab.
     */
    public String getTitle() {
        return (String) get("title");
    }

    public CmsPage setTitle(String arg) {
        optimisticData.put(getKey("title"), arg);
        return this;
    }

    /**
     * One of PRODUCT, CATEGORY, or CMS_PAGE.
     */
    public UrlRewriteEntityTypeEnum getType() {
        return (UrlRewriteEntityTypeEnum) get("type");
    }

    public CmsPage setType(UrlRewriteEntityTypeEnum arg) {
        optimisticData.put(getKey("type"), arg);
        return this;
    }

    /**
     * The URL key of the CMS page, which is often based on the `content_heading`.
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
            case "content":
                return false;

            case "content_heading":
                return false;

            case "identifier":
                return false;

            case "meta_description":
                return false;

            case "meta_keywords":
                return false;

            case "meta_title":
                return false;

            case "page_layout":
                return false;

            case "redirect_code":
                return false;

            case "relative_url":
                return false;

            case "title":
                return false;

            case "type":
                return false;

            case "url_key":
                return false;

            default:
                return false;
        }
    }
}

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

import com.shopify.graphql.support.AbstractQuery;

/**
* CMS page defines all CMS page information
*/
public class CmsPageQuery extends AbstractQuery<CmsPageQuery> {
    CmsPageQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * CMS page content
    */
    public CmsPageQuery content() {
        startField("content");

        return this;
    }

    /**
    * CMS page content heading
    */
    public CmsPageQuery contentHeading() {
        startField("content_heading");

        return this;
    }

    /**
    * CMS page meta description
    */
    public CmsPageQuery metaDescription() {
        startField("meta_description");

        return this;
    }

    /**
    * CMS page meta keywords
    */
    public CmsPageQuery metaKeywords() {
        startField("meta_keywords");

        return this;
    }

    /**
    * CMS page meta title
    */
    public CmsPageQuery metaTitle() {
        startField("meta_title");

        return this;
    }

    /**
    * CMS page content heading
    */
    public CmsPageQuery pageLayout() {
        startField("page_layout");

        return this;
    }

    /**
    * CMS page title
    */
    public CmsPageQuery title() {
        startField("title");

        return this;
    }

    /**
    * URL key of CMS page
    */
    public CmsPageQuery urlKey() {
        startField("url_key");

        return this;
    }
}

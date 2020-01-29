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

import com.shopify.graphql.support.AbstractQuery;

/**
 * DownloadableProductLinks defines characteristics of a downloadable product
 */
public class DownloadableProductLinksQuery extends AbstractQuery<DownloadableProductLinksQuery> {
    DownloadableProductLinksQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
     * @deprecated This information should not be exposed on frontend
     */
    @Deprecated
    public DownloadableProductLinksQuery id() {
        startField("id");

        return this;
    }

    /**
     * @deprecated This information should not be exposed on frontend
     */
    @Deprecated
    public DownloadableProductLinksQuery isShareable() {
        startField("is_shareable");

        return this;
    }

    /**
     * @deprecated `sample_url` serves to get the downloadable sample
     */
    @Deprecated
    public DownloadableProductLinksQuery linkType() {
        startField("link_type");

        return this;
    }

    /**
     * @deprecated This information should not be exposed on frontend
     */
    @Deprecated
    public DownloadableProductLinksQuery numberOfDownloads() {
        startField("number_of_downloads");

        return this;
    }

    /**
     * The price of the downloadable product
     */
    public DownloadableProductLinksQuery price() {
        startField("price");

        return this;
    }

    /**
     * @deprecated `sample_url` serves to get the downloadable sample
     */
    @Deprecated
    public DownloadableProductLinksQuery sampleFile() {
        startField("sample_file");

        return this;
    }

    /**
     * @deprecated `sample_url` serves to get the downloadable sample
     */
    @Deprecated
    public DownloadableProductLinksQuery sampleType() {
        startField("sample_type");

        return this;
    }

    /**
     * URL to the downloadable sample
     */
    public DownloadableProductLinksQuery sampleUrl() {
        startField("sample_url");

        return this;
    }

    /**
     * A number indicating the sort order
     */
    public DownloadableProductLinksQuery sortOrder() {
        startField("sort_order");

        return this;
    }

    /**
     * The display name of the link
     */
    public DownloadableProductLinksQuery title() {
        startField("title");

        return this;
    }
}

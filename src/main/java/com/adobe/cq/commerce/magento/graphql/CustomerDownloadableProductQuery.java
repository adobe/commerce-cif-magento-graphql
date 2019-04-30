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
 * 
 */
public class CustomerDownloadableProductQuery extends AbstractQuery<CustomerDownloadableProductQuery> {
    CustomerDownloadableProductQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public CustomerDownloadableProductQuery date() {
        startField("date");

        return this;
    }

    public CustomerDownloadableProductQuery downloadUrl() {
        startField("download_url");

        return this;
    }

    public CustomerDownloadableProductQuery orderIncrementId() {
        startField("order_increment_id");

        return this;
    }

    public CustomerDownloadableProductQuery remainingDownloads() {
        startField("remaining_downloads");

        return this;
    }

    public CustomerDownloadableProductQuery status() {
        startField("status");

        return this;
    }
}

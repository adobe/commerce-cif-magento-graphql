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
 * ProductMediaGalleryEntriesContent contains an image in base64 format and basic information about the
 * image.
 */
public class ProductMediaGalleryEntriesContentQuery extends AbstractQuery<ProductMediaGalleryEntriesContentQuery> {
    ProductMediaGalleryEntriesContentQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
     * The image in base64 format.
     */
    public ProductMediaGalleryEntriesContentQuery base64EncodedData() {
        startField("base64_encoded_data");

        return this;
    }

    /**
     * The file name of the image.
     */
    public ProductMediaGalleryEntriesContentQuery name() {
        startField("name");

        return this;
    }

    /**
     * The MIME type of the file, such as image/png.
     */
    public ProductMediaGalleryEntriesContentQuery type() {
        startField("type");

        return this;
    }
}

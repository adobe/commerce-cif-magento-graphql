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
 * ProductMediaGalleryEntriesVideoContent contains a link to a video file and basic information about
 * the video.
 */
public class ProductMediaGalleryEntriesVideoContentQuery extends AbstractQuery<ProductMediaGalleryEntriesVideoContentQuery> {
    ProductMediaGalleryEntriesVideoContentQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
     * Must be external-video.
     */
    public ProductMediaGalleryEntriesVideoContentQuery mediaType() {
        startField("media_type");

        return this;
    }

    /**
     * A description of the video.
     */
    public ProductMediaGalleryEntriesVideoContentQuery videoDescription() {
        startField("video_description");

        return this;
    }

    /**
     * Optional data about the video.
     */
    public ProductMediaGalleryEntriesVideoContentQuery videoMetadata() {
        startField("video_metadata");

        return this;
    }

    /**
     * Describes the video source.
     */
    public ProductMediaGalleryEntriesVideoContentQuery videoProvider() {
        startField("video_provider");

        return this;
    }

    /**
     * The title of the video.
     */
    public ProductMediaGalleryEntriesVideoContentQuery videoTitle() {
        startField("video_title");

        return this;
    }

    /**
     * The URL to the video.
     */
    public ProductMediaGalleryEntriesVideoContentQuery videoUrl() {
        startField("video_url");

        return this;
    }
}

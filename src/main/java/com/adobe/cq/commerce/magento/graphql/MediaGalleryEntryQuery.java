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
 * MediaGalleryEntry defines characteristics about images and videos associated with a specific
 * product.
 */
public class MediaGalleryEntryQuery extends AbstractQuery<MediaGalleryEntryQuery> {
    MediaGalleryEntryQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
     * Contains a ProductMediaGalleryEntriesContent object.
     */
    public MediaGalleryEntryQuery content(ProductMediaGalleryEntriesContentQueryDefinition queryDef) {
        startField("content");

        _queryBuilder.append('{');
        queryDef.define(new ProductMediaGalleryEntriesContentQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Whether the image is hidden from view.
     */
    public MediaGalleryEntryQuery disabled() {
        startField("disabled");

        return this;
    }

    /**
     * The path of the image on the server.
     */
    public MediaGalleryEntryQuery file() {
        startField("file");

        return this;
    }

    /**
     * The identifier assigned to the object.
     */
    public MediaGalleryEntryQuery id() {
        startField("id");

        return this;
    }

    /**
     * The alt text displayed on the UI when the user points to the image.
     */
    public MediaGalleryEntryQuery label() {
        startField("label");

        return this;
    }

    /**
     * image or video.
     */
    public MediaGalleryEntryQuery mediaType() {
        startField("media_type");

        return this;
    }

    /**
     * The media item&#39;s position after it has been sorted.
     */
    public MediaGalleryEntryQuery position() {
        startField("position");

        return this;
    }

    /**
     * Array of image types. It can have the following values: image, small_image, thumbnail.
     */
    public MediaGalleryEntryQuery types() {
        startField("types");

        return this;
    }

    /**
     * Contains a ProductMediaGalleryEntriesVideoContent object.
     */
    public MediaGalleryEntryQuery videoContent(ProductMediaGalleryEntriesVideoContentQueryDefinition queryDef) {
        startField("video_content");

        _queryBuilder.append('{');
        queryDef.define(new ProductMediaGalleryEntriesVideoContentQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}

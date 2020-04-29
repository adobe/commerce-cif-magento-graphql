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
 * Contains basic information about a product image or video.
 */
public class MediaGalleryInterfaceQuery extends AbstractQuery<MediaGalleryInterfaceQuery> {
    MediaGalleryInterfaceQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
    }

    /**
     * Whether the image is hidden from view.
     */
    public MediaGalleryInterfaceQuery disabled() {
        startField("disabled");

        return this;
    }

    /**
     * The label of the product image or video.
     */
    public MediaGalleryInterfaceQuery label() {
        startField("label");

        return this;
    }

    /**
     * The media item&#39;s position after it has been sorted.
     */
    public MediaGalleryInterfaceQuery position() {
        startField("position");

        return this;
    }

    /**
     * The URL of the product image or video.
     */
    public MediaGalleryInterfaceQuery url() {
        startField("url");

        return this;
    }

    public MediaGalleryInterfaceQuery onProductImage(ProductImageQueryDefinition queryDef) {
        startInlineFragment("ProductImage");
        queryDef.define(new ProductImageQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public MediaGalleryInterfaceQuery onProductVideo(ProductVideoQueryDefinition queryDef) {
        startInlineFragment("ProductVideo");
        queryDef.define(new ProductVideoQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}

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

import java.io.Serializable;
import java.util.List;

import com.shopify.graphql.support.Input;

/**
 * Defines a single downloadable product.
 */
public class DownloadableProductCartItemInput implements Serializable {
    private CartItemInput data;

    private Input<List<CustomizableOptionInput>> customizableOptions = Input.undefined();

    private Input<List<DownloadableProductLinksInput>> downloadableProductLinks = Input.undefined();

    public DownloadableProductCartItemInput(CartItemInput data) {
        this.data = data;
    }

    /**
     * The quantity and SKU of the downloadable product.
     */
    public CartItemInput getData() {
        return data;
    }

    /**
     * The quantity and SKU of the downloadable product.
     */
    public DownloadableProductCartItemInput setData(CartItemInput data) {
        this.data = data;
        return this;
    }

    /**
     * The ID and value of the option.
     */
    public List<CustomizableOptionInput> getCustomizableOptions() {
        return customizableOptions.getValue();
    }

    /**
     * The ID and value of the option.
     */
    public Input<List<CustomizableOptionInput>> getCustomizableOptionsInput() {
        return customizableOptions;
    }

    /**
     * The ID and value of the option.
     */
    public DownloadableProductCartItemInput setCustomizableOptions(List<CustomizableOptionInput> customizableOptions) {
        this.customizableOptions = Input.optional(customizableOptions);
        return this;
    }

    /**
     * The ID and value of the option.
     */
    public DownloadableProductCartItemInput setCustomizableOptionsInput(Input<List<CustomizableOptionInput>> customizableOptions) {
        if (customizableOptions == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.customizableOptions = customizableOptions;
        return this;
    }

    /**
     * An array of objects containing the link_id of the downloadable product link.
     */
    public List<DownloadableProductLinksInput> getDownloadableProductLinks() {
        return downloadableProductLinks.getValue();
    }

    /**
     * An array of objects containing the link_id of the downloadable product link.
     */
    public Input<List<DownloadableProductLinksInput>> getDownloadableProductLinksInput() {
        return downloadableProductLinks;
    }

    /**
     * An array of objects containing the link_id of the downloadable product link.
     */
    public DownloadableProductCartItemInput setDownloadableProductLinks(List<DownloadableProductLinksInput> downloadableProductLinks) {
        this.downloadableProductLinks = Input.optional(downloadableProductLinks);
        return this;
    }

    /**
     * An array of objects containing the link_id of the downloadable product link.
     */
    public DownloadableProductCartItemInput setDownloadableProductLinksInput(
        Input<List<DownloadableProductLinksInput>> downloadableProductLinks) {
        if (downloadableProductLinks == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.downloadableProductLinks = downloadableProductLinks;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("data:");
        data.appendTo(_queryBuilder);

        if (this.customizableOptions.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("customizable_options:");
            if (customizableOptions.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (CustomizableOptionInput item1 : customizableOptions.getValue()) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        item1.appendTo(_queryBuilder);
                    }
                }
                _queryBuilder.append(']');
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.downloadableProductLinks.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("downloadable_product_links:");
            if (downloadableProductLinks.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (DownloadableProductLinksInput item1 : downloadableProductLinks.getValue()) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        item1.appendTo(_queryBuilder);
                    }
                }
                _queryBuilder.append(']');
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}

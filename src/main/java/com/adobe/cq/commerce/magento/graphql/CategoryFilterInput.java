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

import com.shopify.graphql.support.Input;

/**
 * CategoryFilterInput defines the filters to be used in the search. A filter contains at least one
 * attribute, a comparison operator, and the value that is being searched for.
 */
public class CategoryFilterInput implements Serializable {
    private Input<FilterEqualTypeInput> ids = Input.undefined();

    private Input<FilterMatchTypeInput> name = Input.undefined();

    private Input<FilterEqualTypeInput> urlKey = Input.undefined();

    private Input<FilterEqualTypeInput> urlPath = Input.undefined();

    /**
     * Filter by category ID that uniquely identifies the category.
     */
    public FilterEqualTypeInput getIds() {
        return ids.getValue();
    }

    /**
     * Filter by category ID that uniquely identifies the category.
     */
    public Input<FilterEqualTypeInput> getIdsInput() {
        return ids;
    }

    /**
     * Filter by category ID that uniquely identifies the category.
     */
    public CategoryFilterInput setIds(FilterEqualTypeInput ids) {
        this.ids = Input.optional(ids);
        return this;
    }

    /**
     * Filter by category ID that uniquely identifies the category.
     */
    public CategoryFilterInput setIdsInput(Input<FilterEqualTypeInput> ids) {
        if (ids == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.ids = ids;
        return this;
    }

    /**
     * Filter by the display name of the category.
     */
    public FilterMatchTypeInput getName() {
        return name.getValue();
    }

    /**
     * Filter by the display name of the category.
     */
    public Input<FilterMatchTypeInput> getNameInput() {
        return name;
    }

    /**
     * Filter by the display name of the category.
     */
    public CategoryFilterInput setName(FilterMatchTypeInput name) {
        this.name = Input.optional(name);
        return this;
    }

    /**
     * Filter by the display name of the category.
     */
    public CategoryFilterInput setNameInput(Input<FilterMatchTypeInput> name) {
        if (name == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.name = name;
        return this;
    }

    /**
     * Filter by the part of the URL that identifies the category.
     */
    public FilterEqualTypeInput getUrlKey() {
        return urlKey.getValue();
    }

    /**
     * Filter by the part of the URL that identifies the category.
     */
    public Input<FilterEqualTypeInput> getUrlKeyInput() {
        return urlKey;
    }

    /**
     * Filter by the part of the URL that identifies the category.
     */
    public CategoryFilterInput setUrlKey(FilterEqualTypeInput urlKey) {
        this.urlKey = Input.optional(urlKey);
        return this;
    }

    /**
     * Filter by the part of the URL that identifies the category.
     */
    public CategoryFilterInput setUrlKeyInput(Input<FilterEqualTypeInput> urlKey) {
        if (urlKey == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.urlKey = urlKey;
        return this;
    }

    /**
     * Filter by the URL path for the category.
     */
    public FilterEqualTypeInput getUrlPath() {
        return urlPath.getValue();
    }

    /**
     * Filter by the URL path for the category.
     */
    public Input<FilterEqualTypeInput> getUrlPathInput() {
        return urlPath;
    }

    /**
     * Filter by the URL path for the category.
     */
    public CategoryFilterInput setUrlPath(FilterEqualTypeInput urlPath) {
        this.urlPath = Input.optional(urlPath);
        return this;
    }

    /**
     * Filter by the URL path for the category.
     */
    public CategoryFilterInput setUrlPathInput(Input<FilterEqualTypeInput> urlPath) {
        if (urlPath == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.urlPath = urlPath;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.ids.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("ids:");
            if (ids.getValue() != null) {
                ids.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.name.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("name:");
            if (name.getValue() != null) {
                name.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.urlKey.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("url_key:");
            if (urlKey.getValue() != null) {
                urlKey.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.urlPath.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("url_path:");
            if (urlPath.getValue() != null) {
                urlPath.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}

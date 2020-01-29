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
import com.shopify.graphql.support.Arguments;

/**
 * CategoryInterface contains the full set of attributes that can be returned in a category search.
 */
public class CategoryInterfaceQuery extends AbstractQuery<CategoryInterfaceQuery> {
    CategoryInterfaceQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
    }

    public CategoryInterfaceQuery availableSortBy() {
        startField("available_sort_by");

        return this;
    }

    /**
     * Breadcrumbs, parent categories info.
     */
    public CategoryInterfaceQuery breadcrumbs(BreadcrumbQueryDefinition queryDef) {
        startField("breadcrumbs");

        _queryBuilder.append('{');
        queryDef.define(new BreadcrumbQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Relative canonical URL. This value is returned only if the system setting &#39;Use Canonical Link Meta
     * Tag For Categories&#39; is enabled
     */
    public CategoryInterfaceQuery canonicalUrl() {
        startField("canonical_url");

        return this;
    }

    public CategoryInterfaceQuery childrenCount() {
        startField("children_count");

        return this;
    }

    /**
     * Category CMS Block.
     */
    public CategoryInterfaceQuery cmsBlock(CmsBlockQueryDefinition queryDef) {
        startField("cms_block");

        _queryBuilder.append('{');
        queryDef.define(new CmsBlockQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Timestamp indicating when the category was created.
     */
    public CategoryInterfaceQuery createdAt() {
        startField("created_at");

        return this;
    }

    public CategoryInterfaceQuery customLayoutUpdateFile() {
        startField("custom_layout_update_file");

        return this;
    }

    /**
     * The attribute to use for sorting.
     */
    public CategoryInterfaceQuery defaultSortBy() {
        startField("default_sort_by");

        return this;
    }

    /**
     * An optional description of the category.
     */
    public CategoryInterfaceQuery description() {
        startField("description");

        return this;
    }

    public CategoryInterfaceQuery displayMode() {
        startField("display_mode");

        return this;
    }

    public CategoryInterfaceQuery filterPriceRange() {
        startField("filter_price_range");

        return this;
    }

    /**
     * An ID that uniquely identifies the category.
     */
    public CategoryInterfaceQuery id() {
        startField("id");

        return this;
    }

    public CategoryInterfaceQuery image() {
        startField("image");

        return this;
    }

    public CategoryInterfaceQuery includeInMenu() {
        startField("include_in_menu");

        return this;
    }

    public CategoryInterfaceQuery isAnchor() {
        startField("is_anchor");

        return this;
    }

    public CategoryInterfaceQuery landingPage() {
        startField("landing_page");

        return this;
    }

    /**
     * Indicates the depth of the category within the tree.
     */
    public CategoryInterfaceQuery level() {
        startField("level");

        return this;
    }

    public CategoryInterfaceQuery metaDescription() {
        startField("meta_description");

        return this;
    }

    public CategoryInterfaceQuery metaKeywords() {
        startField("meta_keywords");

        return this;
    }

    public CategoryInterfaceQuery metaTitle() {
        startField("meta_title");

        return this;
    }

    /**
     * The display name of the category.
     */
    public CategoryInterfaceQuery name() {
        startField("name");

        return this;
    }

    /**
     * Category Path.
     */
    public CategoryInterfaceQuery path() {
        startField("path");

        return this;
    }

    /**
     * Category path in store.
     */
    public CategoryInterfaceQuery pathInStore() {
        startField("path_in_store");

        return this;
    }

    /**
     * The position of the category relative to other categories at the same level in tree.
     */
    public CategoryInterfaceQuery position() {
        startField("position");

        return this;
    }

    /**
     * The number of products in the category.
     */
    public CategoryInterfaceQuery productCount() {
        startField("product_count");

        return this;
    }

    public class ProductsArguments extends Arguments {
        ProductsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
         * Specifies the maximum number of results to return at once. This attribute is optional.
         */
        public ProductsArguments pageSize(Integer value) {
            if (value != null) {
                startArgument("pageSize");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
         * Specifies which page of results to return. The default value is 1.
         */
        public ProductsArguments currentPage(Integer value) {
            if (value != null) {
                startArgument("currentPage");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
         * Specifies which attributes to sort on, and whether to return the results in ascending or descending
         * order.
         */
        public ProductsArguments sort(ProductAttributeSortInput value) {
            if (value != null) {
                startArgument("sort");
                value.appendTo(_queryBuilder);
            }
            return this;
        }
    }

    public interface ProductsArgumentsDefinition {
        void define(ProductsArguments args);
    }

    /**
     * The list of products assigned to the category.
     */
    public CategoryInterfaceQuery products(CategoryProductsQueryDefinition queryDef) {
        return products(args -> {}, queryDef);
    }

    /**
     * The list of products assigned to the category.
     */
    public CategoryInterfaceQuery products(ProductsArgumentsDefinition argsDef, CategoryProductsQueryDefinition queryDef) {
        startField("products");

        ProductsArguments args = new ProductsArguments(_queryBuilder);
        argsDef.define(args);
        ProductsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new CategoryProductsQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Timestamp indicating when the category was updated.
     */
    public CategoryInterfaceQuery updatedAt() {
        startField("updated_at");

        return this;
    }

    /**
     * The url key assigned to the category.
     */
    public CategoryInterfaceQuery urlKey() {
        startField("url_key");

        return this;
    }

    /**
     * The url path assigned to the category.
     */
    public CategoryInterfaceQuery urlPath() {
        startField("url_path");

        return this;
    }

    /**
     * The part of the category URL that is appended after the url key
     */
    public CategoryInterfaceQuery urlSuffix() {
        startField("url_suffix");

        return this;
    }

    public CategoryInterfaceQuery onCategoryTree(CategoryTreeQueryDefinition queryDef) {
        startInlineFragment("CategoryTree");
        queryDef.define(new CategoryTreeQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}

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
import com.shopify.graphql.support.Fragment;

/**
 * Contains the full set of attributes that can be returned in a category search.
 */
public class CategoryInterfaceQuery extends AbstractQuery<CategoryInterfaceQuery> {
    CategoryInterfaceQuery(StringBuilder _queryBuilder) {
        this(_queryBuilder, true);
    }

    CategoryInterfaceQuery(StringBuilder _queryBuilder, boolean addTypename) {
        super(_queryBuilder);
        if (addTypename) {
            startField("__typename");
        }
    }

    public CategoryInterfaceQuery automaticSorting() {
        startField("automatic_sorting");

        return this;
    }

    public CategoryInterfaceQuery availableSortBy() {
        startField("available_sort_by");

        return this;
    }

    /**
     * An array of breadcrumb items.
     */
    public CategoryInterfaceQuery breadcrumbs(BreadcrumbQueryDefinition queryDef) {
        startField("breadcrumbs");

        _queryBuilder.append('{');
        queryDef.define(new BreadcrumbQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The relative canonical URL. This value is returned only if the system setting &#39;Use Canonical Link
     * Meta Tag For Categories&#39; is enabled.
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
     * Contains a category CMS block.
     */
    public CategoryInterfaceQuery cmsBlock(CmsBlockQueryDefinition queryDef) {
        startField("cms_block");

        _queryBuilder.append('{');
        queryDef.define(new CmsBlockQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The timestamp indicating when the category was created.
     *
     * @deprecated The field should not be used on the storefront.
     */
    @Deprecated
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
     *
     * @deprecated Use `uid` instead.
     */
    @Deprecated
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
     * The depth of the category within the tree.
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
     * The full category path.
     */
    public CategoryInterfaceQuery path() {
        startField("path");

        return this;
    }

    /**
     * The category path within the store.
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
     * The number of products in the category that are marked as visible. By default, in complex products,
     * parent products are visible, but their child products are not.
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
         * The maximum number of results to return at once. The default value is 20.
         */
        public ProductsArguments pageSize(Integer value) {
            if (value != null) {
                startArgument("pageSize");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
         * The page of results to return. The default value is 1.
         */
        public ProductsArguments currentPage(Integer value) {
            if (value != null) {
                startArgument("currentPage");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
         * The attributes to sort on, and whether to return the results in ascending or descending order.
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
     * Indicates whether the category is staged for a future campaign.
     */
    public CategoryInterfaceQuery staged() {
        startField("staged");

        return this;
    }

    /**
     * The unique ID for a `CategoryInterface` object.
     */
    public CategoryInterfaceQuery uid() {
        startField("uid");

        return this;
    }

    /**
     * The timestamp indicating when the category was updated.
     *
     * @deprecated The field should not be used on the storefront.
     */
    @Deprecated
    public CategoryInterfaceQuery updatedAt() {
        startField("updated_at");

        return this;
    }

    /**
     * The URL key assigned to the category.
     */
    public CategoryInterfaceQuery urlKey() {
        startField("url_key");

        return this;
    }

    /**
     * The URL path assigned to the category.
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

    public CategoryInterfaceQuery onRoutableInterface(RoutableInterfaceQueryDefinition queryDef) {
        startInlineFragment("RoutableInterface");
        queryDef.define(new RoutableInterfaceQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    /**
     * Creates a GraphQL "named" fragment with the specified query type definition.
     * The generics nature of fragments ensures that a fragment can only be used at the right place in the GraphQL request.
     * 
     * @param name The name of the fragment, must be unique for a given GraphQL request.
     * @param queryDef The fragment definition.
     * @return The fragment of a given generics type.
     */
    public static Fragment<CategoryInterfaceQuery> createFragment(String name, CategoryInterfaceQueryDefinition queryDef) {
        StringBuilder sb = new StringBuilder();
        queryDef.define(new CategoryInterfaceQuery(sb, false));
        return new Fragment<>(name, "CategoryInterface", sb.toString());
    }

    /**
     * Adds a <code>CategoryInterfaceQuery</code> fragment reference at the current position of the query.
     * For example for a fragment named <code>test</code>, calling this method will add the
     * reference <code>...test</code> in the query. For GraphQL types implementing an interface, there
     * will be some similar methods using the Query type of each implemented interface.
     * 
     * @param fragment The fragment to reference.
     */
    public CategoryInterfaceQuery addFragmentReference(Fragment<CategoryInterfaceQuery> fragment) {
        startField("..." + fragment.getName());
        return this;
    }
}

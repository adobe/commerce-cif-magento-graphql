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
import com.shopify.graphql.support.Fragment;

/**
 * Routable entities serve as the model for a rendered page
 */
public class RoutableInterfaceQuery extends AbstractQuery<RoutableInterfaceQuery> {
    RoutableInterfaceQuery(StringBuilder _queryBuilder) {
        this(_queryBuilder, true);
    }

    RoutableInterfaceQuery(StringBuilder _queryBuilder, boolean addTypename) {
        super(_queryBuilder);
        if (addTypename) {
            startField("__typename");
        }
    }

    /**
     * Contains 0 when there is no redirect error. A value of 301 indicates the URL of the requested
     * resource has been changed permanently, while a value of 302 indicates a temporary redirect
     */
    public RoutableInterfaceQuery redirectCode() {
        startField("redirect_code");

        return this;
    }

    /**
     * The internal relative URL. If the specified URL is a redirect, the query returns the redirected URL,
     * not the original
     */
    public RoutableInterfaceQuery relativeUrl() {
        startField("relative_url");

        return this;
    }

    /**
     * One of PRODUCT, CATEGORY, or CMS_PAGE.
     */
    public RoutableInterfaceQuery type() {
        startField("type");

        return this;
    }

    public RoutableInterfaceQuery onBundleProduct(BundleProductQueryDefinition queryDef) {
        startInlineFragment("BundleProduct");
        queryDef.define(new BundleProductQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public RoutableInterfaceQuery onCategoryTree(CategoryTreeQueryDefinition queryDef) {
        startInlineFragment("CategoryTree");
        queryDef.define(new CategoryTreeQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public RoutableInterfaceQuery onCmsPage(CmsPageQueryDefinition queryDef) {
        startInlineFragment("CmsPage");
        queryDef.define(new CmsPageQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public RoutableInterfaceQuery onConfigurableProduct(ConfigurableProductQueryDefinition queryDef) {
        startInlineFragment("ConfigurableProduct");
        queryDef.define(new ConfigurableProductQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public RoutableInterfaceQuery onDownloadableProduct(DownloadableProductQueryDefinition queryDef) {
        startInlineFragment("DownloadableProduct");
        queryDef.define(new DownloadableProductQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public RoutableInterfaceQuery onGiftCardProduct(GiftCardProductQueryDefinition queryDef) {
        startInlineFragment("GiftCardProduct");
        queryDef.define(new GiftCardProductQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public RoutableInterfaceQuery onGroupedProduct(GroupedProductQueryDefinition queryDef) {
        startInlineFragment("GroupedProduct");
        queryDef.define(new GroupedProductQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public RoutableInterfaceQuery onSimpleProduct(SimpleProductQueryDefinition queryDef) {
        startInlineFragment("SimpleProduct");
        queryDef.define(new SimpleProductQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public RoutableInterfaceQuery onVirtualProduct(VirtualProductQueryDefinition queryDef) {
        startInlineFragment("VirtualProduct");
        queryDef.define(new VirtualProductQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public RoutableInterfaceQuery onCustomizableProductInterface(CustomizableProductInterfaceQueryDefinition queryDef) {
        startInlineFragment("CustomizableProductInterface");
        queryDef.define(new CustomizableProductInterfaceQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public RoutableInterfaceQuery onPhysicalProductInterface(PhysicalProductInterfaceQueryDefinition queryDef) {
        startInlineFragment("PhysicalProductInterface");
        queryDef.define(new PhysicalProductInterfaceQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public RoutableInterfaceQuery onProductInterface(ProductInterfaceQueryDefinition queryDef) {
        startInlineFragment("ProductInterface");
        queryDef.define(new ProductInterfaceQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public RoutableInterfaceQuery onCategoryInterface(CategoryInterfaceQueryDefinition queryDef) {
        startInlineFragment("CategoryInterface");
        queryDef.define(new CategoryInterfaceQuery(_queryBuilder));
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
    public static Fragment<RoutableInterfaceQuery> createFragment(String name, RoutableInterfaceQueryDefinition queryDef) {
        StringBuilder sb = new StringBuilder();
        queryDef.define(new RoutableInterfaceQuery(sb, false));
        return new Fragment<>(name, "RoutableInterface", sb.toString());
    }

    /**
     * Adds a <code>RoutableInterfaceQuery</code> fragment reference at the current position of the query.
     * For example for a fragment named <code>test</code>, calling this method will add the
     * reference <code>...test</code> in the query. For GraphQL types implementing an interface, there
     * will be some similar methods using the Query type of each implemented interface.
     * 
     * @param fragment The fragment to reference.
     */
    public RoutableInterfaceQuery addFragmentReference(Fragment<RoutableInterfaceQuery> fragment) {
        startField("..." + fragment.getName());
        return this;
    }
}

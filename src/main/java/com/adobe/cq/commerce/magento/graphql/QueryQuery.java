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

import java.util.List;

import com.shopify.graphql.support.AbstractQuery;
import com.shopify.graphql.support.Arguments;

/**
 * 
 */
public class QueryQuery extends AbstractQuery<QueryQuery> {
    QueryQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
     * Returns information about shopping cart
     */
    public QueryQuery cart(String cartId, CartQueryDefinition queryDef) {
        startField("cart");

        _queryBuilder.append("(cart_id:");
        AbstractQuery.appendQuotedString(_queryBuilder, cartId.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CartQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class CategoryArguments extends Arguments {
        CategoryArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
         * Id of the category
         */
        public CategoryArguments id(Integer value) {
            if (value != null) {
                startArgument("id");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface CategoryArgumentsDefinition {
        void define(CategoryArguments args);
    }

    /**
     * The category query searches for categories that match the criteria specified in the search and
     * filter attributes
     */
    public QueryQuery category(CategoryTreeQueryDefinition queryDef) {
        return category(args -> {}, queryDef);
    }

    /**
     * The category query searches for categories that match the criteria specified in the search and
     * filter attributes
     */
    public QueryQuery category(CategoryArgumentsDefinition argsDef, CategoryTreeQueryDefinition queryDef) {
        startField("category");

        CategoryArguments args = new CategoryArguments(_queryBuilder);
        argsDef.define(args);
        CategoryArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new CategoryTreeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class CmsBlocksArguments extends Arguments {
        CmsBlocksArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
         * Identifiers of the CMS blocks
         */
        public CmsBlocksArguments identifiers(List<String> value) {
            if (value != null) {
                startArgument("identifiers");
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (String item1 : value) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        AbstractQuery.appendQuotedString(_queryBuilder, item1.toString());
                    }
                }
                _queryBuilder.append(']');
            }
            return this;
        }
    }

    public interface CmsBlocksArgumentsDefinition {
        void define(CmsBlocksArguments args);
    }

    /**
     * The CMS block query returns information about CMS blocks
     */
    public QueryQuery cmsBlocks(CmsBlocksQueryDefinition queryDef) {
        return cmsBlocks(args -> {}, queryDef);
    }

    /**
     * The CMS block query returns information about CMS blocks
     */
    public QueryQuery cmsBlocks(CmsBlocksArgumentsDefinition argsDef, CmsBlocksQueryDefinition queryDef) {
        startField("cmsBlocks");

        CmsBlocksArguments args = new CmsBlocksArguments(_queryBuilder);
        argsDef.define(args);
        CmsBlocksArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new CmsBlocksQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class CmsPageArguments extends Arguments {
        CmsPageArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
         * Id of the CMS page
         */
        public CmsPageArguments id(Integer value) {
            if (value != null) {
                startArgument("id");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface CmsPageArgumentsDefinition {
        void define(CmsPageArguments args);
    }

    /**
     * The CMS page query returns information about a CMS page
     */
    public QueryQuery cmsPage(CmsPageQueryDefinition queryDef) {
        return cmsPage(args -> {}, queryDef);
    }

    /**
     * The CMS page query returns information about a CMS page
     */
    public QueryQuery cmsPage(CmsPageArgumentsDefinition argsDef, CmsPageQueryDefinition queryDef) {
        startField("cmsPage");

        CmsPageArguments args = new CmsPageArguments(_queryBuilder);
        argsDef.define(args);
        CmsPageArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new CmsPageQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The countries query provides information for all countries.
     */
    public QueryQuery countries(CountryQueryDefinition queryDef) {
        startField("countries");

        _queryBuilder.append('{');
        queryDef.define(new CountryQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class CountryArguments extends Arguments {
        CountryArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
         * 
         */
        public CountryArguments id(String value) {
            if (value != null) {
                startArgument("id");
                AbstractQuery.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }
    }

    public interface CountryArgumentsDefinition {
        void define(CountryArguments args);
    }

    /**
     * The countries query provides information for a single country.
     */
    public QueryQuery country(CountryQueryDefinition queryDef) {
        return country(args -> {}, queryDef);
    }

    /**
     * The countries query provides information for a single country.
     */
    public QueryQuery country(CountryArgumentsDefinition argsDef, CountryQueryDefinition queryDef) {
        startField("country");

        CountryArguments args = new CountryArguments(_queryBuilder);
        argsDef.define(args);
        CountryArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new CountryQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The currency query returns information about store currency.
     */
    public QueryQuery currency(CurrencyQueryDefinition queryDef) {
        startField("currency");

        _queryBuilder.append('{');
        queryDef.define(new CurrencyQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The customAttributeMetadata query returns the attribute type, given an attribute code and entity
     * type
     */
    public QueryQuery customAttributeMetadata(List<AttributeInput> attributes, CustomAttributeMetadataQueryDefinition queryDef) {
        startField("customAttributeMetadata");

        _queryBuilder.append("(attributes:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (AttributeInput item1 : attributes) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                item1.appendTo(_queryBuilder);
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CustomAttributeMetadataQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The customer query returns information about a customer account
     */
    public QueryQuery customer(CustomerQueryDefinition queryDef) {
        startField("customer");

        _queryBuilder.append('{');
        queryDef.define(new CustomerQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The query returns the contents of a customer&#39;s downloadable products
     */
    public QueryQuery customerDownloadableProducts(CustomerDownloadableProductsQueryDefinition queryDef) {
        startField("customerDownloadableProducts");

        _queryBuilder.append('{');
        queryDef.define(new CustomerDownloadableProductsQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * List of customer orders
     */
    public QueryQuery customerOrders(CustomerOrdersQueryDefinition queryDef) {
        startField("customerOrders");

        _queryBuilder.append('{');
        queryDef.define(new CustomerOrdersQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Return a list of customer payment tokens
     */
    public QueryQuery customerPaymentTokens(CustomerPaymentTokensQueryDefinition queryDef) {
        startField("customerPaymentTokens");

        _queryBuilder.append('{');
        queryDef.define(new CustomerPaymentTokensQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public QueryQuery isEmailAvailable(String email, IsEmailAvailableOutputQueryDefinition queryDef) {
        startField("isEmailAvailable");

        _queryBuilder.append("(email:");
        AbstractQuery.appendQuotedString(_queryBuilder, email.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new IsEmailAvailableOutputQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class ProductsArguments extends Arguments {
        ProductsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
         * Performs a full-text search using the specified key words.
         */
        public ProductsArguments search(String value) {
            if (value != null) {
                startArgument("search");
                AbstractQuery.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
         * Identifies which product attributes to search for and return.
         */
        public ProductsArguments filter(ProductFilterInput value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
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
         * Specifies which attribute to sort on, and whether to return the results in ascending or descending
         * order.
         */
        public ProductsArguments sort(ProductSortInput value) {
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
     * The products query searches for products that match the criteria specified in the search and filter
     * attributes
     */
    public QueryQuery products(ProductsQueryDefinition queryDef) {
        return products(args -> {}, queryDef);
    }

    /**
     * The products query searches for products that match the criteria specified in the search and filter
     * attributes
     */
    public QueryQuery products(ProductsArgumentsDefinition argsDef, ProductsQueryDefinition queryDef) {
        startField("products");

        ProductsArguments args = new ProductsArguments(_queryBuilder);
        argsDef.define(args);
        ProductsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ProductsQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The store config query
     */
    public QueryQuery storeConfig(StoreConfigQueryDefinition queryDef) {
        startField("storeConfig");

        _queryBuilder.append('{');
        queryDef.define(new StoreConfigQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The urlResolver query returns the relative URL for a specified product, category or CMS page
     */
    public QueryQuery urlResolver(String url, EntityUrlQueryDefinition queryDef) {
        startField("urlResolver");

        _queryBuilder.append("(url:");
        AbstractQuery.appendQuotedString(_queryBuilder, url.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new EntityUrlQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The wishlist query returns the contents of a customer&#39;s wish list
     */
    public QueryQuery wishlist(WishlistOutputQueryDefinition queryDef) {
        startField("wishlist");

        _queryBuilder.append('{');
        queryDef.define(new WishlistOutputQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public String toString() {
        return _queryBuilder.toString();
    }
}

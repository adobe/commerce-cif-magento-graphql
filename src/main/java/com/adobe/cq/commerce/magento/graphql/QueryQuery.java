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

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.shopify.graphql.support.AbstractQuery;
import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Fragment;
import com.shopify.graphql.support.ID;

public class QueryQuery extends AbstractQuery<QueryQuery> {
    QueryQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public class AvailableStoresArguments extends Arguments {
        AvailableStoresArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
         * Filter store views by the current store group.
         */
        public AvailableStoresArguments useCurrentGroup(Boolean value) {
            if (value != null) {
                startArgument("useCurrentGroup");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface AvailableStoresArgumentsDefinition {
        void define(AvailableStoresArguments args);
    }

    /**
     * Get a list of available store views and their config information.
     */
    public QueryQuery availableStores(StoreConfigQueryDefinition queryDef) {
        return availableStores(args -> {}, queryDef);
    }

    /**
     * Get a list of available store views and their config information.
     */
    public QueryQuery availableStores(AvailableStoresArgumentsDefinition argsDef, StoreConfigQueryDefinition queryDef) {
        startField("availableStores");

        AvailableStoresArguments args = new AvailableStoresArguments(_queryBuilder);
        argsDef.define(args);
        AvailableStoresArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new StoreConfigQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Return information about the specified shopping cart.
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

    public class CategoriesArguments extends Arguments {
        CategoriesArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
         * Identifies which Category filter inputs to search for and return.
         */
        public CategoriesArguments filters(CategoryFilterInput value) {
            if (value != null) {
                startArgument("filters");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
         * Specifies the maximum number of results to return at once. The default value is 20.
         */
        public CategoriesArguments pageSize(Integer value) {
            if (value != null) {
                startArgument("pageSize");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
         * Specifies which page of results to return. The default value is 1.
         */
        public CategoriesArguments currentPage(Integer value) {
            if (value != null) {
                startArgument("currentPage");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface CategoriesArgumentsDefinition {
        void define(CategoriesArguments args);
    }

    /**
     * Return a list of categories that match the specified filter.
     */
    public QueryQuery categories(CategoryResultQueryDefinition queryDef) {
        return categories(args -> {}, queryDef);
    }

    /**
     * Return a list of categories that match the specified filter.
     */
    public QueryQuery categories(CategoriesArgumentsDefinition argsDef, CategoryResultQueryDefinition queryDef) {
        startField("categories");

        CategoriesArguments args = new CategoriesArguments(_queryBuilder);
        argsDef.define(args);
        CategoriesArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new CategoryResultQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class CategoryArguments extends Arguments {
        CategoryArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
         * The category ID to use as the root of the search.
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
     * Search for categories that match the criteria specified in the `search` and `filter` attributes.
     *
     * @deprecated Use `categoryList` instead.
     */
    public QueryQuery category(CategoryTreeQueryDefinition queryDef) {
        return category(args -> {}, queryDef);
    }

    /**
     * Search for categories that match the criteria specified in the `search` and `filter` attributes.
     *
     * @deprecated Use `categoryList` instead.
     */
    @Deprecated
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

    public class CategoryListArguments extends Arguments {
        CategoryListArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
         * Identifies which Category filter inputs to search for and return.
         */
        public CategoryListArguments filters(CategoryFilterInput value) {
            if (value != null) {
                startArgument("filters");
                value.appendTo(_queryBuilder);
            }
            return this;
        }
    }

    public interface CategoryListArgumentsDefinition {
        void define(CategoryListArguments args);
    }

    /**
     * Return an array of categories based on the specified filters.
     */
    public QueryQuery categoryList(CategoryTreeQueryDefinition queryDef) {
        return categoryList(args -> {}, queryDef);
    }

    /**
     * Return an array of categories based on the specified filters.
     */
    public QueryQuery categoryList(CategoryListArgumentsDefinition argsDef, CategoryTreeQueryDefinition queryDef) {
        startField("categoryList");

        CategoryListArguments args = new CategoryListArguments(_queryBuilder);
        argsDef.define(args);
        CategoryListArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new CategoryTreeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Return Terms and Conditions configuration information.
     */
    public QueryQuery checkoutAgreements(CheckoutAgreementQueryDefinition queryDef) {
        startField("checkoutAgreements");

        _queryBuilder.append('{');
        queryDef.define(new CheckoutAgreementQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class CmsBlocksArguments extends Arguments {
        CmsBlocksArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
         * An array of CMS block IDs.
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
     * Return information about CMS blocks.
     */
    public QueryQuery cmsBlocks(CmsBlocksQueryDefinition queryDef) {
        return cmsBlocks(args -> {}, queryDef);
    }

    /**
     * Return information about CMS blocks.
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
         * The ID of the CMS page.
         */
        public CmsPageArguments id(Integer value) {
            if (value != null) {
                startArgument("id");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
         * The identifier of the CMS page.
         */
        public CmsPageArguments identifier(String value) {
            if (value != null) {
                startArgument("identifier");
                AbstractQuery.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }
    }

    public interface CmsPageArgumentsDefinition {
        void define(CmsPageArguments args);
    }

    /**
     * Return details about a CMS page.
     */
    public QueryQuery cmsPage(CmsPageQueryDefinition queryDef) {
        return cmsPage(args -> {}, queryDef);
    }

    /**
     * Return details about a CMS page.
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
     * Return detailed information about the authenticated customer&#39;s company.
     */
    public QueryQuery company(CompanyQueryDefinition queryDef) {
        startField("company");

        _queryBuilder.append('{');
        queryDef.define(new CompanyQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Return products that have been added to the specified compare list.
     */
    public QueryQuery compareList(ID uid, CompareListQueryDefinition queryDef) {
        startField("compareList");

        _queryBuilder.append("(uid:");
        AbstractQuery.appendQuotedString(_queryBuilder, uid.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CompareListQuery(_queryBuilder));
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
     * Return information about the store&#39;s currency.
     */
    public QueryQuery currency(CurrencyQueryDefinition queryDef) {
        startField("currency");

        _queryBuilder.append('{');
        queryDef.define(new CurrencyQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Return the attribute type, given an attribute code and entity type.
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
     * Return detailed information about a customer account.
     */
    public QueryQuery customer(CustomerQueryDefinition queryDef) {
        startField("customer");

        _queryBuilder.append('{');
        queryDef.define(new CustomerQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Return information about the customer&#39;s shopping cart.
     */
    public QueryQuery customerCart(CartQueryDefinition queryDef) {
        startField("customerCart");

        _queryBuilder.append('{');
        queryDef.define(new CartQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Return a list of downloadable products the customer has purchased.
     */
    public QueryQuery customerDownloadableProducts(CustomerDownloadableProductsQueryDefinition queryDef) {
        startField("customerDownloadableProducts");

        _queryBuilder.append('{');
        queryDef.define(new CustomerDownloadableProductsQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * @deprecated Use the `customer` query instead.
     */
    @Deprecated
    public QueryQuery customerOrders(CustomerOrdersQueryDefinition queryDef) {
        startField("customerOrders");

        _queryBuilder.append('{');
        queryDef.define(new CustomerOrdersQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Return a list of customer payment tokens stored in the vault.
     */
    public QueryQuery customerPaymentTokens(CustomerPaymentTokensQueryDefinition queryDef) {
        startField("customerPaymentTokens");

        _queryBuilder.append('{');
        queryDef.define(new CustomerPaymentTokensQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class DynamicBlocksArguments extends Arguments {
        DynamicBlocksArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
         * Defines the filter for returning matching dynamic blocks.
         */
        public DynamicBlocksArguments input(DynamicBlocksFilterInput value) {
            if (value != null) {
                startArgument("input");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
         * The maximum number of results to return at once. The default is 20.
         */
        public DynamicBlocksArguments pageSize(Integer value) {
            if (value != null) {
                startArgument("pageSize");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
         * The page of results to return. The default is 1.
         */
        public DynamicBlocksArguments currentPage(Integer value) {
            if (value != null) {
                startArgument("currentPage");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface DynamicBlocksArgumentsDefinition {
        void define(DynamicBlocksArguments args);
    }

    /**
     * Return a list of dynamic blocks filtered by type, location, or UIDs.
     */
    public QueryQuery dynamicBlocks(DynamicBlocksQueryDefinition queryDef) {
        return dynamicBlocks(args -> {}, queryDef);
    }

    /**
     * Return a list of dynamic blocks filtered by type, location, or UIDs.
     */
    public QueryQuery dynamicBlocks(DynamicBlocksArgumentsDefinition argsDef, DynamicBlocksQueryDefinition queryDef) {
        startField("dynamicBlocks");

        DynamicBlocksArguments args = new DynamicBlocksArguments(_queryBuilder);
        argsDef.define(args);
        DynamicBlocksArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new DynamicBlocksQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Retrieve the secure PayPal URL for a Payments Pro Hosted Solution transaction.
     */
    public QueryQuery getHostedProUrl(HostedProUrlInput input, HostedProUrlQueryDefinition queryDef) {
        startField("getHostedProUrl");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new HostedProUrlQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Retrieve payment credentials for a transaction. Use this query for Payflow Link and Payments
     * Advanced payment methods.
     */
    public QueryQuery getPayflowLinkToken(PayflowLinkTokenInput input, PayflowLinkTokenQueryDefinition queryDef) {
        startField("getPayflowLinkToken");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new PayflowLinkTokenQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Return details about a specific gift card.
     */
    public QueryQuery giftCardAccount(GiftCardAccountInput input, GiftCardAccountQueryDefinition queryDef) {
        startField("giftCardAccount");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new GiftCardAccountQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Return the specified gift registry. Some details will not be available to guests.
     */
    public QueryQuery giftRegistry(ID giftRegistryUid, GiftRegistryQueryDefinition queryDef) {
        startField("giftRegistry");

        _queryBuilder.append("(giftRegistryUid:");
        AbstractQuery.appendQuotedString(_queryBuilder, giftRegistryUid.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new GiftRegistryQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Search for gift registries by specifying a registrant email address.
     */
    public QueryQuery giftRegistryEmailSearch(String email, GiftRegistrySearchResultQueryDefinition queryDef) {
        startField("giftRegistryEmailSearch");

        _queryBuilder.append("(email:");
        AbstractQuery.appendQuotedString(_queryBuilder, email.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new GiftRegistrySearchResultQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Search for gift registries by specifying a registry URL key.
     */
    public QueryQuery giftRegistryIdSearch(ID giftRegistryUid, GiftRegistrySearchResultQueryDefinition queryDef) {
        startField("giftRegistryIdSearch");

        _queryBuilder.append("(giftRegistryUid:");
        AbstractQuery.appendQuotedString(_queryBuilder, giftRegistryUid.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new GiftRegistrySearchResultQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class GiftRegistryTypeSearchArguments extends Arguments {
        GiftRegistryTypeSearchArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, false);
        }

        /**
         * The type UID of the registry.
         */
        public GiftRegistryTypeSearchArguments giftRegistryTypeUid(ID value) {
            if (value != null) {
                startArgument("giftRegistryTypeUid");
                AbstractQuery.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }
    }

    public interface GiftRegistryTypeSearchArgumentsDefinition {
        void define(GiftRegistryTypeSearchArguments args);
    }

    /**
     * Search for gift registries by specifying the registrant name and registry type ID.
     */
    public QueryQuery giftRegistryTypeSearch(String firstName, String lastName, GiftRegistrySearchResultQueryDefinition queryDef) {
        return giftRegistryTypeSearch(firstName, lastName, args -> {}, queryDef);
    }

    /**
     * Search for gift registries by specifying the registrant name and registry type ID.
     */
    public QueryQuery giftRegistryTypeSearch(String firstName, String lastName, GiftRegistryTypeSearchArgumentsDefinition argsDef,
        GiftRegistrySearchResultQueryDefinition queryDef) {
        startField("giftRegistryTypeSearch");

        _queryBuilder.append("(firstName:");
        AbstractQuery.appendQuotedString(_queryBuilder, firstName.toString());

        _queryBuilder.append(",lastName:");
        AbstractQuery.appendQuotedString(_queryBuilder, lastName.toString());

        argsDef.define(new GiftRegistryTypeSearchArguments(_queryBuilder));

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new GiftRegistrySearchResultQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Get a list of available gift registry types.
     */
    public QueryQuery giftRegistryTypes(GiftRegistryTypeQueryDefinition queryDef) {
        startField("giftRegistryTypes");

        _queryBuilder.append('{');
        queryDef.define(new GiftRegistryTypeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Check whether the specified email can be used to register a company admin.
     */
    public QueryQuery isCompanyAdminEmailAvailable(String email, IsCompanyAdminEmailAvailableOutputQueryDefinition queryDef) {
        startField("isCompanyAdminEmailAvailable");

        _queryBuilder.append("(email:");
        AbstractQuery.appendQuotedString(_queryBuilder, email.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new IsCompanyAdminEmailAvailableOutputQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Check whether the specified email can be used to register a new company.
     */
    public QueryQuery isCompanyEmailAvailable(String email, IsCompanyEmailAvailableOutputQueryDefinition queryDef) {
        startField("isCompanyEmailAvailable");

        _queryBuilder.append("(email:");
        AbstractQuery.appendQuotedString(_queryBuilder, email.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new IsCompanyEmailAvailableOutputQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Check whether the specified role name is valid for the company.
     */
    public QueryQuery isCompanyRoleNameAvailable(String name, IsCompanyRoleNameAvailableOutputQueryDefinition queryDef) {
        startField("isCompanyRoleNameAvailable");

        _queryBuilder.append("(name:");
        AbstractQuery.appendQuotedString(_queryBuilder, name.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new IsCompanyRoleNameAvailableOutputQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Check whether the specified email can be used to register a company user.
     */
    public QueryQuery isCompanyUserEmailAvailable(String email, IsCompanyUserEmailAvailableOutputQueryDefinition queryDef) {
        startField("isCompanyUserEmailAvailable");

        _queryBuilder.append("(email:");
        AbstractQuery.appendQuotedString(_queryBuilder, email.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new IsCompanyUserEmailAvailableOutputQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Check whether the specified email has already been used to create a customer account.
     */
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

    /**
     * Retrieve the specified negotiable quote.
     */
    public QueryQuery negotiableQuote(ID uid, NegotiableQuoteQueryDefinition queryDef) {
        startField("negotiableQuote");

        _queryBuilder.append("(uid:");
        AbstractQuery.appendQuotedString(_queryBuilder, uid.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new NegotiableQuoteQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class NegotiableQuotesArguments extends Arguments {
        NegotiableQuotesArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
         * The filter to use to determine which negotiable quotes to return.
         */
        public NegotiableQuotesArguments filter(NegotiableQuoteFilterInput value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
         * The maximum number of results to return at once. The default value is 20.
         */
        public NegotiableQuotesArguments pageSize(Integer value) {
            if (value != null) {
                startArgument("pageSize");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
         * The page of results to return. The default value is 1.
         */
        public NegotiableQuotesArguments currentPage(Integer value) {
            if (value != null) {
                startArgument("currentPage");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
         * The field to use for sorting results.
         */
        public NegotiableQuotesArguments sort(NegotiableQuoteSortInput value) {
            if (value != null) {
                startArgument("sort");
                value.appendTo(_queryBuilder);
            }
            return this;
        }
    }

    public interface NegotiableQuotesArgumentsDefinition {
        void define(NegotiableQuotesArguments args);
    }

    /**
     * Return a list of negotiable quotes that can be viewed by the logged-in customer.
     */
    public QueryQuery negotiableQuotes(NegotiableQuotesOutputQueryDefinition queryDef) {
        return negotiableQuotes(args -> {}, queryDef);
    }

    /**
     * Return a list of negotiable quotes that can be viewed by the logged-in customer.
     */
    public QueryQuery negotiableQuotes(NegotiableQuotesArgumentsDefinition argsDef, NegotiableQuotesOutputQueryDefinition queryDef) {
        startField("negotiableQuotes");

        NegotiableQuotesArguments args = new NegotiableQuotesArguments(_queryBuilder);
        argsDef.define(args);
        NegotiableQuotesArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new NegotiableQuotesOutputQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class PickupLocationsArguments extends Arguments {
        PickupLocationsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
         * Perform search by location using radius and search term.
         */
        public PickupLocationsArguments area(AreaInput value) {
            if (value != null) {
                startArgument("area");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
         * Apply filters by attributes.
         */
        public PickupLocationsArguments filters(PickupLocationFilterInput value) {
            if (value != null) {
                startArgument("filters");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
         * Specifies which attribute to sort on, and whether to return the results in ascending or descending
         * order.
         */
        public PickupLocationsArguments sort(PickupLocationSortInput value) {
            if (value != null) {
                startArgument("sort");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
         * The maximum number of pickup locations to return at once. The attribute is optional.
         */
        public PickupLocationsArguments pageSize(Integer value) {
            if (value != null) {
                startArgument("pageSize");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
         * Specifies which page of results to return. The default value is 1.
         */
        public PickupLocationsArguments currentPage(Integer value) {
            if (value != null) {
                startArgument("currentPage");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
         * Information about products which should be delivered.
         */
        public PickupLocationsArguments productsInfo(List<ProductInfoInput> value) {
            if (value != null) {
                startArgument("productsInfo");
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (ProductInfoInput item1 : value) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        item1.appendTo(_queryBuilder);
                    }
                }
                _queryBuilder.append(']');
            }
            return this;
        }
    }

    public interface PickupLocationsArgumentsDefinition {
        void define(PickupLocationsArguments args);
    }

    /**
     * The pickup locations query searches for locations that match the search request requirements.
     */
    public QueryQuery pickupLocations(PickupLocationsQueryDefinition queryDef) {
        return pickupLocations(args -> {}, queryDef);
    }

    /**
     * The pickup locations query searches for locations that match the search request requirements.
     */
    public QueryQuery pickupLocations(PickupLocationsArgumentsDefinition argsDef, PickupLocationsQueryDefinition queryDef) {
        startField("pickupLocations");

        PickupLocationsArguments args = new PickupLocationsArguments(_queryBuilder);
        argsDef.define(args);
        PickupLocationsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new PickupLocationsQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Return the active ratings attributes and the values each rating can have.
     */
    public QueryQuery productReviewRatingsMetadata(ProductReviewRatingsMetadataQueryDefinition queryDef) {
        startField("productReviewRatingsMetadata");

        _queryBuilder.append('{');
        queryDef.define(new ProductReviewRatingsMetadataQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class ProductsArguments extends Arguments {
        ProductsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
         * One or more keywords to use in a full-text search.
         */
        public ProductsArguments search(String value) {
            if (value != null) {
                startArgument("search");
                AbstractQuery.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
         * The product attributes to search for and return.
         */
        public ProductsArguments filter(ProductAttributeFilterInput value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
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
     * Search for products that match the criteria specified in the `search` and `filter` attributes.
     */
    public QueryQuery products(ProductsQueryDefinition queryDef) {
        return products(args -> {}, queryDef);
    }

    /**
     * Search for products that match the criteria specified in the `search` and `filter` attributes.
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
     * Return the full details for a specified product, category, or CMS page.
     */
    public QueryQuery route(String url, RoutableInterfaceQueryDefinition queryDef) {
        startField("route");

        _queryBuilder.append("(url:");
        AbstractQuery.appendQuotedString(_queryBuilder, url.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new RoutableInterfaceQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Return details about the store&#39;s configuration.
     */
    public QueryQuery storeConfig(StoreConfigQueryDefinition queryDef) {
        startField("storeConfig");

        _queryBuilder.append('{');
        queryDef.define(new StoreConfigQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Return the relative URL for a specified product, category or CMS page.
     *
     * @deprecated Use the `route` query instead.
     */
    @Deprecated
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
     * Return the contents of a customer&#39;s wish list.
     *
     * @deprecated Moved under `Customer.wishlist`.
     */
    @Deprecated
    public QueryQuery wishlist(WishlistOutputQueryDefinition queryDef) {
        startField("wishlist");

        _queryBuilder.append('{');
        queryDef.define(new WishlistOutputQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public String toString() {
        if (fragments != null) {
            for (Fragment fragment : fragments.values()) {
                _queryBuilder.append(fragment.toString());
            }
        }
        return _queryBuilder.toString();
    }

    private Map<String, Fragment> fragments;

    /**
     * Adds a GraphQL "named" fragment to the query. If a fragment with the same name is already added,
     * calling this method will replace the existing fragment.
     * 
     * @param fragment The fragment to add.
     */
    public QueryQuery addFragment(Fragment fragment) {
        if (fragments == null) {
            fragments = new LinkedHashMap<>();
        }
        fragments.put(fragment.getName(), fragment);
        return this;
    }

    /**
     * The root __schema field for introspection queries.
     */
    public QueryQuery __schema(__SchemaQueryDefinition queryDef) {
        startField("__schema");

        _queryBuilder.append('{');
        queryDef.define(new __SchemaQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * The root __type field for introspection queries.
     */
    public QueryQuery __type(String name, __TypeQueryDefinition queryDef) {
        startField("__type");

        _queryBuilder.append("(name:");
        AbstractQuery.appendQuotedString(_queryBuilder, name);
        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new __TypeQuery(_queryBuilder));
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
    public static Fragment<QueryQuery> createFragment(String name, QueryQueryDefinition queryDef) {
        StringBuilder sb = new StringBuilder();
        queryDef.define(new QueryQuery(sb));
        return new Fragment<>(name, "Query", sb.toString());
    }

    /**
     * Adds a <code>QueryQuery</code> fragment reference at the current position of the query.
     * For example for a fragment named <code>test</code>, calling this method will add the
     * reference <code>...test</code> in the query. For GraphQL types implementing an interface, there
     * will be some similar methods using the Query type of each implemented interface.
     * 
     * @param fragment The fragment to reference.
     */
    public QueryQuery addFragmentReference(Fragment<QueryQuery> fragment) {
        startField("..." + fragment.getName());
        return this;
    }
}

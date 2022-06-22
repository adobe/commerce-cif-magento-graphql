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

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;

public class Query extends AbstractResponse<Query> {
    public Query() {}

    public Query(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "availableStores": {
                    List<StoreConfig> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<StoreConfig> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            StoreConfig optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new StoreConfig(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "cart": {
                    Cart optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Cart(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "categories": {
                    CategoryResult optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CategoryResult(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "category": {
                    CategoryTree optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CategoryTree(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "categoryList": {
                    List<CategoryTree> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<CategoryTree> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            CategoryTree optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new CategoryTree(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "checkoutAgreements": {
                    List<CheckoutAgreement> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<CheckoutAgreement> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            CheckoutAgreement optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new CheckoutAgreement(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "cmsBlocks": {
                    CmsBlocks optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CmsBlocks(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "cmsPage": {
                    CmsPage optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CmsPage(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "company": {
                    Company optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Company(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "compareList": {
                    CompareList optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CompareList(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "countries": {
                    List<Country> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<Country> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            Country optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new Country(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "country": {
                    Country optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Country(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "currency": {
                    Currency optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Currency(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "customAttributeMetadata": {
                    CustomAttributeMetadata optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CustomAttributeMetadata(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "customer": {
                    Customer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Customer(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "customerCart": {
                    responseData.put(key, new Cart(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "customerDownloadableProducts": {
                    CustomerDownloadableProducts optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CustomerDownloadableProducts(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "customerOrders": {
                    CustomerOrders optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CustomerOrders(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "customerPaymentTokens": {
                    CustomerPaymentTokens optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CustomerPaymentTokens(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "dynamicBlocks": {
                    responseData.put(key, new DynamicBlocks(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "getHostedProUrl": {
                    HostedProUrl optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new HostedProUrl(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "getPayflowLinkToken": {
                    PayflowLinkToken optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new PayflowLinkToken(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "giftCardAccount": {
                    GiftCardAccount optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new GiftCardAccount(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "giftRegistry": {
                    GiftRegistry optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new GiftRegistry(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "giftRegistryEmailSearch": {
                    List<GiftRegistrySearchResult> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<GiftRegistrySearchResult> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            GiftRegistrySearchResult optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new GiftRegistrySearchResult(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "giftRegistryIdSearch": {
                    List<GiftRegistrySearchResult> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<GiftRegistrySearchResult> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            GiftRegistrySearchResult optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new GiftRegistrySearchResult(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "giftRegistryTypeSearch": {
                    List<GiftRegistrySearchResult> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<GiftRegistrySearchResult> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            GiftRegistrySearchResult optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new GiftRegistrySearchResult(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "giftRegistryTypes": {
                    List<GiftRegistryType> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<GiftRegistryType> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            GiftRegistryType optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new GiftRegistryType(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "isCompanyAdminEmailAvailable": {
                    IsCompanyAdminEmailAvailableOutput optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new IsCompanyAdminEmailAvailableOutput(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "isCompanyEmailAvailable": {
                    IsCompanyEmailAvailableOutput optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new IsCompanyEmailAvailableOutput(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "isCompanyRoleNameAvailable": {
                    IsCompanyRoleNameAvailableOutput optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new IsCompanyRoleNameAvailableOutput(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "isCompanyUserEmailAvailable": {
                    IsCompanyUserEmailAvailableOutput optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new IsCompanyUserEmailAvailableOutput(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "isEmailAvailable": {
                    IsEmailAvailableOutput optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new IsEmailAvailableOutput(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "negotiableQuote": {
                    NegotiableQuote optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new NegotiableQuote(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "negotiableQuotes": {
                    NegotiableQuotesOutput optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new NegotiableQuotesOutput(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "pickupLocations": {
                    PickupLocations optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new PickupLocations(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "productReviewRatingsMetadata": {
                    responseData.put(key, new ProductReviewRatingsMetadata(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "products": {
                    Products optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Products(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "route": {
                    RoutableInterface optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = UnknownRoutableInterface.create(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "storeConfig": {
                    StoreConfig optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new StoreConfig(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "urlResolver": {
                    EntityUrl optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new EntityUrl(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "wishlist": {
                    WishlistOutput optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new WishlistOutput(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "__typename": {
                    responseData.put(key, jsonAsString(field.getValue(), key));
                    break;
                }

                case "__schema": {
                    __Schema optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new __Schema(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "__type": {
                    __Type optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new __Type(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                default: {
                    readCustomField(fieldName, field.getValue());
                }
            }
        }
    }

    public String getGraphQlTypeName() {
        return "Query";
    }

    /**
     * Get a list of available store views and their config information.
     */
    public List<StoreConfig> getAvailableStores() {
        return (List<StoreConfig>) get("availableStores");
    }

    public Query setAvailableStores(List<StoreConfig> arg) {
        optimisticData.put(getKey("availableStores"), arg);
        return this;
    }

    /**
     * Return information about the specified shopping cart.
     */
    public Cart getCart() {
        return (Cart) get("cart");
    }

    public Query setCart(Cart arg) {
        optimisticData.put(getKey("cart"), arg);
        return this;
    }

    /**
     * Return a list of categories that match the specified filter.
     */
    public CategoryResult getCategories() {
        return (CategoryResult) get("categories");
    }

    public Query setCategories(CategoryResult arg) {
        optimisticData.put(getKey("categories"), arg);
        return this;
    }

    /**
     * Search for categories that match the criteria specified in the `search` and `filter` attributes.
     *
     * @deprecated Use `categoryList` instead.
     */
    @Deprecated
    public CategoryTree getCategory() {
        return (CategoryTree) get("category");
    }

    public Query setCategory(CategoryTree arg) {
        optimisticData.put(getKey("category"), arg);
        return this;
    }

    /**
     * Return an array of categories based on the specified filters.
     */
    public List<CategoryTree> getCategoryList() {
        return (List<CategoryTree>) get("categoryList");
    }

    public Query setCategoryList(List<CategoryTree> arg) {
        optimisticData.put(getKey("categoryList"), arg);
        return this;
    }

    /**
     * Return Terms and Conditions configuration information.
     */
    public List<CheckoutAgreement> getCheckoutAgreements() {
        return (List<CheckoutAgreement>) get("checkoutAgreements");
    }

    public Query setCheckoutAgreements(List<CheckoutAgreement> arg) {
        optimisticData.put(getKey("checkoutAgreements"), arg);
        return this;
    }

    /**
     * Return information about CMS blocks.
     */
    public CmsBlocks getCmsBlocks() {
        return (CmsBlocks) get("cmsBlocks");
    }

    public Query setCmsBlocks(CmsBlocks arg) {
        optimisticData.put(getKey("cmsBlocks"), arg);
        return this;
    }

    /**
     * Return details about a CMS page.
     */
    public CmsPage getCmsPage() {
        return (CmsPage) get("cmsPage");
    }

    public Query setCmsPage(CmsPage arg) {
        optimisticData.put(getKey("cmsPage"), arg);
        return this;
    }

    /**
     * Return detailed information about the authenticated customer&#39;s company.
     */
    public Company getCompany() {
        return (Company) get("company");
    }

    public Query setCompany(Company arg) {
        optimisticData.put(getKey("company"), arg);
        return this;
    }

    /**
     * Return products that have been added to the specified compare list.
     */
    public CompareList getCompareList() {
        return (CompareList) get("compareList");
    }

    public Query setCompareList(CompareList arg) {
        optimisticData.put(getKey("compareList"), arg);
        return this;
    }

    /**
     * The countries query provides information for all countries.
     */
    public List<Country> getCountries() {
        return (List<Country>) get("countries");
    }

    public Query setCountries(List<Country> arg) {
        optimisticData.put(getKey("countries"), arg);
        return this;
    }

    /**
     * The countries query provides information for a single country.
     */
    public Country getCountry() {
        return (Country) get("country");
    }

    public Query setCountry(Country arg) {
        optimisticData.put(getKey("country"), arg);
        return this;
    }

    /**
     * Return information about the store&#39;s currency.
     */
    public Currency getCurrency() {
        return (Currency) get("currency");
    }

    public Query setCurrency(Currency arg) {
        optimisticData.put(getKey("currency"), arg);
        return this;
    }

    /**
     * Return the attribute type, given an attribute code and entity type.
     */
    public CustomAttributeMetadata getCustomAttributeMetadata() {
        return (CustomAttributeMetadata) get("customAttributeMetadata");
    }

    public Query setCustomAttributeMetadata(CustomAttributeMetadata arg) {
        optimisticData.put(getKey("customAttributeMetadata"), arg);
        return this;
    }

    /**
     * Return detailed information about a customer account.
     */
    public Customer getCustomer() {
        return (Customer) get("customer");
    }

    public Query setCustomer(Customer arg) {
        optimisticData.put(getKey("customer"), arg);
        return this;
    }

    /**
     * Return information about the customer&#39;s shopping cart.
     */
    public Cart getCustomerCart() {
        return (Cart) get("customerCart");
    }

    public Query setCustomerCart(Cart arg) {
        optimisticData.put(getKey("customerCart"), arg);
        return this;
    }

    /**
     * Return a list of downloadable products the customer has purchased.
     */
    public CustomerDownloadableProducts getCustomerDownloadableProducts() {
        return (CustomerDownloadableProducts) get("customerDownloadableProducts");
    }

    public Query setCustomerDownloadableProducts(CustomerDownloadableProducts arg) {
        optimisticData.put(getKey("customerDownloadableProducts"), arg);
        return this;
    }

    /**
     * @deprecated Use the `customer` query instead.
     */
    @Deprecated
    public CustomerOrders getCustomerOrders() {
        return (CustomerOrders) get("customerOrders");
    }

    public Query setCustomerOrders(CustomerOrders arg) {
        optimisticData.put(getKey("customerOrders"), arg);
        return this;
    }

    /**
     * Return a list of customer payment tokens stored in the vault.
     */
    public CustomerPaymentTokens getCustomerPaymentTokens() {
        return (CustomerPaymentTokens) get("customerPaymentTokens");
    }

    public Query setCustomerPaymentTokens(CustomerPaymentTokens arg) {
        optimisticData.put(getKey("customerPaymentTokens"), arg);
        return this;
    }

    /**
     * Return a list of dynamic blocks filtered by type, location, or UIDs.
     */
    public DynamicBlocks getDynamicBlocks() {
        return (DynamicBlocks) get("dynamicBlocks");
    }

    public Query setDynamicBlocks(DynamicBlocks arg) {
        optimisticData.put(getKey("dynamicBlocks"), arg);
        return this;
    }

    /**
     * Retrieve the secure PayPal URL for a Payments Pro Hosted Solution transaction.
     */
    public HostedProUrl getGetHostedProUrl() {
        return (HostedProUrl) get("getHostedProUrl");
    }

    public Query setGetHostedProUrl(HostedProUrl arg) {
        optimisticData.put(getKey("getHostedProUrl"), arg);
        return this;
    }

    /**
     * Retrieve payment credentials for a transaction. Use this query for Payflow Link and Payments
     * Advanced payment methods.
     */
    public PayflowLinkToken getGetPayflowLinkToken() {
        return (PayflowLinkToken) get("getPayflowLinkToken");
    }

    public Query setGetPayflowLinkToken(PayflowLinkToken arg) {
        optimisticData.put(getKey("getPayflowLinkToken"), arg);
        return this;
    }

    /**
     * Return details about a specific gift card.
     */
    public GiftCardAccount getGiftCardAccount() {
        return (GiftCardAccount) get("giftCardAccount");
    }

    public Query setGiftCardAccount(GiftCardAccount arg) {
        optimisticData.put(getKey("giftCardAccount"), arg);
        return this;
    }

    /**
     * Return the specified gift registry. Some details will not be available to guests.
     */
    public GiftRegistry getGiftRegistry() {
        return (GiftRegistry) get("giftRegistry");
    }

    public Query setGiftRegistry(GiftRegistry arg) {
        optimisticData.put(getKey("giftRegistry"), arg);
        return this;
    }

    /**
     * Search for gift registries by specifying a registrant email address.
     */
    public List<GiftRegistrySearchResult> getGiftRegistryEmailSearch() {
        return (List<GiftRegistrySearchResult>) get("giftRegistryEmailSearch");
    }

    public Query setGiftRegistryEmailSearch(List<GiftRegistrySearchResult> arg) {
        optimisticData.put(getKey("giftRegistryEmailSearch"), arg);
        return this;
    }

    /**
     * Search for gift registries by specifying a registry URL key.
     */
    public List<GiftRegistrySearchResult> getGiftRegistryIdSearch() {
        return (List<GiftRegistrySearchResult>) get("giftRegistryIdSearch");
    }

    public Query setGiftRegistryIdSearch(List<GiftRegistrySearchResult> arg) {
        optimisticData.put(getKey("giftRegistryIdSearch"), arg);
        return this;
    }

    /**
     * Search for gift registries by specifying the registrant name and registry type ID.
     */
    public List<GiftRegistrySearchResult> getGiftRegistryTypeSearch() {
        return (List<GiftRegistrySearchResult>) get("giftRegistryTypeSearch");
    }

    public Query setGiftRegistryTypeSearch(List<GiftRegistrySearchResult> arg) {
        optimisticData.put(getKey("giftRegistryTypeSearch"), arg);
        return this;
    }

    /**
     * Get a list of available gift registry types.
     */
    public List<GiftRegistryType> getGiftRegistryTypes() {
        return (List<GiftRegistryType>) get("giftRegistryTypes");
    }

    public Query setGiftRegistryTypes(List<GiftRegistryType> arg) {
        optimisticData.put(getKey("giftRegistryTypes"), arg);
        return this;
    }

    /**
     * Check whether the specified email can be used to register a company admin.
     */
    public IsCompanyAdminEmailAvailableOutput getIsCompanyAdminEmailAvailable() {
        return (IsCompanyAdminEmailAvailableOutput) get("isCompanyAdminEmailAvailable");
    }

    public Query setIsCompanyAdminEmailAvailable(IsCompanyAdminEmailAvailableOutput arg) {
        optimisticData.put(getKey("isCompanyAdminEmailAvailable"), arg);
        return this;
    }

    /**
     * Check whether the specified email can be used to register a new company.
     */
    public IsCompanyEmailAvailableOutput getIsCompanyEmailAvailable() {
        return (IsCompanyEmailAvailableOutput) get("isCompanyEmailAvailable");
    }

    public Query setIsCompanyEmailAvailable(IsCompanyEmailAvailableOutput arg) {
        optimisticData.put(getKey("isCompanyEmailAvailable"), arg);
        return this;
    }

    /**
     * Check whether the specified role name is valid for the company.
     */
    public IsCompanyRoleNameAvailableOutput getIsCompanyRoleNameAvailable() {
        return (IsCompanyRoleNameAvailableOutput) get("isCompanyRoleNameAvailable");
    }

    public Query setIsCompanyRoleNameAvailable(IsCompanyRoleNameAvailableOutput arg) {
        optimisticData.put(getKey("isCompanyRoleNameAvailable"), arg);
        return this;
    }

    /**
     * Check whether the specified email can be used to register a company user.
     */
    public IsCompanyUserEmailAvailableOutput getIsCompanyUserEmailAvailable() {
        return (IsCompanyUserEmailAvailableOutput) get("isCompanyUserEmailAvailable");
    }

    public Query setIsCompanyUserEmailAvailable(IsCompanyUserEmailAvailableOutput arg) {
        optimisticData.put(getKey("isCompanyUserEmailAvailable"), arg);
        return this;
    }

    /**
     * Check whether the specified email has already been used to create a customer account.
     */
    public IsEmailAvailableOutput getIsEmailAvailable() {
        return (IsEmailAvailableOutput) get("isEmailAvailable");
    }

    public Query setIsEmailAvailable(IsEmailAvailableOutput arg) {
        optimisticData.put(getKey("isEmailAvailable"), arg);
        return this;
    }

    /**
     * Retrieve the specified negotiable quote.
     */
    public NegotiableQuote getNegotiableQuote() {
        return (NegotiableQuote) get("negotiableQuote");
    }

    public Query setNegotiableQuote(NegotiableQuote arg) {
        optimisticData.put(getKey("negotiableQuote"), arg);
        return this;
    }

    /**
     * Return a list of negotiable quotes that can be viewed by the logged-in customer.
     */
    public NegotiableQuotesOutput getNegotiableQuotes() {
        return (NegotiableQuotesOutput) get("negotiableQuotes");
    }

    public Query setNegotiableQuotes(NegotiableQuotesOutput arg) {
        optimisticData.put(getKey("negotiableQuotes"), arg);
        return this;
    }

    /**
     * The pickup locations query searches for locations that match the search request requirements.
     */
    public PickupLocations getPickupLocations() {
        return (PickupLocations) get("pickupLocations");
    }

    public Query setPickupLocations(PickupLocations arg) {
        optimisticData.put(getKey("pickupLocations"), arg);
        return this;
    }

    /**
     * Return the active ratings attributes and the values each rating can have.
     */
    public ProductReviewRatingsMetadata getProductReviewRatingsMetadata() {
        return (ProductReviewRatingsMetadata) get("productReviewRatingsMetadata");
    }

    public Query setProductReviewRatingsMetadata(ProductReviewRatingsMetadata arg) {
        optimisticData.put(getKey("productReviewRatingsMetadata"), arg);
        return this;
    }

    /**
     * Search for products that match the criteria specified in the `search` and `filter` attributes.
     */
    public Products getProducts() {
        return (Products) get("products");
    }

    public Query setProducts(Products arg) {
        optimisticData.put(getKey("products"), arg);
        return this;
    }

    /**
     * Return the full details for a specified product, category, or CMS page.
     */
    public RoutableInterface getRoute() {
        return (RoutableInterface) get("route");
    }

    public Query setRoute(RoutableInterface arg) {
        optimisticData.put(getKey("route"), arg);
        return this;
    }

    /**
     * Return details about the store&#39;s configuration.
     */
    public StoreConfig getStoreConfig() {
        return (StoreConfig) get("storeConfig");
    }

    public Query setStoreConfig(StoreConfig arg) {
        optimisticData.put(getKey("storeConfig"), arg);
        return this;
    }

    /**
     * Return the relative URL for a specified product, category or CMS page.
     *
     * @deprecated Use the `route` query instead.
     */
    @Deprecated
    public EntityUrl getUrlResolver() {
        return (EntityUrl) get("urlResolver");
    }

    public Query setUrlResolver(EntityUrl arg) {
        optimisticData.put(getKey("urlResolver"), arg);
        return this;
    }

    /**
     * Return the contents of a customer&#39;s wish list.
     *
     * @deprecated Moved under `Customer.wishlist`.
     */
    @Deprecated
    public WishlistOutput getWishlist() {
        return (WishlistOutput) get("wishlist");
    }

    public Query setWishlist(WishlistOutput arg) {
        optimisticData.put(getKey("wishlist"), arg);
        return this;
    }

    /**
     * The root __schema field for introspection queries.
     */
    public __Schema __getSchema() {
        return (__Schema) get("__schema");
    }

    /**
     * The root __type field for introspection queries.
     */
    public __Type __getType() {
        return (__Type) get("__type");
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "availableStores":
                return true;

            case "cart":
                return true;

            case "categories":
                return true;

            case "category":
                return true;

            case "categoryList":
                return true;

            case "checkoutAgreements":
                return true;

            case "cmsBlocks":
                return true;

            case "cmsPage":
                return true;

            case "company":
                return true;

            case "compareList":
                return true;

            case "countries":
                return true;

            case "country":
                return true;

            case "currency":
                return true;

            case "customAttributeMetadata":
                return true;

            case "customer":
                return true;

            case "customerCart":
                return true;

            case "customerDownloadableProducts":
                return true;

            case "customerOrders":
                return true;

            case "customerPaymentTokens":
                return true;

            case "dynamicBlocks":
                return true;

            case "getHostedProUrl":
                return true;

            case "getPayflowLinkToken":
                return true;

            case "giftCardAccount":
                return true;

            case "giftRegistry":
                return true;

            case "giftRegistryEmailSearch":
                return true;

            case "giftRegistryIdSearch":
                return true;

            case "giftRegistryTypeSearch":
                return true;

            case "giftRegistryTypes":
                return true;

            case "isCompanyAdminEmailAvailable":
                return true;

            case "isCompanyEmailAvailable":
                return true;

            case "isCompanyRoleNameAvailable":
                return true;

            case "isCompanyUserEmailAvailable":
                return true;

            case "isEmailAvailable":
                return true;

            case "negotiableQuote":
                return true;

            case "negotiableQuotes":
                return true;

            case "pickupLocations":
                return true;

            case "productReviewRatingsMetadata":
                return true;

            case "products":
                return true;

            case "route":
                return false;

            case "storeConfig":
                return true;

            case "urlResolver":
                return true;

            case "wishlist":
                return true;

            default:
                return false;
        }
    }
}

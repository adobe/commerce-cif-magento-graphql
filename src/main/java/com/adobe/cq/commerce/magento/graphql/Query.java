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
    public Query() {
    }

    public Query(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "cart": {
                    Cart optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Cart(jsonAsObject(field.getValue(), key));
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

                case "isEmailAvailable": {
                    IsEmailAvailableOutput optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new IsEmailAvailableOutput(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

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
     * Returns information about shopping cart
     */
    public Cart getCart() {
        return (Cart) get("cart");
    }

    public Query setCart(Cart arg) {
        optimisticData.put(getKey("cart"), arg);
        return this;
    }

    /**
     * The category query searches for categories that match the criteria specified in the search and
     * filter attributes.
     *
     * @deprecated Use &#39;categoryList&#39; query instead of &#39;category&#39; query
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
     * Returns an array of categories based on the specified filters.
     */
    public List<CategoryTree> getCategoryList() {
        return (List<CategoryTree>) get("categoryList");
    }

    public Query setCategoryList(List<CategoryTree> arg) {
        optimisticData.put(getKey("categoryList"), arg);
        return this;
    }

    /**
     * The Checkout Agreements information
     */
    public List<CheckoutAgreement> getCheckoutAgreements() {
        return (List<CheckoutAgreement>) get("checkoutAgreements");
    }

    public Query setCheckoutAgreements(List<CheckoutAgreement> arg) {
        optimisticData.put(getKey("checkoutAgreements"), arg);
        return this;
    }

    /**
     * The CMS block query returns information about CMS blocks
     */
    public CmsBlocks getCmsBlocks() {
        return (CmsBlocks) get("cmsBlocks");
    }

    public Query setCmsBlocks(CmsBlocks arg) {
        optimisticData.put(getKey("cmsBlocks"), arg);
        return this;
    }

    /**
     * The CMS page query returns information about a CMS page
     */
    public CmsPage getCmsPage() {
        return (CmsPage) get("cmsPage");
    }

    public Query setCmsPage(CmsPage arg) {
        optimisticData.put(getKey("cmsPage"), arg);
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
     * The currency query returns information about store currency.
     */
    public Currency getCurrency() {
        return (Currency) get("currency");
    }

    public Query setCurrency(Currency arg) {
        optimisticData.put(getKey("currency"), arg);
        return this;
    }

    /**
     * The customAttributeMetadata query returns the attribute type, given an attribute code and entity
     * type
     */
    public CustomAttributeMetadata getCustomAttributeMetadata() {
        return (CustomAttributeMetadata) get("customAttributeMetadata");
    }

    public Query setCustomAttributeMetadata(CustomAttributeMetadata arg) {
        optimisticData.put(getKey("customAttributeMetadata"), arg);
        return this;
    }

    /**
     * The customer query returns information about a customer account
     */
    public Customer getCustomer() {
        return (Customer) get("customer");
    }

    public Query setCustomer(Customer arg) {
        optimisticData.put(getKey("customer"), arg);
        return this;
    }

    /**
     * Returns information about the customer shopping cart
     */
    public Cart getCustomerCart() {
        return (Cart) get("customerCart");
    }

    public Query setCustomerCart(Cart arg) {
        optimisticData.put(getKey("customerCart"), arg);
        return this;
    }

    /**
     * The query returns the contents of a customer&#39;s downloadable products
     */
    public CustomerDownloadableProducts getCustomerDownloadableProducts() {
        return (CustomerDownloadableProducts) get("customerDownloadableProducts");
    }

    public Query setCustomerDownloadableProducts(CustomerDownloadableProducts arg) {
        optimisticData.put(getKey("customerDownloadableProducts"), arg);
        return this;
    }

    /**
     * List of customer orders
     */
    public CustomerOrders getCustomerOrders() {
        return (CustomerOrders) get("customerOrders");
    }

    public Query setCustomerOrders(CustomerOrders arg) {
        optimisticData.put(getKey("customerOrders"), arg);
        return this;
    }

    /**
     * Return a list of customer payment tokens
     */
    public CustomerPaymentTokens getCustomerPaymentTokens() {
        return (CustomerPaymentTokens) get("customerPaymentTokens");
    }

    public Query setCustomerPaymentTokens(CustomerPaymentTokens arg) {
        optimisticData.put(getKey("customerPaymentTokens"), arg);
        return this;
    }

    /**
     * Retrieve secure PayPal url for Payments Pro Hosted Solution transaction.
     */
    public HostedProUrl getGetHostedProUrl() {
        return (HostedProUrl) get("getHostedProUrl");
    }

    public Query setGetHostedProUrl(HostedProUrl arg) {
        optimisticData.put(getKey("getHostedProUrl"), arg);
        return this;
    }

    /**
     * Retrieve payment credentials for transaction. Use this query for Payflow Link and Payments Advanced
     * payment methods.
     */
    public PayflowLinkToken getGetPayflowLinkToken() {
        return (PayflowLinkToken) get("getPayflowLinkToken");
    }

    public Query setGetPayflowLinkToken(PayflowLinkToken arg) {
        optimisticData.put(getKey("getPayflowLinkToken"), arg);
        return this;
    }

    public IsEmailAvailableOutput getIsEmailAvailable() {
        return (IsEmailAvailableOutput) get("isEmailAvailable");
    }

    public Query setIsEmailAvailable(IsEmailAvailableOutput arg) {
        optimisticData.put(getKey("isEmailAvailable"), arg);
        return this;
    }

    /**
     * The products query searches for products that match the criteria specified in the search and filter
     * attributes.
     */
    public Products getProducts() {
        return (Products) get("products");
    }

    public Query setProducts(Products arg) {
        optimisticData.put(getKey("products"), arg);
        return this;
    }

    /**
     * The store config query
     */
    public StoreConfig getStoreConfig() {
        return (StoreConfig) get("storeConfig");
    }

    public Query setStoreConfig(StoreConfig arg) {
        optimisticData.put(getKey("storeConfig"), arg);
        return this;
    }

    /**
     * The urlResolver query returns the relative URL for a specified product, category or CMS page, using
     * as input a url_key appended by the url_suffix, if one exists
     */
    public EntityUrl getUrlResolver() {
        return (EntityUrl) get("urlResolver");
    }

    public Query setUrlResolver(EntityUrl arg) {
        optimisticData.put(getKey("urlResolver"), arg);
        return this;
    }

    /**
     * The wishlist query returns the contents of a customer&#39;s wish list
     *
     * @deprecated Moved under `Customer` `wishlist`
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
            case "cart": return true;

            case "category": return true;

            case "categoryList": return true;

            case "checkoutAgreements": return true;

            case "cmsBlocks": return true;

            case "cmsPage": return true;

            case "countries": return true;

            case "country": return true;

            case "currency": return true;

            case "customAttributeMetadata": return true;

            case "customer": return true;

            case "customerCart": return true;

            case "customerDownloadableProducts": return true;

            case "customerOrders": return true;

            case "customerPaymentTokens": return true;

            case "getHostedProUrl": return true;

            case "getPayflowLinkToken": return true;

            case "isEmailAvailable": return true;

            case "products": return true;

            case "storeConfig": return true;

            case "urlResolver": return true;

            case "wishlist": return true;

            default: return false;
        }
    }
}


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

/**
 * Defines the customer name, addresses, and other details.
 */
public class Customer extends AbstractResponse<Customer> implements CompanyStructureEntity {
    public Customer() {}

    public Customer(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "addresses": {
                    List<CustomerAddress> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<CustomerAddress> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            CustomerAddress optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new CustomerAddress(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "allow_remote_shopping_assistance": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "compare_list": {
                    CompareList optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CompareList(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "created_at": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "date_of_birth": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "default_billing": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "default_shipping": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "dob": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "email": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "firstname": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "gender": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "gift_registries": {
                    List<GiftRegistry> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<GiftRegistry> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            GiftRegistry optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new GiftRegistry(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "gift_registry": {
                    GiftRegistry optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new GiftRegistry(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "group_id": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "id": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "is_subscribed": {
                    Boolean optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsBoolean(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "job_title": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "lastname": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "middlename": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "orders": {
                    CustomerOrders optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CustomerOrders(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "prefix": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "requisition_lists": {
                    RequisitionLists optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new RequisitionLists(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "return": {
                    Return optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Return(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "returns": {
                    Returns optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Returns(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "reviews": {
                    responseData.put(key, new ProductReviews(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "reward_points": {
                    RewardPoints optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new RewardPoints(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "role": {
                    CompanyRole optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CompanyRole(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "status": {
                    CompanyUserStatusEnum optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = CompanyUserStatusEnum.fromGraphQl(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "store_credit": {
                    CustomerStoreCredit optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CustomerStoreCredit(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "suffix": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "taxvat": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "team": {
                    CompanyTeam optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CompanyTeam(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "telephone": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "wishlist": {
                    responseData.put(key, new Wishlist(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "wishlist_v2": {
                    Wishlist optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Wishlist(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "wishlists": {
                    List<Wishlist> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        Wishlist optional2 = null;
                        if (!element1.isJsonNull()) {
                            optional2 = new Wishlist(jsonAsObject(element1, key));
                        }

                        list1.add(optional2);
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "__typename": {
                    responseData.put(key, jsonAsString(field.getValue(), key));
                    break;
                }

                default: {
                    readCustomField(fieldName, field.getValue());
                }
            }
        }
    }

    public String getGraphQlTypeName() {
        return "Customer";
    }

    /**
     * An array containing the customer&#39;s shipping and billing addresses.
     */
    public List<CustomerAddress> getAddresses() {
        return (List<CustomerAddress>) get("addresses");
    }

    public Customer setAddresses(List<CustomerAddress> arg) {
        optimisticData.put(getKey("addresses"), arg);
        return this;
    }

    /**
     * Indicates whether the customer has enabled remote shopping assistance.
     */
    public Boolean getAllowRemoteShoppingAssistance() {
        return (Boolean) get("allow_remote_shopping_assistance");
    }

    public Customer setAllowRemoteShoppingAssistance(Boolean arg) {
        optimisticData.put(getKey("allow_remote_shopping_assistance"), arg);
        return this;
    }

    /**
     * The contents of the customer&#39;s compare list.
     */
    public CompareList getCompareList() {
        return (CompareList) get("compare_list");
    }

    public Customer setCompareList(CompareList arg) {
        optimisticData.put(getKey("compare_list"), arg);
        return this;
    }

    /**
     * Timestamp indicating when the account was created.
     */
    public String getCreatedAt() {
        return (String) get("created_at");
    }

    public Customer setCreatedAt(String arg) {
        optimisticData.put(getKey("created_at"), arg);
        return this;
    }

    /**
     * The customer&#39;s date of birth.
     */
    public String getDateOfBirth() {
        return (String) get("date_of_birth");
    }

    public Customer setDateOfBirth(String arg) {
        optimisticData.put(getKey("date_of_birth"), arg);
        return this;
    }

    /**
     * The ID assigned to the billing address.
     */
    public String getDefaultBilling() {
        return (String) get("default_billing");
    }

    public Customer setDefaultBilling(String arg) {
        optimisticData.put(getKey("default_billing"), arg);
        return this;
    }

    /**
     * The ID assigned to the shipping address.
     */
    public String getDefaultShipping() {
        return (String) get("default_shipping");
    }

    public Customer setDefaultShipping(String arg) {
        optimisticData.put(getKey("default_shipping"), arg);
        return this;
    }

    /**
     * The customer&#39;s date of birth.
     *
     * @deprecated Use `date_of_birth` instead.
     */
    @Deprecated
    public String getDob() {
        return (String) get("dob");
    }

    public Customer setDob(String arg) {
        optimisticData.put(getKey("dob"), arg);
        return this;
    }

    /**
     * The customer&#39;s email address. Required.
     */
    public String getEmail() {
        return (String) get("email");
    }

    public Customer setEmail(String arg) {
        optimisticData.put(getKey("email"), arg);
        return this;
    }

    /**
     * The customer&#39;s first name.
     */
    public String getFirstname() {
        return (String) get("firstname");
    }

    public Customer setFirstname(String arg) {
        optimisticData.put(getKey("firstname"), arg);
        return this;
    }

    /**
     * The customer&#39;s gender (Male - 1, Female - 2).
     */
    public Integer getGender() {
        return (Integer) get("gender");
    }

    public Customer setGender(Integer arg) {
        optimisticData.put(getKey("gender"), arg);
        return this;
    }

    /**
     * Details about all of the customer&#39;s gift registries.
     */
    public List<GiftRegistry> getGiftRegistries() {
        return (List<GiftRegistry>) get("gift_registries");
    }

    public Customer setGiftRegistries(List<GiftRegistry> arg) {
        optimisticData.put(getKey("gift_registries"), arg);
        return this;
    }

    /**
     * Details about a specific gift registry.
     */
    public GiftRegistry getGiftRegistry() {
        return (GiftRegistry) get("gift_registry");
    }

    public Customer setGiftRegistry(GiftRegistry arg) {
        optimisticData.put(getKey("gift_registry"), arg);
        return this;
    }

    /**
     * @deprecated Customer group should not be exposed in the storefront scenarios.
     */
    @Deprecated
    public Integer getGroupId() {
        return (Integer) get("group_id");
    }

    public Customer setGroupId(Integer arg) {
        optimisticData.put(getKey("group_id"), arg);
        return this;
    }

    /**
     * The ID assigned to the customer.
     *
     * @deprecated `id` is not needed as part of `Customer`, because on the server side, it can be identified based on the customer token
     *             used for authentication. There is no need to know customer ID on the client side.
     */
    @Deprecated
    public Integer getId() {
        return (Integer) get("id");
    }

    public Customer setId(Integer arg) {
        optimisticData.put(getKey("id"), arg);
        return this;
    }

    /**
     * Indicates whether the customer is subscribed to the company&#39;s newsletter.
     */
    public Boolean getIsSubscribed() {
        return (Boolean) get("is_subscribed");
    }

    public Customer setIsSubscribed(Boolean arg) {
        optimisticData.put(getKey("is_subscribed"), arg);
        return this;
    }

    /**
     * The job title of a company user.
     */
    public String getJobTitle() {
        return (String) get("job_title");
    }

    public Customer setJobTitle(String arg) {
        optimisticData.put(getKey("job_title"), arg);
        return this;
    }

    /**
     * The customer&#39;s family name.
     */
    public String getLastname() {
        return (String) get("lastname");
    }

    public Customer setLastname(String arg) {
        optimisticData.put(getKey("lastname"), arg);
        return this;
    }

    /**
     * The customer&#39;s middle name.
     */
    public String getMiddlename() {
        return (String) get("middlename");
    }

    public Customer setMiddlename(String arg) {
        optimisticData.put(getKey("middlename"), arg);
        return this;
    }

    public CustomerOrders getOrders() {
        return (CustomerOrders) get("orders");
    }

    public Customer setOrders(CustomerOrders arg) {
        optimisticData.put(getKey("orders"), arg);
        return this;
    }

    /**
     * An honorific, such as Dr., Mr., or Mrs.
     */
    public String getPrefix() {
        return (String) get("prefix");
    }

    public Customer setPrefix(String arg) {
        optimisticData.put(getKey("prefix"), arg);
        return this;
    }

    /**
     * An object that contains the customer&#39;s requisition lists.
     */
    public RequisitionLists getRequisitionLists() {
        return (RequisitionLists) get("requisition_lists");
    }

    public Customer setRequisitionLists(RequisitionLists arg) {
        optimisticData.put(getKey("requisition_lists"), arg);
        return this;
    }

    /**
     * Details about the specified return request from the unique ID for a `Return` object.
     */
    public Return getReturn() {
        return (Return) get("return");
    }

    public Customer setReturn(Return arg) {
        optimisticData.put(getKey("return"), arg);
        return this;
    }

    /**
     * Information about the customer&#39;s return requests.
     */
    public Returns getReturns() {
        return (Returns) get("returns");
    }

    public Customer setReturns(Returns arg) {
        optimisticData.put(getKey("returns"), arg);
        return this;
    }

    /**
     * Contains the customer&#39;s product reviews.
     */
    public ProductReviews getReviews() {
        return (ProductReviews) get("reviews");
    }

    public Customer setReviews(ProductReviews arg) {
        optimisticData.put(getKey("reviews"), arg);
        return this;
    }

    /**
     * Customer reward points details.
     */
    public RewardPoints getRewardPoints() {
        return (RewardPoints) get("reward_points");
    }

    public Customer setRewardPoints(RewardPoints arg) {
        optimisticData.put(getKey("reward_points"), arg);
        return this;
    }

    /**
     * The role name and permissions assigned to the company user.
     */
    public CompanyRole getRole() {
        return (CompanyRole) get("role");
    }

    public Customer setRole(CompanyRole arg) {
        optimisticData.put(getKey("role"), arg);
        return this;
    }

    /**
     * Indicates whether the company user is ACTIVE or INACTIVE.
     */
    public CompanyUserStatusEnum getStatus() {
        return (CompanyUserStatusEnum) get("status");
    }

    public Customer setStatus(CompanyUserStatusEnum arg) {
        optimisticData.put(getKey("status"), arg);
        return this;
    }

    /**
     * Store credit information applied for the logged in customer.
     */
    public CustomerStoreCredit getStoreCredit() {
        return (CustomerStoreCredit) get("store_credit");
    }

    public Customer setStoreCredit(CustomerStoreCredit arg) {
        optimisticData.put(getKey("store_credit"), arg);
        return this;
    }

    /**
     * A value such as Sr., Jr., or III.
     */
    public String getSuffix() {
        return (String) get("suffix");
    }

    public Customer setSuffix(String arg) {
        optimisticData.put(getKey("suffix"), arg);
        return this;
    }

    /**
     * The customer&#39;s Value-added tax (VAT) number (for corporate customers).
     */
    public String getTaxvat() {
        return (String) get("taxvat");
    }

    public Customer setTaxvat(String arg) {
        optimisticData.put(getKey("taxvat"), arg);
        return this;
    }

    /**
     * The team the company user is assigned to.
     */
    public CompanyTeam getTeam() {
        return (CompanyTeam) get("team");
    }

    public Customer setTeam(CompanyTeam arg) {
        optimisticData.put(getKey("team"), arg);
        return this;
    }

    /**
     * The phone number of the company user.
     */
    public String getTelephone() {
        return (String) get("telephone");
    }

    public Customer setTelephone(String arg) {
        optimisticData.put(getKey("telephone"), arg);
        return this;
    }

    /**
     * Return a customer&#39;s wish lists.
     *
     * @deprecated Use `Customer.wishlists` or `Customer.wishlist_v2` instead.
     */
    @Deprecated
    public Wishlist getWishlist() {
        return (Wishlist) get("wishlist");
    }

    public Customer setWishlist(Wishlist arg) {
        optimisticData.put(getKey("wishlist"), arg);
        return this;
    }

    /**
     * Retrieve the wish list identified by the unique ID for a `Wishlist` object.
     */
    public Wishlist getWishlistV2() {
        return (Wishlist) get("wishlist_v2");
    }

    public Customer setWishlistV2(Wishlist arg) {
        optimisticData.put(getKey("wishlist_v2"), arg);
        return this;
    }

    /**
     * An array of wishlists. In Magento Open Source, customers are limited to one wish list. The number of
     * wish lists is configurable for Adobe Commerce.
     */
    public List<Wishlist> getWishlists() {
        return (List<Wishlist>) get("wishlists");
    }

    public Customer setWishlists(List<Wishlist> arg) {
        optimisticData.put(getKey("wishlists"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "addresses":
                return true;

            case "allow_remote_shopping_assistance":
                return false;

            case "compare_list":
                return true;

            case "created_at":
                return false;

            case "date_of_birth":
                return false;

            case "default_billing":
                return false;

            case "default_shipping":
                return false;

            case "dob":
                return false;

            case "email":
                return false;

            case "firstname":
                return false;

            case "gender":
                return false;

            case "gift_registries":
                return true;

            case "gift_registry":
                return true;

            case "group_id":
                return false;

            case "id":
                return false;

            case "is_subscribed":
                return false;

            case "job_title":
                return false;

            case "lastname":
                return false;

            case "middlename":
                return false;

            case "orders":
                return true;

            case "prefix":
                return false;

            case "requisition_lists":
                return true;

            case "return":
                return true;

            case "returns":
                return true;

            case "reviews":
                return true;

            case "reward_points":
                return true;

            case "role":
                return true;

            case "status":
                return false;

            case "store_credit":
                return true;

            case "suffix":
                return false;

            case "taxvat":
                return false;

            case "team":
                return true;

            case "telephone":
                return false;

            case "wishlist":
                return true;

            case "wishlist_v2":
                return true;

            case "wishlists":
                return true;

            default:
                return false;
        }
    }
}

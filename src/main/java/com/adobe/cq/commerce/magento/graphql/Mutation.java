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

import java.util.Map;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;

public class Mutation extends AbstractResponse<Mutation> {
    public Mutation() {}

    public Mutation(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "addBundleProductsToCart": {
                    AddBundleProductsToCartOutput optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new AddBundleProductsToCartOutput(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "addConfigurableProductsToCart": {
                    AddConfigurableProductsToCartOutput optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new AddConfigurableProductsToCartOutput(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "addDownloadableProductsToCart": {
                    AddDownloadableProductsToCartOutput optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new AddDownloadableProductsToCartOutput(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "addGiftRegistryRegistrants": {
                    AddGiftRegistryRegistrantsOutput optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new AddGiftRegistryRegistrantsOutput(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "addProductsToCart": {
                    AddProductsToCartOutput optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new AddProductsToCartOutput(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "addProductsToCompareList": {
                    CompareList optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CompareList(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "addProductsToRequisitionList": {
                    AddProductsToRequisitionListOutput optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new AddProductsToRequisitionListOutput(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "addProductsToWishlist": {
                    AddProductsToWishlistOutput optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new AddProductsToWishlistOutput(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "addRequisitionListItemsToCart": {
                    AddRequisitionListItemsToCartOutput optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new AddRequisitionListItemsToCartOutput(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "addReturnComment": {
                    AddReturnCommentOutput optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new AddReturnCommentOutput(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "addReturnTracking": {
                    AddReturnTrackingOutput optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new AddReturnTrackingOutput(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "addSimpleProductsToCart": {
                    AddSimpleProductsToCartOutput optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new AddSimpleProductsToCartOutput(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "addVirtualProductsToCart": {
                    AddVirtualProductsToCartOutput optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new AddVirtualProductsToCartOutput(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "addWishlistItemsToCart": {
                    AddWishlistItemsToCartOutput optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new AddWishlistItemsToCartOutput(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "applyCouponToCart": {
                    ApplyCouponToCartOutput optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ApplyCouponToCartOutput(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "applyGiftCardToCart": {
                    ApplyGiftCardToCartOutput optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ApplyGiftCardToCartOutput(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "applyRewardPointsToCart": {
                    ApplyRewardPointsToCartOutput optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ApplyRewardPointsToCartOutput(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "applyStoreCreditToCart": {
                    ApplyStoreCreditToCartOutput optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ApplyStoreCreditToCartOutput(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "assignCompareListToCustomer": {
                    AssignCompareListToCustomerOutput optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new AssignCompareListToCustomerOutput(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "assignCustomerToGuestCart": {
                    responseData.put(key, new Cart(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "changeCustomerPassword": {
                    Customer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Customer(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "clearCustomerCart": {
                    ClearCustomerCartOutput optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ClearCustomerCartOutput(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "closeNegotiableQuotes": {
                    CloseNegotiableQuotesOutput optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CloseNegotiableQuotesOutput(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "copyItemsBetweenRequisitionLists": {
                    CopyItemsFromRequisitionListsOutput optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CopyItemsFromRequisitionListsOutput(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "copyProductsBetweenWishlists": {
                    CopyProductsBetweenWishlistsOutput optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CopyProductsBetweenWishlistsOutput(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "createBraintreeClientToken": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "createCompany": {
                    CreateCompanyOutput optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CreateCompanyOutput(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "createCompanyRole": {
                    CreateCompanyRoleOutput optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CreateCompanyRoleOutput(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "createCompanyTeam": {
                    CreateCompanyTeamOutput optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CreateCompanyTeamOutput(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "createCompanyUser": {
                    CreateCompanyUserOutput optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CreateCompanyUserOutput(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "createCompareList": {
                    CompareList optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CompareList(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "createCustomer": {
                    CustomerOutput optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CustomerOutput(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "createCustomerAddress": {
                    CustomerAddress optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CustomerAddress(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "createCustomerV2": {
                    CustomerOutput optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CustomerOutput(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "createEmptyCart": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "createGiftRegistry": {
                    CreateGiftRegistryOutput optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CreateGiftRegistryOutput(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "createPayflowProToken": {
                    CreatePayflowProTokenOutput optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CreatePayflowProTokenOutput(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "createPaypalExpressToken": {
                    PaypalExpressTokenOutput optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new PaypalExpressTokenOutput(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "createProductReview": {
                    responseData.put(key, new CreateProductReviewOutput(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "createRequisitionList": {
                    CreateRequisitionListOutput optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CreateRequisitionListOutput(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "createWishlist": {
                    CreateWishlistOutput optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CreateWishlistOutput(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "deleteCompanyRole": {
                    DeleteCompanyRoleOutput optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DeleteCompanyRoleOutput(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "deleteCompanyTeam": {
                    DeleteCompanyTeamOutput optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DeleteCompanyTeamOutput(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "deleteCompanyUser": {
                    DeleteCompanyUserOutput optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DeleteCompanyUserOutput(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "deleteCompareList": {
                    DeleteCompareListOutput optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DeleteCompareListOutput(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "deleteCustomerAddress": {
                    Boolean optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsBoolean(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "deleteNegotiableQuotes": {
                    DeleteNegotiableQuotesOutput optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DeleteNegotiableQuotesOutput(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "deletePaymentToken": {
                    DeletePaymentTokenOutput optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DeletePaymentTokenOutput(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "deleteRequisitionList": {
                    DeleteRequisitionListOutput optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DeleteRequisitionListOutput(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "deleteRequisitionListItems": {
                    DeleteRequisitionListItemsOutput optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DeleteRequisitionListItemsOutput(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "deleteWishlist": {
                    DeleteWishlistOutput optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DeleteWishlistOutput(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "generateCustomerToken": {
                    CustomerToken optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CustomerToken(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "generateCustomerTokenAsAdmin": {
                    GenerateCustomerTokenAsAdminOutput optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new GenerateCustomerTokenAsAdminOutput(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "handlePayflowProResponse": {
                    PayflowProResponseOutput optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new PayflowProResponseOutput(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "mergeCarts": {
                    responseData.put(key, new Cart(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "moveCartItemsToGiftRegistry": {
                    MoveCartItemsToGiftRegistryOutput optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new MoveCartItemsToGiftRegistryOutput(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "moveItemsBetweenRequisitionLists": {
                    MoveItemsBetweenRequisitionListsOutput optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new MoveItemsBetweenRequisitionListsOutput(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "moveProductsBetweenWishlists": {
                    MoveProductsBetweenWishlistsOutput optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new MoveProductsBetweenWishlistsOutput(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "placeNegotiableQuoteOrder": {
                    PlaceNegotiableQuoteOrderOutput optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new PlaceNegotiableQuoteOrderOutput(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "placeOrder": {
                    PlaceOrderOutput optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new PlaceOrderOutput(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "redeemGiftCardBalanceAsStoreCredit": {
                    GiftCardAccount optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new GiftCardAccount(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "removeCouponFromCart": {
                    RemoveCouponFromCartOutput optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new RemoveCouponFromCartOutput(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "removeGiftCardFromCart": {
                    RemoveGiftCardFromCartOutput optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new RemoveGiftCardFromCartOutput(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "removeGiftRegistry": {
                    RemoveGiftRegistryOutput optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new RemoveGiftRegistryOutput(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "removeGiftRegistryItems": {
                    RemoveGiftRegistryItemsOutput optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new RemoveGiftRegistryItemsOutput(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "removeGiftRegistryRegistrants": {
                    RemoveGiftRegistryRegistrantsOutput optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new RemoveGiftRegistryRegistrantsOutput(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "removeItemFromCart": {
                    RemoveItemFromCartOutput optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new RemoveItemFromCartOutput(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "removeNegotiableQuoteItems": {
                    RemoveNegotiableQuoteItemsOutput optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new RemoveNegotiableQuoteItemsOutput(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "removeProductsFromCompareList": {
                    CompareList optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CompareList(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "removeProductsFromWishlist": {
                    RemoveProductsFromWishlistOutput optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new RemoveProductsFromWishlistOutput(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "removeReturnTracking": {
                    RemoveReturnTrackingOutput optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new RemoveReturnTrackingOutput(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "removeRewardPointsFromCart": {
                    RemoveRewardPointsFromCartOutput optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new RemoveRewardPointsFromCartOutput(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "removeStoreCreditFromCart": {
                    RemoveStoreCreditFromCartOutput optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new RemoveStoreCreditFromCartOutput(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "reorderItems": {
                    ReorderItemsOutput optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ReorderItemsOutput(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "requestNegotiableQuote": {
                    RequestNegotiableQuoteOutput optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new RequestNegotiableQuoteOutput(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "requestPasswordResetEmail": {
                    Boolean optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsBoolean(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "requestReturn": {
                    RequestReturnOutput optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new RequestReturnOutput(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "resetPassword": {
                    Boolean optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsBoolean(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "revokeCustomerToken": {
                    RevokeCustomerTokenOutput optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new RevokeCustomerTokenOutput(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "sendEmailToFriend": {
                    SendEmailToFriendOutput optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new SendEmailToFriendOutput(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "sendNegotiableQuoteForReview": {
                    SendNegotiableQuoteForReviewOutput optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new SendNegotiableQuoteForReviewOutput(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "setBillingAddressOnCart": {
                    SetBillingAddressOnCartOutput optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new SetBillingAddressOnCartOutput(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "setGiftOptionsOnCart": {
                    SetGiftOptionsOnCartOutput optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new SetGiftOptionsOnCartOutput(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "setGuestEmailOnCart": {
                    SetGuestEmailOnCartOutput optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new SetGuestEmailOnCartOutput(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "setNegotiableQuoteBillingAddress": {
                    SetNegotiableQuoteBillingAddressOutput optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new SetNegotiableQuoteBillingAddressOutput(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "setNegotiableQuotePaymentMethod": {
                    SetNegotiableQuotePaymentMethodOutput optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new SetNegotiableQuotePaymentMethodOutput(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "setNegotiableQuoteShippingAddress": {
                    SetNegotiableQuoteShippingAddressOutput optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new SetNegotiableQuoteShippingAddressOutput(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "setNegotiableQuoteShippingMethods": {
                    SetNegotiableQuoteShippingMethodsOutput optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new SetNegotiableQuoteShippingMethodsOutput(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "setPaymentMethodAndPlaceOrder": {
                    PlaceOrderOutput optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new PlaceOrderOutput(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "setPaymentMethodOnCart": {
                    SetPaymentMethodOnCartOutput optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new SetPaymentMethodOnCartOutput(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "setShippingAddressesOnCart": {
                    SetShippingAddressesOnCartOutput optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new SetShippingAddressesOnCartOutput(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "setShippingMethodsOnCart": {
                    SetShippingMethodsOnCartOutput optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new SetShippingMethodsOnCartOutput(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "shareGiftRegistry": {
                    ShareGiftRegistryOutput optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ShareGiftRegistryOutput(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "subscribeEmailToNewsletter": {
                    SubscribeEmailToNewsletterOutput optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new SubscribeEmailToNewsletterOutput(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "updateCartItems": {
                    UpdateCartItemsOutput optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new UpdateCartItemsOutput(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "updateCompany": {
                    UpdateCompanyOutput optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new UpdateCompanyOutput(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "updateCompanyRole": {
                    UpdateCompanyRoleOutput optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new UpdateCompanyRoleOutput(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "updateCompanyStructure": {
                    UpdateCompanyStructureOutput optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new UpdateCompanyStructureOutput(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "updateCompanyTeam": {
                    UpdateCompanyTeamOutput optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new UpdateCompanyTeamOutput(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "updateCompanyUser": {
                    UpdateCompanyUserOutput optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new UpdateCompanyUserOutput(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "updateCustomer": {
                    CustomerOutput optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CustomerOutput(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "updateCustomerAddress": {
                    CustomerAddress optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CustomerAddress(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "updateCustomerEmail": {
                    CustomerOutput optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CustomerOutput(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "updateCustomerV2": {
                    CustomerOutput optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CustomerOutput(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "updateGiftRegistry": {
                    UpdateGiftRegistryOutput optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new UpdateGiftRegistryOutput(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "updateGiftRegistryItems": {
                    UpdateGiftRegistryItemsOutput optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new UpdateGiftRegistryItemsOutput(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "updateGiftRegistryRegistrants": {
                    UpdateGiftRegistryRegistrantsOutput optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new UpdateGiftRegistryRegistrantsOutput(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "updateNegotiableQuoteQuantities": {
                    UpdateNegotiableQuoteItemsQuantityOutput optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new UpdateNegotiableQuoteItemsQuantityOutput(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "updateProductsInWishlist": {
                    UpdateProductsInWishlistOutput optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new UpdateProductsInWishlistOutput(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "updateRequisitionList": {
                    UpdateRequisitionListOutput optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new UpdateRequisitionListOutput(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "updateRequisitionListItems": {
                    UpdateRequisitionListItemsOutput optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new UpdateRequisitionListItemsOutput(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "updateWishlist": {
                    UpdateWishlistOutput optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new UpdateWishlistOutput(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

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
        return "Mutation";
    }

    /**
     * Add one or more bundle products to the specified cart. We recommend using `addProductsToCart`
     * instead.
     */
    public AddBundleProductsToCartOutput getAddBundleProductsToCart() {
        return (AddBundleProductsToCartOutput) get("addBundleProductsToCart");
    }

    public Mutation setAddBundleProductsToCart(AddBundleProductsToCartOutput arg) {
        optimisticData.put(getKey("addBundleProductsToCart"), arg);
        return this;
    }

    /**
     * Add one or more configurable products to the specified cart. We recommend using `addProductsToCart`
     * instead.
     */
    public AddConfigurableProductsToCartOutput getAddConfigurableProductsToCart() {
        return (AddConfigurableProductsToCartOutput) get("addConfigurableProductsToCart");
    }

    public Mutation setAddConfigurableProductsToCart(AddConfigurableProductsToCartOutput arg) {
        optimisticData.put(getKey("addConfigurableProductsToCart"), arg);
        return this;
    }

    /**
     * Add one or more downloadable products to the specified cart. We recommend using `addProductsToCart`
     * instead.
     */
    public AddDownloadableProductsToCartOutput getAddDownloadableProductsToCart() {
        return (AddDownloadableProductsToCartOutput) get("addDownloadableProductsToCart");
    }

    public Mutation setAddDownloadableProductsToCart(AddDownloadableProductsToCartOutput arg) {
        optimisticData.put(getKey("addDownloadableProductsToCart"), arg);
        return this;
    }

    /**
     * Add registrants to the specified gift registry.
     */
    public AddGiftRegistryRegistrantsOutput getAddGiftRegistryRegistrants() {
        return (AddGiftRegistryRegistrantsOutput) get("addGiftRegistryRegistrants");
    }

    public Mutation setAddGiftRegistryRegistrants(AddGiftRegistryRegistrantsOutput arg) {
        optimisticData.put(getKey("addGiftRegistryRegistrants"), arg);
        return this;
    }

    /**
     * Add any type of product to the cart.
     */
    public AddProductsToCartOutput getAddProductsToCart() {
        return (AddProductsToCartOutput) get("addProductsToCart");
    }

    public Mutation setAddProductsToCart(AddProductsToCartOutput arg) {
        optimisticData.put(getKey("addProductsToCart"), arg);
        return this;
    }

    /**
     * Add products to the specified compare list.
     */
    public CompareList getAddProductsToCompareList() {
        return (CompareList) get("addProductsToCompareList");
    }

    public Mutation setAddProductsToCompareList(CompareList arg) {
        optimisticData.put(getKey("addProductsToCompareList"), arg);
        return this;
    }

    /**
     * Add items to the specified requisition list.
     */
    public AddProductsToRequisitionListOutput getAddProductsToRequisitionList() {
        return (AddProductsToRequisitionListOutput) get("addProductsToRequisitionList");
    }

    public Mutation setAddProductsToRequisitionList(AddProductsToRequisitionListOutput arg) {
        optimisticData.put(getKey("addProductsToRequisitionList"), arg);
        return this;
    }

    /**
     * Add one or more products to the specified wish list. This mutation supports all product types.
     */
    public AddProductsToWishlistOutput getAddProductsToWishlist() {
        return (AddProductsToWishlistOutput) get("addProductsToWishlist");
    }

    public Mutation setAddProductsToWishlist(AddProductsToWishlistOutput arg) {
        optimisticData.put(getKey("addProductsToWishlist"), arg);
        return this;
    }

    /**
     * Add items in the requisition list to the customer&#39;s cart.
     */
    public AddRequisitionListItemsToCartOutput getAddRequisitionListItemsToCart() {
        return (AddRequisitionListItemsToCartOutput) get("addRequisitionListItemsToCart");
    }

    public Mutation setAddRequisitionListItemsToCart(AddRequisitionListItemsToCartOutput arg) {
        optimisticData.put(getKey("addRequisitionListItemsToCart"), arg);
        return this;
    }

    /**
     * Add a comment to an existing return.
     */
    public AddReturnCommentOutput getAddReturnComment() {
        return (AddReturnCommentOutput) get("addReturnComment");
    }

    public Mutation setAddReturnComment(AddReturnCommentOutput arg) {
        optimisticData.put(getKey("addReturnComment"), arg);
        return this;
    }

    /**
     * Add tracking information to the return.
     */
    public AddReturnTrackingOutput getAddReturnTracking() {
        return (AddReturnTrackingOutput) get("addReturnTracking");
    }

    public Mutation setAddReturnTracking(AddReturnTrackingOutput arg) {
        optimisticData.put(getKey("addReturnTracking"), arg);
        return this;
    }

    /**
     * Add one or more simple products to the specified cart. We recommend using `addProductsToCart`
     * instead.
     */
    public AddSimpleProductsToCartOutput getAddSimpleProductsToCart() {
        return (AddSimpleProductsToCartOutput) get("addSimpleProductsToCart");
    }

    public Mutation setAddSimpleProductsToCart(AddSimpleProductsToCartOutput arg) {
        optimisticData.put(getKey("addSimpleProductsToCart"), arg);
        return this;
    }

    /**
     * Add one or more virtual products to the specified cart. We recommend using `addProductsToCart`
     * instead.
     */
    public AddVirtualProductsToCartOutput getAddVirtualProductsToCart() {
        return (AddVirtualProductsToCartOutput) get("addVirtualProductsToCart");
    }

    public Mutation setAddVirtualProductsToCart(AddVirtualProductsToCartOutput arg) {
        optimisticData.put(getKey("addVirtualProductsToCart"), arg);
        return this;
    }

    /**
     * Add items in the specified wishlist to the customer&#39;s cart.
     */
    public AddWishlistItemsToCartOutput getAddWishlistItemsToCart() {
        return (AddWishlistItemsToCartOutput) get("addWishlistItemsToCart");
    }

    public Mutation setAddWishlistItemsToCart(AddWishlistItemsToCartOutput arg) {
        optimisticData.put(getKey("addWishlistItemsToCart"), arg);
        return this;
    }

    /**
     * Apply a pre-defined coupon code to the specified cart.
     */
    public ApplyCouponToCartOutput getApplyCouponToCart() {
        return (ApplyCouponToCartOutput) get("applyCouponToCart");
    }

    public Mutation setApplyCouponToCart(ApplyCouponToCartOutput arg) {
        optimisticData.put(getKey("applyCouponToCart"), arg);
        return this;
    }

    /**
     * Apply a pre-defined gift card code to the specified cart.
     */
    public ApplyGiftCardToCartOutput getApplyGiftCardToCart() {
        return (ApplyGiftCardToCartOutput) get("applyGiftCardToCart");
    }

    public Mutation setApplyGiftCardToCart(ApplyGiftCardToCartOutput arg) {
        optimisticData.put(getKey("applyGiftCardToCart"), arg);
        return this;
    }

    /**
     * Apply all available points, up to the cart total. Partial redemption is not available.
     */
    public ApplyRewardPointsToCartOutput getApplyRewardPointsToCart() {
        return (ApplyRewardPointsToCartOutput) get("applyRewardPointsToCart");
    }

    public Mutation setApplyRewardPointsToCart(ApplyRewardPointsToCartOutput arg) {
        optimisticData.put(getKey("applyRewardPointsToCart"), arg);
        return this;
    }

    /**
     * Apply store credit to the specified cart.
     */
    public ApplyStoreCreditToCartOutput getApplyStoreCreditToCart() {
        return (ApplyStoreCreditToCartOutput) get("applyStoreCreditToCart");
    }

    public Mutation setApplyStoreCreditToCart(ApplyStoreCreditToCartOutput arg) {
        optimisticData.put(getKey("applyStoreCreditToCart"), arg);
        return this;
    }

    /**
     * Assign the specified compare list to the logged in customer.
     */
    public AssignCompareListToCustomerOutput getAssignCompareListToCustomer() {
        return (AssignCompareListToCustomerOutput) get("assignCompareListToCustomer");
    }

    public Mutation setAssignCompareListToCustomer(AssignCompareListToCustomerOutput arg) {
        optimisticData.put(getKey("assignCompareListToCustomer"), arg);
        return this;
    }

    /**
     * Assign a logged-in customer to the specified guest shopping cart.
     */
    public Cart getAssignCustomerToGuestCart() {
        return (Cart) get("assignCustomerToGuestCart");
    }

    public Mutation setAssignCustomerToGuestCart(Cart arg) {
        optimisticData.put(getKey("assignCustomerToGuestCart"), arg);
        return this;
    }

    /**
     * Change the password for the logged-in customer.
     */
    public Customer getChangeCustomerPassword() {
        return (Customer) get("changeCustomerPassword");
    }

    public Mutation setChangeCustomerPassword(Customer arg) {
        optimisticData.put(getKey("changeCustomerPassword"), arg);
        return this;
    }

    /**
     * Remove all items from the specified cart.
     */
    public ClearCustomerCartOutput getClearCustomerCart() {
        return (ClearCustomerCartOutput) get("clearCustomerCart");
    }

    public Mutation setClearCustomerCart(ClearCustomerCartOutput arg) {
        optimisticData.put(getKey("clearCustomerCart"), arg);
        return this;
    }

    /**
     * Mark a negotiable quote as closed. The negotiable quote is still visible on the storefront.
     */
    public CloseNegotiableQuotesOutput getCloseNegotiableQuotes() {
        return (CloseNegotiableQuotesOutput) get("closeNegotiableQuotes");
    }

    public Mutation setCloseNegotiableQuotes(CloseNegotiableQuotesOutput arg) {
        optimisticData.put(getKey("closeNegotiableQuotes"), arg);
        return this;
    }

    /**
     * Copy items from one requisition list to another.
     */
    public CopyItemsFromRequisitionListsOutput getCopyItemsBetweenRequisitionLists() {
        return (CopyItemsFromRequisitionListsOutput) get("copyItemsBetweenRequisitionLists");
    }

    public Mutation setCopyItemsBetweenRequisitionLists(CopyItemsFromRequisitionListsOutput arg) {
        optimisticData.put(getKey("copyItemsBetweenRequisitionLists"), arg);
        return this;
    }

    /**
     * Copy products from one wish list to another. The original wish list is unchanged.
     */
    public CopyProductsBetweenWishlistsOutput getCopyProductsBetweenWishlists() {
        return (CopyProductsBetweenWishlistsOutput) get("copyProductsBetweenWishlists");
    }

    public Mutation setCopyProductsBetweenWishlists(CopyProductsBetweenWishlistsOutput arg) {
        optimisticData.put(getKey("copyProductsBetweenWishlists"), arg);
        return this;
    }

    /**
     * Creates Client Token for Braintree Javascript SDK initialization.
     */
    public String getCreateBraintreeClientToken() {
        return (String) get("createBraintreeClientToken");
    }

    public Mutation setCreateBraintreeClientToken(String arg) {
        optimisticData.put(getKey("createBraintreeClientToken"), arg);
        return this;
    }

    /**
     * Create a company at the request of either a customer or a guest.
     */
    public CreateCompanyOutput getCreateCompany() {
        return (CreateCompanyOutput) get("createCompany");
    }

    public Mutation setCreateCompany(CreateCompanyOutput arg) {
        optimisticData.put(getKey("createCompany"), arg);
        return this;
    }

    /**
     * Create a new company role.
     */
    public CreateCompanyRoleOutput getCreateCompanyRole() {
        return (CreateCompanyRoleOutput) get("createCompanyRole");
    }

    public Mutation setCreateCompanyRole(CreateCompanyRoleOutput arg) {
        optimisticData.put(getKey("createCompanyRole"), arg);
        return this;
    }

    /**
     * Create a new team for the authenticated customer&#39;s company.
     */
    public CreateCompanyTeamOutput getCreateCompanyTeam() {
        return (CreateCompanyTeamOutput) get("createCompanyTeam");
    }

    public Mutation setCreateCompanyTeam(CreateCompanyTeamOutput arg) {
        optimisticData.put(getKey("createCompanyTeam"), arg);
        return this;
    }

    /**
     * Create a new company user at the request of an existing customer.
     */
    public CreateCompanyUserOutput getCreateCompanyUser() {
        return (CreateCompanyUserOutput) get("createCompanyUser");
    }

    public Mutation setCreateCompanyUser(CreateCompanyUserOutput arg) {
        optimisticData.put(getKey("createCompanyUser"), arg);
        return this;
    }

    /**
     * Create a new compare list. The compare list is saved for logged in customers.
     */
    public CompareList getCreateCompareList() {
        return (CompareList) get("createCompareList");
    }

    public Mutation setCreateCompareList(CompareList arg) {
        optimisticData.put(getKey("createCompareList"), arg);
        return this;
    }

    /**
     * Use `createCustomerV2` instead.
     */
    public CustomerOutput getCreateCustomer() {
        return (CustomerOutput) get("createCustomer");
    }

    public Mutation setCreateCustomer(CustomerOutput arg) {
        optimisticData.put(getKey("createCustomer"), arg);
        return this;
    }

    /**
     * Create a billing or shipping address for a customer or guest.
     */
    public CustomerAddress getCreateCustomerAddress() {
        return (CustomerAddress) get("createCustomerAddress");
    }

    public Mutation setCreateCustomerAddress(CustomerAddress arg) {
        optimisticData.put(getKey("createCustomerAddress"), arg);
        return this;
    }

    /**
     * Create a customer account.
     */
    public CustomerOutput getCreateCustomerV2() {
        return (CustomerOutput) get("createCustomerV2");
    }

    public Mutation setCreateCustomerV2(CustomerOutput arg) {
        optimisticData.put(getKey("createCustomerV2"), arg);
        return this;
    }

    /**
     * Create an empty shopping cart for a guest or logged in user
     */
    public String getCreateEmptyCart() {
        return (String) get("createEmptyCart");
    }

    public Mutation setCreateEmptyCart(String arg) {
        optimisticData.put(getKey("createEmptyCart"), arg);
        return this;
    }

    /**
     * Create a gift registry on behalf of the customer.
     */
    public CreateGiftRegistryOutput getCreateGiftRegistry() {
        return (CreateGiftRegistryOutput) get("createGiftRegistry");
    }

    public Mutation setCreateGiftRegistry(CreateGiftRegistryOutput arg) {
        optimisticData.put(getKey("createGiftRegistry"), arg);
        return this;
    }

    /**
     * Initiate a transaction and receive a token. Use this mutation for Payflow Pro and Payments Pro
     * payment methods
     */
    public CreatePayflowProTokenOutput getCreatePayflowProToken() {
        return (CreatePayflowProTokenOutput) get("createPayflowProToken");
    }

    public Mutation setCreatePayflowProToken(CreatePayflowProTokenOutput arg) {
        optimisticData.put(getKey("createPayflowProToken"), arg);
        return this;
    }

    /**
     * Initiate an Express Checkout transaction and receive a token. Use this mutation for Express Checkout
     * and Payments Standard payment methods.
     */
    public PaypalExpressTokenOutput getCreatePaypalExpressToken() {
        return (PaypalExpressTokenOutput) get("createPaypalExpressToken");
    }

    public Mutation setCreatePaypalExpressToken(PaypalExpressTokenOutput arg) {
        optimisticData.put(getKey("createPaypalExpressToken"), arg);
        return this;
    }

    /**
     * Create a product review for the specified product.
     */
    public CreateProductReviewOutput getCreateProductReview() {
        return (CreateProductReviewOutput) get("createProductReview");
    }

    public Mutation setCreateProductReview(CreateProductReviewOutput arg) {
        optimisticData.put(getKey("createProductReview"), arg);
        return this;
    }

    /**
     * Create an empty requisition list.
     */
    public CreateRequisitionListOutput getCreateRequisitionList() {
        return (CreateRequisitionListOutput) get("createRequisitionList");
    }

    public Mutation setCreateRequisitionList(CreateRequisitionListOutput arg) {
        optimisticData.put(getKey("createRequisitionList"), arg);
        return this;
    }

    /**
     * Create a new wish list.
     */
    public CreateWishlistOutput getCreateWishlist() {
        return (CreateWishlistOutput) get("createWishlist");
    }

    public Mutation setCreateWishlist(CreateWishlistOutput arg) {
        optimisticData.put(getKey("createWishlist"), arg);
        return this;
    }

    /**
     * Delete the specified company role.
     */
    public DeleteCompanyRoleOutput getDeleteCompanyRole() {
        return (DeleteCompanyRoleOutput) get("deleteCompanyRole");
    }

    public Mutation setDeleteCompanyRole(DeleteCompanyRoleOutput arg) {
        optimisticData.put(getKey("deleteCompanyRole"), arg);
        return this;
    }

    /**
     * Delete the specified company team.
     */
    public DeleteCompanyTeamOutput getDeleteCompanyTeam() {
        return (DeleteCompanyTeamOutput) get("deleteCompanyTeam");
    }

    public Mutation setDeleteCompanyTeam(DeleteCompanyTeamOutput arg) {
        optimisticData.put(getKey("deleteCompanyTeam"), arg);
        return this;
    }

    /**
     * Delete the specified company user.
     */
    public DeleteCompanyUserOutput getDeleteCompanyUser() {
        return (DeleteCompanyUserOutput) get("deleteCompanyUser");
    }

    public Mutation setDeleteCompanyUser(DeleteCompanyUserOutput arg) {
        optimisticData.put(getKey("deleteCompanyUser"), arg);
        return this;
    }

    /**
     * Delete the specified compare list.
     */
    public DeleteCompareListOutput getDeleteCompareList() {
        return (DeleteCompareListOutput) get("deleteCompareList");
    }

    public Mutation setDeleteCompareList(DeleteCompareListOutput arg) {
        optimisticData.put(getKey("deleteCompareList"), arg);
        return this;
    }

    /**
     * Delete the billing or shipping address of a customer.
     */
    public Boolean getDeleteCustomerAddress() {
        return (Boolean) get("deleteCustomerAddress");
    }

    public Mutation setDeleteCustomerAddress(Boolean arg) {
        optimisticData.put(getKey("deleteCustomerAddress"), arg);
        return this;
    }

    /**
     * Delete a negotiable quote. The negotiable quote will not be displayed on the storefront.
     */
    public DeleteNegotiableQuotesOutput getDeleteNegotiableQuotes() {
        return (DeleteNegotiableQuotesOutput) get("deleteNegotiableQuotes");
    }

    public Mutation setDeleteNegotiableQuotes(DeleteNegotiableQuotesOutput arg) {
        optimisticData.put(getKey("deleteNegotiableQuotes"), arg);
        return this;
    }

    /**
     * Delete a customer&#39;s payment token.
     */
    public DeletePaymentTokenOutput getDeletePaymentToken() {
        return (DeletePaymentTokenOutput) get("deletePaymentToken");
    }

    public Mutation setDeletePaymentToken(DeletePaymentTokenOutput arg) {
        optimisticData.put(getKey("deletePaymentToken"), arg);
        return this;
    }

    /**
     * Delete a requisition list.
     */
    public DeleteRequisitionListOutput getDeleteRequisitionList() {
        return (DeleteRequisitionListOutput) get("deleteRequisitionList");
    }

    public Mutation setDeleteRequisitionList(DeleteRequisitionListOutput arg) {
        optimisticData.put(getKey("deleteRequisitionList"), arg);
        return this;
    }

    /**
     * Delete items from a requisition list.
     */
    public DeleteRequisitionListItemsOutput getDeleteRequisitionListItems() {
        return (DeleteRequisitionListItemsOutput) get("deleteRequisitionListItems");
    }

    public Mutation setDeleteRequisitionListItems(DeleteRequisitionListItemsOutput arg) {
        optimisticData.put(getKey("deleteRequisitionListItems"), arg);
        return this;
    }

    /**
     * Delete the specified wish list. You cannot delete the customer&#39;s default (first) wish list.
     */
    public DeleteWishlistOutput getDeleteWishlist() {
        return (DeleteWishlistOutput) get("deleteWishlist");
    }

    public Mutation setDeleteWishlist(DeleteWishlistOutput arg) {
        optimisticData.put(getKey("deleteWishlist"), arg);
        return this;
    }

    /**
     * Generate a token for specified customer.
     */
    public CustomerToken getGenerateCustomerToken() {
        return (CustomerToken) get("generateCustomerToken");
    }

    public Mutation setGenerateCustomerToken(CustomerToken arg) {
        optimisticData.put(getKey("generateCustomerToken"), arg);
        return this;
    }

    /**
     * Request a customer token so that an administrator can perform remote shopping assistance.
     */
    public GenerateCustomerTokenAsAdminOutput getGenerateCustomerTokenAsAdmin() {
        return (GenerateCustomerTokenAsAdminOutput) get("generateCustomerTokenAsAdmin");
    }

    public Mutation setGenerateCustomerTokenAsAdmin(GenerateCustomerTokenAsAdminOutput arg) {
        optimisticData.put(getKey("generateCustomerTokenAsAdmin"), arg);
        return this;
    }

    /**
     * Handle a payment response and save the payment in Quote. Use this mutation for Payflow Pro and
     * Payments Pro payment methods.
     */
    public PayflowProResponseOutput getHandlePayflowProResponse() {
        return (PayflowProResponseOutput) get("handlePayflowProResponse");
    }

    public Mutation setHandlePayflowProResponse(PayflowProResponseOutput arg) {
        optimisticData.put(getKey("handlePayflowProResponse"), arg);
        return this;
    }

    /**
     * Transfer the contents of a guest cart into the cart of a logged-in customer.
     */
    public Cart getMergeCarts() {
        return (Cart) get("mergeCarts");
    }

    public Mutation setMergeCarts(Cart arg) {
        optimisticData.put(getKey("mergeCarts"), arg);
        return this;
    }

    /**
     * Move all items from the cart to a gift registry.
     */
    public MoveCartItemsToGiftRegistryOutput getMoveCartItemsToGiftRegistry() {
        return (MoveCartItemsToGiftRegistryOutput) get("moveCartItemsToGiftRegistry");
    }

    public Mutation setMoveCartItemsToGiftRegistry(MoveCartItemsToGiftRegistryOutput arg) {
        optimisticData.put(getKey("moveCartItemsToGiftRegistry"), arg);
        return this;
    }

    /**
     * Move Items from one requisition list to another.
     */
    public MoveItemsBetweenRequisitionListsOutput getMoveItemsBetweenRequisitionLists() {
        return (MoveItemsBetweenRequisitionListsOutput) get("moveItemsBetweenRequisitionLists");
    }

    public Mutation setMoveItemsBetweenRequisitionLists(MoveItemsBetweenRequisitionListsOutput arg) {
        optimisticData.put(getKey("moveItemsBetweenRequisitionLists"), arg);
        return this;
    }

    /**
     * Move products from one wish list to another.
     */
    public MoveProductsBetweenWishlistsOutput getMoveProductsBetweenWishlists() {
        return (MoveProductsBetweenWishlistsOutput) get("moveProductsBetweenWishlists");
    }

    public Mutation setMoveProductsBetweenWishlists(MoveProductsBetweenWishlistsOutput arg) {
        optimisticData.put(getKey("moveProductsBetweenWishlists"), arg);
        return this;
    }

    /**
     * Convert a negotiable quote into an order.
     */
    public PlaceNegotiableQuoteOrderOutput getPlaceNegotiableQuoteOrder() {
        return (PlaceNegotiableQuoteOrderOutput) get("placeNegotiableQuoteOrder");
    }

    public Mutation setPlaceNegotiableQuoteOrder(PlaceNegotiableQuoteOrderOutput arg) {
        optimisticData.put(getKey("placeNegotiableQuoteOrder"), arg);
        return this;
    }

    /**
     * Convert the quote into an order.
     */
    public PlaceOrderOutput getPlaceOrder() {
        return (PlaceOrderOutput) get("placeOrder");
    }

    public Mutation setPlaceOrder(PlaceOrderOutput arg) {
        optimisticData.put(getKey("placeOrder"), arg);
        return this;
    }

    /**
     * Redeem a gift card for store credit.
     */
    public GiftCardAccount getRedeemGiftCardBalanceAsStoreCredit() {
        return (GiftCardAccount) get("redeemGiftCardBalanceAsStoreCredit");
    }

    public Mutation setRedeemGiftCardBalanceAsStoreCredit(GiftCardAccount arg) {
        optimisticData.put(getKey("redeemGiftCardBalanceAsStoreCredit"), arg);
        return this;
    }

    /**
     * Remove a previously-applied coupon from the cart. The cart must contain at least one item in order
     * to remove the coupon.
     */
    public RemoveCouponFromCartOutput getRemoveCouponFromCart() {
        return (RemoveCouponFromCartOutput) get("removeCouponFromCart");
    }

    public Mutation setRemoveCouponFromCart(RemoveCouponFromCartOutput arg) {
        optimisticData.put(getKey("removeCouponFromCart"), arg);
        return this;
    }

    /**
     * Removes a gift card from the cart.
     */
    public RemoveGiftCardFromCartOutput getRemoveGiftCardFromCart() {
        return (RemoveGiftCardFromCartOutput) get("removeGiftCardFromCart");
    }

    public Mutation setRemoveGiftCardFromCart(RemoveGiftCardFromCartOutput arg) {
        optimisticData.put(getKey("removeGiftCardFromCart"), arg);
        return this;
    }

    /**
     * Delete the specified gift registry.
     */
    public RemoveGiftRegistryOutput getRemoveGiftRegistry() {
        return (RemoveGiftRegistryOutput) get("removeGiftRegistry");
    }

    public Mutation setRemoveGiftRegistry(RemoveGiftRegistryOutput arg) {
        optimisticData.put(getKey("removeGiftRegistry"), arg);
        return this;
    }

    /**
     * Delete the specified items from a gift registry.
     */
    public RemoveGiftRegistryItemsOutput getRemoveGiftRegistryItems() {
        return (RemoveGiftRegistryItemsOutput) get("removeGiftRegistryItems");
    }

    public Mutation setRemoveGiftRegistryItems(RemoveGiftRegistryItemsOutput arg) {
        optimisticData.put(getKey("removeGiftRegistryItems"), arg);
        return this;
    }

    /**
     * Removes registrants from a gift registry.
     */
    public RemoveGiftRegistryRegistrantsOutput getRemoveGiftRegistryRegistrants() {
        return (RemoveGiftRegistryRegistrantsOutput) get("removeGiftRegistryRegistrants");
    }

    public Mutation setRemoveGiftRegistryRegistrants(RemoveGiftRegistryRegistrantsOutput arg) {
        optimisticData.put(getKey("removeGiftRegistryRegistrants"), arg);
        return this;
    }

    /**
     * Delete the entire quantity of a specified item from the cart. If you remove all items from the cart,
     * the cart continues to exist.
     */
    public RemoveItemFromCartOutput getRemoveItemFromCart() {
        return (RemoveItemFromCartOutput) get("removeItemFromCart");
    }

    public Mutation setRemoveItemFromCart(RemoveItemFromCartOutput arg) {
        optimisticData.put(getKey("removeItemFromCart"), arg);
        return this;
    }

    /**
     * Remove one or more products from a negotiable quote.
     */
    public RemoveNegotiableQuoteItemsOutput getRemoveNegotiableQuoteItems() {
        return (RemoveNegotiableQuoteItemsOutput) get("removeNegotiableQuoteItems");
    }

    public Mutation setRemoveNegotiableQuoteItems(RemoveNegotiableQuoteItemsOutput arg) {
        optimisticData.put(getKey("removeNegotiableQuoteItems"), arg);
        return this;
    }

    /**
     * Remove products from the specified compare list.
     */
    public CompareList getRemoveProductsFromCompareList() {
        return (CompareList) get("removeProductsFromCompareList");
    }

    public Mutation setRemoveProductsFromCompareList(CompareList arg) {
        optimisticData.put(getKey("removeProductsFromCompareList"), arg);
        return this;
    }

    /**
     * Remove one or more products from the specified wish list.
     */
    public RemoveProductsFromWishlistOutput getRemoveProductsFromWishlist() {
        return (RemoveProductsFromWishlistOutput) get("removeProductsFromWishlist");
    }

    public Mutation setRemoveProductsFromWishlist(RemoveProductsFromWishlistOutput arg) {
        optimisticData.put(getKey("removeProductsFromWishlist"), arg);
        return this;
    }

    /**
     * Remove a tracked shipment from a return.
     */
    public RemoveReturnTrackingOutput getRemoveReturnTracking() {
        return (RemoveReturnTrackingOutput) get("removeReturnTracking");
    }

    public Mutation setRemoveReturnTracking(RemoveReturnTrackingOutput arg) {
        optimisticData.put(getKey("removeReturnTracking"), arg);
        return this;
    }

    /**
     * Cancel the application of reward points to the cart.
     */
    public RemoveRewardPointsFromCartOutput getRemoveRewardPointsFromCart() {
        return (RemoveRewardPointsFromCartOutput) get("removeRewardPointsFromCart");
    }

    public Mutation setRemoveRewardPointsFromCart(RemoveRewardPointsFromCartOutput arg) {
        optimisticData.put(getKey("removeRewardPointsFromCart"), arg);
        return this;
    }

    /**
     * Remove store credit that has been applied to the specified cart.
     */
    public RemoveStoreCreditFromCartOutput getRemoveStoreCreditFromCart() {
        return (RemoveStoreCreditFromCartOutput) get("removeStoreCreditFromCart");
    }

    public Mutation setRemoveStoreCreditFromCart(RemoveStoreCreditFromCartOutput arg) {
        optimisticData.put(getKey("removeStoreCreditFromCart"), arg);
        return this;
    }

    /**
     * Add all products from a customer&#39;s previous order to the cart.
     */
    public ReorderItemsOutput getReorderItems() {
        return (ReorderItemsOutput) get("reorderItems");
    }

    public Mutation setReorderItems(ReorderItemsOutput arg) {
        optimisticData.put(getKey("reorderItems"), arg);
        return this;
    }

    /**
     * Request a new negotiable quote on behalf of the buyer.
     */
    public RequestNegotiableQuoteOutput getRequestNegotiableQuote() {
        return (RequestNegotiableQuoteOutput) get("requestNegotiableQuote");
    }

    public Mutation setRequestNegotiableQuote(RequestNegotiableQuoteOutput arg) {
        optimisticData.put(getKey("requestNegotiableQuote"), arg);
        return this;
    }

    /**
     * Request an email with a reset password token for the registered customer identified by the specified
     * email.
     */
    public Boolean getRequestPasswordResetEmail() {
        return (Boolean) get("requestPasswordResetEmail");
    }

    public Mutation setRequestPasswordResetEmail(Boolean arg) {
        optimisticData.put(getKey("requestPasswordResetEmail"), arg);
        return this;
    }

    /**
     * Initiates a buyer&#39;s request to return items for replacement or refund.
     */
    public RequestReturnOutput getRequestReturn() {
        return (RequestReturnOutput) get("requestReturn");
    }

    public Mutation setRequestReturn(RequestReturnOutput arg) {
        optimisticData.put(getKey("requestReturn"), arg);
        return this;
    }

    /**
     * Reset a customer&#39;s password using the reset password token that the customer received in an email
     * after requesting it using `requestPasswordResetEmail`.
     */
    public Boolean getResetPassword() {
        return (Boolean) get("resetPassword");
    }

    public Mutation setResetPassword(Boolean arg) {
        optimisticData.put(getKey("resetPassword"), arg);
        return this;
    }

    /**
     * Revoke the customer token.
     */
    public RevokeCustomerTokenOutput getRevokeCustomerToken() {
        return (RevokeCustomerTokenOutput) get("revokeCustomerToken");
    }

    public Mutation setRevokeCustomerToken(RevokeCustomerTokenOutput arg) {
        optimisticData.put(getKey("revokeCustomerToken"), arg);
        return this;
    }

    /**
     * Send a message on behalf of a customer to the specified email addresses.
     */
    public SendEmailToFriendOutput getSendEmailToFriend() {
        return (SendEmailToFriendOutput) get("sendEmailToFriend");
    }

    public Mutation setSendEmailToFriend(SendEmailToFriendOutput arg) {
        optimisticData.put(getKey("sendEmailToFriend"), arg);
        return this;
    }

    /**
     * Send the negotiable quote to the seller for review.
     */
    public SendNegotiableQuoteForReviewOutput getSendNegotiableQuoteForReview() {
        return (SendNegotiableQuoteForReviewOutput) get("sendNegotiableQuoteForReview");
    }

    public Mutation setSendNegotiableQuoteForReview(SendNegotiableQuoteForReviewOutput arg) {
        optimisticData.put(getKey("sendNegotiableQuoteForReview"), arg);
        return this;
    }

    /**
     * Set the billing address on a specific cart.
     */
    public SetBillingAddressOnCartOutput getSetBillingAddressOnCart() {
        return (SetBillingAddressOnCartOutput) get("setBillingAddressOnCart");
    }

    public Mutation setSetBillingAddressOnCart(SetBillingAddressOnCartOutput arg) {
        optimisticData.put(getKey("setBillingAddressOnCart"), arg);
        return this;
    }

    /**
     * Set gift options, including gift messages, gift wrapping, gift receipts, and printed cards.
     */
    public SetGiftOptionsOnCartOutput getSetGiftOptionsOnCart() {
        return (SetGiftOptionsOnCartOutput) get("setGiftOptionsOnCart");
    }

    public Mutation setSetGiftOptionsOnCart(SetGiftOptionsOnCartOutput arg) {
        optimisticData.put(getKey("setGiftOptionsOnCart"), arg);
        return this;
    }

    /**
     * Assign the email address of a guest to the cart.
     */
    public SetGuestEmailOnCartOutput getSetGuestEmailOnCart() {
        return (SetGuestEmailOnCartOutput) get("setGuestEmailOnCart");
    }

    public Mutation setSetGuestEmailOnCart(SetGuestEmailOnCartOutput arg) {
        optimisticData.put(getKey("setGuestEmailOnCart"), arg);
        return this;
    }

    /**
     * Assign a billing address to a negotiable quote.
     */
    public SetNegotiableQuoteBillingAddressOutput getSetNegotiableQuoteBillingAddress() {
        return (SetNegotiableQuoteBillingAddressOutput) get("setNegotiableQuoteBillingAddress");
    }

    public Mutation setSetNegotiableQuoteBillingAddress(SetNegotiableQuoteBillingAddressOutput arg) {
        optimisticData.put(getKey("setNegotiableQuoteBillingAddress"), arg);
        return this;
    }

    /**
     * Set the payment method on a negotiable quote.
     */
    public SetNegotiableQuotePaymentMethodOutput getSetNegotiableQuotePaymentMethod() {
        return (SetNegotiableQuotePaymentMethodOutput) get("setNegotiableQuotePaymentMethod");
    }

    public Mutation setSetNegotiableQuotePaymentMethod(SetNegotiableQuotePaymentMethodOutput arg) {
        optimisticData.put(getKey("setNegotiableQuotePaymentMethod"), arg);
        return this;
    }

    /**
     * Assign a previously-defined address as the shipping address for a negotiable quote.
     */
    public SetNegotiableQuoteShippingAddressOutput getSetNegotiableQuoteShippingAddress() {
        return (SetNegotiableQuoteShippingAddressOutput) get("setNegotiableQuoteShippingAddress");
    }

    public Mutation setSetNegotiableQuoteShippingAddress(SetNegotiableQuoteShippingAddressOutput arg) {
        optimisticData.put(getKey("setNegotiableQuoteShippingAddress"), arg);
        return this;
    }

    /**
     * Assign the shipping methods on the negotiable quote.
     */
    public SetNegotiableQuoteShippingMethodsOutput getSetNegotiableQuoteShippingMethods() {
        return (SetNegotiableQuoteShippingMethodsOutput) get("setNegotiableQuoteShippingMethods");
    }

    public Mutation setSetNegotiableQuoteShippingMethods(SetNegotiableQuoteShippingMethodsOutput arg) {
        optimisticData.put(getKey("setNegotiableQuoteShippingMethods"), arg);
        return this;
    }

    /**
     * Set the cart payment method and convert the cart into an order.
     *
     * @deprecated Should use setPaymentMethodOnCart and placeOrder mutations in single request.
     */
    @Deprecated
    public PlaceOrderOutput getSetPaymentMethodAndPlaceOrder() {
        return (PlaceOrderOutput) get("setPaymentMethodAndPlaceOrder");
    }

    public Mutation setSetPaymentMethodAndPlaceOrder(PlaceOrderOutput arg) {
        optimisticData.put(getKey("setPaymentMethodAndPlaceOrder"), arg);
        return this;
    }

    /**
     * Apply a payment method to the cart.
     */
    public SetPaymentMethodOnCartOutput getSetPaymentMethodOnCart() {
        return (SetPaymentMethodOnCartOutput) get("setPaymentMethodOnCart");
    }

    public Mutation setSetPaymentMethodOnCart(SetPaymentMethodOnCartOutput arg) {
        optimisticData.put(getKey("setPaymentMethodOnCart"), arg);
        return this;
    }

    /**
     * Set one or more shipping addresses on a specific cart.
     */
    public SetShippingAddressesOnCartOutput getSetShippingAddressesOnCart() {
        return (SetShippingAddressesOnCartOutput) get("setShippingAddressesOnCart");
    }

    public Mutation setSetShippingAddressesOnCart(SetShippingAddressesOnCartOutput arg) {
        optimisticData.put(getKey("setShippingAddressesOnCart"), arg);
        return this;
    }

    /**
     * Set one or more delivery methods on a cart.
     */
    public SetShippingMethodsOnCartOutput getSetShippingMethodsOnCart() {
        return (SetShippingMethodsOnCartOutput) get("setShippingMethodsOnCart");
    }

    public Mutation setSetShippingMethodsOnCart(SetShippingMethodsOnCartOutput arg) {
        optimisticData.put(getKey("setShippingMethodsOnCart"), arg);
        return this;
    }

    /**
     * Send an email about the gift registry to a list of invitees.
     */
    public ShareGiftRegistryOutput getShareGiftRegistry() {
        return (ShareGiftRegistryOutput) get("shareGiftRegistry");
    }

    public Mutation setShareGiftRegistry(ShareGiftRegistryOutput arg) {
        optimisticData.put(getKey("shareGiftRegistry"), arg);
        return this;
    }

    /**
     * Subscribe the specified email to the store&#39;s newsletter.
     */
    public SubscribeEmailToNewsletterOutput getSubscribeEmailToNewsletter() {
        return (SubscribeEmailToNewsletterOutput) get("subscribeEmailToNewsletter");
    }

    public Mutation setSubscribeEmailToNewsletter(SubscribeEmailToNewsletterOutput arg) {
        optimisticData.put(getKey("subscribeEmailToNewsletter"), arg);
        return this;
    }

    /**
     * Modify items in the cart.
     */
    public UpdateCartItemsOutput getUpdateCartItems() {
        return (UpdateCartItemsOutput) get("updateCartItems");
    }

    public Mutation setUpdateCartItems(UpdateCartItemsOutput arg) {
        optimisticData.put(getKey("updateCartItems"), arg);
        return this;
    }

    /**
     * Update company information.
     */
    public UpdateCompanyOutput getUpdateCompany() {
        return (UpdateCompanyOutput) get("updateCompany");
    }

    public Mutation setUpdateCompany(UpdateCompanyOutput arg) {
        optimisticData.put(getKey("updateCompany"), arg);
        return this;
    }

    /**
     * Update company role information.
     */
    public UpdateCompanyRoleOutput getUpdateCompanyRole() {
        return (UpdateCompanyRoleOutput) get("updateCompanyRole");
    }

    public Mutation setUpdateCompanyRole(UpdateCompanyRoleOutput arg) {
        optimisticData.put(getKey("updateCompanyRole"), arg);
        return this;
    }

    /**
     * Change the parent node of a company team.
     */
    public UpdateCompanyStructureOutput getUpdateCompanyStructure() {
        return (UpdateCompanyStructureOutput) get("updateCompanyStructure");
    }

    public Mutation setUpdateCompanyStructure(UpdateCompanyStructureOutput arg) {
        optimisticData.put(getKey("updateCompanyStructure"), arg);
        return this;
    }

    /**
     * Update company team data.
     */
    public UpdateCompanyTeamOutput getUpdateCompanyTeam() {
        return (UpdateCompanyTeamOutput) get("updateCompanyTeam");
    }

    public Mutation setUpdateCompanyTeam(UpdateCompanyTeamOutput arg) {
        optimisticData.put(getKey("updateCompanyTeam"), arg);
        return this;
    }

    /**
     * Update an existing company user.
     */
    public UpdateCompanyUserOutput getUpdateCompanyUser() {
        return (UpdateCompanyUserOutput) get("updateCompanyUser");
    }

    public Mutation setUpdateCompanyUser(UpdateCompanyUserOutput arg) {
        optimisticData.put(getKey("updateCompanyUser"), arg);
        return this;
    }

    /**
     * Use `updateCustomerV2` instead.
     */
    public CustomerOutput getUpdateCustomer() {
        return (CustomerOutput) get("updateCustomer");
    }

    public Mutation setUpdateCustomer(CustomerOutput arg) {
        optimisticData.put(getKey("updateCustomer"), arg);
        return this;
    }

    /**
     * Update the billing or shipping address of a customer or guest.
     */
    public CustomerAddress getUpdateCustomerAddress() {
        return (CustomerAddress) get("updateCustomerAddress");
    }

    public Mutation setUpdateCustomerAddress(CustomerAddress arg) {
        optimisticData.put(getKey("updateCustomerAddress"), arg);
        return this;
    }

    /**
     * Change the email address for the logged-in customer.
     */
    public CustomerOutput getUpdateCustomerEmail() {
        return (CustomerOutput) get("updateCustomerEmail");
    }

    public Mutation setUpdateCustomerEmail(CustomerOutput arg) {
        optimisticData.put(getKey("updateCustomerEmail"), arg);
        return this;
    }

    /**
     * Update the customer&#39;s personal information.
     */
    public CustomerOutput getUpdateCustomerV2() {
        return (CustomerOutput) get("updateCustomerV2");
    }

    public Mutation setUpdateCustomerV2(CustomerOutput arg) {
        optimisticData.put(getKey("updateCustomerV2"), arg);
        return this;
    }

    /**
     * Update the specified gift registry.
     */
    public UpdateGiftRegistryOutput getUpdateGiftRegistry() {
        return (UpdateGiftRegistryOutput) get("updateGiftRegistry");
    }

    public Mutation setUpdateGiftRegistry(UpdateGiftRegistryOutput arg) {
        optimisticData.put(getKey("updateGiftRegistry"), arg);
        return this;
    }

    /**
     * Update the specified items in the gift registry.
     */
    public UpdateGiftRegistryItemsOutput getUpdateGiftRegistryItems() {
        return (UpdateGiftRegistryItemsOutput) get("updateGiftRegistryItems");
    }

    public Mutation setUpdateGiftRegistryItems(UpdateGiftRegistryItemsOutput arg) {
        optimisticData.put(getKey("updateGiftRegistryItems"), arg);
        return this;
    }

    /**
     * Modify the properties of one or more gift registry registrants.
     */
    public UpdateGiftRegistryRegistrantsOutput getUpdateGiftRegistryRegistrants() {
        return (UpdateGiftRegistryRegistrantsOutput) get("updateGiftRegistryRegistrants");
    }

    public Mutation setUpdateGiftRegistryRegistrants(UpdateGiftRegistryRegistrantsOutput arg) {
        optimisticData.put(getKey("updateGiftRegistryRegistrants"), arg);
        return this;
    }

    /**
     * Change the quantity of one or more items in an existing negotiable quote.
     */
    public UpdateNegotiableQuoteItemsQuantityOutput getUpdateNegotiableQuoteQuantities() {
        return (UpdateNegotiableQuoteItemsQuantityOutput) get("updateNegotiableQuoteQuantities");
    }

    public Mutation setUpdateNegotiableQuoteQuantities(UpdateNegotiableQuoteItemsQuantityOutput arg) {
        optimisticData.put(getKey("updateNegotiableQuoteQuantities"), arg);
        return this;
    }

    /**
     * Update one or more products in the specified wish list.
     */
    public UpdateProductsInWishlistOutput getUpdateProductsInWishlist() {
        return (UpdateProductsInWishlistOutput) get("updateProductsInWishlist");
    }

    public Mutation setUpdateProductsInWishlist(UpdateProductsInWishlistOutput arg) {
        optimisticData.put(getKey("updateProductsInWishlist"), arg);
        return this;
    }

    /**
     * Rename a requisition list and change its description.
     */
    public UpdateRequisitionListOutput getUpdateRequisitionList() {
        return (UpdateRequisitionListOutput) get("updateRequisitionList");
    }

    public Mutation setUpdateRequisitionList(UpdateRequisitionListOutput arg) {
        optimisticData.put(getKey("updateRequisitionList"), arg);
        return this;
    }

    /**
     * Update items in a requisition list.
     */
    public UpdateRequisitionListItemsOutput getUpdateRequisitionListItems() {
        return (UpdateRequisitionListItemsOutput) get("updateRequisitionListItems");
    }

    public Mutation setUpdateRequisitionListItems(UpdateRequisitionListItemsOutput arg) {
        optimisticData.put(getKey("updateRequisitionListItems"), arg);
        return this;
    }

    /**
     * Change the name and visibility of the specified wish list.
     */
    public UpdateWishlistOutput getUpdateWishlist() {
        return (UpdateWishlistOutput) get("updateWishlist");
    }

    public Mutation setUpdateWishlist(UpdateWishlistOutput arg) {
        optimisticData.put(getKey("updateWishlist"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "addBundleProductsToCart":
                return true;

            case "addConfigurableProductsToCart":
                return true;

            case "addDownloadableProductsToCart":
                return true;

            case "addGiftRegistryRegistrants":
                return true;

            case "addProductsToCart":
                return true;

            case "addProductsToCompareList":
                return true;

            case "addProductsToRequisitionList":
                return true;

            case "addProductsToWishlist":
                return true;

            case "addRequisitionListItemsToCart":
                return true;

            case "addReturnComment":
                return true;

            case "addReturnTracking":
                return true;

            case "addSimpleProductsToCart":
                return true;

            case "addVirtualProductsToCart":
                return true;

            case "addWishlistItemsToCart":
                return true;

            case "applyCouponToCart":
                return true;

            case "applyGiftCardToCart":
                return true;

            case "applyRewardPointsToCart":
                return true;

            case "applyStoreCreditToCart":
                return true;

            case "assignCompareListToCustomer":
                return true;

            case "assignCustomerToGuestCart":
                return true;

            case "changeCustomerPassword":
                return true;

            case "clearCustomerCart":
                return true;

            case "closeNegotiableQuotes":
                return true;

            case "copyItemsBetweenRequisitionLists":
                return true;

            case "copyProductsBetweenWishlists":
                return true;

            case "createBraintreeClientToken":
                return false;

            case "createCompany":
                return true;

            case "createCompanyRole":
                return true;

            case "createCompanyTeam":
                return true;

            case "createCompanyUser":
                return true;

            case "createCompareList":
                return true;

            case "createCustomer":
                return true;

            case "createCustomerAddress":
                return true;

            case "createCustomerV2":
                return true;

            case "createEmptyCart":
                return false;

            case "createGiftRegistry":
                return true;

            case "createPayflowProToken":
                return true;

            case "createPaypalExpressToken":
                return true;

            case "createProductReview":
                return true;

            case "createRequisitionList":
                return true;

            case "createWishlist":
                return true;

            case "deleteCompanyRole":
                return true;

            case "deleteCompanyTeam":
                return true;

            case "deleteCompanyUser":
                return true;

            case "deleteCompareList":
                return true;

            case "deleteCustomerAddress":
                return false;

            case "deleteNegotiableQuotes":
                return true;

            case "deletePaymentToken":
                return true;

            case "deleteRequisitionList":
                return true;

            case "deleteRequisitionListItems":
                return true;

            case "deleteWishlist":
                return true;

            case "generateCustomerToken":
                return true;

            case "generateCustomerTokenAsAdmin":
                return true;

            case "handlePayflowProResponse":
                return true;

            case "mergeCarts":
                return true;

            case "moveCartItemsToGiftRegistry":
                return true;

            case "moveItemsBetweenRequisitionLists":
                return true;

            case "moveProductsBetweenWishlists":
                return true;

            case "placeNegotiableQuoteOrder":
                return true;

            case "placeOrder":
                return true;

            case "redeemGiftCardBalanceAsStoreCredit":
                return true;

            case "removeCouponFromCart":
                return true;

            case "removeGiftCardFromCart":
                return true;

            case "removeGiftRegistry":
                return true;

            case "removeGiftRegistryItems":
                return true;

            case "removeGiftRegistryRegistrants":
                return true;

            case "removeItemFromCart":
                return true;

            case "removeNegotiableQuoteItems":
                return true;

            case "removeProductsFromCompareList":
                return true;

            case "removeProductsFromWishlist":
                return true;

            case "removeReturnTracking":
                return true;

            case "removeRewardPointsFromCart":
                return true;

            case "removeStoreCreditFromCart":
                return true;

            case "reorderItems":
                return true;

            case "requestNegotiableQuote":
                return true;

            case "requestPasswordResetEmail":
                return false;

            case "requestReturn":
                return true;

            case "resetPassword":
                return false;

            case "revokeCustomerToken":
                return true;

            case "sendEmailToFriend":
                return true;

            case "sendNegotiableQuoteForReview":
                return true;

            case "setBillingAddressOnCart":
                return true;

            case "setGiftOptionsOnCart":
                return true;

            case "setGuestEmailOnCart":
                return true;

            case "setNegotiableQuoteBillingAddress":
                return true;

            case "setNegotiableQuotePaymentMethod":
                return true;

            case "setNegotiableQuoteShippingAddress":
                return true;

            case "setNegotiableQuoteShippingMethods":
                return true;

            case "setPaymentMethodAndPlaceOrder":
                return true;

            case "setPaymentMethodOnCart":
                return true;

            case "setShippingAddressesOnCart":
                return true;

            case "setShippingMethodsOnCart":
                return true;

            case "shareGiftRegistry":
                return true;

            case "subscribeEmailToNewsletter":
                return true;

            case "updateCartItems":
                return true;

            case "updateCompany":
                return true;

            case "updateCompanyRole":
                return true;

            case "updateCompanyStructure":
                return true;

            case "updateCompanyTeam":
                return true;

            case "updateCompanyUser":
                return true;

            case "updateCustomer":
                return true;

            case "updateCustomerAddress":
                return true;

            case "updateCustomerEmail":
                return true;

            case "updateCustomerV2":
                return true;

            case "updateGiftRegistry":
                return true;

            case "updateGiftRegistryItems":
                return true;

            case "updateGiftRegistryRegistrants":
                return true;

            case "updateNegotiableQuoteQuantities":
                return true;

            case "updateProductsInWishlist":
                return true;

            case "updateRequisitionList":
                return true;

            case "updateRequisitionListItems":
                return true;

            case "updateWishlist":
                return true;

            default:
                return false;
        }
    }
}

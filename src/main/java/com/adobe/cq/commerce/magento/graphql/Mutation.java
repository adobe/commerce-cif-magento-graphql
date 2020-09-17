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
    public Mutation() {
    }

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

                case "applyCouponToCart": {
                    ApplyCouponToCartOutput optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ApplyCouponToCartOutput(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

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

                case "createBraintreeClientToken": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

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

                case "createEmptyCart": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
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

                case "deleteCustomerAddress": {
                    Boolean optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsBoolean(field.getValue(), key);
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

                case "generateCustomerToken": {
                    CustomerToken optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CustomerToken(jsonAsObject(field.getValue(), key));
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

                case "placeOrder": {
                    PlaceOrderOutput optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new PlaceOrderOutput(jsonAsObject(field.getValue(), key));
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

                case "removeItemFromCart": {
                    RemoveItemFromCartOutput optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new RemoveItemFromCartOutput(jsonAsObject(field.getValue(), key));
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

                case "requestPasswordResetEmail": {
                    Boolean optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsBoolean(field.getValue(), key);
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

                case "setBillingAddressOnCart": {
                    SetBillingAddressOnCartOutput optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new SetBillingAddressOnCartOutput(jsonAsObject(field.getValue(), key));
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

                case "updateCartItems": {
                    UpdateCartItemsOutput optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new UpdateCartItemsOutput(jsonAsObject(field.getValue(), key));
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

    public AddBundleProductsToCartOutput getAddBundleProductsToCart() {
        return (AddBundleProductsToCartOutput) get("addBundleProductsToCart");
    }

    public Mutation setAddBundleProductsToCart(AddBundleProductsToCartOutput arg) {
        optimisticData.put(getKey("addBundleProductsToCart"), arg);
        return this;
    }

    public AddConfigurableProductsToCartOutput getAddConfigurableProductsToCart() {
        return (AddConfigurableProductsToCartOutput) get("addConfigurableProductsToCart");
    }

    public Mutation setAddConfigurableProductsToCart(AddConfigurableProductsToCartOutput arg) {
        optimisticData.put(getKey("addConfigurableProductsToCart"), arg);
        return this;
    }

    public AddDownloadableProductsToCartOutput getAddDownloadableProductsToCart() {
        return (AddDownloadableProductsToCartOutput) get("addDownloadableProductsToCart");
    }

    public Mutation setAddDownloadableProductsToCart(AddDownloadableProductsToCartOutput arg) {
        optimisticData.put(getKey("addDownloadableProductsToCart"), arg);
        return this;
    }

    public AddSimpleProductsToCartOutput getAddSimpleProductsToCart() {
        return (AddSimpleProductsToCartOutput) get("addSimpleProductsToCart");
    }

    public Mutation setAddSimpleProductsToCart(AddSimpleProductsToCartOutput arg) {
        optimisticData.put(getKey("addSimpleProductsToCart"), arg);
        return this;
    }

    public AddVirtualProductsToCartOutput getAddVirtualProductsToCart() {
        return (AddVirtualProductsToCartOutput) get("addVirtualProductsToCart");
    }

    public Mutation setAddVirtualProductsToCart(AddVirtualProductsToCartOutput arg) {
        optimisticData.put(getKey("addVirtualProductsToCart"), arg);
        return this;
    }

    public ApplyCouponToCartOutput getApplyCouponToCart() {
        return (ApplyCouponToCartOutput) get("applyCouponToCart");
    }

    public Mutation setApplyCouponToCart(ApplyCouponToCartOutput arg) {
        optimisticData.put(getKey("applyCouponToCart"), arg);
        return this;
    }

    /**
     * Changes the password for the logged-in customer
     */
    public Customer getChangeCustomerPassword() {
        return (Customer) get("changeCustomerPassword");
    }

    public Mutation setChangeCustomerPassword(Customer arg) {
        optimisticData.put(getKey("changeCustomerPassword"), arg);
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
     * Create customer account
     */
    public CustomerOutput getCreateCustomer() {
        return (CustomerOutput) get("createCustomer");
    }

    public Mutation setCreateCustomer(CustomerOutput arg) {
        optimisticData.put(getKey("createCustomer"), arg);
        return this;
    }

    /**
     * Create customer address
     */
    public CustomerAddress getCreateCustomerAddress() {
        return (CustomerAddress) get("createCustomerAddress");
    }

    public Mutation setCreateCustomerAddress(CustomerAddress arg) {
        optimisticData.put(getKey("createCustomerAddress"), arg);
        return this;
    }

    /**
     * Creates an empty shopping cart for a guest or logged in user
     */
    public String getCreateEmptyCart() {
        return (String) get("createEmptyCart");
    }

    public Mutation setCreateEmptyCart(String arg) {
        optimisticData.put(getKey("createEmptyCart"), arg);
        return this;
    }

    /**
     * Initiates a transaction and receives a token. Use this mutation for Payflow Pro and Payments Pro
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
     * Initiates an Express Checkout transaction and receives a token. Use this mutation for Express
     * Checkout and Payments Standard payment methods.
     */
    public PaypalExpressTokenOutput getCreatePaypalExpressToken() {
        return (PaypalExpressTokenOutput) get("createPaypalExpressToken");
    }

    public Mutation setCreatePaypalExpressToken(PaypalExpressTokenOutput arg) {
        optimisticData.put(getKey("createPaypalExpressToken"), arg);
        return this;
    }

    /**
     * Delete customer address
     */
    public Boolean getDeleteCustomerAddress() {
        return (Boolean) get("deleteCustomerAddress");
    }

    public Mutation setDeleteCustomerAddress(Boolean arg) {
        optimisticData.put(getKey("deleteCustomerAddress"), arg);
        return this;
    }

    /**
     * Delete a customer payment token
     */
    public DeletePaymentTokenOutput getDeletePaymentToken() {
        return (DeletePaymentTokenOutput) get("deletePaymentToken");
    }

    public Mutation setDeletePaymentToken(DeletePaymentTokenOutput arg) {
        optimisticData.put(getKey("deletePaymentToken"), arg);
        return this;
    }

    /**
     * Retrieve the customer token
     */
    public CustomerToken getGenerateCustomerToken() {
        return (CustomerToken) get("generateCustomerToken");
    }

    public Mutation setGenerateCustomerToken(CustomerToken arg) {
        optimisticData.put(getKey("generateCustomerToken"), arg);
        return this;
    }

    /**
     * Handles payment response and saves payment in Quote. Use this mutations for Payflow Pro and Payments
     * Pro payment methods.
     */
    public PayflowProResponseOutput getHandlePayflowProResponse() {
        return (PayflowProResponseOutput) get("handlePayflowProResponse");
    }

    public Mutation setHandlePayflowProResponse(PayflowProResponseOutput arg) {
        optimisticData.put(getKey("handlePayflowProResponse"), arg);
        return this;
    }

    /**
     * Merges the source cart into the destination cart
     */
    public Cart getMergeCarts() {
        return (Cart) get("mergeCarts");
    }

    public Mutation setMergeCarts(Cart arg) {
        optimisticData.put(getKey("mergeCarts"), arg);
        return this;
    }

    public PlaceOrderOutput getPlaceOrder() {
        return (PlaceOrderOutput) get("placeOrder");
    }

    public Mutation setPlaceOrder(PlaceOrderOutput arg) {
        optimisticData.put(getKey("placeOrder"), arg);
        return this;
    }

    public RemoveCouponFromCartOutput getRemoveCouponFromCart() {
        return (RemoveCouponFromCartOutput) get("removeCouponFromCart");
    }

    public Mutation setRemoveCouponFromCart(RemoveCouponFromCartOutput arg) {
        optimisticData.put(getKey("removeCouponFromCart"), arg);
        return this;
    }

    public RemoveItemFromCartOutput getRemoveItemFromCart() {
        return (RemoveItemFromCartOutput) get("removeItemFromCart");
    }

    public Mutation setRemoveItemFromCart(RemoveItemFromCartOutput arg) {
        optimisticData.put(getKey("removeItemFromCart"), arg);
        return this;
    }

    /**
     * Adds all products from a customer&#39;s previous order to the cart.
     */
    public ReorderItemsOutput getReorderItems() {
        return (ReorderItemsOutput) get("reorderItems");
    }

    public Mutation setReorderItems(ReorderItemsOutput arg) {
        optimisticData.put(getKey("reorderItems"), arg);
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
     * Reset a customer&#39;s password using the reset password token that the customer received in an email
     * after requesting it using requestPasswordResetEmail.
     */
    public Boolean getResetPassword() {
        return (Boolean) get("resetPassword");
    }

    public Mutation setResetPassword(Boolean arg) {
        optimisticData.put(getKey("resetPassword"), arg);
        return this;
    }

    /**
     * Revoke the customer token
     */
    public RevokeCustomerTokenOutput getRevokeCustomerToken() {
        return (RevokeCustomerTokenOutput) get("revokeCustomerToken");
    }

    public Mutation setRevokeCustomerToken(RevokeCustomerTokenOutput arg) {
        optimisticData.put(getKey("revokeCustomerToken"), arg);
        return this;
    }

    /**
     * Recommends Product by Sending Single/Multiple Email
     */
    public SendEmailToFriendOutput getSendEmailToFriend() {
        return (SendEmailToFriendOutput) get("sendEmailToFriend");
    }

    public Mutation setSendEmailToFriend(SendEmailToFriendOutput arg) {
        optimisticData.put(getKey("sendEmailToFriend"), arg);
        return this;
    }

    public SetBillingAddressOnCartOutput getSetBillingAddressOnCart() {
        return (SetBillingAddressOnCartOutput) get("setBillingAddressOnCart");
    }

    public Mutation setSetBillingAddressOnCart(SetBillingAddressOnCartOutput arg) {
        optimisticData.put(getKey("setBillingAddressOnCart"), arg);
        return this;
    }

    public SetGuestEmailOnCartOutput getSetGuestEmailOnCart() {
        return (SetGuestEmailOnCartOutput) get("setGuestEmailOnCart");
    }

    public Mutation setSetGuestEmailOnCart(SetGuestEmailOnCartOutput arg) {
        optimisticData.put(getKey("setGuestEmailOnCart"), arg);
        return this;
    }

    /**
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

    public SetPaymentMethodOnCartOutput getSetPaymentMethodOnCart() {
        return (SetPaymentMethodOnCartOutput) get("setPaymentMethodOnCart");
    }

    public Mutation setSetPaymentMethodOnCart(SetPaymentMethodOnCartOutput arg) {
        optimisticData.put(getKey("setPaymentMethodOnCart"), arg);
        return this;
    }

    public SetShippingAddressesOnCartOutput getSetShippingAddressesOnCart() {
        return (SetShippingAddressesOnCartOutput) get("setShippingAddressesOnCart");
    }

    public Mutation setSetShippingAddressesOnCart(SetShippingAddressesOnCartOutput arg) {
        optimisticData.put(getKey("setShippingAddressesOnCart"), arg);
        return this;
    }

    public SetShippingMethodsOnCartOutput getSetShippingMethodsOnCart() {
        return (SetShippingMethodsOnCartOutput) get("setShippingMethodsOnCart");
    }

    public Mutation setSetShippingMethodsOnCart(SetShippingMethodsOnCartOutput arg) {
        optimisticData.put(getKey("setShippingMethodsOnCart"), arg);
        return this;
    }

    public UpdateCartItemsOutput getUpdateCartItems() {
        return (UpdateCartItemsOutput) get("updateCartItems");
    }

    public Mutation setUpdateCartItems(UpdateCartItemsOutput arg) {
        optimisticData.put(getKey("updateCartItems"), arg);
        return this;
    }

    /**
     * Update the customer&#39;s personal information
     */
    public CustomerOutput getUpdateCustomer() {
        return (CustomerOutput) get("updateCustomer");
    }

    public Mutation setUpdateCustomer(CustomerOutput arg) {
        optimisticData.put(getKey("updateCustomer"), arg);
        return this;
    }

    /**
     * Update customer address
     */
    public CustomerAddress getUpdateCustomerAddress() {
        return (CustomerAddress) get("updateCustomerAddress");
    }

    public Mutation setUpdateCustomerAddress(CustomerAddress arg) {
        optimisticData.put(getKey("updateCustomerAddress"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "addBundleProductsToCart": return true;

            case "addConfigurableProductsToCart": return true;

            case "addDownloadableProductsToCart": return true;

            case "addSimpleProductsToCart": return true;

            case "addVirtualProductsToCart": return true;

            case "applyCouponToCart": return true;

            case "changeCustomerPassword": return true;

            case "createBraintreeClientToken": return false;

            case "createCustomer": return true;

            case "createCustomerAddress": return true;

            case "createEmptyCart": return false;

            case "createPayflowProToken": return true;

            case "createPaypalExpressToken": return true;

            case "deleteCustomerAddress": return false;

            case "deletePaymentToken": return true;

            case "generateCustomerToken": return true;

            case "handlePayflowProResponse": return true;

            case "mergeCarts": return true;

            case "placeOrder": return true;

            case "removeCouponFromCart": return true;

            case "removeItemFromCart": return true;

            case "reorderItems": return true;

            case "requestPasswordResetEmail": return false;

            case "resetPassword": return false;

            case "revokeCustomerToken": return true;

            case "sendEmailToFriend": return true;

            case "setBillingAddressOnCart": return true;

            case "setGuestEmailOnCart": return true;

            case "setPaymentMethodAndPlaceOrder": return true;

            case "setPaymentMethodOnCart": return true;

            case "setShippingAddressesOnCart": return true;

            case "setShippingMethodsOnCart": return true;

            case "updateCartItems": return true;

            case "updateCustomer": return true;

            case "updateCustomerAddress": return true;

            default: return false;
        }
    }
}


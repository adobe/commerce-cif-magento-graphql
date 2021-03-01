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
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;

public class Cart extends AbstractResponse<Cart> {
    public Cart() {}

    public Cart(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "applied_coupon": {
                    AppliedCoupon optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new AppliedCoupon(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "applied_coupons": {
                    List<AppliedCoupon> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<AppliedCoupon> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            AppliedCoupon optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new AppliedCoupon(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "applied_gift_cards": {
                    List<AppliedGiftCard> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<AppliedGiftCard> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            AppliedGiftCard optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new AppliedGiftCard(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "applied_reward_points": {
                    RewardPointsAmount optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new RewardPointsAmount(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "applied_store_credit": {
                    AppliedStoreCredit optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new AppliedStoreCredit(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "available_gift_wrappings": {
                    List<GiftWrapping> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        GiftWrapping optional2 = null;
                        if (!element1.isJsonNull()) {
                            optional2 = new GiftWrapping(jsonAsObject(element1, key));
                        }

                        list1.add(optional2);
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "available_payment_methods": {
                    List<AvailablePaymentMethod> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<AvailablePaymentMethod> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            AvailablePaymentMethod optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new AvailablePaymentMethod(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "billing_address": {
                    BillingCartAddress optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new BillingCartAddress(jsonAsObject(field.getValue(), key));
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

                case "gift_message": {
                    GiftMessage optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new GiftMessage(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "gift_receipt_included": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "gift_wrapping": {
                    GiftWrapping optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new GiftWrapping(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "is_virtual": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "items": {
                    List<CartItemInterface> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<CartItemInterface> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            CartItemInterface optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = UnknownCartItemInterface.create(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "prices": {
                    CartPrices optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CartPrices(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "printed_card_included": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "selected_payment_method": {
                    SelectedPaymentMethod optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new SelectedPaymentMethod(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "shipping_addresses": {
                    List<ShippingCartAddress> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        ShippingCartAddress optional2 = null;
                        if (!element1.isJsonNull()) {
                            optional2 = new ShippingCartAddress(jsonAsObject(element1, key));
                        }

                        list1.add(optional2);
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "total_quantity": {
                    responseData.put(key, jsonAsDouble(field.getValue(), key));

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
        return "Cart";
    }

    /**
     * An array of coupons that have been applied to the cart
     *
     * @deprecated Use applied_coupons instead
     */
    @Deprecated
    public AppliedCoupon getAppliedCoupon() {
        return (AppliedCoupon) get("applied_coupon");
    }

    public Cart setAppliedCoupon(AppliedCoupon arg) {
        optimisticData.put(getKey("applied_coupon"), arg);
        return this;
    }

    /**
     * An array of `AppliedCoupon` objects. Each object contains the `code` text attribute, which specifies
     * the coupon code
     */
    public List<AppliedCoupon> getAppliedCoupons() {
        return (List<AppliedCoupon>) get("applied_coupons");
    }

    public Cart setAppliedCoupons(List<AppliedCoupon> arg) {
        optimisticData.put(getKey("applied_coupons"), arg);
        return this;
    }

    /**
     * Contains the code attribute, which specifies the applied gift card codes
     */
    public List<AppliedGiftCard> getAppliedGiftCards() {
        return (List<AppliedGiftCard>) get("applied_gift_cards");
    }

    public Cart setAppliedGiftCards(List<AppliedGiftCard> arg) {
        optimisticData.put(getKey("applied_gift_cards"), arg);
        return this;
    }

    /**
     * The amount of reward points applied to the cart
     */
    public RewardPointsAmount getAppliedRewardPoints() {
        return (RewardPointsAmount) get("applied_reward_points");
    }

    public Cart setAppliedRewardPoints(RewardPointsAmount arg) {
        optimisticData.put(getKey("applied_reward_points"), arg);
        return this;
    }

    /**
     * Contains store credit information applied on the cart
     */
    public AppliedStoreCredit getAppliedStoreCredit() {
        return (AppliedStoreCredit) get("applied_store_credit");
    }

    public Cart setAppliedStoreCredit(AppliedStoreCredit arg) {
        optimisticData.put(getKey("applied_store_credit"), arg);
        return this;
    }

    /**
     * The list of available gift wrapping options for the cart
     */
    public List<GiftWrapping> getAvailableGiftWrappings() {
        return (List<GiftWrapping>) get("available_gift_wrappings");
    }

    public Cart setAvailableGiftWrappings(List<GiftWrapping> arg) {
        optimisticData.put(getKey("available_gift_wrappings"), arg);
        return this;
    }

    /**
     * Available payment methods
     */
    public List<AvailablePaymentMethod> getAvailablePaymentMethods() {
        return (List<AvailablePaymentMethod>) get("available_payment_methods");
    }

    public Cart setAvailablePaymentMethods(List<AvailablePaymentMethod> arg) {
        optimisticData.put(getKey("available_payment_methods"), arg);
        return this;
    }

    public BillingCartAddress getBillingAddress() {
        return (BillingCartAddress) get("billing_address");
    }

    public Cart setBillingAddress(BillingCartAddress arg) {
        optimisticData.put(getKey("billing_address"), arg);
        return this;
    }

    public String getEmail() {
        return (String) get("email");
    }

    public Cart setEmail(String arg) {
        optimisticData.put(getKey("email"), arg);
        return this;
    }

    /**
     * The entered gift message for the cart
     */
    public GiftMessage getGiftMessage() {
        return (GiftMessage) get("gift_message");
    }

    public Cart setGiftMessage(GiftMessage arg) {
        optimisticData.put(getKey("gift_message"), arg);
        return this;
    }

    /**
     * Wether customer requested gift receipt for the cart
     */
    public Boolean getGiftReceiptIncluded() {
        return (Boolean) get("gift_receipt_included");
    }

    public Cart setGiftReceiptIncluded(Boolean arg) {
        optimisticData.put(getKey("gift_receipt_included"), arg);
        return this;
    }

    /**
     * The selected gift wrapping for the cart
     */
    public GiftWrapping getGiftWrapping() {
        return (GiftWrapping) get("gift_wrapping");
    }

    public Cart setGiftWrapping(GiftWrapping arg) {
        optimisticData.put(getKey("gift_wrapping"), arg);
        return this;
    }

    /**
     * The unique ID for a `Cart` object
     */
    public ID getId() {
        return (ID) get("id");
    }

    public Cart setId(ID arg) {
        optimisticData.put(getKey("id"), arg);
        return this;
    }

    public Boolean getIsVirtual() {
        return (Boolean) get("is_virtual");
    }

    public Cart setIsVirtual(Boolean arg) {
        optimisticData.put(getKey("is_virtual"), arg);
        return this;
    }

    public List<CartItemInterface> getItems() {
        return (List<CartItemInterface>) get("items");
    }

    public Cart setItems(List<CartItemInterface> arg) {
        optimisticData.put(getKey("items"), arg);
        return this;
    }

    public CartPrices getPrices() {
        return (CartPrices) get("prices");
    }

    public Cart setPrices(CartPrices arg) {
        optimisticData.put(getKey("prices"), arg);
        return this;
    }

    /**
     * Wether customer requested printed card for the cart
     */
    public Boolean getPrintedCardIncluded() {
        return (Boolean) get("printed_card_included");
    }

    public Cart setPrintedCardIncluded(Boolean arg) {
        optimisticData.put(getKey("printed_card_included"), arg);
        return this;
    }

    public SelectedPaymentMethod getSelectedPaymentMethod() {
        return (SelectedPaymentMethod) get("selected_payment_method");
    }

    public Cart setSelectedPaymentMethod(SelectedPaymentMethod arg) {
        optimisticData.put(getKey("selected_payment_method"), arg);
        return this;
    }

    public List<ShippingCartAddress> getShippingAddresses() {
        return (List<ShippingCartAddress>) get("shipping_addresses");
    }

    public Cart setShippingAddresses(List<ShippingCartAddress> arg) {
        optimisticData.put(getKey("shipping_addresses"), arg);
        return this;
    }

    public Double getTotalQuantity() {
        return (Double) get("total_quantity");
    }

    public Cart setTotalQuantity(Double arg) {
        optimisticData.put(getKey("total_quantity"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "applied_coupon":
                return true;

            case "applied_coupons":
                return true;

            case "applied_gift_cards":
                return true;

            case "applied_reward_points":
                return true;

            case "applied_store_credit":
                return true;

            case "available_gift_wrappings":
                return true;

            case "available_payment_methods":
                return true;

            case "billing_address":
                return true;

            case "email":
                return false;

            case "gift_message":
                return true;

            case "gift_receipt_included":
                return false;

            case "gift_wrapping":
                return true;

            case "id":
                return false;

            case "is_virtual":
                return false;

            case "items":
                return false;

            case "prices":
                return true;

            case "printed_card_included":
                return false;

            case "selected_payment_method":
                return true;

            case "shipping_addresses":
                return true;

            case "total_quantity":
                return false;

            default:
                return false;
        }
    }
}

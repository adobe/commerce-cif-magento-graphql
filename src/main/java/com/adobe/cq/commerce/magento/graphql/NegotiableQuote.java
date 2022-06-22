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

/**
 * Contains details about a negotiable quote.
 */
public class NegotiableQuote extends AbstractResponse<NegotiableQuote> {
    public NegotiableQuote() {}

    public NegotiableQuote(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
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
                    NegotiableQuoteBillingAddress optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new NegotiableQuoteBillingAddress(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "buyer": {
                    responseData.put(key, new NegotiableQuoteUser(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "comments": {
                    List<NegotiableQuoteComment> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<NegotiableQuoteComment> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            NegotiableQuoteComment optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new NegotiableQuoteComment(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
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

                case "email": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "history": {
                    List<NegotiableQuoteHistoryEntry> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<NegotiableQuoteHistoryEntry> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            NegotiableQuoteHistoryEntry optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new NegotiableQuoteHistoryEntry(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

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

                case "name": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

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

                case "selected_payment_method": {
                    SelectedPaymentMethod optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new SelectedPaymentMethod(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "shipping_addresses": {
                    List<NegotiableQuoteShippingAddress> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        NegotiableQuoteShippingAddress optional2 = null;
                        if (!element1.isJsonNull()) {
                            optional2 = new NegotiableQuoteShippingAddress(jsonAsObject(element1, key));
                        }

                        list1.add(optional2);
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "status": {
                    responseData.put(key, NegotiableQuoteStatus.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "total_quantity": {
                    responseData.put(key, jsonAsDouble(field.getValue(), key));

                    break;
                }

                case "uid": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "updated_at": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
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
        return "NegotiableQuote";
    }

    /**
     * An array of payment methods that can be applied to the negotiable quote.
     */
    public List<AvailablePaymentMethod> getAvailablePaymentMethods() {
        return (List<AvailablePaymentMethod>) get("available_payment_methods");
    }

    public NegotiableQuote setAvailablePaymentMethods(List<AvailablePaymentMethod> arg) {
        optimisticData.put(getKey("available_payment_methods"), arg);
        return this;
    }

    /**
     * The billing address applied to the negotiable quote.
     */
    public NegotiableQuoteBillingAddress getBillingAddress() {
        return (NegotiableQuoteBillingAddress) get("billing_address");
    }

    public NegotiableQuote setBillingAddress(NegotiableQuoteBillingAddress arg) {
        optimisticData.put(getKey("billing_address"), arg);
        return this;
    }

    /**
     * The first and last name of the buyer.
     */
    public NegotiableQuoteUser getBuyer() {
        return (NegotiableQuoteUser) get("buyer");
    }

    public NegotiableQuote setBuyer(NegotiableQuoteUser arg) {
        optimisticData.put(getKey("buyer"), arg);
        return this;
    }

    /**
     * A list of comments made by the buyer and seller.
     */
    public List<NegotiableQuoteComment> getComments() {
        return (List<NegotiableQuoteComment>) get("comments");
    }

    public NegotiableQuote setComments(List<NegotiableQuoteComment> arg) {
        optimisticData.put(getKey("comments"), arg);
        return this;
    }

    /**
     * Timestamp indicating when the negotiable quote was created.
     */
    public String getCreatedAt() {
        return (String) get("created_at");
    }

    public NegotiableQuote setCreatedAt(String arg) {
        optimisticData.put(getKey("created_at"), arg);
        return this;
    }

    /**
     * The email address of the company user.
     */
    public String getEmail() {
        return (String) get("email");
    }

    public NegotiableQuote setEmail(String arg) {
        optimisticData.put(getKey("email"), arg);
        return this;
    }

    /**
     * A list of status and price changes for the negotiable quote.
     */
    public List<NegotiableQuoteHistoryEntry> getHistory() {
        return (List<NegotiableQuoteHistoryEntry>) get("history");
    }

    public NegotiableQuote setHistory(List<NegotiableQuoteHistoryEntry> arg) {
        optimisticData.put(getKey("history"), arg);
        return this;
    }

    /**
     * Indicates whether the negotiable quote contains only virtual products.
     */
    public Boolean getIsVirtual() {
        return (Boolean) get("is_virtual");
    }

    public NegotiableQuote setIsVirtual(Boolean arg) {
        optimisticData.put(getKey("is_virtual"), arg);
        return this;
    }

    /**
     * The list of items in the negotiable quote.
     */
    public List<CartItemInterface> getItems() {
        return (List<CartItemInterface>) get("items");
    }

    public NegotiableQuote setItems(List<CartItemInterface> arg) {
        optimisticData.put(getKey("items"), arg);
        return this;
    }

    /**
     * The title assigned to the negotiable quote.
     */
    public String getName() {
        return (String) get("name");
    }

    public NegotiableQuote setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    /**
     * A set of subtotals and totals applied to the negotiable quote.
     */
    public CartPrices getPrices() {
        return (CartPrices) get("prices");
    }

    public NegotiableQuote setPrices(CartPrices arg) {
        optimisticData.put(getKey("prices"), arg);
        return this;
    }

    /**
     * The payment method that was applied to the negotiable quote.
     */
    public SelectedPaymentMethod getSelectedPaymentMethod() {
        return (SelectedPaymentMethod) get("selected_payment_method");
    }

    public NegotiableQuote setSelectedPaymentMethod(SelectedPaymentMethod arg) {
        optimisticData.put(getKey("selected_payment_method"), arg);
        return this;
    }

    /**
     * A list of shipping addresses applied to the negotiable quote.
     */
    public List<NegotiableQuoteShippingAddress> getShippingAddresses() {
        return (List<NegotiableQuoteShippingAddress>) get("shipping_addresses");
    }

    public NegotiableQuote setShippingAddresses(List<NegotiableQuoteShippingAddress> arg) {
        optimisticData.put(getKey("shipping_addresses"), arg);
        return this;
    }

    /**
     * The status of the negotiable quote.
     */
    public NegotiableQuoteStatus getStatus() {
        return (NegotiableQuoteStatus) get("status");
    }

    public NegotiableQuote setStatus(NegotiableQuoteStatus arg) {
        optimisticData.put(getKey("status"), arg);
        return this;
    }

    /**
     * The total number of items in the negotiable quote.
     */
    public Double getTotalQuantity() {
        return (Double) get("total_quantity");
    }

    public NegotiableQuote setTotalQuantity(Double arg) {
        optimisticData.put(getKey("total_quantity"), arg);
        return this;
    }

    /**
     * The unique ID of a `NegotiableQuote` object.
     */
    public ID getUid() {
        return (ID) get("uid");
    }

    public NegotiableQuote setUid(ID arg) {
        optimisticData.put(getKey("uid"), arg);
        return this;
    }

    /**
     * Timestamp indicating when the negotiable quote was updated.
     */
    public String getUpdatedAt() {
        return (String) get("updated_at");
    }

    public NegotiableQuote setUpdatedAt(String arg) {
        optimisticData.put(getKey("updated_at"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "available_payment_methods":
                return true;

            case "billing_address":
                return true;

            case "buyer":
                return true;

            case "comments":
                return true;

            case "created_at":
                return false;

            case "email":
                return false;

            case "history":
                return true;

            case "is_virtual":
                return false;

            case "items":
                return false;

            case "name":
                return false;

            case "prices":
                return true;

            case "selected_payment_method":
                return true;

            case "shipping_addresses":
                return true;

            case "status":
                return false;

            case "total_quantity":
                return false;

            case "uid":
                return false;

            case "updated_at":
                return false;

            default:
                return false;
        }
    }
}

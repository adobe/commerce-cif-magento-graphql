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
 * Contains details about each of the customer&#39;s orders
 */
public class CustomerOrder extends AbstractResponse<CustomerOrder> {
    public CustomerOrder() {
    }

    public CustomerOrder(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "billing_address": {
                    OrderAddress optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new OrderAddress(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "carrier": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "comments": {
                    List<SalesCommentItem> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<SalesCommentItem> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            SalesCommentItem optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new SalesCommentItem(jsonAsObject(element1, key));
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

                case "credit_memos": {
                    List<CreditMemo> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<CreditMemo> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            CreditMemo optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new CreditMemo(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
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

                case "grand_total": {
                    Double optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsDouble(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "increment_id": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "invoices": {
                    List<Invoice> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        Invoice optional2 = null;
                        if (!element1.isJsonNull()) {
                            optional2 = new Invoice(jsonAsObject(element1, key));
                        }

                        list1.add(optional2);
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "items": {
                    List<OrderItemInterface> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<OrderItemInterface> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            OrderItemInterface optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = UnknownOrderItemInterface.create(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "number": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "order_date": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "order_number": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "payment_methods": {
                    List<OrderPaymentMethod> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<OrderPaymentMethod> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            OrderPaymentMethod optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new OrderPaymentMethod(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "printed_card_included": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "shipments": {
                    List<OrderShipment> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<OrderShipment> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            OrderShipment optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new OrderShipment(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "shipping_address": {
                    OrderAddress optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new OrderAddress(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "shipping_method": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "status": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "total": {
                    OrderTotal optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new OrderTotal(jsonAsObject(field.getValue(), key));
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
        return "CustomerOrder";
    }

    /**
     * The billing address for the order
     */
    public OrderAddress getBillingAddress() {
        return (OrderAddress) get("billing_address");
    }

    public CustomerOrder setBillingAddress(OrderAddress arg) {
        optimisticData.put(getKey("billing_address"), arg);
        return this;
    }

    /**
     * The shipping carrier for the order delivery
     */
    public String getCarrier() {
        return (String) get("carrier");
    }

    public CustomerOrder setCarrier(String arg) {
        optimisticData.put(getKey("carrier"), arg);
        return this;
    }

    /**
     * Comments about the order
     */
    public List<SalesCommentItem> getComments() {
        return (List<SalesCommentItem>) get("comments");
    }

    public CustomerOrder setComments(List<SalesCommentItem> arg) {
        optimisticData.put(getKey("comments"), arg);
        return this;
    }

    /**
     * @deprecated Use the order_date attribute instead
     */
    @Deprecated
    public String getCreatedAt() {
        return (String) get("created_at");
    }

    public CustomerOrder setCreatedAt(String arg) {
        optimisticData.put(getKey("created_at"), arg);
        return this;
    }

    /**
     * A list of credit memos
     */
    public List<CreditMemo> getCreditMemos() {
        return (List<CreditMemo>) get("credit_memos");
    }

    public CustomerOrder setCreditMemos(List<CreditMemo> arg) {
        optimisticData.put(getKey("credit_memos"), arg);
        return this;
    }

    /**
     * The entered gift message for the order
     */
    public GiftMessage getGiftMessage() {
        return (GiftMessage) get("gift_message");
    }

    public CustomerOrder setGiftMessage(GiftMessage arg) {
        optimisticData.put(getKey("gift_message"), arg);
        return this;
    }

    /**
     * Whether customer requested gift receipt for the order
     */
    public Boolean getGiftReceiptIncluded() {
        return (Boolean) get("gift_receipt_included");
    }

    public CustomerOrder setGiftReceiptIncluded(Boolean arg) {
        optimisticData.put(getKey("gift_receipt_included"), arg);
        return this;
    }

    /**
     * The selected gift wrapping for the order
     */
    public GiftWrapping getGiftWrapping() {
        return (GiftWrapping) get("gift_wrapping");
    }

    public CustomerOrder setGiftWrapping(GiftWrapping arg) {
        optimisticData.put(getKey("gift_wrapping"), arg);
        return this;
    }

    /**
     * @deprecated Use the totals.grand_total attribute instead
     */
    @Deprecated
    public Double getGrandTotal() {
        return (Double) get("grand_total");
    }

    public CustomerOrder setGrandTotal(Double arg) {
        optimisticData.put(getKey("grand_total"), arg);
        return this;
    }

    /**
     * Unique identifier for the order
     */
    public ID getId() {
        return (ID) get("id");
    }

    public CustomerOrder setId(ID arg) {
        optimisticData.put(getKey("id"), arg);
        return this;
    }

    /**
     * @deprecated Use the id attribute instead
     */
    @Deprecated
    public String getIncrementId() {
        return (String) get("increment_id");
    }

    public CustomerOrder setIncrementId(String arg) {
        optimisticData.put(getKey("increment_id"), arg);
        return this;
    }

    /**
     * A list of invoices for the order
     */
    public List<Invoice> getInvoices() {
        return (List<Invoice>) get("invoices");
    }

    public CustomerOrder setInvoices(List<Invoice> arg) {
        optimisticData.put(getKey("invoices"), arg);
        return this;
    }

    /**
     * An array containing the items purchased in this order
     */
    public List<OrderItemInterface> getItems() {
        return (List<OrderItemInterface>) get("items");
    }

    public CustomerOrder setItems(List<OrderItemInterface> arg) {
        optimisticData.put(getKey("items"), arg);
        return this;
    }

    /**
     * The order number
     */
    public String getNumber() {
        return (String) get("number");
    }

    public CustomerOrder setNumber(String arg) {
        optimisticData.put(getKey("number"), arg);
        return this;
    }

    /**
     * The date the order was placed
     */
    public String getOrderDate() {
        return (String) get("order_date");
    }

    public CustomerOrder setOrderDate(String arg) {
        optimisticData.put(getKey("order_date"), arg);
        return this;
    }

    /**
     * @deprecated Use the number attribute instead
     */
    @Deprecated
    public String getOrderNumber() {
        return (String) get("order_number");
    }

    public CustomerOrder setOrderNumber(String arg) {
        optimisticData.put(getKey("order_number"), arg);
        return this;
    }

    /**
     * Payment details for the order
     */
    public List<OrderPaymentMethod> getPaymentMethods() {
        return (List<OrderPaymentMethod>) get("payment_methods");
    }

    public CustomerOrder setPaymentMethods(List<OrderPaymentMethod> arg) {
        optimisticData.put(getKey("payment_methods"), arg);
        return this;
    }

    /**
     * Whether customer requested printed card for the order
     */
    public Boolean getPrintedCardIncluded() {
        return (Boolean) get("printed_card_included");
    }

    public CustomerOrder setPrintedCardIncluded(Boolean arg) {
        optimisticData.put(getKey("printed_card_included"), arg);
        return this;
    }

    /**
     * A list of shipments for the order
     */
    public List<OrderShipment> getShipments() {
        return (List<OrderShipment>) get("shipments");
    }

    public CustomerOrder setShipments(List<OrderShipment> arg) {
        optimisticData.put(getKey("shipments"), arg);
        return this;
    }

    /**
     * The shipping address for the order
     */
    public OrderAddress getShippingAddress() {
        return (OrderAddress) get("shipping_address");
    }

    public CustomerOrder setShippingAddress(OrderAddress arg) {
        optimisticData.put(getKey("shipping_address"), arg);
        return this;
    }

    /**
     * The delivery method for the order
     */
    public String getShippingMethod() {
        return (String) get("shipping_method");
    }

    public CustomerOrder setShippingMethod(String arg) {
        optimisticData.put(getKey("shipping_method"), arg);
        return this;
    }

    /**
     * The current status of the order
     */
    public String getStatus() {
        return (String) get("status");
    }

    public CustomerOrder setStatus(String arg) {
        optimisticData.put(getKey("status"), arg);
        return this;
    }

    /**
     * Contains details about the calculated totals for this order
     */
    public OrderTotal getTotal() {
        return (OrderTotal) get("total");
    }

    public CustomerOrder setTotal(OrderTotal arg) {
        optimisticData.put(getKey("total"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "billing_address": return true;

            case "carrier": return false;

            case "comments": return true;

            case "created_at": return false;

            case "credit_memos": return true;

            case "gift_message": return true;

            case "gift_receipt_included": return false;

            case "gift_wrapping": return true;

            case "grand_total": return false;

            case "id": return false;

            case "increment_id": return false;

            case "invoices": return true;

            case "items": return false;

            case "number": return false;

            case "order_date": return false;

            case "order_number": return false;

            case "payment_methods": return true;

            case "printed_card_included": return false;

            case "shipments": return true;

            case "shipping_address": return true;

            case "shipping_method": return false;

            case "status": return false;

            case "total": return true;

            default: return false;
        }
    }
}

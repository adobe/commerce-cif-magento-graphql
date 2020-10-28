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

import java.io.Serializable;

import com.shopify.graphql.support.AbstractQuery;
import com.shopify.graphql.support.Input;

public class PaymentMethodInput implements Serializable {
    private String code;

    private Input<BraintreeInput> braintree = Input.undefined();

    private Input<BraintreeCcVaultInput> braintreeCcVault = Input.undefined();

    private Input<HostedProInput> hostedPro = Input.undefined();

    private Input<KlarnaInput> klarna = Input.undefined();

    private Input<PayflowExpressInput> payflowExpress = Input.undefined();

    private Input<PayflowLinkInput> payflowLink = Input.undefined();

    private Input<PayflowProInput> payflowpro = Input.undefined();

    private Input<VaultTokenInput> payflowproCcVault = Input.undefined();

    private Input<PaypalExpressInput> paypalExpress = Input.undefined();

    private Input<String> purchaseOrderNumber = Input.undefined();

    public PaymentMethodInput(String code) {
        this.code = code;
    }

    /**
     * Payment method code
     */
    public String getCode() {
        return code;
    }

    /**
     * Payment method code
     */
    public PaymentMethodInput setCode(String code) {
        this.code = code;
        return this;
    }

    public BraintreeInput getBraintree() {
        return braintree.getValue();
    }

    public Input<BraintreeInput> getBraintreeInput() {
        return braintree;
    }

    public PaymentMethodInput setBraintree(BraintreeInput braintree) {
        this.braintree = Input.optional(braintree);
        return this;
    }

    public PaymentMethodInput setBraintreeInput(Input<BraintreeInput> braintree) {
        if (braintree == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.braintree = braintree;
        return this;
    }

    public BraintreeCcVaultInput getBraintreeCcVault() {
        return braintreeCcVault.getValue();
    }

    public Input<BraintreeCcVaultInput> getBraintreeCcVaultInput() {
        return braintreeCcVault;
    }

    public PaymentMethodInput setBraintreeCcVault(BraintreeCcVaultInput braintreeCcVault) {
        this.braintreeCcVault = Input.optional(braintreeCcVault);
        return this;
    }

    public PaymentMethodInput setBraintreeCcVaultInput(Input<BraintreeCcVaultInput> braintreeCcVault) {
        if (braintreeCcVault == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.braintreeCcVault = braintreeCcVault;
        return this;
    }

    /**
     * Required input for PayPal Hosted pro payments
     */
    public HostedProInput getHostedPro() {
        return hostedPro.getValue();
    }

    /**
     * Required input for PayPal Hosted pro payments
     */
    public Input<HostedProInput> getHostedProInput() {
        return hostedPro;
    }

    /**
     * Required input for PayPal Hosted pro payments
     */
    public PaymentMethodInput setHostedPro(HostedProInput hostedPro) {
        this.hostedPro = Input.optional(hostedPro);
        return this;
    }

    /**
     * Required input for PayPal Hosted pro payments
     */
    public PaymentMethodInput setHostedProInput(Input<HostedProInput> hostedPro) {
        if (hostedPro == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.hostedPro = hostedPro;
        return this;
    }

    public KlarnaInput getKlarna() {
        return klarna.getValue();
    }

    public Input<KlarnaInput> getKlarnaInput() {
        return klarna;
    }

    public PaymentMethodInput setKlarna(KlarnaInput klarna) {
        this.klarna = Input.optional(klarna);
        return this;
    }

    public PaymentMethodInput setKlarnaInput(Input<KlarnaInput> klarna) {
        if (klarna == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.klarna = klarna;
        return this;
    }

    /**
     * Required input for Payflow Express Checkout payments
     */
    public PayflowExpressInput getPayflowExpress() {
        return payflowExpress.getValue();
    }

    /**
     * Required input for Payflow Express Checkout payments
     */
    public Input<PayflowExpressInput> getPayflowExpressInput() {
        return payflowExpress;
    }

    /**
     * Required input for Payflow Express Checkout payments
     */
    public PaymentMethodInput setPayflowExpress(PayflowExpressInput payflowExpress) {
        this.payflowExpress = Input.optional(payflowExpress);
        return this;
    }

    /**
     * Required input for Payflow Express Checkout payments
     */
    public PaymentMethodInput setPayflowExpressInput(Input<PayflowExpressInput> payflowExpress) {
        if (payflowExpress == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.payflowExpress = payflowExpress;
        return this;
    }

    /**
     * Required input for PayPal Payflow Link and Payments Advanced payments
     */
    public PayflowLinkInput getPayflowLink() {
        return payflowLink.getValue();
    }

    /**
     * Required input for PayPal Payflow Link and Payments Advanced payments
     */
    public Input<PayflowLinkInput> getPayflowLinkInput() {
        return payflowLink;
    }

    /**
     * Required input for PayPal Payflow Link and Payments Advanced payments
     */
    public PaymentMethodInput setPayflowLink(PayflowLinkInput payflowLink) {
        this.payflowLink = Input.optional(payflowLink);
        return this;
    }

    /**
     * Required input for PayPal Payflow Link and Payments Advanced payments
     */
    public PaymentMethodInput setPayflowLinkInput(Input<PayflowLinkInput> payflowLink) {
        if (payflowLink == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.payflowLink = payflowLink;
        return this;
    }

    /**
     * Required input type for PayPal Payflow Pro and Payment Pro payments
     */
    public PayflowProInput getPayflowpro() {
        return payflowpro.getValue();
    }

    /**
     * Required input type for PayPal Payflow Pro and Payment Pro payments
     */
    public Input<PayflowProInput> getPayflowproInput() {
        return payflowpro;
    }

    /**
     * Required input type for PayPal Payflow Pro and Payment Pro payments
     */
    public PaymentMethodInput setPayflowpro(PayflowProInput payflowpro) {
        this.payflowpro = Input.optional(payflowpro);
        return this;
    }

    /**
     * Required input type for PayPal Payflow Pro and Payment Pro payments
     */
    public PaymentMethodInput setPayflowproInput(Input<PayflowProInput> payflowpro) {
        if (payflowpro == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.payflowpro = payflowpro;
        return this;
    }

    /**
     * Required input type for PayPal Payflow Pro vault payments
     */
    public VaultTokenInput getPayflowproCcVault() {
        return payflowproCcVault.getValue();
    }

    /**
     * Required input type for PayPal Payflow Pro vault payments
     */
    public Input<VaultTokenInput> getPayflowproCcVaultInput() {
        return payflowproCcVault;
    }

    /**
     * Required input type for PayPal Payflow Pro vault payments
     */
    public PaymentMethodInput setPayflowproCcVault(VaultTokenInput payflowproCcVault) {
        this.payflowproCcVault = Input.optional(payflowproCcVault);
        return this;
    }

    /**
     * Required input type for PayPal Payflow Pro vault payments
     */
    public PaymentMethodInput setPayflowproCcVaultInput(Input<VaultTokenInput> payflowproCcVault) {
        if (payflowproCcVault == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.payflowproCcVault = payflowproCcVault;
        return this;
    }

    /**
     * Required input for Express Checkout and Payments Standard payments
     */
    public PaypalExpressInput getPaypalExpress() {
        return paypalExpress.getValue();
    }

    /**
     * Required input for Express Checkout and Payments Standard payments
     */
    public Input<PaypalExpressInput> getPaypalExpressInput() {
        return paypalExpress;
    }

    /**
     * Required input for Express Checkout and Payments Standard payments
     */
    public PaymentMethodInput setPaypalExpress(PaypalExpressInput paypalExpress) {
        this.paypalExpress = Input.optional(paypalExpress);
        return this;
    }

    /**
     * Required input for Express Checkout and Payments Standard payments
     */
    public PaymentMethodInput setPaypalExpressInput(Input<PaypalExpressInput> paypalExpress) {
        if (paypalExpress == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.paypalExpress = paypalExpress;
        return this;
    }

    /**
     * Purchase order number
     */
    public String getPurchaseOrderNumber() {
        return purchaseOrderNumber.getValue();
    }

    /**
     * Purchase order number
     */
    public Input<String> getPurchaseOrderNumberInput() {
        return purchaseOrderNumber;
    }

    /**
     * Purchase order number
     */
    public PaymentMethodInput setPurchaseOrderNumber(String purchaseOrderNumber) {
        this.purchaseOrderNumber = Input.optional(purchaseOrderNumber);
        return this;
    }

    /**
     * Purchase order number
     */
    public PaymentMethodInput setPurchaseOrderNumberInput(Input<String> purchaseOrderNumber) {
        if (purchaseOrderNumber == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.purchaseOrderNumber = purchaseOrderNumber;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("code:");
        AbstractQuery.appendQuotedString(_queryBuilder, code.toString());

        if (this.braintree.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("braintree:");
            if (braintree.getValue() != null) {
                braintree.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.braintreeCcVault.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("braintree_cc_vault:");
            if (braintreeCcVault.getValue() != null) {
                braintreeCcVault.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.hostedPro.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("hosted_pro:");
            if (hostedPro.getValue() != null) {
                hostedPro.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.klarna.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("klarna:");
            if (klarna.getValue() != null) {
                klarna.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.payflowExpress.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("payflow_express:");
            if (payflowExpress.getValue() != null) {
                payflowExpress.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.payflowLink.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("payflow_link:");
            if (payflowLink.getValue() != null) {
                payflowLink.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.payflowpro.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("payflowpro:");
            if (payflowpro.getValue() != null) {
                payflowpro.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.payflowproCcVault.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("payflowpro_cc_vault:");
            if (payflowproCcVault.getValue() != null) {
                payflowproCcVault.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.paypalExpress.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("paypal_express:");
            if (paypalExpress.getValue() != null) {
                paypalExpress.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.purchaseOrderNumber.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("purchase_order_number:");
            if (purchaseOrderNumber.getValue() != null) {
                AbstractQuery.appendQuotedString(_queryBuilder, purchaseOrderNumber.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}

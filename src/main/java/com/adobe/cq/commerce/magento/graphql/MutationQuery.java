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

import com.shopify.graphql.support.AbstractQuery;
import com.shopify.graphql.support.Arguments;

public class MutationQuery extends AbstractQuery<MutationQuery> {
    MutationQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public class AddBundleProductsToCartArguments extends Arguments {
        AddBundleProductsToCartArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        public AddBundleProductsToCartArguments input(AddBundleProductsToCartInput value) {
            if (value != null) {
                startArgument("input");
                value.appendTo(_queryBuilder);
            }
            return this;
        }
    }

    public interface AddBundleProductsToCartArgumentsDefinition {
        void define(AddBundleProductsToCartArguments args);
    }

    public MutationQuery addBundleProductsToCart(AddBundleProductsToCartOutputQueryDefinition queryDef) {
        return addBundleProductsToCart(args -> {}, queryDef);
    }

    public MutationQuery addBundleProductsToCart(AddBundleProductsToCartArgumentsDefinition argsDef, AddBundleProductsToCartOutputQueryDefinition queryDef) {
        startField("addBundleProductsToCart");

        AddBundleProductsToCartArguments args = new AddBundleProductsToCartArguments(_queryBuilder);
        argsDef.define(args);
        AddBundleProductsToCartArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new AddBundleProductsToCartOutputQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class AddConfigurableProductsToCartArguments extends Arguments {
        AddConfigurableProductsToCartArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        public AddConfigurableProductsToCartArguments input(AddConfigurableProductsToCartInput value) {
            if (value != null) {
                startArgument("input");
                value.appendTo(_queryBuilder);
            }
            return this;
        }
    }

    public interface AddConfigurableProductsToCartArgumentsDefinition {
        void define(AddConfigurableProductsToCartArguments args);
    }

    public MutationQuery addConfigurableProductsToCart(AddConfigurableProductsToCartOutputQueryDefinition queryDef) {
        return addConfigurableProductsToCart(args -> {}, queryDef);
    }

    public MutationQuery addConfigurableProductsToCart(AddConfigurableProductsToCartArgumentsDefinition argsDef, AddConfigurableProductsToCartOutputQueryDefinition queryDef) {
        startField("addConfigurableProductsToCart");

        AddConfigurableProductsToCartArguments args = new AddConfigurableProductsToCartArguments(_queryBuilder);
        argsDef.define(args);
        AddConfigurableProductsToCartArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new AddConfigurableProductsToCartOutputQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class AddDownloadableProductsToCartArguments extends Arguments {
        AddDownloadableProductsToCartArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        public AddDownloadableProductsToCartArguments input(AddDownloadableProductsToCartInput value) {
            if (value != null) {
                startArgument("input");
                value.appendTo(_queryBuilder);
            }
            return this;
        }
    }

    public interface AddDownloadableProductsToCartArgumentsDefinition {
        void define(AddDownloadableProductsToCartArguments args);
    }

    public MutationQuery addDownloadableProductsToCart(AddDownloadableProductsToCartOutputQueryDefinition queryDef) {
        return addDownloadableProductsToCart(args -> {}, queryDef);
    }

    public MutationQuery addDownloadableProductsToCart(AddDownloadableProductsToCartArgumentsDefinition argsDef, AddDownloadableProductsToCartOutputQueryDefinition queryDef) {
        startField("addDownloadableProductsToCart");

        AddDownloadableProductsToCartArguments args = new AddDownloadableProductsToCartArguments(_queryBuilder);
        argsDef.define(args);
        AddDownloadableProductsToCartArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new AddDownloadableProductsToCartOutputQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class AddSimpleProductsToCartArguments extends Arguments {
        AddSimpleProductsToCartArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        public AddSimpleProductsToCartArguments input(AddSimpleProductsToCartInput value) {
            if (value != null) {
                startArgument("input");
                value.appendTo(_queryBuilder);
            }
            return this;
        }
    }

    public interface AddSimpleProductsToCartArgumentsDefinition {
        void define(AddSimpleProductsToCartArguments args);
    }

    public MutationQuery addSimpleProductsToCart(AddSimpleProductsToCartOutputQueryDefinition queryDef) {
        return addSimpleProductsToCart(args -> {}, queryDef);
    }

    public MutationQuery addSimpleProductsToCart(AddSimpleProductsToCartArgumentsDefinition argsDef, AddSimpleProductsToCartOutputQueryDefinition queryDef) {
        startField("addSimpleProductsToCart");

        AddSimpleProductsToCartArguments args = new AddSimpleProductsToCartArguments(_queryBuilder);
        argsDef.define(args);
        AddSimpleProductsToCartArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new AddSimpleProductsToCartOutputQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class AddVirtualProductsToCartArguments extends Arguments {
        AddVirtualProductsToCartArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        public AddVirtualProductsToCartArguments input(AddVirtualProductsToCartInput value) {
            if (value != null) {
                startArgument("input");
                value.appendTo(_queryBuilder);
            }
            return this;
        }
    }

    public interface AddVirtualProductsToCartArgumentsDefinition {
        void define(AddVirtualProductsToCartArguments args);
    }

    public MutationQuery addVirtualProductsToCart(AddVirtualProductsToCartOutputQueryDefinition queryDef) {
        return addVirtualProductsToCart(args -> {}, queryDef);
    }

    public MutationQuery addVirtualProductsToCart(AddVirtualProductsToCartArgumentsDefinition argsDef, AddVirtualProductsToCartOutputQueryDefinition queryDef) {
        startField("addVirtualProductsToCart");

        AddVirtualProductsToCartArguments args = new AddVirtualProductsToCartArguments(_queryBuilder);
        argsDef.define(args);
        AddVirtualProductsToCartArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new AddVirtualProductsToCartOutputQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class ApplyCouponToCartArguments extends Arguments {
        ApplyCouponToCartArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        public ApplyCouponToCartArguments input(ApplyCouponToCartInput value) {
            if (value != null) {
                startArgument("input");
                value.appendTo(_queryBuilder);
            }
            return this;
        }
    }

    public interface ApplyCouponToCartArgumentsDefinition {
        void define(ApplyCouponToCartArguments args);
    }

    public MutationQuery applyCouponToCart(ApplyCouponToCartOutputQueryDefinition queryDef) {
        return applyCouponToCart(args -> {}, queryDef);
    }

    public MutationQuery applyCouponToCart(ApplyCouponToCartArgumentsDefinition argsDef, ApplyCouponToCartOutputQueryDefinition queryDef) {
        startField("applyCouponToCart");

        ApplyCouponToCartArguments args = new ApplyCouponToCartArguments(_queryBuilder);
        argsDef.define(args);
        ApplyCouponToCartArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ApplyCouponToCartOutputQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Changes the password for the logged-in customer
     */
    public MutationQuery changeCustomerPassword(String currentPassword, String newPassword, CustomerQueryDefinition queryDef) {
        startField("changeCustomerPassword");

        _queryBuilder.append("(currentPassword:");
        AbstractQuery.appendQuotedString(_queryBuilder, currentPassword.toString());

        _queryBuilder.append(",newPassword:");
        AbstractQuery.appendQuotedString(_queryBuilder, newPassword.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CustomerQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Creates Client Token for Braintree Javascript SDK initialization.
     */
    public MutationQuery createBraintreeClientToken() {
        startField("createBraintreeClientToken");

        return this;
    }

    /**
     * Create customer account
     */
    public MutationQuery createCustomer(CustomerInput input, CustomerOutputQueryDefinition queryDef) {
        startField("createCustomer");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CustomerOutputQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Create customer address
     */
    public MutationQuery createCustomerAddress(CustomerAddressInput input, CustomerAddressQueryDefinition queryDef) {
        startField("createCustomerAddress");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CustomerAddressQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class CreateEmptyCartArguments extends Arguments {
        CreateEmptyCartArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        public CreateEmptyCartArguments input(createEmptyCartInput value) {
            if (value != null) {
                startArgument("input");
                value.appendTo(_queryBuilder);
            }
            return this;
        }
    }

    public interface CreateEmptyCartArgumentsDefinition {
        void define(CreateEmptyCartArguments args);
    }

    /**
     * Creates an empty shopping cart for a guest or logged in user
     */
    public MutationQuery createEmptyCart() {
        return createEmptyCart(args -> {});
    }

    /**
     * Creates an empty shopping cart for a guest or logged in user
     */
    public MutationQuery createEmptyCart(CreateEmptyCartArgumentsDefinition argsDef) {
        startField("createEmptyCart");

        CreateEmptyCartArguments args = new CreateEmptyCartArguments(_queryBuilder);
        argsDef.define(args);
        CreateEmptyCartArguments.end(args);

        return this;
    }

    /**
     * Initiates a transaction and receives a token. Use this mutation for Payflow Pro and Payments Pro
     * payment methods
     */
    public MutationQuery createPayflowProToken(PayflowProTokenInput input, CreatePayflowProTokenOutputQueryDefinition queryDef) {
        startField("createPayflowProToken");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CreatePayflowProTokenOutputQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Initiates an Express Checkout transaction and receives a token. Use this mutation for Express
     * Checkout and Payments Standard payment methods.
     */
    public MutationQuery createPaypalExpressToken(PaypalExpressTokenInput input, PaypalExpressTokenOutputQueryDefinition queryDef) {
        startField("createPaypalExpressToken");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new PaypalExpressTokenOutputQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Delete customer address
     */
    public MutationQuery deleteCustomerAddress(int id) {
        startField("deleteCustomerAddress");

        _queryBuilder.append("(id:");
        _queryBuilder.append(id);

        _queryBuilder.append(')');

        return this;
    }

    /**
     * Delete a customer payment token
     */
    public MutationQuery deletePaymentToken(String publicHash, DeletePaymentTokenOutputQueryDefinition queryDef) {
        startField("deletePaymentToken");

        _queryBuilder.append("(public_hash:");
        AbstractQuery.appendQuotedString(_queryBuilder, publicHash.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DeletePaymentTokenOutputQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Retrieve the customer token
     */
    public MutationQuery generateCustomerToken(String email, String password, CustomerTokenQueryDefinition queryDef) {
        startField("generateCustomerToken");

        _queryBuilder.append("(email:");
        AbstractQuery.appendQuotedString(_queryBuilder, email.toString());

        _queryBuilder.append(",password:");
        AbstractQuery.appendQuotedString(_queryBuilder, password.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CustomerTokenQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Handles payment response and saves payment in Quote. Use this mutations for Payflow Pro and Payments
     * Pro payment methods.
     */
    public MutationQuery handlePayflowProResponse(PayflowProResponseInput input, PayflowProResponseOutputQueryDefinition queryDef) {
        startField("handlePayflowProResponse");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new PayflowProResponseOutputQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Merges the source cart into the destination cart
     */
    public MutationQuery mergeCarts(String sourceCartId, String destinationCartId, CartQueryDefinition queryDef) {
        startField("mergeCarts");

        _queryBuilder.append("(source_cart_id:");
        AbstractQuery.appendQuotedString(_queryBuilder, sourceCartId.toString());

        _queryBuilder.append(",destination_cart_id:");
        AbstractQuery.appendQuotedString(_queryBuilder, destinationCartId.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CartQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class PlaceOrderArguments extends Arguments {
        PlaceOrderArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        public PlaceOrderArguments input(PlaceOrderInput value) {
            if (value != null) {
                startArgument("input");
                value.appendTo(_queryBuilder);
            }
            return this;
        }
    }

    public interface PlaceOrderArgumentsDefinition {
        void define(PlaceOrderArguments args);
    }

    public MutationQuery placeOrder(PlaceOrderOutputQueryDefinition queryDef) {
        return placeOrder(args -> {}, queryDef);
    }

    public MutationQuery placeOrder(PlaceOrderArgumentsDefinition argsDef, PlaceOrderOutputQueryDefinition queryDef) {
        startField("placeOrder");

        PlaceOrderArguments args = new PlaceOrderArguments(_queryBuilder);
        argsDef.define(args);
        PlaceOrderArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new PlaceOrderOutputQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class RemoveCouponFromCartArguments extends Arguments {
        RemoveCouponFromCartArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        public RemoveCouponFromCartArguments input(RemoveCouponFromCartInput value) {
            if (value != null) {
                startArgument("input");
                value.appendTo(_queryBuilder);
            }
            return this;
        }
    }

    public interface RemoveCouponFromCartArgumentsDefinition {
        void define(RemoveCouponFromCartArguments args);
    }

    public MutationQuery removeCouponFromCart(RemoveCouponFromCartOutputQueryDefinition queryDef) {
        return removeCouponFromCart(args -> {}, queryDef);
    }

    public MutationQuery removeCouponFromCart(RemoveCouponFromCartArgumentsDefinition argsDef, RemoveCouponFromCartOutputQueryDefinition queryDef) {
        startField("removeCouponFromCart");

        RemoveCouponFromCartArguments args = new RemoveCouponFromCartArguments(_queryBuilder);
        argsDef.define(args);
        RemoveCouponFromCartArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new RemoveCouponFromCartOutputQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class RemoveItemFromCartArguments extends Arguments {
        RemoveItemFromCartArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        public RemoveItemFromCartArguments input(RemoveItemFromCartInput value) {
            if (value != null) {
                startArgument("input");
                value.appendTo(_queryBuilder);
            }
            return this;
        }
    }

    public interface RemoveItemFromCartArgumentsDefinition {
        void define(RemoveItemFromCartArguments args);
    }

    public MutationQuery removeItemFromCart(RemoveItemFromCartOutputQueryDefinition queryDef) {
        return removeItemFromCart(args -> {}, queryDef);
    }

    public MutationQuery removeItemFromCart(RemoveItemFromCartArgumentsDefinition argsDef, RemoveItemFromCartOutputQueryDefinition queryDef) {
        startField("removeItemFromCart");

        RemoveItemFromCartArguments args = new RemoveItemFromCartArguments(_queryBuilder);
        argsDef.define(args);
        RemoveItemFromCartArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new RemoveItemFromCartOutputQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Revoke the customer token
     */
    public MutationQuery revokeCustomerToken(RevokeCustomerTokenOutputQueryDefinition queryDef) {
        startField("revokeCustomerToken");

        _queryBuilder.append('{');
        queryDef.define(new RevokeCustomerTokenOutputQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class SendEmailToFriendArguments extends Arguments {
        SendEmailToFriendArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        public SendEmailToFriendArguments input(SendEmailToFriendInput value) {
            if (value != null) {
                startArgument("input");
                value.appendTo(_queryBuilder);
            }
            return this;
        }
    }

    public interface SendEmailToFriendArgumentsDefinition {
        void define(SendEmailToFriendArguments args);
    }

    /**
     * Recommends Product by Sending Single/Multiple Email
     */
    public MutationQuery sendEmailToFriend(SendEmailToFriendOutputQueryDefinition queryDef) {
        return sendEmailToFriend(args -> {}, queryDef);
    }

    /**
     * Recommends Product by Sending Single/Multiple Email
     */
    public MutationQuery sendEmailToFriend(SendEmailToFriendArgumentsDefinition argsDef, SendEmailToFriendOutputQueryDefinition queryDef) {
        startField("sendEmailToFriend");

        SendEmailToFriendArguments args = new SendEmailToFriendArguments(_queryBuilder);
        argsDef.define(args);
        SendEmailToFriendArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new SendEmailToFriendOutputQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class SetBillingAddressOnCartArguments extends Arguments {
        SetBillingAddressOnCartArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        public SetBillingAddressOnCartArguments input(SetBillingAddressOnCartInput value) {
            if (value != null) {
                startArgument("input");
                value.appendTo(_queryBuilder);
            }
            return this;
        }
    }

    public interface SetBillingAddressOnCartArgumentsDefinition {
        void define(SetBillingAddressOnCartArguments args);
    }

    public MutationQuery setBillingAddressOnCart(SetBillingAddressOnCartOutputQueryDefinition queryDef) {
        return setBillingAddressOnCart(args -> {}, queryDef);
    }

    public MutationQuery setBillingAddressOnCart(SetBillingAddressOnCartArgumentsDefinition argsDef, SetBillingAddressOnCartOutputQueryDefinition queryDef) {
        startField("setBillingAddressOnCart");

        SetBillingAddressOnCartArguments args = new SetBillingAddressOnCartArguments(_queryBuilder);
        argsDef.define(args);
        SetBillingAddressOnCartArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new SetBillingAddressOnCartOutputQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class SetGuestEmailOnCartArguments extends Arguments {
        SetGuestEmailOnCartArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        public SetGuestEmailOnCartArguments input(SetGuestEmailOnCartInput value) {
            if (value != null) {
                startArgument("input");
                value.appendTo(_queryBuilder);
            }
            return this;
        }
    }

    public interface SetGuestEmailOnCartArgumentsDefinition {
        void define(SetGuestEmailOnCartArguments args);
    }

    public MutationQuery setGuestEmailOnCart(SetGuestEmailOnCartOutputQueryDefinition queryDef) {
        return setGuestEmailOnCart(args -> {}, queryDef);
    }

    public MutationQuery setGuestEmailOnCart(SetGuestEmailOnCartArgumentsDefinition argsDef, SetGuestEmailOnCartOutputQueryDefinition queryDef) {
        startField("setGuestEmailOnCart");

        SetGuestEmailOnCartArguments args = new SetGuestEmailOnCartArguments(_queryBuilder);
        argsDef.define(args);
        SetGuestEmailOnCartArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new SetGuestEmailOnCartOutputQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class SetPaymentMethodAndPlaceOrderArguments extends Arguments {
        SetPaymentMethodAndPlaceOrderArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        public SetPaymentMethodAndPlaceOrderArguments input(SetPaymentMethodAndPlaceOrderInput value) {
            if (value != null) {
                startArgument("input");
                value.appendTo(_queryBuilder);
            }
            return this;
        }
    }

    public interface SetPaymentMethodAndPlaceOrderArgumentsDefinition {
        void define(SetPaymentMethodAndPlaceOrderArguments args);
    }

    /**
     * @deprecated Should use setPaymentMethodOnCart and placeOrder mutations in single request.
     */
    public MutationQuery setPaymentMethodAndPlaceOrder(PlaceOrderOutputQueryDefinition queryDef) {
        return setPaymentMethodAndPlaceOrder(args -> {}, queryDef);
    }

    /**
     * @deprecated Should use setPaymentMethodOnCart and placeOrder mutations in single request.
     */
    @Deprecated
    public MutationQuery setPaymentMethodAndPlaceOrder(SetPaymentMethodAndPlaceOrderArgumentsDefinition argsDef, PlaceOrderOutputQueryDefinition queryDef) {
        startField("setPaymentMethodAndPlaceOrder");

        SetPaymentMethodAndPlaceOrderArguments args = new SetPaymentMethodAndPlaceOrderArguments(_queryBuilder);
        argsDef.define(args);
        SetPaymentMethodAndPlaceOrderArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new PlaceOrderOutputQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class SetPaymentMethodOnCartArguments extends Arguments {
        SetPaymentMethodOnCartArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        public SetPaymentMethodOnCartArguments input(SetPaymentMethodOnCartInput value) {
            if (value != null) {
                startArgument("input");
                value.appendTo(_queryBuilder);
            }
            return this;
        }
    }

    public interface SetPaymentMethodOnCartArgumentsDefinition {
        void define(SetPaymentMethodOnCartArguments args);
    }

    public MutationQuery setPaymentMethodOnCart(SetPaymentMethodOnCartOutputQueryDefinition queryDef) {
        return setPaymentMethodOnCart(args -> {}, queryDef);
    }

    public MutationQuery setPaymentMethodOnCart(SetPaymentMethodOnCartArgumentsDefinition argsDef, SetPaymentMethodOnCartOutputQueryDefinition queryDef) {
        startField("setPaymentMethodOnCart");

        SetPaymentMethodOnCartArguments args = new SetPaymentMethodOnCartArguments(_queryBuilder);
        argsDef.define(args);
        SetPaymentMethodOnCartArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new SetPaymentMethodOnCartOutputQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class SetShippingAddressesOnCartArguments extends Arguments {
        SetShippingAddressesOnCartArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        public SetShippingAddressesOnCartArguments input(SetShippingAddressesOnCartInput value) {
            if (value != null) {
                startArgument("input");
                value.appendTo(_queryBuilder);
            }
            return this;
        }
    }

    public interface SetShippingAddressesOnCartArgumentsDefinition {
        void define(SetShippingAddressesOnCartArguments args);
    }

    public MutationQuery setShippingAddressesOnCart(SetShippingAddressesOnCartOutputQueryDefinition queryDef) {
        return setShippingAddressesOnCart(args -> {}, queryDef);
    }

    public MutationQuery setShippingAddressesOnCart(SetShippingAddressesOnCartArgumentsDefinition argsDef, SetShippingAddressesOnCartOutputQueryDefinition queryDef) {
        startField("setShippingAddressesOnCart");

        SetShippingAddressesOnCartArguments args = new SetShippingAddressesOnCartArguments(_queryBuilder);
        argsDef.define(args);
        SetShippingAddressesOnCartArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new SetShippingAddressesOnCartOutputQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class SetShippingMethodsOnCartArguments extends Arguments {
        SetShippingMethodsOnCartArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        public SetShippingMethodsOnCartArguments input(SetShippingMethodsOnCartInput value) {
            if (value != null) {
                startArgument("input");
                value.appendTo(_queryBuilder);
            }
            return this;
        }
    }

    public interface SetShippingMethodsOnCartArgumentsDefinition {
        void define(SetShippingMethodsOnCartArguments args);
    }

    public MutationQuery setShippingMethodsOnCart(SetShippingMethodsOnCartOutputQueryDefinition queryDef) {
        return setShippingMethodsOnCart(args -> {}, queryDef);
    }

    public MutationQuery setShippingMethodsOnCart(SetShippingMethodsOnCartArgumentsDefinition argsDef, SetShippingMethodsOnCartOutputQueryDefinition queryDef) {
        startField("setShippingMethodsOnCart");

        SetShippingMethodsOnCartArguments args = new SetShippingMethodsOnCartArguments(_queryBuilder);
        argsDef.define(args);
        SetShippingMethodsOnCartArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new SetShippingMethodsOnCartOutputQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class UpdateCartItemsArguments extends Arguments {
        UpdateCartItemsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        public UpdateCartItemsArguments input(UpdateCartItemsInput value) {
            if (value != null) {
                startArgument("input");
                value.appendTo(_queryBuilder);
            }
            return this;
        }
    }

    public interface UpdateCartItemsArgumentsDefinition {
        void define(UpdateCartItemsArguments args);
    }

    public MutationQuery updateCartItems(UpdateCartItemsOutputQueryDefinition queryDef) {
        return updateCartItems(args -> {}, queryDef);
    }

    public MutationQuery updateCartItems(UpdateCartItemsArgumentsDefinition argsDef, UpdateCartItemsOutputQueryDefinition queryDef) {
        startField("updateCartItems");

        UpdateCartItemsArguments args = new UpdateCartItemsArguments(_queryBuilder);
        argsDef.define(args);
        UpdateCartItemsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new UpdateCartItemsOutputQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Update the customer&#39;s personal information
     */
    public MutationQuery updateCustomer(CustomerInput input, CustomerOutputQueryDefinition queryDef) {
        startField("updateCustomer");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CustomerOutputQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class UpdateCustomerAddressArguments extends Arguments {
        UpdateCustomerAddressArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, false);
        }

        public UpdateCustomerAddressArguments input(CustomerAddressInput value) {
            if (value != null) {
                startArgument("input");
                value.appendTo(_queryBuilder);
            }
            return this;
        }
    }

    public interface UpdateCustomerAddressArgumentsDefinition {
        void define(UpdateCustomerAddressArguments args);
    }

    /**
     * Update customer address
     */
    public MutationQuery updateCustomerAddress(int id, CustomerAddressQueryDefinition queryDef) {
        return updateCustomerAddress(id, args -> {}, queryDef);
    }

    /**
     * Update customer address
     */
    public MutationQuery updateCustomerAddress(int id, UpdateCustomerAddressArgumentsDefinition argsDef, CustomerAddressQueryDefinition queryDef) {
        startField("updateCustomerAddress");

        _queryBuilder.append("(id:");
        _queryBuilder.append(id);

        argsDef.define(new UpdateCustomerAddressArguments(_queryBuilder));

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CustomerAddressQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public String toString() {
        return _queryBuilder.toString();
    }
}

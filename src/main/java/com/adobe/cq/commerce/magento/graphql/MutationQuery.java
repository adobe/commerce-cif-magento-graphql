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

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.shopify.graphql.support.AbstractQuery;
import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Fragment;
import com.shopify.graphql.support.ID;

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

    public MutationQuery addBundleProductsToCart(AddBundleProductsToCartArgumentsDefinition argsDef,
        AddBundleProductsToCartOutputQueryDefinition queryDef) {
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

    public MutationQuery addConfigurableProductsToCart(AddConfigurableProductsToCartArgumentsDefinition argsDef,
        AddConfigurableProductsToCartOutputQueryDefinition queryDef) {
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

    public MutationQuery addDownloadableProductsToCart(AddDownloadableProductsToCartArgumentsDefinition argsDef,
        AddDownloadableProductsToCartOutputQueryDefinition queryDef) {
        startField("addDownloadableProductsToCart");

        AddDownloadableProductsToCartArguments args = new AddDownloadableProductsToCartArguments(_queryBuilder);
        argsDef.define(args);
        AddDownloadableProductsToCartArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new AddDownloadableProductsToCartOutputQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Add any type of product to the cart
     */
    public MutationQuery addProductsToCart(String cartId, List<CartItemInput> cartItems, AddProductsToCartOutputQueryDefinition queryDef) {
        startField("addProductsToCart");

        _queryBuilder.append("(cartId:");
        AbstractQuery.appendQuotedString(_queryBuilder, cartId.toString());

        _queryBuilder.append(",cartItems:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (CartItemInput item1 : cartItems) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                item1.appendTo(_queryBuilder);
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new AddProductsToCartOutputQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class AddProductsToCompareListArguments extends Arguments {
        AddProductsToCompareListArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        public AddProductsToCompareListArguments input(AddProductsToCompareListInput value) {
            if (value != null) {
                startArgument("input");
                value.appendTo(_queryBuilder);
            }
            return this;
        }
    }

    public interface AddProductsToCompareListArgumentsDefinition {
        void define(AddProductsToCompareListArguments args);
    }

    /**
     * Add products to the specified compare list
     */
    public MutationQuery addProductsToCompareList(CompareListQueryDefinition queryDef) {
        return addProductsToCompareList(args -> {}, queryDef);
    }

    /**
     * Add products to the specified compare list
     */
    public MutationQuery addProductsToCompareList(AddProductsToCompareListArgumentsDefinition argsDef,
        CompareListQueryDefinition queryDef) {
        startField("addProductsToCompareList");

        AddProductsToCompareListArguments args = new AddProductsToCompareListArguments(_queryBuilder);
        argsDef.define(args);
        AddProductsToCompareListArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new CompareListQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Adds one or more products to the specified wish list. This mutation supports all product types
     */
    public MutationQuery addProductsToWishlist(ID wishlistId, List<WishlistItemInput> wishlistItems,
        AddProductsToWishlistOutputQueryDefinition queryDef) {
        startField("addProductsToWishlist");

        _queryBuilder.append("(wishlistId:");
        AbstractQuery.appendQuotedString(_queryBuilder, wishlistId.toString());

        _queryBuilder.append(",wishlistItems:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (WishlistItemInput item1 : wishlistItems) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                item1.appendTo(_queryBuilder);
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new AddProductsToWishlistOutputQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Add a comment to an existing return
     */
    public MutationQuery addReturnComment(AddReturnCommentInput input, AddReturnCommentOutputQueryDefinition queryDef) {
        startField("addReturnComment");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new AddReturnCommentOutputQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Add tracking information to the return
     */
    public MutationQuery addReturnTracking(AddReturnTrackingInput input, AddReturnTrackingOutputQueryDefinition queryDef) {
        startField("addReturnTracking");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new AddReturnTrackingOutputQuery(_queryBuilder));
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

    public MutationQuery addSimpleProductsToCart(AddSimpleProductsToCartArgumentsDefinition argsDef,
        AddSimpleProductsToCartOutputQueryDefinition queryDef) {
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

    public MutationQuery addVirtualProductsToCart(AddVirtualProductsToCartArgumentsDefinition argsDef,
        AddVirtualProductsToCartOutputQueryDefinition queryDef) {
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

    public class ApplyGiftCardToCartArguments extends Arguments {
        ApplyGiftCardToCartArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        public ApplyGiftCardToCartArguments input(ApplyGiftCardToCartInput value) {
            if (value != null) {
                startArgument("input");
                value.appendTo(_queryBuilder);
            }
            return this;
        }
    }

    public interface ApplyGiftCardToCartArgumentsDefinition {
        void define(ApplyGiftCardToCartArguments args);
    }

    /**
     * Apply a pre-defined gift card code to the specified cart.
     */
    public MutationQuery applyGiftCardToCart(ApplyGiftCardToCartOutputQueryDefinition queryDef) {
        return applyGiftCardToCart(args -> {}, queryDef);
    }

    /**
     * Apply a pre-defined gift card code to the specified cart.
     */
    public MutationQuery applyGiftCardToCart(ApplyGiftCardToCartArgumentsDefinition argsDef,
        ApplyGiftCardToCartOutputQueryDefinition queryDef) {
        startField("applyGiftCardToCart");

        ApplyGiftCardToCartArguments args = new ApplyGiftCardToCartArguments(_queryBuilder);
        argsDef.define(args);
        ApplyGiftCardToCartArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ApplyGiftCardToCartOutputQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Apply all available points, up to the cart total. Partial redemption is not available
     */
    public MutationQuery applyRewardPointsToCart(ID cartId, ApplyRewardPointsToCartOutputQueryDefinition queryDef) {
        startField("applyRewardPointsToCart");

        _queryBuilder.append("(cartId:");
        AbstractQuery.appendQuotedString(_queryBuilder, cartId.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new ApplyRewardPointsToCartOutputQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Apply store credit to the specified cart.
     */
    public MutationQuery applyStoreCreditToCart(ApplyStoreCreditToCartInput input, ApplyStoreCreditToCartOutputQueryDefinition queryDef) {
        startField("applyStoreCreditToCart");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new ApplyStoreCreditToCartOutputQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Assign the specified compare list to the logged in customer
     */
    public MutationQuery assignCompareListToCustomer(ID uid, AssignCompareListToCustomerOutputQueryDefinition queryDef) {
        startField("assignCompareListToCustomer");

        _queryBuilder.append("(uid:");
        AbstractQuery.appendQuotedString(_queryBuilder, uid.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new AssignCompareListToCustomerOutputQuery(_queryBuilder));
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
     * Copy products from one wish list to another
     */
    public MutationQuery copyProductsBetweenWishlists(ID sourceWishlistUid, ID destinationWishlistUid,
        List<WishlistItemCopyInput> wishlistItems, CopyProductsBetweenWishlistsOutputQueryDefinition queryDef) {
        startField("copyProductsBetweenWishlists");

        _queryBuilder.append("(sourceWishlistUid:");
        AbstractQuery.appendQuotedString(_queryBuilder, sourceWishlistUid.toString());

        _queryBuilder.append(",destinationWishlistUid:");
        AbstractQuery.appendQuotedString(_queryBuilder, destinationWishlistUid.toString());

        _queryBuilder.append(",wishlistItems:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (WishlistItemCopyInput item1 : wishlistItems) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                item1.appendTo(_queryBuilder);
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CopyProductsBetweenWishlistsOutputQuery(_queryBuilder));
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

    public class CreateCompareListArguments extends Arguments {
        CreateCompareListArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        public CreateCompareListArguments input(CreateCompareListInput value) {
            if (value != null) {
                startArgument("input");
                value.appendTo(_queryBuilder);
            }
            return this;
        }
    }

    public interface CreateCompareListArgumentsDefinition {
        void define(CreateCompareListArguments args);
    }

    /**
     * Creates a new compare list. The compare list is saved for logged in customers
     */
    public MutationQuery createCompareList(CompareListQueryDefinition queryDef) {
        return createCompareList(args -> {}, queryDef);
    }

    /**
     * Creates a new compare list. The compare list is saved for logged in customers
     */
    public MutationQuery createCompareList(CreateCompareListArgumentsDefinition argsDef, CompareListQueryDefinition queryDef) {
        startField("createCompareList");

        CreateCompareListArguments args = new CreateCompareListArguments(_queryBuilder);
        argsDef.define(args);
        CreateCompareListArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new CompareListQuery(_queryBuilder));
        _queryBuilder.append('}');

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

    /**
     * Create customer account
     */
    public MutationQuery createCustomerV2(CustomerCreateInput input, CustomerOutputQueryDefinition queryDef) {
        startField("createCustomerV2");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CustomerOutputQuery(_queryBuilder));
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

    public class CreateKlarnaPaymentsSessionArguments extends Arguments {
        CreateKlarnaPaymentsSessionArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        public CreateKlarnaPaymentsSessionArguments input(createKlarnaPaymentsSessionInput value) {
            if (value != null) {
                startArgument("input");
                value.appendTo(_queryBuilder);
            }
            return this;
        }
    }

    public interface CreateKlarnaPaymentsSessionArgumentsDefinition {
        void define(CreateKlarnaPaymentsSessionArguments args);
    }

    /**
     * Creates a Klarna Payments Session.
     */
    public MutationQuery createKlarnaPaymentsSession(createKlarnaPaymentsSessionOutputQueryDefinition queryDef) {
        return createKlarnaPaymentsSession(args -> {}, queryDef);
    }

    /**
     * Creates a Klarna Payments Session.
     */
    public MutationQuery createKlarnaPaymentsSession(CreateKlarnaPaymentsSessionArgumentsDefinition argsDef,
        createKlarnaPaymentsSessionOutputQueryDefinition queryDef) {
        startField("createKlarnaPaymentsSession");

        CreateKlarnaPaymentsSessionArguments args = new CreateKlarnaPaymentsSessionArguments(_queryBuilder);
        argsDef.define(args);
        CreateKlarnaPaymentsSessionArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new createKlarnaPaymentsSessionOutputQuery(_queryBuilder));
        _queryBuilder.append('}');

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
     * Creates a product review for the specified SKU
     */
    public MutationQuery createProductReview(CreateProductReviewInput input, CreateProductReviewOutputQueryDefinition queryDef) {
        startField("createProductReview");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CreateProductReviewOutputQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Create a new wish list
     */
    public MutationQuery createWishlist(CreateWishlistInput input, CreateWishlistOutputQueryDefinition queryDef) {
        startField("createWishlist");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CreateWishlistOutputQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Delete the specified compare list
     */
    public MutationQuery deleteCompareList(ID uid, DeleteCompareListOutputQueryDefinition queryDef) {
        startField("deleteCompareList");

        _queryBuilder.append("(uid:");
        AbstractQuery.appendQuotedString(_queryBuilder, uid.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DeleteCompareListOutputQuery(_queryBuilder));
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
     * Delete the specified wish list filtered by the unique ID for a `Wishlist` object
     */
    public MutationQuery deleteWishlist(ID wishlistId, DeleteWishlistOutputQueryDefinition queryDef) {
        startField("deleteWishlist");

        _queryBuilder.append("(wishlistId:");
        AbstractQuery.appendQuotedString(_queryBuilder, wishlistId.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DeleteWishlistOutputQuery(_queryBuilder));
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
     * Request a customer token so that an administrator can perform remote shopping assistance
     */
    public MutationQuery generateCustomerTokenAsAdmin(GenerateCustomerTokenAsAdminInput input,
        GenerateCustomerTokenAsAdminOutputQueryDefinition queryDef) {
        startField("generateCustomerTokenAsAdmin");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new GenerateCustomerTokenAsAdminOutputQuery(_queryBuilder));
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

    public class MergeCartsArguments extends Arguments {
        MergeCartsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, false);
        }

        public MergeCartsArguments destinationCartId(String value) {
            if (value != null) {
                startArgument("destination_cart_id");
                AbstractQuery.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }
    }

    public interface MergeCartsArgumentsDefinition {
        void define(MergeCartsArguments args);
    }

    /**
     * Merges the source cart into the destination cart
     */
    public MutationQuery mergeCarts(String sourceCartId, CartQueryDefinition queryDef) {
        return mergeCarts(sourceCartId, args -> {}, queryDef);
    }

    /**
     * Merges the source cart into the destination cart
     */
    public MutationQuery mergeCarts(String sourceCartId, MergeCartsArgumentsDefinition argsDef, CartQueryDefinition queryDef) {
        startField("mergeCarts");

        _queryBuilder.append("(source_cart_id:");
        AbstractQuery.appendQuotedString(_queryBuilder, sourceCartId.toString());

        argsDef.define(new MergeCartsArguments(_queryBuilder));

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CartQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Move products from one wish list to another
     */
    public MutationQuery moveProductsBetweenWishlists(ID sourceWishlistUid, ID destinationWishlistUid,
        List<WishlistItemMoveInput> wishlistItems, MoveProductsBetweenWishlistsOutputQueryDefinition queryDef) {
        startField("moveProductsBetweenWishlists");

        _queryBuilder.append("(sourceWishlistUid:");
        AbstractQuery.appendQuotedString(_queryBuilder, sourceWishlistUid.toString());

        _queryBuilder.append(",destinationWishlistUid:");
        AbstractQuery.appendQuotedString(_queryBuilder, destinationWishlistUid.toString());

        _queryBuilder.append(",wishlistItems:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (WishlistItemMoveInput item1 : wishlistItems) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                item1.appendTo(_queryBuilder);
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new MoveProductsBetweenWishlistsOutputQuery(_queryBuilder));
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

    /**
     * Redeem gift card for store credit.
     */
    public MutationQuery redeemGiftCardBalanceAsStoreCredit(GiftCardAccountInput input, GiftCardAccountQueryDefinition queryDef) {
        startField("redeemGiftCardBalanceAsStoreCredit");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new GiftCardAccountQuery(_queryBuilder));
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

    public MutationQuery removeCouponFromCart(RemoveCouponFromCartArgumentsDefinition argsDef,
        RemoveCouponFromCartOutputQueryDefinition queryDef) {
        startField("removeCouponFromCart");

        RemoveCouponFromCartArguments args = new RemoveCouponFromCartArguments(_queryBuilder);
        argsDef.define(args);
        RemoveCouponFromCartArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new RemoveCouponFromCartOutputQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class RemoveGiftCardFromCartArguments extends Arguments {
        RemoveGiftCardFromCartArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        public RemoveGiftCardFromCartArguments input(RemoveGiftCardFromCartInput value) {
            if (value != null) {
                startArgument("input");
                value.appendTo(_queryBuilder);
            }
            return this;
        }
    }

    public interface RemoveGiftCardFromCartArgumentsDefinition {
        void define(RemoveGiftCardFromCartArguments args);
    }

    public MutationQuery removeGiftCardFromCart(RemoveGiftCardFromCartOutputQueryDefinition queryDef) {
        return removeGiftCardFromCart(args -> {}, queryDef);
    }

    public MutationQuery removeGiftCardFromCart(RemoveGiftCardFromCartArgumentsDefinition argsDef,
        RemoveGiftCardFromCartOutputQueryDefinition queryDef) {
        startField("removeGiftCardFromCart");

        RemoveGiftCardFromCartArguments args = new RemoveGiftCardFromCartArguments(_queryBuilder);
        argsDef.define(args);
        RemoveGiftCardFromCartArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new RemoveGiftCardFromCartOutputQuery(_queryBuilder));
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

    public MutationQuery removeItemFromCart(RemoveItemFromCartArgumentsDefinition argsDef,
        RemoveItemFromCartOutputQueryDefinition queryDef) {
        startField("removeItemFromCart");

        RemoveItemFromCartArguments args = new RemoveItemFromCartArguments(_queryBuilder);
        argsDef.define(args);
        RemoveItemFromCartArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new RemoveItemFromCartOutputQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class RemoveProductsFromCompareListArguments extends Arguments {
        RemoveProductsFromCompareListArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        public RemoveProductsFromCompareListArguments input(RemoveProductsFromCompareListInput value) {
            if (value != null) {
                startArgument("input");
                value.appendTo(_queryBuilder);
            }
            return this;
        }
    }

    public interface RemoveProductsFromCompareListArgumentsDefinition {
        void define(RemoveProductsFromCompareListArguments args);
    }

    /**
     * Remove products from the specified compare list
     */
    public MutationQuery removeProductsFromCompareList(CompareListQueryDefinition queryDef) {
        return removeProductsFromCompareList(args -> {}, queryDef);
    }

    /**
     * Remove products from the specified compare list
     */
    public MutationQuery removeProductsFromCompareList(RemoveProductsFromCompareListArgumentsDefinition argsDef,
        CompareListQueryDefinition queryDef) {
        startField("removeProductsFromCompareList");

        RemoveProductsFromCompareListArguments args = new RemoveProductsFromCompareListArguments(_queryBuilder);
        argsDef.define(args);
        RemoveProductsFromCompareListArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new CompareListQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Removes one or more products from the specified wish list
     */
    public MutationQuery removeProductsFromWishlist(ID wishlistId, List<ID> wishlistItemsIds,
        RemoveProductsFromWishlistOutputQueryDefinition queryDef) {
        startField("removeProductsFromWishlist");

        _queryBuilder.append("(wishlistId:");
        AbstractQuery.appendQuotedString(_queryBuilder, wishlistId.toString());

        _queryBuilder.append(",wishlistItemsIds:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (ID item1 : wishlistItemsIds) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                AbstractQuery.appendQuotedString(_queryBuilder, item1.toString());
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new RemoveProductsFromWishlistOutputQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Remove a tracked shipment from a return
     */
    public MutationQuery removeReturnTracking(RemoveReturnTrackingInput input, RemoveReturnTrackingOutputQueryDefinition queryDef) {
        startField("removeReturnTracking");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new RemoveReturnTrackingOutputQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Cancel the application of reward points to the cart
     */
    public MutationQuery removeRewardPointsFromCart(ID cartId, RemoveRewardPointsFromCartOutputQueryDefinition queryDef) {
        startField("removeRewardPointsFromCart");

        _queryBuilder.append("(cartId:");
        AbstractQuery.appendQuotedString(_queryBuilder, cartId.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new RemoveRewardPointsFromCartOutputQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Remove applied store credit from the specified cart.
     */
    public MutationQuery removeStoreCreditFromCart(RemoveStoreCreditFromCartInput input,
        RemoveStoreCreditFromCartOutputQueryDefinition queryDef) {
        startField("removeStoreCreditFromCart");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new RemoveStoreCreditFromCartOutputQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Adds all products from a customer&#39;s previous order to the cart.
     */
    public MutationQuery reorderItems(String orderNumber, ReorderItemsOutputQueryDefinition queryDef) {
        startField("reorderItems");

        _queryBuilder.append("(orderNumber:");
        AbstractQuery.appendQuotedString(_queryBuilder, orderNumber.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new ReorderItemsOutputQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Request an email with a reset password token for the registered customer identified by the specified
     * email.
     */
    public MutationQuery requestPasswordResetEmail(String email) {
        startField("requestPasswordResetEmail");

        _queryBuilder.append("(email:");
        AbstractQuery.appendQuotedString(_queryBuilder, email.toString());

        _queryBuilder.append(')');

        return this;
    }

    /**
     * Initiates a buyer&#39;s request to return an item for replacement or refund
     */
    public MutationQuery requestReturn(RequestReturnInput input, RequestReturnOutputQueryDefinition queryDef) {
        startField("requestReturn");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new RequestReturnOutputQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Reset a customer&#39;s password using the reset password token that the customer received in an email
     * after requesting it using requestPasswordResetEmail.
     */
    public MutationQuery resetPassword(String email, String resetPasswordToken, String newPassword) {
        startField("resetPassword");

        _queryBuilder.append("(email:");
        AbstractQuery.appendQuotedString(_queryBuilder, email.toString());

        _queryBuilder.append(",resetPasswordToken:");
        AbstractQuery.appendQuotedString(_queryBuilder, resetPasswordToken.toString());

        _queryBuilder.append(",newPassword:");
        AbstractQuery.appendQuotedString(_queryBuilder, newPassword.toString());

        _queryBuilder.append(')');

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

    public MutationQuery setBillingAddressOnCart(SetBillingAddressOnCartArgumentsDefinition argsDef,
        SetBillingAddressOnCartOutputQueryDefinition queryDef) {
        startField("setBillingAddressOnCart");

        SetBillingAddressOnCartArguments args = new SetBillingAddressOnCartArguments(_queryBuilder);
        argsDef.define(args);
        SetBillingAddressOnCartArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new SetBillingAddressOnCartOutputQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class SetGiftOptionsOnCartArguments extends Arguments {
        SetGiftOptionsOnCartArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        public SetGiftOptionsOnCartArguments input(SetGiftOptionsOnCartInput value) {
            if (value != null) {
                startArgument("input");
                value.appendTo(_queryBuilder);
            }
            return this;
        }
    }

    public interface SetGiftOptionsOnCartArgumentsDefinition {
        void define(SetGiftOptionsOnCartArguments args);
    }

    /**
     * Set gift options like gift wrapping or gift message for the entire cart
     */
    public MutationQuery setGiftOptionsOnCart(SetGiftOptionsOnCartOutputQueryDefinition queryDef) {
        return setGiftOptionsOnCart(args -> {}, queryDef);
    }

    /**
     * Set gift options like gift wrapping or gift message for the entire cart
     */
    public MutationQuery setGiftOptionsOnCart(SetGiftOptionsOnCartArgumentsDefinition argsDef,
        SetGiftOptionsOnCartOutputQueryDefinition queryDef) {
        startField("setGiftOptionsOnCart");

        SetGiftOptionsOnCartArguments args = new SetGiftOptionsOnCartArguments(_queryBuilder);
        argsDef.define(args);
        SetGiftOptionsOnCartArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new SetGiftOptionsOnCartOutputQuery(_queryBuilder));
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

    public MutationQuery setGuestEmailOnCart(SetGuestEmailOnCartArgumentsDefinition argsDef,
        SetGuestEmailOnCartOutputQueryDefinition queryDef) {
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
    public MutationQuery setPaymentMethodAndPlaceOrder(SetPaymentMethodAndPlaceOrderArgumentsDefinition argsDef,
        PlaceOrderOutputQueryDefinition queryDef) {
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

    public MutationQuery setPaymentMethodOnCart(SetPaymentMethodOnCartArgumentsDefinition argsDef,
        SetPaymentMethodOnCartOutputQueryDefinition queryDef) {
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

    public MutationQuery setShippingAddressesOnCart(SetShippingAddressesOnCartArgumentsDefinition argsDef,
        SetShippingAddressesOnCartOutputQueryDefinition queryDef) {
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

    public MutationQuery setShippingMethodsOnCart(SetShippingMethodsOnCartArgumentsDefinition argsDef,
        SetShippingMethodsOnCartOutputQueryDefinition queryDef) {
        startField("setShippingMethodsOnCart");

        SetShippingMethodsOnCartArguments args = new SetShippingMethodsOnCartArguments(_queryBuilder);
        argsDef.define(args);
        SetShippingMethodsOnCartArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new SetShippingMethodsOnCartOutputQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Subscribes the specified email to a newsletter
     */
    public MutationQuery subscribeEmailToNewsletter(String email, SubscribeEmailToNewsletterOutputQueryDefinition queryDef) {
        startField("subscribeEmailToNewsletter");

        _queryBuilder.append("(email:");
        AbstractQuery.appendQuotedString(_queryBuilder, email.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new SubscribeEmailToNewsletterOutputQuery(_queryBuilder));
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
     * Deprecated. Use UpdateCustomerV2 instead.
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
    public MutationQuery updateCustomerAddress(int id, UpdateCustomerAddressArgumentsDefinition argsDef,
        CustomerAddressQueryDefinition queryDef) {
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

    public MutationQuery updateCustomerEmail(String email, String password, CustomerOutputQueryDefinition queryDef) {
        startField("updateCustomerEmail");

        _queryBuilder.append("(email:");
        AbstractQuery.appendQuotedString(_queryBuilder, email.toString());

        _queryBuilder.append(",password:");
        AbstractQuery.appendQuotedString(_queryBuilder, password.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CustomerOutputQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Update the customer&#39;s personal information
     */
    public MutationQuery updateCustomerV2(CustomerUpdateInput input, CustomerOutputQueryDefinition queryDef) {
        startField("updateCustomerV2");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CustomerOutputQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Updates one or more products in the specified wish list
     */
    public MutationQuery updateProductsInWishlist(ID wishlistId, List<WishlistItemUpdateInput> wishlistItems,
        UpdateProductsInWishlistOutputQueryDefinition queryDef) {
        startField("updateProductsInWishlist");

        _queryBuilder.append("(wishlistId:");
        AbstractQuery.appendQuotedString(_queryBuilder, wishlistId.toString());

        _queryBuilder.append(",wishlistItems:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (WishlistItemUpdateInput item1 : wishlistItems) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                item1.appendTo(_queryBuilder);
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new UpdateProductsInWishlistOutputQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class UpdateWishlistArguments extends Arguments {
        UpdateWishlistArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, false);
        }

        public UpdateWishlistArguments name(String value) {
            if (value != null) {
                startArgument("name");
                AbstractQuery.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        public UpdateWishlistArguments visibility(WishlistVisibilityEnum value) {
            if (value != null) {
                startArgument("visibility");
                _queryBuilder.append(value.toString());
            }
            return this;
        }
    }

    public interface UpdateWishlistArgumentsDefinition {
        void define(UpdateWishlistArguments args);
    }

    /**
     * Change the name and visibility of the specified wish list
     */
    public MutationQuery updateWishlist(ID wishlistId, UpdateWishlistOutputQueryDefinition queryDef) {
        return updateWishlist(wishlistId, args -> {}, queryDef);
    }

    /**
     * Change the name and visibility of the specified wish list
     */
    public MutationQuery updateWishlist(ID wishlistId, UpdateWishlistArgumentsDefinition argsDef,
        UpdateWishlistOutputQueryDefinition queryDef) {
        startField("updateWishlist");

        _queryBuilder.append("(wishlistId:");
        AbstractQuery.appendQuotedString(_queryBuilder, wishlistId.toString());

        argsDef.define(new UpdateWishlistArguments(_queryBuilder));

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new UpdateWishlistOutputQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public String toString() {
        if (fragments != null) {
            for (Fragment fragment : fragments.values()) {
                _queryBuilder.append(fragment.toString());
            }
        }
        return _queryBuilder.toString();
    }

    private Map<String, Fragment> fragments;

    /**
     * Adds a GraphQL "named" fragment to the query. If a fragment with the same name is already added,
     * calling this method will replace the existing fragment.
     * 
     * @param fragment The fragment to add.
     */
    public MutationQuery addFragment(Fragment fragment) {
        if (fragments == null) {
            fragments = new LinkedHashMap<>();
        }
        fragments.put(fragment.getName(), fragment);
        return this;
    }

    /**
     * Creates a GraphQL "named" fragment with the specified query type definition.
     * The generics nature of fragments ensures that a fragment can only be used at the right place in the GraphQL request.
     * 
     * @param name The name of the fragment, must be unique for a given GraphQL request.
     * @param queryDef The fragment definition.
     * @return The fragment of a given generics type.
     */
    public static Fragment<MutationQuery> createFragment(String name, MutationQueryDefinition queryDef) {
        StringBuilder sb = new StringBuilder();
        queryDef.define(new MutationQuery(sb));
        return new Fragment<>(name, "Mutation", sb.toString());
    }

    /**
     * Adds a <code>MutationQuery</code> fragment reference at the current position of the query.
     * For example for a fragment named <code>test</code>, calling this method will add the
     * reference <code>...test</code> in the query. For GraphQL types implementing an interface, there
     * will be some similar methods using the Query type of each implemented interface.
     * 
     * @param fragment The fragment to reference.
     */
    public MutationQuery addFragmentReference(Fragment<MutationQuery> fragment) {
        startField("..." + fragment.getName());
        return this;
    }
}

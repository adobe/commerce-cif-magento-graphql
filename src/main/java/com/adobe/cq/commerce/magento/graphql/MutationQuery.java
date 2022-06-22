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

        /**
         * An input object that defines which bundle products to add to the cart.
         */
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

    /**
     * Add one or more bundle products to the specified cart. We recommend using `addProductsToCart`
     * instead.
     */
    public MutationQuery addBundleProductsToCart(AddBundleProductsToCartOutputQueryDefinition queryDef) {
        return addBundleProductsToCart(args -> {}, queryDef);
    }

    /**
     * Add one or more bundle products to the specified cart. We recommend using `addProductsToCart`
     * instead.
     */
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

        /**
         * An input object that defines which configurable products to add to the cart.
         */
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

    /**
     * Add one or more configurable products to the specified cart. We recommend using `addProductsToCart`
     * instead.
     */
    public MutationQuery addConfigurableProductsToCart(AddConfigurableProductsToCartOutputQueryDefinition queryDef) {
        return addConfigurableProductsToCart(args -> {}, queryDef);
    }

    /**
     * Add one or more configurable products to the specified cart. We recommend using `addProductsToCart`
     * instead.
     */
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

        /**
         * An input object that defines which downloadable products to add to the cart.
         */
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

    /**
     * Add one or more downloadable products to the specified cart. We recommend using `addProductsToCart`
     * instead.
     */
    public MutationQuery addDownloadableProductsToCart(AddDownloadableProductsToCartOutputQueryDefinition queryDef) {
        return addDownloadableProductsToCart(args -> {}, queryDef);
    }

    /**
     * Add one or more downloadable products to the specified cart. We recommend using `addProductsToCart`
     * instead.
     */
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
     * Add registrants to the specified gift registry.
     */
    public MutationQuery addGiftRegistryRegistrants(ID giftRegistryUid, List<AddGiftRegistryRegistrantInput> registrants,
        AddGiftRegistryRegistrantsOutputQueryDefinition queryDef) {
        startField("addGiftRegistryRegistrants");

        _queryBuilder.append("(giftRegistryUid:");
        AbstractQuery.appendQuotedString(_queryBuilder, giftRegistryUid.toString());

        _queryBuilder.append(",registrants:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (AddGiftRegistryRegistrantInput item1 : registrants) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                item1.appendTo(_queryBuilder);
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new AddGiftRegistryRegistrantsOutputQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Add any type of product to the cart.
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

        /**
         * An input object that defines which products to add to an existing compare list.
         */
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
     * Add products to the specified compare list.
     */
    public MutationQuery addProductsToCompareList(CompareListQueryDefinition queryDef) {
        return addProductsToCompareList(args -> {}, queryDef);
    }

    /**
     * Add products to the specified compare list.
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
     * Add items to the specified requisition list.
     */
    public MutationQuery addProductsToRequisitionList(ID requisitionListUid, List<RequisitionListItemsInput> requisitionListItems,
        AddProductsToRequisitionListOutputQueryDefinition queryDef) {
        startField("addProductsToRequisitionList");

        _queryBuilder.append("(requisitionListUid:");
        AbstractQuery.appendQuotedString(_queryBuilder, requisitionListUid.toString());

        _queryBuilder.append(",requisitionListItems:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (RequisitionListItemsInput item1 : requisitionListItems) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                item1.appendTo(_queryBuilder);
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new AddProductsToRequisitionListOutputQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Add one or more products to the specified wish list. This mutation supports all product types.
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

    public class AddRequisitionListItemsToCartArguments extends Arguments {
        AddRequisitionListItemsToCartArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, false);
        }

        /**
         * An array of UIDs presenting products to be added to the cart. If no UIDs are specified, all items in
         * the requisition list will be added to the cart.
         */
        public AddRequisitionListItemsToCartArguments requisitionListItemUids(List<ID> value) {
            if (value != null) {
                startArgument("requisitionListItemUids");
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (ID item1 : value) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        AbstractQuery.appendQuotedString(_queryBuilder, item1.toString());
                    }
                }
                _queryBuilder.append(']');
            }
            return this;
        }
    }

    public interface AddRequisitionListItemsToCartArgumentsDefinition {
        void define(AddRequisitionListItemsToCartArguments args);
    }

    /**
     * Add items in the requisition list to the customer&#39;s cart.
     */
    public MutationQuery addRequisitionListItemsToCart(ID requisitionListUid, AddRequisitionListItemsToCartOutputQueryDefinition queryDef) {
        return addRequisitionListItemsToCart(requisitionListUid, args -> {}, queryDef);
    }

    /**
     * Add items in the requisition list to the customer&#39;s cart.
     */
    public MutationQuery addRequisitionListItemsToCart(ID requisitionListUid, AddRequisitionListItemsToCartArgumentsDefinition argsDef,
        AddRequisitionListItemsToCartOutputQueryDefinition queryDef) {
        startField("addRequisitionListItemsToCart");

        _queryBuilder.append("(requisitionListUid:");
        AbstractQuery.appendQuotedString(_queryBuilder, requisitionListUid.toString());

        argsDef.define(new AddRequisitionListItemsToCartArguments(_queryBuilder));

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new AddRequisitionListItemsToCartOutputQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Add a comment to an existing return.
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
     * Add tracking information to the return.
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

        /**
         * An input object that defines which simple products to add to the cart.
         */
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

    /**
     * Add one or more simple products to the specified cart. We recommend using `addProductsToCart`
     * instead.
     */
    public MutationQuery addSimpleProductsToCart(AddSimpleProductsToCartOutputQueryDefinition queryDef) {
        return addSimpleProductsToCart(args -> {}, queryDef);
    }

    /**
     * Add one or more simple products to the specified cart. We recommend using `addProductsToCart`
     * instead.
     */
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

        /**
         * An input object that defines which virtual products to add to the cart.
         */
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

    /**
     * Add one or more virtual products to the specified cart. We recommend using `addProductsToCart`
     * instead.
     */
    public MutationQuery addVirtualProductsToCart(AddVirtualProductsToCartOutputQueryDefinition queryDef) {
        return addVirtualProductsToCart(args -> {}, queryDef);
    }

    /**
     * Add one or more virtual products to the specified cart. We recommend using `addProductsToCart`
     * instead.
     */
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

    public class AddWishlistItemsToCartArguments extends Arguments {
        AddWishlistItemsToCartArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, false);
        }

        /**
         * An array of IDs representing products to be added to the cart. If no IDs are specified, all items in
         * the wishlist will be added to the cart
         */
        public AddWishlistItemsToCartArguments wishlistItemIds(List<ID> value) {
            if (value != null) {
                startArgument("wishlistItemIds");
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (ID item1 : value) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        AbstractQuery.appendQuotedString(_queryBuilder, item1.toString());
                    }
                }
                _queryBuilder.append(']');
            }
            return this;
        }
    }

    public interface AddWishlistItemsToCartArgumentsDefinition {
        void define(AddWishlistItemsToCartArguments args);
    }

    /**
     * Add items in the specified wishlist to the customer&#39;s cart.
     */
    public MutationQuery addWishlistItemsToCart(ID wishlistId, AddWishlistItemsToCartOutputQueryDefinition queryDef) {
        return addWishlistItemsToCart(wishlistId, args -> {}, queryDef);
    }

    /**
     * Add items in the specified wishlist to the customer&#39;s cart.
     */
    public MutationQuery addWishlistItemsToCart(ID wishlistId, AddWishlistItemsToCartArgumentsDefinition argsDef,
        AddWishlistItemsToCartOutputQueryDefinition queryDef) {
        startField("addWishlistItemsToCart");

        _queryBuilder.append("(wishlistId:");
        AbstractQuery.appendQuotedString(_queryBuilder, wishlistId.toString());

        argsDef.define(new AddWishlistItemsToCartArguments(_queryBuilder));

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new AddWishlistItemsToCartOutputQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class ApplyCouponToCartArguments extends Arguments {
        ApplyCouponToCartArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
         * An input object that defines the coupon code to apply to the cart.
         */
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

    /**
     * Apply a pre-defined coupon code to the specified cart.
     */
    public MutationQuery applyCouponToCart(ApplyCouponToCartOutputQueryDefinition queryDef) {
        return applyCouponToCart(args -> {}, queryDef);
    }

    /**
     * Apply a pre-defined coupon code to the specified cart.
     */
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

        /**
         * An input object that specifies the gift card code and cart.
         */
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
     * Apply all available points, up to the cart total. Partial redemption is not available.
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
     * Assign the specified compare list to the logged in customer.
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
     * Assign a logged-in customer to the specified guest shopping cart.
     */
    public MutationQuery assignCustomerToGuestCart(String cartId, CartQueryDefinition queryDef) {
        startField("assignCustomerToGuestCart");

        _queryBuilder.append("(cart_id:");
        AbstractQuery.appendQuotedString(_queryBuilder, cartId.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CartQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Change the password for the logged-in customer.
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
     * Remove all items from the specified cart.
     */
    public MutationQuery clearCustomerCart(String cartUid, ClearCustomerCartOutputQueryDefinition queryDef) {
        startField("clearCustomerCart");

        _queryBuilder.append("(cartUid:");
        AbstractQuery.appendQuotedString(_queryBuilder, cartUid.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new ClearCustomerCartOutputQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Mark a negotiable quote as closed. The negotiable quote is still visible on the storefront.
     */
    public MutationQuery closeNegotiableQuotes(CloseNegotiableQuotesInput input, CloseNegotiableQuotesOutputQueryDefinition queryDef) {
        startField("closeNegotiableQuotes");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CloseNegotiableQuotesOutputQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class CopyItemsBetweenRequisitionListsArguments extends Arguments {
        CopyItemsBetweenRequisitionListsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, false);
        }

        /**
         * The unique ID of the destination requisition list. If null, a new requisition list will be created.
         */
        public CopyItemsBetweenRequisitionListsArguments destinationRequisitionListUid(ID value) {
            if (value != null) {
                startArgument("destinationRequisitionListUid");
                AbstractQuery.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
         * The list of products to copy.
         */
        public CopyItemsBetweenRequisitionListsArguments requisitionListItem(CopyItemsBetweenRequisitionListsInput value) {
            if (value != null) {
                startArgument("requisitionListItem");
                value.appendTo(_queryBuilder);
            }
            return this;
        }
    }

    public interface CopyItemsBetweenRequisitionListsArgumentsDefinition {
        void define(CopyItemsBetweenRequisitionListsArguments args);
    }

    /**
     * Copy items from one requisition list to another.
     */
    public MutationQuery copyItemsBetweenRequisitionLists(ID sourceRequisitionListUid,
        CopyItemsFromRequisitionListsOutputQueryDefinition queryDef) {
        return copyItemsBetweenRequisitionLists(sourceRequisitionListUid, args -> {}, queryDef);
    }

    /**
     * Copy items from one requisition list to another.
     */
    public MutationQuery copyItemsBetweenRequisitionLists(ID sourceRequisitionListUid,
        CopyItemsBetweenRequisitionListsArgumentsDefinition argsDef, CopyItemsFromRequisitionListsOutputQueryDefinition queryDef) {
        startField("copyItemsBetweenRequisitionLists");

        _queryBuilder.append("(sourceRequisitionListUid:");
        AbstractQuery.appendQuotedString(_queryBuilder, sourceRequisitionListUid.toString());

        argsDef.define(new CopyItemsBetweenRequisitionListsArguments(_queryBuilder));

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CopyItemsFromRequisitionListsOutputQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Copy products from one wish list to another. The original wish list is unchanged.
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

    /**
     * Create a company at the request of either a customer or a guest.
     */
    public MutationQuery createCompany(CompanyCreateInput input, CreateCompanyOutputQueryDefinition queryDef) {
        startField("createCompany");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CreateCompanyOutputQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Create a new company role.
     */
    public MutationQuery createCompanyRole(CompanyRoleCreateInput input, CreateCompanyRoleOutputQueryDefinition queryDef) {
        startField("createCompanyRole");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CreateCompanyRoleOutputQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Create a new team for the authenticated customer&#39;s company.
     */
    public MutationQuery createCompanyTeam(CompanyTeamCreateInput input, CreateCompanyTeamOutputQueryDefinition queryDef) {
        startField("createCompanyTeam");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CreateCompanyTeamOutputQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Create a new company user at the request of an existing customer.
     */
    public MutationQuery createCompanyUser(CompanyUserCreateInput input, CreateCompanyUserOutputQueryDefinition queryDef) {
        startField("createCompanyUser");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CreateCompanyUserOutputQuery(_queryBuilder));
        _queryBuilder.append('}');

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
     * Create a new compare list. The compare list is saved for logged in customers.
     */
    public MutationQuery createCompareList(CompareListQueryDefinition queryDef) {
        return createCompareList(args -> {}, queryDef);
    }

    /**
     * Create a new compare list. The compare list is saved for logged in customers.
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
     * Use `createCustomerV2` instead.
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
     * Create a billing or shipping address for a customer or guest.
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
     * Create a customer account.
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

        /**
         * An optional input object that assigns the specified ID to the cart.
         */
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
     * Create an empty shopping cart for a guest or logged in user
     */
    public MutationQuery createEmptyCart() {
        return createEmptyCart(args -> {});
    }

    /**
     * Create an empty shopping cart for a guest or logged in user
     */
    public MutationQuery createEmptyCart(CreateEmptyCartArgumentsDefinition argsDef) {
        startField("createEmptyCart");

        CreateEmptyCartArguments args = new CreateEmptyCartArguments(_queryBuilder);
        argsDef.define(args);
        CreateEmptyCartArguments.end(args);

        return this;
    }

    /**
     * Create a gift registry on behalf of the customer.
     */
    public MutationQuery createGiftRegistry(CreateGiftRegistryInput giftRegistry, CreateGiftRegistryOutputQueryDefinition queryDef) {
        startField("createGiftRegistry");

        _queryBuilder.append("(giftRegistry:");
        giftRegistry.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CreateGiftRegistryOutputQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Initiate a transaction and receive a token. Use this mutation for Payflow Pro and Payments Pro
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
     * Initiate an Express Checkout transaction and receive a token. Use this mutation for Express Checkout
     * and Payments Standard payment methods.
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
     * Create a product review for the specified product.
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

    public class CreateRequisitionListArguments extends Arguments {
        CreateRequisitionListArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        public CreateRequisitionListArguments input(CreateRequisitionListInput value) {
            if (value != null) {
                startArgument("input");
                value.appendTo(_queryBuilder);
            }
            return this;
        }
    }

    public interface CreateRequisitionListArgumentsDefinition {
        void define(CreateRequisitionListArguments args);
    }

    /**
     * Create an empty requisition list.
     */
    public MutationQuery createRequisitionList(CreateRequisitionListOutputQueryDefinition queryDef) {
        return createRequisitionList(args -> {}, queryDef);
    }

    /**
     * Create an empty requisition list.
     */
    public MutationQuery createRequisitionList(CreateRequisitionListArgumentsDefinition argsDef,
        CreateRequisitionListOutputQueryDefinition queryDef) {
        startField("createRequisitionList");

        CreateRequisitionListArguments args = new CreateRequisitionListArguments(_queryBuilder);
        argsDef.define(args);
        CreateRequisitionListArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new CreateRequisitionListOutputQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Create a new wish list.
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
     * Delete the specified company role.
     */
    public MutationQuery deleteCompanyRole(ID id, DeleteCompanyRoleOutputQueryDefinition queryDef) {
        startField("deleteCompanyRole");

        _queryBuilder.append("(id:");
        AbstractQuery.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DeleteCompanyRoleOutputQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Delete the specified company team.
     */
    public MutationQuery deleteCompanyTeam(ID id, DeleteCompanyTeamOutputQueryDefinition queryDef) {
        startField("deleteCompanyTeam");

        _queryBuilder.append("(id:");
        AbstractQuery.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DeleteCompanyTeamOutputQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Delete the specified company user.
     */
    public MutationQuery deleteCompanyUser(ID id, DeleteCompanyUserOutputQueryDefinition queryDef) {
        startField("deleteCompanyUser");

        _queryBuilder.append("(id:");
        AbstractQuery.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DeleteCompanyUserOutputQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Delete the specified compare list.
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
     * Delete the billing or shipping address of a customer.
     */
    public MutationQuery deleteCustomerAddress(int id) {
        startField("deleteCustomerAddress");

        _queryBuilder.append("(id:");
        _queryBuilder.append(id);

        _queryBuilder.append(')');

        return this;
    }

    /**
     * Delete a negotiable quote. The negotiable quote will not be displayed on the storefront.
     */
    public MutationQuery deleteNegotiableQuotes(DeleteNegotiableQuotesInput input, DeleteNegotiableQuotesOutputQueryDefinition queryDef) {
        startField("deleteNegotiableQuotes");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DeleteNegotiableQuotesOutputQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Delete a customer&#39;s payment token.
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
     * Delete a requisition list.
     */
    public MutationQuery deleteRequisitionList(ID requisitionListUid, DeleteRequisitionListOutputQueryDefinition queryDef) {
        startField("deleteRequisitionList");

        _queryBuilder.append("(requisitionListUid:");
        AbstractQuery.appendQuotedString(_queryBuilder, requisitionListUid.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DeleteRequisitionListOutputQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Delete items from a requisition list.
     */
    public MutationQuery deleteRequisitionListItems(ID requisitionListUid, List<ID> requisitionListItemUids,
        DeleteRequisitionListItemsOutputQueryDefinition queryDef) {
        startField("deleteRequisitionListItems");

        _queryBuilder.append("(requisitionListUid:");
        AbstractQuery.appendQuotedString(_queryBuilder, requisitionListUid.toString());

        _queryBuilder.append(",requisitionListItemUids:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (ID item1 : requisitionListItemUids) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                AbstractQuery.appendQuotedString(_queryBuilder, item1.toString());
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DeleteRequisitionListItemsOutputQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Delete the specified wish list. You cannot delete the customer&#39;s default (first) wish list.
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
     * Generate a token for specified customer.
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
     * Request a customer token so that an administrator can perform remote shopping assistance.
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
     * Handle a payment response and save the payment in Quote. Use this mutation for Payflow Pro and
     * Payments Pro payment methods.
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

        /**
         * The cart ID after the guest logs in.
         */
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
     * Transfer the contents of a guest cart into the cart of a logged-in customer.
     */
    public MutationQuery mergeCarts(String sourceCartId, CartQueryDefinition queryDef) {
        return mergeCarts(sourceCartId, args -> {}, queryDef);
    }

    /**
     * Transfer the contents of a guest cart into the cart of a logged-in customer.
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
     * Move all items from the cart to a gift registry.
     */
    public MutationQuery moveCartItemsToGiftRegistry(ID cartUid, ID giftRegistryUid,
        MoveCartItemsToGiftRegistryOutputQueryDefinition queryDef) {
        startField("moveCartItemsToGiftRegistry");

        _queryBuilder.append("(cartUid:");
        AbstractQuery.appendQuotedString(_queryBuilder, cartUid.toString());

        _queryBuilder.append(",giftRegistryUid:");
        AbstractQuery.appendQuotedString(_queryBuilder, giftRegistryUid.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new MoveCartItemsToGiftRegistryOutputQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class MoveItemsBetweenRequisitionListsArguments extends Arguments {
        MoveItemsBetweenRequisitionListsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, false);
        }

        /**
         * The unique ID of the destination requisition list. If null, a new requisition list will be created.
         */
        public MoveItemsBetweenRequisitionListsArguments destinationRequisitionListUid(ID value) {
            if (value != null) {
                startArgument("destinationRequisitionListUid");
                AbstractQuery.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
         * The list of products to move.
         */
        public MoveItemsBetweenRequisitionListsArguments requisitionListItem(MoveItemsBetweenRequisitionListsInput value) {
            if (value != null) {
                startArgument("requisitionListItem");
                value.appendTo(_queryBuilder);
            }
            return this;
        }
    }

    public interface MoveItemsBetweenRequisitionListsArgumentsDefinition {
        void define(MoveItemsBetweenRequisitionListsArguments args);
    }

    /**
     * Move Items from one requisition list to another.
     */
    public MutationQuery moveItemsBetweenRequisitionLists(ID sourceRequisitionListUid,
        MoveItemsBetweenRequisitionListsOutputQueryDefinition queryDef) {
        return moveItemsBetweenRequisitionLists(sourceRequisitionListUid, args -> {}, queryDef);
    }

    /**
     * Move Items from one requisition list to another.
     */
    public MutationQuery moveItemsBetweenRequisitionLists(ID sourceRequisitionListUid,
        MoveItemsBetweenRequisitionListsArgumentsDefinition argsDef, MoveItemsBetweenRequisitionListsOutputQueryDefinition queryDef) {
        startField("moveItemsBetweenRequisitionLists");

        _queryBuilder.append("(sourceRequisitionListUid:");
        AbstractQuery.appendQuotedString(_queryBuilder, sourceRequisitionListUid.toString());

        argsDef.define(new MoveItemsBetweenRequisitionListsArguments(_queryBuilder));

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new MoveItemsBetweenRequisitionListsOutputQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Move products from one wish list to another.
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

    /**
     * Convert a negotiable quote into an order.
     */
    public MutationQuery placeNegotiableQuoteOrder(PlaceNegotiableQuoteOrderInput input,
        PlaceNegotiableQuoteOrderOutputQueryDefinition queryDef) {
        startField("placeNegotiableQuoteOrder");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new PlaceNegotiableQuoteOrderOutputQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class PlaceOrderArguments extends Arguments {
        PlaceOrderArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
         * An input object that defines the shopper&#39;s cart ID.
         */
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

    /**
     * Convert the quote into an order.
     */
    public MutationQuery placeOrder(PlaceOrderOutputQueryDefinition queryDef) {
        return placeOrder(args -> {}, queryDef);
    }

    /**
     * Convert the quote into an order.
     */
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
     * Redeem a gift card for store credit.
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

        /**
         * An input object that defines which coupon code to remove from the cart.
         */
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

    /**
     * Remove a previously-applied coupon from the cart. The cart must contain at least one item in order
     * to remove the coupon.
     */
    public MutationQuery removeCouponFromCart(RemoveCouponFromCartOutputQueryDefinition queryDef) {
        return removeCouponFromCart(args -> {}, queryDef);
    }

    /**
     * Remove a previously-applied coupon from the cart. The cart must contain at least one item in order
     * to remove the coupon.
     */
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

        /**
         * An input object that specifies which gift card code to remove from the cart.
         */
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

    /**
     * Removes a gift card from the cart.
     */
    public MutationQuery removeGiftCardFromCart(RemoveGiftCardFromCartOutputQueryDefinition queryDef) {
        return removeGiftCardFromCart(args -> {}, queryDef);
    }

    /**
     * Removes a gift card from the cart.
     */
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

    /**
     * Delete the specified gift registry.
     */
    public MutationQuery removeGiftRegistry(ID giftRegistryUid, RemoveGiftRegistryOutputQueryDefinition queryDef) {
        startField("removeGiftRegistry");

        _queryBuilder.append("(giftRegistryUid:");
        AbstractQuery.appendQuotedString(_queryBuilder, giftRegistryUid.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new RemoveGiftRegistryOutputQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Delete the specified items from a gift registry.
     */
    public MutationQuery removeGiftRegistryItems(ID giftRegistryUid, List<ID> itemsUid,
        RemoveGiftRegistryItemsOutputQueryDefinition queryDef) {
        startField("removeGiftRegistryItems");

        _queryBuilder.append("(giftRegistryUid:");
        AbstractQuery.appendQuotedString(_queryBuilder, giftRegistryUid.toString());

        _queryBuilder.append(",itemsUid:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (ID item1 : itemsUid) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                AbstractQuery.appendQuotedString(_queryBuilder, item1.toString());
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new RemoveGiftRegistryItemsOutputQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Removes registrants from a gift registry.
     */
    public MutationQuery removeGiftRegistryRegistrants(ID giftRegistryUid, List<ID> registrantsUid,
        RemoveGiftRegistryRegistrantsOutputQueryDefinition queryDef) {
        startField("removeGiftRegistryRegistrants");

        _queryBuilder.append("(giftRegistryUid:");
        AbstractQuery.appendQuotedString(_queryBuilder, giftRegistryUid.toString());

        _queryBuilder.append(",registrantsUid:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (ID item1 : registrantsUid) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                AbstractQuery.appendQuotedString(_queryBuilder, item1.toString());
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new RemoveGiftRegistryRegistrantsOutputQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class RemoveItemFromCartArguments extends Arguments {
        RemoveItemFromCartArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
         * An input object that defines which products to remove from the cart.
         */
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

    /**
     * Delete the entire quantity of a specified item from the cart. If you remove all items from the cart,
     * the cart continues to exist.
     */
    public MutationQuery removeItemFromCart(RemoveItemFromCartOutputQueryDefinition queryDef) {
        return removeItemFromCart(args -> {}, queryDef);
    }

    /**
     * Delete the entire quantity of a specified item from the cart. If you remove all items from the cart,
     * the cart continues to exist.
     */
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

    /**
     * Remove one or more products from a negotiable quote.
     */
    public MutationQuery removeNegotiableQuoteItems(RemoveNegotiableQuoteItemsInput input,
        RemoveNegotiableQuoteItemsOutputQueryDefinition queryDef) {
        startField("removeNegotiableQuoteItems");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new RemoveNegotiableQuoteItemsOutputQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class RemoveProductsFromCompareListArguments extends Arguments {
        RemoveProductsFromCompareListArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
         * An input object that defines which products to remove from a compare list.
         */
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
     * Remove products from the specified compare list.
     */
    public MutationQuery removeProductsFromCompareList(CompareListQueryDefinition queryDef) {
        return removeProductsFromCompareList(args -> {}, queryDef);
    }

    /**
     * Remove products from the specified compare list.
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
     * Remove one or more products from the specified wish list.
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
     * Remove a tracked shipment from a return.
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
     * Cancel the application of reward points to the cart.
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
     * Remove store credit that has been applied to the specified cart.
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
     * Add all products from a customer&#39;s previous order to the cart.
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
     * Request a new negotiable quote on behalf of the buyer.
     */
    public MutationQuery requestNegotiableQuote(RequestNegotiableQuoteInput input, RequestNegotiableQuoteOutputQueryDefinition queryDef) {
        startField("requestNegotiableQuote");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new RequestNegotiableQuoteOutputQuery(_queryBuilder));
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
     * Initiates a buyer&#39;s request to return items for replacement or refund.
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
     * after requesting it using `requestPasswordResetEmail`.
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
     * Revoke the customer token.
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

        /**
         * An input object that defines sender, recipients, and product.
         */
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
     * Send a message on behalf of a customer to the specified email addresses.
     */
    public MutationQuery sendEmailToFriend(SendEmailToFriendOutputQueryDefinition queryDef) {
        return sendEmailToFriend(args -> {}, queryDef);
    }

    /**
     * Send a message on behalf of a customer to the specified email addresses.
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

    /**
     * Send the negotiable quote to the seller for review.
     */
    public MutationQuery sendNegotiableQuoteForReview(SendNegotiableQuoteForReviewInput input,
        SendNegotiableQuoteForReviewOutputQueryDefinition queryDef) {
        startField("sendNegotiableQuoteForReview");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new SendNegotiableQuoteForReviewOutputQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class SetBillingAddressOnCartArguments extends Arguments {
        SetBillingAddressOnCartArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
         * An input object that defines the billing address to be assigned to the cart.
         */
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

    /**
     * Set the billing address on a specific cart.
     */
    public MutationQuery setBillingAddressOnCart(SetBillingAddressOnCartOutputQueryDefinition queryDef) {
        return setBillingAddressOnCart(args -> {}, queryDef);
    }

    /**
     * Set the billing address on a specific cart.
     */
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

        /**
         * An input object that defines the selected gift options.
         */
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
     * Set gift options, including gift messages, gift wrapping, gift receipts, and printed cards.
     */
    public MutationQuery setGiftOptionsOnCart(SetGiftOptionsOnCartOutputQueryDefinition queryDef) {
        return setGiftOptionsOnCart(args -> {}, queryDef);
    }

    /**
     * Set gift options, including gift messages, gift wrapping, gift receipts, and printed cards.
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

        /**
         * An input object that defines a guest email address.
         */
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

    /**
     * Assign the email address of a guest to the cart.
     */
    public MutationQuery setGuestEmailOnCart(SetGuestEmailOnCartOutputQueryDefinition queryDef) {
        return setGuestEmailOnCart(args -> {}, queryDef);
    }

    /**
     * Assign the email address of a guest to the cart.
     */
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

    /**
     * Assign a billing address to a negotiable quote.
     */
    public MutationQuery setNegotiableQuoteBillingAddress(SetNegotiableQuoteBillingAddressInput input,
        SetNegotiableQuoteBillingAddressOutputQueryDefinition queryDef) {
        startField("setNegotiableQuoteBillingAddress");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new SetNegotiableQuoteBillingAddressOutputQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Set the payment method on a negotiable quote.
     */
    public MutationQuery setNegotiableQuotePaymentMethod(SetNegotiableQuotePaymentMethodInput input,
        SetNegotiableQuotePaymentMethodOutputQueryDefinition queryDef) {
        startField("setNegotiableQuotePaymentMethod");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new SetNegotiableQuotePaymentMethodOutputQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Assign a previously-defined address as the shipping address for a negotiable quote.
     */
    public MutationQuery setNegotiableQuoteShippingAddress(SetNegotiableQuoteShippingAddressInput input,
        SetNegotiableQuoteShippingAddressOutputQueryDefinition queryDef) {
        startField("setNegotiableQuoteShippingAddress");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new SetNegotiableQuoteShippingAddressOutputQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Assign the shipping methods on the negotiable quote.
     */
    public MutationQuery setNegotiableQuoteShippingMethods(SetNegotiableQuoteShippingMethodsInput input,
        SetNegotiableQuoteShippingMethodsOutputQueryDefinition queryDef) {
        startField("setNegotiableQuoteShippingMethods");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new SetNegotiableQuoteShippingMethodsOutputQuery(_queryBuilder));
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
     * Set the cart payment method and convert the cart into an order.
     *
     * @deprecated Should use setPaymentMethodOnCart and placeOrder mutations in single request.
     */
    public MutationQuery setPaymentMethodAndPlaceOrder(PlaceOrderOutputQueryDefinition queryDef) {
        return setPaymentMethodAndPlaceOrder(args -> {}, queryDef);
    }

    /**
     * Set the cart payment method and convert the cart into an order.
     *
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

        /**
         * An input object that defines which payment method to apply to the cart.
         */
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

    /**
     * Apply a payment method to the cart.
     */
    public MutationQuery setPaymentMethodOnCart(SetPaymentMethodOnCartOutputQueryDefinition queryDef) {
        return setPaymentMethodOnCart(args -> {}, queryDef);
    }

    /**
     * Apply a payment method to the cart.
     */
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

        /**
         * An input object that defines one or more shipping addresses to be assigned to the cart.
         */
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

    /**
     * Set one or more shipping addresses on a specific cart.
     */
    public MutationQuery setShippingAddressesOnCart(SetShippingAddressesOnCartOutputQueryDefinition queryDef) {
        return setShippingAddressesOnCart(args -> {}, queryDef);
    }

    /**
     * Set one or more shipping addresses on a specific cart.
     */
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

        /**
         * An input object that applies one or more shipping methods to the cart.
         */
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

    /**
     * Set one or more delivery methods on a cart.
     */
    public MutationQuery setShippingMethodsOnCart(SetShippingMethodsOnCartOutputQueryDefinition queryDef) {
        return setShippingMethodsOnCart(args -> {}, queryDef);
    }

    /**
     * Set one or more delivery methods on a cart.
     */
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
     * Send an email about the gift registry to a list of invitees.
     */
    public MutationQuery shareGiftRegistry(ID giftRegistryUid, ShareGiftRegistrySenderInput sender,
        List<ShareGiftRegistryInviteeInput> invitees, ShareGiftRegistryOutputQueryDefinition queryDef) {
        startField("shareGiftRegistry");

        _queryBuilder.append("(giftRegistryUid:");
        AbstractQuery.appendQuotedString(_queryBuilder, giftRegistryUid.toString());

        _queryBuilder.append(",sender:");
        sender.appendTo(_queryBuilder);

        _queryBuilder.append(",invitees:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (ShareGiftRegistryInviteeInput item1 : invitees) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                item1.appendTo(_queryBuilder);
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new ShareGiftRegistryOutputQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Subscribe the specified email to the store&#39;s newsletter.
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

        /**
         * An input object that defines products to be updated.
         */
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

    /**
     * Modify items in the cart.
     */
    public MutationQuery updateCartItems(UpdateCartItemsOutputQueryDefinition queryDef) {
        return updateCartItems(args -> {}, queryDef);
    }

    /**
     * Modify items in the cart.
     */
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
     * Update company information.
     */
    public MutationQuery updateCompany(CompanyUpdateInput input, UpdateCompanyOutputQueryDefinition queryDef) {
        startField("updateCompany");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new UpdateCompanyOutputQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Update company role information.
     */
    public MutationQuery updateCompanyRole(CompanyRoleUpdateInput input, UpdateCompanyRoleOutputQueryDefinition queryDef) {
        startField("updateCompanyRole");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new UpdateCompanyRoleOutputQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Change the parent node of a company team.
     */
    public MutationQuery updateCompanyStructure(CompanyStructureUpdateInput input, UpdateCompanyStructureOutputQueryDefinition queryDef) {
        startField("updateCompanyStructure");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new UpdateCompanyStructureOutputQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Update company team data.
     */
    public MutationQuery updateCompanyTeam(CompanyTeamUpdateInput input, UpdateCompanyTeamOutputQueryDefinition queryDef) {
        startField("updateCompanyTeam");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new UpdateCompanyTeamOutputQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Update an existing company user.
     */
    public MutationQuery updateCompanyUser(CompanyUserUpdateInput input, UpdateCompanyUserOutputQueryDefinition queryDef) {
        startField("updateCompanyUser");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new UpdateCompanyUserOutputQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Use `updateCustomerV2` instead.
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

        /**
         * An input object that contains changes to the customer address.
         */
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
     * Update the billing or shipping address of a customer or guest.
     */
    public MutationQuery updateCustomerAddress(int id, CustomerAddressQueryDefinition queryDef) {
        return updateCustomerAddress(id, args -> {}, queryDef);
    }

    /**
     * Update the billing or shipping address of a customer or guest.
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

    /**
     * Change the email address for the logged-in customer.
     */
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
     * Update the customer&#39;s personal information.
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
     * Update the specified gift registry.
     */
    public MutationQuery updateGiftRegistry(ID giftRegistryUid, UpdateGiftRegistryInput giftRegistry,
        UpdateGiftRegistryOutputQueryDefinition queryDef) {
        startField("updateGiftRegistry");

        _queryBuilder.append("(giftRegistryUid:");
        AbstractQuery.appendQuotedString(_queryBuilder, giftRegistryUid.toString());

        _queryBuilder.append(",giftRegistry:");
        giftRegistry.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new UpdateGiftRegistryOutputQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Update the specified items in the gift registry.
     */
    public MutationQuery updateGiftRegistryItems(ID giftRegistryUid, List<UpdateGiftRegistryItemInput> items,
        UpdateGiftRegistryItemsOutputQueryDefinition queryDef) {
        startField("updateGiftRegistryItems");

        _queryBuilder.append("(giftRegistryUid:");
        AbstractQuery.appendQuotedString(_queryBuilder, giftRegistryUid.toString());

        _queryBuilder.append(",items:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (UpdateGiftRegistryItemInput item1 : items) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                item1.appendTo(_queryBuilder);
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new UpdateGiftRegistryItemsOutputQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Modify the properties of one or more gift registry registrants.
     */
    public MutationQuery updateGiftRegistryRegistrants(ID giftRegistryUid, List<UpdateGiftRegistryRegistrantInput> registrants,
        UpdateGiftRegistryRegistrantsOutputQueryDefinition queryDef) {
        startField("updateGiftRegistryRegistrants");

        _queryBuilder.append("(giftRegistryUid:");
        AbstractQuery.appendQuotedString(_queryBuilder, giftRegistryUid.toString());

        _queryBuilder.append(",registrants:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (UpdateGiftRegistryRegistrantInput item1 : registrants) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                item1.appendTo(_queryBuilder);
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new UpdateGiftRegistryRegistrantsOutputQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Change the quantity of one or more items in an existing negotiable quote.
     */
    public MutationQuery updateNegotiableQuoteQuantities(UpdateNegotiableQuoteQuantitiesInput input,
        UpdateNegotiableQuoteItemsQuantityOutputQueryDefinition queryDef) {
        startField("updateNegotiableQuoteQuantities");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new UpdateNegotiableQuoteItemsQuantityOutputQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Update one or more products in the specified wish list.
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

    public class UpdateRequisitionListArguments extends Arguments {
        UpdateRequisitionListArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, false);
        }

        public UpdateRequisitionListArguments input(UpdateRequisitionListInput value) {
            if (value != null) {
                startArgument("input");
                value.appendTo(_queryBuilder);
            }
            return this;
        }
    }

    public interface UpdateRequisitionListArgumentsDefinition {
        void define(UpdateRequisitionListArguments args);
    }

    /**
     * Rename a requisition list and change its description.
     */
    public MutationQuery updateRequisitionList(ID requisitionListUid, UpdateRequisitionListOutputQueryDefinition queryDef) {
        return updateRequisitionList(requisitionListUid, args -> {}, queryDef);
    }

    /**
     * Rename a requisition list and change its description.
     */
    public MutationQuery updateRequisitionList(ID requisitionListUid, UpdateRequisitionListArgumentsDefinition argsDef,
        UpdateRequisitionListOutputQueryDefinition queryDef) {
        startField("updateRequisitionList");

        _queryBuilder.append("(requisitionListUid:");
        AbstractQuery.appendQuotedString(_queryBuilder, requisitionListUid.toString());

        argsDef.define(new UpdateRequisitionListArguments(_queryBuilder));

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new UpdateRequisitionListOutputQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
     * Update items in a requisition list.
     */
    public MutationQuery updateRequisitionListItems(ID requisitionListUid, List<UpdateRequisitionListItemsInput> requisitionListItems,
        UpdateRequisitionListItemsOutputQueryDefinition queryDef) {
        startField("updateRequisitionListItems");

        _queryBuilder.append("(requisitionListUid:");
        AbstractQuery.appendQuotedString(_queryBuilder, requisitionListUid.toString());

        _queryBuilder.append(",requisitionListItems:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (UpdateRequisitionListItemsInput item1 : requisitionListItems) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                item1.appendTo(_queryBuilder);
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new UpdateRequisitionListItemsOutputQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class UpdateWishlistArguments extends Arguments {
        UpdateWishlistArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, false);
        }

        /**
         * The name assigned to the wish list.
         */
        public UpdateWishlistArguments name(String value) {
            if (value != null) {
                startArgument("name");
                AbstractQuery.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
         * Indicates the visibility of the wish list.
         */
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
     * Change the name and visibility of the specified wish list.
     */
    public MutationQuery updateWishlist(ID wishlistId, UpdateWishlistOutputQueryDefinition queryDef) {
        return updateWishlist(wishlistId, args -> {}, queryDef);
    }

    /**
     * Change the name and visibility of the specified wish list.
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

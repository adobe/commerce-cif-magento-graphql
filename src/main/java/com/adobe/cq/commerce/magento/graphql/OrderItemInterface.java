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

import java.util.List;

import com.shopify.graphql.support.CustomFieldInterface;
import com.shopify.graphql.support.ID;

/**
 * Order item details.
 */

public interface OrderItemInterface extends CustomFieldInterface {
    String getGraphQlTypeName();

    /**
     * The final discount information for the product.
     */
    List<Discount> getDiscounts();

    /**
     * Indicates whether the order item is eligible to be in a return request.
     */
    Boolean getEligibleForReturn();

    /**
     * The entered option for the base product, such as a logo or image.
     */
    List<OrderItemOption> getEnteredOptions();

    /**
     * The selected gift wrapping for the order item.
     */
    GiftWrapping getGiftWrapping();

    /**
     * The unique ID for an `OrderItemInterface` object.
     */
    ID getId();

    /**
     * The name of the base product.
     */
    String getProductName();

    /**
     * The sale price of the base product, including selected options.
     */
    Money getProductSalePrice();

    /**
     * The SKU of the base product.
     */
    String getProductSku();

    /**
     * The type of product, such as simple, configurable, etc.
     */
    String getProductType();

    /**
     * URL key of the base product.
     */
    String getProductUrlKey();

    /**
     * The number of canceled items.
     */
    Double getQuantityCanceled();

    /**
     * The number of invoiced items.
     */
    Double getQuantityInvoiced();

    /**
     * The number of units ordered for this item.
     */
    Double getQuantityOrdered();

    /**
     * The number of refunded items.
     */
    Double getQuantityRefunded();

    /**
     * The number of returned items.
     */
    Double getQuantityReturned();

    /**
     * The number of shipped items.
     */
    Double getQuantityShipped();

    /**
     * The selected options for the base product, such as color or size.
     */
    List<OrderItemOption> getSelectedOptions();

    /**
     * The status of the order item.
     */
    String getStatus();
}

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
 * Credit memo item details
 */

public interface CreditMemoItemInterface extends CustomFieldInterface {
    String getGraphQlTypeName();

    /**
     * Contains information about the final discount amount for the base product, including discounts on
     * options
     */
    List<Discount> getDiscounts();

    /**
     * The unique ID of the credit memo item, used for API purposes
     */
    ID getId();

    /**
     * The order item the credit memo is applied to
     */
    OrderItemInterface getOrderItem();

    /**
     * The name of the base product
     */
    String getProductName();

    /**
     * The sale price for the base product, including selected options
     */
    Money getProductSalePrice();

    /**
     * SKU of the base product
     */
    String getProductSku();

    /**
     * The number of refunded items
     */
    Double getQuantityRefunded();
}

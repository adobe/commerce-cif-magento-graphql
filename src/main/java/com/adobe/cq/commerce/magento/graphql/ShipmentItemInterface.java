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

import com.shopify.graphql.support.CustomFieldInterface;
import com.shopify.graphql.support.ID;

/**
 * Order shipment item details.
 */

public interface ShipmentItemInterface extends CustomFieldInterface {
    String getGraphQlTypeName();

    /**
     * The unique ID for a `ShipmentItemInterface` object.
     */
    ID getId();

    /**
     * The order item associated with the shipment item.
     */
    OrderItemInterface getOrderItem();

    /**
     * The name of the base product.
     */
    String getProductName();

    /**
     * The sale price for the base product.
     */
    Money getProductSalePrice();

    /**
     * The SKU of the base product.
     */
    String getProductSku();

    /**
     * The number of shipped items.
     */
    Double getQuantityShipped();
}

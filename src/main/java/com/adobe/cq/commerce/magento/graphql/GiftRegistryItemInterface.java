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

public interface GiftRegistryItemInterface extends CustomFieldInterface {
    String getGraphQlTypeName();

    /**
     * The date the product was added to the gift registry.
     */
    String getCreatedAt();

    /**
     * A brief message about the gift registry item.
     */
    String getNote();

    /**
     * Details about the gift registry item.
     */
    ProductInterface getProduct();

    /**
     * The requested quantity of the product.
     */
    Double getQuantity();

    /**
     * The fulfilled quantity of the product.
     */
    Double getQuantityFulfilled();

    /**
     * The unique ID of a gift registry item.
     */
    ID getUid();
}

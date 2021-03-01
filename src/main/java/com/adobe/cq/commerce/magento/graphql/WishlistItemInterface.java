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

public interface WishlistItemInterface extends CustomFieldInterface {
    String getGraphQlTypeName();

    /**
     * The date and time the item was added to the wish list
     */
    String getAddedAt();

    /**
     * Custom options selected for the wish list item
     */
    List<SelectedCustomizableOption> getCustomizableOptions();

    /**
     * The description of the item
     */
    String getDescription();

    /**
     * The unique ID for a `WishlistItemInterface` object
     */
    ID getId();

    /**
     * Product details of the wish list item
     */
    ProductInterface getProduct();

    /**
     * The quantity of this wish list item
     */
    Double getQuantity();
}

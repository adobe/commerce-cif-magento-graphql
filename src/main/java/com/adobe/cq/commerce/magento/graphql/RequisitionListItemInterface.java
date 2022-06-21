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
 * The interface for requisition list items.
 */

public interface RequisitionListItemInterface extends CustomFieldInterface {
    String getGraphQlTypeName();

    /**
     * Selected custom options for an item in the requisition list.
     */
    List<SelectedCustomizableOption> getCustomizableOptions();

    /**
     * Details about a requisition list item.
     */
    ProductInterface getProduct();

    /**
     * The amount added.
     */
    Double getQuantity();

    /**
     * The unique ID for the requisition list item.
     */
    ID getUid();
}

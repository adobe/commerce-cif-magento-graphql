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

public interface GiftRegistryDynamicAttributeMetadataInterface extends CustomFieldInterface {
    String getGraphQlTypeName();

    /**
     * Indicates which group the dynamic attribute a member of
     */
    String getAttributeGroup();

    /**
     * The internal ID of the dynamic attribute
     */
    ID getCode();

    /**
     * The selected input type for this dynamic attribute. The value can be one of several static or custom
     * types
     */
    String getInputType();

    /**
     * Indicates whether the dynamic attribute is required
     */
    Boolean getIsRequired();

    /**
     * The display name of the dynamic attribute
     */
    String getLabel();

    /**
     * The order in which to display the dynamic attribute
     */
    Integer getSortOrder();
}

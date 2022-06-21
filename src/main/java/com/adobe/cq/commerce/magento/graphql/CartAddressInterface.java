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

public interface CartAddressInterface extends CustomFieldInterface {
    String getGraphQlTypeName();

    /**
     * The city specified for the billing or shipping address.
     */
    String getCity();

    /**
     * The company specified for the billing or shipping address.
     */
    String getCompany();

    /**
     * An object containing the country label and code.
     */
    CartAddressCountry getCountry();

    /**
     * The first name of the customer or guest.
     */
    String getFirstname();

    /**
     * The last name of the customer or guest.
     */
    String getLastname();

    /**
     * The ZIP or postal code of the billing or shipping address.
     */
    String getPostcode();

    /**
     * An object containing the region label and code.
     */
    CartAddressRegion getRegion();

    /**
     * An array containing the street for the billing or shipping address.
     */
    List<String> getStreet();

    /**
     * The telephone number for the billing or shipping address.
     */
    String getTelephone();
}

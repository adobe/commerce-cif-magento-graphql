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

public interface NegotiableQuoteAddressInterface extends CustomFieldInterface {
    String getGraphQlTypeName();

    /**
     * The company&#39;s city or town.
     */
    String getCity();

    /**
     * The company name associated with the shipping/billing address.
     */
    String getCompany();

    /**
     * The company&#39;s country.
     */
    NegotiableQuoteAddressCountry getCountry();

    /**
     * The first name of the company user.
     */
    String getFirstname();

    /**
     * The last name of the company user.
     */
    String getLastname();

    /**
     * The company&#39;s ZIP or postal code.
     */
    String getPostcode();

    /**
     * An object containing the region name, region code, and region ID.
     */
    NegotiableQuoteAddressRegion getRegion();

    /**
     * An array of strings that define the street number and name.
     */
    List<String> getStreet();

    /**
     * The customer&#39;s telephone number.
     */
    String getTelephone();
}

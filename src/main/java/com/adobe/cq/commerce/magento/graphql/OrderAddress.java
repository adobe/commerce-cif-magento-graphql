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

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;

/**
 * OrderAddress contains detailed information about an order&#39;s billing and shipping addresses
 */
public class OrderAddress extends AbstractResponse<OrderAddress> {
    public OrderAddress() {}

    public OrderAddress(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "city": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "company": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "country_code": {
                    CountryCodeEnum optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = CountryCodeEnum.fromGraphQl(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "fax": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "firstname": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "lastname": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "middlename": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "postcode": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "prefix": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "region": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "region_id": {
                    ID optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ID(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "street": {
                    List<String> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        String optional2 = null;
                        if (!element1.isJsonNull()) {
                            optional2 = jsonAsString(element1, key);
                        }

                        list1.add(optional2);
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "suffix": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "telephone": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "vat_id": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "__typename": {
                    responseData.put(key, jsonAsString(field.getValue(), key));
                    break;
                }

                default: {
                    readCustomField(fieldName, field.getValue());
                }
            }
        }
    }

    public String getGraphQlTypeName() {
        return "OrderAddress";
    }

    /**
     * The city or town
     */
    public String getCity() {
        return (String) get("city");
    }

    public OrderAddress setCity(String arg) {
        optimisticData.put(getKey("city"), arg);
        return this;
    }

    /**
     * The customer&#39;s company
     */
    public String getCompany() {
        return (String) get("company");
    }

    public OrderAddress setCompany(String arg) {
        optimisticData.put(getKey("company"), arg);
        return this;
    }

    /**
     * The customer&#39;s country
     */
    public CountryCodeEnum getCountryCode() {
        return (CountryCodeEnum) get("country_code");
    }

    public OrderAddress setCountryCode(CountryCodeEnum arg) {
        optimisticData.put(getKey("country_code"), arg);
        return this;
    }

    /**
     * The fax number
     */
    public String getFax() {
        return (String) get("fax");
    }

    public OrderAddress setFax(String arg) {
        optimisticData.put(getKey("fax"), arg);
        return this;
    }

    /**
     * The first name of the person associated with the shipping/billing address
     */
    public String getFirstname() {
        return (String) get("firstname");
    }

    public OrderAddress setFirstname(String arg) {
        optimisticData.put(getKey("firstname"), arg);
        return this;
    }

    /**
     * The family name of the person associated with the shipping/billing address
     */
    public String getLastname() {
        return (String) get("lastname");
    }

    public OrderAddress setLastname(String arg) {
        optimisticData.put(getKey("lastname"), arg);
        return this;
    }

    /**
     * The middle name of the person associated with the shipping/billing address
     */
    public String getMiddlename() {
        return (String) get("middlename");
    }

    public OrderAddress setMiddlename(String arg) {
        optimisticData.put(getKey("middlename"), arg);
        return this;
    }

    /**
     * The customer&#39;s order ZIP or postal code
     */
    public String getPostcode() {
        return (String) get("postcode");
    }

    public OrderAddress setPostcode(String arg) {
        optimisticData.put(getKey("postcode"), arg);
        return this;
    }

    /**
     * An honorific, such as Dr., Mr., or Mrs.
     */
    public String getPrefix() {
        return (String) get("prefix");
    }

    public OrderAddress setPrefix(String arg) {
        optimisticData.put(getKey("prefix"), arg);
        return this;
    }

    /**
     * The state or province name
     */
    public String getRegion() {
        return (String) get("region");
    }

    public OrderAddress setRegion(String arg) {
        optimisticData.put(getKey("region"), arg);
        return this;
    }

    /**
     * The unique ID for a `Region` object of a pre-defined region
     */
    public ID getRegionId() {
        return (ID) get("region_id");
    }

    public OrderAddress setRegionId(ID arg) {
        optimisticData.put(getKey("region_id"), arg);
        return this;
    }

    /**
     * An array of strings that define the street number and name
     */
    public List<String> getStreet() {
        return (List<String>) get("street");
    }

    public OrderAddress setStreet(List<String> arg) {
        optimisticData.put(getKey("street"), arg);
        return this;
    }

    /**
     * A value such as Sr., Jr., or III
     */
    public String getSuffix() {
        return (String) get("suffix");
    }

    public OrderAddress setSuffix(String arg) {
        optimisticData.put(getKey("suffix"), arg);
        return this;
    }

    /**
     * The telephone number
     */
    public String getTelephone() {
        return (String) get("telephone");
    }

    public OrderAddress setTelephone(String arg) {
        optimisticData.put(getKey("telephone"), arg);
        return this;
    }

    /**
     * The customer&#39;s Value-added tax (VAT) number (for corporate customers)
     */
    public String getVatId() {
        return (String) get("vat_id");
    }

    public OrderAddress setVatId(String arg) {
        optimisticData.put(getKey("vat_id"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "city":
                return false;

            case "company":
                return false;

            case "country_code":
                return false;

            case "fax":
                return false;

            case "firstname":
                return false;

            case "lastname":
                return false;

            case "middlename":
                return false;

            case "postcode":
                return false;

            case "prefix":
                return false;

            case "region":
                return false;

            case "region_id":
                return false;

            case "street":
                return false;

            case "suffix":
                return false;

            case "telephone":
                return false;

            case "vat_id":
                return false;

            default:
                return false;
        }
    }
}

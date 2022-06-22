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
import com.shopify.graphql.support.SchemaViolationError;

/**
 * Contains detailed information about a customer&#39;s billing or shipping address.
 */
public class CustomerAddress extends AbstractResponse<CustomerAddress> {
    public CustomerAddress() {}

    public CustomerAddress(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "city": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

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

                case "country_id": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "custom_attributes": {
                    List<CustomerAddressAttribute> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<CustomerAddressAttribute> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            CustomerAddressAttribute optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new CustomerAddressAttribute(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "customer_id": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "default_billing": {
                    Boolean optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsBoolean(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "default_shipping": {
                    Boolean optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsBoolean(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "extension_attributes": {
                    List<CustomerAddressAttribute> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<CustomerAddressAttribute> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            CustomerAddressAttribute optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new CustomerAddressAttribute(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
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
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "id": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "lastname": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

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
                    CustomerAddressRegion optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CustomerAddressRegion(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "region_id": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "street": {
                    List<String> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<String> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            String optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = jsonAsString(element1, key);
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

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
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

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
        return "CustomerAddress";
    }

    /**
     * The customer&#39;s city or town.
     */
    public String getCity() {
        return (String) get("city");
    }

    public CustomerAddress setCity(String arg) {
        optimisticData.put(getKey("city"), arg);
        return this;
    }

    /**
     * The customer&#39;s company.
     */
    public String getCompany() {
        return (String) get("company");
    }

    public CustomerAddress setCompany(String arg) {
        optimisticData.put(getKey("company"), arg);
        return this;
    }

    /**
     * The customer&#39;s country.
     */
    public CountryCodeEnum getCountryCode() {
        return (CountryCodeEnum) get("country_code");
    }

    public CustomerAddress setCountryCode(CountryCodeEnum arg) {
        optimisticData.put(getKey("country_code"), arg);
        return this;
    }

    /**
     * The customer&#39;s country.
     *
     * @deprecated Use `country_code` instead.
     */
    @Deprecated
    public String getCountryId() {
        return (String) get("country_id");
    }

    public CustomerAddress setCountryId(String arg) {
        optimisticData.put(getKey("country_id"), arg);
        return this;
    }

    /**
     * @deprecated Custom attributes should not be put into a container.
     */
    @Deprecated
    public List<CustomerAddressAttribute> getCustomAttributes() {
        return (List<CustomerAddressAttribute>) get("custom_attributes");
    }

    public CustomerAddress setCustomAttributes(List<CustomerAddressAttribute> arg) {
        optimisticData.put(getKey("custom_attributes"), arg);
        return this;
    }

    /**
     * The customer ID
     *
     * @deprecated `customer_id` is not needed as part of `CustomerAddress`. The `id` is a unique identifier for the addresses.
     */
    @Deprecated
    public Integer getCustomerId() {
        return (Integer) get("customer_id");
    }

    public CustomerAddress setCustomerId(Integer arg) {
        optimisticData.put(getKey("customer_id"), arg);
        return this;
    }

    /**
     * Indicates whether the address is the customer&#39;s default billing address.
     */
    public Boolean getDefaultBilling() {
        return (Boolean) get("default_billing");
    }

    public CustomerAddress setDefaultBilling(Boolean arg) {
        optimisticData.put(getKey("default_billing"), arg);
        return this;
    }

    /**
     * Indicates whether the address is the customer&#39;s default shipping address.
     */
    public Boolean getDefaultShipping() {
        return (Boolean) get("default_shipping");
    }

    public CustomerAddress setDefaultShipping(Boolean arg) {
        optimisticData.put(getKey("default_shipping"), arg);
        return this;
    }

    /**
     * Contains any extension attributes for the address.
     */
    public List<CustomerAddressAttribute> getExtensionAttributes() {
        return (List<CustomerAddressAttribute>) get("extension_attributes");
    }

    public CustomerAddress setExtensionAttributes(List<CustomerAddressAttribute> arg) {
        optimisticData.put(getKey("extension_attributes"), arg);
        return this;
    }

    /**
     * The customer&#39;s fax number.
     */
    public String getFax() {
        return (String) get("fax");
    }

    public CustomerAddress setFax(String arg) {
        optimisticData.put(getKey("fax"), arg);
        return this;
    }

    /**
     * The first name of the person associated with the shipping/billing address.
     */
    public String getFirstname() {
        return (String) get("firstname");
    }

    public CustomerAddress setFirstname(String arg) {
        optimisticData.put(getKey("firstname"), arg);
        return this;
    }

    /**
     * The ID of a `CustomerAddress` object.
     */
    public Integer getId() {
        return (Integer) get("id");
    }

    public CustomerAddress setId(Integer arg) {
        optimisticData.put(getKey("id"), arg);
        return this;
    }

    /**
     * The family name of the person associated with the shipping/billing address.
     */
    public String getLastname() {
        return (String) get("lastname");
    }

    public CustomerAddress setLastname(String arg) {
        optimisticData.put(getKey("lastname"), arg);
        return this;
    }

    /**
     * The middle name of the person associated with the shipping/billing address.
     */
    public String getMiddlename() {
        return (String) get("middlename");
    }

    public CustomerAddress setMiddlename(String arg) {
        optimisticData.put(getKey("middlename"), arg);
        return this;
    }

    /**
     * The customer&#39;s ZIP or postal code.
     */
    public String getPostcode() {
        return (String) get("postcode");
    }

    public CustomerAddress setPostcode(String arg) {
        optimisticData.put(getKey("postcode"), arg);
        return this;
    }

    /**
     * An honorific, such as Dr., Mr., or Mrs.
     */
    public String getPrefix() {
        return (String) get("prefix");
    }

    public CustomerAddress setPrefix(String arg) {
        optimisticData.put(getKey("prefix"), arg);
        return this;
    }

    /**
     * An object containing the region name, region code, and region ID.
     */
    public CustomerAddressRegion getRegion() {
        return (CustomerAddressRegion) get("region");
    }

    public CustomerAddress setRegion(CustomerAddressRegion arg) {
        optimisticData.put(getKey("region"), arg);
        return this;
    }

    /**
     * The unique ID for a pre-defined region.
     */
    public Integer getRegionId() {
        return (Integer) get("region_id");
    }

    public CustomerAddress setRegionId(Integer arg) {
        optimisticData.put(getKey("region_id"), arg);
        return this;
    }

    /**
     * An array of strings that define the street number and name.
     */
    public List<String> getStreet() {
        return (List<String>) get("street");
    }

    public CustomerAddress setStreet(List<String> arg) {
        optimisticData.put(getKey("street"), arg);
        return this;
    }

    /**
     * A value such as Sr., Jr., or III.
     */
    public String getSuffix() {
        return (String) get("suffix");
    }

    public CustomerAddress setSuffix(String arg) {
        optimisticData.put(getKey("suffix"), arg);
        return this;
    }

    /**
     * The customer&#39;s telephone number.
     */
    public String getTelephone() {
        return (String) get("telephone");
    }

    public CustomerAddress setTelephone(String arg) {
        optimisticData.put(getKey("telephone"), arg);
        return this;
    }

    /**
     * The customer&#39;s Value-added tax (VAT) number (for corporate customers).
     */
    public String getVatId() {
        return (String) get("vat_id");
    }

    public CustomerAddress setVatId(String arg) {
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

            case "country_id":
                return false;

            case "custom_attributes":
                return true;

            case "customer_id":
                return false;

            case "default_billing":
                return false;

            case "default_shipping":
                return false;

            case "extension_attributes":
                return true;

            case "fax":
                return false;

            case "firstname":
                return false;

            case "id":
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
                return true;

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

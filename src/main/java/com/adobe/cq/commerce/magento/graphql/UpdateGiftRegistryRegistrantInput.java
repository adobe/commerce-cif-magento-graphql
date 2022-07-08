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

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.shopify.graphql.support.AbstractQuery;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Input;

public class UpdateGiftRegistryRegistrantInput implements Serializable {
    private ID giftRegistryRegistrantUid;

    private Input<List<GiftRegistryDynamicAttributeInput>> dynamicAttributes = Input.undefined();

    private Input<String> email = Input.undefined();

    private Input<String> firstname = Input.undefined();

    private Input<String> lastname = Input.undefined();

    private Map<String, Input<Serializable>> customFilters = new HashMap<>();

    public UpdateGiftRegistryRegistrantInput(ID giftRegistryRegistrantUid) {
        this.giftRegistryRegistrantUid = giftRegistryRegistrantUid;
    }

    /**
     * The unique ID of a `giftRegistryRegistrant` object
     */
    public ID getGiftRegistryRegistrantUid() {
        return giftRegistryRegistrantUid;
    }

    /**
     * The unique ID of a `giftRegistryRegistrant` object
     */
    public UpdateGiftRegistryRegistrantInput setGiftRegistryRegistrantUid(ID giftRegistryRegistrantUid) {
        this.giftRegistryRegistrantUid = giftRegistryRegistrantUid;
        return this;
    }

    /**
     * As a result of the update, only the values of provided attributes will be affected. If the attribute
     * is missing in the request, its value will not be changed
     */
    public List<GiftRegistryDynamicAttributeInput> getDynamicAttributes() {
        return dynamicAttributes.getValue();
    }

    /**
     * As a result of the update, only the values of provided attributes will be affected. If the attribute
     * is missing in the request, its value will not be changed
     */
    public Input<List<GiftRegistryDynamicAttributeInput>> getDynamicAttributesInput() {
        return dynamicAttributes;
    }

    /**
     * As a result of the update, only the values of provided attributes will be affected. If the attribute
     * is missing in the request, its value will not be changed
     */
    public UpdateGiftRegistryRegistrantInput setDynamicAttributes(List<GiftRegistryDynamicAttributeInput> dynamicAttributes) {
        this.dynamicAttributes = Input.optional(dynamicAttributes);
        return this;
    }

    /**
     * As a result of the update, only the values of provided attributes will be affected. If the attribute
     * is missing in the request, its value will not be changed
     */
    public UpdateGiftRegistryRegistrantInput setDynamicAttributesInput(Input<List<GiftRegistryDynamicAttributeInput>> dynamicAttributes) {
        if (dynamicAttributes == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.dynamicAttributes = dynamicAttributes;
        return this;
    }

    /**
     * The updated email address of the registrant
     */
    public String getEmail() {
        return email.getValue();
    }

    /**
     * The updated email address of the registrant
     */
    public Input<String> getEmailInput() {
        return email;
    }

    /**
     * The updated email address of the registrant
     */
    public UpdateGiftRegistryRegistrantInput setEmail(String email) {
        this.email = Input.optional(email);
        return this;
    }

    /**
     * The updated email address of the registrant
     */
    public UpdateGiftRegistryRegistrantInput setEmailInput(Input<String> email) {
        if (email == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.email = email;
        return this;
    }

    /**
     * The updated first name of the registrant
     */
    public String getFirstname() {
        return firstname.getValue();
    }

    /**
     * The updated first name of the registrant
     */
    public Input<String> getFirstnameInput() {
        return firstname;
    }

    /**
     * The updated first name of the registrant
     */
    public UpdateGiftRegistryRegistrantInput setFirstname(String firstname) {
        this.firstname = Input.optional(firstname);
        return this;
    }

    /**
     * The updated first name of the registrant
     */
    public UpdateGiftRegistryRegistrantInput setFirstnameInput(Input<String> firstname) {
        if (firstname == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.firstname = firstname;
        return this;
    }

    /**
     * The updated last name of the registrant
     */
    public String getLastname() {
        return lastname.getValue();
    }

    /**
     * The updated last name of the registrant
     */
    public Input<String> getLastnameInput() {
        return lastname;
    }

    /**
     * The updated last name of the registrant
     */
    public UpdateGiftRegistryRegistrantInput setLastname(String lastname) {
        this.lastname = Input.optional(lastname);
        return this;
    }

    /**
     * The updated last name of the registrant
     */
    public UpdateGiftRegistryRegistrantInput setLastnameInput(Input<String> lastname) {
        if (lastname == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.lastname = lastname;
        return this;
    }

    /**
     * Set custom filter.
     */
    public UpdateGiftRegistryRegistrantInput setCustomFilter(String name, Serializable filterInput) {
        this.customFilters.put(name, Input.optional(filterInput));
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (!this.customFilters.isEmpty()) {
            for (Map.Entry<String, Input<Serializable>> entry : customFilters.entrySet()) {
                _queryBuilder.append(separator);
                separator = ",";
                _queryBuilder.append(entry.getKey() + ":");

                Serializable filter = entry.getValue().getValue();

                if (filter != null) {
                    try {
                        Method appendTo = filter.getClass().getMethod("appendTo", StringBuilder.class);
                        appendTo.invoke(filter, _queryBuilder);
                    } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
                        _queryBuilder.append("null");
                    }
                } else {
                    _queryBuilder.append("null");
                }
            }
        }

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("gift_registry_registrant_uid:");
        AbstractQuery.appendQuotedString(_queryBuilder, giftRegistryRegistrantUid.toString());

        if (this.dynamicAttributes.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("dynamic_attributes:");
            if (dynamicAttributes.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (GiftRegistryDynamicAttributeInput item1 : dynamicAttributes.getValue()) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        item1.appendTo(_queryBuilder);
                    }
                }
                _queryBuilder.append(']');
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.email.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("email:");
            if (email.getValue() != null) {
                AbstractQuery.appendQuotedString(_queryBuilder, email.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.firstname.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("firstname:");
            if (firstname.getValue() != null) {
                AbstractQuery.appendQuotedString(_queryBuilder, firstname.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.lastname.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("lastname:");
            if (lastname.getValue() != null) {
                AbstractQuery.appendQuotedString(_queryBuilder, lastname.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}

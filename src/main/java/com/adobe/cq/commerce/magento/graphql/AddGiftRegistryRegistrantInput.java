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
import java.util.List;

import com.shopify.graphql.support.AbstractQuery;
import com.shopify.graphql.support.Input;

/**
 * Defines a new registrant.
 */
public class AddGiftRegistryRegistrantInput implements Serializable {
    private String email;

    private String firstname;

    private String lastname;

    private Input<List<GiftRegistryDynamicAttributeInput>> dynamicAttributes = Input.undefined();

    public AddGiftRegistryRegistrantInput(String email, String firstname, String lastname) {
        this.email = email;

        this.firstname = firstname;

        this.lastname = lastname;
    }

    /**
     * The email address of the registrant.
     */
    public String getEmail() {
        return email;
    }

    /**
     * The email address of the registrant.
     */
    public AddGiftRegistryRegistrantInput setEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * The first name of the registrant.
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * The first name of the registrant.
     */
    public AddGiftRegistryRegistrantInput setFirstname(String firstname) {
        this.firstname = firstname;
        return this;
    }

    /**
     * The last name of the registrant.
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * The last name of the registrant.
     */
    public AddGiftRegistryRegistrantInput setLastname(String lastname) {
        this.lastname = lastname;
        return this;
    }

    /**
     * Additional attributes specified as a code-value pair.
     */
    public List<GiftRegistryDynamicAttributeInput> getDynamicAttributes() {
        return dynamicAttributes.getValue();
    }

    /**
     * Additional attributes specified as a code-value pair.
     */
    public Input<List<GiftRegistryDynamicAttributeInput>> getDynamicAttributesInput() {
        return dynamicAttributes;
    }

    /**
     * Additional attributes specified as a code-value pair.
     */
    public AddGiftRegistryRegistrantInput setDynamicAttributes(List<GiftRegistryDynamicAttributeInput> dynamicAttributes) {
        this.dynamicAttributes = Input.optional(dynamicAttributes);
        return this;
    }

    /**
     * Additional attributes specified as a code-value pair.
     */
    public AddGiftRegistryRegistrantInput setDynamicAttributesInput(Input<List<GiftRegistryDynamicAttributeInput>> dynamicAttributes) {
        if (dynamicAttributes == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.dynamicAttributes = dynamicAttributes;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("email:");
        AbstractQuery.appendQuotedString(_queryBuilder, email.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("firstname:");
        AbstractQuery.appendQuotedString(_queryBuilder, firstname.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("lastname:");
        AbstractQuery.appendQuotedString(_queryBuilder, lastname.toString());

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

        _queryBuilder.append('}');
    }
}

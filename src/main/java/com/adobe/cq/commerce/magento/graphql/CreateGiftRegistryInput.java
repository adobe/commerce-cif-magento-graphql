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
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Input;

/**
 * Defines a new gift registry.
 */
public class CreateGiftRegistryInput implements Serializable {
    private String eventName;

    private ID giftRegistryTypeUid;

    private String message;

    private GiftRegistryPrivacySettings privacySettings;

    private List<AddGiftRegistryRegistrantInput> registrants;

    private GiftRegistryStatus status;

    private Input<List<GiftRegistryDynamicAttributeInput>> dynamicAttributes = Input.undefined();

    private Input<GiftRegistryShippingAddressInput> shippingAddress = Input.undefined();

    public CreateGiftRegistryInput(String eventName, ID giftRegistryTypeUid, String message, GiftRegistryPrivacySettings privacySettings,
                                   List<AddGiftRegistryRegistrantInput> registrants, GiftRegistryStatus status) {
        this.eventName = eventName;

        this.giftRegistryTypeUid = giftRegistryTypeUid;

        this.message = message;

        this.privacySettings = privacySettings;

        this.registrants = registrants;

        this.status = status;
    }

    /**
     * The name of the event.
     */
    public String getEventName() {
        return eventName;
    }

    /**
     * The name of the event.
     */
    public CreateGiftRegistryInput setEventName(String eventName) {
        this.eventName = eventName;
        return this;
    }

    /**
     * The ID of the selected event type.
     */
    public ID getGiftRegistryTypeUid() {
        return giftRegistryTypeUid;
    }

    /**
     * The ID of the selected event type.
     */
    public CreateGiftRegistryInput setGiftRegistryTypeUid(ID giftRegistryTypeUid) {
        this.giftRegistryTypeUid = giftRegistryTypeUid;
        return this;
    }

    /**
     * A message describing the event.
     */
    public String getMessage() {
        return message;
    }

    /**
     * A message describing the event.
     */
    public CreateGiftRegistryInput setMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Indicates whether the registry is PRIVATE or PUBLIC.
     */
    public GiftRegistryPrivacySettings getPrivacySettings() {
        return privacySettings;
    }

    /**
     * Indicates whether the registry is PRIVATE or PUBLIC.
     */
    public CreateGiftRegistryInput setPrivacySettings(GiftRegistryPrivacySettings privacySettings) {
        this.privacySettings = privacySettings;
        return this;
    }

    /**
     * The list of people who receive notifications about the registry.
     */
    public List<AddGiftRegistryRegistrantInput> getRegistrants() {
        return registrants;
    }

    /**
     * The list of people who receive notifications about the registry.
     */
    public CreateGiftRegistryInput setRegistrants(List<AddGiftRegistryRegistrantInput> registrants) {
        this.registrants = registrants;
        return this;
    }

    /**
     * Indicates whether the registry is ACTIVE or INACTIVE.
     */
    public GiftRegistryStatus getStatus() {
        return status;
    }

    /**
     * Indicates whether the registry is ACTIVE or INACTIVE.
     */
    public CreateGiftRegistryInput setStatus(GiftRegistryStatus status) {
        this.status = status;
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
    public CreateGiftRegistryInput setDynamicAttributes(List<GiftRegistryDynamicAttributeInput> dynamicAttributes) {
        this.dynamicAttributes = Input.optional(dynamicAttributes);
        return this;
    }

    /**
     * Additional attributes specified as a code-value pair.
     */
    public CreateGiftRegistryInput setDynamicAttributesInput(Input<List<GiftRegistryDynamicAttributeInput>> dynamicAttributes) {
        if (dynamicAttributes == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.dynamicAttributes = dynamicAttributes;
        return this;
    }

    /**
     * The shipping address for all gift registry items.
     */
    public GiftRegistryShippingAddressInput getShippingAddress() {
        return shippingAddress.getValue();
    }

    /**
     * The shipping address for all gift registry items.
     */
    public Input<GiftRegistryShippingAddressInput> getShippingAddressInput() {
        return shippingAddress;
    }

    /**
     * The shipping address for all gift registry items.
     */
    public CreateGiftRegistryInput setShippingAddress(GiftRegistryShippingAddressInput shippingAddress) {
        this.shippingAddress = Input.optional(shippingAddress);
        return this;
    }

    /**
     * The shipping address for all gift registry items.
     */
    public CreateGiftRegistryInput setShippingAddressInput(Input<GiftRegistryShippingAddressInput> shippingAddress) {
        if (shippingAddress == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.shippingAddress = shippingAddress;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("event_name:");
        AbstractQuery.appendQuotedString(_queryBuilder, eventName.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("gift_registry_type_uid:");
        AbstractQuery.appendQuotedString(_queryBuilder, giftRegistryTypeUid.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("message:");
        AbstractQuery.appendQuotedString(_queryBuilder, message.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("privacy_settings:");
        _queryBuilder.append(privacySettings.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("registrants:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (AddGiftRegistryRegistrantInput item1 : registrants) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                item1.appendTo(_queryBuilder);
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("status:");
        _queryBuilder.append(status.toString());

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

        if (this.shippingAddress.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("shipping_address:");
            if (shippingAddress.getValue() != null) {
                shippingAddress.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}

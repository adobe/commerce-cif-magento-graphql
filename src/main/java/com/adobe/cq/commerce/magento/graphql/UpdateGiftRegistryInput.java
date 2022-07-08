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
import com.shopify.graphql.support.Input;

/**
 * Defines updates to a `GiftRegistry` object.
 */
public class UpdateGiftRegistryInput implements Serializable {
    private Input<List<GiftRegistryDynamicAttributeInput>> dynamicAttributes = Input.undefined();

    private Input<String> eventName = Input.undefined();

    private Input<String> message = Input.undefined();

    private Input<GiftRegistryPrivacySettings> privacySettings = Input.undefined();

    private Input<GiftRegistryShippingAddressInput> shippingAddress = Input.undefined();

    private Input<GiftRegistryStatus> status = Input.undefined();

    private Map<String, Input<Serializable>> customFilters = new HashMap<>();

    /**
     * Additional attributes specified as a code-value pair. Unspecified dynamic attributes are not
     * changed.
     */
    public List<GiftRegistryDynamicAttributeInput> getDynamicAttributes() {
        return dynamicAttributes.getValue();
    }

    /**
     * Additional attributes specified as a code-value pair. Unspecified dynamic attributes are not
     * changed.
     */
    public Input<List<GiftRegistryDynamicAttributeInput>> getDynamicAttributesInput() {
        return dynamicAttributes;
    }

    /**
     * Additional attributes specified as a code-value pair. Unspecified dynamic attributes are not
     * changed.
     */
    public UpdateGiftRegistryInput setDynamicAttributes(List<GiftRegistryDynamicAttributeInput> dynamicAttributes) {
        this.dynamicAttributes = Input.optional(dynamicAttributes);
        return this;
    }

    /**
     * Additional attributes specified as a code-value pair. Unspecified dynamic attributes are not
     * changed.
     */
    public UpdateGiftRegistryInput setDynamicAttributesInput(Input<List<GiftRegistryDynamicAttributeInput>> dynamicAttributes) {
        if (dynamicAttributes == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.dynamicAttributes = dynamicAttributes;
        return this;
    }

    /**
     * The updated name of the event.
     */
    public String getEventName() {
        return eventName.getValue();
    }

    /**
     * The updated name of the event.
     */
    public Input<String> getEventNameInput() {
        return eventName;
    }

    /**
     * The updated name of the event.
     */
    public UpdateGiftRegistryInput setEventName(String eventName) {
        this.eventName = Input.optional(eventName);
        return this;
    }

    /**
     * The updated name of the event.
     */
    public UpdateGiftRegistryInput setEventNameInput(Input<String> eventName) {
        if (eventName == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.eventName = eventName;
        return this;
    }

    /**
     * The updated message describing the event.
     */
    public String getMessage() {
        return message.getValue();
    }

    /**
     * The updated message describing the event.
     */
    public Input<String> getMessageInput() {
        return message;
    }

    /**
     * The updated message describing the event.
     */
    public UpdateGiftRegistryInput setMessage(String message) {
        this.message = Input.optional(message);
        return this;
    }

    /**
     * The updated message describing the event.
     */
    public UpdateGiftRegistryInput setMessageInput(Input<String> message) {
        if (message == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.message = message;
        return this;
    }

    /**
     * Indicates whether the gift registry is PRIVATE or PUBLIC.
     */
    public GiftRegistryPrivacySettings getPrivacySettings() {
        return privacySettings.getValue();
    }

    /**
     * Indicates whether the gift registry is PRIVATE or PUBLIC.
     */
    public Input<GiftRegistryPrivacySettings> getPrivacySettingsInput() {
        return privacySettings;
    }

    /**
     * Indicates whether the gift registry is PRIVATE or PUBLIC.
     */
    public UpdateGiftRegistryInput setPrivacySettings(GiftRegistryPrivacySettings privacySettings) {
        this.privacySettings = Input.optional(privacySettings);
        return this;
    }

    /**
     * Indicates whether the gift registry is PRIVATE or PUBLIC.
     */
    public UpdateGiftRegistryInput setPrivacySettingsInput(Input<GiftRegistryPrivacySettings> privacySettings) {
        if (privacySettings == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.privacySettings = privacySettings;
        return this;
    }

    /**
     * The updated shipping address for all gift registry items.
     */
    public GiftRegistryShippingAddressInput getShippingAddress() {
        return shippingAddress.getValue();
    }

    /**
     * The updated shipping address for all gift registry items.
     */
    public Input<GiftRegistryShippingAddressInput> getShippingAddressInput() {
        return shippingAddress;
    }

    /**
     * The updated shipping address for all gift registry items.
     */
    public UpdateGiftRegistryInput setShippingAddress(GiftRegistryShippingAddressInput shippingAddress) {
        this.shippingAddress = Input.optional(shippingAddress);
        return this;
    }

    /**
     * The updated shipping address for all gift registry items.
     */
    public UpdateGiftRegistryInput setShippingAddressInput(Input<GiftRegistryShippingAddressInput> shippingAddress) {
        if (shippingAddress == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.shippingAddress = shippingAddress;
        return this;
    }

    /**
     * Indicates whether the gift registry is ACTIVE or INACTIVE.
     */
    public GiftRegistryStatus getStatus() {
        return status.getValue();
    }

    /**
     * Indicates whether the gift registry is ACTIVE or INACTIVE.
     */
    public Input<GiftRegistryStatus> getStatusInput() {
        return status;
    }

    /**
     * Indicates whether the gift registry is ACTIVE or INACTIVE.
     */
    public UpdateGiftRegistryInput setStatus(GiftRegistryStatus status) {
        this.status = Input.optional(status);
        return this;
    }

    /**
     * Indicates whether the gift registry is ACTIVE or INACTIVE.
     */
    public UpdateGiftRegistryInput setStatusInput(Input<GiftRegistryStatus> status) {
        if (status == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.status = status;
        return this;
    }

    /**
     * Set custom filter.
     */
    public UpdateGiftRegistryInput setCustomFilter(String name, Serializable filterInput) {
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

        if (this.eventName.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("event_name:");
            if (eventName.getValue() != null) {
                AbstractQuery.appendQuotedString(_queryBuilder, eventName.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.message.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("message:");
            if (message.getValue() != null) {
                AbstractQuery.appendQuotedString(_queryBuilder, message.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.privacySettings.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("privacy_settings:");
            if (privacySettings.getValue() != null) {
                _queryBuilder.append(privacySettings.getValue().toString());
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

        if (this.status.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("status:");
            if (status.getValue() != null) {
                _queryBuilder.append(status.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}

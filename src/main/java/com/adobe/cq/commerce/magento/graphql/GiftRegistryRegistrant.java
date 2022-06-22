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
 * Contains details about a registrant.
 */
public class GiftRegistryRegistrant extends AbstractResponse<GiftRegistryRegistrant> {
    public GiftRegistryRegistrant() {}

    public GiftRegistryRegistrant(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "dynamic_attributes": {
                    List<GiftRegistryRegistrantDynamicAttribute> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<GiftRegistryRegistrantDynamicAttribute> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            GiftRegistryRegistrantDynamicAttribute optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new GiftRegistryRegistrantDynamicAttribute(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "email": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

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

                case "uid": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

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
        return "GiftRegistryRegistrant";
    }

    /**
     * An array of dynamic attributes assigned to the registrant.
     */
    public List<GiftRegistryRegistrantDynamicAttribute> getDynamicAttributes() {
        return (List<GiftRegistryRegistrantDynamicAttribute>) get("dynamic_attributes");
    }

    public GiftRegistryRegistrant setDynamicAttributes(List<GiftRegistryRegistrantDynamicAttribute> arg) {
        optimisticData.put(getKey("dynamic_attributes"), arg);
        return this;
    }

    /**
     * The email address of the registrant. Only the registry owner can access this attribute.
     */
    public String getEmail() {
        return (String) get("email");
    }

    public GiftRegistryRegistrant setEmail(String arg) {
        optimisticData.put(getKey("email"), arg);
        return this;
    }

    /**
     * The first name of the registrant.
     */
    public String getFirstname() {
        return (String) get("firstname");
    }

    public GiftRegistryRegistrant setFirstname(String arg) {
        optimisticData.put(getKey("firstname"), arg);
        return this;
    }

    /**
     * The last name of the registrant.
     */
    public String getLastname() {
        return (String) get("lastname");
    }

    public GiftRegistryRegistrant setLastname(String arg) {
        optimisticData.put(getKey("lastname"), arg);
        return this;
    }

    /**
     * The unique ID assigned to the registrant.
     */
    public ID getUid() {
        return (ID) get("uid");
    }

    public GiftRegistryRegistrant setUid(ID arg) {
        optimisticData.put(getKey("uid"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "dynamic_attributes":
                return true;

            case "email":
                return false;

            case "firstname":
                return false;

            case "lastname":
                return false;

            case "uid":
                return false;

            default:
                return false;
        }
    }
}

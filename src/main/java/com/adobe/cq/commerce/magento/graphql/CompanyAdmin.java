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

import java.util.Map;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;

/**
 * Contains details about the company administrator.
 */
public class CompanyAdmin extends AbstractResponse<CompanyAdmin> {
    public CompanyAdmin() {}

    public CompanyAdmin(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "email": {
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

                case "gender": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "job_title": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
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
        return "CompanyAdmin";
    }

    /**
     * The email address of the company administrator.
     */
    public String getEmail() {
        return (String) get("email");
    }

    public CompanyAdmin setEmail(String arg) {
        optimisticData.put(getKey("email"), arg);
        return this;
    }

    /**
     * The company administrator&#39;s first name.
     */
    public String getFirstname() {
        return (String) get("firstname");
    }

    public CompanyAdmin setFirstname(String arg) {
        optimisticData.put(getKey("firstname"), arg);
        return this;
    }

    /**
     * The company administrator&#39;s gender (Male - 1, Female - 2, Not Specified - 3).
     */
    public Integer getGender() {
        return (Integer) get("gender");
    }

    public CompanyAdmin setGender(Integer arg) {
        optimisticData.put(getKey("gender"), arg);
        return this;
    }

    /**
     * The unique ID for a `CompanyAdmin` object.
     */
    public ID getId() {
        return (ID) get("id");
    }

    public CompanyAdmin setId(ID arg) {
        optimisticData.put(getKey("id"), arg);
        return this;
    }

    /**
     * The job title of the company administrator.
     */
    public String getJobTitle() {
        return (String) get("job_title");
    }

    public CompanyAdmin setJobTitle(String arg) {
        optimisticData.put(getKey("job_title"), arg);
        return this;
    }

    /**
     * The company administrator&#39;s last name.
     */
    public String getLastname() {
        return (String) get("lastname");
    }

    public CompanyAdmin setLastname(String arg) {
        optimisticData.put(getKey("lastname"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "email":
                return false;

            case "firstname":
                return false;

            case "gender":
                return false;

            case "id":
                return false;

            case "job_title":
                return false;

            case "lastname":
                return false;

            default:
                return false;
        }
    }
}

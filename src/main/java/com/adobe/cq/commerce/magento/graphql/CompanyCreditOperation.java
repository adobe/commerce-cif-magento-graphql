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
import com.shopify.graphql.support.SchemaViolationError;

/**
 * Contains details about a single company credit operation.
 */
public class CompanyCreditOperation extends AbstractResponse<CompanyCreditOperation> {
    public CompanyCreditOperation() {}

    public CompanyCreditOperation(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "amount": {
                    Money optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Money(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "balance": {
                    responseData.put(key, new CompanyCredit(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "custom_reference_number": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "date": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "type": {
                    responseData.put(key, CompanyCreditOperationType.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "updated_by": {
                    responseData.put(key, new CompanyCreditOperationUser(jsonAsObject(field.getValue(), key)));

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
        return "CompanyCreditOperation";
    }

    /**
     * The amount of the company credit operation.
     */
    public Money getAmount() {
        return (Money) get("amount");
    }

    public CompanyCreditOperation setAmount(Money arg) {
        optimisticData.put(getKey("amount"), arg);
        return this;
    }

    /**
     * The credit balance as a result of the operation.
     */
    public CompanyCredit getBalance() {
        return (CompanyCredit) get("balance");
    }

    public CompanyCreditOperation setBalance(CompanyCredit arg) {
        optimisticData.put(getKey("balance"), arg);
        return this;
    }

    /**
     * The purchase order number associated with the company credit operation.
     */
    public String getCustomReferenceNumber() {
        return (String) get("custom_reference_number");
    }

    public CompanyCreditOperation setCustomReferenceNumber(String arg) {
        optimisticData.put(getKey("custom_reference_number"), arg);
        return this;
    }

    /**
     * The date the operation occurred.
     */
    public String getDate() {
        return (String) get("date");
    }

    public CompanyCreditOperation setDate(String arg) {
        optimisticData.put(getKey("date"), arg);
        return this;
    }

    /**
     * The type of the company credit operation.
     */
    public CompanyCreditOperationType getType() {
        return (CompanyCreditOperationType) get("type");
    }

    public CompanyCreditOperation setType(CompanyCreditOperationType arg) {
        optimisticData.put(getKey("type"), arg);
        return this;
    }

    /**
     * The company user that submitted the company credit operation.
     */
    public CompanyCreditOperationUser getUpdatedBy() {
        return (CompanyCreditOperationUser) get("updated_by");
    }

    public CompanyCreditOperation setUpdatedBy(CompanyCreditOperationUser arg) {
        optimisticData.put(getKey("updated_by"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "amount":
                return true;

            case "balance":
                return true;

            case "custom_reference_number":
                return false;

            case "date":
                return false;

            case "type":
                return false;

            case "updated_by":
                return true;

            default:
                return false;
        }
    }
}

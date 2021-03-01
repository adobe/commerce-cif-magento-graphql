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
 * Credit memo details
 */
public class CreditMemo extends AbstractResponse<CreditMemo> {
    public CreditMemo() {}

    public CreditMemo(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "comments": {
                    List<SalesCommentItem> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<SalesCommentItem> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            SalesCommentItem optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new SalesCommentItem(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "items": {
                    List<CreditMemoItemInterface> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<CreditMemoItemInterface> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            CreditMemoItemInterface optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = UnknownCreditMemoItemInterface.create(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "number": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "total": {
                    CreditMemoTotal optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CreditMemoTotal(jsonAsObject(field.getValue(), key));
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
        return "CreditMemo";
    }

    /**
     * Comments on the credit memo
     */
    public List<SalesCommentItem> getComments() {
        return (List<SalesCommentItem>) get("comments");
    }

    public CreditMemo setComments(List<SalesCommentItem> arg) {
        optimisticData.put(getKey("comments"), arg);
        return this;
    }

    /**
     * The unique ID for a `CreditMemo` object
     */
    public ID getId() {
        return (ID) get("id");
    }

    public CreditMemo setId(ID arg) {
        optimisticData.put(getKey("id"), arg);
        return this;
    }

    /**
     * An array containing details about refunded items
     */
    public List<CreditMemoItemInterface> getItems() {
        return (List<CreditMemoItemInterface>) get("items");
    }

    public CreditMemo setItems(List<CreditMemoItemInterface> arg) {
        optimisticData.put(getKey("items"), arg);
        return this;
    }

    /**
     * The sequential credit memo number
     */
    public String getNumber() {
        return (String) get("number");
    }

    public CreditMemo setNumber(String arg) {
        optimisticData.put(getKey("number"), arg);
        return this;
    }

    /**
     * Contains details about the total refunded amount
     */
    public CreditMemoTotal getTotal() {
        return (CreditMemoTotal) get("total");
    }

    public CreditMemo setTotal(CreditMemoTotal arg) {
        optimisticData.put(getKey("total"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "comments":
                return true;

            case "id":
                return false;

            case "items":
                return false;

            case "number":
                return false;

            case "total":
                return true;

            default:
                return false;
        }
    }
}

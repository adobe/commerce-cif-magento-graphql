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
 * Contains lists of products that have been removed from the catalog and negotiable quote.
 */
public class NegotiableQuoteHistoryProductsRemovedChange extends AbstractResponse<NegotiableQuoteHistoryProductsRemovedChange> {
    public NegotiableQuoteHistoryProductsRemovedChange() {}

    public NegotiableQuoteHistoryProductsRemovedChange(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "products_removed_from_catalog": {
                    List<ID> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<ID> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            ID optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new ID(jsonAsString(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "products_removed_from_quote": {
                    List<ProductInterface> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<ProductInterface> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            ProductInterface optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = UnknownProductInterface.create(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
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
        return "NegotiableQuoteHistoryProductsRemovedChange";
    }

    /**
     * A list of product IDs the seller removed from the catalog.
     */
    public List<ID> getProductsRemovedFromCatalog() {
        return (List<ID>) get("products_removed_from_catalog");
    }

    public NegotiableQuoteHistoryProductsRemovedChange setProductsRemovedFromCatalog(List<ID> arg) {
        optimisticData.put(getKey("products_removed_from_catalog"), arg);
        return this;
    }

    /**
     * A list of products removed from the negotiable quote by either the buyer or the seller.
     */
    public List<ProductInterface> getProductsRemovedFromQuote() {
        return (List<ProductInterface>) get("products_removed_from_quote");
    }

    public NegotiableQuoteHistoryProductsRemovedChange setProductsRemovedFromQuote(List<ProductInterface> arg) {
        optimisticData.put(getKey("products_removed_from_quote"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "products_removed_from_catalog":
                return false;

            case "products_removed_from_quote":
                return false;

            default:
                return false;
        }
    }
}

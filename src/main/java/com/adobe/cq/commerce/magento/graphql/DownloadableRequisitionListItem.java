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
 * Contains details about downloadable products added to a requisition list.
 */
public class DownloadableRequisitionListItem extends AbstractResponse<DownloadableRequisitionListItem> implements
    RequisitionListItemInterface {
    public DownloadableRequisitionListItem() {}

    public DownloadableRequisitionListItem(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "customizable_options": {
                    List<SelectedCustomizableOption> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        SelectedCustomizableOption optional2 = null;
                        if (!element1.isJsonNull()) {
                            optional2 = new SelectedCustomizableOption(jsonAsObject(element1, key));
                        }

                        list1.add(optional2);
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "links": {
                    List<DownloadableProductLinks> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<DownloadableProductLinks> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            DownloadableProductLinks optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new DownloadableProductLinks(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "product": {
                    responseData.put(key, UnknownProductInterface.create(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "quantity": {
                    responseData.put(key, jsonAsDouble(field.getValue(), key));

                    break;
                }

                case "samples": {
                    List<DownloadableProductSamples> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<DownloadableProductSamples> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            DownloadableProductSamples optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new DownloadableProductSamples(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

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
        return "DownloadableRequisitionListItem";
    }

    /**
     * Selected custom options for an item in the requisition list.
     */
    public List<SelectedCustomizableOption> getCustomizableOptions() {
        return (List<SelectedCustomizableOption>) get("customizable_options");
    }

    public DownloadableRequisitionListItem setCustomizableOptions(List<SelectedCustomizableOption> arg) {
        optimisticData.put(getKey("customizable_options"), arg);
        return this;
    }

    /**
     * An array of links for downloadable products in the requisition list.
     */
    public List<DownloadableProductLinks> getLinks() {
        return (List<DownloadableProductLinks>) get("links");
    }

    public DownloadableRequisitionListItem setLinks(List<DownloadableProductLinks> arg) {
        optimisticData.put(getKey("links"), arg);
        return this;
    }

    /**
     * Details about a requisition list item.
     */
    public ProductInterface getProduct() {
        return (ProductInterface) get("product");
    }

    public DownloadableRequisitionListItem setProduct(ProductInterface arg) {
        optimisticData.put(getKey("product"), arg);
        return this;
    }

    /**
     * The quantity of the product added to the requisition list.
     */
    public Double getQuantity() {
        return (Double) get("quantity");
    }

    public DownloadableRequisitionListItem setQuantity(Double arg) {
        optimisticData.put(getKey("quantity"), arg);
        return this;
    }

    /**
     * An array of links to downloadable product samples.
     */
    public List<DownloadableProductSamples> getSamples() {
        return (List<DownloadableProductSamples>) get("samples");
    }

    public DownloadableRequisitionListItem setSamples(List<DownloadableProductSamples> arg) {
        optimisticData.put(getKey("samples"), arg);
        return this;
    }

    /**
     * The unique ID of an item in a requisition list.
     */
    public ID getUid() {
        return (ID) get("uid");
    }

    public DownloadableRequisitionListItem setUid(ID arg) {
        optimisticData.put(getKey("uid"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "customizable_options":
                return true;

            case "links":
                return true;

            case "product":
                return false;

            case "quantity":
                return false;

            case "samples":
                return true;

            case "uid":
                return false;

            default:
                return false;
        }
    }
}

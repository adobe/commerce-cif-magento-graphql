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
 * The interface for requisition list items.
 */
public class UnknownRequisitionListItemInterface extends AbstractResponse<UnknownRequisitionListItemInterface> implements
    RequisitionListItemInterface {
    public UnknownRequisitionListItemInterface() {}

    public UnknownRequisitionListItemInterface(JsonObject fields) throws SchemaViolationError {
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

                case "product": {
                    responseData.put(key, UnknownProductInterface.create(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "quantity": {
                    responseData.put(key, jsonAsDouble(field.getValue(), key));

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

    public static RequisitionListItemInterface create(JsonObject fields) throws SchemaViolationError {
        String typeName = fields.getAsJsonPrimitive("__typename").getAsString();
        switch (typeName) {
            case "BundleRequisitionListItem": {
                return new BundleRequisitionListItem(fields);
            }

            case "ConfigurableRequisitionListItem": {
                return new ConfigurableRequisitionListItem(fields);
            }

            case "DownloadableRequisitionListItem": {
                return new DownloadableRequisitionListItem(fields);
            }

            case "GiftCardRequisitionListItem": {
                return new GiftCardRequisitionListItem(fields);
            }

            case "SimpleRequisitionListItem": {
                return new SimpleRequisitionListItem(fields);
            }

            case "VirtualRequisitionListItem": {
                return new VirtualRequisitionListItem(fields);
            }

            default: {
                return new UnknownRequisitionListItemInterface(fields);
            }
        }
    }

    public String getGraphQlTypeName() {
        return (String) get("__typename");
    }

    /**
     * Selected custom options for an item in the requisition list.
     */
    public List<SelectedCustomizableOption> getCustomizableOptions() {
        return (List<SelectedCustomizableOption>) get("customizable_options");
    }

    public UnknownRequisitionListItemInterface setCustomizableOptions(List<SelectedCustomizableOption> arg) {
        optimisticData.put(getKey("customizable_options"), arg);
        return this;
    }

    /**
     * Details about a requisition list item.
     */
    public ProductInterface getProduct() {
        return (ProductInterface) get("product");
    }

    public UnknownRequisitionListItemInterface setProduct(ProductInterface arg) {
        optimisticData.put(getKey("product"), arg);
        return this;
    }

    /**
     * The amount added.
     */
    public Double getQuantity() {
        return (Double) get("quantity");
    }

    public UnknownRequisitionListItemInterface setQuantity(Double arg) {
        optimisticData.put(getKey("quantity"), arg);
        return this;
    }

    /**
     * The unique ID for the requisition list item.
     */
    public ID getUid() {
        return (ID) get("uid");
    }

    public UnknownRequisitionListItemInterface setUid(ID arg) {
        optimisticData.put(getKey("uid"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "customizable_options":
                return true;

            case "product":
                return false;

            case "quantity":
                return false;

            case "uid":
                return false;

            default:
                return false;
        }
    }
}

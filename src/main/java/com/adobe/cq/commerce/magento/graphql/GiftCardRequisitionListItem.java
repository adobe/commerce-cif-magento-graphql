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
 * Contains details about gift cards added to a requisition list.
 */
public class GiftCardRequisitionListItem extends AbstractResponse<GiftCardRequisitionListItem> implements RequisitionListItemInterface {
    public GiftCardRequisitionListItem() {}

    public GiftCardRequisitionListItem(JsonObject fields) throws SchemaViolationError {
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

                case "gift_card_options": {
                    responseData.put(key, new GiftCardOptions(jsonAsObject(field.getValue(), key)));

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

    public String getGraphQlTypeName() {
        return "GiftCardRequisitionListItem";
    }

    /**
     * Selected custom options for an item in the requisition list.
     */
    public List<SelectedCustomizableOption> getCustomizableOptions() {
        return (List<SelectedCustomizableOption>) get("customizable_options");
    }

    public GiftCardRequisitionListItem setCustomizableOptions(List<SelectedCustomizableOption> arg) {
        optimisticData.put(getKey("customizable_options"), arg);
        return this;
    }

    /**
     * An array that defines gift card properties.
     */
    public GiftCardOptions getGiftCardOptions() {
        return (GiftCardOptions) get("gift_card_options");
    }

    public GiftCardRequisitionListItem setGiftCardOptions(GiftCardOptions arg) {
        optimisticData.put(getKey("gift_card_options"), arg);
        return this;
    }

    /**
     * Details about a requisition list item.
     */
    public ProductInterface getProduct() {
        return (ProductInterface) get("product");
    }

    public GiftCardRequisitionListItem setProduct(ProductInterface arg) {
        optimisticData.put(getKey("product"), arg);
        return this;
    }

    /**
     * The amount added.
     */
    public Double getQuantity() {
        return (Double) get("quantity");
    }

    public GiftCardRequisitionListItem setQuantity(Double arg) {
        optimisticData.put(getKey("quantity"), arg);
        return this;
    }

    /**
     * The unique ID for the requisition list item.
     */
    public ID getUid() {
        return (ID) get("uid");
    }

    public GiftCardRequisitionListItem setUid(ID arg) {
        optimisticData.put(getKey("uid"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "customizable_options":
                return true;

            case "gift_card_options":
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

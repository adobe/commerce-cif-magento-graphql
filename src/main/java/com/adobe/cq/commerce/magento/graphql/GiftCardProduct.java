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
 * Defines properties of a gift card.
 */
public class GiftCardProduct extends AbstractResponse<GiftCardProduct> implements CustomizableProductInterface, PhysicalProductInterface,
    ProductInterface, RoutableInterface {
    public GiftCardProduct() {}

    public GiftCardProduct(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "allow_message": {
                    Boolean optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsBoolean(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "allow_open_amount": {
                    Boolean optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsBoolean(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "attribute_set_id": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "canonical_url": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "categories": {
                    List<CategoryInterface> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<CategoryInterface> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            CategoryInterface optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = UnknownCategoryInterface.create(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "color": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "country_of_manufacture": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "created_at": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "crosssell_products": {
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

                case "description": {
                    ComplexTextValue optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ComplexTextValue(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "fashion_color": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "fashion_material": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "fashion_size": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "fashion_style": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "format": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "gift_card_options": {
                    List<CustomizableOptionInterface> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        CustomizableOptionInterface optional2 = null;
                        if (!element1.isJsonNull()) {
                            optional2 = UnknownCustomizableOptionInterface.create(jsonAsObject(element1, key));
                        }

                        list1.add(optional2);
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "gift_message_available": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "giftcard_amounts": {
                    List<GiftCardAmounts> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<GiftCardAmounts> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            GiftCardAmounts optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new GiftCardAmounts(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "giftcard_type": {
                    GiftCardTypeEnum optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = GiftCardTypeEnum.fromGraphQl(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "has_video": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "id": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "image": {
                    ProductImage optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ProductImage(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "is_redeemable": {
                    Boolean optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsBoolean(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "is_returnable": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "lifetime": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "manufacturer": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "media_gallery": {
                    List<MediaGalleryInterface> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<MediaGalleryInterface> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            MediaGalleryInterface optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = UnknownMediaGalleryInterface.create(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "media_gallery_entries": {
                    List<MediaGalleryEntry> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<MediaGalleryEntry> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            MediaGalleryEntry optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new MediaGalleryEntry(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "message_max_length": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "meta_description": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "meta_keyword": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "meta_title": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "name": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "new_from_date": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "new_to_date": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "only_x_left_in_stock": {
                    Double optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsDouble(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "open_amount_max": {
                    Double optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsDouble(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "open_amount_min": {
                    Double optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsDouble(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "options": {
                    List<CustomizableOptionInterface> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<CustomizableOptionInterface> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            CustomizableOptionInterface optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = UnknownCustomizableOptionInterface.create(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "options_container": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "price": {
                    ProductPrices optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ProductPrices(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "price_range": {
                    responseData.put(key, new PriceRange(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "price_tiers": {
                    List<TierPrice> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<TierPrice> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            TierPrice optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new TierPrice(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "product_links": {
                    List<ProductLinksInterface> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<ProductLinksInterface> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            ProductLinksInterface optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = UnknownProductLinksInterface.create(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "purpose": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "rating_summary": {
                    responseData.put(key, jsonAsDouble(field.getValue(), key));

                    break;
                }

                case "redirect_code": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

                    break;
                }

                case "related_products": {
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

                case "relative_url": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "review_count": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

                    break;
                }

                case "reviews": {
                    responseData.put(key, new ProductReviews(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "short_description": {
                    ComplexTextValue optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ComplexTextValue(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "sku": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "small_image": {
                    ProductImage optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ProductImage(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "special_from_date": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "special_price": {
                    Double optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsDouble(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "special_to_date": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "staged": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "stock_status": {
                    ProductStockStatus optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = ProductStockStatus.fromGraphQl(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "swatch_image": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "thumbnail": {
                    ProductImage optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ProductImage(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "tier_price": {
                    Double optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsDouble(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "tier_prices": {
                    List<ProductTierPrices> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<ProductTierPrices> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            ProductTierPrices optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new ProductTierPrices(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "type": {
                    UrlRewriteEntityTypeEnum optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = UrlRewriteEntityTypeEnum.fromGraphQl(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "type_id": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "uid": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "updated_at": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "upsell_products": {
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

                case "url_key": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "url_path": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "url_rewrites": {
                    List<UrlRewrite> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<UrlRewrite> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            UrlRewrite optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new UrlRewrite(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "url_suffix": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "video_file": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "websites": {
                    List<Website> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<Website> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            Website optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new Website(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "weight": {
                    Double optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsDouble(field.getValue(), key);
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
        return "GiftCardProduct";
    }

    /**
     * Indicates whether the customer can provide a message to accompany the gift card.
     */
    public Boolean getAllowMessage() {
        return (Boolean) get("allow_message");
    }

    public GiftCardProduct setAllowMessage(Boolean arg) {
        optimisticData.put(getKey("allow_message"), arg);
        return this;
    }

    /**
     * Indicates whether shoppers have the ability to set the value of the gift card.
     */
    public Boolean getAllowOpenAmount() {
        return (Boolean) get("allow_open_amount");
    }

    public GiftCardProduct setAllowOpenAmount(Boolean arg) {
        optimisticData.put(getKey("allow_open_amount"), arg);
        return this;
    }

    /**
     * The attribute set assigned to the product.
     *
     * @deprecated The field should not be used on the storefront.
     */
    @Deprecated
    public Integer getAttributeSetId() {
        return (Integer) get("attribute_set_id");
    }

    public GiftCardProduct setAttributeSetId(Integer arg) {
        optimisticData.put(getKey("attribute_set_id"), arg);
        return this;
    }

    /**
     * The relative canonical URL. This value is returned only if the system setting &#39;Use Canonical Link
     * Meta Tag For Products&#39; is enabled.
     */
    public String getCanonicalUrl() {
        return (String) get("canonical_url");
    }

    public GiftCardProduct setCanonicalUrl(String arg) {
        optimisticData.put(getKey("canonical_url"), arg);
        return this;
    }

    /**
     * The categories assigned to a product.
     */
    public List<CategoryInterface> getCategories() {
        return (List<CategoryInterface>) get("categories");
    }

    public GiftCardProduct setCategories(List<CategoryInterface> arg) {
        optimisticData.put(getKey("categories"), arg);
        return this;
    }

    public Integer getColor() {
        return (Integer) get("color");
    }

    public GiftCardProduct setColor(Integer arg) {
        optimisticData.put(getKey("color"), arg);
        return this;
    }

    /**
     * The product&#39;s country of origin.
     */
    public String getCountryOfManufacture() {
        return (String) get("country_of_manufacture");
    }

    public GiftCardProduct setCountryOfManufacture(String arg) {
        optimisticData.put(getKey("country_of_manufacture"), arg);
        return this;
    }

    /**
     * Timestamp indicating when the product was created.
     *
     * @deprecated The field should not be used on the storefront.
     */
    @Deprecated
    public String getCreatedAt() {
        return (String) get("created_at");
    }

    public GiftCardProduct setCreatedAt(String arg) {
        optimisticData.put(getKey("created_at"), arg);
        return this;
    }

    /**
     * An array of cross-sell products.
     */
    public List<ProductInterface> getCrosssellProducts() {
        return (List<ProductInterface>) get("crosssell_products");
    }

    public GiftCardProduct setCrosssellProducts(List<ProductInterface> arg) {
        optimisticData.put(getKey("crosssell_products"), arg);
        return this;
    }

    /**
     * Detailed information about the product. The value can include simple HTML tags.
     */
    public ComplexTextValue getDescription() {
        return (ComplexTextValue) get("description");
    }

    public GiftCardProduct setDescription(ComplexTextValue arg) {
        optimisticData.put(getKey("description"), arg);
        return this;
    }

    public Integer getFashionColor() {
        return (Integer) get("fashion_color");
    }

    public GiftCardProduct setFashionColor(Integer arg) {
        optimisticData.put(getKey("fashion_color"), arg);
        return this;
    }

    public String getFashionMaterial() {
        return (String) get("fashion_material");
    }

    public GiftCardProduct setFashionMaterial(String arg) {
        optimisticData.put(getKey("fashion_material"), arg);
        return this;
    }

    public Integer getFashionSize() {
        return (Integer) get("fashion_size");
    }

    public GiftCardProduct setFashionSize(Integer arg) {
        optimisticData.put(getKey("fashion_size"), arg);
        return this;
    }

    public String getFashionStyle() {
        return (String) get("fashion_style");
    }

    public GiftCardProduct setFashionStyle(String arg) {
        optimisticData.put(getKey("fashion_style"), arg);
        return this;
    }

    public Integer getFormat() {
        return (Integer) get("format");
    }

    public GiftCardProduct setFormat(Integer arg) {
        optimisticData.put(getKey("format"), arg);
        return this;
    }

    /**
     * An array of customizable gift card options.
     */
    public List<CustomizableOptionInterface> getGiftCardOptions() {
        return (List<CustomizableOptionInterface>) get("gift_card_options");
    }

    public GiftCardProduct setGiftCardOptions(List<CustomizableOptionInterface> arg) {
        optimisticData.put(getKey("gift_card_options"), arg);
        return this;
    }

    /**
     * Indicates whether a gift message is available.
     */
    public String getGiftMessageAvailable() {
        return (String) get("gift_message_available");
    }

    public GiftCardProduct setGiftMessageAvailable(String arg) {
        optimisticData.put(getKey("gift_message_available"), arg);
        return this;
    }

    /**
     * An array that contains information about the values and ID of a gift card.
     */
    public List<GiftCardAmounts> getGiftcardAmounts() {
        return (List<GiftCardAmounts>) get("giftcard_amounts");
    }

    public GiftCardProduct setGiftcardAmounts(List<GiftCardAmounts> arg) {
        optimisticData.put(getKey("giftcard_amounts"), arg);
        return this;
    }

    /**
     * An enumeration that specifies the type of gift card.
     */
    public GiftCardTypeEnum getGiftcardType() {
        return (GiftCardTypeEnum) get("giftcard_type");
    }

    public GiftCardProduct setGiftcardType(GiftCardTypeEnum arg) {
        optimisticData.put(getKey("giftcard_type"), arg);
        return this;
    }

    public Integer getHasVideo() {
        return (Integer) get("has_video");
    }

    public GiftCardProduct setHasVideo(Integer arg) {
        optimisticData.put(getKey("has_video"), arg);
        return this;
    }

    /**
     * The ID number assigned to the product.
     *
     * @deprecated Use the `uid` field instead.
     */
    @Deprecated
    public Integer getId() {
        return (Integer) get("id");
    }

    public GiftCardProduct setId(Integer arg) {
        optimisticData.put(getKey("id"), arg);
        return this;
    }

    /**
     * The relative path to the main image on the product page.
     */
    public ProductImage getImage() {
        return (ProductImage) get("image");
    }

    public GiftCardProduct setImage(ProductImage arg) {
        optimisticData.put(getKey("image"), arg);
        return this;
    }

    /**
     * Indicates whether the customer can redeem the value on the card for cash.
     */
    public Boolean getIsRedeemable() {
        return (Boolean) get("is_redeemable");
    }

    public GiftCardProduct setIsRedeemable(Boolean arg) {
        optimisticData.put(getKey("is_redeemable"), arg);
        return this;
    }

    /**
     * Indicates whether the product can be returned.
     */
    public String getIsReturnable() {
        return (String) get("is_returnable");
    }

    public GiftCardProduct setIsReturnable(String arg) {
        optimisticData.put(getKey("is_returnable"), arg);
        return this;
    }

    /**
     * The number of days after purchase until the gift card expires. A null value means there is no limit.
     */
    public Integer getLifetime() {
        return (Integer) get("lifetime");
    }

    public GiftCardProduct setLifetime(Integer arg) {
        optimisticData.put(getKey("lifetime"), arg);
        return this;
    }

    /**
     * A number representing the product&#39;s manufacturer.
     */
    public Integer getManufacturer() {
        return (Integer) get("manufacturer");
    }

    public GiftCardProduct setManufacturer(Integer arg) {
        optimisticData.put(getKey("manufacturer"), arg);
        return this;
    }

    /**
     * An array of media gallery objects.
     */
    public List<MediaGalleryInterface> getMediaGallery() {
        return (List<MediaGalleryInterface>) get("media_gallery");
    }

    public GiftCardProduct setMediaGallery(List<MediaGalleryInterface> arg) {
        optimisticData.put(getKey("media_gallery"), arg);
        return this;
    }

    /**
     * An array of MediaGalleryEntry objects.
     *
     * @deprecated Use `media_gallery` instead.
     */
    @Deprecated
    public List<MediaGalleryEntry> getMediaGalleryEntries() {
        return (List<MediaGalleryEntry>) get("media_gallery_entries");
    }

    public GiftCardProduct setMediaGalleryEntries(List<MediaGalleryEntry> arg) {
        optimisticData.put(getKey("media_gallery_entries"), arg);
        return this;
    }

    /**
     * The maximum number of characters the gift message can contain.
     */
    public Integer getMessageMaxLength() {
        return (Integer) get("message_max_length");
    }

    public GiftCardProduct setMessageMaxLength(Integer arg) {
        optimisticData.put(getKey("message_max_length"), arg);
        return this;
    }

    /**
     * A brief overview of the product for search results listings, maximum 255 characters.
     */
    public String getMetaDescription() {
        return (String) get("meta_description");
    }

    public GiftCardProduct setMetaDescription(String arg) {
        optimisticData.put(getKey("meta_description"), arg);
        return this;
    }

    /**
     * A comma-separated list of keywords that are visible only to search engines.
     */
    public String getMetaKeyword() {
        return (String) get("meta_keyword");
    }

    public GiftCardProduct setMetaKeyword(String arg) {
        optimisticData.put(getKey("meta_keyword"), arg);
        return this;
    }

    /**
     * A string that is displayed in the title bar and tab of the browser and in search results lists.
     */
    public String getMetaTitle() {
        return (String) get("meta_title");
    }

    public GiftCardProduct setMetaTitle(String arg) {
        optimisticData.put(getKey("meta_title"), arg);
        return this;
    }

    /**
     * The product name. Customers use this name to identify the product.
     */
    public String getName() {
        return (String) get("name");
    }

    public GiftCardProduct setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    /**
     * The beginning date for new product listings, and determines if the product is featured as a new
     * product.
     *
     * @deprecated The field should not be used on the storefront.
     */
    @Deprecated
    public String getNewFromDate() {
        return (String) get("new_from_date");
    }

    public GiftCardProduct setNewFromDate(String arg) {
        optimisticData.put(getKey("new_from_date"), arg);
        return this;
    }

    /**
     * The end date for new product listings.
     *
     * @deprecated The field should not be used on the storefront.
     */
    @Deprecated
    public String getNewToDate() {
        return (String) get("new_to_date");
    }

    public GiftCardProduct setNewToDate(String arg) {
        optimisticData.put(getKey("new_to_date"), arg);
        return this;
    }

    /**
     * Product stock only x left count
     */
    public Double getOnlyXLeftInStock() {
        return (Double) get("only_x_left_in_stock");
    }

    public GiftCardProduct setOnlyXLeftInStock(Double arg) {
        optimisticData.put(getKey("only_x_left_in_stock"), arg);
        return this;
    }

    /**
     * The maximum acceptable value of an open amount gift card.
     */
    public Double getOpenAmountMax() {
        return (Double) get("open_amount_max");
    }

    public GiftCardProduct setOpenAmountMax(Double arg) {
        optimisticData.put(getKey("open_amount_max"), arg);
        return this;
    }

    /**
     * The minimum acceptable value of an open amount gift card.
     */
    public Double getOpenAmountMin() {
        return (Double) get("open_amount_min");
    }

    public GiftCardProduct setOpenAmountMin(Double arg) {
        optimisticData.put(getKey("open_amount_min"), arg);
        return this;
    }

    /**
     * An array of options for a customizable product.
     */
    public List<CustomizableOptionInterface> getOptions() {
        return (List<CustomizableOptionInterface>) get("options");
    }

    public GiftCardProduct setOptions(List<CustomizableOptionInterface> arg) {
        optimisticData.put(getKey("options"), arg);
        return this;
    }

    /**
     * If the product has multiple options, determines where they appear on the product page.
     */
    public String getOptionsContainer() {
        return (String) get("options_container");
    }

    public GiftCardProduct setOptionsContainer(String arg) {
        optimisticData.put(getKey("options_container"), arg);
        return this;
    }

    /**
     * Indicates the price of an item.
     *
     * @deprecated Use `price_range` for product price information.
     */
    @Deprecated
    public ProductPrices getPrice() {
        return (ProductPrices) get("price");
    }

    public GiftCardProduct setPrice(ProductPrices arg) {
        optimisticData.put(getKey("price"), arg);
        return this;
    }

    /**
     * The range of prices for the product
     */
    public PriceRange getPriceRange() {
        return (PriceRange) get("price_range");
    }

    public GiftCardProduct setPriceRange(PriceRange arg) {
        optimisticData.put(getKey("price_range"), arg);
        return this;
    }

    /**
     * An array of `TierPrice` objects.
     */
    public List<TierPrice> getPriceTiers() {
        return (List<TierPrice>) get("price_tiers");
    }

    public GiftCardProduct setPriceTiers(List<TierPrice> arg) {
        optimisticData.put(getKey("price_tiers"), arg);
        return this;
    }

    /**
     * An array of `ProductLinks` objects.
     */
    public List<ProductLinksInterface> getProductLinks() {
        return (List<ProductLinksInterface>) get("product_links");
    }

    public GiftCardProduct setProductLinks(List<ProductLinksInterface> arg) {
        optimisticData.put(getKey("product_links"), arg);
        return this;
    }

    public Integer getPurpose() {
        return (Integer) get("purpose");
    }

    public GiftCardProduct setPurpose(Integer arg) {
        optimisticData.put(getKey("purpose"), arg);
        return this;
    }

    /**
     * The average of all the ratings given to the product.
     */
    public Double getRatingSummary() {
        return (Double) get("rating_summary");
    }

    public GiftCardProduct setRatingSummary(Double arg) {
        optimisticData.put(getKey("rating_summary"), arg);
        return this;
    }

    /**
     * Contains 0 when there is no redirect error. A value of 301 indicates the URL of the requested
     * resource has been changed permanently, while a value of 302 indicates a temporary redirect.
     */
    public Integer getRedirectCode() {
        return (Integer) get("redirect_code");
    }

    public GiftCardProduct setRedirectCode(Integer arg) {
        optimisticData.put(getKey("redirect_code"), arg);
        return this;
    }

    /**
     * An array of related products.
     */
    public List<ProductInterface> getRelatedProducts() {
        return (List<ProductInterface>) get("related_products");
    }

    public GiftCardProduct setRelatedProducts(List<ProductInterface> arg) {
        optimisticData.put(getKey("related_products"), arg);
        return this;
    }

    /**
     * The internal relative URL. If the specified URL is a redirect, the query returns the redirected URL,
     * not the original.
     */
    public String getRelativeUrl() {
        return (String) get("relative_url");
    }

    public GiftCardProduct setRelativeUrl(String arg) {
        optimisticData.put(getKey("relative_url"), arg);
        return this;
    }

    /**
     * The total count of all the reviews given to the product.
     */
    public Integer getReviewCount() {
        return (Integer) get("review_count");
    }

    public GiftCardProduct setReviewCount(Integer arg) {
        optimisticData.put(getKey("review_count"), arg);
        return this;
    }

    /**
     * The list of products reviews.
     */
    public ProductReviews getReviews() {
        return (ProductReviews) get("reviews");
    }

    public GiftCardProduct setReviews(ProductReviews arg) {
        optimisticData.put(getKey("reviews"), arg);
        return this;
    }

    /**
     * A short description of the product. Its use depends on the theme.
     */
    public ComplexTextValue getShortDescription() {
        return (ComplexTextValue) get("short_description");
    }

    public GiftCardProduct setShortDescription(ComplexTextValue arg) {
        optimisticData.put(getKey("short_description"), arg);
        return this;
    }

    /**
     * A number or code assigned to a product to identify the product, options, price, and manufacturer.
     */
    public String getSku() {
        return (String) get("sku");
    }

    public GiftCardProduct setSku(String arg) {
        optimisticData.put(getKey("sku"), arg);
        return this;
    }

    /**
     * The relative path to the small image, which is used on catalog pages.
     */
    public ProductImage getSmallImage() {
        return (ProductImage) get("small_image");
    }

    public GiftCardProduct setSmallImage(ProductImage arg) {
        optimisticData.put(getKey("small_image"), arg);
        return this;
    }

    /**
     * The beginning date that a product has a special price.
     *
     * @deprecated The field should not be used on the storefront.
     */
    @Deprecated
    public String getSpecialFromDate() {
        return (String) get("special_from_date");
    }

    public GiftCardProduct setSpecialFromDate(String arg) {
        optimisticData.put(getKey("special_from_date"), arg);
        return this;
    }

    /**
     * The discounted price of the product.
     */
    public Double getSpecialPrice() {
        return (Double) get("special_price");
    }

    public GiftCardProduct setSpecialPrice(Double arg) {
        optimisticData.put(getKey("special_price"), arg);
        return this;
    }

    /**
     * The end date for a product with a special price.
     */
    public String getSpecialToDate() {
        return (String) get("special_to_date");
    }

    public GiftCardProduct setSpecialToDate(String arg) {
        optimisticData.put(getKey("special_to_date"), arg);
        return this;
    }

    /**
     * Indicates whether the product is staged for a future campaign.
     */
    public Boolean getStaged() {
        return (Boolean) get("staged");
    }

    public GiftCardProduct setStaged(Boolean arg) {
        optimisticData.put(getKey("staged"), arg);
        return this;
    }

    /**
     * Stock status of the product
     */
    public ProductStockStatus getStockStatus() {
        return (ProductStockStatus) get("stock_status");
    }

    public GiftCardProduct setStockStatus(ProductStockStatus arg) {
        optimisticData.put(getKey("stock_status"), arg);
        return this;
    }

    /**
     * The file name of a swatch image.
     */
    public String getSwatchImage() {
        return (String) get("swatch_image");
    }

    public GiftCardProduct setSwatchImage(String arg) {
        optimisticData.put(getKey("swatch_image"), arg);
        return this;
    }

    /**
     * The relative path to the product&#39;s thumbnail image.
     */
    public ProductImage getThumbnail() {
        return (ProductImage) get("thumbnail");
    }

    public GiftCardProduct setThumbnail(ProductImage arg) {
        optimisticData.put(getKey("thumbnail"), arg);
        return this;
    }

    /**
     * The price when tier pricing is in effect and the items purchased threshold has been reached.
     *
     * @deprecated Use `price_tiers` for product tier price information.
     */
    @Deprecated
    public Double getTierPrice() {
        return (Double) get("tier_price");
    }

    public GiftCardProduct setTierPrice(Double arg) {
        optimisticData.put(getKey("tier_price"), arg);
        return this;
    }

    /**
     * An array of ProductTierPrices objects.
     *
     * @deprecated Use `price_tiers` for product tier price information.
     */
    @Deprecated
    public List<ProductTierPrices> getTierPrices() {
        return (List<ProductTierPrices>) get("tier_prices");
    }

    public GiftCardProduct setTierPrices(List<ProductTierPrices> arg) {
        optimisticData.put(getKey("tier_prices"), arg);
        return this;
    }

    /**
     * One of PRODUCT, CATEGORY, or CMS_PAGE.
     */
    public UrlRewriteEntityTypeEnum getType() {
        return (UrlRewriteEntityTypeEnum) get("type");
    }

    public GiftCardProduct setType(UrlRewriteEntityTypeEnum arg) {
        optimisticData.put(getKey("type"), arg);
        return this;
    }

    /**
     * One of simple, virtual, bundle, downloadable, grouped, or configurable.
     *
     * @deprecated Use `__typename` instead.
     */
    @Deprecated
    public String getTypeId() {
        return (String) get("type_id");
    }

    public GiftCardProduct setTypeId(String arg) {
        optimisticData.put(getKey("type_id"), arg);
        return this;
    }

    /**
     * The unique ID for a `ProductInterface` object.
     */
    public ID getUid() {
        return (ID) get("uid");
    }

    public GiftCardProduct setUid(ID arg) {
        optimisticData.put(getKey("uid"), arg);
        return this;
    }

    /**
     * Timestamp indicating when the product was updated.
     *
     * @deprecated The field should not be used on the storefront.
     */
    @Deprecated
    public String getUpdatedAt() {
        return (String) get("updated_at");
    }

    public GiftCardProduct setUpdatedAt(String arg) {
        optimisticData.put(getKey("updated_at"), arg);
        return this;
    }

    /**
     * An array of up-sell products.
     */
    public List<ProductInterface> getUpsellProducts() {
        return (List<ProductInterface>) get("upsell_products");
    }

    public GiftCardProduct setUpsellProducts(List<ProductInterface> arg) {
        optimisticData.put(getKey("upsell_products"), arg);
        return this;
    }

    /**
     * The part of the URL that identifies the product
     */
    public String getUrlKey() {
        return (String) get("url_key");
    }

    public GiftCardProduct setUrlKey(String arg) {
        optimisticData.put(getKey("url_key"), arg);
        return this;
    }

    /**
     * @deprecated Use product&#39;s `canonical_url` or url rewrites instead
     */
    @Deprecated
    public String getUrlPath() {
        return (String) get("url_path");
    }

    public GiftCardProduct setUrlPath(String arg) {
        optimisticData.put(getKey("url_path"), arg);
        return this;
    }

    /**
     * URL rewrites list
     */
    public List<UrlRewrite> getUrlRewrites() {
        return (List<UrlRewrite>) get("url_rewrites");
    }

    public GiftCardProduct setUrlRewrites(List<UrlRewrite> arg) {
        optimisticData.put(getKey("url_rewrites"), arg);
        return this;
    }

    /**
     * The part of the product URL that is appended after the url key
     */
    public String getUrlSuffix() {
        return (String) get("url_suffix");
    }

    public GiftCardProduct setUrlSuffix(String arg) {
        optimisticData.put(getKey("url_suffix"), arg);
        return this;
    }

    public String getVideoFile() {
        return (String) get("video_file");
    }

    public GiftCardProduct setVideoFile(String arg) {
        optimisticData.put(getKey("video_file"), arg);
        return this;
    }

    /**
     * An array of websites in which the product is available.
     *
     * @deprecated The field should not be used on the storefront.
     */
    @Deprecated
    public List<Website> getWebsites() {
        return (List<Website>) get("websites");
    }

    public GiftCardProduct setWebsites(List<Website> arg) {
        optimisticData.put(getKey("websites"), arg);
        return this;
    }

    /**
     * The weight of the item, in units defined by the store.
     */
    public Double getWeight() {
        return (Double) get("weight");
    }

    public GiftCardProduct setWeight(Double arg) {
        optimisticData.put(getKey("weight"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "allow_message":
                return false;

            case "allow_open_amount":
                return false;

            case "attribute_set_id":
                return false;

            case "canonical_url":
                return false;

            case "categories":
                return false;

            case "color":
                return false;

            case "country_of_manufacture":
                return false;

            case "created_at":
                return false;

            case "crosssell_products":
                return false;

            case "description":
                return true;

            case "fashion_color":
                return false;

            case "fashion_material":
                return false;

            case "fashion_size":
                return false;

            case "fashion_style":
                return false;

            case "format":
                return false;

            case "gift_card_options":
                return false;

            case "gift_message_available":
                return false;

            case "giftcard_amounts":
                return true;

            case "giftcard_type":
                return false;

            case "has_video":
                return false;

            case "id":
                return false;

            case "image":
                return true;

            case "is_redeemable":
                return false;

            case "is_returnable":
                return false;

            case "lifetime":
                return false;

            case "manufacturer":
                return false;

            case "media_gallery":
                return false;

            case "media_gallery_entries":
                return true;

            case "message_max_length":
                return false;

            case "meta_description":
                return false;

            case "meta_keyword":
                return false;

            case "meta_title":
                return false;

            case "name":
                return false;

            case "new_from_date":
                return false;

            case "new_to_date":
                return false;

            case "only_x_left_in_stock":
                return false;

            case "open_amount_max":
                return false;

            case "open_amount_min":
                return false;

            case "options":
                return false;

            case "options_container":
                return false;

            case "price":
                return true;

            case "price_range":
                return true;

            case "price_tiers":
                return true;

            case "product_links":
                return false;

            case "purpose":
                return false;

            case "rating_summary":
                return false;

            case "redirect_code":
                return false;

            case "related_products":
                return false;

            case "relative_url":
                return false;

            case "review_count":
                return false;

            case "reviews":
                return true;

            case "short_description":
                return true;

            case "sku":
                return false;

            case "small_image":
                return true;

            case "special_from_date":
                return false;

            case "special_price":
                return false;

            case "special_to_date":
                return false;

            case "staged":
                return false;

            case "stock_status":
                return false;

            case "swatch_image":
                return false;

            case "thumbnail":
                return true;

            case "tier_price":
                return false;

            case "tier_prices":
                return true;

            case "type":
                return false;

            case "type_id":
                return false;

            case "uid":
                return false;

            case "updated_at":
                return false;

            case "upsell_products":
                return false;

            case "url_key":
                return false;

            case "url_path":
                return false;

            case "url_rewrites":
                return true;

            case "url_suffix":
                return false;

            case "video_file":
                return false;

            case "websites":
                return true;

            case "weight":
                return false;

            default:
                return false;
        }
    }
}

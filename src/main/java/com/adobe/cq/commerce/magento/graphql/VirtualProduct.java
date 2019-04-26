/*******************************************************************************
 *
 *    Copyright 2019 Adobe. All rights reserved.
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
import com.shopify.graphql.support.SchemaViolationError;

/**
 * A virtual product is non-tangible product that does not require shipping and is not kept in
 * inventory
 */
public class VirtualProduct extends AbstractResponse<VirtualProduct> implements CustomizableProductInterface, ProductInterface {
    public VirtualProduct() {
    }

    public VirtualProduct(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
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

                case "description": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

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

                case "id": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "image": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "image_label": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
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

                case "short_description": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
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
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "small_image_label": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
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
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "thumbnail_label": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
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

                case "type_id": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

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

                case "__typename": {
                    responseData.put(key, jsonAsString(field.getValue(), key));
                    break;
                }
                default: {
                    throw new SchemaViolationError(this, key, field.getValue());
                }
            }
        }
    }

    public String getGraphQlTypeName() {
        return "VirtualProduct";
    }

    /**
     * The attribute set assigned to the product
     */

    public Integer getAttributeSetId() {
        return (Integer) get("attribute_set_id");
    }

    public VirtualProduct setAttributeSetId(Integer arg) {
        optimisticData.put(getKey("attribute_set_id"), arg);
        return this;
    }

    /**
     * Canonical URL
     */

    public String getCanonicalUrl() {
        return (String) get("canonical_url");
    }

    public VirtualProduct setCanonicalUrl(String arg) {
        optimisticData.put(getKey("canonical_url"), arg);
        return this;
    }

    /**
     * The categories assigned to a product
     */

    public List<CategoryInterface> getCategories() {
        return (List<CategoryInterface>) get("categories");
    }

    public VirtualProduct setCategories(List<CategoryInterface> arg) {
        optimisticData.put(getKey("categories"), arg);
        return this;
    }

    public Integer getColor() {
        return (Integer) get("color");
    }

    public VirtualProduct setColor(Integer arg) {
        optimisticData.put(getKey("color"), arg);
        return this;
    }

    /**
     * The product&#39;s country of origin
     */

    public String getCountryOfManufacture() {
        return (String) get("country_of_manufacture");
    }

    public VirtualProduct setCountryOfManufacture(String arg) {
        optimisticData.put(getKey("country_of_manufacture"), arg);
        return this;
    }

    /**
     * Timestamp indicating when the product was created
     */

    public String getCreatedAt() {
        return (String) get("created_at");
    }

    public VirtualProduct setCreatedAt(String arg) {
        optimisticData.put(getKey("created_at"), arg);
        return this;
    }

    /**
     * Detailed information about the product. The value can include simple HTML tags.
     */

    public String getDescription() {
        return (String) get("description");
    }

    public VirtualProduct setDescription(String arg) {
        optimisticData.put(getKey("description"), arg);
        return this;
    }

    /**
     * Indicates whether a gift message is available
     */

    public String getGiftMessageAvailable() {
        return (String) get("gift_message_available");
    }

    public VirtualProduct setGiftMessageAvailable(String arg) {
        optimisticData.put(getKey("gift_message_available"), arg);
        return this;
    }

    /**
     * The ID number assigned to the product
     */

    public Integer getId() {
        return (Integer) get("id");
    }

    public VirtualProduct setId(Integer arg) {
        optimisticData.put(getKey("id"), arg);
        return this;
    }

    /**
     * The relative path to the main image on the product page
     */

    public String getImage() {
        return (String) get("image");
    }

    public VirtualProduct setImage(String arg) {
        optimisticData.put(getKey("image"), arg);
        return this;
    }

    /**
     * The label assigned to a product image
     */

    public String getImageLabel() {
        return (String) get("image_label");
    }

    public VirtualProduct setImageLabel(String arg) {
        optimisticData.put(getKey("image_label"), arg);
        return this;
    }

    /**
     * A number representing the product&#39;s manufacturer
     */

    public Integer getManufacturer() {
        return (Integer) get("manufacturer");
    }

    public VirtualProduct setManufacturer(Integer arg) {
        optimisticData.put(getKey("manufacturer"), arg);
        return this;
    }

    /**
     * An array of MediaGalleryEntry objects
     */

    public List<MediaGalleryEntry> getMediaGalleryEntries() {
        return (List<MediaGalleryEntry>) get("media_gallery_entries");
    }

    public VirtualProduct setMediaGalleryEntries(List<MediaGalleryEntry> arg) {
        optimisticData.put(getKey("media_gallery_entries"), arg);
        return this;
    }

    /**
     * A brief overview of the product for search results listings, maximum 255 characters
     */

    public String getMetaDescription() {
        return (String) get("meta_description");
    }

    public VirtualProduct setMetaDescription(String arg) {
        optimisticData.put(getKey("meta_description"), arg);
        return this;
    }

    /**
     * A comma-separated list of keywords that are visible only to search engines
     */

    public String getMetaKeyword() {
        return (String) get("meta_keyword");
    }

    public VirtualProduct setMetaKeyword(String arg) {
        optimisticData.put(getKey("meta_keyword"), arg);
        return this;
    }

    /**
     * A string that is displayed in the title bar and tab of the browser and in search results lists
     */

    public String getMetaTitle() {
        return (String) get("meta_title");
    }

    public VirtualProduct setMetaTitle(String arg) {
        optimisticData.put(getKey("meta_title"), arg);
        return this;
    }

    /**
     * The product name. Customers use this name to identify the product.
     */

    public String getName() {
        return (String) get("name");
    }

    public VirtualProduct setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    /**
     * The beginning date for new product listings, and determines if the product is featured as a new
     * product
     */

    public String getNewFromDate() {
        return (String) get("new_from_date");
    }

    public VirtualProduct setNewFromDate(String arg) {
        optimisticData.put(getKey("new_from_date"), arg);
        return this;
    }

    /**
     * The end date for new product listings
     */

    public String getNewToDate() {
        return (String) get("new_to_date");
    }

    public VirtualProduct setNewToDate(String arg) {
        optimisticData.put(getKey("new_to_date"), arg);
        return this;
    }

    /**
     * Product stock only x left count
     */

    public Double getOnlyXLeftInStock() {
        return (Double) get("only_x_left_in_stock");
    }

    public VirtualProduct setOnlyXLeftInStock(Double arg) {
        optimisticData.put(getKey("only_x_left_in_stock"), arg);
        return this;
    }

    /**
     * An array of options for a customizable product
     */

    public List<CustomizableOptionInterface> getOptions() {
        return (List<CustomizableOptionInterface>) get("options");
    }

    public VirtualProduct setOptions(List<CustomizableOptionInterface> arg) {
        optimisticData.put(getKey("options"), arg);
        return this;
    }

    /**
     * If the product has multiple options, determines where they appear on the product page
     */

    public String getOptionsContainer() {
        return (String) get("options_container");
    }

    public VirtualProduct setOptionsContainer(String arg) {
        optimisticData.put(getKey("options_container"), arg);
        return this;
    }

    /**
     * A ProductPrices object, indicating the price of an item
     */

    public ProductPrices getPrice() {
        return (ProductPrices) get("price");
    }

    public VirtualProduct setPrice(ProductPrices arg) {
        optimisticData.put(getKey("price"), arg);
        return this;
    }

    /**
     * An array of ProductLinks objects
     */

    public List<ProductLinksInterface> getProductLinks() {
        return (List<ProductLinksInterface>) get("product_links");
    }

    public VirtualProduct setProductLinks(List<ProductLinksInterface> arg) {
        optimisticData.put(getKey("product_links"), arg);
        return this;
    }

    /**
     * A short description of the product. Its use depends on the theme.
     */

    public String getShortDescription() {
        return (String) get("short_description");
    }

    public VirtualProduct setShortDescription(String arg) {
        optimisticData.put(getKey("short_description"), arg);
        return this;
    }

    /**
     * A number or code assigned to a product to identify the product, options, price, and manufacturer
     */

    public String getSku() {
        return (String) get("sku");
    }

    public VirtualProduct setSku(String arg) {
        optimisticData.put(getKey("sku"), arg);
        return this;
    }

    /**
     * The relative path to the small image, which is used on catalog pages
     */

    public String getSmallImage() {
        return (String) get("small_image");
    }

    public VirtualProduct setSmallImage(String arg) {
        optimisticData.put(getKey("small_image"), arg);
        return this;
    }

    /**
     * The label assigned to a product&#39;s small image
     */

    public String getSmallImageLabel() {
        return (String) get("small_image_label");
    }

    public VirtualProduct setSmallImageLabel(String arg) {
        optimisticData.put(getKey("small_image_label"), arg);
        return this;
    }

    /**
     * The beginning date that a product has a special price
     */

    public String getSpecialFromDate() {
        return (String) get("special_from_date");
    }

    public VirtualProduct setSpecialFromDate(String arg) {
        optimisticData.put(getKey("special_from_date"), arg);
        return this;
    }

    /**
     * The discounted price of the product
     */

    public Double getSpecialPrice() {
        return (Double) get("special_price");
    }

    public VirtualProduct setSpecialPrice(Double arg) {
        optimisticData.put(getKey("special_price"), arg);
        return this;
    }

    /**
     * The end date that a product has a special price
     */

    public String getSpecialToDate() {
        return (String) get("special_to_date");
    }

    public VirtualProduct setSpecialToDate(String arg) {
        optimisticData.put(getKey("special_to_date"), arg);
        return this;
    }

    /**
     * Stock status of the product
     */

    public ProductStockStatus getStockStatus() {
        return (ProductStockStatus) get("stock_status");
    }

    public VirtualProduct setStockStatus(ProductStockStatus arg) {
        optimisticData.put(getKey("stock_status"), arg);
        return this;
    }

    /**
     * The file name of a swatch image
     */

    public String getSwatchImage() {
        return (String) get("swatch_image");
    }

    public VirtualProduct setSwatchImage(String arg) {
        optimisticData.put(getKey("swatch_image"), arg);
        return this;
    }

    /**
     * The relative path to the product&#39;s thumbnail image
     */

    public String getThumbnail() {
        return (String) get("thumbnail");
    }

    public VirtualProduct setThumbnail(String arg) {
        optimisticData.put(getKey("thumbnail"), arg);
        return this;
    }

    /**
     * The label assigned to a product&#39;s thumbnail image
     */

    public String getThumbnailLabel() {
        return (String) get("thumbnail_label");
    }

    public VirtualProduct setThumbnailLabel(String arg) {
        optimisticData.put(getKey("thumbnail_label"), arg);
        return this;
    }

    /**
     * The price when tier pricing is in effect and the items purchased threshold has been reached
     */

    public Double getTierPrice() {
        return (Double) get("tier_price");
    }

    public VirtualProduct setTierPrice(Double arg) {
        optimisticData.put(getKey("tier_price"), arg);
        return this;
    }

    /**
     * An array of ProductTierPrices objects
     */

    public List<ProductTierPrices> getTierPrices() {
        return (List<ProductTierPrices>) get("tier_prices");
    }

    public VirtualProduct setTierPrices(List<ProductTierPrices> arg) {
        optimisticData.put(getKey("tier_prices"), arg);
        return this;
    }

    /**
     * One of simple, virtual, bundle, downloadable, grouped, or configurable
     */

    public String getTypeId() {
        return (String) get("type_id");
    }

    public VirtualProduct setTypeId(String arg) {
        optimisticData.put(getKey("type_id"), arg);
        return this;
    }

    /**
     * Timestamp indicating when the product was updated
     */

    public String getUpdatedAt() {
        return (String) get("updated_at");
    }

    public VirtualProduct setUpdatedAt(String arg) {
        optimisticData.put(getKey("updated_at"), arg);
        return this;
    }

    /**
     * The part of the URL that identifies the product
     */

    public String getUrlKey() {
        return (String) get("url_key");
    }

    public VirtualProduct setUrlKey(String arg) {
        optimisticData.put(getKey("url_key"), arg);
        return this;
    }

    /**
     * The part of the URL that precedes the url_key
     */

    public String getUrlPath() {
        return (String) get("url_path");
    }

    public VirtualProduct setUrlPath(String arg) {
        optimisticData.put(getKey("url_path"), arg);
        return this;
    }

    /**
     * An array of websites in which the product is available
     */

    public List<Website> getWebsites() {
        return (List<Website>) get("websites");
    }

    public VirtualProduct setWebsites(List<Website> arg) {
        optimisticData.put(getKey("websites"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "attribute_set_id": return false;

            case "canonical_url": return false;

            case "categories": return false;

            case "color": return false;

            case "country_of_manufacture": return false;

            case "created_at": return false;

            case "description": return false;

            case "gift_message_available": return false;

            case "id": return false;

            case "image": return false;

            case "image_label": return false;

            case "manufacturer": return false;

            case "media_gallery_entries": return true;

            case "meta_description": return false;

            case "meta_keyword": return false;

            case "meta_title": return false;

            case "name": return false;

            case "new_from_date": return false;

            case "new_to_date": return false;

            case "only_x_left_in_stock": return false;

            case "options": return false;

            case "options_container": return false;

            case "price": return true;

            case "product_links": return false;

            case "short_description": return false;

            case "sku": return false;

            case "small_image": return false;

            case "small_image_label": return false;

            case "special_from_date": return false;

            case "special_price": return false;

            case "special_to_date": return false;

            case "stock_status": return false;

            case "swatch_image": return false;

            case "thumbnail": return false;

            case "thumbnail_label": return false;

            case "tier_price": return false;

            case "tier_prices": return true;

            case "type_id": return false;

            case "updated_at": return false;

            case "url_key": return false;

            case "url_path": return false;

            case "websites": return true;

            default: return false;
        }
    }
}


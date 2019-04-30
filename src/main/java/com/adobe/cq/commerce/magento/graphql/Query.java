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

import java.util.Map;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;

/**
 * 
 */
public class Query extends AbstractResponse<Query> {
    public Query() {
    }

    public Query(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "category": {
                    CategoryTree optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CategoryTree(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "cmsBlocks": {
                    CmsBlocks optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CmsBlocks(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "cmsPage": {
                    CmsPage optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CmsPage(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "customAttributeMetadata": {
                    CustomAttributeMetadata optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CustomAttributeMetadata(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "customer": {
                    Customer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Customer(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "products": {
                    Products optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Products(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "storeConfig": {
                    StoreConfig optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new StoreConfig(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "urlResolver": {
                    EntityUrl optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new EntityUrl(jsonAsObject(field.getValue(), key));
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
        return "Query";
    }

    public CategoryTree getCategory() {
        return (CategoryTree) get("category");
    }

    public Query setCategory(CategoryTree arg) {
        optimisticData.put(getKey("category"), arg);
        return this;
    }

    /**
     * The CMS block query returns information about CMS blocks
     */

    public CmsBlocks getCmsBlocks() {
        return (CmsBlocks) get("cmsBlocks");
    }

    public Query setCmsBlocks(CmsBlocks arg) {
        optimisticData.put(getKey("cmsBlocks"), arg);
        return this;
    }

    /**
     * The CMS page query returns information about a CMS page
     */

    public CmsPage getCmsPage() {
        return (CmsPage) get("cmsPage");
    }

    public Query setCmsPage(CmsPage arg) {
        optimisticData.put(getKey("cmsPage"), arg);
        return this;
    }

    /**
     * The customAttributeMetadata query returns the attribute type, given an attribute code and entity
     * type
     */

    public CustomAttributeMetadata getCustomAttributeMetadata() {
        return (CustomAttributeMetadata) get("customAttributeMetadata");
    }

    public Query setCustomAttributeMetadata(CustomAttributeMetadata arg) {
        optimisticData.put(getKey("customAttributeMetadata"), arg);
        return this;
    }

    /**
     * The customer query returns information about a customer account
     */

    public Customer getCustomer() {
        return (Customer) get("customer");
    }

    public Query setCustomer(Customer arg) {
        optimisticData.put(getKey("customer"), arg);
        return this;
    }

    /**
     * The products query searches for products that match the criteria specified in the search and filter
     * attributes
     */

    public Products getProducts() {
        return (Products) get("products");
    }

    public Query setProducts(Products arg) {
        optimisticData.put(getKey("products"), arg);
        return this;
    }

    /**
     * The store config query
     */

    public StoreConfig getStoreConfig() {
        return (StoreConfig) get("storeConfig");
    }

    public Query setStoreConfig(StoreConfig arg) {
        optimisticData.put(getKey("storeConfig"), arg);
        return this;
    }

    /**
     * The urlResolver query returns the canonical URL for a specified product, category or CMS page
     */

    public EntityUrl getUrlResolver() {
        return (EntityUrl) get("urlResolver");
    }

    public Query setUrlResolver(EntityUrl arg) {
        optimisticData.put(getKey("urlResolver"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "category": return true;

            case "cmsBlocks": return true;

            case "cmsPage": return true;

            case "customAttributeMetadata": return true;

            case "customer": return true;

            case "products": return true;

            case "storeConfig": return true;

            case "urlResolver": return true;

            default: return false;
        }
    }
}


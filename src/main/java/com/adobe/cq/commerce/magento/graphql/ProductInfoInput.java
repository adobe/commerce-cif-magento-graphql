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

import java.io.Serializable;

import com.shopify.graphql.support.AbstractQuery;

/**
 * Product Information used for Pickup Locations search.
 */
public class ProductInfoInput implements Serializable {
    private String sku;

    public ProductInfoInput(String sku) {
        this.sku = sku;
    }

    /**
     * Product SKU.
     */
    public String getSku() {
        return sku;
    }

    /**
     * Product SKU.
     */
    public ProductInfoInput setSku(String sku) {
        this.sku = sku;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("sku:");
        AbstractQuery.appendQuotedString(_queryBuilder, sku.toString());

        _queryBuilder.append('}');
    }
}
